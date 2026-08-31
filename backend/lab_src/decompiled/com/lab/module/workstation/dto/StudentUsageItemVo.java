/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.StudentUsageItemVo
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import java.math.BigDecimal;
import lombok.Generated;

public class StudentUsageItemVo {
    private String studentUserNanoId;
    private String studentUserName;
    private String workstationNanoId;
    private String workstationCode;
    private String labNanoId;
    private String labName;
    private String startMonth;
    private String endMonth;
    private Integer durationMonths;
    private BigDecimal workstationArea;
    private BigDecimal areaMonths;

    @Generated
    public StudentUsageItemVo() {
    }

    @Generated
    public String getStudentUserNanoId() {
        return this.studentUserNanoId;
    }

    @Generated
    public String getStudentUserName() {
        return this.studentUserName;
    }

    @Generated
    public String getWorkstationNanoId() {
        return this.workstationNanoId;
    }

    @Generated
    public String getWorkstationCode() {
        return this.workstationCode;
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
    public Integer getDurationMonths() {
        return this.durationMonths;
    }

    @Generated
    public BigDecimal getWorkstationArea() {
        return this.workstationArea;
    }

    @Generated
    public BigDecimal getAreaMonths() {
        return this.areaMonths;
    }

    @Generated
    public void setStudentUserNanoId(String studentUserNanoId) {
        this.studentUserNanoId = studentUserNanoId;
    }

    @Generated
    public void setStudentUserName(String studentUserName) {
        this.studentUserName = studentUserName;
    }

    @Generated
    public void setWorkstationNanoId(String workstationNanoId) {
        this.workstationNanoId = workstationNanoId;
    }

    @Generated
    public void setWorkstationCode(String workstationCode) {
        this.workstationCode = workstationCode;
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
    public void setDurationMonths(Integer durationMonths) {
        this.durationMonths = durationMonths;
    }

    @Generated
    public void setWorkstationArea(BigDecimal workstationArea) {
        this.workstationArea = workstationArea;
    }

    @Generated
    public void setAreaMonths(BigDecimal areaMonths) {
        this.areaMonths = areaMonths;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof StudentUsageItemVo)) {
            return false;
        }
        StudentUsageItemVo other = (StudentUsageItemVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Integer this$durationMonths = this.getDurationMonths();
        Integer other$durationMonths = other.getDurationMonths();
        if (this$durationMonths == null ? other$durationMonths != null : !((Object)this$durationMonths).equals(other$durationMonths)) {
            return false;
        }
        String this$studentUserNanoId = this.getStudentUserNanoId();
        String other$studentUserNanoId = other.getStudentUserNanoId();
        if (this$studentUserNanoId == null ? other$studentUserNanoId != null : !this$studentUserNanoId.equals(other$studentUserNanoId)) {
            return false;
        }
        String this$studentUserName = this.getStudentUserName();
        String other$studentUserName = other.getStudentUserName();
        if (this$studentUserName == null ? other$studentUserName != null : !this$studentUserName.equals(other$studentUserName)) {
            return false;
        }
        String this$workstationNanoId = this.getWorkstationNanoId();
        String other$workstationNanoId = other.getWorkstationNanoId();
        if (this$workstationNanoId == null ? other$workstationNanoId != null : !this$workstationNanoId.equals(other$workstationNanoId)) {
            return false;
        }
        String this$workstationCode = this.getWorkstationCode();
        String other$workstationCode = other.getWorkstationCode();
        if (this$workstationCode == null ? other$workstationCode != null : !this$workstationCode.equals(other$workstationCode)) {
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
        BigDecimal this$areaMonths = this.getAreaMonths();
        BigDecimal other$areaMonths = other.getAreaMonths();
        return !(this$areaMonths == null ? other$areaMonths != null : !((Object)this$areaMonths).equals(other$areaMonths));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof StudentUsageItemVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $durationMonths = this.getDurationMonths();
        result = result * 59 + ($durationMonths == null ? 43 : ((Object)$durationMonths).hashCode());
        String $studentUserNanoId = this.getStudentUserNanoId();
        result = result * 59 + ($studentUserNanoId == null ? 43 : $studentUserNanoId.hashCode());
        String $studentUserName = this.getStudentUserName();
        result = result * 59 + ($studentUserName == null ? 43 : $studentUserName.hashCode());
        String $workstationNanoId = this.getWorkstationNanoId();
        result = result * 59 + ($workstationNanoId == null ? 43 : $workstationNanoId.hashCode());
        String $workstationCode = this.getWorkstationCode();
        result = result * 59 + ($workstationCode == null ? 43 : $workstationCode.hashCode());
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
        BigDecimal $areaMonths = this.getAreaMonths();
        result = result * 59 + ($areaMonths == null ? 43 : ((Object)$areaMonths).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "StudentUsageItemVo(studentUserNanoId=" + this.getStudentUserNanoId() + ", studentUserName=" + this.getStudentUserName() + ", workstationNanoId=" + this.getWorkstationNanoId() + ", workstationCode=" + this.getWorkstationCode() + ", labNanoId=" + this.getLabNanoId() + ", labName=" + this.getLabName() + ", startMonth=" + this.getStartMonth() + ", endMonth=" + this.getEndMonth() + ", durationMonths=" + this.getDurationMonths() + ", workstationArea=" + String.valueOf(this.getWorkstationArea()) + ", areaMonths=" + String.valueOf(this.getAreaMonths()) + ")";
    }
}

