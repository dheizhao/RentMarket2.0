package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.entity.EvaluateBack;
import com.etc.RentMarket.service.EvaluateService;
import com.etc.RentMarket.service.impl.EvaluateServiceImpl;

public class EvaluateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvaluateService es=new EvaluateServiceImpl();
		List<EvaluateBack> list=es.getEvaluates();
		System.out.println(list);
	}

}
