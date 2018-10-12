package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.DBUtil.PageData;
import com.etc.RentMarket.entity.Order;
import com.etc.RentMarket.service.OrderService;
import com.etc.RentMarket.service.impl.OrderServiceImpl;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderService os = new OrderServiceImpl();
		/*String userName = "azhuge";
		int page = 1;
		int pageSize = 2;
		String keywords = "";
		OrderService os = new OrderServiceImpl();
		PageData<Order> pd = os.queryOrdersByPage(page, pageSize, userName, keywords);
		System.out.println(pd);*/
		
		
		int orderId = 1;
		List<Order> list = os.queryOrdersByOrderId(orderId);
		for (Order order : list) {
			System.out.println(order);
		}
	}

}
