package com.ning.service;

import java.util.List;

import com.ning.bean.Uaddress;

public interface IUaddress {

	public void addUaddress(String address, String uid);
	
	public List<Uaddress> findUaddress(String uid);

	public void delUaddress(int aid);

	public List<Uaddress> findUserUaddress(String uid);

}
