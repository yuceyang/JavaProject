<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>bianhaonotnull.jsp</title>
  <style>
  	a{
  		text-decoration:none;
  	}
  </style>
  </head>
  <body>
  <table align="center" style="margin-top:20%">
    	<tr><td><h1>编号不能为空哦~~&nbsp;&nbsp;</h1></td><td><h3><a href="<%=path %>/jsp/datas/huifang.jsp">返回</a></h3></td></tr>
    </table>
  </body>
</html>
