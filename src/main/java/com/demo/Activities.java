package com.demo;

import java.sql.Timestamp;

public class Activities {
	private int userid;
	private Timestamp timestamp;
	private String actionPerformed;
	public Activities(int userid, Timestamp timestamp, String actionPerformed) {
		super();
		this.userid = userid;
		this.timestamp = timestamp;
		this.actionPerformed = actionPerformed;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getActionPerformed() {
		return actionPerformed;
	}
	public void setActionPerformed(String actionPerformed) {
		this.actionPerformed = actionPerformed;
	}

}
