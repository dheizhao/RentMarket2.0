<%@ page language="java" contentType="text/html;" pageEncoding="utf-8"%>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<link rel="Bookmark" href="favicon.ico">
<link rel="Shortcut Icon" href="favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script><![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>添加用户</title>
<meta name="keywords" content="易点租  方便你的生活">
<meta name="description" content="易点租  方便你的生活">
</head>
<body>
	<article class="cl pd-20">
		<form  method="post"
			class="form form-horizontal" id="form-member-add">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>广告编号：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="" id="ad_id"
						name="ad_id" readonly>
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>广告内容：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value=""
						placeholder="请输入广告内容" id="content" name="content">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>广告素材：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value=""
						placeholder="请放入广告素材" id="picture" name="picture">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>广告产品：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value=""
						placeholder="请加入广告产品" id="productor" name="productor">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>投放周期：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder="/天" id="day"
						name="day">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>上架时间：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" id="beginDate"
						name="beginDate" readonly>
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>到期时间：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" id="endDate" name="endDate"
						readonly>
						<!-- 把用户状态的input隐藏 -->
					<input type="hidden"
						class="input-text" value="" >
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3">广告状态：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<span class="select-box"> <select class="select" size="1"
						name="adStatus" id="adStatus">
							<option value="" selected>请选择广告状态</option>
							<option value="0">未激活</option>
							<option value="1">激活</option>
					</select>
					</span>
				</div>
			</div>
			<div class="row cl">
				<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
					<input class="btn btn-primary radius" type="submit" value="提交" />
				</div>
			</div>
		</form>
	</article>
	<script type="text/javascript">
		$(function() {
			//var a = document.getElementById("#content").value;

			//$("#op1").html($("#state").val()); 

		});
	</script>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script>
	<script type="text/javascript"
		src="static/h-ui.admin/js/H-ui.admin.page.js"></script>
	<!--/_footer /作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<!--ajax提交表单需要引入jquery.form.js-->
	<!-- 	<script type="text/javascript"
		src="http://malsup.github.io/jquery.form.js"></script> -->
	<script type="text/javascript">
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});

			/*validate验证和 ajax 的方式完成表单提交 */
			$("#form-member-add")
					.validate(
							{
								rules : {
									empno : {
										required : true,
										minlength : 4,
										maxlength : 4
									},
									ename : {
										required : true,
									}
								},
								onkeyup : false,
								focusCleanup : true,
								success : "valid",
								submitHandler : function(form) {
									//alert("submit" + form);
									//$(form).ajaxSubmit();
									//var index = parent.layer.getFrameIndex(window.name);
									//parent.$('.btn-refresh').click();
									//parent.layer.close(index);
									$(form)
											.ajaxSubmit(
													{
														//type : 'post',
														url : "../as.do?op=upd",
														error : function(data) {
															layer
																	.msg(
																			'操作成功!',
																			{
																				icon : 1,
																				time : 1000
																			},
																			function() {
																				//获取父层					
																				var index = parent.layer
																						.getFrameIndex(window.name);
																				//刷新父层					
																				parent.location
																						.reload();
																				//关闭弹出层			
																				parent.layer
																						.close(index);

																			});

														},
														success : function(
																XmlHttpRequest,
																textStatus,
																errorThrown) {
															console
																	.log(errorThrown
																			+ ","
																			+ XmlHttpRequest.responseText);
															layer
																	.msg(
																			'ERROR!'
																					+ errorThrown,
																			{
																				icon : 2,
																				time : 1000
																			},
																			function() {
																				//获取父层					
																				var index = parent.layer
																						.getFrameIndex(window.name);
																				//刷新父层					
																				parent.location
																						.reload();
																				//关闭弹出层			
																				parent.layer
																						.close(index);

																			});
														}
													});
									//ajaxSubmit结束
									//return false; // 阻止表单自动提交事件

								}
							});
		});
	</script>


	<!-- <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script> -->
	<script type="text/javascript">
		$(function() {

			/* $.get("../gsback.do?op=upInfo", function(data) {
				//得到的data应该是一个string类型满足 json对象
				$.each(data, function(i, d) {
					$("#deptno").append(
							"<option value="+d.DEPTNO+">" + d.DNAME
									+ "</option>");
				});

			});*/

		});
	</script>

	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>