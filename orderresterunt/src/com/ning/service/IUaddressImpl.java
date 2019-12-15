package com.ning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ning.bean.Uaddress;
import com.ning.dao.UaddressMapper;

@Service
public class IUaddressImpl implements IUaddress {

	@Autowired
	UaddressMapper um;
	
	/**
	 * 功能:添加收货地址
	 * 需求:添加自己的收货地址
	 */
	@Override
	public void addUaddress(String address,String uid) {
		um.addUaddress(address,uid);
	}
	
	/**
	 * 功能:查询收货地址
	 * 需求:查询自己的收货地址
	 */
	@Override
	public List<Uaddress> findUaddress(String uid){
		return um.findUaddress(uid);
	}

	/**
	 * 功能:删除
	 * 需求:根据id删除收货地址
	 */
	@Override
	public void delUaddress(int aid) {
		um.delUaddress(aid);
	}

	@Override
	public List<Uaddress> findUserUaddress(String uid) {
		return um.findUserUaddress(uid);
	}
	
	

}
