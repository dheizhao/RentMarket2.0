package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.GoodsChecked;
import com.etc.RentMarket.entity.Goodstype;
import com.etc.RentMarket.entity.PhoneGood;

public interface GoodsDao {

	/**
	 * //查询商品信息
	 * @return
	 */
	public List<Good> selectGoods();
	/**
	 * //删除单个商品信息
	 * @param goodId
	 * @return
	 */
	public boolean  delGoods(int goodId);
	/**
	 * //批量删除商品信息
	 * @param goodIds
	 * @return
	 */
	public boolean delMuchGoods(List<Integer> goodIds);
	/**
	 * //商品更新
	 * @param good
	 * @return
	 */
	public boolean upGoods(Good good);
	/**
	 * //查询商品类型
	 * @return
	 */
	public List<Goodstype> selGoodType();
	/**
	 * //商品类型更新
	 * @param good
	 * @return
	 */
	public boolean upGoodsType(Goodstype good);
	/**
	 * //删除单个商品类型信息
	 * @param goodtypeId
	 * @return
	 */
	public boolean  delGoodsType(int goodtypeId);
	/**
	 * //批量删除商品类型信息
	 * @param goodTypeIds
	 * @return
	 */
	public boolean delMuchGoodsType(List<Integer> goodTypeIds);
	/**
	 * 商品审核信息
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

	
	public List<Goodstype> selGoodTypeByTypeParentId(int typeparentId);//通过父类型ID查询商品类型
	
	public List<Good> getgoodsByGoodId(int goodId);

}
