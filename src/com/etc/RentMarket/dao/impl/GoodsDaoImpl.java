package com.etc.RentMarket.dao.impl;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.GoodsDao;
import com.etc.RentMarket.entity.Good;

public class GoodsDaoImpl implements GoodsDao {

	@Override
	public List<Good> selectGoods() {
		// TODO Auto-generated method stub
		String sql="select * from good";
		
		List<Good> list = (List<Good>) BaseDao.select(sql, Good.class);
		/*for (Good good : list) {
			if(good.getGoodState().equals("0")) {
				good.setGoodState("待审核");
			}else if (good.getGoodState().equals("1")) {
				good.setGoodState("审核失败");
			}else if(good.getGoodState().equals("2")){
				good.setGoodState("审核通过");
			}else {
				good.setGoodState("");
			}
		
	}*/
		
		return list;
	}

	@Override
	public boolean delGoods(int goodId) {
		// TODO Auto-generated method stub
		String sql = "delete from good where goodId = ?";
		return BaseDao.execute(sql, goodId)>0;
	}
	/**
	 * 批量删除商品信息
	 */
	@Override
	public boolean delMuchGoods(List<Integer> goodIds) {
		// TODO Auto-generated method stub
		if(goodIds.size()>0) {
		Integer arr[] = new Integer[goodIds.size()];
		
		String sql = "delete from good where goodId in (";
		for (int i = 0 ;i<goodIds.size() ;i++) {
			sql += "?,";
			arr[i]=goodIds.get(i);
		}
		sql=sql.substring(0, sql.length()-1);
		sql += ")";
		int c = BaseDao.execute(sql, arr);
		return c>0;
		}else {
			return false;
		}
	}
	
	

}
