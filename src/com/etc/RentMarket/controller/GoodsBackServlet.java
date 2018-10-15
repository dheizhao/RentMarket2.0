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
import com.etc.RentMarket.entity.Good;
import com.etc.RentMarket.entity.GoodsChecked;
import com.etc.RentMarket.entity.Goodstype;
import com.etc.RentMarket.service.GoodService;
import com.etc.RentMarket.service.impl.GoodServiceImpl;
import com.google.gson.Gson;

/**
 * 后台页面显示商品列表
 */
@WebServlet("/gsback.do")
public class GoodsBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GoodService gs = new GoodServiceImpl();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GoodsBackServlet() {
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
		// 设置编码格式
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		// 使用printWriter对象
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		String op = request.getParameter("op");
		
		if(op.equals("sel")) {//查询商品
			List<Good> list = gs.selectGoods();
			// Ajax来实现
			// 返回数据最好是json格式 外部的jar包 gson
			MyData<Good> md = new MyData<Good>();
			md.setData(list);
			String jsonString = gson.toJson(md);
			out.print(jsonString);
			out.close();
		}else if (op.equals("del")) {//删除商品
			String goodId = request.getParameter("id");
			
			boolean flag = gs.delGoods(Integer.valueOf(goodId));
			
			if(flag) {
				//out.print("alert('删除成功')");
				out.print(flag);
			}else {
				out.print(flag);
			}
			out.close();
		}else if (op.equals("MuchDel")) {//批量删除商品
			
			String goods= request.getParameter("ids");
			String arr[]=goods.split(",");
			
			List<Integer> list = new ArrayList<Integer>();
			for (int i =0;i<arr.length;i++) {
				list.add(Integer.valueOf(arr[i]));
			}
			//System.out.println(list);
			boolean flag = gs.delMuchGoods(list);
			if(flag) {
				
				out.print(flag);
			}else {
				out.print(flag);
			}
			out.close();
		}else if (op.equals("upInfo")) {//更新数据
			String goodId=request.getParameter("goodId");
			String goodName=request.getParameter("goodName");
			String goodImgAdd=request.getParameter("goodImgAdd");
			String goodPrice=request.getParameter("goodPrice");
			String goodCount=request.getParameter("goodCount");
			String goodState=request.getParameter("goodState");
			
			Good good = new Good(Integer.parseInt(goodId),Integer.parseInt(goodCount), goodImgAdd, goodName, Double.valueOf(goodPrice), goodState);
			boolean flag = gs.upGoods(good);
			out.println(flag);
		}else if(op.equals("category")) {//商品类别信息查询
			List<Goodstype> list = gs.selGoodType();
			// Ajax来实现
			// 返回数据最好是json格式 外部的jar包 gson
			MyData<Goodstype> md = new MyData<Goodstype>();
			md.setData(list);
			String jsonString = gson.toJson(md);
			out.print(jsonString);
			
			out.close();
		}else if (op.equals("uptypeInfo")) {//商品类型更新
			String goodsTypeId=request.getParameter("goodsTypeId");
			String goodsTypeName=request.getParameter("goodsTypeName");
			String goodsParentId=request.getParameter("goodsParentId");
			Goodstype goodstype = new Goodstype(Integer.parseInt(goodsTypeId),goodsTypeName, Integer.valueOf(goodsParentId));
			boolean flag = gs.upGoodsType(goodstype);
			out.println(flag);
		}else if (op.equals("deltype")) {//删除商品类型
			String goodId = request.getParameter("id");
			
			boolean flag = gs.delGoodsType(Integer.valueOf(goodId));
			
			if(flag) {
				//out.print("alert('删除成功')");
				out.print(flag);
			}else {
				out.print(flag);
			}
			out.close();
		}else if(op.equals("MuchSelType")) {//批量删除商品类型
			String goods= request.getParameter("ids");
			String arr[]=goods.split(",");
			
			List<Integer> list = new ArrayList<Integer>();
			for (int i =0;i<arr.length;i++) {
				list.add(Integer.valueOf(arr[i]));
			}
			//System.out.println(list);
			boolean flag = gs.delMuchGoodsType(list);
			if(flag) {
				
				out.print(flag);
			}else {
				out.print(flag);
			}
			out.close();
		}else if(op.equals("checkedGoods")) {//查询商品审核信息
			List<GoodsChecked> list = gs.selGoodsChecked();
			// Ajax来实现
			// 返回数据最好是json格式 外部的jar包 gson
			MyData<GoodsChecked> md = new MyData<GoodsChecked>();
			md.setData(list);
			String jsonString = gson.toJson(md);
			out.print(jsonString);
			out.close();
		}else if ("delGoodsChecked".equals(op)) {//删除商品审核信息
			String goodId = request.getParameter("id");
			
			boolean flag = gs.delGoodsChecked(Integer.valueOf(goodId));
			
			if(flag) {
				//out.print("alert('删除成功')");
				out.print(flag);
			}else {
				out.print(flag);
			}
			out.close();
		}else if ("upGoodCheckedInfo".equals(op)) {//更新商品审核信息
			String goodId=request.getParameter("goodId");
			String goodName=request.getParameter("goodName");
			String goodImgAdd=request.getParameter("goodImgAdd");
			String userName=request.getParameter("userName");
			String releaseDate=request.getParameter("releaseDate");
			String releaseState=request.getParameter("releaseState");
			
			GoodsChecked good = new GoodsChecked(Integer.valueOf(goodId), goodName, goodImgAdd, userName, releaseDate, releaseState);
			boolean flag = gs.upGoodsChecked(good);
			out.println(flag);
		}else if ("delMuchGoodsChecked".equals(op)) {//批量删除商品审核信息
			String goods= request.getParameter("ids");
			String arr[]=goods.split(",");
			
			List<Integer> list = new ArrayList<Integer>();
			for (int i =0;i<arr.length;i++) {
				list.add(Integer.valueOf(arr[i]));
			}
			//System.out.println(list);
			boolean flag = gs.delMuchGoodsChecked(list);
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
