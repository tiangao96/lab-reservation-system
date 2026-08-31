# lab-reservation-system 公共工位预约及管理系统

高校实验室公共工位预约管理系统。支持实验室平面布局管理、工位租用申请/审批、学生申请、导师组管理、工位占用统计、毕业自动释放等。

## 仓库结构

```
frontend/          前端构建产物 (Vue 3 + Vben Admin 5.7.0, 静态资源, 直接由 nginx 伺服)
backend/           后端 Java 源码
  decompiled/      线上 jar 反编译出的完整源码 (com.lab.*)
  patched/         针对业务需求的补丁源码 (学生申请、导师字段、布局保存等)
  server_clean/    清理后的可读源码 (部分核心类)
  server_src/      服务端补充源码
deploy/            nginx 配置、部署脚本
```

## 环境信息

- 服务器: `219.151.188.214` (nginx 端口 `8082` 对外, API 反代到 `127.0.0.1:8090`)
- 前端静态目录: `/usr/share/nginx/lab-reservation`
- 后端: Spring Boot jar (`lab-server-0.1.0.jar`), 内部端口 `8090`
- 开发工具: `/dev-tool/` 反代到 `127.0.0.1:8899`
- 数据库: MySQL (配置在服务器环境变量中, 仓库不含明文凭据)

## 部署

### 前端
```bash
# 构建产物已就绪 (frontend/), 直接上传到服务器
scp -r frontend/* root@219.151.188.214:/usr/share/nginx/lab-reservation/
```

### 后端
```bash
# 编译打包后部署
mvn package
scp target/lab-server-0.1.0.jar root@219.151.188.214:/opt/lab/
# 重启 (参考服务器 systemd/启动脚本)
```

### nginx
- 配置文件: `deploy/lab-reservation.conf` (监听 8082, SPA fallback, API 反代)

## 关键业务逻辑

- **工位状态**: `available` / `occupied` / `maintenance` / `reserved`
- **工位视图**: `#/lab/workstations/{labNanoId}`
- **实验室**: S404B / S724B / S819B / S726
- **学生申请**: 学生可自助申请工位, 管理员审批后自动分配
- **毕业释放**: 定时任务按毕业时间自动释放工位

## 运维注意事项

- JWT secret 通过环境变量 `JWT_SECRET` 注入, 部署时务必设置
- 前端资源有 hash 版本管理, 更新后注意浏览器缓存 (nginx 已配置 index.html no-cache)
- 数据库备份建议每日定时执行

## 版本

- 2026-08-31: 初始归档 (面板统计修复、学生申请、抽屉增强等已合入)
