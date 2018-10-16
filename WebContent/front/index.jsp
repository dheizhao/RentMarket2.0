<%@page import="com.etc.RentMarket.entity.Goodstype"%>
<%@page import="com.etc.RentMarket.service.impl.GoodServiceImpl"%>
<%@page import="com.etc.RentMarket.service.GoodService"%>
<%@page import="com.etc.RentMarket.entity.PhoneGood"%>
<%@page import="com.etc.RentMarket.service.impl.GoodPhoneServiceImpl"%>
<%@page import="com.etc.RentMarket.entity.User"%>
<%@page import="com.etc.RentMarket.entity.Good"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page autoFlush="true" buffer="1094kb"%>
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
	<title>易点租</title>
    <link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="theme/css/base.css">
	<link rel="stylesheet" type="text/css" href="theme/css/home.css">
	
	<script language="javascript">
<!--
/*屏蔽所有的js错误*/-->
	function killerrors() {
	return true;
	}
	window.onerror = killerrors;

	</script>
	
	<script type="text/javascript" src="theme/js/jquery.js"></script>
	<script type="text/javascript" src="theme/js/index.js"></script>
	<script type="text/javascript" src="theme/js/js-tab.js"></script>
	<script type="text/javascript" src="theme/js/MSClass.js"></script>
	<script type="text/javascript" src="theme/js/jcarousellite.js"></script>
	<script type="text/javascript" src="theme/js/top.js"></script>
    <script type="text/javascript">
         var intDiff = parseInt(80000);// 倒计时总秒数量
         function timer(intDiff){
             window.setInterval(function(){
                 var day=0,
                         hour=0,
                         minute=0,
                         second=0;//时间默认值
                 if(intDiff > 0){
                     day = Math.floor(intDiff / (60 * 60 * 24));
                     hour = Math.floor(intDiff / (60 * 60)) - (day * 24);
                     minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
                     second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
                 }
                 if (minute <= 9) minute = '0' + minute;
                 if (second <= 9) second = '0' + second;

                 $('#hour_show').html('<s id="h"></s>'+hour+'');
                 $('#minute_show').html('<s></s>'+minute+'');
                 $('#second_show').html('<s></s>'+second+'');
                 intDiff--;
             }, 1000);
         }

         $(function(){
             timer(intDiff);
         });
     </script>
     <style type="text/css">
     	p{
     		
     	}
     </style>
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
            	<%
            		User user = (User)session.getAttribute("user");
            		if(user==null){
            	%>
                <li><a href="login.jsp" style="color:#ea4949;">请登录</a> </li>
                <%
            		}else{
                %>
                <li><a href="#" style="color:#ea4949;">${sessionScope.user.userName}</a> </li>
                <li class="headerul">|</li>
                <li><a href="Signout.jsp" style="color:gray;">[注销]</a> </li>
                <%
            		}
                %>
                <li class="headerul">|</li>
                <li><a href="register.jsp">免费注册</a> </li>
                <li class="headerul">|</li>
                <li id="pc-nav" class="menu"><a href="" class="tit">我的商城</a>
                    <div class="subnav">
                   		<a href="user-info.jsp">个人中心</a>
                    </div>
                </li>
                <li class="headerul">|</li>
                <li id="pc-nav1" class="menu"><a href="#" class="tit M-iphone">有话对您说</a>
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
        <div class="header-logo fl"><h1><a href="index.html"><img src="theme/icon/logo.png"></a> </h1></div>
        <div class="head-form fl">
            <form class="clearfix">
                <input type="text" class="search-text" accesskey="" id="key" autocomplete="off"  placeholder="相机">
                <button class="button" onClick="search('key');return false;">搜索</button>
            </form>
            <div class="words-text clearfix">
                <a href="#" class="red">iPhoneXS max</a>
                <a href="#">笔记本租赁</a>
                <a href="#">女朋友</a>
                <a href="#">男朋友</a>
                <a href="#">佳能相机</a>
                <a href="#">海景别墅</a>
                <a href="#">汽车</a>
            </div>
        </div>
        
    </div>
    
    <div class="yHeader">
        <div class="yNavIndex">
            <div class="pullDown">
            <h2 class="pullDownTitle">
                全部商品分类
            </h2>
            <ul class="pullDownList">
            <%
            	int typeparentId = 0;
    			GoodService gs = new GoodServiceImpl();
    			List<Goodstype> list = gs.selGoodTypeByTypeParentId(typeparentId);
    			for(Goodstype gt:list){
    		%>
                <li class="menulihover">
                    <i class="listi1"></i>
                    <a href="jiadian.html" target="_blank"><%=gt.getTypeName() %></a>
                    <span></span>
                </li>
                <%
    			}
                %>
            </ul>
            <div class="yMenuListCon">
                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="jiadian.html">电视<i class="fr">></i></a></li>
                            <li><a href="jiadian.html">空调<i class="fr">></i></a></li>
                            <li><a href="jiadian.html">洗衣机<i class="fr">></i></a></li>
                            <li><a href="jiadian.html">冰箱<i class="fr">></i></a></li>
                            <li><a href="jiadian.html">厨房大电<i class="fr">></i></a></li>
                            <li><a href="jiadian.html">厨房小电<i class="fr">></i></a></li>
                            <li><a href="jiadian.html">生活电器<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">电视机</a>
                            <a href="">电视配件</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">壁挂式空调</a>
                            <a href="">柜式空调</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">滚筒洗衣机</a>
                            <a href="">波轮洗衣机</a>
                            <a href="">洗衣机配件</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">单门</a>
                            <a href="">双门</a>
                            <a href="">三门</a>
                            <a href="">多门</a>
                            <a href="">冷柜 </a>
                        </p>

                        <p>
                            <a href="" class="ecolor610">消毒柜</a>
                            <a href="">油烟机</a>
                            <a href="">燃气灶</a>
                            <a href="">热水器</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">电饭煲</a>
                            <a href="">压力锅</a>
                            <a href="">榨汁机</a>
                            <a href="">豆浆机</a>
                            <a href="">电水壶</a>
                            <a href="">微波炉</a>
                            <a href="">电烤箱</a>
                            <a href="">炸锅</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">台灯</a>
                            <a href="">取暖电器</a>
                            <a href="">电风扇</a>
                            <a href="">空调扇</a>
                            <a href="">空气净化器</a>
                            <a href="">净水机</a>
                            <a href="">烘干机</a>
                            <a href="">除湿器</a>
                            <a href="">扫地机器人</a>
                        </p>
                    </div>
                </div>
                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="#">商业办公<i class="fr">></i></a></li>
                            <li><a href="#">办公设备<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">办公桌</a>
                            <a href="">办公柜</a>
                            <a href="">班桌</a>
                            <a href="">办公椅</a>
                            <a href="">洽谈椅 </a>
                            <a href="">前台</a>
                            <a href="">办公桌挡板</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">投影机</a>
                            <a href="">保险柜</a>
                            <a href="">打印机</a>
                        </p>
                    </div>
                </div>

                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="#">卧室家具<i class="fr">></i></a></li>
                            <li><a href="#">客厅家具<i class="fr">></i></a></li>
                            <li><a href="#">餐厅家具<i class="fr">></i></a></li>
                            <li><a href="#">书房家具<i class="fr">></i></a></li>
                            <li><a href="#">储物家具<i class="fr">></i></a></li>
                            <li><a href="#">家装软饰<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">边桌</a>
                            <a href="">斗柜</a>
                            <a href="">床</a>
                            <a href="">衣帽架</a>
                            <a href="">床头柜 </a>
                            <a href="">床垫</a>
                            <a href="">梳妆台</a>
                            <a href="">衣柜</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">鞋柜</a>
                            <a href="">沙发</a>
                            <a href="">茶几</a>
                            <a href="">凳子</a>
                            <a href="">电视柜 </a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">桌子</a>
                            <a href="">椅子</a>
                            <a href="">酒柜</a>
                            <a href="">餐边柜</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">书椅</a>
                            <a href="">书桌</a>
                            <a href="">书架</a>
                        </p>

                        <p>
                            <a href="" class="ecolor610">置物架</a>
                            <a href="">收纳柜</a>
                            <a href="">书柜</a>
                        </p>
                         <p>
                            <a href="" class="ecolor610">家装软饰</a>
                        </p>
                    </div>
                </div>

                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="#">手机<i class="fr">></i></a></li>
                            <li><a href="#">相机<i class="fr">></i></a></li>
                            <li><a href="#">智能设备<i class="fr">></i></a></li>
                            <li><a href="#">摄像机<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">vivo</a>
                            <a href="">oppo</a>
                            <a href="">三星</a>
                            <a href="">苹果</a>
                            <a href="">一加 </a>
                            <a href="">美图</a>
                            <a href="">魅族</a>
                            <a href="">小米</a>
                            <a href="">华为</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">佳能</a>
                            <a href="">尼康</a>
                            <a href="">富士</a>
                            <a href="">索尼</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">无人机</a>
                            <a href="">视频眼镜</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">高清摄像机</a>
                            <a href="">运动摄像机</a>
                            <a href="">高速摄像机</a>
                            <a href="">闪存摄像机</a>
                        </p>
                    </div>
                </div>

                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="#">民族乐器<i class="fr">></i></a></li>
                            <li><a href="#">西洋乐器<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">箫、笛</a>
                            <a href="">二胡</a>
                            <a href="">古筝</a>
                            <a href="">琵琶</a>
                            <a href="">丝竹 </a>
                            <a href="">扬琴</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">钢琴</a>
                            <a href="">吉他</a>
                            <a href="">双簧管</a>
                            <a href="">萨克斯</a>
                            <a href="">小提琴 </a>
                        </p>
                    </div>
                </div>

                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="#">健身器械<i class="fr">></i></a></li>
                            <li><a href="#">骑行运动<i class="fr">></i></a></li>
                            <li><a href="#">体育用品<i class="fr">></i></a></li>
                            <li><a href="#">医疗器械<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">跑步机</a>
                            <a href="">动感单车</a>
                            <a href="">仰卧板</a>
                            <a href="">踏步机</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">电动车</a>
                            <a href="">平衡车</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">篮球</a>
                            <a href="">足球</a>
                            <a href="">羽毛球</a>
                            <a href="">钉鞋</a>
                            <a href="">网球 </a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">轮椅</a>
                            <a href="">血压计</a>
                            <a href="">电子体温表</a>
                            <a href="">电动按摩椅</a>
                            <a href="">医用充气气垫</a>
                        </p>

                    </div>
                </div>

                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="#">汽车<i class="fr">></i></a></li>
                            <li><a href="#">套房<i class="fr">></i></a></li>
                            <li><a href="#">别墅<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">10w以下</a>
                            <a href="">10w~30w</a>
                            <a href="">30w~60w</a>
                            <a href="">60w~100w</a>
                            <a href="">100w以上</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">一室一厅</a>
                            <a href="">两室一厅</a>
                            <a href="">三室一厅</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">海景别墅</a>
                            <a href="">独栋别墅</a>
                            <a href="">联排别墅</a>
                            <a href="">羽绒服</a>
                            <a href="">丛林庄别墅 </a>
                        </p>
                    </div>
                </div>

                <div class="yMenuListConin">
                    <div class="yMenuLCinLisi fl">
                        <ul>
                            <li><a href="#">少儿图书<i class="fr">></i></a></li>
                            <li><a href="#">小说<i class="fr">></i></a></li>
                            <li><a href="#">名著<i class="fr">></i></a></li>
                            <li><a href="#">CD<i class="fr">></i></a></li>
                        </ul>
                    </div>
                    <div class="yMenuLCinList fl">
                        <p>
                            <a href="" class="ecolor610">格林童话</a>
                            <a href="">安徒生童话</a>
                            <a href="">成语故事</a>
                            <a href="">十万个为什么</a>
                            <a href="">小学生优秀作文</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">推理</a>
                            <a href="">言情</a>
                            <a href="">玄幻</a>
                            <a href="">武侠</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">国内名著</a>
                            <a href="">国外名著</a>
                        </p>
                        <p>
                            <a href="" class="ecolor610">车载CD</a>
                        </p>

                       
                    </div>
                </div>

            </div>
            </div>
        </div>
    </div>
