package com.kn.encapsulation;

public class Student {

	private String Name;
	private String Address;
	private String about;
	public String getName() {
		return Name;
	}
	//setter
	public void setName(String name) {
		Name = name;
	}
	//getter
	public String getAddress() {
		return Address;
	}
	//setter
	public void setAddress(String address) {
		Address = address;
	}//getter
	public String getAbout() {
		return about;
	}//setter
	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
