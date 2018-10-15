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
import com.etc.RentMarket.entity.EvaluateBack;
import com.etc.RentMarket.entity.Reevaluate;
import com.etc.RentMarket.service.EvaluateService;
import com.etc.RentMarket.service.impl.EvaluateServiceImpl;
import com.google.gson.Gson;

/**
 * @author 小白 后台评价servlet
 */
@WebServlet("/evaluate.do")
public class EvaluateBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EvaluateService es = new EvaluateServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EvaluateBackServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		String op = "";
		if (request.getParameter("op") != null) {
			op = request.getParameter("op");
		}
		// 1、显示评价信息
		if ("".equals(op)) {
			doGetEvaluates(request, response);
		}
		// 2、删除评价信息
		else if ("evaluateDel".equals(op)) {
			doDelEvaluate(request, response);
		}
		// 3、批量删除评价信息
		else if ("MuchDel".equals(op)) {
			doMuchDelEvaluate(request, response);
		}
		// 4、显示回复评价信息
		else if ("show".equals(op)) {
			doGetREevaluates(request, response);
		}
		// 5、删除回复评价信息
		else if ("reevaluateDel".equals(op)) {
			doDelREevaluate(request, response);
		}
		// 6、批量删除回复评价信息
		else if ("MuchDelci".equals(op)) {
			doMuchDelEvaluateci(request, response);
		}
	}

	/**
	 * 1、显示评价信息
	 */
	protected void doGetEvaluates(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 调用service的分页方法返回一个pageData对象
		List<EvaluateBack> list = es.getEvaluates();
		// Ajax来实现
		// 返回数据最好是json格式 外部的jar包 gson
		MyData<EvaluateBack> md = new MyData<EvaluateBack>();
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
	 * 2、删除评价信息
	 */
	protected void doDelEvaluate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		int evaluateId = Integer.valueOf((request.getParameter("id")));
		boolean flag = es.DelEvaluate(evaluateId);
		System.out.println(flag);
		out.print(flag);

	}

	/**
	 * 3、批量删除评价信息
	 */
	protected void doMuchDelEvaluate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		String evaluateId = request.getParameter("ids");
		boolean flag = es.delMuchEvaluate(evaluateId);
		if (flag) {

			out.print(flag);
		} else {
			out.print(flag);
		}
		out.close();

	}

	/**
	 * 4、显示回复评价信息
	 */
	protected void doGetREevaluates(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 调用service的分页方法返回一个pageData对象
		List<Reevaluate> list = es.getREevaluate();
		// Ajax来实现
		// 返回数据最好是json格式 外部的jar包 gson
		MyData<Reevaluate> md = new MyData<Reevaluate>();
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
	 * 5、删除回复评价信息
	 */
	protected void doDelREevaluate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		int cid = Integer.valueOf((request.getParameter("id")));
		boolean flag = es.DelREevaluate(cid);
		System.out.println(flag);
		out.print(flag);

	}
	/**
	 * 6、批量删除回复评价信息
	 */
	protected void doMuchDelEvaluateci(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		String cid = request.getParameter("ids");
		boolean flag = es.delMuchEvaluateci(cid);
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
