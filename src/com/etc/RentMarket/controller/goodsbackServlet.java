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
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.service.GoodService;
import com.etc.RentMarket.service.impl.GoodServiceImpl;
import com.google.gson.Gson;

/**
 * 后台页面显示商品列表
 */
@WebServlet("/gsback.do")
public class goodsbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GoodService gs = new GoodServiceImpl();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public goodsbackServlet() {
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
		// 设置编码格式
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		// 调用service的分页方法返回一个pageData对象
		List<Good> list = gs.selectGoods();
		// Ajax来实现
		// 返回数据最好是json格式 外部的jar包 gson
		MyData<Good> md = new MyData<Good>();
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
