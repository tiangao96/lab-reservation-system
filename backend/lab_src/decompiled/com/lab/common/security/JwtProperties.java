/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.security.JwtProperties
 *  lombok.Generated
 *  org.springframework.boot.context.properties.ConfigurationProperties
 *  org.springframework.context.annotation.Configuration
 */
package com.lab.common.security;

import lombok.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="app.jwt")
public class JwtProperties {
    private String secret;
    private long accessTtlMinutes = 120L;
    private long refreshTtlDays = 7L;
    private String issuer = "lab-rbac";

    @Generated
    public JwtProperties() {
    }

    @Generated
    public String getSecret() {
        return this.secret;
    }

    @Generated
    public long getAccessTtlMinutes() {
        return this.accessTtlMinutes;
    }

    @Generated
    public long getRefreshTtlDays() {
        return this.refreshTtlDays;
    }

    @Generated
    public String getIssuer() {
        return this.issuer;
    }

    @Generated
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Generated
    public void setAccessTtlMinutes(long accessTtlMinutes) {
        this.accessTtlMinutes = accessTtlMinutes;
    }

    @Generated
    public void setRefreshTtlDays(long refreshTtlDays) {
        this.refreshTtlDays = refreshTtlDays;
    }

    @Generated
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof JwtProperties)) {
            return false;
        }
        JwtProperties other = (JwtProperties)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (this.getAccessTtlMinutes() != other.getAccessTtlMinutes()) {
            return false;
        }
        if (this.getRefreshTtlDays() != other.getRefreshTtlDays()) {
            return false;
        }
        String this$secret = this.getSecret();
        String other$secret = other.getSecret();
        if (this$secret == null ? other$secret != null : !this$secret.equals(other$secret)) {
            return false;
        }
        String this$issuer = this.getIssuer();
        String other$issuer = other.getIssuer();
        return !(this$issuer == null ? other$issuer != null : !this$issuer.equals(other$issuer));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof JwtProperties;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $accessTtlMinutes = this.getAccessTtlMinutes();
        result = result * 59 + (int)($accessTtlMinutes >>> 32 ^ $accessTtlMinutes);
        long $refreshTtlDays = this.getRefreshTtlDays();
        result = result * 59 + (int)($refreshTtlDays >>> 32 ^ $refreshTtlDays);
        String $secret = this.getSecret();
        result = result * 59 + ($secret == null ? 43 : $secret.hashCode());
        String $issuer = this.getIssuer();
        result = result * 59 + ($issuer == null ? 43 : $issuer.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "JwtProperties(secret=" + this.getSecret() + ", accessTtlMinutes=" + this.getAccessTtlMinutes() + ", refreshTtlDays=" + this.getRefreshTtlDays() + ", issuer=" + this.getIssuer() + ")";
    }
}

