<%@page import="com.jiyoo.vo.LoginVo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
LoginVo lv=(LoginVo)request.getSession().getAttribute("log");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" href="<%=path %>/js/EasyUI-1.5.1/themes/icon.css" type="text/css"></link>
	<link rel="stylesheet" href="<%=path %>/js/EasyUI-1.5.1/themes/default/easyui.css" type="text/css"></link>
	<style type="text/css">
		#tab{
			margin-top: -32%;
			z-index:2;
		}
		#tab tr{
			height: 2em;
			width: 10%;
		}
		#tishi{
			width:10em;
		}
		#img{
	  		right: 0;
	  		bottom: 0;
	  		position: absolute; 
	  		top: 0; 
	  		z-index:-1;
	  	}
	</style>
  </head>
  <body>
     <!-- 密码修改提交录入面板 -->
	 <div id="p" class="easyui-panel" title="修改密码" style="width:100%;height:100px;padding:0px;background:#fafafa;"
	    data-options="fit:true,border:false,collapsible:false,collapsed:false,iconCls:'icon-man'">
	    <img alt="" src="<%=path %>/jsp/login/images/bluebanner.jpg" width="100%" height="100%"> 
		    <table id="tab" align="center" style="height:3em">
				<tr>
					<td>旧密码:</td>
					<td id="ptd"><input type="password" id="old" size="28" onmouseout="chageng()"/></td>
					<td id="hid"><a href="#"  onclick="oldpwd()" id="selectpwd"><img src="<%=path %>/js/EasyUI-1.5.1/themes/icons/lock.png"/></a></td>
					<td id="tishi"></td>
				</tr>
				<tr>
					<td>新密码:</td>
					<td id="passnew"><input type="password" size="28" id="newpassword"/></td>
					<td id="news"><a href="#"  onclick="newpwd()"><img src="<%=path %>/js/EasyUI-1.5.1/themes/icons/lock.png"/></a></td>
					<td id="cdeng"></td>
				</tr>
				<tr>
					<td>确认密码:</td>
					<td  id="passq"><input type="password" size="28" id="newpasswordtwo" onmouseout="chadeng()"/></td>
				</tr>
				<tr>
					<td colspan="3" align="center">
						<br>
						<input type="button" onclick="al()" value="修改"/>
						&nbsp;&nbsp;&nbsp;
						<input type="button" onclick="resetfun()" value="重置"/>
					</td>
				</tr>       
		    </table>
	 </div>
	 <script type="text/javascript">
	 	//旧密码
	 	function oldpwd(){
	 		var types=document.getElementById("old").type;
	 		var pwd=$("#old").val();
	 		if(types=="password"){
	 			$("#ptd").html("<input type='text' id='old' size='28' onmouseout='chageng()' value='"+pwd+"'/>");
	 			$("#hid").html("<a href='#'  onclick='oldpwd()' id='selectpwd'><img src='<%=path %>/js/EasyUI-1.5.1/themes/icons/reload.png'/></a>");
	 		}else{
	 			$("#ptd").html("<input type='password' id='old' size='28' onmouseout='chageng()' value='"+pwd+"'/>");
	 			$("#hid").html("<a href='#'  onclick='oldpwd()' id='selectpwd'><img src='<%=path %>/js/EasyUI-1.5.1/themes/icons/lock.png'/></a>");
	 		}
	 	}
	 	//新密码
	 	function newpwd(){
	 		var types=document.getElementById("newpassword").type;
	 		var pwdone=$("#newpassword").val();
	 		var pwdtwo=$("#newpasswordtwo").val();
	 		if(types=="password"){
	 			$("#passnew").html("<input type='text' size='28' id='newpassword' value='"+pwdone+"'/>");
	 			$("#passq").html("<input type='text' size='28' id='newpasswordtwo' onmouseout='chadeng()' value='"+pwdtwo+"'/>");
	 			$("#news").html("<a href='#'  onclick='newpwd()'><img src='<%=path %>/js/EasyUI-1.5.1/themes/icons/reload.png'/></a>");
	 		}else{
	 			$("#passnew").html("<input type='password' size='28' id='newpassword' value='"+pwdone+"'/>");
	 			$("#passq").html("<input type='password' size='28' id='newpasswordtwo' onmouseout='chadeng()' value='"+pwdtwo+"'/>");
	 			$("#news").html("<a href='#'  onclick='newpwd()'><img src='<%=path %>/js/EasyUI-1.5.1/themes/icons/lock.png'/></a>");
	 		}
	 	}
	 	//判断两次输入是否一致
	 	function chadeng(){
	 		var onep=$("#newpassword").val();
	 		var twop=$("#newpasswordtwo").val();
	 		if(onep!=twop){
	 			$("#cdeng").html("密码不一致,请修改!").css('color','red');
	 		}else{
	 			$("#cdeng").html("");
	 		}
	 	}
	 	
	 	//查询原始密码
	 	function chageng(){
	 		var pwd=$("#old").val();
	 		if(pwd!=""){
	 			$.ajax({
		 			type:"post",
		 			url:"<%=path %>/chageng.do?username=<%=lv.getUsername()%>&pwd="+pwd,
		 			success:function(data){
		 				if(data=="N"){
		 					$("#tishi").html("密码有误!").css('color','red');
		 				}else{
		 					$("#tishi").html("");
		 				}
		 			}
	 			});
	 		}
	 	}
	 	
	 	//重置
	 	function resetfun(){
	 		$("#old").val("");
	 		$("#newpassword").val("");
	 		$("#newpasswordtwo").val("");
	 		$("#tishi").html("");
	 		$("#cdeng").html("");
	 	}
	 	//提交修改
	 	function al(){
	 		var pwd=$("#newpassword").val();
	 		var old=$("#old").val();
	 		var a=document.getElementById("tishi").innerText;
	 		var b=document.getElementById("cdeng").innerText;
			var c=a+b;
			if(c.length==0 && pwd.length!=0 && old.length!=0){
				location.href="<%=path %>/logpwdupdate.do?uname=<%=lv.getUsername()%>&pwd="+pwd;
			}else{
				alert("提交信息有误，请修改!");
			}
	 	}
	 	
	 </script>
  </body>
</html>
