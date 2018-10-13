package com.etc.RentMarket.test;

import java.util.List;

import com.etc.RentMarket.entity.Admin;
import com.etc.RentMarket.service.AdminService;
import com.etc.RentMarket.service.impl.AdminServiceImpl;

/**
 * 管理员登录测试
 * 
 * @author 小白
 *
 */
public class AdminTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminService as = new AdminServiceImpl();
		Admin admin=new Admin("admin", "admin");
		List<Admin> list=as.adminLogin(admin);
		System.out.println(list);
	}

}
