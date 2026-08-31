/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.entity.id.CoreRolePermissionId
 *  lombok.Generated
 */
package com.lab.module.rbac.entity.id;

import java.io.Serializable;
import lombok.Generated;

public class CoreRolePermissionId
implements Serializable {
    private Long roleId;
    private Long permissionId;

    @Generated
    public Long getRoleId() {
        return this.roleId;
    }

    @Generated
    public Long getPermissionId() {
        return this.permissionId;
    }

    @Generated
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoreRolePermissionId)) {
            return false;
        }
        CoreRolePermissionId other = (CoreRolePermissionId)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Long this$roleId = this.getRoleId();
        Long other$roleId = other.getRoleId();
        if (this$roleId == null ? other$roleId != null : !((Object)this$roleId).equals(other$roleId)) {
            return false;
        }
        Long this$permissionId = this.getPermissionId();
        Long other$permissionId = other.getPermissionId();
        return !(this$permissionId == null ? other$permissionId != null : !((Object)this$permissionId).equals(other$permissionId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CoreRolePermissionId;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $roleId = this.getRoleId();
        result = result * 59 + ($roleId == null ? 43 : ((Object)$roleId).hashCode());
        Long $permissionId = this.getPermissionId();
        result = result * 59 + ($permissionId == null ? 43 : ((Object)$permissionId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CoreRolePermissionId(roleId=" + this.getRoleId() + ", permissionId=" + this.getPermissionId() + ")";
    }

    @Generated
    public CoreRolePermissionId() {
    }

    @Generated
    public CoreRolePermissionId(Long roleId, Long permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }
}

