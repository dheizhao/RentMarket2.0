package com.etc.RentMarket.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reevaluate database table.
 * 
 */
  
public class Reevaluate implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int cid;

	private String content;

	
	private Date date;

	private int lastuserId;

	private String userName;

	public Reevaluate() {
	}

	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getLastuserId() {
		return this.lastuserId;
	}

	public void setLastuserId(int lastuserId) {
		this.lastuserId = lastuserId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}