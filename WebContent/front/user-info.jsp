<%@page import="com.etc.RentMarket.service.impl.UsersServiceImpl"%>
<%@page import="com.etc.RentMarket.service.UsersService"%>
<%@page import="com.etc.RentMarket.entity.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="Generator" content="EditPlus®">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
<meta name="renderer" content="webkit">
<meta content="易点租, 购物, 大家电, 手机" name="keywords">
<meta content="易点租，购物商城。" name="description">
<title>我的信息</title>
<link rel="shortcut icon" type="image/x-icon"
	href="theme/icon/favicon.ico">
<link rel="stylesheet" type="text/css" href="theme/css/base.css">
<link rel="stylesheet" type="text/css" href="theme/css/member.css">
<link href="theme/css/admin.css" rel="stylesheet" type="text/css">
<link href="theme/css/amazeui.css" rel="stylesheet" type="text/css">
<link href="theme/css/personal.css" rel="stylesheet" type="text/css">
<link href="theme/css/systyle.css" rel="stylesheet" type="text/css">
</head>
<body>

	<!--- header begin-->
	<header id="pc-header">
		<div class="BHeader">
			<div class="yNavIndex">
				<ul class="BHeaderl">
                	<li><a href="#" style="color: red;">${sessionScope.user.userName}</a></li>
					<li class="headerul">|</li>
					<div class="header-cart fr">
						<a href="#"><img src="theme/icon/car.png"></a>
					</div>
				</ul>
			</div>
		</div>
		<div class="container clearfix">
			<div class="header-logo fl">
				<h1>
					<a href="#"><img src="theme/icon/logo.png"></a>
				</h1>
			</div>
			<div class="member-title fl">
				<h2></h2>
			</div>
			
		</div>
	</header>
	<!-- header End -->

	<div class="containers">
		<div class="pc-nav-item">
			<a href="index.jsp">首页</a> &gt; <a href="user-info.jsp">会员中心 </a>
		</div>
	</div>

	<!-- 商城快讯 begin -->
	<section id="member">
		<div class="member-center clearfix">
			<div class="member-left fl">
				<div class="member-lists">
					<dl>
						<dt>我的商城</dt>
						<dd class="cur">
							<a href="#">我的信息</a>
						</dd>
						<dd>
							<a href="../os.do?op=sel">我的订单</a>
						</dd>
						<dd>
							<a href="myfavorite.jsp">我的收藏</a>
						</dd>
						<dd>
							<a href="comment.jsp">我的评价</a>
						</dd>
						<dd>
							<a href="addressManager.jsp">地址管理</a>
						</dd>
					</dl>
					<dl>
						<dt>客户服务</dt>
						<dd>
							<a href="#">退货申请</a>
						</dd>
						<dd>
							<a href="#">退货/退款记录</a>
						</dd>
					</dl>
					<dl>
						<dt>我的消息</dt>
						<dd>
							<a href="#">商城快讯</a>
						</dd>
						<dd>
							<a href="#">帮助中心</a>
						</dd>
					</dl>
				</div>
			</div>
			<div class="member-right fr">
				<div class="wrap-left">
					<div class="wrap-list">
						<div class="m-user">
							<!--个人信息 -->
							<div class="m-bg"></div>
							<div class="m-userinfo"
								style="background: url(theme/images/header-bg1.jpg);">
								<div class="m-baseinfo">
									<a href="#"> <img
										src="theme/images/getAvatar.do.jpg"> 
										<%
											
											if(session.getAttribute("user")==null){
												response.sendRedirect("login.jsp");
												return;
											}else{
 											User user = (User) session.getAttribute("user");
 											String userName = user.getUserName();
 										%>
									</a> <em class="s-name" style="font-size: 20px"><%=userName%><span class="vip1"
										style="background-image: url('theme/images/vip.png');"></span></em>
										<%
											} 
										%>
								</div>
								
							</div>
						</div>
						<div class="box-container-bottom"
							style="background: url(theme/images/side.png) repeat-x;"></div>
						<!--订单 -->
						<div class="m-order">
							<div class="s-bar">
								<i class="s-icon"></i>我的订单 <a class="i-load-more-item-shadow"
									href="order.jsp">全部订单</a>
							</div>
							<ul>
								<li><a href="order.jsp"><i><img
											src="theme/images/pay.png" /></i><span>已完成<em
											class="m-num"></em></span></a></li>
								<li><a href="order.html"><i><img
											src="theme/images/send.png" /></i><span>待发货<em
											class="m-num"></em></span></a></li>
								<li><a href="order.html"><i><img
											src="theme/images/receive.png" /></i><span>待收货</span></a></li>
								<li><a href="order.html"><i><img
											src="theme/images/comment.png" /></i><span>待评价<em
											class="m-num"> </em></span></a></li>
								<li><a href="change.html"><i><img
											src="theme/images/refund.png" /></i><span>退换货</span></a></li>
							</ul>
						</div>


						<div class="m-logistics"></div>

						<!--收藏夹 -->
						<div class="you-like"></div>

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
							<div class="s-date">
								星期
								<%
								Date date = new Date();
								int day = date.getDay();
							%>
								<em><%=day%></em> <span class="STYLE1" id=jnkc> <script>
									setInterval(
											"jnkc.innerHTML=new Date().toLocaleString()",
											1000);
								</script>
								</span>
							</div>
						</div>
					</div>


				</div>



			</div>
		</div>
	</section>
	<!-- 商城快讯 End -->

	<!--- footer begin-->
	<div class="aui-footer-bot">
		<div class="time-lists aui-footer-pd clearfix">
			<div class="aui-footer-list clearfix">
				<h4>
					<span><img src="theme/icon/icon-d1.png"></span> <em>消费者权益</em>
				</h4>
				<ul>
					<li><a href="#">保障范围 </a></li>
					<li><a href="#">退货退款流程</a></li>



				</ul>
			</div>
			<div class="aui-footer-list clearfix">
				<h4>
					<span><img src="theme/icon/icon-d2.png"></span> <em>新手上路</em>
				</h4>
				<ul>
					<li><a href="#">退货退款流程</a></li>
					<li><a href="#">服务中心 </a></li>


				</ul>
			</div>
			<div class="aui-footer-list clearfix">
				<h4>
					<span><img src="theme/icon/icon-d3.png"></span> <em>保障正品</em>
				</h4>
				<ul>
					<li><a href="#">退货退款流程</a></li>


					<li><a href="#"> 更多特色服务 </a></li>
				</ul>
			</div>

		</div>
		<div style="border-bottom: 1px solid #dedede"></div>
		<div class="time-lists aui-footer-pd time-lists-ls clearfix">
			<div class="aui-footer-list clearfix">
				<h4>购物指南</h4>
				<ul>


					<li><a href="#">购物流程</a></li>
					<li><a href="#">会员介绍 </a></li>

					<li><a href="#"> 常见问题 </a></li>

				</ul>
			</div>
			<div class="aui-footer-list clearfix">
				<h4>关于网站</h4>
				<ul>
					<li><a href="#">网站简介</a></li>


				</ul>
			</div>
			<div class="aui-footer-list clearfix">
				<h4>帮助中心</h4>
				<ul>
					<li><a href="#">退货退款流程</a></li>
					<li><a href="#">联系我们</a></li>

				</ul>
			</div>
			<div class="aui-footer-list clearfix">
				<h4>新手指导</h4>
				<ul>

					<li><a href="#">退货退款流程</a></li>
					<li><a href="#">使用教程</a></li>
					<li><a href="#"> 联系客服购物 </a></li>

				</ul>
			</div>
		</div>
	</div>
	<!-- footer End -->
</body>
</html>