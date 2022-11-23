package com.yash.oops.program;

public class Employee_FinalizeQ9 {

	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	public Employee_FinalizeQ9(int id) {
		super();
		this.id = id;
	}

	public Employee_FinalizeQ9() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("id= " + this.id);
	}

}

