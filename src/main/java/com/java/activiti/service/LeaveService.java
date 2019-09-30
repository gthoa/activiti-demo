package com.java.activiti.service;

import java.util.List;
import java.util.Map;

import com.java.activiti.model.Leave;

public interface LeaveService {
    List<Leave> leavePage(Map<String, Object> map);

    int leaveCount(Map<String, Object> map);

    int addLeave(Leave leave);

    Leave findById(String id);

    int updateLeave(Leave leave);

    Leave getLeaveByTaskId(String processInstanceId);
}
