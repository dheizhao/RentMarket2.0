<%-- <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="Control.MemberDao"%>
<%@page import="User.Member"%>
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

<title>修改密码</title>

<link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="../css/personal.css" rel="stylesheet" type="text/css">
<link href="../css/stepstyle.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>

</head>


<script type="text/javascript">
	function check() {
		var pwd = document.getElementById("user-old-password").value;
		var pwd1 = document.getElementById("user-new-password").value;
		var pwd2 = document.getElementById("user-confirm-password").value;
		if (pwd == "" || pwd1 == "" || pwd2 == "") {
			alert("所有信息都需要填写");
			return false;
		} else if (pwd1 != pwd2) {
			alert("两次密码不一致");
		document.getElementById("user-old-password").value = "";
		document.getElementById("user-new-password").value= "";
		document.getElementById("user-confirm-password").value= "";
			return false;
		} else {
			return true;
		}
	}

	function checkpwd(temp) {
		var re = /(?!^\d+$)(?!^[a-zA-Z]+$)[0-9a-zA-Z]{6,23}/
		if (!re.test(temp.value)) {
			alert("为了提高密码强度，密码只能是数字与字母组合,且大于6位。");
			document.getElementById("user-new-password").value = "";
			return;
		}
	}
</script>


<body>
	<!--头 -->
	<header> <article>
	<div class="mt-logo">
		<%
			Object user = session.getAttribute("username");
			String username = user.toString();
			MemberDao dao = new MemberDao();
			Member m = dao.selectByuserName(username);
		%>

		<!--悬浮搜索框-->

		<div class="nav white">
			<div class="logoBig">
				<li><img src="../images/logobig.png" /></li>
			</div>

			<div class="search-bar pr"></div>
		</div>

		<div class="clear"></div>
	</div>
	</div>
	</article> </header>

	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="am-cf am-padding">
					<div class="am-fl am-cf">
						<strong class="am-text-danger am-text-lg">修改密码</strong> / <small>Password</small>
					</div>
				</div>
				<hr />
				<!--进度条-->
				<div class="m-progress">
					<div class="m-progress-list">
						<span class="step-1 step"> <em class="u-progress-stage-bg"></em>
							<i class="u-stage-icon-inner">1<em class="bg"></em></i>
							<p class="stage-name">重置密码</p>
						</span> <span class="step-2 step"> <em class="u-progress-stage-bg"></em>
							<i class="u-stage-icon-inner">2<em class="bg"></em></i>
							<p class="stage-name">完成</p>
						</span> <span class="u-progress-placeholder"></span>
					</div>
					<div class="u-progress-bar total-steps-2">
						<div class="u-progress-bar-inner"></div>
					</div>
				</div>
				<form class="am-form am-form-horizontal"
					action="updataPassword_deal" method="post"
					onsubmit="return check()">
					<input type="hidden" name="username" value="<%=m.getUsername()%>">
					<div class="am-form-group">
						<label for="user-old-password" class="am-form-label">原密码</label>
						<div class="am-form-content">
							<input type="password" name="oldPwd" id="user-old-password"
								placeholder="请输入原登录密码">
						</div>
					</div>
					<div class="am-form-group">
						<label for="user-new-password" class="am-form-label">新密码</label>
						<div class="am-form-content">
							<input type="password" name="newPwd" onblur="checkpwd(this)"
								id="user-new-password" placeholder="请输入新登录密码">
						</div>
					</div>
					<div class="am-form-group">
						<label for="user-confirm-password" class="am-form-label">确认密码</label>
						<div class="am-form-content">
							<input type="password" id="user-confirm-password"
								placeholder="请再次输入上面的密码">
						</div>
					</div>
					<div class="info-btn">
						<input class="am-btn am-btn-danger" type="submit" value="保存修改" />
					</div>
				</form>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						 <b>|</b> <a href="#">商城首页</a> <b>|</b> <a
							href="#">支付宝</a> <b>|</b> <a href="#">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="#">关于恒望</a> <a href="#">合作伙伴</a> <a href="#">联系我们</a> <a
							href="#">网站地图</a>
					</p>
				</div>
			</div>
		</div>

		<aside class="menu">
		<ul>
			<li class="person"><a href="index.html">个人中心</a></li>
			<li class="person"><a href="#">个人资料</a>
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

</body>

</html> --%>