package com.etc.RentMarket.dao;
/**
 * 地址管理dao接口
 * @author 陈伟杰
 *
 */

import java.util.List;

import com.etc.RentMarket.entity.Usersdetail;

public interface AddressDao {
	/**
	 * 查询用户的地址信息
	 * @param userName
	 * @return
	 */
	List<Usersdetail> queryUserAddr(String userName);

}