</header>
<!-- header End -->

<!--- banner begin-->
<section id="pc-banner">
    <div class="yBanner">
        <div class="banner" id="banner" >
            <a href="javascript:;" class="d1" style="background:url(theme/img/ad/lunbo1.jpg) center no-repeat;background-color: #f01a38; padding-left:180px;"></a>
            <a href="javascript:;" class="d1" style="background:url(theme/img/ad/lunbo2.jpg) center no-repeat;background-color: #a96ae3; padding-left:180px;"></a>
            <a href="javascript:;" class="d1" style="background:url(theme/img/ad/lunbo3.jpg) center no-repeat;background-color: #081f3c; padding-left:180px;"></a>
            <a href="javascript:;" class="d1" style="background:url(theme/img/ad/lunbo4.jpg) center no-repeat;background-color: #4684ff; padding-left:180px;"></a>
            <a href="javascript:;" class="d1" style="background:url(theme/img/ad/lunbo5.jpg) center no-repeat;background-color: #a89d9f; padding-left:180px;"></a>
            <div class="d2" id="banner_id">
                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
        </div>
        <div style="text-align:center;clear:both"></div>
    </div>
</section>
<!-- banner End -->


<!--- advert begin-->

<!-- advert End -->

<!-- 商城资讯 begin -->
<section id="pc-information">
    <div class="containers">
        <div class="pc-info-mess  clearfix" style="position: relative;">
            <h2 class="fl" style="margin-right:20px;">商城快讯</h2>
            <div id="MarqueeDiv" class="MarqueeDiv">
            	<a href="new.html">[特惠]家用跑步机每天4元起</a>
            	<a href="new.html">[特惠]全新戴尔笔记本电脑每月118元起</a>
            	<a href="new.html">[公告]iPhone XS登陆</a>
            	<a href="new.html">[公告]家居廉租</a>
            	<a href="new.html">逛商城赚话费 </a>
            	<a href="new.html">看书不用买 </a>
            	<a href="new.html">[公告]开发九八十身价又涨啦</a>
            </div>
            <a href="new.html" style="position: absolute;right: 15px;top: 0;"> 更多资讯</a>
        </div>
    </div>
