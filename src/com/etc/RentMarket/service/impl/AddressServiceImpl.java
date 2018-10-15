package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.AddressDao;
import com.etc.RentMarket.dao.impl.AddressDaoImpl;
import com.etc.RentMarket.entity.Usersdetail;
import com.etc.RentMarket.service.AddressService;
/**
 * 地址管理服务层接口的实现类
 * @author 陈伟杰
 *
 */
public class AddressServiceImpl implements AddressService{
	AddressDao ad = new AddressDaoImpl();
/**
 * 查询地址信息
 */
	@Override
	public List<Usersdetail> queryUserAddr(String userName) {
		// TODO Auto-generated method stub
		return ad.queryUserAddr(userName);
	}
/**
 * 添加地址
 */
	@Override
	public boolean addAddr(String userName, String userRealName, String userAddress, String userPhone) {
		// TODO Auto-generated method stub
		return ad.addAddr(userName, userRealName, userAddress, userPhone);
	}
	/**
	 * 修改地址
	 */
@Override
public boolean updateAddr(int userDetailId, String userRealName, String userAddress, String userPhone) {
	// TODO Auto-generated method stub
	return ad.updateAddr(userDetailId, userRealName, userAddress, userPhone);
}
/**
 * 删除地址
 */
@Override
public boolean deleteAddr(int userDetailId) {
	// TODO Auto-generated method stub
	return ad.deleteAddr(userDetailId);
}

}
