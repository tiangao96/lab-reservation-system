/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  com.lab.module.workstation.dto.WorkstationVo
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Generated;

public class WorkstationVo {
    private String nanoId;
    private String code;
    private String labNanoId;
    private String status;
    private String monthStatus;
    private String type;
    private LocalDateTime occupiedAt;
    private String currentUserNanoId;
    private String currentUserName;
    private String description;
    private String occupantMentorGroupName;
    private String reservedStartMonth;
    private String reservedEndMonth;
    private Boolean rentable;
    private String unrentableReason;
    private Integer posX;
    private Integer posY;
    private Integer width;
    private Integer height;
    @JsonProperty(value="zIndex")
    private Integer zIndex;
    private Integer rotation;

    @Generated
    public WorkstationVo() {
    }

    @Generated
    public String getNanoId() {
        return this.nanoId;
    }

    @Generated
    public String getCode() {
        return this.code;
    }

    @Generated
    public String getLabNanoId() {
        return this.labNanoId;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public String getMonthStatus() {
        return this.monthStatus;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public LocalDateTime getOccupiedAt() {
        return this.occupiedAt;
    }

    @Generated
    public String getCurrentUserNanoId() {
        return this.currentUserNanoId;
    }

    @Generated
    public String getCurrentUserName() {
        return this.currentUserName;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String getOccupantMentorGroupName() {
        return this.occupantMentorGroupName;
    }

    @Generated
    public String getReservedStartMonth() {
        return this.reservedStartMonth;
    }

    @Generated
    public String getReservedEndMonth() {
        return this.reservedEndMonth;
    }

    @Generated
    public Boolean getRentable() {
        return this.rentable;
    }

    @Generated
    public String getUnrentableReason() {
        return this.unrentableReason;
    }

    @Generated
    public Integer getPosX() {
        return this.posX;
    }

    @Generated
    public Integer getPosY() {
        return this.posY;
    }

    @Generated
    public Integer getWidth() {
        return this.width;
    }

    @Generated
    public Integer getHeight() {
        return this.height;
    }

    @Generated
    public Integer getZIndex() {
        return this.zIndex;
    }

    @Generated
    public Integer getRotation() {
        return this.rotation;
    }

    @Generated
    public void setNanoId(String nanoId) {
        this.nanoId = nanoId;
    }

    @Generated
    public void setCode(String code) {
        this.code = code;
    }

    @Generated
    public void setLabNanoId(String labNanoId) {
        this.labNanoId = labNanoId;
    }

    @Generated
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated
    public void setMonthStatus(String monthStatus) {
        this.monthStatus = monthStatus;
    }

    @Generated
    public void setType(String type) {
        this.type = type;
    }

    @Generated
    public void setOccupiedAt(LocalDateTime occupiedAt) {
        this.occupiedAt = occupiedAt;
    }

    @Generated
    public void setCurrentUserNanoId(String currentUserNanoId) {
        this.currentUserNanoId = currentUserNanoId;
    }

    @Generated
    public void setCurrentUserName(String currentUserName) {
        this.currentUserName = currentUserName;
    }

    @Generated
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated
    public void setOccupantMentorGroupName(String occupantMentorGroupName) {
        this.occupantMentorGroupName = occupantMentorGroupName;
    }

    @Generated
    public void setReservedStartMonth(String reservedStartMonth) {
        this.reservedStartMonth = reservedStartMonth;
    }

    @Generated
    public void setReservedEndMonth(String reservedEndMonth) {
        this.reservedEndMonth = reservedEndMonth;
    }

    @Generated
    public void setRentable(Boolean rentable) {
        this.rentable = rentable;
    }

    @Generated
    public void setUnrentableReason(String unrentableReason) {
        this.unrentableReason = unrentableReason;
    }

    @Generated
    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    @Generated
    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    @Generated
    public void setWidth(Integer width) {
        this.width = width;
    }

    @Generated
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty(value="zIndex")
    @Generated
    public void setZIndex(Integer zIndex) {
        this.zIndex = zIndex;
    }

    @Generated
    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WorkstationVo)) {
            return false;
        }
        WorkstationVo other = (WorkstationVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        Boolean this$rentable = this.getRentable();
        Boolean other$rentable = other.getRentable();
        if (this$rentable == null ? other$rentable != null : !((Object)this$rentable).equals(other$rentable)) {
            return false;
        }
        Integer this$posX = this.getPosX();
        Integer other$posX = other.getPosX();
        if (this$posX == null ? other$posX != null : !((Object)this$posX).equals(other$posX)) {
            return false;
        }
        Integer this$posY = this.getPosY();
        Integer other$posY = other.getPosY();
        if (this$posY == null ? other$posY != null : !((Object)this$posY).equals(other$posY)) {
            return false;
        }
        Integer this$width = this.getWidth();
        Integer other$width = other.getWidth();
        if (this$width == null ? other$width != null : !((Object)this$width).equals(other$width)) {
            return false;
        }
        Integer this$height = this.getHeight();
        Integer other$height = other.getHeight();
        if (this$height == null ? other$height != null : !((Object)this$height).equals(other$height)) {
            return false;
        }
        Integer this$zIndex = this.getZIndex();
        Integer other$zIndex = other.getZIndex();
        if (this$zIndex == null ? other$zIndex != null : !((Object)this$zIndex).equals(other$zIndex)) {
            return false;
        }
        Integer this$rotation = this.getRotation();
        Integer other$rotation = other.getRotation();
        if (this$rotation == null ? other$rotation != null : !((Object)this$rotation).equals(other$rotation)) {
            return false;
        }
        String this$nanoId = this.getNanoId();
        String other$nanoId = other.getNanoId();
        if (this$nanoId == null ? other$nanoId != null : !this$nanoId.equals(other$nanoId)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$labNanoId = this.getLabNanoId();
        String other$labNanoId = other.getLabNanoId();
        if (this$labNanoId == null ? other$labNanoId != null : !this$labNanoId.equals(other$labNanoId)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$monthStatus = this.getMonthStatus();
        String other$monthStatus = other.getMonthStatus();
        if (this$monthStatus == null ? other$monthStatus != null : !this$monthStatus.equals(other$monthStatus)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        LocalDateTime this$occupiedAt = this.getOccupiedAt();
        LocalDateTime other$occupiedAt = other.getOccupiedAt();
        if (this$occupiedAt == null ? other$occupiedAt != null : !((Object)this$occupiedAt).equals(other$occupiedAt)) {
            return false;
        }
        String this$currentUserNanoId = this.getCurrentUserNanoId();
        String other$currentUserNanoId = other.getCurrentUserNanoId();
        if (this$currentUserNanoId == null ? other$currentUserNanoId != null : !this$currentUserNanoId.equals(other$currentUserNanoId)) {
            return false;
        }
        String this$currentUserName = this.getCurrentUserName();
        String other$currentUserName = other.getCurrentUserName();
        if (this$currentUserName == null ? other$currentUserName != null : !this$currentUserName.equals(other$currentUserName)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$occupantMentorGroupName = this.getOccupantMentorGroupName();
        String other$occupantMentorGroupName = other.getOccupantMentorGroupName();
        if (this$occupantMentorGroupName == null ? other$occupantMentorGroupName != null : !this$occupantMentorGroupName.equals(other$occupantMentorGroupName)) {
            return false;
        }
        String this$reservedStartMonth = this.getReservedStartMonth();
        String other$reservedStartMonth = other.getReservedStartMonth();
        if (this$reservedStartMonth == null ? other$reservedStartMonth != null : !this$reservedStartMonth.equals(other$reservedStartMonth)) {
            return false;
        }
        String this$reservedEndMonth = this.getReservedEndMonth();
        String other$reservedEndMonth = other.getReservedEndMonth();
        if (this$reservedEndMonth == null ? other$reservedEndMonth != null : !this$reservedEndMonth.equals(other$reservedEndMonth)) {
            return false;
        }
        String this$unrentableReason = this.getUnrentableReason();
        String other$unrentableReason = other.getUnrentableReason();
        return !(this$unrentableReason == null ? other$unrentableReason != null : !this$unrentableReason.equals(other$unrentableReason));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof WorkstationVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $rentable = this.getRentable();
        result = result * 59 + ($rentable == null ? 43 : ((Object)$rentable).hashCode());
        Integer $posX = this.getPosX();
        result = result * 59 + ($posX == null ? 43 : ((Object)$posX).hashCode());
        Integer $posY = this.getPosY();
        result = result * 59 + ($posY == null ? 43 : ((Object)$posY).hashCode());
        Integer $width = this.getWidth();
        result = result * 59 + ($width == null ? 43 : ((Object)$width).hashCode());
        Integer $height = this.getHeight();
        result = result * 59 + ($height == null ? 43 : ((Object)$height).hashCode());
        Integer $zIndex = this.getZIndex();
        result = result * 59 + ($zIndex == null ? 43 : ((Object)$zIndex).hashCode());
        Integer $rotation = this.getRotation();
        result = result * 59 + ($rotation == null ? 43 : ((Object)$rotation).hashCode());
        String $nanoId = this.getNanoId();
        result = result * 59 + ($nanoId == null ? 43 : $nanoId.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $labNanoId = this.getLabNanoId();
        result = result * 59 + ($labNanoId == null ? 43 : $labNanoId.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $monthStatus = this.getMonthStatus();
        result = result * 59 + ($monthStatus == null ? 43 : $monthStatus.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        LocalDateTime $occupiedAt = this.getOccupiedAt();
        result = result * 59 + ($occupiedAt == null ? 43 : ((Object)$occupiedAt).hashCode());
        String $currentUserNanoId = this.getCurrentUserNanoId();
        result = result * 59 + ($currentUserNanoId == null ? 43 : $currentUserNanoId.hashCode());
        String $currentUserName = this.getCurrentUserName();
        result = result * 59 + ($currentUserName == null ? 43 : $currentUserName.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $occupantMentorGroupName = this.getOccupantMentorGroupName();
        result = result * 59 + ($occupantMentorGroupName == null ? 43 : $occupantMentorGroupName.hashCode());
        String $reservedStartMonth = this.getReservedStartMonth();
        result = result * 59 + ($reservedStartMonth == null ? 43 : $reservedStartMonth.hashCode());
        String $reservedEndMonth = this.getReservedEndMonth();
        result = result * 59 + ($reservedEndMonth == null ? 43 : $reservedEndMonth.hashCode());
        String $unrentableReason = this.getUnrentableReason();
        result = result * 59 + ($unrentableReason == null ? 43 : $unrentableReason.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "WorkstationVo(nanoId=" + this.getNanoId() + ", code=" + this.getCode() + ", labNanoId=" + this.getLabNanoId() + ", status=" + this.getStatus() + ", monthStatus=" + this.getMonthStatus() + ", type=" + this.getType() + ", occupiedAt=" + String.valueOf(this.getOccupiedAt()) + ", currentUserNanoId=" + this.getCurrentUserNanoId() + ", currentUserName=" + this.getCurrentUserName() + ", description=" + this.getDescription() + ", occupantMentorGroupName=" + this.getOccupantMentorGroupName() + ", reservedStartMonth=" + this.getReservedStartMonth() + ", reservedEndMonth=" + this.getReservedEndMonth() + ", rentable=" + this.getRentable() + ", unrentableReason=" + this.getUnrentableReason() + ", posX=" + this.getPosX() + ", posY=" + this.getPosY() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", zIndex=" + this.getZIndex() + ", rotation=" + this.getRotation() + ")";
    }
}

