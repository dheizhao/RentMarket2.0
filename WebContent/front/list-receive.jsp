<%@page import="com.etc.RentMarket.entity.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.etc.RentMarket.entity.Order"%>
<%@page import="com.etc.RentMarket.service.impl.OrderServiceImpl"%>
<%@page import="com.etc.RentMarket.service.OrderService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>我的订单</title>
<link rel="shortcut icon" type="image/x-icon"
	href="theme/icon/favicon.ico">
<link rel="stylesheet" type="text/css" href="theme/css/base.css">
<link rel="stylesheet" type="text/css" href="theme/css/member.css">
<link href="theme/css/admin.css" rel="stylesheet" type="text/css">
<link href="theme/css/amazeui.css" rel="stylesheet" type="text/css">
<link href="theme/css/personal.css" rel="stylesheet" type="text/css">
<link href="theme/css/orstyle.css" rel="stylesheet" type="text/css">
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
			<a href="front/index.jsp">首页</a> &gt; <a href="user-info.jsp">会员中心 </a>
		</div>
	</div>

	<!-- 商城快讯 begin -->
	<section id="member">
		<div class="member-center clearfix">
			<div class="member-left fl">
				<div class="member-lists">
					<dl>
						<dt>我的商城</dt>
						<dd>
							<a href="front/user-info.jsp">我的信息</a>
						</dd>
						<dd class="cur">
							<a href="#">我的订单</a>
						</dd>
						<dd>
							<a href="myfavorite.jsp">我的收藏</a>
						</dd>
						<dd>
							<a href="comment.jsp">我的评价</a>
						</dd>
						<dd>
							<a href="ads.do?op=sel">地址管理</a>
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
				<div class="member-head">
					<div class="member-heels fl">
						<h2>我的订单</h2>
					</div>
					<form method="post" action="os.do?op=sel">
						<div class="member-backs member-icons fr">
							<button style="color: white;width:50px; height:26px; line-height:26px; text-align:center; display:block; color:#fff; background:#000000; border-radius:2px;border: 0px solid">搜索</button>
						</div>
						<div class="member-about fr">
							<input type="text" placeholder="商品名称" name="keywords" id="keywords" value="${keywords}">
						</div>
						
					</form>
				</div>
				<div class="user-order">
					<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

						<ul class="am-avg-sm-5 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active"><a href="#tab1">所有订单</a></li>
						</ul>
						<div class="am-tabs-bd">
							<div class="am-tab-panel am-fade am-in am-active" id="tab1">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-price">
										<td class="td-inner">归还时间</td>
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
								<!-- 循环开始 -->
								<c:forEach  var="o" items="${requestScope.pd.data}">
								<div class="order-main">
									<div class="order-list">
										<!--交易成功-->
										<div class="order-status5">
											<div class="order-title">
												<div class="dd-num">
													订单编号：
													${o.orderId}
													<a href="javascript:;"></a>
												</div>
												<span>成交时间：${o.orderDate}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
												<span>收货地址：${o.userAddress}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
												<span>联系电话：${o.userTel}</span>
											</div>
											
											
											
											<div class="order-content">
												<div class="order-left">
													<ul class="item-list">
														<li class="td td-item">
															<div class="item-pic">
																<a href="#" class="J_MakePoint"> <img
																	src="theme/img/pd/${o.goodImg}"
																	class="itempic J_ItemImg">
																</a>
															</div>
															<div class="item-info">
																<div class="item-basic-info">
																	<a href="#">
																		<p>
																			${o.goodName} 
																		</p>
																		<p class="info-little">
																			<br />运费：包邮
																		</p>
																	</a>
																</div>
															</div>
														</li>
														<li class="td td-price">
															<div class="item-price">
																${o.rentDate}
															</div>
														</li>
														<li class="td td-number">
															<div class="item-number">
																<span>×</span>
																${o.goodNumber}
															</div>
														</li>
													</ul>
													<li class="td td-operation">
														<div class="item-operation"></div>
													</li>
													</ul>
												</div>
												<div class="order-right">
													<li class="td td-amount">
														<div class="item-amount" style="margin-top: -20px">
															合计：<span style="color: red">
															￥${o.orderTPrice}
															</span>
															<p>
																收货人：<span>
																	${o.userName}
																</span>
															</p>
														</div>
													</li>
													<div class="move-right">
														<li class="td td-status">
															<div class="item-status">
																<p class="Mystatus">${o.orderState==0?"未收货":"已收货" }</p>
															</div>
														</li>
														
													</div>
												</div>
											</div>
											
											
										</div>
									</div>
								</div>
								</c:forEach>
							</div>

						</div>
					</div>
					<!-- layui分页开始 -->
					<div id="pageDiv" style="text-align: center"></div>

					<!-- layui分页结束 -->
				</div>
			</div>
		</div>
		<link rel="stylesheet" href="layui/css/layui.css" media="all">

	<script src="layui/layui.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
	layui.use(['laypage', 'layer'], function(){
  var laypage = layui.laypage
  ,layer = layui.layer;
  
//完整功能
  laypage.render({
    elem: 'pageDiv'
    ,count: ${pd.total} 
    ,curr:${pd.page}
   ,limit:${pd.pageSize}
    ,layout: ['count', 'prev', 'page','limit','next', 'skip']
    ,jump: function(obj,first){
      console.log(obj);
      console.log(first);
    //首次不执行
      if(!first){
        //do something
    	  location.href="os.do?op=sel&page="+obj.curr+"&pageSize="+obj.limit+"&keywords="+document.getElementById("keywords").value;
      }
    }
  });
 
});
</script>
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