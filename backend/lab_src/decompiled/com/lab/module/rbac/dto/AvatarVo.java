/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.AvatarVo
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import lombok.Generated;

public class AvatarVo {
    private String avatarUrl;

    @Generated
    public AvatarVo() {
    }

    @Generated
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Generated
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AvatarVo)) {
            return false;
        }
        AvatarVo other = (AvatarVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$avatarUrl = this.getAvatarUrl();
        String other$avatarUrl = other.getAvatarUrl();
        return !(this$avatarUrl == null ? other$avatarUrl != null : !this$avatarUrl.equals(other$avatarUrl));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AvatarVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $avatarUrl = this.getAvatarUrl();
        result = result * 59 + ($avatarUrl == null ? 43 : $avatarUrl.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AvatarVo(avatarUrl=" + this.getAvatarUrl() + ")";
    }
}

