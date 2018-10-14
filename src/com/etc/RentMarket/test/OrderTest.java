package com.etc.RentMarket.test;

import java.util.ArrayList;
import java.util.List;

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
		
		
//		int orderId = 1;
//		List<Order> list = os.queryOrdersByOrderId(orderId);
//		for (Order order : list) {
//			System.out.println(order);
//		}
//		Order order = new Order(1, "2018-10-14", 11, 11, "11", "11", "11");
//		System.out.println(os.upOrders(order));
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		System.out.println(os.delMuchOrders(list));
	}

}
