/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.api.ResultCode
 *  com.lab.common.audit.AuditLogEntry
 *  com.lab.common.audit.entity.AuditLog
 *  com.lab.common.audit.repository.AuditLogRepository
 *  com.lab.common.audit.service.AuditLogService
 *  com.lab.common.exception.BizException
 *  com.lab.common.util.NanoId
 *  jakarta.persistence.criteria.Expression
 *  jakarta.persistence.criteria.Predicate
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.data.domain.Page
 *  org.springframework.data.domain.PageRequest
 *  org.springframework.data.domain.Pageable
 *  org.springframework.data.domain.Sort
 *  org.springframework.data.domain.Sort$Direction
 *  org.springframework.data.jpa.domain.Specification
 *  org.springframework.scheduling.annotation.Async
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 */
package com.lab.common.audit.service;

import com.lab.common.api.ResultCode;
import com.lab.common.audit.AuditLogEntry;
import com.lab.common.audit.entity.AuditLog;
import com.lab.common.audit.repository.AuditLogRepository;
import com.lab.common.exception.BizException;
import com.lab.common.util.NanoId;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.Predicate;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuditLogService {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(AuditLogService.class);
    private final AuditLogRepository auditLogRepository;

    @Async(value="auditLogExecutor")
    @Transactional
    public void record(AuditLogEntry e) {
        try {
            AuditLog log = new AuditLog();
            log.setNanoId(NanoId.next());
            log.setUserId(e.getUserId());
            log.setUsername(e.getUsername());
            log.setDeptId(e.getDeptId());
            log.setModule(e.getModule());
            log.setAction(e.getAction());
            log.setDescription(e.getDescription());
            log.setTargetId(e.getTargetId());
            log.setHttpMethod(e.getHttpMethod());
            log.setRequestUri(e.getRequestUri());
            log.setIp(e.getIp());
            log.setUserAgent(e.getUserAgent());
            log.setParams(e.getParams());
            log.setResult(e.isSuccess() ? "SUCCESS" : "FAIL");
            log.setErrorMsg(e.getErrorMsg());
            log.setDurationMs(Integer.valueOf((int)e.getDurationMs()));
            log.setCreateTime(LocalDateTime.now());
            this.auditLogRepository.save((Object)log);
        }
        catch (Exception ex) {
            log.warn("audit log persist failed: module={}, action={}, err={}", new Object[]{e.getModule(), e.getAction(), ex.toString()});
        }
    }

    @Transactional(readOnly=true)
    public Page<AuditLog> page(long page, long size, String keyword, String module, String action, String result, LocalDateTime start, LocalDateTime end) {
        PageRequest pageable = PageRequest.of((int)((int)Math.max(0L, page - 1L)), (int)((int)size), (Sort)Sort.by((Sort.Direction)Sort.Direction.DESC, (String[])new String[]{"createTime"}));
        Specification & Serializable spec = (Specification & Serializable)(root, query, cb) -> {
            ArrayList<Predicate> ps = new ArrayList<Predicate>();
            if (keyword != null && !keyword.isBlank()) {
                ps.add(cb.like((Expression)root.get("username"), "%" + keyword.trim() + "%"));
            }
            if (module != null && !module.isBlank()) {
                ps.add(cb.equal((Expression)root.get("module"), (Object)module.trim()));
            }
            if (action != null && !action.isBlank()) {
                ps.add(cb.equal((Expression)root.get("action"), (Object)action.trim()));
            }
            if (result != null && !result.isBlank()) {
                ps.add(cb.equal((Expression)root.get("result"), (Object)result.trim()));
            }
            if (start != null) {
                ps.add(cb.greaterThanOrEqualTo((Expression)root.get("createTime"), (Comparable)start));
            }
            if (end != null) {
                ps.add(cb.lessThanOrEqualTo((Expression)root.get("createTime"), (Comparable)end));
            }
            return cb.and(ps.toArray(new Predicate[0]));
        };
        return this.auditLogRepository.findAll((Specification)spec, (Pageable)pageable);
    }

    @Transactional(readOnly=true)
    public AuditLog getByNanoId(String nanoId) {
        return (AuditLog)this.auditLogRepository.findByNanoId(nanoId).orElseThrow(() -> new BizException(ResultCode.RESOURCE_NOT_FOUND));
    }

    @Generated
    public AuditLogService(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }
}

