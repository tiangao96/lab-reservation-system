/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.security.UserPrincipal
 *  com.lab.common.security.UserPrincipal$UserPrincipalBuilder
 *  lombok.Generated
 *  org.springframework.security.core.GrantedAuthority
 *  org.springframework.security.core.userdetails.UserDetails
 */
package com.lab.common.security;

import com.lab.common.security.UserPrincipal;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import lombok.Generated;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal
implements UserDetails {
    private final Long id;
    private final String nanoId;
    private final String username;
    private final Long deptId;
    private final Long mentorGroupId;
    private final Set<String> permissions;
    private final Set<String> roles;
    private final String jti;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.permissions == null || this.permissions.isEmpty()) {
            return Collections.emptySet();
        }
        return this.permissions.stream().map(code -> (GrantedAuthority & Serializable)() -> code).toList();
    }

    public String getPassword() {
        return null;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }

    public boolean hasPermission(String code) {
        return this.permissions != null && this.permissions.contains(code);
    }

    public boolean hasRole(String roleCode) {
        return this.roles != null && this.roles.contains(roleCode);
    }

    @Generated
    UserPrincipal(Long id, String nanoId, String username, Long deptId, Long mentorGroupId, Set<String> permissions, Set<String> roles, String jti) {
        this.id = id;
        this.nanoId = nanoId;
        this.username = username;
        this.deptId = deptId;
        this.mentorGroupId = mentorGroupId;
        this.permissions = permissions;
        this.roles = roles;
        this.jti = jti;
    }

    @Generated
    public static UserPrincipalBuilder builder() {
        return new UserPrincipalBuilder();
    }

    @Generated
    public Long getId() {
        return this.id;
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
    public Long getDeptId() {
        return this.deptId;
    }

    @Generated
    public Long getMentorGroupId() {
        return this.mentorGroupId;
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
    public String getJti() {
        return this.jti;
    }
}

