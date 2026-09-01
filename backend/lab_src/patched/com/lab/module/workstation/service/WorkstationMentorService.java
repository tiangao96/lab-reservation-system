package com.lab.module.workstation.service;

import com.lab.common.api.ResultCode;
import com.lab.common.exception.BizException;
import com.lab.common.security.MentorGroupResolver;
import com.lab.module.workstation.entity.Workstation;
import com.lab.module.workstation.entity.WorkstationStatus;
import com.lab.module.workstation.repository.WorkstationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WorkstationMentorService {
    private final WorkstationRepository workstationRepository;
    private final MentorGroupResolver mentorGroupResolver;

    public WorkstationMentorService(WorkstationRepository workstationRepository, MentorGroupResolver mentorGroupResolver) {
        this.workstationRepository = workstationRepository;
        this.mentorGroupResolver = mentorGroupResolver;
    }

    @Transactional
    public void setMentorGroup(String nanoId, String mentorGroupNanoId) {
        Workstation ws = this.workstationRepository.findByNanoId(nanoId);
        if (ws == null) {
            throw new BizException(ResultCode.RESOURCE_NOT_FOUND);
        }
        if (ws.getStatus() == WorkstationStatus.OCCUPIED) {
            throw new BizException(ResultCode.BAD_REQUEST, "\u5de5\u4f4d\u5df2\u88ab\u5b66\u751f\u5360\u7528\uff0c\u8bf7\u5148\u91ca\u653e\u518d\u4fee\u6539\u5bfc\u5e08");
        }
        if (mentorGroupNanoId == null || mentorGroupNanoId.isBlank()) {
            ws.setOccupantMentorGroupId(null);
        } else {
            Long groupId = this.mentorGroupResolver.resolveMentorGroupId(mentorGroupNanoId);
            if (groupId == null) {
                throw new BizException(ResultCode.BAD_REQUEST, "\u5bfc\u5e08\u7ec4\u4e0d\u5b58\u5728");
            }
            ws.setOccupantMentorGroupId(groupId);
        }
        this.workstationRepository.save(ws);
    }
}
