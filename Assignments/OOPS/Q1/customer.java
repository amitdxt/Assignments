package com.yash.oops.program;

public class customer extends PersonQ1 {
private 	 String date_of_registration;
	 private  String delivery_address;
private 	long  contactno;
	private String email_id;
	public customer() {
		
	}
	public String getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
