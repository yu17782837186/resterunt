package com.ning.bean;

import java.util.ArrayList;
import java.util.List;

public class User {

	String uid;
	String upwd;
	String uname;
	String uphone;
	String uaddress;
	String ustatus;

	List<Orders> listO = new ArrayList<Orders>();
	List<Uaddress> listU = new ArrayList<Uaddress>();

	public User() {
	}

	public User(String uid, String upwd, String uname, String uphone,
			String uaddress, String ustatus) {
		super();
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.uphone = uphone;
		this.uaddress = uaddress;
		this.ustatus = ustatus;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUstatus() {
		return ustatus;
	}

	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}

	public List<Orders> getListO() {
		return listO;
	}

	public void setListO(List<Orders> listO) {
		this.listO = listO;
	}

	public List<Uaddress> getListU() {
		return listU;
	}

	public void setListU(List<Uaddress> listU) {
		this.listU = listU;
	}

}
