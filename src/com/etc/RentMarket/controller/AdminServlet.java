package com.etc.RentMarket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.RentMarket.entity.Admin;
import com.etc.RentMarket.service.AdminService;
import com.etc.RentMarket.service.impl.AdminServiceImpl;

/**
 * 管理员的Servlet
 */
@WebServlet("/admin.do")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminService ads = new AdminServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminServlet() {
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
		// 设置响应编码
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		// 使用PrintWriter对象来打印返回data的值
		PrintWriter out = response.getWriter();
		// 接受传参动作
		String op = "";
		if (request.getParameter("op") != null) {
			op = request.getParameter("op");
		}
		// 1、登录操作方法
		if ("login".equals(op)) {
			// 接收传参值
			String admin = request.getParameter("admin");
			String adminPwd = request.getParameter("adminPwd");
			// 构造一个Admin对象
			Admin adm = new Admin(admin, adminPwd);
			// 调用AdminServiceImpl的方法
			List<Admin> list = ads.adminLogin(adm);
			if (list.size() > 0) {// 该用户存在，可以登录，跳到首页
				request.getSession().setAttribute("adm", adm);
				//out.print("<script>alert('登录成功！');location.href='back/index.jsp'</script>");
				out.print("true");
			} else {//该用户不存在，登录失败
				//out.print("<script>alert('登录失败！');location.href='back/login1.html'</script>");
				out.print("false");
			}
			// 关闭PrintWriter对象，释放资源
			out.close();
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
