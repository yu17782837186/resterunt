package com.ning.bean;

public class Uaddress {

	// aid INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
	// address VARCHAR(100) COMMENT '地址',
	// uid VARCHAR(50)

	int aid;
	String address;
	String uid;

	User user;

	public Uaddress() {
		super();
	}

	public Uaddress(int aid, String address, String uid, User user) {
		super();
		this.aid = aid;
		this.address = address;
		this.uid = uid;
		this.user = user;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

}
