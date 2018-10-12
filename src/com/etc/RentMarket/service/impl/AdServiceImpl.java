package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.AdDao;
import com.etc.RentMarket.dao.impl.AdDaoImpl;
import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.service.AdService;

public class AdServiceImpl implements AdService {
	private AdDao ad= new AdDaoImpl();
	/**
	 * 广告信息查询
	 */
	@Override
	public List<Ad> QueryAds() {
		// TODO Auto-generated method stub
		return ad.QueryAds();
	}

}
