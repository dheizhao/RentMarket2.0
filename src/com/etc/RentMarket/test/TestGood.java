package com.etc.RentMarket.test;

import com.etc.RentMarket.dao.impl.GoodsDaoImpl;

public class TestGood {
	public static void main(String[] args) {
		GoodsDaoImpl gd = new GoodsDaoImpl();
		System.out.println(gd.selectGoods());
	}

}
