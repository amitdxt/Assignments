package com.yash.oops.program;

public class Output {

	public static void main(String[] args) {
		Electornics e1= new Mobile();
		e1.setId(101);e1.setSemiconductorType("Mobile");
		e1.setDateOfManufacturing("10/03/2000");
		System.out.println(e1);
		Electornics e2= new LCD();
		e2.setId(102);e2.setSemiconductorType("LCD");
		e2.setDateOfManufacturing("10/04/2005");
		System.out.println(e2);
		Electornics e3= new Laptop();
		e3.setId(103);e3.setSemiconductorType("Laptop");
		e3.setDateOfManufacturing("10/04/1997");
		System.out.println(e3);

	}

}
