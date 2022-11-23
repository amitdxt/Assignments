package com.yash.oops.program;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(101);
		Employee e2 = new Employee(102);
		Employee e3 = new Employee(103);
		Employee e4 = new Employee(104);
		Employee e5 = new Employee(105);

		e2 = null;
		e5 = null;
		System.gc();

		for (int i = 1; i < 6; i++) {
			String e = "e" + i;
			System.out.println(e + ":" + e.hashCode());
		}
		System.out.println("e2=" + e2);
		System.out.println("e5=" + e5);

	}


}
