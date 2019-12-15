package com.ning.bean;

import java.util.ArrayList;
import java.util.List;

public class Orders {

	String oid;
	Integer onum;
	String otime;
	String oaddress;
	String ostatus;
	String uid;

	User user;

	List<Ordersdetail> listod = new ArrayList<Ordersdetail>();

	public Orders() {
		super();
	}

	public Orders(String oid, Integer onum, String otime, String oaddress,
			String ostatus, String uid, User user, List<Ordersdetail> listod) {
		super();
		this.oid = oid;
		this.onum = onum;
		this.otime = otime;
		this.oaddress = oaddress;
		this.ostatus = ostatus;
		this.uid = uid;
		this.user = user;
		this.listod = listod;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Integer getOnum() {
		return onum;
	}

	public void setOnum(Integer onum) {
		this.onum = onum;
	}

	public String getOtime() {
		return otime;
	}

	public void setOtime(String otime) {
		this.otime = otime;
	}

	public String getOaddress() {
		return oaddress;
	}

	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}

	public String getOstatus() {
		return ostatus;
	}

	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Ordersdetail> getListod() {
		return listod;
	}

	public void setListod(List<Ordersdetail> listod) {
		this.listod = listod;
	}

}
