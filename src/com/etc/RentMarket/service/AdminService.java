package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.Admin;

/**
 * AdminService接口
 * @author 小白
 *
 */
public interface AdminService {
	/**
	 * 管理员登录方法
	 * @param admin 管理员
	 * @return null 登录失败
	 */
	List<Admin> adminLogin(Admin admin);
}
