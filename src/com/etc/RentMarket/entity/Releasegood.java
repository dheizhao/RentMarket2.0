package com.etc.RentMarket.entity;

import java.io.Serializable;


/**
 * The persistent class for the releasegoods database table.
 * 
 */

public class Releasegood implements Serializable {
	private static final long serialVersionUID = 1L;

	private int goodId;
	
	private int releaseId;
	
	private String releaseDate;

	private int userId;
	public Releasegood() {
		// TODO Auto-generated constructor stub
	}
	public int getGoodId() {
		return goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public int getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(int releaseId) {
		this.releaseId = releaseId;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Releasegood [goodId=" + goodId + ", releaseId=" + releaseId + ", releaseDate=" + releaseDate
				+ ", userId=" + userId + "]";
	}

	
	
}