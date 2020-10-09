<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>zhuce.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
	  <style type="text/css">
	  	#img{
	  		right: 0;
	  		bottom: 0;
	  		position: absolute; 
	  		top: 0; 
	  		z-index:-1;
	  	}
		.inputs{
			height:2em;
			border:1px solid #FFA07A;
			border-radius:10px;
			text-align: center;
		}
	  	.divone{
	  		background-color:#E8E8E8;
			margin-top:8%;
			width: 607px;
			height:466px;
			border:0px solid black;
			margin-left:32%;
			border-radius:30px;
			opacity:0.5;
		}
		.divtwo{
			position: absolute;
			width:460px;
			height:20em;
			border:0px solid black;
			margin-top:-23%;
			margin-left:36%;
			font-weight: 900;
		}
		.btn{
		    padding: 2 4 0 4;
		    font-size: 17px;
		    width:4em;
		    height:2em;
		    border-radius:10px;
		    background-color: #ece9d8;
		    border-width:1;
		    
		}
	  </style>
  </head>
  <body>
  	<img id="img" width="100%" height="100%" src="<%=path%>/images/backgrounds/logbackground.jpg">
	  <div  class="divone"></div>
	  <div class="divtwo">
		  	<form id="formup" action="<%=path %>/zhuce.do" method="post">
			  	<div align="center">
			  	<br><br>
			  		姓名:&nbsp;&nbsp;&nbsp;<input size="32" id="name" name="name" class="inputs"/><br><br>
				  	账号:&nbsp;&nbsp;&nbsp;<input size="32" id="username" name="username" class="inputs"/><br><br>
				  	密码:&nbsp;&nbsp;&nbsp;<input type="password" id="pwd" size="32" name="password" class="inputs"/><br><br>
			  		管理:<input type="checkbox" id="guanliyuan" name="guanliyuan" />&nbsp;&nbsp;&nbsp;
					增加:<input type="checkbox" id="zengjia" name="zengjia" checked="checked" />&nbsp;&nbsp;&nbsp;
					查询:<input type="checkbox" id="chaxun" name="chaxun" checked="checked"/>&nbsp;&nbsp;&nbsp;<br><br>
					修改:<input type="checkbox" id="xiugai" name="xiugai" />&nbsp;&nbsp;&nbsp;
					删除:<input type="checkbox" id="shanchu" name="shanchu" />&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br><br>
						<input type="button"class="btn" onclick="zc()" value="注册">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" class="btn" value="重置"/>
			  	</div>
			</form>
		</div>
		<script type="text/javascript">
			function zc(){
				var myReg=/^1(3|4|5|7|8)\d{9}$/;//手机正则
				var username=$("#username").val();
				var pwd=$("#pwd").val().length;
				if(!myReg.test(username)){
					alert("请输入符合账号,一般为手机号。");
				}else if(pwd==0){
					alert("密码不能为空!");
				}else{
					$("#formup").submit();
				}
			}
		
		</script>
  </body>
</html>
