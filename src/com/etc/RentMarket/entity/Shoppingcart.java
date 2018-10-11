package com.etc.RentMarket.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the shoppingcart database table.
 * 
 */
  
public class Shoppingcart implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int cartId;

	private int goodId;

	private int goodNumber;

	private double goodPrice;

	private double goodTprice;

	private int userId;

	public Shoppingcart() {
	}

	public int getCartId() {
		return this.cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getGoodId() {
		return this.goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public int getGoodNumber() {
		return this.goodNumber;
	}

	public void setGoodNumber(int goodNumber) {
		this.goodNumber = goodNumber;
	}

	public double getGoodPrice() {
		return this.goodPrice;
	}

	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public double getGoodTprice() {
		return this.goodTprice;
	}

	public void setGoodTprice(double goodTprice) {
		this.goodTprice = goodTprice;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}