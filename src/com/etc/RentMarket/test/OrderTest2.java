package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.DBUtil.PageData;
import com.etc.RentMarket.entity.Order;
import com.etc.RentMarket.entity.OrderBack;
import com.etc.RentMarket.service.OrderBackService;
import com.etc.RentMarket.service.OrderService;
import com.etc.RentMarket.service.impl.OrderBackServiceImpl;
import com.etc.RentMarket.service.impl.OrderServiceImpl;

public class OrderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderBackService o=new OrderBackServiceImpl();
		List<OrderBack> list=o.getOrders();
		System.out.println(list);
	}

}
