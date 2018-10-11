package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.DBUtil.MD5Util;
import com.etc.RentMarket.dao.UsersDao;
import com.etc.RentMarket.entity.Uesrslist;
import com.etc.RentMarket.entity.User;

/**
 * 自定义UsersDao实现类
 * 
 * @author 陈伟杰
 *
 */
public class UsersDaoImpl implements UsersDao {
	/**
	 * 添加用户
	 */
	@Override
	public boolean addUsers(User u) {
		// TODO Auto-generated method stub
		String sql = "insert into users (userName, userPwd) VALUES (?, ?)";
		return BaseDao.execute(sql, u.getUserName(), u.getUserPwd()) > 0;
	}

	/**
	 * 根据用户名查询用户信息
	 */
	@Override
	public List<User> getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		String sql = "select * from users where userName=?";
		List<User> list = (List<User>) BaseDao.select(sql, User.class, userName);
		return list;
	}

	/**
	 * 后台得到所有用户方法
	 * 
	 * @author 小白
	 * @return List 用户列表集合
	 */
	@Override
	public List<Uesrslist> getUesrs() {
		// TODO Auto-generated method stub
		String sql="select u1.userId,u1.userName,u2.userPhone,u2.userAddress,u1.userRegisterTime,u1.userState from users u1,usersdetail u2 where u1.userId=u2.userId";
		return (List<Uesrslist>)BaseDao.select(sql, Uesrslist.class);
	}

}
