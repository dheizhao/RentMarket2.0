<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
	<title>我的地址</title>
    <link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="theme/css/base.css">
	<link rel="stylesheet" type="text/css" href="theme/css/base.css">
	<link rel="stylesheet" type="text/css" href="theme/css/member.css">
	<!-- Bootstrap core CSS -->
    <link href="theme/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="theme/css/dashboard.css" rel="stylesheet">
    <link href="theme/css/bootstrap-combined.min.css" rel="stylesheet">
    <link href="theme/css/layoutit.css" rel="stylesheet">
    <script type="text/javascript" src="theme/js/jquery-2.0.0.min.js"></script>
	<script type="text/javascript" src="theme/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="theme/js/jquery-ui.js"></script>
	<script type="text/javascript" src="theme/js/jquery.ui.touch-punch.min.js"></script>
	<script type="text/javascript" src="theme/js/jquery.htmlClean.js"></script>
    
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

<div class="containers"><div class="pc-nav-item"><a href="front/index.jsp">首页</a> &gt; <a href="user-info.jsp">会员中心 </a></div></div>

<!-- 商城快讯 begin -->
<section id="member">
    <div class="member-center clearfix">
        <div class="member-left fl">
            <div class="member-lists">
                <dl>
                    <dt>我的商城</dt>
                    <dd><a href="front/user-info.jsp">我的信息</a></dd>
                    <dd><a href="os.do?op=sel">我的订单</a></dd>
                    <dd><a href="myfavorite.jsp">我的收藏</a></dd>
                    <dd><a href="comment.jsp">我的评价</a></dd>
                    <dd class="cur"><a href="#">地址管理</a></dd>
                </dl>
                <dl>
                    <dt>客户服务</dt>
                    <dd><a href="#">退货申请</a></dd>
                    <dd><a href="#">退货/退款记录</a></dd>
                </dl>
                <dl>
                    <dt>我的消息</dt>
                    <dd><a href="#">商城快讯</a></dd>
                    <dd><a href="#">帮助中心</a></dd>
                </dl>
            </div>
        </div>
        <div class="member-right fr">
            <div class="member-head">
                <div class="member-heels fl"><h2 style="margin-top: 3px;font-size: 18px">地址管理</h2></div>
            </div>
            <div class="member-border">
                <div class="member-newly"><a role="button" class="btn" data-toggle="modal" data-target="#Mymodal2" contenteditable="true">新增地址</a></div>
                <!-- 循环开始 -->
                <c:forEach var="a" items="${requestScope.list}">
                	
                
                <div class="member-sites">
                    <ul>
                        <li class="clearfix">
                            <div class="user-info1 fl clearfix">
                                <div class="user-info">
                                    <span class="info1">收货人：</span>
                                    <span class="info2">${a.userRealName}</span>
                                </div>
                                <div class="user-info">
                                    <span class="info1">地址：</span>
                                    <span class="info2">${a.userAddress}</span>
                                </div>
                                <div class="user-info">
                                    <span class="info1">手机：</span>
                                    <span class="info2">${a.userPhone}</span>
                                </div>
                            </div>

                            <div class="pc-event">
                                <a role="button" class="btn" data-toggle="modal" data-target="#Mymodal3" contenteditable="true">修改 </a>
                                <a role="button" class="btn" data-toggle="modal" data-target="#Mymodal4" contenteditable="true">删除</a>
                            </div>
                        </li>

                       
                    </ul>
                </div>
                
                
                <!-- 添加遮罩开始 -->
               <div class="modal fade" tabindex="-1" role="dialog" id="Mymodal2" style="height: 500px">
						<div class="modal-dialog" role="document">
							<div class="modal-content" style="height: 500px;margin-top: -30px">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title">新增地址</h4>
								</div>
								<div class="modal-body">
									<input type="hidden" id="id" name="id">
									<!-- 内容部分 -->
									<form class="form-horizontal" action="ads.do?op=add"
										role="form" method="post">
										<div class="form-group">
											<input type="hidden" id="userName" name="userName" value="${sessionScope.user.userName}">
											<label for="userRealName">收货人</label> <input type="text"
												class="form-control" id="userRealName" name="userRealName" placeholder="" style="height: 40px;width: 550px" required="required"/>
										</div>
										<div class="form-group">
											<label for="userAddress">地址</label> <input type="text"
												class="form-control" id="userAddress" name="userAddress"
												placeholder="地址" style="height: 40px;width: 550px" required="required"/>
										</div>
										<div class="form-group">
											<label for="userPhone">手机</label> <input type="text"
												class="form-control" name="userPhone" id="userPhone"
												placeholder="手机" style="height: 40px;width: 550px" required="required"/>
										</div>
										<button type="submit" class="btn btn-default">提交</button>
									</form>
									<!-- 内容部分 -->
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->
            <!-- 添加遮罩结束 -->    
            
            <!-- 修改遮罩开始 -->
               <div class="modal fade" tabindex="-1" role="dialog" id="Mymodal3" style="height: 500px"> 
						<div class="modal-dialog" role="document">
							<div class="modal-content" style="height: 500px;margin-top: -30px">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title">修改地址</h4>
								</div>
								<div class="modal-body">
									<input type="hidden" id="id" name="id">
									<!-- 内容部分 -->
									<form class="form-horizontal" action="ads.do?op=up"
										role="form" method="post">
										<div class="form-group">
											<input type="hidden" id="userDetailId" name="userDetailId" value="${a.userDetailId}">
											<label for="userRealName">收货人</label> <input type="text"
												class="form-control" id="userRealName" name="userRealName" placeholder="" style="height: 40px;width: 550px"/>
										</div>
										<div class="form-group">
											<label for="userAddress">地址</label> <input type="text"
												class="form-control" id="userAddress" name="userAddress"
												placeholder="地址" style="height: 40px;width: 550px"/>
										</div>
										<div class="form-group">
											<label for="userPhone">手机</label> <input type="text"
												class="form-control" name="userPhone" id="userPhone"
												placeholder="手机" style="height: 40px;width: 550px"/>
										</div>
										<button type="submit" class="btn btn-default">提交</button>
									</form>
									<!-- 内容部分 -->
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->
            <!-- 修改遮罩结束 --> 
            
            <!-- 删除遮罩开始 -->
               <div class="modal fade" tabindex="-1" role="dialog" id="Mymodal4" style="height: 170px"> 
						<div class="modal-dialog" role="document">
							<div class="modal-content" style="height: 500px;margin-top: -30px">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title">删除地址</h4>
								</div>
								<div class="modal-body">
									<input type="hidden" id="id" name="id">
									<!-- 内容部分 -->
									<form class="form-horizontal" action="ads.do?op=del"
										role="form" method="post">
										<div class="form-group">
											<input type="hidden" id="userDetailId" name="userDetailId" value="${a.userDetailId}">
											<label style="text-align: center;">确认删除该地址？</label>
										</div>
										<button type="submit" class="btn btn-default" style="margin-left: 170px">确定</button>
										<input type="button" onclick="javascript:location.href='ads.do?op=sel'" class="btn btn-default" style="margin-left: 100px" value="取消"></input>
									</form>
									<!-- 内容部分 -->
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->
            <!-- 删除遮罩结束 --> 
            </c:forEach>
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
                <span><img src="theme/icon/icon-d1.png"></span>
                <em>消费者权益</em>
            </h4>
            <ul>
                <li><a href="#">保障范围 </a> </li>
                <li><a href="#">退货退款流程</a> </li>
                
                
                
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="theme/icon/icon-d2.png"></span>
                <em>新手上路</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                
               
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="theme/icon/icon-d3.png"></span>
                <em>保障正品</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
               
               
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
       
    </div>
    <div style="border-bottom:1px solid #dedede"></div>
    <div class="time-lists aui-footer-pd time-lists-ls clearfix">
        <div class="aui-footer-list clearfix">
            <h4>购物指南</h4>
            <ul>
            	
                
                <li><a href="#">购物流程</a> </li>
                <li><a href="#">会员介绍 </a> </li>
                
                <li><a href="#"> 常见问题 </a> </li>
                
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>关于网站</h4>
            <ul>
                <li><a href="#">网站简介</a> </li>
             
               
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>帮助中心</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">联系我们</a> </li>
                
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>新手指导</h4>
            <ul>
                
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">使用教程</a> </li>
                <li><a href="#"> 联系客服购物 </a> </li>
                
            </ul>
        </div>
    </div>
</div>
<!-- footer End -->
</body>
</html>