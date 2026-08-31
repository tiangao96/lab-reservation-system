/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.entity.WorkstationType
 */
package com.lab.module.workstation.entity;

public enum WorkstationType {
    SEAT,
    DOOR,
    WINDOW;


    public boolean isOccupiable() {
        return this == SEAT;
    }
}

