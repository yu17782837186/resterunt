package com.ning.bean;

public class Ordersdetail {

	int odid;
	int odnum;
	String oid;
	int fid;

	Orders orders;
	Foods foods;

	public Ordersdetail() {
		super();
	}

	public Ordersdetail(int odid, int odnum, String oid, int fid,
			Orders orders, Foods foods) {
		super();
		this.odid = odid;
		this.odnum = odnum;
		this.oid = oid;
		this.fid = fid;
		this.orders = orders;
		this.foods = foods;
	}

	public int getOdid() {
		return odid;
	}

	public void setOdid(int odid) {
		this.odid = odid;
	}

	public int getOdnum() {
		return odnum;
	}

	public void setOdnum(int odnum) {
		this.odnum = odnum;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Foods getFoods() {
		return foods;
	}

	public void setFoods(Foods foods) {
		this.foods = foods;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

}
