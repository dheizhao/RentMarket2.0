package com.etc.RentMarket.dao;

import java.util.List;

import com.etc.RentMarket.entity.Uesrslist;
import com.etc.RentMarket.entity.User;

/**
 * 自定义dao的接口
 * 
 * @author 陈伟杰
 *
 */
public interface UsersDao {
/**
 * 添加用户
 * @param u 用户对象
 * @return 是否添加成功
 */
	boolean addUsers(User u);
	
	/**
	 * 根据用户名查询用户信息
	 * @param userName
	 * @return
	 */
	List<User> getUserByUserName(String userName);
	
	/**
	 * 后台得到所有用户方法
	 * @author 小白
	 * @return List 用户列表集合
	 */
	public List<Uesrslist> getUesrs();
	
}
