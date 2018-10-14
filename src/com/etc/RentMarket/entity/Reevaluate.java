package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 自定义回复评价的实体类
 * 
 */
  
public class Reevaluate implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int cid;//回复Id

	private String content;//回复评价内容

	
	private String date;//回复时间

	private String evaluateContent;//商品评价内容

	private String userName;//回复者姓名

	public Reevaluate() {
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEvaluateContent() {
		return evaluateContent;
	}

	public void setEvaluateContent(String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Reevaluate(int cid, String content, String date, String evaluateContent, String userName) {
		super();
		this.cid = cid;
		this.content = content;
		this.date = date;
		this.evaluateContent = evaluateContent;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Reevaluate [cid=" + cid + ", content=" + content + ", date=" + date + ", evaluateContent="
				+ evaluateContent + ", userName=" + userName + "]";
	}

	

}