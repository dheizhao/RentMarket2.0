package com.etc.RentMarket.test;

import java.util.ArrayList;
import java.util.List;

import com.etc.RentMarket.service.impl.GoodServiceImpl;

public class TestDelMuchGoods {
	public static void main(String[] args) {
		GoodServiceImpl gdi = new GoodServiceImpl();
		List<Integer> goodIds = new ArrayList<Integer>();
		goodIds.add(27);
		goodIds.add(28);

		System.out.println(gdi.delMuchGoods(goodIds));
		
//		int a[] = new int[] {1,11,5,14,-1,9,21};
//        System.out.println("比number大的数的个数："+getLagerNum(9,a));

	
	}
//	public static int getLagerNum(int number,int... items){  //若除了可变长参数还有其它参数，可变长参数一定要放在最后
//        int sum = 0;
//    	for(int item : items){
//    		if(item > number){
//    			sum++;
//    		}
//    	}
//    	return sum;
//	}
}
