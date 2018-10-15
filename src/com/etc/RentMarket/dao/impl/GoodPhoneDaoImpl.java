package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.PhoneGoodDao;
import com.etc.RentMarket.entity.PhoneGood;

public class GoodPhoneDaoImpl implements PhoneGoodDao {

	@Override
	public List<PhoneGood> selectPhone() {
		// TODO Auto-generated method stub
		String sql = "select good.goodId,good.goodName,good.goodPrice,good.goodImgAdd from good INNER JOIN goodstype where good.typeId=goodstype.typeId and good.typeId=1";
		return (List<PhoneGood>) BaseDao.select(sql, PhoneGood.class);
	}

	

	

	

}
