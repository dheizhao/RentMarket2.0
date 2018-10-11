package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.Uesrslist;
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
	 * 根据用户名查询用户信息
	 * @param userName
	 * @return
	 */
	List<User> getUserByUserName(String userName);
	/**
	 * @author 小白
	 * 后台得到所有用户方法
	 * @return List 用户列表集合
	 */
	public List<Uesrslist> getUesrs();
}
