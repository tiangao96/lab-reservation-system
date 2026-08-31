/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.security.crypto.RsaCryptoProperties
 *  lombok.Generated
 *  org.springframework.boot.context.properties.ConfigurationProperties
 *  org.springframework.context.annotation.Configuration
 */
package com.lab.common.security.crypto;

import lombok.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="app.crypto.rsa")
public class RsaCryptoProperties {
    private boolean enabled = false;
    private String publicKey;
    private String privateKey;

    @Generated
    public RsaCryptoProperties() {
    }

    @Generated
    public boolean isEnabled() {
        return this.enabled;
    }

    @Generated
    public String getPublicKey() {
        return this.publicKey;
    }

    @Generated
    public String getPrivateKey() {
        return this.privateKey;
    }

    @Generated
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Generated
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @Generated
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RsaCryptoProperties)) {
            return false;
        }
        RsaCryptoProperties other = (RsaCryptoProperties)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (this.isEnabled() != other.isEnabled()) {
            return false;
        }
        String this$publicKey = this.getPublicKey();
        String other$publicKey = other.getPublicKey();
        if (this$publicKey == null ? other$publicKey != null : !this$publicKey.equals(other$publicKey)) {
            return false;
        }
        String this$privateKey = this.getPrivateKey();
        String other$privateKey = other.getPrivateKey();
        return !(this$privateKey == null ? other$privateKey != null : !this$privateKey.equals(other$privateKey));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RsaCryptoProperties;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isEnabled() ? 79 : 97);
        String $publicKey = this.getPublicKey();
        result = result * 59 + ($publicKey == null ? 43 : $publicKey.hashCode());
        String $privateKey = this.getPrivateKey();
        result = result * 59 + ($privateKey == null ? 43 : $privateKey.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RsaCryptoProperties(enabled=" + this.isEnabled() + ", publicKey=" + this.getPublicKey() + ", privateKey=" + this.getPrivateKey() + ")";
    }
}

