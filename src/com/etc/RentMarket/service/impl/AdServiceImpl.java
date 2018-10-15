package com.etc.RentMarket.service.impl;

import java.util.List;

import com.etc.RentMarket.dao.AdDao;
import com.etc.RentMarket.dao.impl.AdDaoImpl;
import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.service.AdService;

public class AdServiceImpl implements AdService {
	private AdDao ad= new AdDaoImpl();
	/**
	 * 广告信息查询
	 */
	@Override
	public List<Ad> SelectAds() {
		// TODO Auto-generated method stub
		return ad.SelectAds();
	}

	@Override
	public boolean AddAds(Ad a) {
		// TODO Auto-generated method stub
		return ad.AddAds(a);
	}
	
	@Override
	public boolean UpdAd(Ad a) {
		// TODO 自动生成的方法存根
		return ad.UpdAd(a);
	}
	
	@Override
	public boolean DelAd(int ad_id) {
		// TODO Auto-generated method stub
		return ad.DelAd(ad_id);
	}
	/**
	 * 后台批量删除广告
	 * @param ad_id
	 * @return true 操作成功  false 操作失败
	 */
	@Override
	public boolean delMuchAd(String ad_id) {
		// TODO Auto-generated method stub
		return ad.delMuchAd(ad_id);
	}
}
