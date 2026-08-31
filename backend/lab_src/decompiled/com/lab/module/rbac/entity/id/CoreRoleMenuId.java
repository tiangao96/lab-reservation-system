/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.entity.id.CoreRoleMenuId
 *  lombok.Generated
 */
package com.lab.module.rbac.entity.id;

import java.io.Serializable;
import lombok.Generated;

public class CoreRoleMenuId
implements Serializable {
    private Long roleId;
    private Long menuId;

    @Generated
    public Long getRoleId() {
        return this.roleId;
    }

    @Generated
    public Long getMenuId() {
        return this.menuId;
    }

    @Generated
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoreRoleMenuId)) {
            return false;
        }
        CoreRoleMenuId other = (CoreRoleMenuId)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Long this$roleId = this.getRoleId();
        Long other$roleId = other.getRoleId();
        if (this$roleId == null ? other$roleId != null : !((Object)this$roleId).equals(other$roleId)) {
            return false;
        }
        Long this$menuId = this.getMenuId();
        Long other$menuId = other.getMenuId();
        return !(this$menuId == null ? other$menuId != null : !((Object)this$menuId).equals(other$menuId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CoreRoleMenuId;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $roleId = this.getRoleId();
        result = result * 59 + ($roleId == null ? 43 : ((Object)$roleId).hashCode());
        Long $menuId = this.getMenuId();
        result = result * 59 + ($menuId == null ? 43 : ((Object)$menuId).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "CoreRoleMenuId(roleId=" + this.getRoleId() + ", menuId=" + this.getMenuId() + ")";
    }

    @Generated
    public CoreRoleMenuId() {
    }

    @Generated
    public CoreRoleMenuId(Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }
}

