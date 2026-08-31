/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.api.ResultCode
 *  com.lab.common.exception.BizException
 *  lombok.Generated
 */
package com.lab.common.exception;

import com.lab.common.api.ResultCode;
import lombok.Generated;

public class BizException
extends RuntimeException {
    private final ResultCode code;

    public BizException(ResultCode code) {
        super(code.getMessage());
        this.code = code;
    }

    public BizException(ResultCode code, String message) {
        super(message);
        this.code = code;
    }

    @Generated
    public ResultCode getCode() {
        return this.code;
    }
}

