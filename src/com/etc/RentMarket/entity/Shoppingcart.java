package com.etc.RentMarket.entity;

import java.io.Serializable;


/**
 * 购物车的实体类
 * 
 */
  
public class Shoppingcart implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int cartId;//购物车编号
	private double goodPrice;//商品价格
	private String goodImgAdd;//商品图片
	private String goodName;//商品名字
	private int goodNumber;//商品数量
	private int userId;//用户Id
	private int goodId;//商品Id

	public int getGoodId() {
		return goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public Shoppingcart() {
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getGoodPrice() {
		return goodPrice;
	}

	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public String getGoodImgAdd() {
		return goodImgAdd;
	}

	public void setGoodImgAdd(String goodImgAdd) {
		this.goodImgAdd = goodImgAdd;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public int getGoodNumber() {
		return goodNumber;
	}

	public void setGoodNumber(int goodNumber) {
		this.goodNumber = goodNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Shoppingcart(int goodNumber, int userId, int goodId) {
		super();
		this.goodNumber = goodNumber;
		this.userId = userId;
		this.goodId = goodId;
	}

	public Shoppingcart(int goodNumber, int userId) {
		super();
		this.goodNumber = goodNumber;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Shoppingcart [cartId=" + cartId + ", goodPrice=" + goodPrice + ", goodImgAdd=" + goodImgAdd
				+ ", goodName=" + goodName + ", goodNumber=" + goodNumber + ", userId=" + userId + "]";
	}

	

}