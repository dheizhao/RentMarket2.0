package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.Good;

public interface SearchGoodsService {
	/**
	 * 根据商品名称模糊查询
	 * @param goodName
	 * @return
	 */
	public List<Good> SelGoodByLike(String goodName);
}
