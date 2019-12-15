package com.ning.dao;

import org.apache.ibatis.annotations.Param;

import com.ning.bean.User;

public interface UserMapper {
	
	public User login(@Param("uid")String uid,@Param("upwd")String upwd);
	
	public void updPwd(@Param("upwd")String upwd, @Param("uid")String uid);
	
	public User findById(String uid);
	
}
