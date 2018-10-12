package com.etc.RentMarket.service;


import java.util.List;

import com.etc.RentMarket.DBUtil.PageData;
import com.etc.RentMarket.entity.Order;

/**
 * 订单管理服务层接口
 * @author 陈伟杰
 *
 */
public interface OrderService {
	/**
	 * 根据用户名查询订单并分页+模糊查询
	 * @param page 页数
	 * @param pageSize 一页的记录数
	 * @param userName 用户名
	 * @param keywords 关键字
	 * @return
	 */
	PageData<Order> queryOrdersByPage(int page, int pageSize,String userName,String keywords);
	
	
	/**
	 * 根据订单ID查询订单信息
	 * @param orderId 订单编号
	 * @return
	 */
	List<Order> queryOrdersByOrderId(int orderId);
	
	/**
	 * 根据用户名查询订单id
	 * @param userName
	 * @return
	 */
	List<Order> queryOrdersIdByuserName(String userName);
}
