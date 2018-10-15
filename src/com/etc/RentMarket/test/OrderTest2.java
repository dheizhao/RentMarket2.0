package com.etc.RentMarket.test;

import com.etc.RentMarket.service.OrderBackService;
import com.etc.RentMarket.service.impl.OrderBackServiceImpl;

public class OrderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderBackService o=new OrderBackServiceImpl();
		String orderIds="4,5";
		boolean flag=o.delMuchOrder(orderIds);
		System.out.println(flag);
	}

}
