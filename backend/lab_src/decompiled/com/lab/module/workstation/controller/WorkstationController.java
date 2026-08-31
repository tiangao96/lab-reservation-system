/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.api.Result
 *  com.lab.common.audit.AuditLog
 *  com.lab.module.workstation.controller.WorkstationController
 *  com.lab.module.workstation.dto.MentorGroupStudentUsageVo
 *  com.lab.module.workstation.dto.OccupancyHistoryVo
 *  com.lab.module.workstation.dto.ReleaseRequest
 *  com.lab.module.workstation.dto.RentalRequestCreateRequest
 *  com.lab.module.workstation.dto.SeatCandidateVo
 *  com.lab.module.workstation.dto.SeatRequest
 *  com.lab.module.workstation.dto.WorkstationCreateRequest
 *  com.lab.module.workstation.dto.WorkstationStatusChangeRequest
 *  com.lab.module.workstation.dto.WorkstationVo
 *  com.lab.module.workstation.service.WorkstationRentalRequestService
 *  com.lab.module.workstation.service.WorkstationService
 *  io.swagger.v3.oas.annotations.tags.Tag
 *  jakarta.validation.Valid
 *  lombok.Generated
 *  org.springframework.security.access.prepost.PreAuthorize
 *  org.springframework.web.bind.annotation.DeleteMapping
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.PutMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.lab.module.workstation.controller;

import com.lab.common.api.Result;
import com.lab.common.audit.AuditLog;
import com.lab.module.workstation.dto.MentorGroupStudentUsageVo;
import com.lab.module.workstation.dto.OccupancyHistoryVo;
import com.lab.module.workstation.dto.ReleaseRequest;
import com.lab.module.workstation.dto.RentalRequestCreateRequest;
import com.lab.module.workstation.dto.SeatCandidateVo;
import com.lab.module.workstation.dto.SeatRequest;
import com.lab.module.workstation.dto.WorkstationCreateRequest;
import com.lab.module.workstation.dto.WorkstationStatusChangeRequest;
import com.lab.module.workstation.dto.WorkstationVo;
import com.lab.module.workstation.service.WorkstationRentalRequestService;
import com.lab.module.workstation.service.WorkstationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import lombok.Generated;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="\u5de5\u4f4d")
@RestController
@RequestMapping(value={"/api/workstations"})
public class WorkstationController {
    private final WorkstationService workstationService;
    private final WorkstationRentalRequestService rentalRequestService;

    @GetMapping
    @PreAuthorize(value="@perm.has('workstation:view')")
    public Result<List<WorkstationVo>> list(@RequestParam String labNanoId, @RequestParam(required=false) String month) {
        return Result.ok((Object)this.workstationService.listByLab(labNanoId, month));
    }

    @GetMapping(value={"/{nanoId}"})
    @PreAuthorize(value="@perm.has('workstation:view')")
    public Result<WorkstationVo> get(@PathVariable String nanoId) {
        return Result.ok((Object)this.workstationService.getByNanoId(nanoId));
    }

    @GetMapping(value={"/rent-candidates"})
    @PreAuthorize(value="@perm.hasAny('workstation:rent:apply','workstation:rent:approve')")
    public Result<List<WorkstationVo>> rentCandidates(@RequestParam String labNanoId, @RequestParam String startMonth, @RequestParam String endMonth) {
        return Result.ok((Object)this.workstationService.listRentCandidates(labNanoId, startMonth, endMonth));
    }

    @PostMapping
    @PreAuthorize(value="@perm.has('workstation:manage')")
    @AuditLog(module="workstation", action="create", description="\u65b0\u589e\u5de5\u4f4d")
    public Result<String> create(@RequestBody @Valid WorkstationCreateRequest req) {
        return Result.ok((Object)this.workstationService.create(req));
    }

