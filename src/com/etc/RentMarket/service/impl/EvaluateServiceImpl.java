package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.EvaluateDao;
import com.etc.RentMarket.dao.impl.EvaluateDaoImpl;
import com.etc.RentMarket.entity.EvaluateBack;
import com.etc.RentMarket.entity.Reevaluate;
import com.etc.RentMarket.service.EvaluateService;

/**
 * 自定义商品评价EvaluateService实现类
 * 
 * @author 小白
 *
 */
public class EvaluateServiceImpl implements EvaluateService {
	EvaluateDao ed = new EvaluateDaoImpl();

	/**
	 * 后台得到所有评价方法
	 * 
	 * @return List 评价列表集合
	 */
	@Override
	public List<EvaluateBack> getEvaluates() {
		// TODO Auto-generated method stub
		return ed.getEvaluates();
	}

	/**
	 * 后台删除评价方法同时删除评价表和回复评价表
	 * 
	 * @param evaluateId
	 * @return true 操作成功 false 操作失败
	 */
	@Override
	public boolean DelEvaluate(int evaluateId) {
		// TODO Auto-generated method stub
		return ed.DelEvaluate(evaluateId);
	}

	// 以下是回复相关的操作
	/**
	 * 后台得到所有回复方法
	 * 
	 * @return List 回复列表集合
	 */
	@Override
	public List<Reevaluate> getREevaluate() {
		// TODO Auto-generated method stub
		return ed.getREevaluate();
	}

	/**
	 * 后台删除回复方法
	 * 
	 * @param cid
	 * @return true 操作成功 false 操作失败
	 */
	@Override
	public boolean DelREevaluate(int cid) {
		// TODO Auto-generated method stub
		return ed.DelREevaluate(cid);
	}
/**
 * 前台获取我的评论
 */
	@Override
	public List<EvaluateBack> getEvaluate(String userName, String goodName) {
		// TODO Auto-generated method stub
		return ed.qEvaluate(userName, goodName);
	}

}
