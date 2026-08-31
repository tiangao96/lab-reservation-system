/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.entity.AuditEntity
 *  com.lab.module.rbac.entity.CoreUserRole
 *  com.lab.module.rbac.entity.id.CoreUserRoleId
 *  jakarta.persistence.Entity
 *  jakarta.persistence.Id
 *  jakarta.persistence.IdClass
 *  jakarta.persistence.Table
 *  lombok.Generated
 *  org.hibernate.annotations.SQLRestriction
 */
package com.lab.module.rbac.entity;

import com.lab.common.entity.AuditEntity;
import com.lab.module.rbac.entity.id.CoreUserRoleId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Generated;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name="core_user_role")
@SQLRestriction(value="is_deleted = 0")
@IdClass(value=CoreUserRoleId.class)
public class CoreUserRole
extends AuditEntity {
    @Id
    private Long userId;
    @Id
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
    public String toString() {
        return "CoreUserRole(userId=" + this.getUserId() + ", roleId=" + this.getRoleId() + ")";
    }

    @Generated
    public CoreUserRole() {
    }

    @Generated
    public CoreUserRole(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoreUserRole)) {
            return false;
        }
        CoreUserRole other = (CoreUserRole)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (!super.equals(o)) {
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
        return other instanceof CoreUserRole;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Long $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : ((Object)$userId).hashCode());
        Long $roleId = this.getRoleId();
        result = result * 59 + ($roleId == null ? 43 : ((Object)$roleId).hashCode());
        return result;
    }
}

