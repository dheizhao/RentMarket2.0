package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.UsersDao;
import com.etc.RentMarket.dao.impl.UsersDaoImpl;
import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.UsersService;
/**
 * UsersService的实现类
 * @author 陈伟杰
 *
 */
public class UsersServiceImpl implements UsersService{
	// 调用usersDao的方法
	UsersDao ud = new UsersDaoImpl();
	/**
	 * 添加用户
	 */
	@Override
	public boolean addUsers(User u) {
		// TODO Auto-generated method stub
		return ud.addUsers(u);
	}
	
	/**
	 * 查询用户名是否存在
	 */
		@Override
		public List<User> userCheck(String userName) {
			// TODO Auto-generated method stub
			
			return ud.userCheck(userName);
		}
	
}
