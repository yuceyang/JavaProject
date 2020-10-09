<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<style type="text/css">
	  	table{
	    	border-collapse:collapse;border:none;
	    }
	  	.return_visit input{
	    	height:3em;
	    	width:8em;
	    	border:none;
	    }
	    td{
    	height:3em;
    	border:1px solid black;
    }
  	</style>
  </head>
  <body>
  	<!-- 客户回访追踪报告 -->				
			<h1 align="center">客户回访追踪报告 </h1>	
			<table align="center" class="return_visit">
				<tr>
					<td>拜访时间</td>
					<td>拜访目的</td>
					<td>方案使用情况</td>
					<td>采食状况</td>
					<td>粪便状况</td>
					<td>外观状况</td>
					<td>死亡解剖状况</td>
					<td>抗体检测报告</td>
					<td>其他</td>
					<td>结论</td>
				</tr>
				<tr>
					<td><input name="return_visit_times"/></td>
					<td><input name="return_visit_purpose"/></td>
					<td><input name="return_visit_usage"/></td>
					<td><input name="return_visit_Feedintake"/></td>
					<td><input name="return_visit_feces"/></td>
					<td><input name="return_visit_appearance"/></td>
					<td><input name="return_visit_end"/></td>
					<td><input name="return_visit_antibody"/></td>
					<td><input name="return_visit_other"/></td>
					<td><input name="return_visit_conclusion"/></td>
				</tr>
			</table>
  </body>
</html>
