package com.etc.RentMarket.test;

import com.etc.RentMarket.service.impl.GoodPhoneServiceImpl;

public class TestGoodPhone {
	public static void main(String[] args) {
		GoodPhoneServiceImpl gd = new GoodPhoneServiceImpl();
		System.out.println(gd.selectPhone());
	}

}
