package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.EvaluateDao;
import com.etc.RentMarket.entity.EvaluateBack;
import com.etc.RentMarket.entity.Reevaluate;
/**
 * 自定义商品评价Dao实现类
 * @author 小白
 * 
 */
public class EvaluateDaoImpl implements EvaluateDao {
	/**
	 * 后台得到所有评价方法
	 * @return List 评价列表集合
	 */
	@Override
	public List<EvaluateBack> getEvaluates() {
		// TODO Auto-generated method stub
		String sql="select evaluate.evaluateId,good.goodName,evaluate.evaluateContent,evaluate.evaluateDate,users.userName from evaluate,good,users where evaluate.goodId=good.goodId and evaluate.userId=users.userId";
		return (List<EvaluateBack>)BaseDao.select(sql, EvaluateBack.class);
	}
	/**
	 * 后台删除评价方法同时删除评价表和回复评价表
	 * @param evaluateId
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean DelEvaluate(int evaluateId) {
		// TODO Auto-generated method stub
		String sql="delete evaluate,reevaluate from evaluate,reevaluate where evaluate.evaluateId=reevaluate.evaluateId and evaluate.evaluateId=?";
		return BaseDao.execute(sql, evaluateId)>0;
	}
	//以下是回复相关的操作
		/**
		 * 后台得到所有回复方法
		 * @return List 回复列表集合
		 */
		@Override
		public List<Reevaluate> getREevaluate() {
			// TODO Auto-generated method stub
			String sql="select reevaluate.cid,users.userName,evaluate.evaluateContent,reevaluate.content,reevaluate.date from reevaluate,evaluate,users where reevaluate.lastuserId=users.userId and reevaluate.evaluateId=evaluate.evaluateId";
			return (List<Reevaluate>)BaseDao.select(sql, Reevaluate.class);
		}
		
		/**
		 * 后台删除回复方法
		 * @param cid
		 * @return true 操作成功  false 操作失败
		 */
		@Override
		public boolean DelREevaluate(int cid) {
			// TODO Auto-generated method stub
			String sql="delete from reevaluate where cid=?";
			return BaseDao.execute(sql, cid)>0;
		}
}
