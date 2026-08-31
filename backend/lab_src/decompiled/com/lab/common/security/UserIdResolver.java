/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.security.UserBrief
 *  com.lab.common.security.UserIdResolver
 */
package com.lab.common.security;

import com.lab.common.security.UserBrief;
import java.util.List;

public interface UserIdResolver {
    public String resolveNanoId(Long var1);

    public String resolveName(Long var1);

    public Long resolveUserId(String var1);

    public List<UserBrief> listByDept(Long var1);

    public List<UserBrief> listByMentorGroup(Long var1);
}

