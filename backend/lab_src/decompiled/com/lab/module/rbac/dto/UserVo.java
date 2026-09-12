/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.UserVo
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Generated;

public class UserVo {
    private String nanoId;
    private String username;
    private String name;
    private String email;
    private String mobile;
    private String deptNanoId;
    private String mentorGroupNanoId;
    private List<String> roleNanoIds;
    private Integer isActive;
    private LocalDateTime sysCreateDatetime;
    private String avatarUrl;

    @Generated
    public UserVo() {
    }

    @Generated
    public String getNanoId() {
        return this.nanoId;
    }

    @Generated
    public String getUsername() {
        return this.username;
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
    public List<String> getRoleNanoIds() {
        return this.roleNanoIds;
    }

    @Generated
    public Integer getIsActive() {
        return this.isActive;
    }

    @Generated
    public LocalDateTime getSysCreateDatetime() {
        return this.sysCreateDatetime;
    }

    @Generated
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Generated
    public void setNanoId(String nanoId) {
        this.nanoId = nanoId;
    }

    @Generated
    public void setUsername(String username) {
        this.username = username;
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
    public void setRoleNanoIds(List<String> roleNanoIds) {
        this.roleNanoIds = roleNanoIds;
    }

    @Generated
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Generated
    public void setSysCreateDatetime(LocalDateTime sysCreateDatetime) {
        this.sysCreateDatetime = sysCreateDatetime;
    }

    @Generated
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserVo)) {
            return false;
        }
        UserVo other = (UserVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Integer this$isActive = this.getIsActive();
        Integer other$isActive = other.getIsActive();
        if (this$isActive == null ? other$isActive != null : !((Object)this$isActive).equals(other$isActive)) {
            return false;
        }
        String this$nanoId = this.getNanoId();
        String other$nanoId = other.getNanoId();
        if (this$nanoId == null ? other$nanoId != null : !this$nanoId.equals(other$nanoId)) {
            return false;
        }
        String this$username = this.getUsername();
        String other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) {
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
        if (this$mentorGroupNanoId == null ? other$mentorGroupNanoId != null : !this$mentorGroupNanoId.equals(other$mentorGroupNanoId)) {
            return false;
        }
        List this$roleNanoIds = this.getRoleNanoIds();
        List other$roleNanoIds = other.getRoleNanoIds();
        if (this$roleNanoIds == null ? other$roleNanoIds != null : !((Object)this$roleNanoIds).equals(other$roleNanoIds)) {
            return false;
        }
        LocalDateTime this$sysCreateDatetime = this.getSysCreateDatetime();
        LocalDateTime other$sysCreateDatetime = other.getSysCreateDatetime();
        if (this$sysCreateDatetime == null ? other$sysCreateDatetime != null : !((Object)this$sysCreateDatetime).equals(other$sysCreateDatetime)) {
            return false;
        }
        String this$avatarUrl = this.getAvatarUrl();
        String other$avatarUrl = other.getAvatarUrl();
        return !(this$avatarUrl == null ? other$avatarUrl != null : !this$avatarUrl.equals(other$avatarUrl));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $isActive = this.getIsActive();
        result = result * 59 + ($isActive == null ? 43 : ((Object)$isActive).hashCode());
        String $nanoId = this.getNanoId();
        result = result * 59 + ($nanoId == null ? 43 : $nanoId.hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
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
        List $roleNanoIds = this.getRoleNanoIds();
        result = result * 59 + ($roleNanoIds == null ? 43 : ((Object)$roleNanoIds).hashCode());
        LocalDateTime $sysCreateDatetime = this.getSysCreateDatetime();
        result = result * 59 + ($sysCreateDatetime == null ? 43 : ((Object)$sysCreateDatetime).hashCode());
        String $avatarUrl = this.getAvatarUrl();
        result = result * 59 + ($avatarUrl == null ? 43 : $avatarUrl.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UserVo(nanoId=" + this.getNanoId() + ", username=" + this.getUsername() + ", name=" + this.getName() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", deptNanoId=" + this.getDeptNanoId() + ", mentorGroupNanoId=" + this.getMentorGroupNanoId() + ", roleNanoIds=" + String.valueOf(this.getRoleNanoIds()) + ", isActive=" + this.getIsActive() + ", sysCreateDatetime=" + String.valueOf(this.getSysCreateDatetime()) + ", avatarUrl=" + this.getAvatarUrl() + ")";
    }
}

