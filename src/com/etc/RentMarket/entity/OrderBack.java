package com.etc.RentMarket.entity;
/**
 * 后台订单显示实体类
 * @author 小白
 *
 */
public class OrderBack {
    private int orderId;

	
	private String orderDate;

	private int orderState;

	private double orderTPrice;

	private String userAddress;

	private String userName;

	private String userTel;
	public OrderBack() {
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public double getOrderTPrice() {
		return orderTPrice;
	}
	public void setOrderTPrice(double orderTPrice) {
		this.orderTPrice = orderTPrice;
	}
	public String getUserAddress() {
		return userAddress;
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
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public OrderBack(int orderId, String orderDate, int orderState, double orderTPrice, String userAddress,
			String userName, String userTel) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.orderTPrice = orderTPrice;
		this.userAddress = userAddress;
		this.userName = userName;
		this.userTel = userTel;
	}
	@Override
	public String toString() {
		return "OrderBack [orderId=" + orderId + ", orderDate=" + orderDate + ", orderState=" + orderState
				+ ", orderTPrice=" + orderTPrice + ", userAddress=" + userAddress + ", userName=" + userName
				+ ", userTel=" + userTel + "]";
	}
	public OrderBack(int orderId, int orderState) {
		super();
		this.orderId = orderId;
		this.orderState = orderState;
	}
	
}
