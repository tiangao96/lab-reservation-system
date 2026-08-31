/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.RentalItemVo
 *  com.lab.module.workstation.dto.RentalRequestVo
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import com.lab.module.workstation.dto.RentalItemVo;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Generated;

public class RentalRequestVo {
    private String nanoId;
    private String requesterMentorGroupNanoId;
    private String requesterMentorGroupName;
    private String labNanoId;
    private String labName;
    private String startMonth;
    private String endMonth;
    private BigDecimal workstationArea;
    private Integer monthCount;
    private Integer workstationCount;
    private String status;
    private String reason;
    private String approverUserNanoId;
    private String approverUserName;
    private String rejectReason;
    private LocalDateTime approvedAt;
    private LocalDateTime sysCreateDatetime;
    private List<String> workstationNanoIds;
    private List<RentalItemVo> workstations;

    @Generated
    public RentalRequestVo() {
    }

    @Generated
    public String getNanoId() {
        return this.nanoId;
    }

    @Generated
    public String getRequesterMentorGroupNanoId() {
        return this.requesterMentorGroupNanoId;
    }

    @Generated
    public String getRequesterMentorGroupName() {
        return this.requesterMentorGroupName;
    }

    @Generated
    public String getLabNanoId() {
        return this.labNanoId;
    }