    @PutMapping(value={"/{nanoId}"})
    @PreAuthorize(value="@perm.has('workstation:manage')")
    @AuditLog(module="workstation", action="update", description="\u4fee\u6539\u5de5\u4f4d")
    public Result<Void> update(@PathVariable String nanoId, @RequestBody @Valid WorkstationCreateRequest req) {
        this.workstationService.update(nanoId, req);
        return Result.ok();
    }

    @DeleteMapping(value={"/{nanoId}"})
    @PreAuthorize(value="@perm.has('workstation:manage')")
    @AuditLog(module="workstation", action="delete", description="\u5220\u9664\u5de5\u4f4d")
    public Result<Void> delete(@PathVariable String nanoId) {
        this.workstationService.delete(nanoId);
        return Result.ok();
    }

    @PostMapping(value={"/{labNanoId}/rent-request"})
    @PreAuthorize(value="@perm.hasAny('workstation:rent:apply','workstation:rent:approve')")
    @AuditLog(module="workstation", action="applyRent", description="\u7533\u8bf7\u5de5\u4f4d")
    public Result<String> applyRent(@PathVariable String labNanoId, @RequestBody @Valid RentalRequestCreateRequest req) {
        return Result.ok((Object)this.rentalRequestService.create(labNanoId, req));
    }

    @PutMapping(value={"/{nanoId}/release"})
    @PreAuthorize(value="@perm.has('workstation:release')")
    @AuditLog(module="workstation", action="release", description="\u91ca\u653e\u5de5\u4f4d")
    public Result<Void> release(@PathVariable String nanoId, @RequestBody(required=false) ReleaseRequest req) {
        this.workstationService.release(nanoId, req != null ? req.getEndMonth() : null);
        return Result.ok();
    }

    @PostMapping(value={"/{nanoId}/seat"})
    @PreAuthorize(value="@perm.has('workstation:seat')")
    @AuditLog(module="workstation", action="seat", description="\u5b66\u751f\u5360\u9886\u5de5\u4f4d")
    public Result<Void> seat(@PathVariable String nanoId, @RequestBody @Valid SeatRequest req) {
        this.workstationService.seat(nanoId, req.getUserNanoId(), req.getStartMonth());
        return Result.ok();
    }

    @GetMapping(value={"/{nanoId}/seat-candidates"})
    @PreAuthorize(value="@perm.has('workstation:seat')")
    public Result<List<SeatCandidateVo>> seatCandidates(@PathVariable String nanoId) {
        return Result.ok((Object)this.workstationService.seatCandidates(nanoId));
    }

    @PutMapping(value={"/{nanoId}/status"})
    @PreAuthorize(value="@perm.has('workstation:manage')")
    @AuditLog(module="workstation", action="changeStatus", description="\u5207\u6362\u5de5\u4f4d\u72b6\u6001")
    public Result<Void> changeStatus(@PathVariable String nanoId, @RequestBody @Valid WorkstationStatusChangeRequest req) {
        this.workstationService.changeStatus(nanoId, req);
        return Result.ok();
    }

    @GetMapping(value={"/mentor-group-student-usage"})
    @PreAuthorize(value="@perm.has('workstation:usage:view')")
    public Result<MentorGroupStudentUsageVo> mentorGroupStudentUsage(@RequestParam String mentorGroupNanoId, @RequestParam String startMonth, @RequestParam String endMonth) {
        return Result.ok((Object)this.rentalRequestService.mentorGroupStudentUsage(mentorGroupNanoId, startMonth, endMonth));
    }

    @GetMapping(value={"/{nanoId}/occupancy-history"})
    @PreAuthorize(value="@perm.has('workstation:history:view')")
    public Result<List<OccupancyHistoryVo>> occupancyHistory(@PathVariable String nanoId) {
        return Result.ok((Object)this.workstationService.occupancyHistory(nanoId));
    }

    @Generated
    public WorkstationController(WorkstationService workstationService, WorkstationRentalRequestService rentalRequestService) {
        this.workstationService = workstationService;
        this.rentalRequestService = rentalRequestService;
    }
}

