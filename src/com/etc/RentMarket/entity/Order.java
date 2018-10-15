package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the order database table.
 * 
 */
  
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int orderId;

	
	private String orderDate;

	private int orderState;

	private double orderTPrice;

	private String userAddress;

	private String userName;

	private String userTel;
	
	private String goodName;
	private String rentDate;
	private int goodNumber;
	private String goodImg;
	private double rentPrice;

	public Order() {
	}
	
	public Order(int orderId, String orderDate, int orderState, double orderTPrice, String userAddress, String userName,
			String userTel) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.orderTPrice = orderTPrice;
		this.userAddress = userAddress;
		this.userName = userName;
		this.userTel = userTel;
	}
	
	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getGoodImg() {
		return goodImg;
	}

	public void setGoodImg(String goodImg) {
		this.goodImg = goodImg;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public int getGoodNumber() {
		return goodNumber;
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

	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderState() {
		return this.orderState;
	}

	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}

	public double getOrderTPrice() {
		return this.orderTPrice;
	}

	public void setOrderTPrice(double orderTPrice) {
		this.orderTPrice = orderTPrice;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserTel() {
		return this.userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	

	public Order(int orderId, String orderDate, int orderState, double orderTPrice, String userAddress, String userName,
			String userTel, String goodName, String rentDate, int goodNumber, String goodImg) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.orderTPrice = orderTPrice;
		this.userAddress = userAddress;
		this.userName = userName;
		this.userTel = userTel;
		this.goodName = goodName;
		this.rentDate = rentDate;
		this.goodNumber = goodNumber;
		this.goodImg = goodImg;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderState=" + orderState
				+ ", orderTPrice=" + orderTPrice + ", userAddress=" + userAddress + ", userName=" + userName
				+ ", userTel=" + userTel + ", goodName=" + goodName + ", rentDate=" + rentDate + ", goodNumber="
				+ goodNumber + ", goodImg=" + goodImg + ", rentPrice=" + rentPrice + "]";
	}

	

	

}