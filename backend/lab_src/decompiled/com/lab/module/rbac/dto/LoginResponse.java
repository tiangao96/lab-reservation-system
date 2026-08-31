/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.LoginResponse
 *  com.lab.module.rbac.dto.LoginResponse$LoginResponseBuilder
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import com.lab.module.rbac.dto.LoginResponse;
import java.util.Set;
import lombok.Generated;

public class LoginResponse {
    private String nanoId;
    private String username;
    private String accessToken;
    private long expiresIn;
    private String refreshToken;
    private long refreshExpiresIn;
    private String tokenType;
    private Set<String> permissions;
    private Set<String> roles;

    @Generated
    LoginResponse(String nanoId, String username, String accessToken, long expiresIn, String refreshToken, long refreshExpiresIn, String tokenType, Set<String> permissions, Set<String> roles) {
        this.nanoId = nanoId;
        this.username = username;
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.refreshExpiresIn = refreshExpiresIn;
        this.tokenType = tokenType;
        this.permissions = permissions;
        this.roles = roles;
    }

    @Generated
    public static LoginResponseBuilder builder() {
        return new LoginResponseBuilder();
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
    public String getAccessToken() {
        return this.accessToken;
    }

    @Generated
    public long getExpiresIn() {
        return this.expiresIn;
    }

    @Generated
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Generated
    public long getRefreshExpiresIn() {
        return this.refreshExpiresIn;
    }

    @Generated
    public String getTokenType() {
        return this.tokenType;
    }

    @Generated
    public Set<String> getPermissions() {
        return this.permissions;
    }

    @Generated
    public Set<String> getRoles() {
        return this.roles;
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
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Generated
    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Generated
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Generated
    public void setRefreshExpiresIn(long refreshExpiresIn) {
        this.refreshExpiresIn = refreshExpiresIn;
    }

    @Generated
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Generated
    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }

    @Generated
    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LoginResponse)) {
            return false;
        }
        LoginResponse other = (LoginResponse)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (this.getExpiresIn() != other.getExpiresIn()) {
            return false;
        }
        if (this.getRefreshExpiresIn() != other.getRefreshExpiresIn()) {
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
        String this$accessToken = this.getAccessToken();
        String other$accessToken = other.getAccessToken();
        if (this$accessToken == null ? other$accessToken != null : !this$accessToken.equals(other$accessToken)) {
            return false;
        }
        String this$refreshToken = this.getRefreshToken();
        String other$refreshToken = other.getRefreshToken();
        if (this$refreshToken == null ? other$refreshToken != null : !this$refreshToken.equals(other$refreshToken)) {
            return false;
        }
        String this$tokenType = this.getTokenType();
        String other$tokenType = other.getTokenType();
        if (this$tokenType == null ? other$tokenType != null : !this$tokenType.equals(other$tokenType)) {
            return false;
        }
        Set this$permissions = this.getPermissions();
        Set other$permissions = other.getPermissions();
        if (this$permissions == null ? other$permissions != null : !((Object)this$permissions).equals(other$permissions)) {
            return false;
        }
        Set this$roles = this.getRoles();
        Set other$roles = other.getRoles();
        return !(this$roles == null ? other$roles != null : !((Object)this$roles).equals(other$roles));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LoginResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $expiresIn = this.getExpiresIn();
        result = result * 59 + (int)($expiresIn >>> 32 ^ $expiresIn);
        long $refreshExpiresIn = this.getRefreshExpiresIn();
        result = result * 59 + (int)($refreshExpiresIn >>> 32 ^ $refreshExpiresIn);
        String $nanoId = this.getNanoId();
        result = result * 59 + ($nanoId == null ? 43 : $nanoId.hashCode());
        String $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        String $accessToken = this.getAccessToken();
        result = result * 59 + ($accessToken == null ? 43 : $accessToken.hashCode());
        String $refreshToken = this.getRefreshToken();
        result = result * 59 + ($refreshToken == null ? 43 : $refreshToken.hashCode());
        String $tokenType = this.getTokenType();
        result = result * 59 + ($tokenType == null ? 43 : $tokenType.hashCode());
        Set $permissions = this.getPermissions();
        result = result * 59 + ($permissions == null ? 43 : ((Object)$permissions).hashCode());
        Set $roles = this.getRoles();
        result = result * 59 + ($roles == null ? 43 : ((Object)$roles).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LoginResponse(nanoId=" + this.getNanoId() + ", username=" + this.getUsername() + ", accessToken=" + this.getAccessToken() + ", expiresIn=" + this.getExpiresIn() + ", refreshToken=" + this.getRefreshToken() + ", refreshExpiresIn=" + this.getRefreshExpiresIn() + ", tokenType=" + this.getTokenType() + ", permissions=" + String.valueOf(this.getPermissions()) + ", roles=" + String.valueOf(this.getRoles()) + ")";
    }
}

