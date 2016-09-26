package com.demo;

public class Institutions {
private int institutionid;
private String name;
private String parentorg;
private String address;
private String city;
private String state;
private int postalcode;
private int phone;
private String email;

Institutions(String name,String org,String addr,String city, String state, int postcode, int phone, String email ){
	
}



public int getInstitutionid() {
	return institutionid;
}
public void setInstitutionid(int institutionid) {
	this.institutionid = institutionid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getParentorg() {
	return parentorg;
}
public void setParentorg(String parentorg) {
	this.parentorg = parentorg;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPostalcode() {
	return postalcode;
}
public void setPostalcode(int postalcode) {
	this.postalcode = postalcode;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
