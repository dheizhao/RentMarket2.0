package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.impl.GoodsDaoImpl;
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.Goodstype;
import com.etc.RentMarket.service.GoodService;

public class GoodServiceImpl implements GoodService {
	GoodsDaoImpl gd= new GoodsDaoImpl();
	/**
	 * 商品查询
	 */
	@Override
	public List<Good> selectGoods() {
		// TODO Auto-generated method stub
		return gd.selectGoods();
	}
	/**
	 * 删除商品信息
	 */
	@Override
	public boolean delGoods(int goodId) {
		// TODO Auto-generated method stub
		return gd.delGoods(goodId);
	}
	/**
	 * 批量删除商品信息
	 */
	@Override
	public boolean delMuchGoods(List<Integer> goodIds) {
		// TODO Auto-generated method stub
		return gd.delMuchGoods(goodIds);
	}
	/**
	 * 更新商品信息
	 */
	@Override
	public boolean upGoods(Good good) {
		// TODO Auto-generated method stub
		return gd.upGoods(good);
	}
	@Override
	public List<Goodstype> selGoodType() {
		// TODO Auto-generated method stub
		return gd.selGoodType();
	}
	@Override
	public boolean upGoodsType(Goodstype goodstype) {
		// TODO Auto-generated method stub
		return gd.upGoodsType(goodstype);
	}
	@Override
	public boolean delGoodsType(int goodtypeId) {
		// TODO Auto-generated method stub
		return gd.delGoodsType(goodtypeId);
	}
	@Override
	public boolean delMuchGoodsType(List<Integer> goodIds) {
		// TODO Auto-generated method stub
		return gd.delMuchGoodsType(goodIds);
	}
	@Override
	public List<Good> getgoodsByGoodId(int goodId) {
		// TODO Auto-generated method stub
		return gd.getgoodsByGoodId(goodId);
	}
	@Override
	public List<Goodstype> selGoodTypeByTypeParentId(int typeparentId) {
		// TODO Auto-generated method stub
		return gd.selGoodTypeByTypeParentId(typeparentId);
	}

}
