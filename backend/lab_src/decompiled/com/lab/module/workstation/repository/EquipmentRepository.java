/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.entity.Equipment
 *  com.lab.module.workstation.repository.EquipmentRepository
 *  org.springframework.data.jpa.repository.JpaRepository
 */
package com.lab.module.workstation.repository;

import com.lab.module.workstation.entity.Equipment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository
extends JpaRepository<Equipment, Long> {
    public Equipment findByNanoId(String var1);

    public List<Equipment> findByLabId(Long var1);

    public boolean existsByLabId(Long var1);
}

