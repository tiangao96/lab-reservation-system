/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.security.crypto.RewritableBodyRequestWrapper
 *  jakarta.servlet.ServletInputStream
 *  jakarta.servlet.http.HttpServletRequest
 *  jakarta.servlet.http.HttpServletRequestWrapper
 */
package com.lab.common.security.crypto;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class RewritableBodyRequestWrapper
extends HttpServletRequestWrapper {
    private final byte[] body;

    public RewritableBodyRequestWrapper(HttpServletRequest request, byte[] body) {
        super(request);
        this.body = body;
    }

    public ServletInputStream getInputStream() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader((InputStream)this.getInputStream(), StandardCharsets.UTF_8));
    }

    public int getContentLength() {
        return this.body.length;
    }

    public long getContentLengthLong() {
        return this.body.length;
    }
}

