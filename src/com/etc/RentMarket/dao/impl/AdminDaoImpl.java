package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.AdminDao;
import com.etc.RentMarket.entity.Admin;
/**
 * AdminDao实现类
 * @author 小白
 *
 */
public class AdminDaoImpl implements AdminDao {
	/**
	 * 管理员登录方法
	 * @param admin 管理员
	 * @return null 登录失败
	 */
	@Override
	public List<Admin> adminLogin(Admin admin) {
		// TODO Auto-generated method stub
		String sql="select * from admin where admin=? and adminPwd=?";
		return (List<Admin>)BaseDao.select(sql, Admin.class, admin.getAdmin(),admin.getAdminPwd());
	}

}
