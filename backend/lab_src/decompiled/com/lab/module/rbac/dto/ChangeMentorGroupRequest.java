/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.ChangeMentorGroupRequest
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import lombok.Generated;

public class ChangeMentorGroupRequest {
    private String mentorGroupNanoId;

    @Generated
    public ChangeMentorGroupRequest() {
    }

    @Generated
    public String getMentorGroupNanoId() {
        return this.mentorGroupNanoId;
    }

    @Generated
    public void setMentorGroupNanoId(String mentorGroupNanoId) {
        this.mentorGroupNanoId = mentorGroupNanoId;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ChangeMentorGroupRequest)) {
            return false;
        }
        ChangeMentorGroupRequest other = (ChangeMentorGroupRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        String this$mentorGroupNanoId = this.getMentorGroupNanoId();
        String other$mentorGroupNanoId = other.getMentorGroupNanoId();
        return !(this$mentorGroupNanoId == null ? other$mentorGroupNanoId != null : !this$mentorGroupNanoId.equals(other$mentorGroupNanoId));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ChangeMentorGroupRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $mentorGroupNanoId = this.getMentorGroupNanoId();
        result = result * 59 + ($mentorGroupNanoId == null ? 43 : $mentorGroupNanoId.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "ChangeMentorGroupRequest(mentorGroupNanoId=" + this.getMentorGroupNanoId() + ")";
    }
}

