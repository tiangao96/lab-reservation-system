/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.util.IpUtils
 *  jakarta.servlet.http.HttpServletRequest
 */
package com.lab.common.util;

import jakarta.servlet.http.HttpServletRequest;

public final class IpUtils {
    private IpUtils() {
    }

    public static String getClientIp(HttpServletRequest req) {
        if (req == null) {
            return null;
        }
        String ip = req.getHeader("X-Forwarded-For");
        if (ip != null && !ip.isBlank()) {
            return ip.split(",")[0].trim();
        }
        ip = req.getHeader("X-Real-IP");
        if (ip != null && !ip.isBlank()) {
            return ip.trim();
        }
        return req.getRemoteAddr();
    }
}

