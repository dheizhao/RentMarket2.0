package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.DBUtil.MD5Util;
import com.etc.RentMarket.dao.UsersDao;
import com.etc.RentMarket.entity.User;

/**
 * 自定义UsersDao实现类
 * @author 陈伟杰
 *
 */
public class UsersDaoImpl implements UsersDao{
/**
 * 添加用户
 */
	@Override
	public boolean addUsers(User u) {
		// TODO Auto-generated method stub
		String sql = "insert into users (userName, userPwd) VALUES (?, ?)";
		return BaseDao.execute(sql, u.getUserName(),u.getUserPwd())>0;
	}
	
	/**
	 * 用户名是否存在
	 */
		@Override
		public List<User> userCheck(String userName) {
			// TODO Auto-generated method stub
			String sql = "select * from users where userName=?";
			List<User> list = (List<User>) BaseDao.select(sql, User.class, userName);
			return list;
		}
}
