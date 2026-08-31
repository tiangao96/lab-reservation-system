/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.entity.CoreRolePermission
 *  com.lab.module.rbac.entity.id.CoreRolePermissionId
 *  jakarta.persistence.Entity
 *  jakarta.persistence.Id
 *  jakarta.persistence.IdClass
 *  jakarta.persistence.Table
 *  lombok.Generated
 */
package com.lab.module.rbac.entity;

import com.lab.module.rbac.entity.id.CoreRolePermissionId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Generated;

@Entity
@Table(name="core_role_permission")
@IdClass(value=CoreRolePermissionId.class)
public class CoreRolePermission {
    @Id
    private Long roleId;
    @Id
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
        if (!(o instanceof CoreRolePermission)) {
            return false;
        }
        CoreRolePermission other = (CoreRolePermission)o;
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
        return other instanceof CoreRolePermission;
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
        return "CoreRolePermission(roleId=" + this.getRoleId() + ", permissionId=" + this.getPermissionId() + ")";
    }

    @Generated
    public CoreRolePermission() {
    }

    @Generated
    public CoreRolePermission(Long roleId, Long permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }
}

