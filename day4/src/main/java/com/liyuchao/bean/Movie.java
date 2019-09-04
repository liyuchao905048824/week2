package com.liyuchao.bean;

import java.sql.Date;

public class Movie {
	private int mid;
	private String mname;
	private String content;
	private String dy;
	private Date mdate;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDy() {
		return dy;
	}
	public void setDy(String dy) {
		this.dy = dy;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", content="
				+ content + ", dy=" + dy + ", mdate=" + mdate + "]";
	}
	

}
