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
		
		List<Good> list = (List<Good>) BaseDao.select(sql, Good.class);
		for (Good good : list) {
			if(good.getGoodState().equals("0")) {
				good.setGoodState("待审核");
			}else if (good.getGoodState().equals("1")) {
				good.setGoodState("审核失败");
			}else {
				good.setGoodState("审核通过");
			}
		}
		return list;
	}

}
