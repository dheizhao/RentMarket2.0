package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.Good;

public interface GoodsDao {
	public List<Good> selectGoods();//查询商品信息
	public boolean  delGoods(int goodId);//删除单个商品信息
	public boolean delMuchGoods(List<Integer> goodIds);//批量删除商品信息
	public boolean upGoods(Good good);
}
