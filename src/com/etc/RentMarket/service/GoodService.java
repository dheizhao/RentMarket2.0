package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.GoodsChecked;
import com.etc.RentMarket.entity.Goodstype;

public interface GoodService {
	public List<Good> selectGoods();//查询商品信息
	public boolean delGoods(int goodId);//删除商品信息
	public boolean delMuchGoods(List<Integer> goodIds);//批量删除商品信息
	public boolean upGoods(Good good);//更新商品信息
	public List<Goodstype> selGoodType();//查询商品类别信息
	public List<Goodstype> selGoodTypeByTypeParentId(int typeparentId);//通过父类型ID查询商品类型
	public boolean upGoodsType(Goodstype goodstype);//更新商品类别信息
	public boolean delGoodsType(int goodtypeId);//删除商品类型信息
	/**
	 * 批量删除商品类型
	 * @param goodIds 商品类型Id数组
	 * @return
	 */
	public boolean delMuchGoodsType(List<Integer> goodIds);

	/**
	 *	查询商品审核信息
	 * @return
	 */
	public List<GoodsChecked> selGoodsChecked();
	
	/**
	 * 删除商品审核信息
	 * @param goodId
	 * @return
	 */
	public boolean  delGoodsChecked(int goodId);
	/**
	 * 批量删除商品审核信息
	 * @param goodIds
	 * @return
	 */
	public boolean delMuchGoodsChecked(List<Integer> goodIds);
	/**
	 * 更新商品审核信息
	 * @param good
	 * @return
	 */
	public boolean upGoodsChecked(GoodsChecked good);
	
	

	List<Good> getgoodsByGoodId(int goodId);
	
	

}
