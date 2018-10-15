package com.etc.RentMarket.entity;

import java.io.Serializable;

  


public class Ad implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int ad_id;

	private String ad_content;
	
	
	private String ad_picture;


	private String ad_productor;
	
	
	private String ad_beginDate;

	
	private String ad_endDate;


	private int ad_day;
	
	
	private String ad_state;
	
	
	public Ad(String ad_content, String ad_picture, String ad_productor, int ad_day, String ad_state , int ad_id) {
		super();
		this.ad_id = ad_id;
		this.ad_content = ad_content;
		this.ad_picture = ad_picture;
		this.ad_productor = ad_productor;
		this.ad_day = ad_day;
		this.ad_state = ad_state;
	}

	public Ad() {
	}

	public int getad_id() {
		return this.ad_id;
	}

	public void setad_id(int ad_id) {
		this.ad_id = ad_id;
	}

	public String  getAd_beginDate() {
		return this.ad_beginDate;
	}

	public void setAd_beginDate(String ad_beginDate) {
		this.ad_beginDate = ad_beginDate;
	}

	public String getad_content() {
		return this.ad_content;
	}

	public void setad_content(String ad_content) {
		this.ad_content = ad_content;
	}

	public String getAd_endDate() {
		return this.ad_endDate;
	}

	public void setAd_endDate(String ad_endDate) {
		this.ad_endDate = ad_endDate;
	}

	public String getad_picture() {
		return this.ad_picture;
	}

	public void setad_picture(String ad_picture) {
		this.ad_picture = ad_picture;
	}

	public String getad_productor() {
		return this.ad_productor;
	}

	public void setad_productor(String ad_productor) {
		this.ad_productor = ad_productor;
	}

	public int getAd_day() {
		return ad_day;
	}

	public void setAd_day(int ad_day) {
		this.ad_day = ad_day;
	}

	public String getAd_state() {
		return ad_state;
	}

	public void setAd_state(String ad_state) {
		this.ad_state = ad_state;
	}

	public Ad(int ad_id, String ad_content, String ad_picture, String ad_productor, String ad_beginDate,
			String ad_endDate, int ad_day, String ad_state) {
		super();
		this.ad_id = ad_id;
		this.ad_content = ad_content;
		this.ad_picture = ad_picture;
		this.ad_productor = ad_productor;
		this.ad_beginDate = ad_beginDate;
		this.ad_endDate = ad_endDate;
		this.ad_day = ad_day;
		this.ad_state = ad_state;
	}

	
	public Ad(String ad_content, String ad_picture, String ad_productor, int ad_day, String ad_state) {
		super();
		this.ad_content = ad_content;
		this.ad_picture = ad_picture;
		this.ad_productor = ad_productor;
		this.ad_day = ad_day;
		this.ad_state = ad_state;
	}

	@Override
	public String toString() {
		return "Ad [ad_id=" + ad_id + ", ad_content=" + ad_content + ", ad_picture=" + ad_picture + ", ad_productor="
				+ ad_productor + ", ad_beginDate=" + ad_beginDate + ", ad_endDate=" + ad_endDate + ", ad_day=" + ad_day
				+ ", ad_state=" + ad_state + "]";
	}

	

	
	

}