package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.AddressDao;
import com.etc.RentMarket.entity.Usersdetail;

/**
 * 地址管理dao的实现类
 * @author 陈伟杰
 *
 */
public class AddressDaoImpl implements AddressDao{
/**
 * 查询用户地址信息
 */
	@Override
	public List<Usersdetail> queryUserAddr(String userName) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM usersdetail where userName = ?";
		List<Usersdetail> list = (List<Usersdetail>) BaseDao.select(sql, Usersdetail.class, userName);
		return list;
	}
	
	
	/**
	 * 添加地址（用户详细信息）
	 * 
	 * 
	 */
@Override
public boolean addAddr(String userName, String userRealName, String userAddress, String userPhone) {
	// TODO Auto-generated method stub
	String sql = "insert into usersdetail (userName,userPhone,userAddress,userRealName) values (?,?,?,?)";
	return BaseDao.execute(sql,userName,userRealName,userAddress,userPhone)>0;
}
/**
 * 修改地址
 */

	@Override
	public boolean updateAddr(int userDetailId, String userRealName, String userAddress, String userPhone) {
		// TODO Auto-generated method stub
		String sql = "update usersdetail set userPhone = ?,userAddress = ?,userRealName = ? where userDetailId = ?";
		return BaseDao.execute(sql, userPhone,userAddress,userRealName,userDetailId)>0;
	}

/**
 * 删除地址
 */
	@Override
	public boolean deleteAddr(int userDetailId) {
		// TODO Auto-generated method stub
		String sql = "delete from usersdetail where userDetailId = ?";
		return BaseDao.execute(sql, userDetailId)>0;
	}


}
