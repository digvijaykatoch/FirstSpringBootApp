package com.demo;

import java.util.List;

public class User {
private int id;
private String pwd;
private String fname;

public User(){}

public User(int id, String pwd, String fname, String lname, String role, String school, String company, String prog,
		String intro, String pic, String terms, String sign, String parSign, int famIncome, String email, int phone,
		String skype, String performance, String status) {
	super();
	this.id = id;
	this.pwd = pwd;
	this.fname = fname;
	this.lname = lname;
	this.role = role;
	this.school = school;
	this.company = company;
	this.prog = prog;
	this.intro = intro;
	this.pic = pic;
	this.terms = terms;
	this.sign = sign;
	this.parSign = parSign;
	this.famIncome = famIncome;
	this.email = email;
	this.phone = phone;
	this.skype = skype;
	this.performance = performance;
	this.status = status;
}

public User(String fname, String lname, String role, String school, String company, String prog,
		String intro, String pic, String terms, String sign, String parSign, int famIncome, String email, int phone,
		String skype, String performance, String status){
	}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getProg() {
	return prog;
}
public void setProg(String prog) {
	this.prog = prog;
}
public String getIntro() {
	return intro;
}
public void setIntro(String intro) {
	this.intro = intro;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public String getTerms() {
	return terms;
}
public void setTerms(String terms) {
	this.terms = terms;
}
public String getSign() {
	return sign;
}
public void setSign(String sign) {
	this.sign = sign;
}
public String getParSign() {
	return parSign;
}
public void setParSign(String parSign) {
	this.parSign = parSign;
}
public int getFamIncome() {
	return famIncome;
}
public void setFamIncome(int famIncome) {
	this.famIncome = famIncome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getSkype() {
	return skype;
}
public void setSkype(String skype) {
	this.skype = skype;
}
public String getPerformance() {
	return performance;
}
public void setPerformance(String performance) {
	this.performance = performance;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private String lname;
private String role;
private String school;
private String company;
private String prog;
private String intro;
private String pic;
private String terms;
private String sign;
private String parSign;
private int famIncome;
private String email;
private int phone;
private String skype;
private String performance;
private String status;
}
