package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;

 
/**
 * 自定义实体类
 * 
 */
 
public class EvaluateBack implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int evaluateId;

	private String evaluateContent;

	
	private String evaluateDate;

	private String goodName;

	private String userName;

	public EvaluateBack() {
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

	public String getEvaluateDate() {
		return this.evaluateDate;
	}

	public void setEvaluateDate(String evaluateDate) {
		this.evaluateDate = evaluateDate;
	}

	public String getgoodName() {
		return this.goodName;
	}

	public void setgoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getuserName() {
		return this.userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Evaluate [evaluateId=" + evaluateId + ", evaluateContent=" + evaluateContent + ", evaluateDate="
				+ evaluateDate + ", goodName=" + goodName + ", userName=" + userName + "]";
	}

	public EvaluateBack(int evaluateId, String evaluateContent, String evaluateDate, String goodName, String userName) {
		super();
		this.evaluateId = evaluateId;
		this.evaluateContent = evaluateContent;
		this.evaluateDate = evaluateDate;
		this.goodName = goodName;
		this.userName = userName;
	}

}