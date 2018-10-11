package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;

 
/**
 * The persistent class for the evaluate database table.
 * 
 */
 
public class Evaluate implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int evaluateId;

	private String evaluateContent;

	
	private Date evaluateDate;

	private int goodId;

	private int userId;

	public Evaluate() {
	}

	public int getEvaluateId() {
		return this.evaluateId;
	}

	public void setEvaluateId(int evaluateId) {
		this.evaluateId = evaluateId;
	}

	public String getEvaluateContent() {
		return this.evaluateContent;
	}

	public void setEvaluateContent(String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}

	public Date getEvaluateDate() {
		return this.evaluateDate;
	}

	public void setEvaluateDate(Date evaluateDate) {
		this.evaluateDate = evaluateDate;
	}

	public int getGoodId() {
		return this.goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}