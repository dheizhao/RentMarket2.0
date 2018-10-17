<%@page import="com.etc.RentMarket.entity.Good"%>
<%@page import="com.etc.RentMarket.service.impl.GoodServiceImpl"%>
<%@page import="com.etc.RentMarket.service.GoodService"%>
<%@page import="com.etc.RentMarket.entity.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.etc.RentMarket.entity.Order"%>
<%@page import="com.etc.RentMarket.service.impl.OrderServiceImpl"%>
<%@page import="com.etc.RentMarket.service.OrderService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>商品详情</title>
<link rel="shortcut icon" type="image/x-icon"
	href="theme/icon/favicon.ico">
<link rel="stylesheet" type="text/css" href="theme/css/base.css">
<link rel="stylesheet" type="text/css" href="theme/css/member.css">
<link href="theme/css/admin.css" rel="stylesheet" type="text/css">
<link href="theme/css/amazeui.css" rel="stylesheet" type="text/css">
<link href="theme/css/demo.css" rel="stylesheet" type="text/css" />
<link type="text/css" href="theme/css/optstyle.css" rel="stylesheet" />
<link type="text/css" href="theme/css/style.css" rel="stylesheet" />
<script type="text/javascript" src="theme/js/jquery.js"></script>
<script>
	$(function() {

		$("#H-table li").each(function(i) {
			$(this).click((function(k) {
				var _index = k;
				return function() {
					$(this).addClass("cur").siblings().removeClass("cur");
					$(".H-over").hide();
					$(".H-over:eq(" + _index + ")").show();
				}
			})(i));
		});
		$("#H-table1 li").each(function(i) {
			$(this).click((function(k) {
				var _index = k;
				return function() {
					$(this).addClass("cur").siblings().removeClass("cur");
					$(".H-over1").hide();
					$(".H-over1:eq(" + _index + ")").show();
				}
			})(i));
		});
	});
</script>
<!-- 先取得num的值，在修改num的值，给表单提交 -->
<script type="text/javascript">
	function getNumber() {
		var num = document.getElementById('text_box').value;
		document.getElementById('text_box').value = num;
	}
</script>
</head>
<body>
	<%
		int goodId = Integer.parseInt(request.getParameter("goodId"));
		GoodService gs = new GoodServiceImpl();
		List<Good> list = gs.getgoodsByGoodId(goodId);
	%>

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
					<a href="myShopCart.jsp"><img src="theme/icon/logo.png"></a>
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
			<a href="front/index.jsp">首页</a> &gt; <a href="#">商品详情 </a>
		</div>
	</div>

	<!-- 商城快讯 begin -->
	<section id="member">
		<div class="member-center clearfix">
			<div class="item-inform">
				<div class="clearfixLeft" id="clearcontent">

					<div class="box">
						<!--图书照片-->
						<div class="tb-booth tb-pic tb-s310">
							<img src="theme/img/pd/<%=list.get(0).getGoodImgAdd()%>"
								class="jqzoom" />
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clearfixRight">
					<!--规格属性-->
					<!--名称-->
					<div class="tb-detail-hd">
						<h1><%=list.get(0).getGoodName()%></h1>
						<input type="hidden" id="goodId"
							value="<%=list.get(0).getGoodId()%>">
					</div>
					<div class="tb-detail-list">
						<!--价格-->
						<div class="tb-detail-price">
							<li class="price iteminfo_price">
								<dt>租金</dt>
								<dd>
									<em>¥</em><b class="sys_item_price"><%=list.get(0).getGoodPrice()%>/月
									</b>
								</dd>
							</li>
							<div class="clear"></div>
						</div>



						<!--各种规格-->
						<dl class="iteminfo_parameter sys_item_specpara">

							<dd>
								<!--操作页面-->
								<div class="theme-popover">
									<div class="theme-popbod dform">
										<form class="theme-signin" name="loginform"
											action="addshopcart_deal" method="post">
											<input type="hidden" id="userName" name="userName" value="${sessionScope.user.userName}">
											<input type="hidden" id="goodId" name="goodId" value="<%=list.get(0).getGoodId()%>">
											<div class="theme-signin-left">
												<div class="theme-options">
													<div class="cart-title number">数量</div>
													<dd>
														<input id="goodNumber" name="goodNumber" type="number" value="1"
															style="width: 50px; height: 25px; margin-top: 5px" /> <span
															id="Stock" class="tb-hidden" style="margin-top: 30px">库存<span
															class="stock" style="margin-top: 30px"><%=list.get(0).getGoodCount()%></span>件
														</span>
													</dd>
												</div>
											</div>
											<div class="pay">
												<li></li>
												<li>
													<div class="clearfix tb-btn tb-btn-basket theme-login">
														<input style="background-color: red; color: white;"
															id="addCart" class="submit am-btn" title="加入购物车"
															type="submit" value="加入购物车">
															<input style="background-color: red; color: white;"
															id="addOrder" class="submit am-btn" title="立即下单"
															type="submit" value="立即下单">
													</div>
												</li>
											</div>
										</form>
									</div>
								</div>
							</dd>
						</dl>

					</div>


				</div>
				<div class="clear"></div>

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
	<!--加入购物车的操作  -->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript">
		$("#addCart").click(function() {
			$.post("../admin.do?op=login","admin="+admin+"&adminPwd="+adminPwd,function(data,status){
				if("true"==data){
					location.href="index.jsp";
				}else{
					console.log(data);
					alert("")
				}
			});
		});
	</script>
	<!-- footer End -->
</body>
</html>