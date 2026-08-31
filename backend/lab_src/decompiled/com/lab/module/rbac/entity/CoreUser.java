/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.entity.BaseEntity
 *  com.lab.module.rbac.entity.CoreUser
 *  jakarta.persistence.Entity
 *  jakarta.persistence.Table
 *  lombok.Generated
 *  org.hibernate.annotations.SQLRestriction
 */
package com.lab.module.rbac.entity;

import com.lab.common.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Generated;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name="core_user")
@SQLRestriction(value="is_deleted = 0")
public class CoreUser
extends BaseEntity {
    private String username;
    private String password;
    private Integer isSuperuser;
    private LocalDateTime lastLogin;
    private String email;
    private String mobile;
    private String avatar;
    private String name;
    private Integer gender;
    private Integer userType;
    private Integer userStatus;
    private LocalDate birthday;
    private String city;
    private String address;
    private String bio;
    private String lastLoginIp;
    private String lastLoginType;
    private Integer isActive;
    private Long deptId;
    private Long mentorGroupId;
    private Long postId;
    private Long roleId;
    private Long managerId;
    private String oauthProvider;
    private String giteeId;
    private String githubId;
    private String qqId;
    private String googleId;
    private String wechatUnionid;
    private String wechatOpenid;
    private String microsoftId;
    private String dingtalkUnionid;
    private String dingtalkUserid;
    private String feishuUnionId;
    private String feishuUserid;
    private String wecomUserid;

    @Generated
    public CoreUser() {
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
    public Integer getIsSuperuser() {
        return this.isSuperuser;
    }

    @Generated
    public LocalDateTime getLastLogin() {
        return this.lastLogin;
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
    public String getAvatar() {
        return this.avatar;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public Integer getGender() {
        return this.gender;
    }

    @Generated
    public Integer getUserType() {
        return this.userType;
    }

    @Generated
    public Integer getUserStatus() {
        return this.userStatus;
    }

    @Generated
    public LocalDate getBirthday() {
        return this.birthday;
    }

    @Generated
    public String getCity() {
        return this.city;
    }

    @Generated
    public String getAddress() {
        return this.address;
    }

    @Generated
    public String getBio() {
        return this.bio;
    }

    @Generated
    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    @Generated
    public String getLastLoginType() {
        return this.lastLoginType;
    }

    @Generated
    public Integer getIsActive() {
        return this.isActive;
    }

    @Generated
    public Long getDeptId() {
        return this.deptId;
    }

    @Generated
    public Long getMentorGroupId() {
        return this.mentorGroupId;
    }

    @Generated
    public Long getPostId() {
        return this.postId;
    }

    @Generated
    public Long getRoleId() {
        return this.roleId;
    }

    @Generated
    public Long getManagerId() {
        return this.managerId;
    }

    @Generated
    public String getOauthProvider() {
        return this.oauthProvider;
    }

    @Generated
    public String getGiteeId() {
        return this.giteeId;
    }

    @Generated
    public String getGithubId() {
        return this.githubId;
    }

    @Generated
    public String getQqId() {
        return this.qqId;
    }

    @Generated
    public String getGoogleId() {
        return this.googleId;
    }

    @Generated
    public String getWechatUnionid() {
        return this.wechatUnionid;
    }

    @Generated
    public String getWechatOpenid() {
        return this.wechatOpenid;
    }

    @Generated
    public String getMicrosoftId() {
        return this.microsoftId;
    }

    @Generated
    public String getDingtalkUnionid() {
        return this.dingtalkUnionid;
    }

    @Generated
    public String getDingtalkUserid() {
        return this.dingtalkUserid;
    }

    @Generated
    public String getFeishuUnionId() {
        return this.feishuUnionId;
    }

    @Generated
    public String getFeishuUserid() {
        return this.feishuUserid;
    }

    @Generated
    public String getWecomUserid() {
        return this.wecomUserid;
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
    public void setIsSuperuser(Integer isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    @Generated
    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
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
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Generated
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Generated
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Generated
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Generated
    public void setCity(String city) {
        this.city = city;
    }

    @Generated
    public void setAddress(String address) {
        this.address = address;
    }

    @Generated
    public void setBio(String bio) {
        this.bio = bio;
    }

    @Generated
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Generated
    public void setLastLoginType(String lastLoginType) {
        this.lastLoginType = lastLoginType;
    }

    @Generated
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Generated
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Generated
    public void setMentorGroupId(Long mentorGroupId) {
        this.mentorGroupId = mentorGroupId;
    }

    @Generated
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Generated
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    @Generated
    public void setOauthProvider(String oauthProvider) {
        this.oauthProvider = oauthProvider;
    }

    @Generated
    public void setGiteeId(String giteeId) {
        this.giteeId = giteeId;
    }

    @Generated
    public void setGithubId(String githubId) {
        this.githubId = githubId;
    }

    @Generated
    public void setQqId(String qqId) {
        this.qqId = qqId;
    }

    @Generated
    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    @Generated
    public void setWechatUnionid(String wechatUnionid) {
        this.wechatUnionid = wechatUnionid;
    }

    @Generated
    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    @Generated
    public void setMicrosoftId(String microsoftId) {
        this.microsoftId = microsoftId;
    }

    @Generated
    public void setDingtalkUnionid(String dingtalkUnionid) {
        this.dingtalkUnionid = dingtalkUnionid;
    }

    @Generated
    public void setDingtalkUserid(String dingtalkUserid) {
        this.dingtalkUserid = dingtalkUserid;
    }

    @Generated
    public void setFeishuUnionId(String feishuUnionId) {
        this.feishuUnionId = feishuUnionId;
    }

    @Generated
    public void setFeishuUserid(String feishuUserid) {
        this.feishuUserid = feishuUserid;
    }

    @Generated
    public void setWecomUserid(String wecomUserid) {
        this.wecomUserid = wecomUserid;
    }

    @Generated
    public String toString() {
        return "CoreUser(username=" + this.getUsername() + ", password=" + this.getPassword() + ", isSuperuser=" + this.getIsSuperuser() + ", lastLogin=" + String.valueOf(this.getLastLogin()) + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", avatar=" + this.getAvatar() + ", name=" + this.getName() + ", gender=" + this.getGender() + ", userType=" + this.getUserType() + ", userStatus=" + this.getUserStatus() + ", birthday=" + String.valueOf(this.getBirthday()) + ", city=" + this.getCity() + ", address=" + this.getAddress() + ", bio=" + this.getBio() + ", lastLoginIp=" + this.getLastLoginIp() + ", lastLoginType=" + this.getLastLoginType() + ", isActive=" + this.getIsActive() + ", deptId=" + this.getDeptId() + ", mentorGroupId=" + this.getMentorGroupId() + ", postId=" + this.getPostId() + ", roleId=" + this.getRoleId() + ", managerId=" + this.getManagerId() + ", oauthProvider=" + this.getOauthProvider() + ", giteeId=" + this.getGiteeId() + ", githubId=" + this.getGithubId() + ", qqId=" + this.getQqId() + ", googleId=" + this.getGoogleId() + ", wechatUnionid=" + this.getWechatUnionid() + ", wechatOpenid=" + this.getWechatOpenid() + ", microsoftId=" + this.getMicrosoftId() + ", dingtalkUnionid=" + this.getDingtalkUnionid() + ", dingtalkUserid=" + this.getDingtalkUserid() + ", feishuUnionId=" + this.getFeishuUnionId() + ", feishuUserid=" + this.getFeishuUserid() + ", wecomUserid=" + this.getWecomUserid() + ")";
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoreUser)) {
            return false;
        }
        CoreUser other = (CoreUser)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Integer this$isSuperuser = this.getIsSuperuser();
        Integer other$isSuperuser = other.getIsSuperuser();
        if (this$isSuperuser == null ? other$isSuperuser != null : !((Object)this$isSuperuser).equals(other$isSuperuser)) {
            return false;
        }
        Integer this$gender = this.getGender();
        Integer other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !((Object)this$gender).equals(other$gender)) {
            return false;
        }
        Integer this$userType = this.getUserType();
        Integer other$userType = other.getUserType();
        if (this$userType == null ? other$userType != null : !((Object)this$userType).equals(other$userType)) {
            return false;
        }
        Integer this$userStatus = this.getUserStatus();
        Integer other$userStatus = other.getUserStatus();
        if (this$userStatus == null ? other$userStatus != null : !((Object)this$userStatus).equals(other$userStatus)) {
            return false;
        }
        Integer this$isActive = this.getIsActive();
        Integer other$isActive = other.getIsActive();
        if (this$isActive == null ? other$isActive != null : !((Object)this$isActive).equals(other$isActive)) {
            return false;
        }
        Long this$deptId = this.getDeptId();
        Long other$deptId = other.getDeptId();
        if (this$deptId == null ? other$deptId != null : !((Object)this$deptId).equals(other$deptId)) {
            return false;
        }
        Long this$mentorGroupId = this.getMentorGroupId();
        Long other$mentorGroupId = other.getMentorGroupId();
        if (this$mentorGroupId == null ? other$mentorGroupId != null : !((Object)this$mentorGroupId).equals(other$mentorGroupId)) {
            return false;
        }
        Long this$postId = this.getPostId();
        Long other$postId = other.getPostId();
        if (this$postId == null ? other$postId != null : !((Object)this$postId).equals(other$postId)) {
            return false;
        }
        Long this$roleId = this.getRoleId();
        Long other$roleId = other.getRoleId();
        if (this$roleId == null ? other$roleId != null : !((Object)this$roleId).equals(other$roleId)) {
            return false;
        }
        Long this$managerId = this.getManagerId();
        Long other$managerId = other.getManagerId();
        if (this$managerId == null ? other$managerId != null : !((Object)this$managerId).equals(other$managerId)) {
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
        LocalDateTime this$lastLogin = this.getLastLogin();
        LocalDateTime other$lastLogin = other.getLastLogin();
        if (this$lastLogin == null ? other$lastLogin != null : !((Object)this$lastLogin).equals(other$lastLogin)) {
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
        String this$avatar = this.getAvatar();
        String other$avatar = other.getAvatar();
        if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        LocalDate this$birthday = this.getBirthday();
        LocalDate other$birthday = other.getBirthday();
        if (this$birthday == null ? other$birthday != null : !((Object)this$birthday).equals(other$birthday)) {
            return false;
        }
        String this$city = this.getCity();
        String other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) {
            return false;
        }
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$bio = this.getBio();
        String other$bio = other.getBio();
        if (this$bio == null ? other$bio != null : !this$bio.equals(other$bio)) {
            return false;
        }
        String this$lastLoginIp = this.getLastLoginIp();
        String other$lastLoginIp = other.getLastLoginIp();
        if (this$lastLoginIp == null ? other$lastLoginIp != null : !this$lastLoginIp.equals(other$lastLoginIp)) {
            return false;
        }
        String this$lastLoginType = this.getLastLoginType();
        String other$lastLoginType = other.getLastLoginType();
        if (this$lastLoginType == null ? other$lastLoginType != null : !this$lastLoginType.equals(other$lastLoginType)) {
            return false;
        }
        String this$oauthProvider = this.getOauthProvider();
        String other$oauthProvider = other.getOauthProvider();
        if (this$oauthProvider == null ? other$oauthProvider != null : !this$oauthProvider.equals(other$oauthProvider)) {
            return false;
        }
        String this$giteeId = this.getGiteeId();
        String other$giteeId = other.getGiteeId();
        if (this$giteeId == null ? other$giteeId != null : !this$giteeId.equals(other$giteeId)) {
            return false;
        }
        String this$githubId = this.getGithubId();
        String other$githubId = other.getGithubId();
        if (this$githubId == null ? other$githubId != null : !this$githubId.equals(other$githubId)) {
            return false;
        }
        String this$qqId = this.getQqId();
        String other$qqId = other.getQqId();
        if (this$qqId == null ? other$qqId != null : !this$qqId.equals(other$qqId)) {
            return false;
        }
        String this$googleId = this.getGoogleId();
        String other$googleId = other.getGoogleId();
        if (this$googleId == null ? other$googleId != null : !this$googleId.equals(other$googleId)) {
            return false;
        }
        String this$wechatUnionid = this.getWechatUnionid();
        String other$wechatUnionid = other.getWechatUnionid();
        if (this$wechatUnionid == null ? other$wechatUnionid != null : !this$wechatUnionid.equals(other$wechatUnionid)) {
            return false;
        }
        String this$wechatOpenid = this.getWechatOpenid();
        String other$wechatOpenid = other.getWechatOpenid();
        if (this$wechatOpenid == null ? other$wechatOpenid != null : !this$wechatOpenid.equals(other$wechatOpenid)) {
            return false;
        }
        String this$microsoftId = this.getMicrosoftId();
        String other$microsoftId = other.getMicrosoftId();
        if (this$microsoftId == null ? other$microsoftId != null : !this$microsoftId.equals(other$microsoftId)) {
            return false;
        }
        String this$dingtalkUnionid = this.getDingtalkUnionid();
        String other$dingtalkUnionid = other.getDingtalkUnionid();
        if (this$dingtalkUnionid == null ? other$dingtalkUnionid != null : !this$dingtalkUnionid.equals(other$dingtalkUnionid)) {
            return false;
        }
        String this$dingtalkUserid = this.getDingtalkUserid();
        String other$dingtalkUserid = other.getDingtalkUserid();
        if (this$dingtalkUserid == null ? other$dingtalkUserid != null : !this$dingtalkUserid.equals(other$dingtalkUserid)) {
            return false;
        }
        String this$feishuUnionId = this.getFeishuUnionId();
        String other$feishuUnionId = other.getFeishuUnionId();
        if (this$feishuUnionId == null ? other$feishuUnionId != null : !this$feishuUnionId.equals(other$feishuUnionId)) {
            return false;
        }
        String this$feishuUserid = this.getFeishuUserid();
        String other$feishuUserid = other.getFeishuUserid();
        if (this$feishuUserid == null ? other$feishuUserid != null : !this$feishuUserid.equals(other$feishuUserid)) {
            return false;
        }
        String this$wecomUserid = this.getWecomUserid();
        String other$wecomUserid = other.getWecomUserid();
        return !(this$wecomUserid == null ? other$wecomUserid != null : !this$wecomUserid.equals(other$wecomUserid));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof CoreUser;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Integer $isSuperuser = this.getIsSuperuser();
        result = result * 59 + ($isSuperuser == null ? 43 : ((Object)$isSuperuser).hashCode());
        Integer $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : ((Object)$gender).hashCode());
        Integer $userType = this.getUserType();
        result = result * 59 + ($userType == null ? 43 : ((Object)$userType).hashCode());
        Integer $userStatus = this.getUserStatus();
        result = result * 59 + ($userStatus == null ? 43 : ((Object)$userStatus).hashCode());
        Integer $isActive = this.getIsActive();
        result = result * 59 + ($isActive == null ? 43 : ((Object)$isActive).hashCode());
        Long $deptId = this.getDeptId();
        result = result * 59 + ($deptId == null ? 43 : ((Object)$deptId).hashCode());
        Long $mentorGroupId = this.getMentorGroupId();
        result = result * 59 + ($mentorGroupId == null ? 43 : ((Object)$mentorGroupId).hashCode());
        Long $postId = this.getPostId();
        result = result * 59 + ($postId == null ? 43 : ((Object)$postId).hashCode());
        Long $roleId = this.getRoleId();
        result = result * 59 + ($roleId == null ? 43 : ((Object)$roleId).hashCode());
        Long $managerId = this.getManagerId();
        result = result * 59 + ($managerId == null ? 43 : ((Object)$managerId).hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        LocalDateTime $lastLogin = this.getLastLogin();
        result = result * 59 + ($lastLogin == null ? 43 : ((Object)$lastLogin).hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $avatar = this.getAvatar();
        result = result * 59 + ($avatar == null ? 43 : $avatar.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        LocalDate $birthday = this.getBirthday();
        result = result * 59 + ($birthday == null ? 43 : ((Object)$birthday).hashCode());
        String $city = this.getCity();
        result = result * 59 + ($city == null ? 43 : $city.hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $bio = this.getBio();
        result = result * 59 + ($bio == null ? 43 : $bio.hashCode());
        String $lastLoginIp = this.getLastLoginIp();
        result = result * 59 + ($lastLoginIp == null ? 43 : $lastLoginIp.hashCode());
        String $lastLoginType = this.getLastLoginType();
        result = result * 59 + ($lastLoginType == null ? 43 : $lastLoginType.hashCode());
        String $oauthProvider = this.getOauthProvider();
        result = result * 59 + ($oauthProvider == null ? 43 : $oauthProvider.hashCode());
        String $giteeId = this.getGiteeId();
        result = result * 59 + ($giteeId == null ? 43 : $giteeId.hashCode());
        String $githubId = this.getGithubId();
        result = result * 59 + ($githubId == null ? 43 : $githubId.hashCode());
        String $qqId = this.getQqId();
        result = result * 59 + ($qqId == null ? 43 : $qqId.hashCode());
        String $googleId = this.getGoogleId();
        result = result * 59 + ($googleId == null ? 43 : $googleId.hashCode());
        String $wechatUnionid = this.getWechatUnionid();
        result = result * 59 + ($wechatUnionid == null ? 43 : $wechatUnionid.hashCode());
        String $wechatOpenid = this.getWechatOpenid();
        result = result * 59 + ($wechatOpenid == null ? 43 : $wechatOpenid.hashCode());
        String $microsoftId = this.getMicrosoftId();
        result = result * 59 + ($microsoftId == null ? 43 : $microsoftId.hashCode());
        String $dingtalkUnionid = this.getDingtalkUnionid();
        result = result * 59 + ($dingtalkUnionid == null ? 43 : $dingtalkUnionid.hashCode());
        String $dingtalkUserid = this.getDingtalkUserid();
        result = result * 59 + ($dingtalkUserid == null ? 43 : $dingtalkUserid.hashCode());
        String $feishuUnionId = this.getFeishuUnionId();
        result = result * 59 + ($feishuUnionId == null ? 43 : $feishuUnionId.hashCode());
        String $feishuUserid = this.getFeishuUserid();
        result = result * 59 + ($feishuUserid == null ? 43 : $feishuUserid.hashCode());
        String $wecomUserid = this.getWecomUserid();
        result = result * 59 + ($wecomUserid == null ? 43 : $wecomUserid.hashCode());
        return result;
    }
}

