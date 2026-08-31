/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.UserImportResultVo
 *  com.lab.module.rbac.dto.UserImportResultVo$FailureItem
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import com.lab.module.rbac.dto.UserImportResultVo;
import java.util.List;
import lombok.Generated;

public class UserImportResultVo {
    private int total;
    private int success;
    private int skipped;
    private int failure;
    private List<FailureItem> failures;

    @Generated
    public UserImportResultVo() {
    }

    @Generated
    public int getTotal() {
        return this.total;
    }

    @Generated
    public int getSuccess() {
        return this.success;
    }

    @Generated
    public int getSkipped() {
        return this.skipped;
    }

    @Generated
    public int getFailure() {
        return this.failure;
    }

    @Generated
    public List<FailureItem> getFailures() {
        return this.failures;
    }

    @Generated
    public void setTotal(int total) {
        this.total = total;
    }

    @Generated
    public void setSuccess(int success) {
        this.success = success;
    }

    @Generated
    public void setSkipped(int skipped) {
        this.skipped = skipped;
    }

    @Generated
    public void setFailure(int failure) {
        this.failure = failure;
    }

    @Generated
    public void setFailures(List<FailureItem> failures) {
        this.failures = failures;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserImportResultVo)) {
            return false;
        }
        UserImportResultVo other = (UserImportResultVo)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (this.getTotal() != other.getTotal()) {
            return false;
        }
        if (this.getSuccess() != other.getSuccess()) {
            return false;
        }
        if (this.getSkipped() != other.getSkipped()) {
            return false;
        }
        if (this.getFailure() != other.getFailure()) {
            return false;
        }
        List this$failures = this.getFailures();
        List other$failures = other.getFailures();
        return !(this$failures == null ? other$failures != null : !((Object)this$failures).equals(other$failures));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof UserImportResultVo;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getTotal();
        result = result * 59 + this.getSuccess();
        result = result * 59 + this.getSkipped();
        result = result * 59 + this.getFailure();
        List $failures = this.getFailures();
        result = result * 59 + ($failures == null ? 43 : ((Object)$failures).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "UserImportResultVo(total=" + this.getTotal() + ", success=" + this.getSuccess() + ", skipped=" + this.getSkipped() + ", failure=" + this.getFailure() + ", failures=" + String.valueOf(this.getFailures()) + ")";
    }
}

