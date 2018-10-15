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
import com.etc.RentMarket.entity.Uesrslist;
import com.etc.RentMarket.service.UsersService;
import com.etc.RentMarket.service.impl.UsersServiceImpl;
import com.google.gson.Gson;

/**
 * @author 小白 后台用户servlet
 */
@WebServlet("/usback.do")
public class UsersBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersService us = new UsersServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsersBackServlet() {
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
			doGetUsers(request, response);
		}
		// 2、编辑用户状态
		else if ("userEdit".equals(op)) {
			doUpdateUserStatus(request, response);
		}
		// 3、删除用户信息
		else if ("userDel".equals(op)) {
			doDelUser(request, response);
		}
		// 4、批量删除用户信息
		else if ("MuchDel".equals(op)) {
			doMuchDelUser(request, response);
		}
	}

	/**
	 * 1、显示用户信息
	 */
	protected void doGetUsers(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 调用service的分页方法返回一个pageData对象
		List<Uesrslist> list = us.getUesrs();
		// Ajax来实现
		// 返回数据最好是json格式 外部的jar包 gson
		MyData<Uesrslist> md = new MyData<Uesrslist>();
		md.setData(list);
		Gson gson = new Gson();
		String jsonString = gson.toJson(md);
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		out.print(jsonString);
		out.close();
	}

	/**
	 * 2、编辑用户状态
	 */
	protected void doUpdateUserStatus(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		int userId = Integer.valueOf((request.getParameter("userId")));
		Uesrslist u = new Uesrslist(userId, request.getParameter("userStatus"));
		boolean flag = us.UpdateUesrStatus(u);
		out.print(flag);

	}

	/**
	 * 3、删除用户信息
	 */
	protected void doDelUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		int userId = Integer.valueOf((request.getParameter("id")));
		boolean flag = us.DelUesr(userId);
		out.print(flag);

	}
	/**
	 * 4、批量删除用户信息
	 */
	protected void doMuchDelUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		String userId = request.getParameter("ids");
		boolean flag = us.delMuchUesr(userId);
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
