/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.MentorGroupVo
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class MentorGroupVo {
    private String nanoId;
    private String parentNanoId;
    private String leadNanoId;
    private String name;
    private String code;
    private String phone;
    private String email;
    private Integer status;
    private String description;
    private Integer level;
    private String path;
    private Integer sort;
    private List<MentorGroupVo> children = new ArrayList();

    @Generated
    public MentorGroupVo() {
    }

    @Generated
    public String getNanoId() {
        return this.nanoId;
    }

    @Generated
    public String getParentNanoId() {
        return this.parentNanoId;
    }

    @Generated
    public String getLeadNanoId() {
        return this.leadNanoId;
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
    public String getPhone() {
        return this.phone;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public Integer getLevel() {
        return this.level;
    }

    @Generated
    public String getPath() {
        return this.path;
    }

    @Generated
    public Integer getSort() {
        return this.sort;
    }

    @Generated
    public List<MentorGroupVo> getChildren() {
        return this.children;
    }

    @Generated
    public void setNanoId(String nanoId) {
        this.nanoId = nanoId;
    }

    @Generated
    public void setParentNanoId(String parentNanoId) {
        this.parentNanoId = parentNanoId;
    }

    @Generated
    public void setLeadNanoId(String leadNanoId) {
        this.leadNanoId = leadNanoId;
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
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Generated
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setLevel(Integer level) {
        this.level = level;
    }

    @Generated
    public void setPath(String path) {
        this.path = path;
    }

    @Generated
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated
    public void setChildren(List<MentorGroupVo> children) {
        this.children = children;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MentorGroupVo)) {
            return false;
        }
        MentorGroupVo other = (MentorGroupVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        String this$nanoId = this.getNanoId();
        String other$nanoId = other.getNanoId();
        if (this$nanoId == null ? other$nanoId != null : !this$nanoId.equals(other$nanoId)) {
            return false;
        }
        String this$parentNanoId = this.getParentNanoId();
        String other$parentNanoId = other.getParentNanoId();
        if (this$parentNanoId == null ? other$parentNanoId != null : !this$parentNanoId.equals(other$parentNanoId)) {
            return false;
        }
        String this$leadNanoId = this.getLeadNanoId();
        String other$leadNanoId = other.getLeadNanoId();
        if (this$leadNanoId == null ? other$leadNanoId != null : !this$leadNanoId.equals(other$leadNanoId)) {
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
        String this$phone = this.getPhone();
        String other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        List this$children = this.getChildren();
        List other$children = other.getChildren();
        return !(this$children == null ? other$children != null : !((Object)this$children).equals(other$children));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof MentorGroupVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        String $nanoId = this.getNanoId();
        result = result * 59 + ($nanoId == null ? 43 : $nanoId.hashCode());
        String $parentNanoId = this.getParentNanoId();
        result = result * 59 + ($parentNanoId == null ? 43 : $parentNanoId.hashCode());
        String $leadNanoId = this.getLeadNanoId();
        result = result * 59 + ($leadNanoId == null ? 43 : $leadNanoId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        List $children = this.getChildren();
        result = result * 59 + ($children == null ? 43 : ((Object)$children).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "MentorGroupVo(nanoId=" + this.getNanoId() + ", parentNanoId=" + this.getParentNanoId() + ", leadNanoId=" + this.getLeadNanoId() + ", name=" + this.getName() + ", code=" + this.getCode() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", status=" + this.getStatus() + ", description=" + this.getDescription() + ", level=" + this.getLevel() + ", path=" + this.getPath() + ", sort=" + this.getSort() + ", children=" + String.valueOf(this.getChildren()) + ")";
    }
}

