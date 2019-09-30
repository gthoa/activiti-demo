package com.java.activiti.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java.activiti.dao.MemberShipDao;
import com.java.activiti.model.MemberShip;
import com.java.activiti.service.MemberShipService;

@Service("memberShipService")
public class MemberShipServiceImpl implements MemberShipService{

	@Resource
	private MemberShipDao memberShipDao;

	/**
	 * 用户登入的方法
	 * @return
	 */
	public MemberShip userLogin(Map<String, Object> map){
		return memberShipDao.userLogin(map);
	}

	public int deleteAllGroupsByUserId(String userId){
		return memberShipDao.deleteAllGroupsByUserId(userId);
	}

	public int addMemberShip(MemberShip memberShip){
		return memberShipDao.addMemberShip(memberShip);
	}
}
