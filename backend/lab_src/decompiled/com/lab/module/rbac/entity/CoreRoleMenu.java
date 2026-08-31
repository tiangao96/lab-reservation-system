/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.entity.CoreRoleMenu
 *  com.lab.module.rbac.entity.id.CoreRoleMenuId
 *  jakarta.persistence.Entity
 *  jakarta.persistence.Id
 *  jakarta.persistence.IdClass
 *  jakarta.persistence.Table
 *  lombok.Generated
 */
package com.lab.module.rbac.entity;

import com.lab.module.rbac.entity.id.CoreRoleMenuId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Generated;

@Entity
@Table(name="core_role_menu")
@IdClass(value=CoreRoleMenuId.class)
public class CoreRoleMenu {
    @Id
    private Long roleId;
    @Id
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
        if (!(o instanceof CoreRoleMenu)) {
            return false;
        }
        CoreRoleMenu other = (CoreRoleMenu)o;
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
        return other instanceof CoreRoleMenu;
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
        return "CoreRoleMenu(roleId=" + this.getRoleId() + ", menuId=" + this.getMenuId() + ")";
    }

    @Generated
    public CoreRoleMenu() {
    }

    @Generated
    public CoreRoleMenu(Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }
}

