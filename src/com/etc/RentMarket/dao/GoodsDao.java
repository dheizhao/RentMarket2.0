package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.Goodstype;
import com.etc.RentMarket.entity.PhoneGood;

public interface GoodsDao {
	public List<Good> selectGoods();//查询商品信息
	public boolean  delGoods(int goodId);//删除单个商品信息
	public boolean delMuchGoods(List<Integer> goodIds);//批量删除商品信息
	public boolean upGoods(Good good);//商品更新
	public List<Goodstype> selGoodType();//查询商品类型
	public boolean upGoodsType(Goodstype good);//商品类型更新
	public boolean  delGoodsType(int goodtypeId);//删除单个商品类型信息
	public boolean delMuchGoodsType(List<Integer> goodTypeIds);//批量删除商品类型信息
	
	List<Good> getgoodsByGoodId(int goodId);
}
