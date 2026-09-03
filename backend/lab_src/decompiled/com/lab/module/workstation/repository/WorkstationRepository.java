/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.workstation.entity.Workstation
 *  com.lab.module.workstation.repository.WorkstationRepository
 *  org.springframework.data.jpa.repository.JpaRepository
 *  org.springframework.data.jpa.repository.Query
 *  org.springframework.data.repository.query.Param
 */
package com.lab.module.workstation.repository;

import com.lab.module.workstation.entity.Workstation;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WorkstationRepository
extends JpaRepository<Workstation, Long> {
    public Workstation findByNanoId(String var1);

    public Optional<Workstation> findByLabIdAndCode(Long var1, String var2);

    public List<Workstation> findByLabId(Long var1);

    public List<Workstation> findByCurrentUserId(Long var1);

    public boolean existsByLabId(Long var1);

    public boolean existsByCurrentUserId(Long var1);

    @Query(value="SELECT w.id, w.nano_id, w.code, w.lab_id, l.nano_id, l.name, l.area, l.capacity FROM workstation w LEFT JOIN lab l ON l.id = w.lab_id WHERE w.id = :id", nativeQuery=true)
    public List<Object[]> findWithLabRaw(@Param(value="id") Long var1);
}

