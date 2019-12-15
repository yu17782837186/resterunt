package com.ning.service;

import com.ning.bean.User;

public interface IUser {
	
	public User login(String uid,String upwd);

	public void updPwd(String upwd, String uid);

	public User findById(String uid);

}
