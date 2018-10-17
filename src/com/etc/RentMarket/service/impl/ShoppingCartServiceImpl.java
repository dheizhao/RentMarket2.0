package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.ShoppingCartDao;
import com.etc.RentMarket.dao.impl.ShoppingCartDaoImpl;
import com.etc.RentMarket.entity.Shoppingcart;
import com.etc.RentMarket.service.ShoppingCartService;
/**
 * 自定义购物车ShoppingCartService实现类
 * @author 小白
 *
 */
public class ShoppingCartServiceImpl implements ShoppingCartService {
	//创建ShoppingCartDaoImpl的对象
	ShoppingCartDao sc=new ShoppingCartDaoImpl();
	/**
	 * 添加购物车
	 * @param cart 购物车对象
	 * @return true 添加成功   , false 添加失败
	 */
	@Override
	public boolean addItem(Shoppingcart cart) {
		// TODO Auto-generated method stub
		return sc.addItem(cart);
	}
	/**
	 * 删除购物车的商品
	 * @param goodId 商品编号
	 * @return true 删除成功,false 删除失败
	 */
	@Override
	public boolean removeItem(int goodId) {
		// TODO Auto-generated method stub
		return sc.removeItem(goodId);
	}
	/**
	 * 显示购物车的界面
	 * @param userId 用户编号
	 * @return 购物车清单
	 */
	@Override
	public List<Shoppingcart> showShopCart(int userId) {
		// TODO Auto-generated method stub
		return sc.showShopCart(userId);
	}
	/**
	 * 更新购物车的商品数量信息
	 * @param cart 购物车对象
	 * @return true 操作成功,false 操作失败
	 */
	@Override
	public boolean updateItem(Shoppingcart cart) {
		// TODO Auto-generated method stub
		return sc.updateItem(cart);
	}

}
