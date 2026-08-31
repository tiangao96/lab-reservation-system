/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.entity.id.CoreUserRoleId
 *  lombok.Generated
 */
package com.lab.module.rbac.entity.id;

import java.io.Serializable;
import lombok.Generated;

public class CoreUserRoleId
implements Serializable {
    private Long userId;
    private Long roleId;

    @Generated
    public Long getUserId() {
        return this.userId;
    }

    @Generated
    public Long getRoleId() {
        return this.roleId;
    }

    @Generated
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoreUserRoleId)) {
            return false;
        }
        CoreUserRoleId other = (CoreUserRoleId)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Long this$userId = this.getUserId();
        Long other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !((Object)this$userId).equals(other$userId)) {
            return false;
        }
        Long this$roleId = this.getRoleId();
        Long other$roleId = other.getRoleId();
        return !(this$roleId == null ? other$roleId != null : !((Object)this$roleId).equals(other$roleId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CoreUserRoleId;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $roleId = this.getRoleId();
        result = result * 59 + ($roleId == null ? 43 : ((Object)$roleId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CoreUserRoleId(userId=" + this.getUserId() + ", roleId=" + this.getRoleId() + ")";
    }

    @Generated
    public CoreUserRoleId() {
    }

    @Generated
    public CoreUserRoleId(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }
}

