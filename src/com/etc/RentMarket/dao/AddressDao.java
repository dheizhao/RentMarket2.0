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
	/**
	 * 添加地址（用户详细信息）
	 * @param userName 登录名
	 * @param userRealName 收货人
	 * @param userAddress 地址
	 * @param userPhone 手机
	 * @return
	 */
	boolean addAddr(String userName,String userRealName,String userAddress,String userPhone);
	/**
	 * 修改地址
	 * @param userDetailId
	 * @param userRealName
	 * @param userAddress
	 * @param userPhone
	 * @return
	 */
	boolean updateAddr(int userDetailId,String userRealName,String userAddress,String userPhone);
	/**
	 * 删除地址
	 * @param userDetailId
	 * @return
	 */
	boolean deleteAddr(int userDetailId);
}
