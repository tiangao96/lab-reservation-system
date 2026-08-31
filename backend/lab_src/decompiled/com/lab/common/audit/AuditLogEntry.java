/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.audit.AuditLogEntry
 *  com.lab.common.audit.AuditLogEntry$AuditLogEntryBuilder
 *  lombok.Generated
 */
package com.lab.common.audit;

import com.lab.common.audit.AuditLogEntry;
import lombok.Generated;

public class AuditLogEntry {
    private final Long userId;
    private final String username;
    private final Long deptId;
    private final String module;
    private final String action;
    private final String description;
    private final String targetId;
    private final String httpMethod;
    private final String requestUri;
    private final String ip;
    private final String userAgent;
    private final String params;
    private final boolean success;
    private final String errorMsg;
    private final long durationMs;

    @Generated
    AuditLogEntry(Long userId, String username, Long deptId, String module, String action, String description, String targetId, String httpMethod, String requestUri, String ip, String userAgent, String params, boolean success, String errorMsg, long durationMs) {
        this.userId = userId;
        this.username = username;
        this.deptId = deptId;
        this.module = module;
        this.action = action;
        this.description = description;
        this.targetId = targetId;
        this.httpMethod = httpMethod;
        this.requestUri = requestUri;
        this.ip = ip;
        this.userAgent = userAgent;
        this.params = params;
        this.success = success;
        this.errorMsg = errorMsg;
        this.durationMs = durationMs;
    }

    @Generated
    public static AuditLogEntryBuilder builder() {
        return new AuditLogEntryBuilder();
    }

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public Long getDeptId() {
        return this.deptId;
    }

    @Generated
    public String getModule() {
        return this.module;
    }

    @Generated
    public String getAction() {
        return this.action;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String getTargetId() {
        return this.targetId;
    }

    @Generated
    public String getHttpMethod() {
        return this.httpMethod;
    }

    @Generated
    public String getRequestUri() {
        return this.requestUri;
    }

    @Generated
    public String getIp() {
        return this.ip;
    }

    @Generated
    public String getUserAgent() {
        return this.userAgent;
    }

    @Generated
    public String getParams() {
        return this.params;
    }

    @Generated
    public boolean isSuccess() {
        return this.success;
    }

    @Generated
    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Generated
    public long getDurationMs() {
        return this.durationMs;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AuditLogEntry)) {
            return false;
        }
        AuditLogEntry other = (AuditLogEntry)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (this.isSuccess() != other.isSuccess()) {
            return false;
        }
        if (this.getDurationMs() != other.getDurationMs()) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Long this$deptId = this.getDeptId();
        Long other$deptId = other.getDeptId();
        if (this$deptId == null ? other$deptId != null : !((Object)this$deptId).equals(other$deptId)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$module = this.getModule();
        String other$module = other.getModule();
        if (this$module == null ? other$module != null : !this$module.equals(other$module)) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$targetId = this.getTargetId();
        String other$targetId = other.getTargetId();
        if (this$targetId == null ? other$targetId != null : !this$targetId.equals(other$targetId)) {
            return false;
        }
        String this$httpMethod = this.getHttpMethod();
        String other$httpMethod = other.getHttpMethod();
        if (this$httpMethod == null ? other$httpMethod != null : !this$httpMethod.equals(other$httpMethod)) {
            return false;
        }
        String this$requestUri = this.getRequestUri();
        String other$requestUri = other.getRequestUri();
        if (this$requestUri == null ? other$requestUri != null : !this$requestUri.equals(other$requestUri)) {
            return false;
        }
        String this$ip = this.getIp();
        String other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) {
            return false;
        }
        String this$userAgent = this.getUserAgent();
        String other$userAgent = other.getUserAgent();
        if (this$userAgent == null ? other$userAgent != null : !this$userAgent.equals(other$userAgent)) {
            return false;
        }
        String this$params = this.getParams();
        String other$params = other.getParams();
        if (this$params == null ? other$params != null : !this$params.equals(other$params)) {
            return false;
        }
        String this$errorMsg = this.getErrorMsg();
        String other$errorMsg = other.getErrorMsg();
        return !(this$errorMsg == null ? other$errorMsg != null : !this$errorMsg.equals(other$errorMsg));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AuditLogEntry;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isSuccess() ? 79 : 97);
        long $durationMs = this.getDurationMs();
        result = result * 59 + (int)($durationMs >>> 32 ^ $durationMs);
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $deptId = this.getDeptId();
        result = result * 59 + ($deptId == null ? 43 : ((Object)$deptId).hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $module = this.getModule();
        result = result * 59 + ($module == null ? 43 : $module.hashCode());
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $targetId = this.getTargetId();
        result = result * 59 + ($targetId == null ? 43 : $targetId.hashCode());
        String $httpMethod = this.getHttpMethod();
        result = result * 59 + ($httpMethod == null ? 43 : $httpMethod.hashCode());
        String $requestUri = this.getRequestUri();
        result = result * 59 + ($requestUri == null ? 43 : $requestUri.hashCode());
        String $ip = this.getIp();
        result = result * 59 + ($ip == null ? 43 : $ip.hashCode());
        String $userAgent = this.getUserAgent();
        result = result * 59 + ($userAgent == null ? 43 : $userAgent.hashCode());
        String $params = this.getParams();
        result = result * 59 + ($params == null ? 43 : $params.hashCode());
        String $errorMsg = this.getErrorMsg();
        result = result * 59 + ($errorMsg == null ? 43 : $errorMsg.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AuditLogEntry(userId=" + this.getUserId() + ", username=" + this.getUsername() + ", deptId=" + this.getDeptId() + ", module=" + this.getModule() + ", action=" + this.getAction() + ", description=" + this.getDescription() + ", targetId=" + this.getTargetId() + ", httpMethod=" + this.getHttpMethod() + ", requestUri=" + this.getRequestUri() + ", ip=" + this.getIp() + ", userAgent=" + this.getUserAgent() + ", params=" + this.getParams() + ", success=" + this.isSuccess() + ", errorMsg=" + this.getErrorMsg() + ", durationMs=" + this.getDurationMs() + ")";
    }
}

