/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.api.Result
 *  com.lab.common.audit.AuditLog
 *  com.lab.module.workstation.controller.WorkstationRentalRequestController
 *  com.lab.module.workstation.dto.RentalRejectRequest
 *  com.lab.module.workstation.dto.RentalRequestVo
 *  com.lab.module.workstation.service.WorkstationRentalRequestService
 *  io.swagger.v3.oas.annotations.tags.Tag
 *  jakarta.validation.Valid
 *  lombok.Generated
 *  org.springframework.security.access.prepost.PreAuthorize
 *  org.springframework.web.bind.annotation.GetMapping
 *  org.springframework.web.bind.annotation.PathVariable
 *  org.springframework.web.bind.annotation.PutMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RequestParam
 *  org.springframework.web.bind.annotation.RestController
 */
package com.lab.module.workstation.controller;

import com.lab.common.api.Result;
import com.lab.common.audit.AuditLog;
import com.lab.module.workstation.dto.RentalRejectRequest;
import com.lab.module.workstation.dto.RentalRequestVo;
import com.lab.module.workstation.service.WorkstationRentalRequestService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lab.module.workstation.entity.WorkstationStatus;
import java.time.YearMonth;
import com.lab.common.api.ResultCode;
import com.lab.common.security.MentorGroupResolver;
import com.lab.module.rbac.entity.CoreMentorGroup;
import com.lab.module.rbac.repository.CoreMentorGroupRepository;
import com.lab.module.workstation.dto.RentalRequestCreateRequest;
import com.lab.module.workstation.entity.Lab;
import com.lab.module.workstation.entity.RentalRequestStatus;
import com.lab.module.workstation.entity.Workstation;
import com.lab.module.workstation.entity.WorkstationRentalRequest;
import com.lab.module.workstation.entity.WorkstationRentalRequestItem;
import com.lab.module.workstation.repository.LabRepository;
import com.lab.module.workstation.repository.WorkstationRepository;
import com.lab.module.workstation.repository.WorkstationRentalRequestItemRepository;
import com.lab.module.workstation.repository.WorkstationRentalRequestRepository;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

@Tag(name="\u5de5\u4f4d\u7533\u8bf7")
@RestController
@RequestMapping(value={"/api/workstation-rental-requests"})
public class WorkstationRentalRequestController {
    private final WorkstationRentalRequestService rentalRequestService;

    @GetMapping
    @PreAuthorize(value="@perm.hasAny('workstation:rent:apply','workstation:rent:approve')")
    public Result<List<RentalRequestVo>> list(@RequestParam(name="mine", defaultValue="false") boolean mine, @RequestParam(name="status", required=false) String status, @RequestParam(name="mentorGroupNanoId", required=false) String mentorGroupNanoId, @RequestParam(name="labNanoId", required=false) String labNanoId) {
        return Result.ok(this.rentalRequestService.list(mine, status, mentorGroupNanoId, labNanoId));
    }

    @GetMapping(value={"/{nanoId}"})
    @PreAuthorize(value="@perm.hasAny('workstation:rent:apply','workstation:rent:approve')")
    public Result<RentalRequestVo> get(@PathVariable(name="nanoId") String nanoId) {
        return Result.ok(this.rentalRequestService.getByNanoId(nanoId));
    }

    @PutMapping(value={"/{nanoId}/approve"})
    @PreAuthorize(value="@perm.has('workstation:rent:approve')")
    @AuditLog(module="workstation", action="approveRent", description="\u5ba1\u6279\u901a\u8fc7\u5de5\u4f4d\u7533\u8bf7")
    public Result<Void> approve(@PathVariable(name="nanoId") String nanoId) {
        this.rentalRequestService.approve(nanoId);
        return Result.ok();
    }

