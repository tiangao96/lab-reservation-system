/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.security.SessionStore
 *  lombok.Generated
 *  org.springframework.data.redis.core.StringRedisTemplate
 *  org.springframework.stereotype.Component
 */
package com.lab.common.security;

import java.time.Duration;
import lombok.Generated;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class SessionStore {
    private static final String KEY_PREFIX = "auth:session:";
    private final StringRedisTemplate redis;

    public void create(String jti, Long userId, Duration ttl) {
        this.redis.opsForValue().set((Object)(KEY_PREFIX + jti), (Object)String.valueOf(userId), ttl);
    }

    public boolean exists(String jti) {
        if (jti == null || jti.isEmpty()) {
            return false;
        }
        return Boolean.TRUE.equals(this.redis.hasKey((Object)(KEY_PREFIX + jti)));
    }

    public void revoke(String jti) {
        if (jti == null || jti.isEmpty()) {
            return;
        }
        this.redis.delete((Object)(KEY_PREFIX + jti));
    }

    @Generated
    public SessionStore(StringRedisTemplate redis) {
        this.redis = redis;
    }
}

