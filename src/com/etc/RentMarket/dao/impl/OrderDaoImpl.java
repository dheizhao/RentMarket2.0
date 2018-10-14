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
@Override
public List<Order> selOrders() {
	// TODO Auto-generated method stub
	String sql = "select orderId,userName,userTel,userAddress,orderDate,orderTPrice,orderState from orders";
	return (List<Order>) BaseDao.select(sql, Order.class);
}
@Override
public boolean upOrders(Order order) {
	// TODO Auto-generated method stub
	String sql = "update orders  set userName=?,userTel=?,userAddress=?,orderDate=?,orderTPrice=?,orderState=? WHERE orderId=?";
	return BaseDao.execute(sql, order.getUserName(),order.getUserTel(),order.getUserAddress(),order.getOrderDate(),order.getOrderTPrice(),order.getOrderState(),order.getOrderId())>0;
}
@Override
public boolean delOrders(int orderId) {
	// TODO Auto-generated method stub
	String sql = "delete from orders where orderId=?";
	return BaseDao.execute(sql, orderId)>0;
}
@Override
public boolean delMuchOrders(List<Integer> ordersIds) {
	if(ordersIds.size()>0) {//如果选中的数量>0
		Integer arr[] = new Integer[ordersIds.size()];//创建一个数组，大小为选中的数量
		
		String sql = "delete from orders where orderId in (";//拼接sql语句
		for (int i = 0 ;i<ordersIds.size() ;i++) {
			sql += "?,";
			arr[i]=ordersIds.get(i);
		}
		sql=sql.substring(0, sql.length()-1);
		sql += ")";
		int c = BaseDao.execute(sql, arr);//进行删除操作
		return c>0;
		}else {
			return false;
		}
}

	

}
