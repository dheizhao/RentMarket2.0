package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.Good;

public interface SearchGoodsDao {
	/**
	 * 根据商品名字进行模糊查询
	 * @return
	 */
	public List<Good> SelGoodByLike(String goodName);
	

}
