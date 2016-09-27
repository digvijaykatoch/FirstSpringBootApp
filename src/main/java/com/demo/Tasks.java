package com.demo;

public class Tasks {
private int taskid;
private int programid;
private String description;
private int duration;
private String taskAssignment;
private int status;
public Tasks(int taskid, int programid, String description, int duration, String taskAssignment, int status) {
	super();
	this.taskid = taskid;
	this.programid = programid;
	this.description = description;
	this.duration = duration;
	this.taskAssignment = taskAssignment;
	this.status = status;
}
public int getTaskid() {
	return taskid;
}
public void setTaskid(int taskid) {
	this.taskid = taskid;
}
public int getProgramid() {
	return programid;
}
public void setProgramid(int programid) {
	this.programid = programid;
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
public String getTaskAssignment() {
	return taskAssignment;
}
public void setTaskAssignment(String taskAssignment) {
	this.taskAssignment = taskAssignment;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
}
