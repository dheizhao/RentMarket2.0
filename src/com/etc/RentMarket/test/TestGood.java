package com.etc.RentMarket.test;

import com.etc.RentMarket.dao.impl.GoodsDaoImpl;

public class TestGood {
	public static void main(String[] args) {
		GoodsDaoImpl gd = new GoodsDaoImpl();
		//System.out.println(gd.selectGoods());
		//System.out.println(gd.delGoods(14));
//		Good good = new Good(35, 23, "24", "25", 26, "27");
//		System.out.println(gd.upGoods(good));
		//System.out.println(gd.selGoodType());
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(46);
//		list.add(47);
//		System.out.println(list);
//		System.out.println(gd.delMuchGoods(list));
//		GoodsChecked good = new GoodsChecked(47, "简约现代 文件柜 实木颗粒板 白色 3层 9格 9成新", "p2.jpg", "azhuges", "2013-10-02 16:14:37", "1");
//		System.out.println(gd.upGoodsChecked(good));
		System.out.println(gd.delGoodsChecked(51));
	}

}
