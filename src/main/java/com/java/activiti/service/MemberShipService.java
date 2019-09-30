package com.java.activiti.service;

import java.util.Map;

import com.java.activiti.model.MemberShip;

public interface MemberShipService {
    /**
     * 用户登入的方法
     *
     * @return
     */
    MemberShip userLogin(Map<String, Object> map);

    int deleteAllGroupsByUserId(String userId);

    int addMemberShip(MemberShip memberShip);
}
