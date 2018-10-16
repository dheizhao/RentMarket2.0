package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.impl.SearchGoodsDaoImpl;
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.service.SearchGoodsService;

public class SearchGoodsServiceImpl implements SearchGoodsService{
	SearchGoodsDaoImpl sd = new SearchGoodsDaoImpl();
	@Override
	/**
	 * 根据商品名称模糊查询
	 */
	public List<Good> SelGoodByLike(String goodName) {
		// TODO Auto-generated method stub
		return sd.SelGoodByLike(goodName);
	}
	

}
