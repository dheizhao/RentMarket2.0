package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.Ad;

public interface AdDao {
	public List<Ad> SelectAds();
	
	public boolean AddAds(Ad a);
}
