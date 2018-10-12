package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.AdDao;
import com.etc.RentMarket.entity.Ad;

public class AdDaoImpl implements AdDao {

	@Override
	public List<Ad> QueryAds() {
		// TODO Auto-generated method stub
		String sql = "select * from ad";
		return (List<Ad>) BaseDao.select(sql, Ad.class);
	}

}
