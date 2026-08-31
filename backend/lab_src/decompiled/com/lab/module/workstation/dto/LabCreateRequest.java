/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.LabCreateRequest
 *  jakarta.validation.constraints.NotBlank
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import lombok.Generated;

public class LabCreateRequest {
    @NotBlank(message="\u5b9e\u9a8c\u5ba4\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a")
    private @NotBlank(message="\u5b9e\u9a8c\u5ba4\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a") String name;
    private String code;
    private String location;
    private Integer capacity;
    private String status;
    private Long managerId;
    private Long mentorGroupId;
    private String deptNanoId;
    private String description;
    private BigDecimal area;
    private Integer canvasWidth;
    private Integer canvasHeight;

    @Generated
    public LabCreateRequest() {
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getCode() {
        return this.code;
    }

    @Generated
    public String getLocation() {
        return this.location;
    }

    @Generated
    public Integer getCapacity() {
        return this.capacity;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public Long getManagerId() {
        return this.managerId;
    }

    @Generated
    public Long getMentorGroupId() {
        return this.mentorGroupId;
    }

    @Generated
    public String getDeptNanoId() {
        return this.deptNanoId;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public BigDecimal getArea() {
        return this.area;
    }

    @Generated
    public Integer getCanvasWidth() {
        return this.canvasWidth;
    }

    @Generated
    public Integer getCanvasHeight() {
        return this.canvasHeight;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public void setCode(String code) {
        this.code = code;
    }

    @Generated
    public void setLocation(String location) {
        this.location = location;
    }

    @Generated
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    @Generated
    public void setMentorGroupId(Long mentorGroupId) {
        this.mentorGroupId = mentorGroupId;
    }

    @Generated
    public void setDeptNanoId(String deptNanoId) {
        this.deptNanoId = deptNanoId;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    @Generated
    public void setCanvasWidth(Integer canvasWidth) {
        this.canvasWidth = canvasWidth;
    }

    @Generated
    public void setCanvasHeight(Integer canvasHeight) {
        this.canvasHeight = canvasHeight;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LabCreateRequest)) {
            return false;
        }
        LabCreateRequest other = (LabCreateRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Integer this$capacity = this.getCapacity();
        Integer other$capacity = other.getCapacity();
        if (this$capacity == null ? other$capacity != null : !((Object)this$capacity).equals(other$capacity)) {
            return false;
        }
        Long this$managerId = this.getManagerId();
        Long other$managerId = other.getManagerId();
        if (this$managerId == null ? other$managerId != null : !((Object)this$managerId).equals(other$managerId)) {
            return false;
        }
        Long this$mentorGroupId = this.getMentorGroupId();
        Long other$mentorGroupId = other.getMentorGroupId();
        if (this$mentorGroupId == null ? other$mentorGroupId != null : !((Object)this$mentorGroupId).equals(other$mentorGroupId)) {
            return false;
        }
        Integer this$canvasWidth = this.getCanvasWidth();
        Integer other$canvasWidth = other.getCanvasWidth();
        if (this$canvasWidth == null ? other$canvasWidth != null : !((Object)this$canvasWidth).equals(other$canvasWidth)) {
            return false;
        }
        Integer this$canvasHeight = this.getCanvasHeight();
        Integer other$canvasHeight = other.getCanvasHeight();
        if (this$canvasHeight == null ? other$canvasHeight != null : !((Object)this$canvasHeight).equals(other$canvasHeight)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$location = this.getLocation();
        String other$location = other.getLocation();
        if (this$location == null ? other$location != null : !this$location.equals(other$location)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$deptNanoId = this.getDeptNanoId();
        String other$deptNanoId = other.getDeptNanoId();
        if (this$deptNanoId == null ? other$deptNanoId != null : !this$deptNanoId.equals(other$deptNanoId)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        BigDecimal this$area = this.getArea();
        BigDecimal other$area = other.getArea();
        return !(this$area == null ? other$area != null : !((Object)this$area).equals(other$area));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LabCreateRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $capacity = this.getCapacity();
        result = result * 59 + ($capacity == null ? 43 : ((Object)$capacity).hashCode());
        Long $managerId = this.getManagerId();
        result = result * 59 + ($managerId == null ? 43 : ((Object)$managerId).hashCode());
        Long $mentorGroupId = this.getMentorGroupId();
        result = result * 59 + ($mentorGroupId == null ? 43 : ((Object)$mentorGroupId).hashCode());
        Integer $canvasWidth = this.getCanvasWidth();
        result = result * 59 + ($canvasWidth == null ? 43 : ((Object)$canvasWidth).hashCode());
        Integer $canvasHeight = this.getCanvasHeight();
        result = result * 59 + ($canvasHeight == null ? 43 : ((Object)$canvasHeight).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $location = this.getLocation();
        result = result * 59 + ($location == null ? 43 : $location.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $deptNanoId = this.getDeptNanoId();
        result = result * 59 + ($deptNanoId == null ? 43 : $deptNanoId.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        BigDecimal $area = this.getArea();
        result = result * 59 + ($area == null ? 43 : ((Object)$area).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LabCreateRequest(name=" + this.getName() + ", code=" + this.getCode() + ", location=" + this.getLocation() + ", capacity=" + this.getCapacity() + ", status=" + this.getStatus() + ", managerId=" + this.getManagerId() + ", mentorGroupId=" + this.getMentorGroupId() + ", deptNanoId=" + this.getDeptNanoId() + ", description=" + this.getDescription() + ", area=" + String.valueOf(this.getArea()) + ", canvasWidth=" + this.getCanvasWidth() + ", canvasHeight=" + this.getCanvasHeight() + ")";
    }
}

