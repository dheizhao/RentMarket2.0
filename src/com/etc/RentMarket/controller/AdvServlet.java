package com.etc.RentMarket.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.RentMarket.entity.Ad;
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.service.AdService;
import com.etc.RentMarket.service.impl.AdServiceImpl;
import com.etc.RentMarket.service.impl.GoodServiceImpl;

/**
 * Servlet implementation class AdvServlet
 */
@WebServlet("/AdvServlet")
public class AdvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdvServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		AdService as = new AdServiceImpl();
		List<Ad> list = as.SelectAds();
		
		request.setAttribute("Ad", list);
		request.getRequestDispatcher("front/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
