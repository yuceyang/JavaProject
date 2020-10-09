<%@page import="com.jiyoo.vo.LoginVo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	LoginVo lv=(LoginVo)request.getSession().getAttribute("log");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>北京极优荟科技有限公司</title>
<script type="text/javascript" src="../js/EasyUI-1.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="../js/EasyUI-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="../js/EasyUI-1.5.1/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="../js/EasyUI-1.5.1/themes/icon.css"
	type="text/css"></link>
<link rel="stylesheet"
	href="../js/EasyUI-1.5.1/themes/default/easyui.css" type="text/css"></link>
<style type="text/css">
a {
	text-decoration: none;
}
.cl{
	width:12%;
}
.col-wid{
	width:4%;
}
#tab{
	border-collapse:collapse;
	border:none;
	width:100%;
}
#tab2{
	border-collapse:collapse;
	border:none;
	width:100%;
}
#tab tr th{
border:outset  1px;
}
#tab2 tr td{
border:outset  1px;
}
</style>
</head>
<script type="text/javascript" charset="utf-8">
//解决页面加载短暂混乱情况的JS	开始-------------------------------------------
	function closes(){
	    $("#Loading").fadeOut("normal",function(){
	        $(this).remove();
	    });
	}
	var pc;
	$.parser.onComplete = function(){
	    if(pc) clearTimeout(pc);
	    pc = setTimeout(closes, 1);
	};
//解决页面加载短暂混乱情况的JS	结束-------------------------------------------
//功能列表
	//登陆后初始化页面
	$(function init(){
		//非管理员
		if("<%=lv.getGuanliyuan()%>"!="Y"){
		  //parentsUntil() 方法返回介于两个给定元素之间的所有祖先元素。jquery自带方法
		  $("#loglist").parentsUntil("li").hide();//隐藏登录列表
		  $("#zhuce").parentsUntil("li").hide();//隐藏注册页面
		  $("#caozuo").parentsUntil("li").hide();//隐藏操作日志
		}
		$("#ifm").attr("src","init.jsp");
	});
	//统计页面
	function ifarms(){
		$("#ifm").attr("src","count/count.jsp");
	}
	//查询遍历页面
	function basics(){
		$("#ifm").attr("src","kehuxinxi.jsp");
	}
	//基本信息页面
	function inp(){
		$("#ifm").attr("src","jibenxinxi.jsp");
	}
	//文件页面
	function files(){
		$("#ifm").attr("src","file.jsp");
	}
	//图片上传页面
	function PhotoUp(){
		$("#ifm").attr("src","PhotoUp.jsp");
	}
	//客户回访追踪报告
	function huifang(){
		$("#ifm").attr("src","datas/huifang.jsp");
	}
	//疫苗档案
	function yimiao(){
		$("#ifm").attr("src","fanganguanli/yimiaodangan.jsp");
	}
	//保健档案
	function baojian(){
		$("#ifm").attr("src","fanganguanli/baojiandangan.jsp");
	}
	//饲料档案
	function siliao(){
		$("#ifm").attr("src","fanganguanli/siliaodangan.jsp");
	}
	//档案管理--招商管理
	function daquguanli(){
		$("#ifm").attr("src","fanganguanli/daquguanli.jsp");
	}
	//档案管理--门店管理
	function mendianguanli(){
		$("#ifm").attr("src","fanganguanli/mendian.jsp");
	}
	//注册
	function zhuce(){
		if("<%=lv.getGuanliyuan()%>"!="Y"){
			alert("您没有权限");
		}else{
			$("#ifm").attr("src","login/zhuce.jsp");
		}
	}
	//注册
	function mima(){
			$("#ifm").attr("src","login/mimaxiugai.jsp");
	}
	//登录列表
	function loglist(){
			$("#ifm").attr("src","login/loginlist.jsp");
	}
	
	function springboot(){
		$("#ifm").attr("src",window.location.protocol+"//"+window.location.host+"/MavendTest03/index");
	}
	
