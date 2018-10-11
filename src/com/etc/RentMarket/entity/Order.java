package com.etc.RentMarket.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the order database table.
 * 
 */
  
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int orderId;

	
	private Date orderDate;

	private int orderState;

	private double orderTPrice;

	private String userAddress;

	private int userId;

	private String userName;

	private String userTel;

	public Order() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
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

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

}