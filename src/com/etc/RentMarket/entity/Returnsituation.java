package com.etc.RentMarket.entity;

import java.io.Serializable;


/**
 * The persistent class for the returnsituation database table.
 * 
 */


public class Returnsituation implements Serializable {
	private static final long serialVersionUID = 1L;

	private int returnId;
	
	private int orderId;

	private int goodId;

	private double returnGoodState;

	private String returnState;

	private double returnPrice;	

	public Returnsituation() {
	}

	public int getReturnId() {
		return returnId;
	}

	public void setReturnId(int returnId) {
		this.returnId = returnId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getGoodId() {
		return goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public double getReturnGoodState() {
		return returnGoodState;
	}

	public void setReturnGoodState(double returnGoodState) {
		this.returnGoodState = returnGoodState;
	}

	public String getReturnState() {
		return returnState;
	}

	public void setReturnState(String returnState) {
		this.returnState = returnState;
	}

	public double getReturnPrice() {
		return returnPrice;
	}

	public void setReturnPrice(double returnPrice) {
		this.returnPrice = returnPrice;
	}

	@Override
	public String toString() {
		return "Returnsituation [returnId=" + returnId + ", orderId=" + orderId + ", goodId=" + goodId
				+ ", returnGoodState=" + returnGoodState + ", returnState=" + returnState + ", returnPrice="
				+ returnPrice + "]";
	}

	
	
	

}