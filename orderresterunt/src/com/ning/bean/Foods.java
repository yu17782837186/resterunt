package com.ning.bean;

public class Foods {

	Integer fid;
	Integer fmoney;
	String fname;
	String fimage;
	String fstatus;

	public Foods() {
		super();
	}

	public Foods(Integer fid, Integer fmoney, String fname, String fimage,
			String fstatus) {
		super();
		this.fid = fid;
		this.fmoney = fmoney;
		this.fname = fname;
		this.fimage = fimage;
		this.fstatus = fstatus;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Integer getFmoney() {
		return fmoney;
	}

	public void setFmoney(Integer fmoney) {
		this.fmoney = fmoney;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFimage() {
		return fimage;
	}

	public void setFimage(String fimage) {
		this.fimage = fimage;
	}

	public String getFstatus() {
		return fstatus;
	}

	public void setFstatus(String fstatus) {
		this.fstatus = fstatus;
	}

	@Override
	public String toString() {
		return "Foods [fid=" + fid + ", fmoney=" + fmoney + ", fname=" + fname
				+ ", fimage=" + fimage + ", fstatus=" + fstatus + "]";
	}

}
