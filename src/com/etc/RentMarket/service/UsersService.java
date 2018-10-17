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
	/**
	 * 后台编辑用户状态方法
	 * @author 小白
	 * @param User
	 * @return true 操作成功  false 操作失败
	 */
	boolean UpdateUesrStatus(Uesrslist u);
	/**
	 * 后台删除用户方法同时删除用户表和用户详情表
	 * @author 小白
	 * @param userId
	 * @return true 操作成功  false 操作失败
	 */
	boolean DelUesr(int userId);
	/**
	 * 后台批量删除用户方法同时删除用户表和用户详情表
	 * @param userId
	 * @return true 操作成功  false 操作失败
	 */
	boolean delMuchUesr(String userId);

	/**
	 * 通过用户名得到用户Id
	 * @param userName 用户名
	 * @return 用户Id
	 */
	int getUserIdByUserName(String userName);

	
	/**
	 * 上传用户头像
	 * @param fileName
	 * @return
	 */
	boolean uploadUserImg(String fileName,String userName);
}
