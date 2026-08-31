/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.entity.Lab
 *  com.lab.module.workstation.repository.LabRepository
 *  org.springframework.data.jpa.repository.JpaRepository
 */
package com.lab.module.workstation.repository;

import com.lab.module.workstation.entity.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository
extends JpaRepository<Lab, Long> {
    public Lab findByNanoId(String var1);

    public Lab findByCode(String var1);
}

