/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.security.UserBrief
 */
package com.lab.common.security;

public record UserBrief(Long userId, String nanoId, String name) {
    private final Long userId;
    private final String nanoId;
    private final String name;

    public UserBrief(Long userId, String nanoId, String name) {
        this.userId = userId;
        this.nanoId = nanoId;
        this.name = name;
    }

    public Long userId() {
        return this.userId;
    }

    public String nanoId() {
        return this.nanoId;
    }

    public String name() {
        return this.name;
    }
}

