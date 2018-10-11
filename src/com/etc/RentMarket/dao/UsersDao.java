package com.etc.RentMarket.dao;

import java.util.List;

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
	 * 用户名是否存在
	 * @param userName
	 * @return
	 */
	List<User> userCheck(String userName);
}
