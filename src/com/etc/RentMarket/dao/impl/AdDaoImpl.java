package com.etc.RentMarket.dao.impl;

import java.util.List;

import com.etc.RentMarket.DBUtil.BaseDao;
import com.etc.RentMarket.dao.AdDao;
import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.entity.Uesrslist;

public class AdDaoImpl implements AdDao {

	@Override
	public List<Ad> SelectAds() {
		// TODO Auto-generated method stub
		String sql = "select * from ad";
		List<Ad> list = (List<Ad>) BaseDao.select(sql, Ad.class);
		for (Ad ad : list) {
			if (ad.getAd_state().equals("0")) {
				ad.setAd_state("未激活");
			} else {
				ad.setAd_state("激活");
			} 
		}
		return list;
	}
	
	@Override
	public boolean AddAds(Ad a) {
		// TODO Auto-generated method stub
		String sql = "insert into ad(ad_content,ad_picture,ad_productor,ad_beginDate,ad_day,ad_state)values(?,?,?,now(),?,?)";
		return BaseDao.execute(sql, a.getad_content(),a.getad_picture(),a.getad_productor(),a.getAd_day(),a.getAd_state())>0;
	}
	
	@Override
	public boolean UpdAd(Ad a) {
		// TODO 自动生成的方法存根
		String sql = "update ad set ad_content=?,ad_picture=?,ad_productor=?,ad_endDate=now(),ad_day=?,ad_state=? where ad_id=?";
		return BaseDao.execute(sql,  a.getad_content(),a.getad_picture(),a.getad_productor(),a.getAd_day(),a.getAd_state(),a.getad_id())>0;
	}
	
	@Override
	public boolean DelAd(int ad_id) {
		// TODO Auto-generated method stub
		String sql = "delete from ad where ad_id=?";
		return BaseDao.execute(sql, ad_id)>0;
	}
	/**
	 * 后台批量删除广告
	 * @param ad_id
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean delMuchAd(String ad_id) {
		// TODO Auto-generated method stub
		String sql="delete from ad where ad_id in ("+ad_id+")";
		return BaseDao.execute(sql)>0;
	}
}