    @PutMapping(value={"/{nanoId}/reject"})
    @PreAuthorize(value="@perm.has('workstation:rent:approve')")
    @AuditLog(module="workstation", action="rejectRent", description="\u5ba1\u6279\u62d2\u7edd\u5de5\u4f4d\u7533\u8bf7")
    public Result<Void> reject(@PathVariable(name="nanoId") String nanoId, @RequestBody(required=false) @Valid RentalRejectRequest req) {
        this.rentalRequestService.reject(nanoId, req == null ? new RentalRejectRequest() : req);
        return Result.ok();
    }

    @PutMapping(value={"/{nanoId}/cancel"})
    @PreAuthorize(value="@perm.hasAny('workstation:rent:apply','workstation:rent:approve')")
    @AuditLog(module="workstation", action="cancelRent", description="\u53d6\u6d88\u5de5\u4f4d\u7533\u8bf7")
    public Result<Void> cancel(@PathVariable(name="nanoId") String nanoId) {
        this.rentalRequestService.cancel(nanoId);
        return Result.ok();
    }

    public WorkstationRentalRequestController(WorkstationRentalRequestService rentalRequestService) {
        this.rentalRequestService = rentalRequestService;
    }
}
@Tag(name = "学生工位申请(公开)")
@RestController
@RequestMapping(value = {"/api/public"})
class StudentApplyController {
    private static final String STUDENT_INFO_PREFIX = "【学生申请】";
    private final WorkstationRentalRequestService rentalRequestService;
    private final LabRepository labRepository;
    private final CoreMentorGroupRepository mentorGroupRepository;
    private final WorkstationRepository workstationRepository;
    private final WorkstationRentalRequestRepository requestRepository;
    private final WorkstationRentalRequestItemRepository itemRepository;
    private final MentorGroupResolver mentorGroupResolver;

    @PostMapping(value = {"/apply"})
    public Result<String> apply(@RequestBody Map<String, String> req) {
        String labNanoId = req.get("labNanoId");
        String workstationNanoId = req.get("workstationNanoId");
        String studentName = req.get("studentName");
        String studentNo = req.get("studentNo");
        String gradeName = req.get("gradeName");
        String mentorName = req.get("mentorName");
        String mentorGroupNanoId = req.get("mentorGroupNanoId");
        String endMonthStr = req.get("endMonth");
        if (labNanoId == null || labNanoId.isBlank() || workstationNanoId == null || workstationNanoId.isBlank() || studentName == null || studentName.isBlank() || studentNo == null || studentNo.isBlank() || gradeName == null || gradeName.isBlank() || mentorName == null || mentorName.isBlank() || mentorGroupNanoId == null || mentorGroupNanoId.isBlank()) {
            return Result.fail(ResultCode.BAD_REQUEST, "请填写完整信息");
        }
        if (endMonthStr == null || endMonthStr.isBlank()) {
            endMonthStr = StudentApplyController.defaultStudentEndMonth();
        }
        if (!endMonthStr.matches("\\d{4}-(0[1-9]|1[0-2])")) {
            return Result.fail(ResultCode.BAD_REQUEST, "预计使用月份格式错误(应为 YYYY-MM, 如 2027-06)");
        }
        Long mentorGroupId = this.mentorGroupResolver.resolveMentorGroupId(mentorGroupNanoId);
        if (mentorGroupId == null) {
            return Result.fail(ResultCode.BAD_REQUEST, "导师不存在,请从列表选择");
        }
        Workstation ws = this.workstationRepository.findByNanoId(workstationNanoId);
        if (ws == null) {
            return Result.fail(ResultCode.BAD_REQUEST, "工位不存在: " + workstationNanoId);
        }
        if (ws.getStatus() != WorkstationStatus.IDLE) {
            return Result.fail(ResultCode.BAD_REQUEST, "该工位当前不可申请(仅空闲工位可申请): " + ws.getCode());
        }
        RentalRequestCreateRequest r = new RentalRequestCreateRequest();
        r.setLabNanoId(labNanoId);
        r.setWorkstationNanoIds(List.of(workstationNanoId));
        r.setStartMonth(YearMonth.now().toString());
        r.setEndMonth(endMonthStr);
        r.setMentorGroupNanoId(this.mentorGroupResolver.resolveNanoId(mentorGroupId));
        r.setReason(StudentApplyController.buildStudentReason(studentName, studentNo, gradeName, mentorName));
        String nanoId = this.rentalRequestService.create(labNanoId, r);
        return Result.ok(nanoId);
    }

