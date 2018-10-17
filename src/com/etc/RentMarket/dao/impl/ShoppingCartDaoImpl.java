package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.ShoppingCartDao;
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.Shoppingcart;
/**
 * 自定义购物车ShoppingCartDao实现类
 * @author 小白
 *
 */
public class ShoppingCartDaoImpl implements ShoppingCartDao {
	/**
	 * 添加购物车
	 * @param cart 购物车对象
	 * @return true 添加成功    false 添加失败
	 */
	@Override
	public boolean addItem(Shoppingcart cart) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO shoppingcart (userId, goodId, goodNumber) SELECT DISTINCT shoppingcart.userId, ?, ? FROM shoppingcart, good, users WHERE users.userId = shoppingcart.userId AND good.goodId = shoppingcart.goodId AND shoppingcart.userId = ?";
		return BaseDao.execute(sql,cart.getGoodId(),cart.getGoodNumber(),cart.getUserId())>0;
	}
	/**
	 * 删除购物车的单件商品
	 * @param goodId 商品编号
	 * @return true 删除成功，false 删除失败
	 */
	
	@Override
	public boolean removeItem(int goodId) {
		// TODO Auto-generated method stub
		String sql="delete shoppingcart from users,shoppingcart,good where shoppingcart.userId=users.userId and shoppingcart.goodId=good.goodId and shoppingcart.goodId=?";
		return BaseDao.execute(sql, goodId)>0;
	}
	/**
	 * 显示购物车的界面
	 * @param userId 用户编号
	 * @return 购物车清单
	 */
	@Override
	public List<Shoppingcart> showShopCart(int userId) {
		// TODO Auto-generated method stub
		String sql="select good.goodName,good.goodImgAdd,good.goodPrice from shoppingcart,good,users where shoppingcart.goodId=good.goodId and users.userId=shoppingcart.userId and shoppingcart.userId=?";
		return (List<Shoppingcart>)BaseDao.select(sql, Shoppingcart.class, userId);
	}
	/**
	 * 更新购物车的商品数量信息
	 * @param cart 购物车对象
	 * @return true 操作成功,false 操作失败
	 */
	@Override
	public boolean updateItem(Shoppingcart cart) {
		// TODO Auto-generated method stub
		String sql="update shoppingcart,users,good set shoppingcart.goodNumber=? where shoppingcart.userId=users.userId and shoppingcart.goodId=good.goodId and shoppingcart.userId=?";
		return BaseDao.execute(sql, cart.getGoodNumber(),cart.getUserId())>0;
	}

}
