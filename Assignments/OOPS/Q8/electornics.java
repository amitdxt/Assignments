package com.yash.oops.program;

import java.util.Date;

public class electornics {
	int id ;
	String  semiconductorType;
	String dateOfManufacturing;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSemiconductorType() {
		return semiconductorType;
	}
	public void setSemiconductorType(String semiconductorType) {
		this.semiconductorType = semiconductorType;
	}
	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}
	public void setDateOfManufacturing(String dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}
	
	
	@Override
	public String toString() {
		return "electornics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}
	
	
	

}
