/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.ReleaseRequest
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import lombok.Generated;

public class ReleaseRequest {
    private String endMonth;

    @Generated
    public ReleaseRequest() {
    }

    @Generated
    public String getEndMonth() {
        return this.endMonth;
    }

    @Generated
    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ReleaseRequest)) {
            return false;
        }
        ReleaseRequest other = (ReleaseRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$endMonth = this.getEndMonth();
        String other$endMonth = other.getEndMonth();
        return !(this$endMonth == null ? other$endMonth != null : !this$endMonth.equals(other$endMonth));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ReleaseRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $endMonth = this.getEndMonth();
        result = result * 59 + ($endMonth == null ? 43 : $endMonth.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ReleaseRequest(endMonth=" + this.getEndMonth() + ")";
    }
}

