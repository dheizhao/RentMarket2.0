package com.etc.RentMarket.test;

import com.etc.RentMarket.dao.impl.SearchGoodsDaoImpl;

public class SearchLikeTest {
	public static void main(String[] args) {
		SearchGoodsDaoImpl sd = new SearchGoodsDaoImpl();
		System.out.println(sd.SelGoodByLike("111"));
	}

}