</section>
<!-- 商城资讯 End -->


<!-- 卖场推荐 begin -->
<div class="container-c time-lists clearfix">
    <div class="time-list fl">
        <div class="time-title time-clear"><h2>卖场推荐</h2><a href="javascript:;" class="pc-spin fr">换一换</a> </div>
        <div class="time-poued clearfix">
            <a href="goodDetail.jsp?goodId=42"><img src="theme/img/pd/pd01.jpg"></a>
            <a href="goodDetail.jsp?goodId=43"><img src="theme/img/pd/pd02.jpg"></a>
            <a href="goodDetail.jsp?goodId=44"><img src="theme/img/pd/pd03.jpg"></a>
            <a href="goodDetail.jsp?goodId=35"><img src="theme/img/pd/pd06.jpg"></a>
            
        </div>
    </div>
    <div class="news-list fr">
        <div class="time-title time-clear"><h2>今日值得租</h2></div>
        <div class="news-right"><a href="#"><img src="theme/img/pd/pd07.jpg"></a></div>
    </div>
</div>
<!-- 卖场推荐 End -->
 	<%
	List<Good> good=(List<Good>)request.getAttribute("Good"); //商品集合
	String goodPath="theme/img/pd/";//存放商品的绝对路径	
	%>
	
 	<%
 	if(good==null){//为空就跳转到Servlet获取数据
 	%>
		<jsp:forward page="../GoodServlet"></jsp:forward>
		
	<%
	} 
	%>
	
 	<div class="time-lists clearfix">
    <div class="time-list time-list-w fl">
        <div class="time-title time-clear"><h2>热租区</h2><div class="pc-font fl"></div><a class="pc-spin fr" href="javascript:;">换一换</a> </div>
        <div class="time-border">
            <div class="yScrollList">
                <div class="yScrollListIn">
                    <div style="display:block;" class="yScrollListInList yScrollListInList1">
                        <ul>
                        <!-- 展示商品 -->
                        <%for(Good g:good){ %>
                            <li>
                                <a href="goodDetail.jsp?goodId=<%=g.getGoodId()%>">
                                    <img src=<%=goodPath+g.getGoodImgAdd()%>>
                                    <p class="head-name pc-pa10"><%=g.getGoodName()%></p>
                                    <p class="label-default">¥<%=g.getGoodPrice() %>/月</p>
                                </a>
                            </li>
                            <%} %>
                            
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
 	
	
<div class="containers main-banner"><a href="#"><img src="theme/img/ad/br1.jpg" width="1200" height="105"></a> </div>

