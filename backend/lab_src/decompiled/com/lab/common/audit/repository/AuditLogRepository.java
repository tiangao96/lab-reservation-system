/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.audit.entity.AuditLog
 *  com.lab.common.audit.repository.AuditLogRepository
 *  org.springframework.data.jpa.repository.JpaRepository
 *  org.springframework.data.jpa.repository.JpaSpecificationExecutor
 */
package com.lab.common.audit.repository;

import com.lab.common.audit.entity.AuditLog;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuditLogRepository
extends JpaRepository<AuditLog, Long>,
JpaSpecificationExecutor<AuditLog> {
    public Optional<AuditLog> findByNanoId(String var1);
}

