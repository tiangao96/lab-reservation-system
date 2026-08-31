/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.RentalRequestCreateRequest
 *  jakarta.validation.constraints.NotBlank
 *  jakarta.validation.constraints.NotEmpty
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import lombok.Generated;

public class RentalRequestCreateRequest {
    private String labNanoId;
    @NotEmpty(message="\u81f3\u5c11\u9009\u62e9\u4e00\u4e2a\u5de5\u4f4d")
    private @NotEmpty(message="\u81f3\u5c11\u9009\u62e9\u4e00\u4e2a\u5de5\u4f4d") List<String> workstationNanoIds;
    @NotBlank(message="\u8d77\u59cb\u6708\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u8d77\u59cb\u6708\u4e0d\u80fd\u4e3a\u7a7a") String startMonth;
    @NotBlank(message="\u7ed3\u675f\u6708\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u7ed3\u675f\u6708\u4e0d\u80fd\u4e3a\u7a7a") String endMonth;
    @NotBlank(message="\u7533\u8bf7\u5bfc\u5e08\u7ec4\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u7533\u8bf7\u5bfc\u5e08\u7ec4\u4e0d\u80fd\u4e3a\u7a7a") String mentorGroupNanoId;
    private String reason;

    @Generated
    public RentalRequestCreateRequest() {
    }

    @Generated
    public String getLabNanoId() {
        return this.labNanoId;
    }

    @Generated
    public List<String> getWorkstationNanoIds() {
        return this.workstationNanoIds;
    }

    @Generated
    public String getStartMonth() {
        return this.startMonth;
    }

    @Generated
    public String getEndMonth() {
        return this.endMonth;
    }

    @Generated
    public String getMentorGroupNanoId() {
        return this.mentorGroupNanoId;
    }

    @Generated
    public String getReason() {
        return this.reason;
    }

    @Generated
    public void setLabNanoId(String labNanoId) {
        this.labNanoId = labNanoId;
    }

    @Generated
    public void setWorkstationNanoIds(List<String> workstationNanoIds) {
        this.workstationNanoIds = workstationNanoIds;
    }

    @Generated
    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    @Generated
    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    @Generated
    public void setMentorGroupNanoId(String mentorGroupNanoId) {
        this.mentorGroupNanoId = mentorGroupNanoId;
    }

    @Generated
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RentalRequestCreateRequest)) {
            return false;
        }
        RentalRequestCreateRequest other = (RentalRequestCreateRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$labNanoId = this.getLabNanoId();
        String other$labNanoId = other.getLabNanoId();
        if (this$labNanoId == null ? other$labNanoId != null : !this$labNanoId.equals(other$labNanoId)) {
            return false;
        }
        List this$workstationNanoIds = this.getWorkstationNanoIds();
        List other$workstationNanoIds = other.getWorkstationNanoIds();
        if (this$workstationNanoIds == null ? other$workstationNanoIds != null : !((Object)this$workstationNanoIds).equals(other$workstationNanoIds)) {
            return false;
        }
        String this$startMonth = this.getStartMonth();
        String other$startMonth = other.getStartMonth();
        if (this$startMonth == null ? other$startMonth != null : !this$startMonth.equals(other$startMonth)) {
            return false;
        }
        String this$endMonth = this.getEndMonth();
        String other$endMonth = other.getEndMonth();
        if (this$endMonth == null ? other$endMonth != null : !this$endMonth.equals(other$endMonth)) {
            return false;
        }
        String this$mentorGroupNanoId = this.getMentorGroupNanoId();
        String other$mentorGroupNanoId = other.getMentorGroupNanoId();
        if (this$mentorGroupNanoId == null ? other$mentorGroupNanoId != null : !this$mentorGroupNanoId.equals(other$mentorGroupNanoId)) {
            return false;
        }
        String this$reason = this.getReason();
        String other$reason = other.getReason();
        return !(this$reason == null ? other$reason != null : !this$reason.equals(other$reason));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RentalRequestCreateRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $labNanoId = this.getLabNanoId();
        result = result * 59 + ($labNanoId == null ? 43 : $labNanoId.hashCode());
        List $workstationNanoIds = this.getWorkstationNanoIds();
        result = result * 59 + ($workstationNanoIds == null ? 43 : ((Object)$workstationNanoIds).hashCode());
        String $startMonth = this.getStartMonth();
        result = result * 59 + ($startMonth == null ? 43 : $startMonth.hashCode());
        String $endMonth = this.getEndMonth();
        result = result * 59 + ($endMonth == null ? 43 : $endMonth.hashCode());
        String $mentorGroupNanoId = this.getMentorGroupNanoId();
        result = result * 59 + ($mentorGroupNanoId == null ? 43 : $mentorGroupNanoId.hashCode());
        String $reason = this.getReason();
        result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RentalRequestCreateRequest(labNanoId=" + this.getLabNanoId() + ", workstationNanoIds=" + String.valueOf(this.getWorkstationNanoIds()) + ", startMonth=" + this.getStartMonth() + ", endMonth=" + this.getEndMonth() + ", mentorGroupNanoId=" + this.getMentorGroupNanoId() + ", reason=" + this.getReason() + ")";
    }
}

