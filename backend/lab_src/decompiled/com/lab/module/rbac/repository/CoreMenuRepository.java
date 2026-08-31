/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.module.rbac.entity.CoreMenu
 *  com.lab.module.rbac.repository.CoreMenuRepository
 *  org.springframework.data.jpa.repository.JpaRepository
 */
package com.lab.module.rbac.repository;

import com.lab.module.rbac.entity.CoreMenu;
import java.util.Collection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoreMenuRepository
extends JpaRepository<CoreMenu, Long> {
    public List<CoreMenu> findAllByNanoIdIn(Collection<String> var1);

    public CoreMenu findByNanoId(String var1);

    public boolean existsByParentId(Long var1);
}

