package com.etc.RentMarket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.RentMarket.DBUtil.MD5Util;
import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.UsersService;
import com.etc.RentMarket.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/us.do")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsersServlet() {
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
		PrintWriter out = response.getWriter();
		String op = request.getParameter("op");
		UsersService us = new UsersServiceImpl();
		if ("".equals(op)) {
			String userName = request.getParameter("username");
			String userPwd = request.getParameter("password");
			String reUserPwd = request.getParameter("repassword");

			String data = "";
			if (userName.equals("")) {
				data = "请输入用户名~";
			} else {
				data = "ggg";
			}
			out.print(data);
			/*
			 * if(userName==null) { //ajax提示用户名先填写 data="" if(userPwd==null) {
			 * 
			 * }else if(!(userPwd.equals(reUserPwd))) { //ajax提示用户密码不正确 } }
			 */
			if ("add".equals(op)) {
				userPwd = MD5Util.getEncodeByMd5(userPwd);
				User u = new User(userName, userPwd);
				boolean flag = us.addUsers(u);
				System.out.println("flag:" + flag);
				// 暂时不提示成功或者失败
				// 页面的跳转
				// request实现页面的跳转->转发
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} else if ("login".equals(op)) {
			String userName = request.getParameter("userName");
			String userPwd = MD5Util.getEncodeByMd5((request.getParameter("userPwd")));
			User user = new User(userName, userPwd);

			// 查询数据库中是否存在此用户名
			List<User> list = us.userCheck(userName);
			if (list.size() == 0) {
				out.print("<script>alert('用户名不存在，请先注册！');location.href='front/login.jsp'</script>");
			} else {
				// 如果用户名存在做密码验证
				String userPwd2 = list.get(0).getUserPwd();
				if (!(userPwd.equals(userPwd2))) {
					out.print("<script>alert('密码不正确,请重新登录！');location.href='front/login.jsp'</script>");
				} else {
					out.print("<script>alert('登录成功');location.href='front/index.jsp'</script>");
					request.getSession().setAttribute("user", user);
				}

			}

		}

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