</script>
<body class="easyui-layout" id="cc">

<!-- ------------------------------------------------------------- -->
<!-- 解决页面加载短暂混乱情况 -->
<div id='Loading' style="position:absolute;z-index:1000;top:0px;left:0px;width:100%;height:100%;background:#DDDDDB;text-align:center;padding-top: 20%;"><font color="#15428B">加载中···</font></div>
<!-- ------------------------------------------------------------- -->

	<!-- 上（北）边导航栏 -->
	<div data-options="region:'north',split:false" style="height:50px;overflow:hidden">
		<img alt="" src="../images/title.jpg" style="width:100%;height:125%;margin-top:-0.2%">
	</div>
	<!-- 左（东）边导航栏 -->
	<div data-options="region:'west',title:'功能列表',split:true"
		style="width:200px;overflow:hidden;border:false">

		<!-- --------------- -->
		<div id="aa" class="easyui-accordion" fit="true">
			<div title="客户信息管理" data-options="iconCls:'icon-man'"
				style="overflow:auto;" selected="false">
				<ul id="tt" class="easyui-tree" animate="true">
					<li><a onclick="basics()" href="javascript:void(0);">客户信息</a></li>
					<li><a  onclick="inp()" href="javascript:void(0);">客户录入</a></li>
					<li><a onclick="ifarms()" href="javascript:void(0);">客户统计</a></li>
					<li><a onclick="huifang()" href="javascript:void(0);">客户回访追踪报告</a></li>
					<li><a onclick="springboot()" href="javascript:void(0);">springboot</a></li>
				</ul>
			</div>

			<div title="档案管理" style="overflow:auto;"
				data-options="iconCls:'icon-lock'">
				<ul id="tt" class="easyui-tree">
					<li><a onclick="yimiao()" href="javascript:void(0);">疫苗档案</a></li>
					<li><a onclick="baojian()" href="javascript:void(0);">保健档案</a></li>
					<li><a onclick="siliao()" href="javascript:void(0);">饲料档案</a></li>
					<li><a onclick="daquguanli()" href="javascript:void(0);">招商管理</a></li>
					<li><a onclick="mendianguanli()" href="javascript:void(0);">门店管理</a></li>
				</ul>
			</div>

			<div title="权限设置"  id="quanxian" style="overflow:auto;"
				data-options="iconCls:'icon-large-chart'">
				<ul id="tt" class="easyui-tree" >
					<li><a href="javascript:void(0);" onclick="zhuce()" id="zhuce">注册用户</a></li>
					<li><a href="javascript:void(0);"  id="loglist" onclick="loglist()">登录列表</a></li>
					<li id="uua"><a href="javascript:void(0);" onclick="mima()">修改密码</a></li>
					<li><a href="javascript:void(0);" id="caozuo">操作日志</a></li>
					<li><a href="javascript:void(0);" onclick="logdestroy()"><span style="color:red">退出登录</span></a></li>
				</ul>
			</div>

			<div title="数据管理" style="overflow:auto;"
				data-options="iconCls:'icon-large-shapes'">
				<ul id="tt" class="easyui-tree">
					<li><a href="javascript:void(0);" onclick="files()">文件</a></li>
					<li><a href="javascript:void(0);" onclick="PhotoUp()">图片</a></li>
				</ul>
			</div>
		</div>
		<!-- ------------------- -->
	</div>
	<!-- 中间主页面 -->
	<div id="centerFrame"
		data-options="region:'center',title:''"
		style="border:false;overflow:hidden" style="padding:0px">
		<iframe id="ifm" width="100%" height="100%" frameborder="0" scrolling="auto" style="padding:0px"></iframe>
	</div>
	<script type="text/javascript">
		function logdestroy(){
			if (confirm("您确定需要退出吗？")) {
				window.location.href="<%=path %>/logdestroy.do";  // 提交后台
       		}
		}
	</script>
</body>
</html>
