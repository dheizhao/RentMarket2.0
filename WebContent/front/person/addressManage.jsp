<%-- 
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Control.MemberDao"%>
<%@page import="Control.addressDao"%>
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

<title>地址管理</title>

<link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="../css/personal.css" rel="stylesheet" type="text/css">
<link href="../css/addstyle.css" rel="stylesheet" type="text/css">
<script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"
	type="text/javascript"></script>
<script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>

</head>

<script type="text/javascript">
	function check(temp) {
		var re = /^1\d{10}$/
		if (!re.test(temp.value)) {
			alert("手机号码格式不正确，请重新输入!");
			document.getElementById("user-phone").value = "";
			return;
		}
	}

	function checkaddress(temp) {
		var patt3 = /^[\u4e00-\u9fa5]{6,20}$/
		if (!patt3.test(temp.value)) {
			alert("收货地址请输入6-20个汉字!");
			document.getElementById("user-intro").value = "";
			return;
		}
	}
	function checkAll() {
			var name = document.getElementById("user-name").value.trim();
			var tel = document.getElementById("user-phone").value;
			var add = document.getElementById("user-intro").value;
			if (name == "" || tel == "" || add == "") {
				alert("所有信息都需要填写");
				return false;
			} else {
				return true;
			}
		}
</script>
<body>
	<!--头 -->
	<header> <article> <!--悬浮搜索框-->

	<div class="nav white">
		<div class="logoBig">
			<li><img src="../images/logobig.png" /></li>
		</div>

		<div class="search-bar pr">
			<a name="index_none_header_sysc" href="#"></a>
			<form>
				<input id="searchInput" name="index_none_header_sysc" type="text"
					placeholder="搜索" autocomplete="off"> <input
					id="ai-topsearch" class="submit am-btn" value="搜索" index="1"
					type="submit">
			</form>
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

				<div class="user-address">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">地址管理</strong> / <small>Address&nbsp;list</small>
						</div>
					</div>
					<hr />
					<ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails">
						<%
							String username = session.getAttribute("username").toString();

							MemberDao memberdao = new MemberDao();
							int ID = memberdao.selectByuserName(username).getID();

							addressDao Dao = new addressDao();
							ResultSet rs = Dao.getAddressByUserID(ID);
							while (rs.next()) {
						%>
						<li class="user-addresslist defaultAddr">

							<p class="new-tit new-p-re">
								<span class="new-txt"><%=rs.getString(3)%></span> <span
									class="new-txt-rd2"><%=rs.getString(4)%></span>
							</p>
							<div class="new-mu_l2a new-p-re">
								<p class="new-mu_l2cw">
									<span class="title">地址：</span> <span class="street"><%=rs.getString(5)%></span>
								</p>
							</div>
							<div class="new-addr-btn">
								<a href=delAddress_deal.jsp?ID=<%=rs.getString(1)%>> <i
									class="am-icon-trash"></i>删除
								</a>
							</div>
						</li>

						<%
							}
						%>

					</ul>

					<div class="clear"></div>


					<a class="new-abtn-type"
						data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
					<!--例子-->
					<div class="am-modal am-modal-no-btn" id="doc-modal-1">

						<div class="add-dress">

							<!--标题 -->
							<div class="am-cf am-padding">
								<div class="am-fl am-cf">
									<strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add&nbsp;address</small>
								</div>
							</div>
							<hr />

							<div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">
								<form class="am-form am-form-horizontal"
									action="addAddress_deal" method="post"
									onsubmit="return checkAll()">

									<div class="am-form-group">
										<label for="user-name" class="am-form-label">收货人</label>
										<div class="am-form-content">
											<input type="text" id="user-name" name="receiveName"
												placeholder="收货人">
										</div>
									</div>
									<input type="hidden" name="ID" value="<%=ID%>">
									<div class="am-form-group">
										<label for="user-phone" class="am-form-label">手机号码</label>
										<div class="am-form-content">
											<input id="user-phone" onblur="check(this)" name="tel"
												placeholder="手机号必填" type="text">
										</div>
									</div>


									<div class="am-form-group">
										<label for="user-intro" class="am-form-label">详细地址</label>
										<div class="am-form-content">
											<input type="text" name="address" id="user-intro"
												onblur="checkaddress(this)" maxlength="100"
												placeholder="输入详细地址"> <small>100字以内写出你的详细地址...</small>
										</div>
									</div>

									<div class="am-form-group">
										<div class="am-u-sm-9 am-u-sm-push-3">
											<input type="submit" class="am-btn am-btn-danger" value="保存" />
											<a href="javascript: void(0)"
												class="am-close am-btn am-btn-danger" data-am-modal-close>取消</a>
										</div>
									</div>
								</form>
							</div>

						</div>

					</div>

				</div>

				<script type="text/javascript">
					$(document).ready(function() {
						$(".new-option-r").click(function() {
							$(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
						});
				
						var $ww = $(window).width();
						if ($ww > 640) {
							$("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
						}
				
					})
				</script>

				<div class="clear"></div>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="../HOME/index.jsp">商城首页</a> <b>|</b> <a href="#">支付宝</a>
						<b>|</b> <a href="#">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="#">合作伙伴</a> <a href="#">联系我们</a> <a href="#">网站地图</a>
					</p>
				</div>
			</div>
		</div>

		<aside class="menu">
		<ul>
			<li class="person"><a href="index.jsp">个人中心</a></li>
			<li class="person"><a href="#">个人资料</a>
				<ul>
					<li><a href="information.jsp">个人信息</a></li>
					<li><a href="safety.jsp">安全设置</a></li>
					<li class="active"><a href="addressManage.jsp">收货地址</a></li>
				</ul></li>
			<li class="person"><a href="#">我的交易</a>
				<ul>
					<li><a href="order.jsp">订单管理</a></li>
				</ul></li>

		</ul>

		</aside>
	</div>

</body>

</html>
 --%>