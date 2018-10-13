package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.service.AdService;
import com.etc.RentMarket.service.impl.AdServiceImpl;

public class AdTest {
	public static void main(String[] args) {
		AdService as = new AdServiceImpl();
		List<Ad> list = as.SelectAds();
		System.out.println(list);
	}

}
