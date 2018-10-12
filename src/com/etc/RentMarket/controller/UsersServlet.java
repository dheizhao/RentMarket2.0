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
	String pwd;
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
		UsersService us = new UsersServiceImpl();
		String userName = "";
		String userPwd = "";
		String reUserPwd = "";
		String data = "";
		String op = "";
		if (request.getParameter("op") != null) {
			op = request.getParameter("op");
		}
		
		// 用户注册
		if ("tip-username".equals(op)) {

			userName = request.getParameter("username");// 用户名

			// 先判断是否存在
			if (userName.equals("")) {
				data = "*请输入用户名";
				out.print(data);
			} else {
				List<User> list = us.getUserByUserName(userName);
				if (list.size() > 0) {
					data = "*用户名已存在";
					out.print(data);
				} else {
					data = "*用户名输入正确";
					out.print(data);
				}
			}
		}
		if ("tip-userpwd".equals(op)) {
			userPwd = request.getParameter("password");// 密码
			setPwd(userPwd);//传一个密码参数给set()
			if (userPwd != null) {
				if (userPwd.equals("")) {
					data = "*密码不能为空";
					out.print(data);
				} else {
					userPwd = MD5Util.getEncodeByMd5(userPwd);// MD5加密密码
					data = "*密码输入正确";
					out.print(data);
				}
			}
		}
		if ("tip-cuserpwd".equals(op)) {
			
			userPwd=getPwd();
			reUserPwd = request.getParameter("repassword");// 确认密码
			if (reUserPwd != null) {
				if (reUserPwd.equals("")) {
					data = "*密码不能为空";
					out.print(data);
				} else {
					if (userPwd != null) {
						if (userPwd.equals(reUserPwd)) {
							reUserPwd = MD5Util.getEncodeByMd5(reUserPwd);
							System.out.println(reUserPwd);
							data = "*密码匹配,请继续";
							out.print(data);
						} else {
							data = "*两次密码输入不一致";
							out.print(data);
						}
					}
				}
			}
		}
		if ("add".equals(op)) {

			userName = request.getParameter("username");// 用户名
			userPwd = MD5Util.getEncodeByMd5(request.getParameter("password"));// 密码
			reUserPwd = MD5Util.getEncodeByMd5(request.getParameter("repassword"));// 确认密码
			System.out.println(userName);
			// 添加用户
			User u = new User(userName, userPwd);
			boolean flag = us.addUsers(u);
			System.out.println("flag:" + flag);

			// 暂时不提示成功或者失败
			// 页面的跳转
			// request实现页面的跳转->转发
			request.getRequestDispatcher("front/login.jsp").forward(request, response);
		} else if ("login".equals(op)) {
			userName = request.getParameter("userName");
			userPwd = MD5Util.getEncodeByMd5((request.getParameter("userPwd")));
			User user = new User(userName, userPwd);

			// 查询数据库中是否存在此用户名
			List<User> list = us.getUserByUserName(userName);
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
	
	/**
	 * 定义一个密码的设置和获取方法
	 * @param pwd	密码
	 */
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getPwd() {
		return this.pwd;
	}

}
