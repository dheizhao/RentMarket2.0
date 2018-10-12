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

	private String userName;

	private String  userPhone;
	
	private String  userRealName;

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


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String  getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String  userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

	public Usersdetail(int userDetailId, String userAddress, String userName, String userPhone, String userRealName) {
		super();
		this.userDetailId = userDetailId;
		this.userAddress = userAddress;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userRealName = userRealName;
	}

	@Override
	public String toString() {
		return "Usersdetail [userDetailId=" + userDetailId + ", userAddress=" + userAddress + ", userName=" + userName
				+ ", userPhone=" + userPhone + ", userRealName=" + userRealName + "]";
	}

}