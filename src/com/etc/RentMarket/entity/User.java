package com.etc.RentMarket.entity;

import java.io.Serializable;

/**
 * The persistent class for the users database table.
 * 
 */
  
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private int userId;

	private String userName;

	private String userphoto;

	private String userPwd;

	private String userState = "1";

	public User() {
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

	public String getUserphoto() {
		return this.userphoto;
	}

	public void setUserphoto(String userphoto) {
		this.userphoto = userphoto;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}


	public User(int userId, String userName, String userphoto, String userPwd, String userState) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userphoto = userphoto;
		this.userPwd = userPwd;
		this.userState = userState;
	}

	
	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userphoto=" + userphoto + ", userPwd=" + userPwd
				+ ", userState=" + userState + "]";
	}

}