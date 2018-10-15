package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.OrderBackDao;
import com.etc.RentMarket.entity.OrderBack;

/**
 * 自定义OrderBackDao实现类
 * 
 * @author 小白
 *
 */
public class OrderBackDaoImpl implements OrderBackDao {
	/**
	 * 后台得到所有订单方法
	 * 
	 * @return List 评价列表集合
	 */
	@Override
	public List<OrderBack> getOrders() {
		// TODO Auto-generated method stub
		String sql = "select * from orders";
		return (List<OrderBack>) BaseDao.select(sql, OrderBack.class);
	}

	/**
	 * 后台删除订单方法同时删除订单表和订单详情表
	 * 
	 * @param orderId
	 * @return true 操作成功 false 操作失败
	 */
	@Override
	public boolean DelOrderBack(int orderId) {
		// TODO Auto-generated method stub
		String sql = "delete orders,orderdetail from orders,orderdetail where orders.orderId=orderdetail.orderId and orders.orderId=?";
		return BaseDao.execute(sql, orderId) > 0;
	}

	/**
	 * 后台批量删除订单方法同时删除订单表和订单详情表
	 * @param orderIds
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean delMuchOrder(String orderIds) {	
		String sql="delete orders,orderdetail from orders,orderdetail where orders.orderId=orderdetail.orderId and orders.orderId in ("+orderIds+")";
		return BaseDao.execute(sql)>0;
	}
	/**
	 * 后台编辑订单的状态
	 * @param order
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean EditOrder(OrderBack order) {
		// TODO Auto-generated method stub
		String sql="update orders set orderState=? where orderId=?";
		return BaseDao.execute(sql, order.getOrderState(),order.getOrderId())>0;
	}

}
