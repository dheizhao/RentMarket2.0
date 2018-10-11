package com.etc.RentMarket.service.impl;

import com.etc.RentMarket.dao.UsersDao;
import com.etc.RentMarket.dao.impl.UsersDaoImpl;
import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.UsersService;

public class UsersServiceImpl implements UsersService{

	UsersDao ud = new UsersDaoImpl();
	@Override
	public boolean addUsers(User u) {
		// TODO Auto-generated method stub
		return ud.addUsers(u);
	}
	
}
