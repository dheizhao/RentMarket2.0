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
import com.etc.RentMarket.entity.Uesrslist;
import com.etc.RentMarket.service.AdService;
import com.etc.RentMarket.service.impl.AdServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class AdServlet
 */
@WebServlet("/as.do")
public class AdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       AdService as = new AdServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		System.out.println("[jsonString] :" + jsonString);
		out.close();
	}
	/**
	 * 2,添加广告信息
	 */
	protected void doAddAds(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
