package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.User;
/**
 * 用户服务层接口
 * @author 陈伟杰
 *
 */
public interface UsersService {
/**
 * 添加用户
 * @param u
 * @return
 */
	boolean addUsers(User u);
	
	/**
	 * 用户名是否存在
	 * @param userName
	 * @return
	 */
	List<User> userCheck(String userName);
}
