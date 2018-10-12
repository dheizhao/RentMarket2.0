package com.etc.RentMarket.entity;
/**
 * 后台用户列表的实体类
 * @author 小白
 *
 */
public class Uesrslist {
	private int userId;//用户Id
	private String userName;//用户姓名
	private String userPhone;//用户联系方式
	private String userAddress;//用户地址
	private String userRegisterTime;//注册时间
	private String userState;//用户状态
	public Uesrslist() {
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getuserPhone() {
		return userPhone;
	}
	public void setuserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserRegisterTime() {
		return userRegisterTime;
	}
	public void setUserRegisterTime(String userRegisterTime) {
		this.userRegisterTime = userRegisterTime;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String string) {
		this.userState = string;
	}
	public Uesrslist(int userId, String userName, String userPhone, String userAddress, String userRegisterTime,
			String userState) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userRegisterTime = userRegisterTime;
		this.userState = userState;
	}
	
	public Uesrslist(int userId, String userState) {
		super();
		this.userId = userId;
		this.userState = userState;
	}
	@Override
	public String toString() {
		return "Uesrslist [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", userAddress="
				+ userAddress + ", userRegisterTime=" + userRegisterTime + ", userState=" + userState + "]";
	}
	
	
}
