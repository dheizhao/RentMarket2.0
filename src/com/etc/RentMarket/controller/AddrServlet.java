package com.etc.RentMarket.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.entity.Usersdetail;
import com.etc.RentMarket.service.AddressService;
import com.etc.RentMarket.service.impl.AddressServiceImpl;

/**
 * Servlet implementation class AddrServlet
 * 
 */
@WebServlet("/ads.do")
public class AddrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddrServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op = request.getParameter("op");
		AddressService as = new AddressServiceImpl();
		/**
		 * 查询地址信息
		 */
		if("sel".equals(op)) {
			User u = (User) request.getSession().getAttribute("user");
			String userName = u.getUserName();
			List<Usersdetail> list = as.queryUserAddr(userName);
			request.setAttribute("list", list);
			request.getRequestDispatcher("front/addressManager.jsp").forward(request, response);
		}else if ("add".equals(op)) {
			String userName = request.getParameter("userName");
			String userRealName = request.getParameter("userRealName");
			String userAddress = request.getParameter("userAddress");
			String userPhone = request.getParameter("userPhone");
			boolean flag = as.addAddr(userName, userRealName, userAddress, userPhone);
			if (flag) {
				request.getRequestDispatcher("ads.do?op=sel").forward(request, response);
			}
			
		}else if ("up".equals(op)) {
			int userDetailId = Integer.parseInt(request.getParameter("userDetailId"));
			String userRealName = request.getParameter("userRealName");
			String userAddress = request.getParameter("userAddress");
			String userPhone = request.getParameter("userPhone");
			boolean flag = as.updateAddr(userDetailId, userRealName, userAddress, userPhone);
			if(flag) {
				request.getRequestDispatcher("ads.do?op=sel").forward(request, response);
			}
		}else if ("del".equals(op)) {
			int userDetailId = Integer.valueOf(request.getParameter("userDetailId"));
			
			boolean flag = as.deleteAddr(userDetailId);
			if (flag) {
				request.getRequestDispatcher("ads.do?op=sel").forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
