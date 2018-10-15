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
import com.etc.RentMarket.entity.OrderBack;
import com.etc.RentMarket.service.OrderBackService;
import com.etc.RentMarket.service.impl.OrderBackServiceImpl;
import com.google.gson.Gson;

/**
 * @author 小白 后台订单servlet
 */
@WebServlet("/OrderBack.do")
public class OrderBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderBackService obs = new OrderBackServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderBackServlet() {
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
		// 1、显示订单信息
		if ("".equals(op)) {
			doGetOrders(request, response);
		}
		// 2、删除订单信息
		else if ("orderDel".equals(op)) {
			doDelOrder(request, response);
		}
		// 3、批量删除订单信息
		else if ("MuchDel".equals(op)) {
			doMuchDelOrder(request, response);
		}
		// 4、编辑订单状态信息
		else if ("orderEdit".equals(op)) {
			doEditOrder(request, response);
		}
	}

	/**
	 * 1、显示订单信息
	 */
	protected void doGetOrders(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 调用service的分页方法返回一个pageData对象
		List<OrderBack> list = obs.getOrders();
		// Ajax来实现
		// 返回数据最好是json格式 外部的jar包 gson
		MyData<OrderBack> md = new MyData<OrderBack>();
		md.setData(list);
		Gson gson = new Gson();
		String jsonString = gson.toJson(md);
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		out.print(jsonString);
		out.close();
	}

	/**
	 * 2、删除订单信息
	 */
	protected void doDelOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		int orderId = Integer.valueOf((request.getParameter("id")));
		boolean flag = obs.DelOrderBack(orderId);
		out.print(flag);

	}

	/**
	 * 3、批量删除订单信息
	 */
	protected void doMuchDelOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		String orderIds = request.getParameter("ids");
		boolean flag = obs.delMuchOrder(orderIds);
		if (flag) {

			out.print(flag);
		} else {
			out.print(flag);
		}
		out.close();

	}
	/**
	 * 4、编辑订单状态信息
	 */
	protected void doEditOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		//接收传参值
		int orderId = Integer.valueOf(request.getParameter("orderId"));
		int orderState = Integer.valueOf(request.getParameter("orderState"));
		OrderBack order=new OrderBack(orderId, orderState);
		System.out.println(order);
		boolean flag = obs.EditOrder(order);
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
