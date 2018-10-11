package com.etc.RentMarket.dao.impl;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.DBUtil.MD5Util;
import com.etc.RentMarket.dao.UsersDao;
import com.etc.RentMarket.entity.User;

public class UsersDaoImpl implements UsersDao{

	@Override
	public boolean addUsers(User u) {
		// TODO Auto-generated method stub
		String sql = "insert into users (userName, userPwd) VALUES (?, ?)";
		return BaseDao.execute(sql, u.getUserName(),u.getUserPwd())>0;
	}
}
