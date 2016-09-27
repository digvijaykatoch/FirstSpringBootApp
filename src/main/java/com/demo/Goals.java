package com.demo;

import java.sql.Timestamp;

public class Goals {
private int goalid;
private int programid;
private String subject;
private String description;
private int duration;

public Goals(int goalid, int programid, String subject, String description, int duration, int progress, String category,
		Timestamp lastupdated) {
	super();
	this.goalid = goalid;
	this.programid = programid;
	this.subject = subject;
	this.description = description;
	this.duration = duration;
	this.progress = progress;
	this.category = category;
	this.lastupdated = lastupdated;
}



public int getGoalid() {
	return goalid;
}
public void setGoalid(int goalid) {
	this.goalid = goalid;
}
public int getProgramid() {
	return programid;
}
public void setProgramid(int programid) {
	this.programid = programid;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public int getProgress() {
	return progress;
}
public void setProgress(int progress) {
	this.progress = progress;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Timestamp getLastupdated() {
	return lastupdated;
}
public void setLastupdated(Timestamp lastupdated) {
	this.lastupdated = lastupdated;
}
private int progress;
private String category;
private Timestamp lastupdated;
}
