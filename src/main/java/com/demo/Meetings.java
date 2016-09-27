package com.demo;

import java.sql.Timestamp;

public class Meetings {
private int meetingid;
private int userid;
private Timestamp start;
private Timestamp end;
private String description;

public Meetings(int meetingid, int userid, Timestamp start, Timestamp end, String description) {
	super();
	this.meetingid = meetingid;
	this.userid = userid;
	this.start = start;
	this.end = end;
	this.description = description;
}

public int getMeetingid() {
	return meetingid;
}
public void setMeetingid(int meetingid) {
	this.meetingid = meetingid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public Timestamp getStart() {
	return start;
}
public void setStart(Timestamp start) {
	this.start = start;
}
public Timestamp getEnd() {
	return end;
}
public void setEnd(Timestamp end) {
	this.end = end;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}



}
