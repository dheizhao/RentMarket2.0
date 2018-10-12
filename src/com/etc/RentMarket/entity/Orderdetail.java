package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the orderdetail database table.
 * 
 */
  
public class Orderdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int did;

	private String goodName;

	private int goodNumber;


	private int orderId;

	
	private Date rentDate;

	public Orderdetail() {
	}

	public int getDid() {
		return this.did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public int getGoodNumber() {
		return this.goodNumber;
	}

	public void setGoodNumber(int goodNumber) {
		this.goodNumber = goodNumber;
	}


	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getRentDate() {
		return this.rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

}