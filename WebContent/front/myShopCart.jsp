<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>我的购物车</title>
<link rel="shortcut icon" type="image/x-icon"
	href="theme/icon/favicon.ico">
<link href="theme/css/cartstyle.css" rel="stylesheet" type="text/css" />
<link href="theme/css/amazeui.css" rel="stylesheet"
	type="text/css" />
<link href="theme/css/demo.css" rel="stylesheet" type="text/css" />
<link href="theme/css/cartstyle.css" rel="stylesheet" type="text/css" />
<link href="theme/css/optstyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="theme/css/base.css">
<link rel="stylesheet" type="text/css" href="theme/css/member.css">
<script type="text/javascript" src="theme/js/jquery.js"></script>
<script type="text/javascript">
	(function(a) {
		a.fn.hoverClass = function(b) {
			var a = this;
			a.each(function(c) {
				a.eq(c).hover(function() {
					$(this).addClass(b)
				}, function() {
					$(this).removeClass(b)
				})
			});
			return a
		};
	})(jQuery);

	$(function() {
		$("#pc-nav").hoverClass("current");
	});
</script>

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
						<a href="myShopCart.jsp"><img src="theme/icon/car.png"></a>
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
			<a href="#">首页</a> &gt; <a href="#">我的购物车 </a>
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
							<a href="user-info.jsp">我的信息</a>
						</dd>
						<dd>
							<a href="list-receive.jsp">我的订单</a>
						</dd>
						<dd class="cur">
							<a href="#">我的收藏</a>
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
						<dd class="cur">
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
						<h2>我的购物车</h2>
					</div>
					<div class="member-backs member-icons fr">
						<a href="#">搜索</a>
					</div>
					<div class="member-about fr">
						<input type="text" placeholder="商品名称/商品编号">
					</div>
				</div>


				<div class="member-return H-over">

					<form action="pay.jsp" method="post" onsubmit="return check()">
						<!--购物车 -->
						<div class="concent">
							<div id="cartTable">
								<div class="cart-table-th">
									<div class="wp">
										<div class="th th-chk">
											<div id="J_SelectAll1" class="select-all J_SelectAll"></div>
										</div>
										<div class="th th-item">
											<div class="td-inner">商品信息</div>
										</div>
										<div class="th th-price">
											<div class="td-inner">单价</div>
										</div>
										<div class="th th-amount">
											<div class="td-inner">数量(小于1000)</div>
										</div>
										<div class="th th-sum">
											<div class="td-inner">金额</div>
										</div>
										<div class="th th-op">
											<div class="td-inner">操作</div>
										</div>
									</div>
								</div>
								<div class="clear"></div>

								<tr class="item-list">
									<div class="bundle  bundle-last "></div>
								</tr>

								<div class="clear"></div>

								<tr class="item-list">
									<div class="bundle  bundle-last ">

										<div class="bundle-main">
											<%-- <%
								if (session.getAttribute("username") == null) {
									PrintWriter pw = response.getWriter();
									pw.write("<script language='javascript'>alert('您还没有登录!');window.location.href='login.jsp';</script>");
									pw.close();
								}
								ArrayList<GoodsSingle> goodslist = (ArrayList<GoodsSingle>) session.getAttribute("goodslist");
								if (null != goodslist && goodslist.size() > 0) {
									for (int i = 0; i < goodslist.size(); i++) {
							%> --%>
											<ul class="item-content clearfix">
												<li class="td td-chk">
													<div class="cart-checkbox ">
														<!--
                                        	多选按钮
                                        -->
														<input class="check" id="checkAll" name="checkAll"
															type="checkbox" onclick="setSelectAll()"
															value="<%-- <%=goodslist.get(i).getID()%> --%>">
													</div>
												</li>
												<li class="td td-item">
													<div class="item-pic">
														<!--
                                        	图片
                                        -->
														<a href="#" target="_blank" data-title="图片"
															class="J_MakePoint" data-point="tbcart.8.12"> <img
															src="../images/book/<%-- <%=goodslist.get(i).getPicture()%> --%>"
															class="itempic J_ItemImg"></a>
													</div>
													<div class="item-info">
														<div class="item-basic-info">
															<a href="#" target="_blank" title="bookname"
																class="item-title J_MakePoint" data-point="tbcart.8.11">
																<%-- <%=goodslist.get(i).getName()%> --%>
															</a>
														</div>
													</div>
												</li>
												<li class="td td-info">
													<div class="item-props item-props-can">
												</li>
												<li class="td td-price">
													<div class="item-price price-promo-promo">
														<div class="price-content">
															<div class="price-line">
																<span id="price<%-- <%=i%> --%>">
																	<%-- <%=goodslist.get(i).getPrice()%> --%>
																</span>元
															</div>
														</div>
													</div>
												</li>
												<li class="td td-amount">
													<div class="amount-wrapper ">
														<div class="item-amount ">
															<div class="sl">
																<input class="min am-btn" type="button" value="-"
																	onclick="setAllPrice()" /> <input class="text_box"
																	id="num<%-- <%=i%> --%>" type="number"
																	onkeyup="setAllPrice()" name="num"
																	value="<%-- <%=goodslist.get(i).getNum()%> --%>"
																	style="width: 30px;" /> <input class="add am-btn"
																	type="button" value="+" onclick="setAllPrice()" />
															</div>
														</div>
													</div>
												</li>
												<li class="td td-sum">
													<div class="td-inner">
														<span id="allprice<%-- <%=i%> --%>"></span> <input
															type="hidden" id="hiddenAllprice<%-- <%=i%> --%>"
															name="Allprice<%-- <%=i%> --%>" value="" />
													</div>
												</li>
												<li class="td td-op">
													<div class="td-inner">
														<a
															href="shopDelete_deal.jsp?ID=<%-- <%=goodslist.get(i).getID()%> --%>"
															data-point-url="#" class="delete"> 删除</a>
													</div>
												</li>
											</ul>
											<%-- <%
								}
								} else {
									PrintWriter pw = response.getWriter();
									pw.write("<script language='javascript'>alert('购物车为空！');window.location.href='index.jsp';</script>");
									pw.close();
								}
							%> --%>
										</div>
									</div>
								</tr>
							</div>


							<div class="float-bar-wrapper">
								<div id="J_SelectAll2" class="select-all J_SelectAll">
									<div class="cart-checkbox">
										<input type="checkbox" class="check-all check"
											name="select-all" id="selAll" onclick="selectAll();" /> <label
											for="J_SelectAllCbx2"></label>
									</div>
									<span>全选</span>

								</div>
								<div class="operations">
									<a href="shopRemoveAll.jsp" hidefocus="true" class="deleteAll">清空购物车</a>
									<input type="checkbox" id="inverse" onclick="setNoSelect();" /><span>反选</span>
								</div>

								<div class="float-bar-right">
									<div class="amount-sum">
										<span class="txt">已选商品</span> <span class="txt" id="checked"></span>
										<span class="txt">件</span>
										<div class="arrow-box">
											<span class="selected-items-arrow"></span> <span
												class="arrow"></span>
										</div>
									</div>
									<div class="price-sum">
										<span class="txt">合计:</span> ¥<span class="price" id="J_Total"></span>
										<input type="hidden" id="hiddenTotal" name="total" value="" />
									</div>
									<div>
										<input type="submit" id="J_Go" class="am-btn am-btn-danger"
											value="结&nbsp;算">
									</div>
								</div>
							</div>
					</form>
				</div>



				<div class="clearfix" style="padding: 30px 20px;">
					<div class="fr pc-search-g pc-search-gs">
						<a style="display: none" class="fl " href="#">上一页</a> <a href="#"
							class="current">1</a> <a href="javascript:;">2</a> <a
							href="javascript:;">3</a> <a href="javascript:;">4</a> <a
							href="javascript:;">5</a> <a href="javascript:;">6</a> <a
							href="javascript:;">7</a> <span class="pc-search-di">…</span> <a
							href="javascript:;">1088</a> <a title="使用方向键右键也可翻到下一页哦！" class=""
							href="javascript:;">下一页</a>
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
<script language="javascript">

	//选中全选按钮，下面的checkbox全部选中 
	var selAll = document.getElementById("selAll");
	function selectAll() {
		var obj = document.getElementsByName("checkAll");
		if (document.getElementById("selAll").checked == false) {
			for (var i = 0; i < obj.length; i++) {
				obj[i].checked = false;
				document.getElementById("checked").innerHTML = 0;
				document.getElementById("J_Total").innerHTML = 0;
			}
		} else {
			for (var i = 0; i < obj.length; i++) {
				obj[i].checked = true;
				document.getElementById("checked").innerHTML = obj.length;
				setSelectAll();
			}
		}
	}

	//当选中所有的时候，全选按钮会勾上 
	function setSelectAll() {
		var obj = document.getElementsByName("checkAll");
		var count = obj.length;
		var selectCount = 0;
		var pay = 0;
		for (var i = 0; i < count; i++) {
			if (obj[i].checked == true) {
				selectCount++;
				//获取span值
				var price = parseFloat($('#allprice' + i).html());
				pay = parseFloat(pay) + price;
			}
			//打印选中个数
			document.getElementById("checked").innerHTML = selectCount;
		}
		//计算选中的价格并打印

		document.getElementById("J_Total").innerHTML = pay;
		//给input隐藏域赋值
		document.getElementById("hiddenTotal").value = pay;
		if (count == selectCount) {
			document.all.selAll.checked = true;
		} else {
			document.all.selAll.checked = false;
		}
	}

	//反选按钮 
	function setNoSelect() {
		var checkboxs = document.getElementsByName("checkAll");
		for (var i = 0; i < checkboxs.length; i++) {
			var e = checkboxs[i];
			e.checked = !e.checked;
			setSelectAll();
		}
	}

	//判断是否有商品与数量不为0 
	function check() {
		var checknum = parseFloat($('#checked').html());
		var total = parseFloat($('#J_Total').html());
		if (checknum == 0) {
			alert('未选中需要购买的商品');
			return false;
		} else if (total == 0) {
			alert('数量不能为0');
			return false;
		} else {
			return true;
		}
	}
</script>


</head>

<script type="text/javascript">
	function setAllPrice() {
		for (var i = 0; i < 10; i++) {
			//获取span值
			var price = $('#price' + i).html();
			var num = document.getElementById('num' + i).value;
			//计算
			if (num > 1000) {
				alert('超过最大输入数量');
				document.getElementById('num' + i).value = 0;
				num = 0;
			} else if (num < 0 || num == "") {
				document.getElementById('num' + i).value = 0;
				num = 0;
			}
			var allprice = (price) * (num);
			//赋值
			document.getElementById("allprice" + i).innerHTML = allprice;
			//给隐藏域的价格赋值
			document.getElementById("hiddenAllprice" + i).value = allprice;
			setSelectAll();
		}
	}
</script>
	<!-- footer End -->
</body>
</html>