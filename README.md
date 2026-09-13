# lab-reservation-system 公共工位预约及管理系统

高校实验室公共工位预约管理系统。支持实验室平面布局建模、工位租用申请/审批、学生申请、
导师组管理、工位占用统计（月并集口径）、毕业自动释放、审计日志等。

## 仓库结构

```
frontend/          前端构建产物 (Vue 3 + Vben Admin 5.7.0 静态资源, 直接由 nginx 伺服)
  index.html       SPA 入口; head 中按顺序注入三个运行时补丁 (见「运行时补丁」)
  _compat.js       兼容垫片
  _i18n_patch.js   中英文切换运行时补丁 (DOM 字典翻译 + MutationObserver)
  _mentor_patch.js 导师查询页运行时补丁 (补 /lab/mentor 路由的 meta.iframeSrc
                   + 工位视图导师高亮幂等兜底)
  mentor.html      独立静态页: 导师查询页 (零依赖 vanilla HTML/JS/CSS, 由 iframe 内嵌)
  apply.html       独立静态页: 学生自助申请
  js/ css/ png/    构建产物 (含 floor-plan / usage 等已打补丁的 chunk)
backend/
  lab_src/
    decompiled/    服务端完整源码 (com.lab.*, 当前线上版本)
    patched/       历史补丁源码片段 (学生申请、导师字段、布局保存等)
    server_clean/  清理后的可读源码 (部分核心类)
    server_src/    服务端补充源码
    application.yml
sql/
  schema.sql       建表 DDL (由线上库导出, 17 张表; MySQL 8 / MariaDB 10.5 兼容)
  data.sql         初始种子数据 (RBAC 角色/菜单/账号; 依赖 schema.sql 先建表)
  mentor_menu.sql  导师查询页菜单注册 (幂等; 自动授权给已有「实验室管理」的角色)
deploy/
  lab-deploy.sh    后端启停脚本 (start/stop/restart/status/logs)
  setup_backend.sh 服务器初始化 (Redis + 生成 config/app.env 与 RSA 密钥对 + 启动)
  app.env.example  后端运行配置模板 (拷贝为 config/app.env 后填真实值)
  lab-dev.sh       开发工具 (/dev-tool) 编译脚本
  patch_index.py   幂等校正 index.html 里 _mentor_patch.js 的注入与版本号
  lab-reservation.conf  nginx 站点配置 (监听 8082, SPA fallback, API 反代)
```

## 环境信息

- 前端静态目录: `/usr/share/nginx/lab-reservation` (nginx 对外端口 `8082`)
- 后端: Spring Boot 3.5.0 / JDK 17, 由 `deploy/lab-deploy.sh` 启动, 监听 `8090`
- 数据库: MySQL 8.x / MariaDB 10.5, 库名 `lab_reservation`, 字符集 `utf8mb4`
- 仓库不含任何明文凭据: 运行配置 (`deploy/config/app.env`) 与 RSA 密钥 (`deploy/config/rsa.env`) 不入库

## 部署

### 数据库
```bash
mysql -u<user> -p -e "CREATE DATABASE lab_reservation CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;"
mysql -u<user> -p lab_reservation < sql/schema.sql
mysql -u<user> -p lab_reservation < sql/data.sql
```

### 后端
```bash
cp deploy/app.env.example deploy/config/app.env   # 填 DB_HOST/DB_USER/DB_PASS/JWT_SECRET/SERVER_PORT
chmod +x deploy/lab-deploy.sh
./deploy/lab-deploy.sh start                       # 或 restart / status / logs
# 提示: lab-deploy.sh 在自身同级 config/ 目录查找 app.env 与 rsa.env
```
> 端口说明: Spring Boot 读取环境变量 `SERVER_PORT` (`PORT` 仅脚本自用), 二者保持一致即可。

### 前端
```bash
# frontend/ 为已构建产物, 直接同步到静态目录
scp -r frontend/* <host>:/usr/share/nginx/lab-reservation/
```

