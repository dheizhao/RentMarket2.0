package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.OrderBack;

/**
 * 自定义OrderBackDao接口
 * @author 小白
 *
 */
public interface OrderBackDao {
	/**
	 * 后台得到所有订单方法
	 * @return List 评价列表集合
	 */
	List<OrderBack> getOrders();
	
	/**
	 * 后台删除订单方法同时删除订单表和订单详情表
	 * @param orderId
	 * @return true 操作成功  false 操作失败
	 */
	boolean DelOrderBack(int orderId);
	/**
	 * 后台批量删除订单方法同时删除订单表和订单详情表
	 * @param orderIds
	 * @return true 操作成功  false 操作失败
	 */
	boolean delMuchOrder(String orderIds);
	/**
	 * 后台编辑订单的状态
	 * @param order
	 * @return true 操作成功  false 操作失败
	 */
	boolean EditOrder(OrderBack order);
}
