<%-- 
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="User.Book"%>
<%@page import="Control.BookDao"%>
<%@page import="Control.OrderDao"%>
<%@page import="Control.MemberDao"%>
<%@page import="java.sql.ResultSet"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>订单管理</title>

		<link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="../css/personal.css" rel="stylesheet" type="text/css">
		<link href="../css/orstyle.css" rel="stylesheet" type="text/css">

		<script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>

	</head>

	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->

					<!--悬浮搜索框-->

					<div class="nav white">
						<div class="logoBig">
							<li><img src="../images/logobig.png" /></li>
						</div>

						<div class="search-bar pr">
							<a name="index_none_header_sysc" href="#"></a>
							<form>
								<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
								<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
							</form>
						</div>
					</div>

					<div class="clear"></div>
				</div>
				</div>
			</article>
		</header>

		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-order">

						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">订单管理</strong> / <small>Order</small></div>
						</div>
						<hr/>

						<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

							<ul class="am-avg-sm-5 am-tabs-nav am-nav am-nav-tabs">
								<li class="am-active">
									<a href="#tab1">所有订单</a>
								</li>
								<li>
									<!--<a href="#tab5">待评价</a>  -->
								</li>
							</ul>

							<div class="am-tabs-bd">
								<div class="am-tab-panel am-fade am-in am-active" id="tab1">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">价格</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>
<%
	OrderDao dao = new OrderDao();
	MemberDao memberDao = new MemberDao();
	String username = session.getAttribute("username").toString();
	int userID= memberDao.selectByuserName(username).getID();
	ResultSet rs = dao.getOrderByUserID(userID);
	while(rs.next()){
	 %>
									<div class="order-main">
										<div class="order-list">

											<!--交易成功-->
											<div class="order-status5">
												<div class="order-title">
													<div class="dd-num">订单编号：<%=rs.getString(1) %>
														<a href="javascript:;"></a>
													</div>
													<span>成交时间：<%=rs.getString(6) %></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													<span>收货地址：<%=rs.getString(4) %></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													<span>联系电话：<%=rs.getString(5) %></span>
												</div>
												
												<div class="order-content">
													<div class="order-left">
														
														<%
														ResultSet orderBookrs =  dao.getOrderBookByOrderID(rs.getString(1));
														BookDao bookdao = new BookDao();
														while(orderBookrs.next()){
														Book book = bookdao.SelectByID(orderBookrs.getInt(3) ); %>
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="#" class="J_MakePoint">
																		<img src="../images/book/<%=book.getPicture() %>" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="#">
																			<p><%=book.getBookName() %></p>
																			<p class="info-little">
																				<br/>运费：包邮 </p>
																		</a>
																	</div>
																</div>
															</li>
															<li class="td td-price">
																<div class="item-price">
																	<%=book.getPrice() %>
																</div>
															</li>
															<li class="td td-number">
																<div class="item-number">
																	<span>×</span><%=orderBookrs.getInt(5)%>
																</div>
															</li>
														</ul>
							<%} %>
															<li class="td td-operation">
																<div class="item-operation">
																</div>
															</li>
														</ul>
													</div>
													<div class="order-right">
														<li class="td td-amount">
															<div class="item-amount">
																合计：<%=rs.getDouble(7)%>
																<p>收货人：<span><%=rs.getString(3)%></span></p>
															</div>
														</li>
														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">交易成功</p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
																	<a href="deleteOrder.jsp?orderID=<%=rs.getString(1) %>" >删除订单</a></div>
															</li>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
<%} %>
								</div>

							</div>
						</div>
					</div>
				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="../HOME/index.jsp">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
						</p>
					</div>

				</div>
			</div>
			<aside class="menu">
				<ul>
					<li class="person">
						<a href="index.jsp">个人中心</a>
					</li>
					<li class="person">
						<a href="#">个人资料</a>
						<ul>
							<li>
								<a href="information.jsp">个人信息</a>
							</li>
							<li>
								<a href="safety.jsp">安全设置</a>
							</li>
							<li>
								<a href="addressManage.jsp">收货地址</a>
							</li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的交易</a>
						<ul>
							<li class="active">
								<a href="order.jsp">订单管理</a>
							</li>
						</ul>
					</li>
				</ul>
			</aside>
		</div>

	</body>

</html>
 --%>