/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.entity.BaseEntity
 *  com.lab.module.rbac.entity.CoreRole
 *  jakarta.persistence.Entity
 *  jakarta.persistence.Table
 *  lombok.Generated
 *  org.hibernate.annotations.SQLRestriction
 */
package com.lab.module.rbac.entity;

import com.lab.common.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Generated;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name="core_role")
@SQLRestriction(value="is_deleted = 0")
public class CoreRole
extends BaseEntity {
    private String name;
    private String code;
    private Integer roleType;
    private Integer status;
    private Integer priority;
    private String description;
    private String remark;

    @Generated
    public CoreRole() {
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getCode() {
        return this.code;
    }

    @Generated
    public Integer getRoleType() {
        return this.roleType;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Integer getPriority() {
        return this.priority;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String getRemark() {
        return this.remark;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setCode(String code) {
        this.code = code;
    }

    @Generated
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Generated
    public String toString() {
        return "CoreRole(name=" + this.getName() + ", code=" + this.getCode() + ", roleType=" + this.getRoleType() + ", status=" + this.getStatus() + ", priority=" + this.getPriority() + ", description=" + this.getDescription() + ", remark=" + this.getRemark() + ")";
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoreRole)) {
            return false;
        }
        CoreRole other = (CoreRole)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Integer this$roleType = this.getRoleType();
        Integer other$roleType = other.getRoleType();
        if (this$roleType == null ? other$roleType != null : !((Object)this$roleType).equals(other$roleType)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$priority = this.getPriority();
        Integer other$priority = other.getPriority();
        if (this$priority == null ? other$priority != null : !((Object)this$priority).equals(other$priority)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CoreRole;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Integer $roleType = this.getRoleType();
        result = result * 59 + ($roleType == null ? 43 : ((Object)$roleType).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $priority = this.getPriority();
        result = result * 59 + ($priority == null ? 43 : ((Object)$priority).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }
}

