/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.dto.AssignMenusRequest
 *  jakarta.validation.constraints.NotNull
 *  lombok.Generated
 */
package com.lab.module.rbac.dto;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.Generated;

public class AssignMenusRequest {
    @NotNull(message="\u83dc\u5355\u5217\u8868\u4e0d\u80fd\u4e3a null")
    private @NotNull(message="\u83dc\u5355\u5217\u8868\u4e0d\u80fd\u4e3a null") List<String> menuNanoIds;

    @Generated
    public AssignMenusRequest() {
    }

    @Generated
    public List<String> getMenuNanoIds() {
        return this.menuNanoIds;
    }

    @Generated
    public void setMenuNanoIds(List<String> menuNanoIds) {
        this.menuNanoIds = menuNanoIds;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AssignMenusRequest)) {
            return false;
        }
        AssignMenusRequest other = (AssignMenusRequest)o;
        if (!other.canEqual((Object)this)) {
            return false;
        }
        List this$menuNanoIds = this.getMenuNanoIds();
        List other$menuNanoIds = other.getMenuNanoIds();
        return !(this$menuNanoIds == null ? other$menuNanoIds != null : !((Object)this$menuNanoIds).equals(other$menuNanoIds));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof AssignMenusRequest;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List $menuNanoIds = this.getMenuNanoIds();
        result = result * 59 + ($menuNanoIds == null ? 43 : ((Object)$menuNanoIds).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "AssignMenusRequest(menuNanoIds=" + String.valueOf(this.getMenuNanoIds()) + ")";
    }
}

