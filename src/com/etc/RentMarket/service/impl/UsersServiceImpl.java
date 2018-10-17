package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.UsersDao;
import com.etc.RentMarket.dao.impl.UsersDaoImpl;
import com.etc.RentMarket.entity.Uesrslist;
import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.UsersService;

/**
 * UsersService的实现类
 * 
 * @author 陈伟杰
 *
 */
public class UsersServiceImpl implements UsersService {
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
	 * 根据用户名查询用户信息
	 */
	@Override
	public List<User> getUserByUserName(String userName) {
		// TODO Auto-generated method stub

		return ud.getUserByUserName(userName);
	}

	/**
	 * @author 小白 后台得到所有用户方法
	 * @return List 用户列表集合
	 */
	@Override
	public List<Uesrslist> getUesrs() {
		// TODO Auto-generated method stub
		return ud.getUesrs();
	}
	/**
	 * 后台编辑用户状态方法
	 * @author 小白
	 * @param userId
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean UpdateUesrStatus(Uesrslist u) {
		// TODO Auto-generated method stub
		return ud.UpdateUesrStatus(u);
	}
	/**
	 * 后台删除用户方法同时删除用户表和用户详情表
	 * @author 小白
	 * @param userId
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean DelUesr(int userId) {
		// TODO Auto-generated method stub
		return ud.DelUesr(userId);
	}
	/**
	 * 后台批量删除用户方法同时删除用户表和用户详情表
	 * @param userId
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean delMuchUesr(String userId) {
		// TODO Auto-generated method stub
		return ud.delMuchUesr(userId);
	}

	/**
	 * 通过用户名得到用户Id
	 * @param userName 用户名
	 * @return 用户Id
	 */
	@Override
	public int getUserIdByUserName(String userName) {
		// TODO Auto-generated method stub
		return ud.getUserIdByUserName(userName);
	}


	@Override
	public boolean uploadUserImg(String fileName, String userName) {
		// TODO Auto-generated method stub
		return ud.uploadUserImg(fileName, userName);
	}
}
