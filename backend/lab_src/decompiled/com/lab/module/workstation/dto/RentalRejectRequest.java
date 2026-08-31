/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.RentalRejectRequest
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import lombok.Generated;

public class RentalRejectRequest {
    private String rejectReason;

    @Generated
    public RentalRejectRequest() {
    }

    @Generated
    public String getRejectReason() {
        return this.rejectReason;
    }

    @Generated
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RentalRejectRequest)) {
            return false;
        }
        RentalRejectRequest other = (RentalRejectRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$rejectReason = this.getRejectReason();
        String other$rejectReason = other.getRejectReason();
        return !(this$rejectReason == null ? other$rejectReason != null : !this$rejectReason.equals(other$rejectReason));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RentalRejectRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $rejectReason = this.getRejectReason();
        result = result * 59 + ($rejectReason == null ? 43 : $rejectReason.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RentalRejectRequest(rejectReason=" + this.getRejectReason() + ")";
    }
}

