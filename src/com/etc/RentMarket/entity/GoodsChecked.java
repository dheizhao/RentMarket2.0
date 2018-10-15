package com.etc.RentMarket.entity;

public class GoodsChecked {
	private int goodId;
	private String goodName;
	private String goodImgAdd;
	private String userName;
	private String releaseDate;
	private String releaseState;
	
	
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getGoodImgAdd() {
		return goodImgAdd;
	}
	public void setGoodImgAdd(String goodImgAdd) {
		this.goodImgAdd = goodImgAdd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseState() {
		return releaseState;
	}
	public void setReleaseState(String releaseState) {
		this.releaseState = releaseState;
	}
	public GoodsChecked() {
		// TODO Auto-generated constructor stub
	}
	
	public GoodsChecked(int goodId, String goodName, String goodImgAdd, String userName, String releaseDate,
			String releaseState) {
		super();
		this.goodId = goodId;
		this.goodName = goodName;
		this.goodImgAdd = goodImgAdd;
		this.userName = userName;
		this.releaseDate = releaseDate;
		this.releaseState = releaseState;
	}
	@Override
	public String toString() {
		return "GoodsChecked [goodId=" + goodId + ", goodName=" + goodName + ", goodImgAdd=" + goodImgAdd
				+ ", userName=" + userName + ", releaseDate=" + releaseDate + ", releaseState=" + releaseState + "]";
	}
	
}
