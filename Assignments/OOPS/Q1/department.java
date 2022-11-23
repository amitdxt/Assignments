package com.yash.oops.program;

public class department {
	 @Override
	public String toString() {
		return "department [deptid=" + deptid + ", dname=" + dname + "]";
	}
	private int  deptid;
	 private String  dname;
	 public department(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}
	public department() {
		
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

}