    @GetMapping(value = {"/labs"})
    public Result<List<Map<String, Object>>> labs() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (Lab lab : this.labRepository.findAll()) {
            Map<String, Object> m = new LinkedHashMap<String, Object>();
            m.put("nanoId", lab.getNanoId());
            m.put("name", lab.getName());
            m.put("code", lab.getCode());
            m.put("area", lab.getArea());
            m.put("capacity", lab.getCapacity());
            list.add(m);
        }
        return Result.ok(list);
    }

    @GetMapping(value = {"/mentor-groups"})
    public Result<List<Map<String, Object>>> mentorGroups() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (CoreMentorGroup g : this.mentorGroupRepository.findAll()) {
            Map<String, Object> m = new LinkedHashMap<String, Object>();
            m.put("nanoId", g.getNanoId());
            m.put("name", g.getName());
            m.put("level", g.getLevel());
            list.add(m);
        }
        return Result.ok(list);
    }

    @GetMapping(value = {"/labs/{labNanoId}/workstations"})
    public Result<List<Map<String, Object>>> workstations(@PathVariable(name="labNanoId") String labNanoId) {
        Lab lab = this.labRepository.findByNanoId(labNanoId);
        if (lab == null) {
            return Result.fail(ResultCode.BAD_REQUEST, "实验室不存在: " + labNanoId);
        }
        List<Workstation> wss = this.workstationRepository.findByLabId(lab.getId());
        Map<Long, String> occupantNameByWs = this.occupantNameByWorkstationIds(wss);
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (Workstation ws : wss) {
            Map<String, Object> m = new LinkedHashMap<String, Object>();
            m.put("nanoId", ws.getNanoId());
            m.put("code", ws.getCode());
            m.put("type", ws.getType() == null ? null : ws.getType().name());
            m.put("status", ws.getStatus() == null ? null : ws.getStatus().name());
            m.put("description", ws.getDescription());
            m.put("posX", ws.getPosX());
            m.put("posY", ws.getPosY());
            m.put("width", ws.getWidth());
            m.put("height", ws.getHeight());
            m.put("zIndex", ws.getZIndex());
            m.put("rotation", ws.getRotation());
            m.put("occupantName", occupantNameByWs.get(ws.getId()));
            m.put("occupantMentorGroupName", ws.getOccupantMentorGroupId() == null ? null : this.mentorGroupResolver.resolveName(ws.getOccupantMentorGroupId()));
            list.add(m);
        }
        return Result.ok(list);
    }

    @GetMapping(value = {"/applications"})
    public Result<List<Map<String, Object>>> applications(@RequestParam(name="studentNo") String studentNo, @RequestParam(name="studentName", required = false) String studentName) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (WorkstationRentalRequest r : this.requestRepository.findAll()) {
            StudentApplyController.StudentInfo info = StudentApplyController.parseStudentInfo(r.getReason());
            if (info == null || !studentNo.equals(info.no)) {
                continue;
            }
            if (studentName != null && !studentName.isBlank() && !studentName.equals(info.name)) {
                continue;
            }
            Map<String, Object> m = new LinkedHashMap<String, Object>();
            m.put("nanoId", r.getNanoId());
            m.put("status", r.getStatus() == null ? null : r.getStatus().name());
            m.put("studentName", info.name);
            m.put("studentNo", info.no);
            m.put("gradeName", info.grade);
            m.put("mentorName", info.mentor);
            m.put("startMonth", r.getStartMonth());
            m.put("endMonth", r.getEndMonth());
            m.put("rejectReason", r.getRejectReason());
            m.put("approvedAt", r.getApprovedAt());
            m.put("sysCreateDatetime", r.getSysCreateDatetime());
            this.labRepository.findById(r.getLabId()).ifPresent(lab -> {
                m.put("labName", lab.getName());
            });
            List<WorkstationRentalRequestItem> items = this.itemRepository.findByRentalRequestId(r.getId());
            if (!items.isEmpty()) {
                this.workstationRepository.findById(items.get(0).getWorkstationId()).ifPresent(ws -> {
                    m.put("workstationCode", ws.getCode());
                });
            }
            list.add(m);
        }
        return Result.ok(list);
    }

    private Map<Long, String> occupantNameByWorkstationIds(List<Workstation> wss) {
        Map<Long, String> map = new LinkedHashMap<Long, String>();
        if (wss == null || wss.isEmpty()) {
            return map;
        }
        java.util.Set<Long> wsIdSet = new java.util.HashSet<Long>();
        for (Workstation ws : wss) {
            wsIdSet.add(ws.getId());
        }
        for (WorkstationRentalRequest r : this.requestRepository.findAll()) {
            if (r.getStatus() != RentalRequestStatus.APPROVED) {
                continue;
            }
            StudentApplyController.StudentInfo info = StudentApplyController.parseStudentInfo(r.getReason());
            if (info == null || info.name == null || info.name.isBlank()) {
                continue;
            }
            for (WorkstationRentalRequestItem item : this.itemRepository.findByRentalRequestId(r.getId())) {
                if (wsIdSet.contains(item.getWorkstationId()) && !map.containsKey(item.getWorkstationId())) {
                    map.put(item.getWorkstationId(), info.name);
                }
            }
        }
        return map;
    }

    private static String buildStudentReason(String studentName, String studentNo, String gradeName, String mentorName) {
        return StudentApplyController.STUDENT_INFO_PREFIX + "姓名:" + studentName + ";学号:" + studentNo + ";年级:" + gradeName + ";导师:" + mentorName;
    }

    private static String defaultStudentEndMonth() {
        YearMonth now = YearMonth.now();
        return YearMonth.of(now.getYear() + 1, 6).toString();
    }

    private static StudentInfo parseStudentInfo(String reason) {
        if (reason == null || !reason.startsWith(StudentApplyController.STUDENT_INFO_PREFIX)) {
            return null;
        }
        StudentInfo info = new StudentInfo();
        String body = reason.substring(StudentApplyController.STUDENT_INFO_PREFIX.length());
        String[] parts = body.split(";");
        for (String p2 : parts) {
            int i = p2.indexOf(58);
            if (i < 0) {
                continue;
            }
            String k = p2.substring(0, i).trim();
            String v = p2.substring(i + 1).trim();
            if ("姓名".equals(k)) {
                info.name = v;
            } else if ("学号".equals(k)) {
                info.no = v;
            } else if ("年级".equals(k)) {
                info.grade = v;
            } else if ("导师".equals(k)) {
                info.mentor = v;
            }
        }
        return info;
    }

    private static class StudentInfo {
        String name;
        String no;
        String grade;
        String mentor;

        StudentInfo() {
        }
    }

    StudentApplyController(WorkstationRentalRequestService rentalRequestService, LabRepository labRepository, CoreMentorGroupRepository mentorGroupRepository, WorkstationRepository workstationRepository, WorkstationRentalRequestRepository requestRepository, WorkstationRentalRequestItemRepository itemRepository, MentorGroupResolver mentorGroupResolver) {
        this.rentalRequestService = rentalRequestService;
        this.labRepository = labRepository;
        this.mentorGroupRepository = mentorGroupRepository;
        this.workstationRepository = workstationRepository;
        this.requestRepository = requestRepository;
        this.itemRepository = itemRepository;
        this.mentorGroupResolver = mentorGroupResolver;
    }
}
