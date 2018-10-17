<%@page import="com.etc.RentMarket.service.impl.EvaluateServiceImpl"%>
<%@page import="com.etc.RentMarket.service.EvaluateService"%>
<%@page import="com.etc.RentMarket.entity.EvaluateBack"%>
<%@page import="com.etc.RentMarket.entity.User"%>
<%@page import="com.etc.RentMarket.entity.Orderdetail"%>
<%@page import="com.etc.RentMarket.service.impl.GoodServiceImpl"%>
<%@page import="com.etc.RentMarket.service.GoodService"%>
<%@page import="java.util.List"%>
<%@page import="com.etc.RentMarket.entity.Order"%>
<%@page import="com.etc.RentMarket.service.impl.OrderServiceImpl"%>
<%@page import="com.etc.RentMarket.service.OrderService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
	<title>会员系统我的评价</title>
    <link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="theme/css/base.css">
	<link rel="stylesheet" type="text/css" href="theme/css/member.css">
	<script type="text/javascript" src="theme/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript">
    	$(document).ready(function () {
    		$(".rediv").hide();
    		$(".release").click(function () {
    			$(".rediv").toggle(1000);
    		});
    	}); 
    	$(document).ready(function () {
    		$(".seecomment").click(function () {
    			$(".myre").toggle(1000);
    		});
    	});    
    </script>
    	<script language="javascript">
<!--
/*屏蔽所有的js错误*/-->
	function killerrors() {
	return true;
	}
	window.onerror = killerrors;

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

<div class="containers"><div class="pc-nav-item"><a href="#">首页</a> &gt; <a href="#">会员中心 </a> &gt; <a href="#">商城快讯</a></div></div>
<!-- 商城快讯 begin -->
<section id="member">
    <div class="member-center clearfix">
        <div class="member-left fl">
            <div class="member-lists">
                <dl>
                    <dt>我的商城</dt>
                    <dd><a href="user-info.jsp">我的信息</a></dd>
                    <dd><a href="list-receive.jsp">我的订单</a></dd>
                    <dd><a href="myfavorite.jsp">我的收藏</a></dd>
                    <dd class="cur"><a href="#">我的评价</a></dd>
                    <dd><a href="addressManager.jsp">地址管理</a></dd>
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
                <div class="member-heels fl"><h2>我的评价</h2></div>
            </div>
            <div class="member-border">
               <div class="member-column clearfix">
                   <span class="co1">商品信息</span>
                   <span class="co2">租赁时间</span>
                   <span class="co3">评价状态</span>
               </div>
               <div class="member-class clearfix">
                   <ul>
                
                            <%                           
                                OrderService os = new OrderServiceImpl(); 
                            	User u = (User)request.getSession().getAttribute("user");
                            	List<Order> list2 = os.queryOrdersIdByuserName(u.getUserName());
                            	for(int i = 0;i<list2.size();i++){
                            	int orderId = list2.get(i).getOrderId();
                                List<Order> list = os.queryOrdersByOrderId2(orderId);
                                for(Order o : list){	
                             %>
                              <li class="clearfix">
                           <div class="sp1">                                                                                         
                               <span class="gr1"><a href="#"><img width="60" height="60" about="" title="" src="theme/img/pd/<%=o.getGoodImg()%>"></a></span>
                               <span class="gr2"><a href="#"><%=o.getGoodName()%></a></span>
                               <span class="gr3">x<%=o.getGoodNumber()%></span>
                           </div>
                           <div class="sp2"><%=o.getRentDate()%></div>
                           <div class="sp3">
                           <a style="cursor:pointer" class="release">发表评价</a>
                           <a class="seecomment" style="margin-top: 3px; margin-bottom: 20px;cursor:pointer">查看评价</a>
                           </div>
                       </li>
                       <!-- 评论区  -->
                        <%
                	EvaluateService es = new EvaluateServiceImpl();
                	List<EvaluateBack> list3 = es.getEvaluate(u.getUserName(), o.getGoodName());
                	for(int j = 0;j<list3.size();j++){
                %>
               <div class="member-setup clearfix myre" style="float: left;">
                <div style="width: 970px;">
                 <p style="margin-right: 300px"><img src="theme/icon/user.png" style="width: 30px; height: 30px; margin-top: 10px;margin-right:10px ; margin-left: 3px;"/> 我的评论：</p>
                <div id="commentarea">
               
                 <p style="margin-left: 30px;"><%=list3.get(j).getEvaluateContent() %></p>
                 
                </div>
                </div>
                </div>
                <%
                	}
                 %>
               <div  class="rediv" style="clear: both;">
                   <ul>
                       <li class="clearfix" >
                           <div class="member-score fl" style="margin-top: 10px;"><i class="reds">*</i>商品评价：</div>
                           <div class="member-star fl">
                               <textarea maxlength="200" style="margin-top: 10px;"></textarea>    
                           </div>
                           <button id="resubmit" type="submit" style="border: 0px solid red;background-color: red;color: white;margin-top: 20px;margin-left:90px ;width: 60px;height: 30px;">提交评价</button>
                       </li> 
                   </ul>
               </div>
               <!--评论区 -->
                             <%
                                }
                            	}
                             %>                       
                      
                   </ul>
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