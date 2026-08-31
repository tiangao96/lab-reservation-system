/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.entity.RentalRequestStatus
 */
package com.lab.module.workstation.entity;

public enum RentalRequestStatus {
    PENDING,
    APPROVED,
    REJECTED,
    CANCELLED;


    public boolean isPending() {
        return this == PENDING;
    }

    public boolean isTerminal() {
        return this != PENDING;
    }
}