<div class="time-lists  clearfix">
    <div class="time-list time-list-w fl">
        <div class="time-title time-clear-f"><h2>智能手机</h2>
            <ul class="brand-tab H-table clearfix fr" id="H-table">
                <li class="cur"><a href="javascript:void(0);" class="cur">一加</a></li>
                <li><a href="javascript:void(0);">vivo</a></li>
                <li><a href="javascript:void(0);">oppo</a></li>
                <li><a href="javascript:void(0);">小米</a></li>
                <li><a href="javascript:void(0);">苹果</a></li>
                <li><a href="javascript:void(0);">华为</a></li>
                <li><a href="javascript:void(0);">三星</a></li>
                <li><a href="javascript:void(0);">魅族</a></li>
            </ul>
        </div>
        <div class="time-border time-border-h clearfix">
            <div class="brand-img fl">
                <ul>
                    <li><a href="#"><img src="theme/img/ad/p1.jpg" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p2.jpg" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p3.jpg" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p4.jpg" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p5.jpg" width="125" height="47"></a></li>
                    <li><a href="#"><img src="theme/img/ad/p6.jpg" width="125" height="47"></a></li>
                </ul>
            </div>
            <div class="brand-bar fl"><a href="#"><img src="theme/img/ad/barsx.jpg" width="300" height="476"></a> </div>
            <div class="brand-poa fl">
                <div class="brand-poa H-over clearfix">
                    <ul>
                    	<%
                    		GoodPhoneServiceImpl gpsi = new GoodPhoneServiceImpl();
                    		List<PhoneGood> phoneList = gpsi.selectPhone();
                    		for(PhoneGood pg : phoneList){
                    	%>
                        <li>
                            <div class="brand-imgss"><a href="goodDetail.jsp?goodId=<%=pg.getGoodId()%>"><img src=<%=goodPath+pg.getGoodImgAdd() %>></a></div>
                            <div class="brand-title"><a href="#"><%=pg.getGoodName() %></a> </div>
                            <div class="brand-price">￥<%=pg.getGoodPrice() %>/月 </div>
                        </li>
                        <% 
                    		}
                        %>
                        
                        
                    </ul>
                </div>
                <div class="brand-poa H-over clearfix" style="display:none;">
                    <ul>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/v1.jpg"></a></div>
                            <div class="brand-title"><a href="#">vivo Z1极光特别版 全面屏AI双摄手机 4GB+64GB 全网通 双卡双待</a> </div>
                            <div class="brand-price">￥50.00/月 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/v2.jpg"></a></div>
                            <div class="brand-title"><a href="#">vivo X23 8GB+128GB 幻夜蓝 水滴屏全面屏 全网通4G手机 双卡双待</a> </div>
                            <div class="brand-price">￥99.00/月 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/v3.jpg"></a></div>
                            <div class="brand-title"><a href="#">vivo NEX星迹版 全面屏AI双摄手机 8GB+128GB 全网通 双卡双待</a> </div>
                            <div class="brand-price">￥120.00/月 </div>
                        </li>
                        <li>
                            <div class="brand-imgss"><a href="#"><img src="theme/img/pd/v4.jpg"></a></div>
                            <div class="brand-title"><a href="#">vivo X21双摄拍照游戏手机 6GB+128GB 冰钻黑 全网通 双卡双待</a> </div>
                            <div class="brand-price">￥88.00/月 </div>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>



<div class="containers main-banner"><a href="#"><img src="theme/img/ad/br1.jpg" width="1200" height="105"></a> </div>


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
<script type="text/javascript">banner()</script>
</body>
</html>DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>