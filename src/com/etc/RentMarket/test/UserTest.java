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
		String fileName = "b.jpg";
		UsersService us = new UsersServiceImpl();
		boolean flag = us.uploadUserImg(fileName, userName);
		if (flag) {
			System.out.println("success");
		}else {
			System.out.println("notExist");
		}

	}

}
