package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.impl.GoodsDaoImpl;
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.service.GoodService;

public class GoodServiceImpl implements GoodService {
	GoodsDaoImpl gd= new GoodsDaoImpl();
	/**
	 * 商品查询
	 */
	@Override
	public List<Good> selectGoods() {
		// TODO Auto-generated method stub
		return gd.selectGoods();
	}

}
