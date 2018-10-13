package com.etc.RentMarket.test;

import com.etc.RentMarket.dao.impl.GoodsDaoImpl;
import com.etc.RentMarket.entity.Good;

public class TestGood {
	public static void main(String[] args) {
		GoodsDaoImpl gd = new GoodsDaoImpl();
		System.out.println(gd.selectGoods());
		//System.out.println(gd.delGoods(14));
		Good good = new Good(35, 23, "24", "25", 26, "27");
		System.out.println(gd.upGoods(good));
	}

}
