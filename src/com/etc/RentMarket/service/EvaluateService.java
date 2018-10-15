package com.etc.RentMarket.service;

import java.util.List;

import com.etc.RentMarket.entity.EvaluateBack;
import com.etc.RentMarket.entity.Reevaluate;

/**
 * 自定义商品评价EvaluateService接口
 * 
 * @author 小白
 *
 */
public interface EvaluateService {
	/**
	 * 后台得到所有评价方法
	 * 
	 * @return List 评价列表集合
	 */
	List<EvaluateBack> getEvaluates();

	/**
	 * 后台删除评价方法同时删除评价表和回复评价表
	 * 
	 * @param evaluateId
	 * @return true 操作成功 false 操作失败
	 */
	boolean DelEvaluate(int evaluateId);
	/**
	 * 后台批量删除评价方法同时删除评价表和回复评价表
	 * @param evaluateId
	 * @return true 操作成功  false 操作失败
	 */
	boolean delMuchEvaluate(String evaluateId);
	// 以下是回复相关的操作
	/**
	 * 后台得到所有回复方法
	 * 
	 * @return List 回复列表集合
	 */
	List<Reevaluate> getREevaluate();

	/**
	 * 后台删除回复方法
	 * 
	 * @param cid
	 * @return true 操作成功 false 操作失败
	 */
	boolean DelREevaluate(int cid);
	/**
	 * 后台批量删除回复评价方法
	 * @param cid
	 * @return true 操作成功  false 操作失败
	 */
	boolean delMuchEvaluateci(String cid);
}
