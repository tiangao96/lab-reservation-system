/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.entity.WorkstationStatus
 *  com.lab.module.workstation.entity.WorkstationStatus$1
 */
package com.lab.module.workstation.entity;

import com.lab.module.workstation.entity.WorkstationStatus;

public enum WorkstationStatus {
    IDLE,
    PRE_RESERVED,
    OCCUPIED,
    MAINTENANCE,
    DISABLED;


    public boolean canReserve() {
        return this == IDLE;
    }

    public boolean canSeatOccupy() {
        return this == PRE_RESERVED;
    }

    public boolean canManageTo(WorkstationStatus target) {
        return switch (1.$SwitchMap$com$lab$module$workstation$entity$WorkstationStatus[this.ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1, 2 -> {
                if (target == MAINTENANCE || target == DISABLED) {
                    yield true;
                }
                yield false;
            }
            case 3 -> {
                if (target == IDLE || target == MAINTENANCE || target == DISABLED) {
                    yield true;
                }
                yield false;
            }
            case 4, 5 -> target == IDLE || target == MAINTENANCE || target == DISABLED;
        };
    }
}

