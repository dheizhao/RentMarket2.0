<%@ page language="java" pageEncoding="utf-8"%>
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
<title>用户注册</title>
<link rel="shortcut icon" type="image/x-icon"
	href="theme/icon/favicon.ico">
<link rel="stylesheet" type="text/css" href="theme/css/base.css">
<link rel="stylesheet" type="text/css" href="theme/css/login.css">
<style type="text/css">
.tip {
	font-size: medium;
	color: red;
}
</style>
</head>
<body>

	<!--- header begin-->
	<header id="pc-header">
		<div class="login-header" style="padding-bottom: 0">
			<div>
				<h1>
					<a href="index.html"><img src="theme/icon/logo.png"></a>
				</h1>
			</div>
		</div>
	</header>
	<!-- header End -->



	<section id="login-content">
		<div class="login-centre">
			<div class="login-switch clearfix">
				<p class="fr">
					我已经注册，现在就 <a href="login.jsp">登录</a>
				</p>
			</div>
			<div class="login-back">
				<div class="H-over">
					<form method="post" action="../us.do?op=add" id="registerform">
						<div class="login-input">
							<label><i class="heart">*</i>用户名：</label> <input type="text"
								class="list-input1" id="username" name="username" value=""
								placeholder="请输入正确格式的用户名">
							<div id="msg_username" class="tip"></div>
						</div>
						<div class="login-input">
							<label><i class="heart">*</i>请设置密码：</label> <input
								type="password" class="list-input" id="password" name="password"
								placeholder="请输入密码">
							<div id="msg_userpwd" class="tip"></div>
						</div>
						<div class="login-input">
							<label><i class="heart">*</i>请确认密码：</label> <input
								type="password" class="list-input" id="repassword"
								name="repassword" placeholder="请确认密码">
							<div id="msg_userCpwd" class="tip"></div>
						</div>
						<div class="item-ifo">
							<input type="checkbox" onClick="agreeonProtocol();" id="readme"
								checked="checked" class="checkbox"> <label
								for="protocol">我已阅读并同意<a id="protocol" class="blue"
								href="#">《易点租用户协议》</a></label> <span class="clr"></span>
						</div>
						<div class="login-button">
							<input type="submit" value="注册" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>

	<!--- footer begin-->
	<footer id="footer">
		<div class="containers">
			<div class="w" style="padding-top: 30px">
				<div id="footer-2013">
					<div class="links">
						<a href="">关于我们</a> | <a href="">联系我们</a> | <a href="">人才招聘</a> |
						<a href="">商家入驻</a> | <a href="">广告服务</a> | <a href="">手机京东</a> |
						<a href="">友情链接</a> | <a href="">销售联盟</a> | <a href="">English
							site</a>
					</div>
					<div style="padding-left: 10px">
						<p style="padding-top: 10px; padding-bottom: 10px; color: #999">网络文化经营许可证：浙网文[2013]0268-027号|
							增值电信业务经营许可证：浙B2-20080224-1</p>
						<p style="padding-bottom: 10px; color: #999">信息网络传播视听节目许可证：1109364号
							| 互联网违法和不良信息举报电话:0571-81683755</p>
					</div>
				</div>
			</div>

		</div>
	</footer>
	<!-- footer End -->

	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>

	<script>
		$(function() {
			$("#username").blur(
					function() {
						console.log(Math.random());
						$.get("../us.do", "username=" + $(this).val()
								+ "&random=" + Math.random(), function(data,
								status) {
							if (status == "success") {
								$("#msg_username").html(data);
							}
						});
					});
			$("#password").blur(
					function() {
						console.log(Math.random());
						$.get("../us.do", "password=" + $(this).val()
								+ "&random=" + Math.random(), function(data,
								status) {
							if (status == "success") {
								$("#msg_userpwd").html(data);
							}
						});
					});
			$("#repassword").blur(
					function() {
						console.log(Math.random());
						$.get("../us.do", "repassword=" + $(this).val()
								+ "&random=" + Math.random(), function(data,
								status) {
							if (status == "success") {
								$("#msg_userCpwd").html(data);
							}
						});
					});
		});
	</script>

</body>
</html>