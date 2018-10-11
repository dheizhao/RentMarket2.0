package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.impl.AdDaoImpl;
import com.etc.RentMarket.dao.impl.GoodPhoneDaoImpl;
import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.entity.PhoneGood;
import com.etc.RentMarket.service.AdService;
import com.etc.RentMarket.service.GoodPhoneService;

public class GoodPhoneServiceImpl implements GoodPhoneService {
	GoodPhoneDaoImpl gd= new GoodPhoneDaoImpl();
	/**
	 * 手机商品信息查询
	 */
	
	@Override
	public List<PhoneGood> selectPhone() {
		// TODO Auto-generated method stub
		return gd.selectPhone();
	}

}
