/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.ChangeDeptRequest
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import lombok.Generated;

public class ChangeDeptRequest {
    private String deptNanoId;

    @Generated
    public ChangeDeptRequest() {
    }

    @Generated
    public String getDeptNanoId() {
        return this.deptNanoId;
    }

    @Generated
    public void setDeptNanoId(String deptNanoId) {
        this.deptNanoId = deptNanoId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ChangeDeptRequest)) {
            return false;
        }
        ChangeDeptRequest other = (ChangeDeptRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$deptNanoId = this.getDeptNanoId();
        String other$deptNanoId = other.getDeptNanoId();
        return !(this$deptNanoId == null ? other$deptNanoId != null : !this$deptNanoId.equals(other$deptNanoId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ChangeDeptRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $deptNanoId = this.getDeptNanoId();
        result = result * 59 + ($deptNanoId == null ? 43 : $deptNanoId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ChangeDeptRequest(deptNanoId=" + this.getDeptNanoId() + ")";
    }
}

