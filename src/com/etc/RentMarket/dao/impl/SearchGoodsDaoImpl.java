package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.SearchGoodsDao;
import com.etc.RentMarket.entity.Good;

public class SearchGoodsDaoImpl implements SearchGoodsDao{
	@Override
	/**
	 * 根据商品名称模糊查询
	 */
	public List<Good> SelGoodByLike(String goodName) {
		// TODO Auto-generated method stub
		String sql = "select * from good where goodName like ?";
		
		return (List<Good>) BaseDao.select(sql, Good.class, "%"+goodName+"%");
	}

}
