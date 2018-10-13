package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.AdminDao;
import com.etc.RentMarket.dao.impl.AdminDaoImpl;
import com.etc.RentMarket.entity.Admin;
import com.etc.RentMarket.service.AdminService;

/**
 * AdminService实现类
 * 
 * @author 小白
 *
 */
public class AdminServiceImpl implements AdminService {
	AdminDao ad=new AdminDaoImpl();
	/**
	 * 管理员登录方法
	 * @param admin 管理员
	 * @return null 登录失败
	 */
	@Override
	public List<Admin> adminLogin(Admin admin) {
		// TODO Auto-generated method stub
		return ad.adminLogin(admin);
	}
}
