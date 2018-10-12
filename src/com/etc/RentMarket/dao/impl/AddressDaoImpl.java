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

}
