<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>DEMO</title>
  </head>
  
  <body>
   	<table align="center" style="margin-top:20%">
   		<tr><th>编号不能为空!</th><th>&nbsp;&nbsp;&nbsp;</th><th><a href="../jsp/jibenxinxi.jsp">返回</a></th></tr>
   	</table>
    
  </body>
</html>
