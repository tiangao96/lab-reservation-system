/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.dto.SeatCandidateVo
 *  lombok.Generated
 */
package com.lab.module.workstation.dto;

import lombok.Generated;

public class SeatCandidateVo {
    private String nanoId;
    private String name;

    @Generated
    public SeatCandidateVo() {
    }

    @Generated
    public String getNanoId() {
        return this.nanoId;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public void setNanoId(String nanoId) {
        this.nanoId = nanoId;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SeatCandidateVo)) {
            return false;
        }
        SeatCandidateVo other = (SeatCandidateVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$nanoId = this.getNanoId();
        String other$nanoId = other.getNanoId();
        if (this$nanoId == null ? other$nanoId != null : !this$nanoId.equals(other$nanoId)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SeatCandidateVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $nanoId = this.getNanoId();
        result = result * 59 + ($nanoId == null ? 43 : $nanoId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SeatCandidateVo(nanoId=" + this.getNanoId() + ", name=" + this.getName() + ")";
    }
}

