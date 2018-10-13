package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.Admin;

/**
 * 管理员Dao接口
 * @author 小白
 *
 */
public interface AdminDao {
	/**
	 * 管理员登录方法
	 * @param admin 管理员
	 * @return null 登录失败
	 */
	List<Admin> adminLogin(Admin admin);
}
