package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.Usersdetail;
/**
 * 地址管理服务层接口
 * @author 陈伟杰
 *
 */
public interface AddressService {
	/**
	 * 查询用户的地址信息
	 * @param userName
	 * @return
	 */
	List<Usersdetail> queryUserAddr(String userName);

}
