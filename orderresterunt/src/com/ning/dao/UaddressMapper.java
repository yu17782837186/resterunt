package com.ning.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ning.bean.Uaddress;

public interface UaddressMapper {
	
	public void addUaddress(@Param("address")String address,@Param("uid")String uid);

	public List<Uaddress> findUaddress(String uid);
	
	public void delUaddress(int aid);
	
	public List<Uaddress> findUserUaddress(String uid);
	
}
