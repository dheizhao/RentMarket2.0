package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
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
		String sql = "insert into users (userName, userPwd,userRegisterTime) VALUES (?, ?,now())";
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
		String sql = "select u1.userId,u1.userName,u2.userPhone,u2.userAddress,u1.userRegisterTime,u1.userState from users u1,usersdetail u2 where u1.userName=u2.userName";
		List<Uesrslist> list=(List<Uesrslist>) BaseDao.select(sql, Uesrslist.class);
		for (Uesrslist user : list) {
			if (user.getUserState().equals("0")) {
				user.setUserState("禁用");
			} else if (user.getUserState().equals("1")) {
				user.setUserState("启用");
			} 
		}
		return list;

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
		String sql="update users set userState=? where userId=?";
		return BaseDao.execute(sql, u.getUserState(),u.getUserId())>0;
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
		String sql="delete users,usersdetail from users,usersdetail where users.userId=? and users.userName=usersdetail.userName ";
		return BaseDao.execute(sql, userId)>0;
	}
	/**
	 * 后台批量删除用户方法同时删除用户表和用户详情表
	 * @param userId
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean delMuchUesr(String userId) {
		// TODO Auto-generated method stub
		String sql="delete users,usersdetail from users,usersdetail where users.userName=usersdetail.userName and users.userId in ("+userId+")";
		return BaseDao.execute(sql)>0;
	}

	/**
	 * 通过用户名得到用户Id
	 * @param userName 用户名
	 * @return 用户Id
	 */
	@Override
	public int getUserIdByUserName(String userName) {
		// TODO Auto-generated method stub
		String sql="select * from users where userName=?";
		List<User> list = (List<User>)BaseDao.select(sql,  User.class, userName);
		int userId=list.get(0).getUserId();
		return userId;
	}

/**
 * 上传头像
 */
	@Override
	public boolean uploadUserImg(String fileName,String userName) {
		// TODO Auto-generated method stub
		String sql = "update users set userphoto = ? where userName = ?";
		return BaseDao.execute(sql, fileName,userName)>0;
	}
}
