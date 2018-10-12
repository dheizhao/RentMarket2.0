package com.etc.RentMarket.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.RentMarket.DBUtil.PageData;
import com.etc.RentMarket.entity.Order;
import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.OrderService;
import com.etc.RentMarket.service.impl.OrderServiceImpl;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/os.do")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderServlet() {
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
		String op = request.getParameter("op");
		if ("sel".equals(op)) {
			int page = 1;
			int pageSize = 3;
			String userName = "";
			if (request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));
			}
			if (request.getParameter("pageSize") != null) {
				pageSize = Integer.parseInt(request.getParameter("pageSize"));
			}
			if (request.getSession().getAttribute("user") != null) {
				User user = (User) request.getSession().getAttribute("user");
				userName = user.getUserName();
			}
			String keywords = "";
			if (request.getParameter("keywords") != null) {
				keywords = request.getParameter("keywords");
			}

			OrderService os = new OrderServiceImpl();
			PageData<Order> pd = os.queryOrdersByPage(page, pageSize, userName, keywords);

			request.setAttribute("pd", pd);
			request.setAttribute("keywords", keywords);
			request.getRequestDispatcher("front/list-receive.jsp").forward(request, response);
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
