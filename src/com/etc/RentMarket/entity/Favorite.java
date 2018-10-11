package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the favorite database table.
 * 
 */
  
public class Favorite implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int favoriteId;

	
	private Date favoriteDate;

	private int goodId;

	private String goodName;

	private double goodPrice;

	private int userId;

	public Favorite() {
	}

	public int getFavoriteId() {
		return this.favoriteId;
	}

	public void setFavoriteId(int favoriteId) {
		this.favoriteId = favoriteId;
	}

	public Date getFavoriteDate() {
		return this.favoriteDate;
	}

	public void setFavoriteDate(Date favoriteDate) {
		this.favoriteDate = favoriteDate;
	}

	public int getGoodId() {
		return this.goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public double getGoodPrice() {
		return this.goodPrice;
	}

	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}