<%@page import="com.etc.RentMarket.entity.Good"%>
<%@page import="java.util.List"%>
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
	<title>一级货架</title>
   	<link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="theme/css/base.css">
	<link rel="stylesheet" type="text/css" href="theme/css/home.css">
	
	<script type="text/javascript" src="theme/js/jquery.js"></script>
	<script type="text/javascript" src="theme/js/index.js"></script>
	<script type="text/javascript" src="theme/js/js-tab.js"></script>
	<script type="text/javascript" src="theme/js/MSClass.js"></script>
	<script type="text/javascript" src="theme/js/jcarousellite.js"></script>
	<script type="text/javascript" src="theme/js/top.js"></script>
    <script type="text/javascript">
	<!--
	/*屏蔽所有的js错误*///-->
	function killerrors() {
	return true;
	}
	window.onerror = killerrors;

	</script>
    
 </head>
 <body>

<div>
    <div id="moquu_wxin" class="moquu_wxin"><a href="javascript:void(0)"><div class="moquu_wxinh"></div></a></div>
    <div id="moquu_wshare" class="moquu_wshare"><a href="javascript:void(0)" style="text-indent:0"><div class="moquu_wshareh"><img src="theme/icon/moquu_wshare.png" width="100%"></div></a></div>
    <div id="moquu_wmaps"><a href="javascript:void(0)" class='moquu_wmaps'></a></div>
    <a id="moquu_top" href="javascript:void(0)"></a>
</div>
<!--- header begin-->
<header id="pc-header">
   <div class="BHeader">
        <div class="yNavIndex">
            <ul class="BHeaderl">
                <li><a href="login.jsp" style="color:#ea4949;">请登录</a> </li>
                <li class="headerul">|</li>
                <li><a href="register.jsp">免费注册</a> </li>
                <li class="headerul">|</li>
                <li><a href="my-d.jsp">订单查询</a> </li>
                <li class="headerul">|</li>
                <li><a href="my-s.jsp">我的收藏</a> </li>
                <li class="headerul">|</li>
                <li id="pc-nav" class="menu"><a href="my-user.html" class="tit">我的商城</a>
                    <div class="subnav">
                        <a href="my-d.html">我的订单</a>
                        <a href="my-s.jsp">我的收藏</a>
                        <a href="my-user.html">账户安全</a>
                        <a href="my-add.html">地址管理</a>
                        <a href="my-p.html">我要评价</a>
                    </div>
                </li>
                <li class="headerul">|</li>
                <li id="pc-nav1" class="menu"><a href="#" class="tit M-iphone">我有话对您说</a>
                   <div class="subnav">
                       <a href="#"><img src="theme/icon/ewm2.png" width="115" height="115" title="扫一扫，有惊喜！"></a>
                   </div>
                </li>
                
                <li class="headerul">|</li>
                <div class="header-cart fr"><a href="#"><img src="theme/icon/car.png"></a> <i class="head-amount">99</i></div>
       		 <div class="head-mountain"></div>
            </ul>
            
        </div>
    </div>
    <div class="container clearfix">
        <div class="header-logo fl"><h1><a href="#"><img src="theme/icon/logo.png"></a> </h1></div>
        <div class="head-form fl">
            <form class="clearfix">
                <input type="text" class="search-text" accesskey="" id="key" autocomplete="off"  placeholder="手机模型">
                <button class="button" onClick="search('key');return false;">搜索</button>
            </form>
            <div class="words-text clearfix">
                <a href="#" class="red">1元秒爆</a>
                <a href="#">低至五折</a>
                <a href="#">农用物资</a>
                <a href="#">买一赠一</a>
                <a href="#">佳能相机</a>
                <a href="#">稻香村月饼</a>
                <a href="#">服装城</a>
            </div>
        </div>
        
        <div class="head-mountain"></div>
    </div>
    <div class="yHeader">
        <div class="yNavIndex">
            <div class="pullDown">
                <h2 class="pullDownTitle">全部商品分类</h2>
            </div>
        </div>
    </div>
</header>
<!-- header End -->
<div class="containers clearfix"><div class="pc-nav-item fl"><a href="#" class="pc-title">首页</a> &gt;<a href="#"> 所有货架</a></div> <div class="fr" style="padding-top:20px;"><a href="#" class="reds">所有品牌></a></div></div>
<div class="containers">
    <div class="pc-nav-rack clearfix">
        <ul>
      	    <li><a href="#">家用电器</a></li>
            <li><a href="#">办公家具</a></li>
            <li><a href="#">家居家具</a></li>
            <li><a href="#">手机数码</a></li>
            <li><a href="#">乐器</a></li>
            <li><a href="#">运动户外、保健器械</a></li>
            <li><a href="#">汽车、房子</a></li>
            <li><a href="#">图书、影像</a></li>
        </ul>
    </div>
    <div>
       	 <% 
        		String imgPath="theme/img/pd/"; 

        	%>
        <div class="pc-nav-digit clearfix">     	
	       <ul>
                
            </ul>
        </div>
    </div>
    <div>
        <div class="pc-nav-title"><h3>手机数码</h3></div>
        <div class="pc-nav-digit clearfix">
            <ul>
                <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机1.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 自拍伴侣 自拍杆 蓝牙 Liveman S1</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机2.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 运动相机 直播相机 Liveman M1</a></div>
                </li>
                 <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/v1.jpg"></a></div>
                    <div class="digit2"><a href="#">vivo</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/v2.jpg"></a></div>
                    <div class="digit2"><a href="#">vivo Z1</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/v3.jpg"></a></div>
                    <div class="digit2"><a href="#">vivo Nex</a></div>
                </li>
                 <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/v4.jpg"></a></div>
                    <div class="digit2"><a href="#">vivo X23</a></div>
                </li>
            	 <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机1.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 自拍伴侣 自拍杆 蓝牙 Liveman S1</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机3.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 4K 运动相机 直播相机 Liveman C1</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机2.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 4K 运动相机 直播相机 Liveman M1</a></div>
                </li>
                <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机1.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 自拍伴侣 自拍杆 蓝牙 Liveman S1</a></div>
                </li>
               <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机2.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 运动相机 直播相机 Liveman M1</a></div>
                </li>
                 <li>
                    <div class="digit1"><a href="#"><img src="theme/img/pd/相机2.jpg"></a></div>
                    <div class="digit2"><a href="#">乐视 GENE 运动相机 直播相机 Liveman M1</a></div>
                </li>
            </ul>
        </div>
    </div>
    <div style="padding-top:30px;">
        <div class="member-pages clearfix">
            <div class="fr pc-search-g">
                <a href="#" class="fl pc-search-f">上一页</a>
                <a class="current" href="#">1</a>
                <a href="javascript:;">2</a>
                <a href="javascript:;">3</a>
                <a href="javascript:;">4</a>
                <a href="javascript:;">5</a>
                <a href="javascript:;">6</a>
                <a href="javascript:;">7</a>
                <span class="pc-search-di">…</span>
                <a onClick="SEARCH.page(3, true)" href="javascript:;" class="pc-search-n" title="使用方向键右键也可翻到下一页哦！">下一页</a>
                    <span class="pc-search-y">
                        <em>  共20页    到第</em>
                        <input type="text" placeholder="1" class="pc-search-j">
                        <em>页</em>
                        <a class="confirm" href="#">确定</a>
                    </span>

            </div>
        </div>
    </div>
</div>
<div class="pc-buying clearfix"></div>
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