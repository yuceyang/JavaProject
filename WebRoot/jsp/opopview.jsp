<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>opopview</title>

  </head>
  
  <body>
   
	<c:forEach items="${list }" var="a">
   	 	${a.name }<br>
   	 	${a.id }<br>
   	 	${a.password }<br>
   	 <hr>
   	 </c:forEach>
  </body>
</html>
