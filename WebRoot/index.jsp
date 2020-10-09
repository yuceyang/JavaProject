<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
    <script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
  </head>
  <body>
    <script type="text/javascript">
    	$(function(){
			location.href="<%=path %>/jsp/login/login.html";
    	});
    </script>
  </body>
</html>
