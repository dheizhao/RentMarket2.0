package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.UsersService;
import com.etc.RentMarket.service.impl.UsersServiceImpl;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//查询用户是否存在
		String userName = "azhuge";
		UsersService us = new UsersServiceImpl();
		List<User> list = us.userCheck(userName);
		if (list.size()!=0) {
			System.out.println("exist");
		}else {
			System.out.println("notExist");
		}

	}

}
