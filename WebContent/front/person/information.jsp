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

<title>个人资料</title>

<link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="../css/personal.css" rel="stylesheet" type="text/css">
<link href="../css/infstyle.css" rel="stylesheet" type="text/css">
<script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"
	type="text/javascript"></script>
<script src="../AmazeUI-2.4.2/assets/js/amazeui.js"
	type="text/javascript"></script>

</head>
<script type="text/javascript">
	function checkAll() {
		var username = document.getElementById("user-name2").value.trim();
		var name = document.getElementById("user-name").value.trim();
		var city = document.getElementById("city").value.trim();
		var tel = document.getElementById("user-phone").value.trim();
		
		if (username == "" || name == "" || city == "" || tel == "") {
			alert("所有信息都需要填写");
			return false;
		} else {
			return true;
		}
	}
	function check(temp) {
		var re = /^1\d{10}$/
		if (!re.test(temp.value)) {
			alert("手机号码格式不正确，请重新输入!");
			document.getElementById("user-phone").value = "";
			return;
		}
	}

	function checkatruename(temp) {
		var patt3 = /^[\u4e00-\u9fa5]{2,4}$/
		if (!patt3.test(temp.value)) {
			alert("真实姓名应由2-4个汉字组成。");
			document.getElementById("user-name").value = "";
			return;
		}
	}

	//判断是否选择头像，选择可上传
	function checkLoad() {
		var load = document.getElementById("load").value;
		if (load == null || load == "") {
			alert("请选择需要上传的头像");
			return false;
		} else {
			return true;
		}

		}
</script>
<script type="text/javascript">
	function getCity() {
		$.getScript('http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js',
			function IP() {
				var country = remote_ip_info.country; //国家  
				var province = remote_ip_info.province; //省份  
				var city = remote_ip_info.city; //城市  
				//给文本框赋值
				document.getElementById("city").value = country + province + city;
			});
	}
</script>
<body>

	<%
		MemberDao dao = new MemberDao();
		String username = (String) session.getAttribute("username");
		Member m = dao.selectByuserName(username);
	%>
	<!--头 -->
	<header> <article>
	<div class="mt-logo">

		<!--悬浮搜索框-->
		<div class="nav white">
			<div class="logoBig">
				<li><img src="../images/logobig.png" /></li>
			</div>

			<div class="search-bar pr">
				<a name="index_none_header_sysc" href="#"></a> <span>个人中心</span>
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

				<div class="user-info">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small>
						</div>
					</div>
					<hr />

					<!--头像 -->
					<form method="post" action="do_upload"  onsubmit="return checkLoad()"
						enctype="multipart/form-data">
						<div class="user-infoPic">
							<div class="filePic">
								<input type="file" class="inputPic" name="file1" size="30"
									id="load">
								<%
									if (m.getPhoto().trim().equals("")) {
								%>
								<img class="am-circle am-img-thumbnail"
									style="width:100px; height:100px; border-radius:50%; overflow:hidden;"
									src="../images/getAvatar.do.jpg" alt="" />
								<%
									} else {
								%>
								<img class="am-circle am-img-thumbnail"
									style="width:100px; height:100px; border-radius:50%; overflow:hidden;"
									src="..<%=m.getPhoto()%>" alt="" />
								<%} %>
							</div>
							<p class="am-form-help">头像</p>
							<div class="info-m">
								<div>
									<b>用户名：<i><%=username%></i></b>
								</div>
								<div class="u-level">
									<input type="submit" name="submit" value="上传头像" >
								</div>
							</div>
					</form>
				</div>

				<!--个人信息 -->
				<div class="info-main">
					<form class="am-form am-form-horizontal" action="memberChangeIFOR"
						method="post" onsubmit="return checkAll()">
						<input type="hidden" name="un" value="<%=m.getID()%>">
						<div class="am-form-group">
							<label for="user-name2" class="am-form-label">昵称</label>
							<div class="am-form-content">
								<input type="text" id="user-name2" name="username"
									placeholder="nickname" value="<%=m.getUsername()%>">
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-name" class="am-form-label">姓名</label>
							<div class="am-form-content">
								<input type="text" id="user-name" onblur="checkatruename(this)"
									name="truename" value="<%=m.getTruename()%>">
							</div>
						</div>
						<div class="am-form-group">
							<label for="user-birth" class="am-form-label">城市</label>
							<div class="am-form-content birth">
								<div class="birth-select">
									<input type="text" id="city" name="city"
										value="<%=m.getCity()%>"> <input type="button"
										onclick="getCity()" value="使用本地地址">
								</div>
							</div>
						</div>
						<div class="am-form-group">
							<label for="user-phone" class="am-form-label">电话</label>
							<div class="am-form-content">
								<input id="user-phone" type="text" name="telephone"
									onblur="check(this)" value="<%=m.getTel()%>">
							</div>
						</div>
						<div class="info-btn">
							<div>
								<input type="submit" class="am-btn am-btn-danger" value="保存修改" >
							</div>
						</div>
					</form>
				</div>
			</div>

		</div>
		<!--底部-->
		<div class="footer">
			<div class="footer-hd">
				<p>
					</b> <a href="../HOME/index.jsp">商城首页</a> <b>|</b> <a
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
		<li class="person"><a href="index.jsp">个人中心</a></li>
		<li class="person"><a href="#">个人资料</a>
			<ul>
				<li class="active"><a href="information.jsp">个人信息</a></li>
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