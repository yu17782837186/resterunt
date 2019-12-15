package com.ning.bean;

public class Car {
	
	private Integer cid;
	private String cname;
	private Integer cmoney;
	private Integer cnum;
	private String cimage;
	private String cstatus;
	private Integer fid;
	private String uid;

	User user;
	Foods foods;
	
	public Car() {
		super();
	}

	public Car(Integer cid, Integer cmoney, Integer cnum, String cname,
			String cimage, String cstatus, Integer fid, String uid) {
		super();
		this.cid = cid;
		this.cmoney = cmoney;
		this.cnum = cnum;
		this.cname = cname;
		this.cimage = cimage;
		this.cstatus = cstatus;
		this.fid = fid;
		this.uid = uid;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getCmoney() {
		return cmoney;
	}

	public void setCmoney(Integer cmoney) {
		this.cmoney = cmoney;
	}

	public Integer getCnum() {
		return cnum;
	}

	public void setCnum(Integer cnum) {
		this.cnum = cnum;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCimage() {
		return cimage;
	}

	public void setCimage(String cimage) {
		this.cimage = cimage;
	}

	public String getCstatus() {
		return cstatus;
	}

	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
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

	public Foods getFoods() {
		return foods;
	}

	public void setFoods(Foods foods) {
		this.foods = foods;
	}

	
}
