package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.PageData;
import com.etc.RentMarket.dao.OrderDao;
import com.etc.RentMarket.dao.impl.OrderDaoImpl;
import com.etc.RentMarket.entity.Order;
import com.etc.RentMarket.service.OrderService;

/**
 * 订单管理服务层接口的实现类
 * @author 陈伟杰
 *
 */
public class OrderServiceImpl implements OrderService{
	//创建订单dao的对象
	OrderDao od = new OrderDaoImpl();
/**
 * 根据用户名查询订单并分页+模糊查询
 */
	@Override
	public PageData<Order> queryOrdersByPage(int page, int pageSize, String userName, String keywords) {
		// TODO Auto-generated method stub
		return od.queryOrdersByPage(page, pageSize, userName, keywords);
	}
	/**
	 * 根据订单ID查询订单信息
	 */
	@Override
	public List<Order> queryOrdersByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return od.queryOrdersByOrderId(orderId);
	}
	@Override
	public List<Order> queryOrdersIdByuserName(String userName) {
		// TODO Auto-generated method stub
		return od.queryOrdersIdByuserName(userName);
	}
	@Override
	public List<Order> selOrders() {
		// TODO Auto-generated method stub
		return od.selOrders();
	}
	@Override
	public boolean upOrders(Order order) {
		// TODO Auto-generated method stub
		return od.upOrders(order);
	}
	@Override
	public boolean delOrders(int orderId) {
		// TODO Auto-generated method stub
		return od.delOrders(orderId);
	}
	@Override
	public boolean delMuchOrders(List<Integer> ordersIds) {
		// TODO Auto-generated method stub
		return od.delMuchOrders(ordersIds);
	}

	

}
