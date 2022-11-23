package com.yash.oops.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class employee {

	private int empid;
	private String empname;
	private int empsalary;
	private String empaddress;
	private Date emp_dob;
	private Date emp_doj;

	public employee(int empid, String empname, int empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public Date getEmp_doj() {
		return emp_doj;
	}

	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}

	public String toString() {
		return "emp [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			employee emp = new employee(18, "akshay", 73000, "delhi", null, null);
			Date date = formatter.parse("23/01/1995");
			emp.setEmp_dob(date);

			Date date1 = formatter.parse("01/11/2022");
			emp.setEmp_doj(date1);
			System.out.println(emp);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
