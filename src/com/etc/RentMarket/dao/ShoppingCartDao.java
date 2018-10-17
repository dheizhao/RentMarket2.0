package com.etc.RentMarket.dao;

import java.util.ArrayList;
import java.util.List;

import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.Shoppingcart;

/**
 * 自定义的购物车Dao接口
 * @author 小白
 *
 */
public interface ShoppingCartDao {
	

	
	/**
	 * 添加购物车
	 * @param cart 购物车对象
	 * @return true 添加成功   , false 添加失败
	 */
	boolean addItem(Shoppingcart cart);
	/**
	 * 删除购物车的商品
	 * @param goodId 商品编号
	 * @return true 删除成功,false 删除失败
	 */
	boolean removeItem(int goodId);
	/**
	 * 显示购物车的界面
	 * @param userId 用户编号
	 * @return 购物车清单
	 */
	List<Shoppingcart> showShopCart(int userId);
	/**
	 * 更新购物车的商品数量信息
	 * @param cart 购物车对象
	 * @return true 操作成功,false 操作失败
	 */
	boolean updateItem(Shoppingcart cart);
}
