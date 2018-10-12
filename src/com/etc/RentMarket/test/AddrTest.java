package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.entity.Usersdetail;
import com.etc.RentMarket.service.AddressService;
import com.etc.RentMarket.service.impl.AddressServiceImpl;

public class AddrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "mada";
		AddressService as = new AddressServiceImpl();
		List<Usersdetail> list = as.queryUserAddr(userName);
		for (Usersdetail usersdetail : list) {
			System.out.println(usersdetail);
		}
	}

}
