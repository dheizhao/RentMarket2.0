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

	@Override
	public List<Usersdetail> queryUserAddr(String userName) {
		// TODO Auto-generated method stub
		return ad.queryUserAddr(userName);
	}

}