### 运行时补丁
部分功能不改动构建产物本身, 而是在 SPA 入口 `index.html` 的 `<head>` 中按顺序注入脚本,
在浏览器里运行时生效。**顺序有意义**, 修改 `index.html` 后需保持:

```html
<script src="/_compat.js?_v=20260911d"></script>
<script src="/_i18n_patch.js?_v=20260911d"></script>
<script src="/_mentor_patch.js?v=20260913c"></script>
<script src="/_app-config-5.7.0-7362080d.js"></script>
```

- 补丁脚本带 `?v=` 查询串做缓存失效; 更新补丁后**必须同步改版本号**, 否则浏览器/iframe 会命中旧文件
- `deploy/patch_index.py` 可幂等完成「插入标签 / 校正版本号」两步 (服务器侧只依赖 `python3`)

### 导师查询页菜单
```bash
mysql -u<user> -p lab_reservation < sql/mentor_menu.sql
```
菜单由 SQL 注册到「实验室管理」目录下 (`/lab/mentor`), 并按该目录既有授权面自动补授权;
脚本幂等, 重复执行不会产生第二条菜单。

### nginx
```bash
cp deploy/lab-reservation.conf /etc/nginx/conf.d/lab-reservation.conf && nginx -s reload
```

## 关键业务逻辑

- **工位状态机**: `IDLE` → `PRE_RESERVED` → `OCCUPIED`, 另有 `MAINTENANCE` / `DISABLED`
  (迁移由 `WorkstationStatus.canManageTo` 守卫); 申请单状态 `PENDING/APPROVED/REJECTED/CANCELLED`
- **两阶段占位**: 申请审批通过 → 预占 (`PRE_RESERVED`), 学生入驻 → 占领 (`OCCUPIED`), 冲突在申请与审批两处分别拦截
- **月并集口径的用时统计**: 占用历史按月分段 (`duration_months`), 同月多段只计一次;
  面积 = 工位数 × (lab.area / lab.capacity) × 月数
- **布局建模**: 工位视图 `#/lab/workstations/{labNanoId}` 支持在画布上新增/拖拽/命名
  工位、门、窗、过道 (`PUT /api/labs/{nanoId}/layout` 整体保存)
- **导师查询页** (菜单「实验室管理 → 导师查询」, 路由 `/lab/mentor`): 输入导师姓名,
  汇总该导师名下的工位/已占用/学生/实验室; 点实验室卡片跳转到该实验室的工位视图,
  并高亮该导师名下工位, 顶部提供其涉及实验室的快捷切换条
- **毕业释放**: 定时任务按月扫描毕业时间, 自动释放工位

## 运维注意事项

- JWT secret 通过环境变量 `JWT_SECRET` 注入, 部署时务必设置 (>=32 字节)
- 前端 entry (`index.html`) 已配置 no-cache; 带 hash 的资源更新后注意浏览器缓存
- 数据库建议每日定时备份 (`mysqldump`)

## 已知缺口 (后续补齐)

- 尚未提供 Maven 工程 (`pom.xml`) 与 Maven Wrapper, 因此 README 中不承诺 `mvn package`;
  当前服务端由 JDK 17 + `javac` 增量编译并打包运行 (见 `deploy/lab-dev.sh`)
- 前端仅提供构建产物, 未包含 Vue 源码工程
- 缺少 `LICENSE` / `CITATION.cff` / `docker-compose.yml`

## 版本

- 2026-09-13: 新增**导师查询页** (`frontend/mentor.html` + `_mentor_patch.js` + `sql/mentor_menu.sql`,
  由 iframe 内嵌进系统); 点实验室卡片可跳转该实验室工位视图并高亮导师名下工位,
  附跨实验室快捷切换条; 同步 `index.html` 补丁注入 (`_mentor_patch.js?v=20260913c`) 与 `deploy/patch_index.py`
- 2026-09-12: 同步线上源码与前端产物 (工位用时统计/月并集口径、房间总面积口径、
  工位视图实验室下拉、中英切换补全); 新增 `sql/` 建表与种子数据、`deploy/app.env.example`
- 2026-08-31: 初始归档 (面板统计修复、学生申请、抽屉增强等已合入)
