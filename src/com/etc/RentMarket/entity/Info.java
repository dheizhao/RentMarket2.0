package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the info database table.
 * 
 */
  
public class Info implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int infoId;

	private String infoContent;

	
	private Date infoDate;

	public Info() {
	}

	public int getInfoId() {
		return this.infoId;
	}

	public void setInfoId(int infoId) {
		this.infoId = infoId;
	}

	public String getInfoContent() {
		return this.infoContent;
	}

	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}

	public Date getInfoDate() {
		return this.infoDate;
	}

	public void setInfoDate(Date infoDate) {
		this.infoDate = infoDate;
	}

}