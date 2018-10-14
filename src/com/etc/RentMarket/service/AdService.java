package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.Ad;

public interface AdService {
	public List<Ad> SelectAds();//查询广告

	public boolean AddAds(Ad a);
	
	public boolean UpdAd(Ad a);
}
