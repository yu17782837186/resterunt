package com.ning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ning.bean.User;
import com.ning.dao.UserMapper;

@Service
public class IUserImpl implements IUser {
	
	//注入UserMapper
	@Autowired
	UserMapper um;

	/**
	 * 功能:登录 
	 * 需求:根据账号和密码登录
	 */
	@Override
	public User login(String uid, String upwd) {
		return um.login(uid, upwd);
	}

	/**
	 * 功能:修改密码
	 * 需求:根据id修改密码
	 */
	@Override
	public void updPwd(String upwd, String uid) {
		um.updPwd(upwd, uid);
	}

	/**
	 * 功能:查询个人信息
	 */
	@Override
	public User findById(String uid) {
		return um.findById(uid);
	}

}
