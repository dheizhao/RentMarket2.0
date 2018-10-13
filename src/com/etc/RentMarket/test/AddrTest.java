package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.entity.Usersdetail;
import com.etc.RentMarket.service.AddressService;
import com.etc.RentMarket.service.impl.AddressServiceImpl;

public class AddrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "azhuge";
		String userRealName = "俊溪";
		String userAddress = "上海";
		String userPhone = "12544485230";
		AddressService as = new AddressServiceImpl();
		boolean flag = as.addAddr(userName, userRealName, userAddress, userPhone);
		if (flag) {
			System.out.println("success");
		}else {
			System.out.println("f");
		}
	}

}