    @Generated
    public String getLabName() {
        return this.labName;
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
    public BigDecimal getWorkstationArea() {
        return this.workstationArea;
    }

    @Generated
    public Integer getMonthCount() {
        return this.monthCount;
    }

    @Generated
    public Integer getWorkstationCount() {
        return this.workstationCount;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public String getReason() {
        return this.reason;
    }

    @Generated
    public String getApproverUserNanoId() {
        return this.approverUserNanoId;
    }

    @Generated
    public String getApproverUserName() {
        return this.approverUserName;
    }

    @Generated
    public String getRejectReason() {
        return this.rejectReason;
    }

    @Generated
    public LocalDateTime getApprovedAt() {
        return this.approvedAt;
    }

    @Generated
    public LocalDateTime getSysCreateDatetime() {
        return this.sysCreateDatetime;
    }

    @Generated
    public List<String> getWorkstationNanoIds() {
        return this.workstationNanoIds;
    }

    @Generated
    public List<RentalItemVo> getWorkstations() {
        return this.workstations;
    }

    @Generated
    public void setNanoId(String nanoId) {
        this.nanoId = nanoId;
    }

    @Generated
    public void setRequesterMentorGroupNanoId(String requesterMentorGroupNanoId) {
        this.requesterMentorGroupNanoId = requesterMentorGroupNanoId;
    }

    @Generated
    public void setRequesterMentorGroupName(String requesterMentorGroupName) {
        this.requesterMentorGroupName = requesterMentorGroupName;
    }

    @Generated
    public void setLabNanoId(String labNanoId) {
        this.labNanoId = labNanoId;
    }

    @Generated
    public void setLabName(String labName) {
        this.labName = labName;
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
    public void setWorkstationArea(BigDecimal workstationArea) {
        this.workstationArea = workstationArea;
    }

    @Generated
    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    @Generated
    public void setWorkstationCount(Integer workstationCount) {
        this.workstationCount = workstationCount;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Generated
    public void setApproverUserNanoId(String approverUserNanoId) {
        this.approverUserNanoId = approverUserNanoId;
    }

    @Generated
    public void setApproverUserName(String approverUserName) {
        this.approverUserName = approverUserName;
    }

    @Generated
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    @Generated
    public void setApprovedAt(LocalDateTime approvedAt) {
        this.approvedAt = approvedAt;
    }

    @Generated
    public void setSysCreateDatetime(LocalDateTime sysCreateDatetime) {
        this.sysCreateDatetime = sysCreateDatetime;
    }

    @Generated
    public void setWorkstationNanoIds(List<String> workstationNanoIds) {
        this.workstationNanoIds = workstationNanoIds;
    }

    @Generated
    public void setWorkstations(List<RentalItemVo> workstations) {
        this.workstations = workstations;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RentalRequestVo)) {
            return false;
        }
        RentalRequestVo other = (RentalRequestVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Integer this$monthCount = this.getMonthCount();
        Integer other$monthCount = other.getMonthCount();
        if (this$monthCount == null ? other$monthCount != null : !((Object)this$monthCount).equals(other$monthCount)) {
            return false;
        }
        Integer this$workstationCount = this.getWorkstationCount();
        Integer other$workstationCount = other.getWorkstationCount();
        if (this$workstationCount == null ? other$workstationCount != null : !((Object)this$workstationCount).equals(other$workstationCount)) {
            return false;
        }
        String this$nanoId = this.getNanoId();
        String other$nanoId = other.getNanoId();
        if (this$nanoId == null ? other$nanoId != null : !this$nanoId.equals(other$nanoId)) {
            return false;
        }
        String this$requesterMentorGroupNanoId = this.getRequesterMentorGroupNanoId();
        String other$requesterMentorGroupNanoId = other.getRequesterMentorGroupNanoId();
        if (this$requesterMentorGroupNanoId == null ? other$requesterMentorGroupNanoId != null : !this$requesterMentorGroupNanoId.equals(other$requesterMentorGroupNanoId)) {
            return false;
        }
        String this$requesterMentorGroupName = this.getRequesterMentorGroupName();
        String other$requesterMentorGroupName = other.getRequesterMentorGroupName();
        if (this$requesterMentorGroupName == null ? other$requesterMentorGroupName != null : !this$requesterMentorGroupName.equals(other$requesterMentorGroupName)) {
            return false;
        }
        String this$labNanoId = this.getLabNanoId();
        String other$labNanoId = other.getLabNanoId();
        if (this$labNanoId == null ? other$labNanoId != null : !this$labNanoId.equals(other$labNanoId)) {
            return false;
        }
        String this$labName = this.getLabName();
        String other$labName = other.getLabName();
        if (this$labName == null ? other$labName != null : !this$labName.equals(other$labName)) {
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
        BigDecimal this$workstationArea = this.getWorkstationArea();
        BigDecimal other$workstationArea = other.getWorkstationArea();
        if (this$workstationArea == null ? other$workstationArea != null : !((Object)this$workstationArea).equals(other$workstationArea)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$reason = this.getReason();
        String other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) {
            return false;
        }
        String this$approverUserNanoId = this.getApproverUserNanoId();
        String other$approverUserNanoId = other.getApproverUserNanoId();
        if (this$approverUserNanoId == null ? other$approverUserNanoId != null : !this$approverUserNanoId.equals(other$approverUserNanoId)) {
            return false;
        }
        String this$approverUserName = this.getApproverUserName();
        String other$approverUserName = other.getApproverUserName();
        if (this$approverUserName == null ? other$approverUserName != null : !this$approverUserName.equals(other$approverUserName)) {
            return false;
        }
        String this$rejectReason = this.getRejectReason();
        String other$rejectReason = other.getRejectReason();
        if (this$rejectReason == null ? other$rejectReason != null : !this$rejectReason.equals(other$rejectReason)) {
            return false;
        }
        LocalDateTime this$approvedAt = this.getApprovedAt();
        LocalDateTime other$approvedAt = other.getApprovedAt();
        if (this$approvedAt == null ? other$approvedAt != null : !((Object)this$approvedAt).equals(other$approvedAt)) {
            return false;
        }
        LocalDateTime this$sysCreateDatetime = this.getSysCreateDatetime();
        LocalDateTime other$sysCreateDatetime = other.getSysCreateDatetime();
        if (this$sysCreateDatetime == null ? other$sysCreateDatetime != null : !((Object)this$sysCreateDatetime).equals(other$sysCreateDatetime)) {
            return false;
        }
        List this$workstationNanoIds = this.getWorkstationNanoIds();
        List other$workstationNanoIds = other.getWorkstationNanoIds();
        if (this$workstationNanoIds == null ? other$workstationNanoIds != null : !((Object)this$workstationNanoIds).equals(other$workstationNanoIds)) {
            return false;
        }
        List this$workstations = this.getWorkstations();
        List other$workstations = other.getWorkstations();
        return !(this$workstations == null ? other$workstations != null : !((Object)this$workstations).equals(other$workstations));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof RentalRequestVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $monthCount = this.getMonthCount();
        result = result * 59 + ($monthCount == null ? 43 : ((Object)$monthCount).hashCode());
        Integer $workstationCount = this.getWorkstationCount();
        result = result * 59 + ($workstationCount == null ? 43 : ((Object)$workstationCount).hashCode());
        String $nanoId = this.getNanoId();
        result = result * 59 + ($nanoId == null ? 43 : $nanoId.hashCode());
        String $requesterMentorGroupNanoId = this.getRequesterMentorGroupNanoId();
        result = result * 59 + ($requesterMentorGroupNanoId == null ? 43 : $requesterMentorGroupNanoId.hashCode());
        String $requesterMentorGroupName = this.getRequesterMentorGroupName();
        result = result * 59 + ($requesterMentorGroupName == null ? 43 : $requesterMentorGroupName.hashCode());
        String $labNanoId = this.getLabNanoId();
        result = result * 59 + ($labNanoId == null ? 43 : $labNanoId.hashCode());
        String $labName = this.getLabName();
        result = result * 59 + ($labName == null ? 43 : $labName.hashCode());
        String $startMonth = this.getStartMonth();
        result = result * 59 + ($startMonth == null ? 43 : $startMonth.hashCode());
        String $endMonth = this.getEndMonth();
        result = result * 59 + ($endMonth == null ? 43 : $endMonth.hashCode());
        BigDecimal $workstationArea = this.getWorkstationArea();
        result = result * 59 + ($workstationArea == null ? 43 : ((Object)$workstationArea).hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $reason = this.getReason();
        result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
        String $approverUserNanoId = this.getApproverUserNanoId();
        result = result * 59 + ($approverUserNanoId == null ? 43 : $approverUserNanoId.hashCode());
        String $approverUserName = this.getApproverUserName();
        result = result * 59 + ($approverUserName == null ? 43 : $approverUserName.hashCode());
        String $rejectReason = this.getRejectReason();
        result = result * 59 + ($rejectReason == null ? 43 : $rejectReason.hashCode());
        LocalDateTime $approvedAt = this.getApprovedAt();
        result = result * 59 + ($approvedAt == null ? 43 : ((Object)$approvedAt).hashCode());
        LocalDateTime $sysCreateDatetime = this.getSysCreateDatetime();
        result = result * 59 + ($sysCreateDatetime == null ? 43 : ((Object)$sysCreateDatetime).hashCode());
        List $workstationNanoIds = this.getWorkstationNanoIds();
        result = result * 59 + ($workstationNanoIds == null ? 43 : ((Object)$workstationNanoIds).hashCode());
        List $workstations = this.getWorkstations();
        result = result * 59 + ($workstations == null ? 43 : ((Object)$workstations).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "RentalRequestVo(nanoId=" + this.getNanoId() + ", requesterMentorGroupNanoId=" + this.getRequesterMentorGroupNanoId() + ", requesterMentorGroupName=" + this.getRequesterMentorGroupName() + ", labNanoId=" + this.getLabNanoId() + ", labName=" + this.getLabName() + ", startMonth=" + this.getStartMonth() + ", endMonth=" + this.getEndMonth() + ", workstationArea=" + String.valueOf(this.getWorkstationArea()) + ", monthCount=" + this.getMonthCount() + ", workstationCount=" + this.getWorkstationCount() + ", status=" + this.getStatus() + ", reason=" + this.getReason() + ", approverUserNanoId=" + this.getApproverUserNanoId() + ", approverUserName=" + this.getApproverUserName() + ", rejectReason=" + this.getRejectReason() + ", approvedAt=" + String.valueOf(this.getApprovedAt()) + ", sysCreateDatetime=" + String.valueOf(this.getSysCreateDatetime()) + ", workstationNanoIds=" + String.valueOf(this.getWorkstationNanoIds()) + ", workstations=" + String.valueOf(this.getWorkstations()) + ")";
    }
}

