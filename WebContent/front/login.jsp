<%@ page language="java" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="Generator" content="EditPlus®">
		<meta name="Author" content="">
		<meta name="Keywords" content="">
		<meta name="Description" content="">
		<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
		<meta name="renderer" content="webkit">
		<title>立即登录</title>
		<link rel="stylesheet" href="theme/css/base.css">
		<link rel="stylesheet" type="text/css" href="theme/css/login.css">
		<script src="theme/js/jquery-3.1.1.min.js"></script>
		<script src="theme/js/checkcode.js"></script>
		<script type="text/javascript">
			/* function confirm(){
					if (($("#userName").val()).length==0) {
						$("#notice0").show().html("*用户名不能为空");
						setTimeout(function(){ $("#notice0").hide(); }, 2000);
						return false;
					} else if(($("#userPwd").val()).length==0){
						$("#notice1").show().html("*密码不能为空");
						setTimeout(function(){ $("#notice1").hide(); }, 2000);
						return false;
					}else{
						return true;
					}
			}  */
		</script> 
	</head>

	<body>

		<div class="w">
			<div id="logo">
				<a href="index.html"> <img src="theme/icon/logo.png" alt="">
				</a> <b></b>
			</div>

		</div>
		<div id="content">
			<div class="login-wrap">
				<div class="w">
					<div class="login-form">
						<div class="login-tab login-tab-l">
							<a href="javascript:;">扫码登录</a>
						</div>
						<div class="login-tab login-tab-r">
							<a href="javascript:;">账号登录</a>
						</div>
						<div class="login-box" style="visibility: visible; display: block">
							<div class="mt tab-h"></div>
							<div class="msg-wrap"></div>
							<div class="mc">
								<div class="form">
									<form action="../us.do?op=login" id="formlogin" method="post"  >
										<div class="item item-fore1 item-error">
											<label for="userName" class="login-label name-label"></label>
											<input type="text" name="userName" id="userName" class="itxt" tabindex="1" autocomplete="off" placeholder="邮箱/用户名/已验证手机" >
											<p id="notice0" class="hide" style="color: red;font-size: 15px;text-align: center;"></p>
											<span class="clear-btn" style="display: inline;"></span>
										</div>
										<!-- 密码输入框fore2 -->
										<div id="entry" class="item item-fore2" style="visibility: visible">
											<label class="login-label pwd-label" for="userPwd"></label>
											<input type="password" id="userPwd" name="userPwd" class="itxt itxt-error" tabindex="2" autocomplete="off" placeholder="密码" >
											<p id="notice1" class="hide" style="color: red;font-size: 15px;text-align: center;"></p>
											<span class="clear-btn" style="display: inline;"></span> <span class="capslock" style="display: none;"> <b></b> 大小写锁定已打开
										</span>
										</div>
										<!-- 自动登录开始fore4 -->
										<div class="item item-fore4">
											<div class="safe">
												<span> <a href="register.html" class=""> <b></b>立即注册
											</a>
											</span> <span class="forget-pw-safe"> <a href="">忘记密码</a>
											</span>
											</div>
										</div>
										<!-- 登录按钮开始 -->
										<div class="item item-fore5">
											<div class="login-btn">
												<div>
													<div>

														<div id="captcha2">
															<p id="wait2" class="show">正在加载验证码......</p>
														</div>
													</div>
													<br>
													<p id="notice2" class="hide" style="color: red;font-size: 15px;text-align: center;">请先完成验证</p>
													<input type="submit" class="btn-img btn-entry" id="loginsubmit" tabindex="6" value="登&nbsp;&nbsp;&nbsp;&nbsp;录" />

												</div>
											</div>

										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="qrcode-login">
							<div class="mc">
								<div class="qrcode-error-2016">
									<div class="qrcode-error-mask"></div>
									<p class="err-cont">服务器出错</p>
									<a href="javascript:void(0)" class="refresh-btn">刷新</a>
								</div>
								<div class="qrcode-main">

									<div class="qrcode-img" style="">
										<img src="theme/login/code.png" alt="">
										<div class="qrcode-error-02 hide" id="J-qrcodeerror" style="display: none;">
											<a href="#none"> <span class="error-icon"></span>
												<div class="txt">
													网络开小差咯 <span class="ml10">刷新二维码</span>
												</div>
											</a>
										</div>
									</div>

									<div class="qrcode-help" style="display: none;"></div>
								</div>

								<div class="qrcode-panel">
									<ul>
										<li class="fore1"><span>打开</span>
											<a href=""> <span class="red">手机歪秀购物 </span>
											</a>
										</li>
										<li>扫一扫登录</li>
									</ul>
								</div>
							</div>
						</div>
						<div>
							<input type="text" tabindex="10" style="border:solid 0px white;" /><br>
							<input type="text" tabindex="10" style="border:solid 0px white;" /><br>
							<input type="text" tabindex="10" style="border:solid 0px white;" /><br>
							<input type="text" tabindex="10" style="border:solid 0px white;" />
						</div>

					</div>
				</div>
				<div class="login-banner" style="background-color: #ea4949">
					<div class="w">
						<div id="banner-bg" class="i-inner" style="background: url(theme/login/a1.jpg);"></div>
					</div>
				</div>
			</div>
		</div>
		<div class="w">
			<div id="footer-2013">
				<div class="links">
					<a href="">关于我们</a> |
					<a href="">联系我们</a> |
					<a href="">人才招聘</a> |
					<a href="">商家入驻</a> |
					<a href="">广告服务</a> |
					<a href="">手机京东</a> |
					<a href="">友情链接</a> |
					<a href="">销售联盟</a> |
					<a href="">English site
					</a>
				</div>
				<div style="padding-left: 10px">
					<p style="padding-top: 10px; padding-bottom: 10px; color: #999">网络文化经营许可证：浙网文[2013]0268-027号| 增值电信业务经营许可证：浙B2-20080224-1
					</p>
					<p style="padding-bottom: 10px; color: #999">信息网络传播视听节目许可证：1109364号 | 互联网违法和不良信息举报电话:0571-81683755</p>
				</div>
			</div>
		</div>

	</body>

	<script type="text/javascript">
		//alert($)
		$(".login-tab-r").click(function() {
			$(".login-box").css({
				"display": "block",
				"visibility": "visible"
			});
			$(".qrcode-login").css({
				"display": "none"
			})
		});
		$(".login-tab-l").click(function() {
			$(".login-box").css({
				"display": "none"
			});
			$(".qrcode-login").css({
				"display": "block",
				"visibility": "visible"
			})
		});
		//点击微信图片显示帮助
		$(".qrcode-img").hover(function() {
			$(".qrcode-img").css({
				"left": "0"
			});
			$(".qrcode-help").css({
				"display": "block"
			});
		}, function() {
			$(".qrcode-img").css({
				"left": "64px"
			});
			$(".qrcode-help").css({
				"display": "none"
			});
		});
	</script>
	<!-- 注意，验证码本身是不需要 jquery 库，此处使用 jquery 仅为了在 demo 使用，减少代码量 -->
	<script src="http://apps.bdimg.com/libs/jquery/1.9.1/jquery.js"></script>

	<!-- 引入 gt.js，既可以使用其中提供的 initGeetest 初始化函数 -->
	<script src="gt.js"></script>
	<script>
		var handler2 = function(captchaObj) {
			 $("#loginsubmit").click(function (e) {
	            var result = captchaObj.getValidate();
	            if (($("#userName").val()).length==0) {
					$("#notice0").show().html("*用户名不能为空");
					setTimeout(function(){ $("#notice0").hide(); }, 2000);
					return false;
				} else if(($("#userPwd").val()).length==0){
					$("#notice1").show().html("*密码不能为空");
					setTimeout(function(){ $("#notice1").hide(); }, 2000);
					return false;
				}
				else if (!result) {
	                $("#notice2").show();
	                setTimeout(function () {
	                    $("#notice2").hide();
	                }, 2000);
	                return false;
	            } else {
	            	return true;
	            }
	        });
			// 将验证码加到id为captcha的元素里，同时会有三个input的值用于表单提交
			captchaObj
				.appendTo("#captcha2");
			captchaObj.onReady(function() {
				$("#wait2").hide();
			});
			// 更多接口参考：http://www.geetest.com/install/sections/idx-client-sdk.html
		};
		$
			.ajax({
				url: "../gt/register2?t=" +
					(new Date())
					.getTime(), // 加随机数防止缓存
				type: "get",
				dataType: "json",
				success: function(data) {
					// 调用 initGeetest 初始化参数
					// 参数1：配置参数
					// 参数2：回调，回调的第一个参数验证码对象，之后可以使用它调用相应的接口
					initGeetest({
						gt: data.gt,
						challenge: data.challenge,
						new_captcha: data.new_captcha, // 用于宕机时表示是新验证码的宕机
						offline: !data.success, // 表示用户后台检测极验服务器是否宕机，一般不需要关注
						product: "popup", // 产品形式，包括：float，popup
						width: "100%"
						// 更多配置参数请参见：http://www.geetest.com/install/sections/idx-client-sdk.html#config
					}, handler2);
				}
			});
	</script>

</html>