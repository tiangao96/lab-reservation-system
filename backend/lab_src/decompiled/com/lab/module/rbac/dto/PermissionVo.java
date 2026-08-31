/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.PermissionVo
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import lombok.Generated;

public class PermissionVo {
    private String nanoId;
    private String name;
    private String code;
    private Integer permissionType;
    private String apiPath;
    private Integer httpMethod;
    private String description;
    private Integer isActive;
    private Integer sort;
    private String menuNanoId;

    @Generated
    public PermissionVo() {
    }

    @Generated
    public String getNanoId() {
        return this.nanoId;
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
    public Integer getPermissionType() {
        return this.permissionType;
    }

    @Generated
    public String getApiPath() {
        return this.apiPath;
    }

    @Generated
    public Integer getHttpMethod() {
        return this.httpMethod;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public Integer getIsActive() {
        return this.isActive;
    }

    @Generated
    public Integer getSort() {
        return this.sort;
    }

    @Generated
    public String getMenuNanoId() {
        return this.menuNanoId;
    }

    @Generated
    public void setNanoId(String nanoId) {
        this.nanoId = nanoId;
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
    public void setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
    }

    @Generated
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    @Generated
    public void setHttpMethod(Integer httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Generated
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated
    public void setMenuNanoId(String menuNanoId) {
        this.menuNanoId = menuNanoId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PermissionVo)) {
            return false;
        }
        PermissionVo other = (PermissionVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Integer this$permissionType = this.getPermissionType();
        Integer other$permissionType = other.getPermissionType();
        if (this$permissionType == null ? other$permissionType != null : !((Object)this$permissionType).equals(other$permissionType)) {
            return false;
        }
        Integer this$httpMethod = this.getHttpMethod();
        Integer other$httpMethod = other.getHttpMethod();
        if (this$httpMethod == null ? other$httpMethod != null : !((Object)this$httpMethod).equals(other$httpMethod)) {
            return false;
        }
        Integer this$isActive = this.getIsActive();
        Integer other$isActive = other.getIsActive();
        if (this$isActive == null ? other$isActive != null : !((Object)this$isActive).equals(other$isActive)) {
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
        String this$apiPath = this.getApiPath();
        String other$apiPath = other.getApiPath();
        if (this$apiPath == null ? other$apiPath != null : !this$apiPath.equals(other$apiPath)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$menuNanoId = this.getMenuNanoId();
        String other$menuNanoId = other.getMenuNanoId();
        return !(this$menuNanoId == null ? other$menuNanoId != null : !this$menuNanoId.equals(other$menuNanoId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof PermissionVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $permissionType = this.getPermissionType();
        result = result * 59 + ($permissionType == null ? 43 : ((Object)$permissionType).hashCode());
        Integer $httpMethod = this.getHttpMethod();
        result = result * 59 + ($httpMethod == null ? 43 : ((Object)$httpMethod).hashCode());
        Integer $isActive = this.getIsActive();
        result = result * 59 + ($isActive == null ? 43 : ((Object)$isActive).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        String $nanoId = this.getNanoId();
        result = result * 59 + ($nanoId == null ? 43 : $nanoId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $apiPath = this.getApiPath();
        result = result * 59 + ($apiPath == null ? 43 : $apiPath.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $menuNanoId = this.getMenuNanoId();
        result = result * 59 + ($menuNanoId == null ? 43 : $menuNanoId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "PermissionVo(nanoId=" + this.getNanoId() + ", name=" + this.getName() + ", code=" + this.getCode() + ", permissionType=" + this.getPermissionType() + ", apiPath=" + this.getApiPath() + ", httpMethod=" + this.getHttpMethod() + ", description=" + this.getDescription() + ", isActive=" + this.getIsActive() + ", sort=" + this.getSort() + ", menuNanoId=" + this.getMenuNanoId() + ")";
    }
}

