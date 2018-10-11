package com.etc.RentMarket.entity;

import java.io.Serializable;


/**
 * The persistent class for the usersdetail database table.
 * 
 */
  
public class Usersdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int userDetailId;

	private String userAddress;

	private int userId;

	private int userPhone;

	public Usersdetail() {
	}

	public int getUserDetailId() {
		return this.userDetailId;
	}

	public void setUserDetailId(int userDetailId) {
		this.userDetailId = userDetailId;
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

	public int getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

}