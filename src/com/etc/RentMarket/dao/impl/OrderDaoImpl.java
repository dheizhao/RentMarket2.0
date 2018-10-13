package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.DBUtil.PageData;
import com.etc.RentMarket.dao.OrderDao;
import com.etc.RentMarket.entity.Order;

/**
 * 订单管理dao的实现类
 * @author 陈伟杰
 *
 */
public class OrderDaoImpl implements OrderDao{
/**
 * 根据用户名查询订单并分页+模糊查询
 */
	@Override
	public PageData<Order> queryOrdersByPage(int page, int pageSize, String userName, String keywords) {
		// TODO Auto-generated method stub
		String sql = "SELECT orders.orderId,orders.orderDate,orders.orderState,orders.orderTPrice,orders.userAddress,orders.userName,orders.userTel,orderdetail.goodName,orderdetail.rentDate,orderdetail.goodNumber,orderdetail.goodImg " + 
				" FROM orders " + 
				" INNER JOIN orderdetail " + 
				" ON orders.orderId = orderdetail.orderId " + 
				" WHERE orders.userName = ? " +
				" and orderdetail.goodName like ?";
		PageData<Order> pd = BaseDao.getPage(sql, page, pageSize,Order.class,userName,"%" + keywords + "%");
		return pd;
	}
/**
 * 
 *	  根据订单ID查询订单信息
 *	 
 */
@Override
public List<Order> queryOrdersByOrderId(int orderId) {
	// TODO Auto-generated method stub
	String sql = "SELECT orders.orderId,orders.orderDate,orders.orderState,orders.orderTPrice,orders.userAddress,orders.userName,orders.userTel,orderdetail.goodName,orderdetail.rentDate,orderdetail.goodNumber " + 
			" FROM orders " + 
			" INNER JOIN orderdetail " + 
			" ON orders.orderId = orderdetail.orderId " + 
			" WHERE orders.orderId = ?";
	List<Order> list = (List<Order>) BaseDao.select(sql, Order.class, orderId);
	return list;
}
/**
 * 根据用户名查询订单id
 */
@Override
public List<Order> queryOrdersIdByuserName(String userName) {
	// TODO Auto-generated method stub
	String sql = "SELECT orders.orderId FROM orders WHERE orders.userName = ?";
	List<Order> list = (List<Order>) BaseDao.select(sql, Order.class, userName);
	return list;
}

	

}
