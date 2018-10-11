<%-- <%@page import="com.etc.RentMarket.entity.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>个人中心</title>

<link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">
<link href="../css/personal.css" rel="stylesheet" type="text/css">
<link href="../css/systyle.css" rel="stylesheet" type="text/css">


</head>




<body>

<%
User user = (User)session.getAttribute("user");
 %>


	<!--头 -->
	<header> <article>
	<div class="mt-logo">
		<!--悬浮搜索框-->

		<div class="nav white">
			<div class="logoBig">
				<li><img src="../images/logobig.png" /></li>
			</div>
			
		</div>

		<div class="clear"></div>
	</div>
	</div>
	</article> </header>

	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">
				<div class="wrap-left">
					<div class="wrap-list">
						<div class="m-user">
							<!--个人信息 -->
							<div class="m-bg"></div>
							<div class="m-userinfo">
								<div class="m-baseinfo">
									<a href="information.html"> <img
										src="../images/getAvatar.do.jpg">
									</a> <em class="s-name"><%=username %><span class="vip1"></em>
									<div class="s-prestige am-btn am-round">
										</span>会员福利
									</div>
								</div>
								<div class="m-right">
									<div class="m-new">
										<a href="news.html"><i class="am-icon-bell-o"></i>消息</a>
									</div>
									<div class="m-address">
										<a href="addressManage.jsp" class="i-trigger">我的收货地址</a>
									</div>
								</div>
							</div>
						</div>
						<div class="box-container-bottom"></div>
						<!--订单 -->
						<div class="m-order">
							<div class="s-bar">
								<i class="s-icon"></i>我的订单 <a class="i-load-more-item-shadow"
									href="order.jsp">全部订单</a>
							</div>
							<ul>
							<%
							int i =0;
							OrderDao orderdao = new OrderDao();
	MemberDao memberDao = new MemberDao();
	
	int userID= memberDao.selectByuserName(username).getID();
	ResultSet rs = orderdao.getOrderByUserID(userID);
	while(rs.next()){
	i++;
							}
							 %>
								<li><a href="order.jsp"><i><img
											src="../images/pay.png" /></i><span>已完成<em class="m-num"><%=i %></em></span></a></li>
								<li><a href="order.html"><i><img
											src="../images/send.png" /></i><span>待发货<em class="m-num"></em></span></a>
								</li>
								<li><a href="order.html"><i><img
											src="../images/receive.png" /></i><span>待收货</span></a></li>
								<li><a href="order.html"><i><img
											src="../images/comment.png" /></i><span>待评价<em
											class="m-num"> </em></span></a></li>
								<li><a href="change.html"><i><img
											src="../images/refund.png" /></i><span>退换货</span></a></li>
							</ul>
						</div>
						
						
						<div class="m-logistics">

						

						</div>

						<!--收藏夹 -->
						<div class="you-like">
						</div>

					</div>
				</div>
				<div class="wrap-right">

					<!-- 日历-->
					<div class="day-list">
						<div class="s-bar">
							<a class="i-history-trigger s-icon" href="#"></a>当前时间 <a
								class="i-setting-trigger s-icon" href="#"></a>
						</div>
						<div class="s-care s-care-noweather">
							<div class="s-date">星期
							<%Date date=new Date();
							int day = date.getDay();
							 %>
							<em><%=day %></em>
							<span
						class="STYLE1" id=jnkc> <script>setInterval("jnkc.innerHTML=new Date().toLocaleString()", 1000);
						</script>
					</span>
							</div>
						</div>
					</div>


				</div>
			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						 <a href="../HOME/index.jsp">商城首页</a> <b>|</b> <a
							href="#">支付宝</a> <b>|</b> <a href="#">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						 <a href="#">合作伙伴</a> <a href="#">联系我们</a> <a
							href="#">网站地图</a> 
					</p>
				</div>
			</div>

		</div>

		<aside class="menu">
		<ul>
			<li class="person active"><a href="index.jsp">个人中心</a></li>
			<li class="person"><a>个人资料</a>
				<ul>
					<li><a href="information.jsp">个人信息</a></li>
					<li><a href="safety.jsp">安全设置</a></li>
					<li><a href="addressManage.jsp">收货地址</a></li>
				</ul></li>
			<li class="person"><a href="#">我的交易</a>
				<ul>
					<li><a href="order.jsp">订单管理</a></li>
				</ul></li>
		</ul>
		</aside>
	</div>
	<!--引导 -->
	<div class="navCir">
		<li><a href="../home/home.html"><i class="am-icon-home "></i>首页</a>
		</li>
		<li><a href="../home/sort.html"><i class="am-icon-list"></i>分类</a>
		</li>
		<li><a href="../home/shopcart.html"><i
				class="am-icon-shopping-basket"></i>购物车</a></li>
		<li class="active"><a href="index.html"><i
				class="am-icon-user"></i>我的</a></li>
	</div>
</body>

</html>
 --%>