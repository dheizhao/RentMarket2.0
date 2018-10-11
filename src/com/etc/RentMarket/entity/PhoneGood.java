package com.etc.RentMarket.entity;

public class PhoneGood {
	private String goodName;
	private double goodPrice;
	private String goodImgAdd;
	
	public PhoneGood(String goodName, double goodPrice, String goodImgAdd) {
		super();
		this.goodName = goodName;
		this.goodPrice = goodPrice;
		this.goodImgAdd = goodImgAdd;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
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
	public PhoneGood() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PhoneGood [goodName=" + goodName + ", goodPrice=" + goodPrice + ", goodImgAdd=" + goodImgAdd + "]";
	}
	
}
