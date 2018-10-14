package com.etc.RentMarket.dao.impl;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.GoodsDao;
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.Goodstype;

public class GoodsDaoImpl implements GoodsDao {

	@Override
	public List<Good> selectGoods() {
		// TODO Auto-generated method stub
		String sql="select * from good";
		
		List<Good> list = (List<Good>) BaseDao.select(sql, Good.class);
//		for (Good good : list) {
//			if(good.getGoodState().equals("0")) {
//				good.setGoodState("待审核");
//			}else if (good.getGoodState().equals("1")) {
//				good.setGoodState("审核失败");
//			}else if(good.getGoodState().equals("2")){
//				good.setGoodState("审核通过");
//			}else {
//				good.setGoodState("");
//			}
		
	//}
		
		return list;
	}

	@Override
	public boolean delGoods(int goodId) {
		// TODO Auto-generated method stub
		String sql = "delete from good where goodId = ?";
		return BaseDao.execute(sql, goodId)>0;
	}
	/**
	 * 批量删除商品信息
	 */
	@Override
	public boolean delMuchGoods(List<Integer> goodIds) {//批量删除商品信息
		if(goodIds.size()>0) {//如果选中的数量>0
			Integer arr[] = new Integer[goodIds.size()];//创建一个数组，大小为选中的数量
			
			String sql = "delete from good where goodId in (";//拼接sql语句
			for (int i = 0 ;i<goodIds.size() ;i++) {
				sql += "?,";
				arr[i]=goodIds.get(i);
			}
			sql=sql.substring(0, sql.length()-1);
			sql += ")";
			//System.out.println(sql);
			int c = BaseDao.execute(sql, arr);//进行删除操作
			return c>0;
			}else {
				return false;
			}
	}

	@Override
	public boolean upGoods(Good good) {//商品更新方法
		// TODO Auto-generated method stub
		String sql = "update good set goodCount=?,goodImgAdd=?,goodName=?,goodPrice=?,goodState=?  where goodId=?";
		return BaseDao.execute(sql, good.getGoodCount(),good.getGoodImgAdd(),good.getGoodPrice(),good.getGoodPrice(),good.getGoodState(),good.getGoodId())>0;
	}

	@Override
	public List<Goodstype> selGoodType() {
		// TODO Auto-generated method stub
		String sql ="select * from goodstype";
		
		return (List<Goodstype>) BaseDao.select(sql, Goodstype.class);
	}

	@Override
	public boolean upGoodsType(Goodstype goodstype) {//商品类型更新
		String sql = "update goodstype set typeName=?,typeparentId=?  where typeId=?";
		return BaseDao.execute(sql, goodstype.getTypeName(),goodstype.getTypeparentId(),goodstype.getTypeId())>0;
	}

	@Override
	public boolean delGoodsType(int goodtypeId) {
		String sql = "delete from goodstype where typeId = ?";
		return BaseDao.execute(sql, goodtypeId)>0;
	}

	@Override
	public boolean delMuchGoodsType(List<Integer> goodTypeIds) {//批量删除商品类型信息
		if(goodTypeIds.size()>0) {//如果选中的数量>0
			Integer arr[] = new Integer[goodTypeIds.size()];//创建一个数组，大小为选中的数量
			
			String sql = "delete from goodstype where typeId in (";//拼接sql语句
			for (int i = 0 ;i<goodTypeIds.size() ;i++) {
				sql += "?,";
				arr[i]=goodTypeIds.get(i);
			}
			sql=sql.substring(0, sql.length()-1);
			sql += ")";
			int c = BaseDao.execute(sql, arr);//进行删除操作
			return c>0;
			}else {
				return false;
			}
	}
	
	

}
