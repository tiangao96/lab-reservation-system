/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.api.PageResult
 *  com.lab.common.api.Result
 *  com.lab.common.audit.controller.AuditLogController
 *  com.lab.common.audit.dto.AuditLogQueryRequest
 *  com.lab.common.audit.dto.AuditLogVo
 *  com.lab.common.audit.entity.AuditLog
 *  com.lab.common.audit.service.AuditLogService
 *  io.swagger.v3.oas.annotations.tags.Tag
 *  lombok.Generated
 *  org.springframework.data.domain.Page
 *  org.springframework.security.access.prepost.PreAuthorize
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.ModelAttribute
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.lab.common.audit.controller;

import com.lab.common.api.PageResult;
import com.lab.common.api.Result;
import com.lab.common.audit.dto.AuditLogQueryRequest;
import com.lab.common.audit.dto.AuditLogVo;
import com.lab.common.audit.entity.AuditLog;
import com.lab.common.audit.service.AuditLogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Generated;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="\u64cd\u4f5c\u5ba1\u8ba1\u65e5\u5fd7")
@RestController
@RequestMapping(value={"/api/audit-logs"})
public class AuditLogController {
    private final AuditLogService auditLogService;

    @GetMapping
    @PreAuthorize(value="@perm.has('system:audit:list')")
    public Result<PageResult<AuditLogVo>> page(@RequestParam(defaultValue="1") long current, @RequestParam(defaultValue="20") long size, @ModelAttribute AuditLogQueryRequest query) {
        Page p = this.auditLogService.page(current, size, query.getKeyword(), query.getModule(), query.getAction(), query.getResult(), query.getStartTime(), query.getEndTime());
        return Result.ok((Object)PageResult.of((Page)p.map(arg_0 -> this.toVo(arg_0))));
    }

    @GetMapping(value={"/{nanoId}"})
    @PreAuthorize(value="@perm.has('system:audit:view')")
    public Result<AuditLogVo> get(@PathVariable String nanoId) {
        return Result.ok((Object)this.toVo(this.auditLogService.getByNanoId(nanoId)));
    }

    private AuditLogVo toVo(AuditLog a) {
        AuditLogVo vo = new AuditLogVo();
        vo.setNanoId(a.getNanoId());
        vo.setUserId(a.getUserId());
        vo.setUsername(a.getUsername());
        vo.setDeptId(a.getDeptId());
        vo.setModule(a.getModule());
        vo.setAction(a.getAction());
        vo.setDescription(a.getDescription());
        vo.setTargetId(a.getTargetId());
        vo.setHttpMethod(a.getHttpMethod());
        vo.setRequestUri(a.getRequestUri());
        vo.setIp(a.getIp());
        vo.setUserAgent(a.getUserAgent());
        vo.setParams(a.getParams());
        vo.setResult(a.getResult());
        vo.setErrorMsg(a.getErrorMsg());
        vo.setDurationMs(a.getDurationMs());
        vo.setCreateTime(a.getCreateTime());
        return vo;
    }

    @Generated
    public AuditLogController(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }
}

