package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.OrderBackDao;
import com.etc.RentMarket.dao.impl.OrderBackDaoImpl;
import com.etc.RentMarket.entity.OrderBack;
import com.etc.RentMarket.service.OrderBackService;
/**
 * 自定义OrderBackService实现类
 * @author 小白
 *
 */
public class OrderBackServiceImpl implements OrderBackService {
	OrderBackDao ob=new OrderBackDaoImpl();
	/**
	 * 后台得到所有订单方法
	 * @return List 评价列表集合
	 */
	@Override
	public List<OrderBack> getOrders() {
		// TODO Auto-generated method stub
		return ob.getOrders();
	}
	/**
	 * 后台删除订单方法同时删除订单表和订单详情表
	 * @param orderId
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean DelOrderBack(int orderId) {
		// TODO Auto-generated method stub
		return ob.DelOrderBack(orderId);
	}
	/**
	 * 后台批量删除订单方法同时删除订单表和订单详情表
	 * @param orderIds
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean delMuchOrder(String orderIds) {
		// TODO Auto-generated method stub
		return ob.delMuchOrder(orderIds);
	}
	/**
	 * 后台编辑订单的状态
	 * @param order
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean EditOrder(OrderBack order) {
		// TODO Auto-generated method stub
		return ob.EditOrder(order);
	}
}
