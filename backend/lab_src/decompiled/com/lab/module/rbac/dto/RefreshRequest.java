/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.RefreshRequest
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Generated;

public class RefreshRequest {
    @NotBlank
    private String refreshToken;

    @Generated
    public RefreshRequest() {
    }

    @Generated
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Generated
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RefreshRequest)) {
            return false;
        }
        RefreshRequest other = (RefreshRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$refreshToken = this.getRefreshToken();
        String other$refreshToken = other.getRefreshToken();
        return !(this$refreshToken == null ? other$refreshToken != null : !this$refreshToken.equals(other$refreshToken));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RefreshRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $refreshToken = this.getRefreshToken();
        result = result * 59 + ($refreshToken == null ? 43 : $refreshToken.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RefreshRequest(refreshToken=" + this.getRefreshToken() + ")";
    }
}

