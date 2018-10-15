package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.Goodstype;

public interface GoodService {
	public List<Good> selectGoods();//查询商品信息
	public boolean delGoods(int goodId);//删除商品信息
	public boolean delMuchGoods(List<Integer> goodIds);//批量删除商品信息
	public boolean upGoods(Good good);//更新商品信息
	public List<Goodstype> selGoodType();//查询商品类别信息
	public boolean upGoodsType(Goodstype goodstype);//更新商品类别信息
	public boolean delGoodsType(int goodtypeId);//删除商品类型信息
	public boolean delMuchGoodsType(List<Integer> goodIds);
	List<Good> getgoodsByGoodId(int goodId);
}
