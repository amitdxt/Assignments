package com.yash.oops.program;

public class employee extends PersonQ1 {
	@Override
	public String toString() {
		return "employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_location="
				+ base_location + ", depobj=" + depobj + ", contactno=" + contactno + ", emailid=" + emailid + "]";
	}
	private   float salary;
	private String date_of_joining;
	private  String base_location;
	  private Department_Q1 depobj;
	private  long contactno;
	private String   emailid ;
	public employee() {
		
	}
	

	
	public employee(int Pid, String pname ,String paddress,String dob ) {
		
		super.setPid(Pid);
		super.setPname(pname);
		super.setPaddress(paddress);
		super.setDob(dob);
	
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getBase_location() {
		return base_location;
	}
	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}
	public Department_Q1 getDepobj() {
		return depobj;
	}
	public void setDepobj(Department_Q1 depobj) {
		this.depobj = depobj;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	

}
