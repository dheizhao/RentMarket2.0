package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.OrderBack;

/**
 * 自定义OrderBackService接口
 * @author 小白
 *
 */
public interface OrderBackService {
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
}
