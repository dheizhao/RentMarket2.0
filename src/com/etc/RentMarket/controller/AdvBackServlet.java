package com.etc.RentMarket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.RentMarket.DBUtil.MyData;
import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.service.AdService;
import com.etc.RentMarket.service.impl.AdServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class AdServlet
 */
@WebServlet("/as.do")
public class AdvBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdService as = new AdServiceImpl();
	boolean flag;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdvBackServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		String op = "";
		if (request.getParameter("op") != null) {
			op = request.getParameter("op");
		}
		// 1、显示用户信息
		if ("".equals(op)) {
			doGetAds(request, response);
		} else if ("add".equals(op)) {
			doAddAds(request, response);

		} else if ("upd".equals(op)) {
			doUpdAds(request, response);
		} else if ("del".equals(op)) {
			doDelAds(request, response);
		}
		// 5、批量删除订单信息
		else if ("MuchDel".equals(op)) {
			doMuchDelAds(request, response);
		}
	}

	/**
	 * 1、显示广告信息
	 */
	protected void doGetAds(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Ad> list = as.SelectAds();
		// Ajax来实现
		// 返回数据最好是json格式 外部的jar包 gson
		MyData<Ad> md = new MyData<Ad>();
		md.setData(list);
		Gson gson = new Gson();
		String jsonString = gson.toJson(md);
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		out.print(jsonString);
		out.close();
	}

	/**
	 * 2、添加广告信息
	 */
	protected void doAddAds(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ad_content = request.getParameter("content");
		String ad_picture = request.getParameter("picture");
		String ad_productor = request.getParameter("productor");
		int ad_day = Integer.parseInt(request.getParameter("day"));
		String ad_state = request.getParameter("adStatus");
		Ad a = new Ad(ad_content, ad_picture, ad_productor, ad_day, ad_state);
		flag = as.AddAds(a);
	}

	/**
	 * 3、修改广告内容及其他信息
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doUpdAds(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int ad_id = Integer.parseInt(request.getParameter("ad_id"));
		String ad_content = request.getParameter("content");
		String ad_picture = request.getParameter("picture");
		String ad_productor = request.getParameter("productor");
		int ad_day = Integer.parseInt(request.getParameter("day"));
		String ad_state = request.getParameter("adStatus");
		Ad a = new Ad(ad_content, ad_picture, ad_productor, ad_day, ad_state, ad_id);
		flag = as.UpdAd(a);
	}

	/**
	 * 4,删除广告信息
	 */
	protected void doDelAds(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int ad_id = Integer.parseInt(request.getParameter("ad_id"));
		flag = as.DelAd(ad_id);
	}

	/**
	 * 5、批量删除广告信息
	 */
	protected void doMuchDelAds(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		String ad_id = request.getParameter("ids");
		boolean flag = as.delMuchAd(ad_id);
		if (flag) {

			out.print(flag);
		} else {
			out.print(flag);
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
