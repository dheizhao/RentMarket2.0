package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.impl.AdDaoImpl;
import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.service.AdService;

public class AdServiceImpl implements AdService {
	AdDaoImpl gd= new AdDaoImpl();
	/**
	 * 广告信息查询
	 */
	@Override
	public List<Ad> selectAd() {
		// TODO Auto-generated method stub
		return gd.selectAd();
	}

}
