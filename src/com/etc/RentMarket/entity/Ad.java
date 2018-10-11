package com.etc.RentMarket.entity;

import java.io.Serializable;
import java.util.Date;

  


public class Ad implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int adId;

	
	private String ad_beginDate;

	
	private String adContent;

	
	private String ad_endDate;


	private String adPicture;


	private String adProductor;

	public Ad() {
	}

	public int getAdId() {
		return this.adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public String  getAd_beginDate() {
		return this.ad_beginDate;
	}

	public void setAd_beginDate(String ad_beginDate) {
		this.ad_beginDate = ad_beginDate;
	}

	public String getAdContent() {
		return this.adContent;
	}

	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}

	public String getAd_endDate() {
		return this.ad_endDate;
	}

	public void setAd_endDate(String ad_endDate) {
		this.ad_endDate = ad_endDate;
	}

	public String getAdPicture() {
		return this.adPicture;
	}

	public void setAdPicture(String adPicture) {
		this.adPicture = adPicture;
	}

	public String getAdProductor() {
		return this.adProductor;
	}

	public void setAdProductor(String adProductor) {
		this.adProductor = adProductor;
	}

	@Override
	public String toString() {
		return "Ad [adId=" + adId + ", ad_beginDate=" + ad_beginDate + ", adContent=" + adContent + ", ad_endDate="
				+ ad_endDate + ", adPicture=" + adPicture + ", adProductor=" + adProductor + "]";
	}
	

}