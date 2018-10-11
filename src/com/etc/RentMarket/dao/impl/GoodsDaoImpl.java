package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.GoodsDao;
import com.etc.RentMarket.entity.Good;

public class GoodsDaoImpl implements GoodsDao {

	@Override
	public List<Good> selectGoods() {
		// TODO Auto-generated method stub
		String sql="select * from good";
		
		return (List<Good>) BaseDao.select(sql, Good.class);
	}

}
