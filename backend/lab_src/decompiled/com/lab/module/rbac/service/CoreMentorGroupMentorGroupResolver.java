/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.entity.BaseEntity
 *  com.lab.common.security.MentorGroupResolver
 *  com.lab.module.rbac.entity.CoreMentorGroup
 *  com.lab.module.rbac.repository.CoreMentorGroupRepository
 *  com.lab.module.rbac.service.CoreMentorGroupMentorGroupResolver
 *  lombok.Generated
 *  org.springframework.stereotype.Component
 */
package com.lab.module.rbac.service;

import com.lab.common.entity.BaseEntity;
import com.lab.common.security.MentorGroupResolver;
import com.lab.module.rbac.entity.CoreMentorGroup;
import com.lab.module.rbac.repository.CoreMentorGroupRepository;
import lombok.Generated;
import org.springframework.stereotype.Component;

@Component
public class CoreMentorGroupMentorGroupResolver
implements MentorGroupResolver {
    private final CoreMentorGroupRepository mentorGroupRepository;

    public String resolveNanoId(Long mentorGroupId) {
        if (mentorGroupId == null) {
            return null;
        }
        return this.mentorGroupRepository.findById((Object)mentorGroupId).map(BaseEntity::getNanoId).orElse(null);
    }

    public String resolveName(Long mentorGroupId) {
        if (mentorGroupId == null) {
            return null;
        }
        return this.mentorGroupRepository.findById((Object)mentorGroupId).map(CoreMentorGroup::getName).orElse(null);
    }

    public Long resolveMentorGroupId(String nanoId) {
        if (nanoId == null || nanoId.isBlank()) {
            return null;
        }
        CoreMentorGroup g = this.mentorGroupRepository.findByNanoId(nanoId);
        return g != null ? g.getId() : null;
    }

    @Generated
    public CoreMentorGroupMentorGroupResolver(CoreMentorGroupRepository mentorGroupRepository) {
        this.mentorGroupRepository = mentorGroupRepository;
    }
}

