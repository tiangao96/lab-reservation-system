/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.SeatRequest
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Generated;

public class SeatRequest {
    @NotBlank(message="\u88ab\u5360\u9886\u5b66\u751f\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u88ab\u5360\u9886\u5b66\u751f\u4e0d\u80fd\u4e3a\u7a7a") String userNanoId;
    private String startMonth;

    @Generated
    public SeatRequest() {
    }

    @Generated
    public String getUserNanoId() {
        return this.userNanoId;
    }

    @Generated
    public String getStartMonth() {
        return this.startMonth;
    }

    @Generated
    public void setUserNanoId(String userNanoId) {
        this.userNanoId = userNanoId;
    }

    @Generated
    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SeatRequest)) {
            return false;
        }
        SeatRequest other = (SeatRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$userNanoId = this.getUserNanoId();
        String other$userNanoId = other.getUserNanoId();
        if (this$userNanoId == null ? other$userNanoId != null : !this$userNanoId.equals(other$userNanoId)) {
            return false;
        }
        String this$startMonth = this.getStartMonth();
        String other$startMonth = other.getStartMonth();
        return !(this$startMonth == null ? other$startMonth != null : !this$startMonth.equals(other$startMonth));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SeatRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $userNanoId = this.getUserNanoId();
        result = result * 59 + ($userNanoId == null ? 43 : $userNanoId.hashCode());
        String $startMonth = this.getStartMonth();
        result = result * 59 + ($startMonth == null ? 43 : $startMonth.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SeatRequest(userNanoId=" + this.getUserNanoId() + ", startMonth=" + this.getStartMonth() + ")";
    }
}

