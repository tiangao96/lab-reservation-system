/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.UserUpdateRequest
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Generated;

public class UserUpdateRequest {
    @NotBlank(message="\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a") String username;
    private String password;
    private String name;
    private String email;
    private String mobile;
    private String deptNanoId;
    private String mentorGroupNanoId;
    private Integer isActive;
    private Integer userType;

    @Generated
    public UserUpdateRequest() {
    }

    @Generated
    public String getUsername() {
        return this.username;
    }

    @Generated
    public String getPassword() {
        return this.password;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public String getMobile() {
        return this.mobile;
    }

    @Generated
    public String getDeptNanoId() {
        return this.deptNanoId;
    }

    @Generated
    public String getMentorGroupNanoId() {
        return this.mentorGroupNanoId;
    }

    @Generated
    public Integer getIsActive() {
        return this.isActive;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Generated
    public void setDeptNanoId(String deptNanoId) {
        this.deptNanoId = deptNanoId;
    }

    @Generated
    public void setMentorGroupNanoId(String mentorGroupNanoId) {
        this.mentorGroupNanoId = mentorGroupNanoId;
    }

    @Generated
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Generated
    public Integer getUserType() {
        return this.userType;
    }

    @Generated
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserUpdateRequest)) {
            return false;
        }
        UserUpdateRequest other = (UserUpdateRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Integer this$isActive = this.getIsActive();
        Integer other$isActive = other.getIsActive();
        if (this$isActive == null ? other$isActive != null : !((Object)this$isActive).equals(other$isActive)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
            return false;
        }
        String this$password = this.getPassword();
        String other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
            return false;
        }
        String this$deptNanoId = this.getDeptNanoId();
        String other$deptNanoId = other.getDeptNanoId();
        if (this$deptNanoId == null ? other$deptNanoId != null : !this$deptNanoId.equals(other$deptNanoId)) {
            return false;
        }
        String this$mentorGroupNanoId = this.getMentorGroupNanoId();
        String other$mentorGroupNanoId = other.getMentorGroupNanoId();
        return !(this$mentorGroupNanoId == null ? other$mentorGroupNanoId != null : !this$mentorGroupNanoId.equals(other$mentorGroupNanoId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserUpdateRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $isActive = this.getIsActive();
        result = result * 59 + ($isActive == null ? 43 : ((Object)$isActive).hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $deptNanoId = this.getDeptNanoId();
        result = result * 59 + ($deptNanoId == null ? 43 : $deptNanoId.hashCode());
        String $mentorGroupNanoId = this.getMentorGroupNanoId();
        result = result * 59 + ($mentorGroupNanoId == null ? 43 : $mentorGroupNanoId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UserUpdateRequest(username=" + this.getUsername() + ", password=" + this.getPassword() + ", name=" + this.getName() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", deptNanoId=" + this.getDeptNanoId() + ", mentorGroupNanoId=" + this.getMentorGroupNanoId() + ", isActive=" + this.getIsActive() + ")";
    }
}

