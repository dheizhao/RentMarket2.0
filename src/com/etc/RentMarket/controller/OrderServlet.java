package com.etc.RentMarket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.RentMarket.DBUtil.MyData;
import com.etc.RentMarket.DBUtil.PageData;
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.Order;
import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.OrderService;
import com.etc.RentMarket.service.impl.OrderServiceImpl;
import com.google.gson.Gson;

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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String op = request.getParameter("op");
		Gson gson = new Gson();
		OrderService os = new OrderServiceImpl();
		if ("sel".equals(op)) {
			int page = 1;
			int pageSize = 2;
			String userName = "";
			String keywords = "123456";
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
			if (request.getParameter("keywords") != null) {
				
				keywords = request.getParameter("keywords");
			}

			System.out.println(page+","+pageSize+","+userName+","+keywords);
			PageData<Order> pd = os.queryOrdersByPage(page, pageSize, userName, keywords);
			System.out.println(pd);
			request.setAttribute("keywords", keywords);
			if(pd!=null) {
				request.setAttribute("pd", pd);
				request.getRequestDispatcher("front/list-receive.jsp").forward(request, response);
			}else {
				request.setAttribute("pd", "null");
				request.getRequestDispatcher("front/login.jsp").forward(request, response);
				
			}
			
			
			request.getRequestDispatcher("front/list-receive.jsp").forward(request, response);
		}else if (op.equals("selOrderInfo")) {//查询订单表信息
			List<Order> orders = os.selOrders();
			MyData<Order> md = new MyData<Order>();
			md.setData(orders);
			String jsonString = gson.toJson(md);
			out.print(jsonString);
			
			out.close();
		}else if (op.equals("upInfo")) {//更新信息
			String orderId=request.getParameter("orderId");
			String userName=request.getParameter("userName");
			String userTel=request.getParameter("userTel");
			String userAddress=request.getParameter("userAddress");
			String orderDate=request.getParameter("orderDate");
			String orderTPrice=request.getParameter("orderTPrice");
			String orderState=request.getParameter("orderState");
			Order order = new Order(Integer.parseInt(orderId), orderDate, Integer.parseInt(orderState), Double.parseDouble(orderTPrice), userAddress, userName, userTel);
			boolean flag = os.upOrders(order);
			out.println(flag);
		}else if(op.equals("delOrder")) {//删除订单
			String id = request.getParameter("id");
			boolean flag = os.delOrders(Integer.valueOf(id));
			out.println(flag);
		}else if(op.equals("delMuchOrders")) {
			String ordersIds= request.getParameter("ids");
			String arr[]=ordersIds.split(",");
			
			List<Integer> list = new ArrayList<Integer>();
			for (int i =0;i<arr.length;i++) {
				list.add(Integer.valueOf(arr[i]));
			}
			//System.out.println(list);
			boolean flag = os.delMuchOrders(list);
			if(flag) {
				
				out.print(flag);
			}else {
				out.print(flag);
			}
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
