<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <style type="text/css">
  	a{
  		text-decoration:none;
  		color:blue;
  	}
  	.tablelist{
  		width:100%;
  		border-collapse:collapse;
  		border:none;
  	}
  	.tablelist tr td{
  		text-align:center;
  		border:1px inset;
  		width:16.66%;
  		height:1.5em;
  	}
  </style>
    <script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
  </head>
  <body>
  <table border="0" width="100%">
  	<tr>
  		<td>会员总数:<a href="<%=path %>/jsp/basic.jsp">&nbsp;&nbsp;&nbsp;<span id="countbianhao"></span></a>&nbsp;&nbsp;&nbsp;</td>
  		<td>最大规模:<a href="#" onclick="maxguimoselect()">&nbsp;&nbsp;&nbsp;<span id="maxguomo"></span></a>&nbsp;&nbsp;&nbsp;</td>
  		<td title="正整数">规模:
	  		<input type="text" id="gm1" size="1" value="0"/>&nbsp;—
	  		<input type="text" id="gm2" size="1" value="9999"/>
	  		<input type="button" value="查询" onclick="guimolist()"/>
  		</td>
  		<td title="正整数">年龄:
	  		<input type="text" id="age1" size="1" value="0"/>&nbsp;—
	  		<input type="text" id="age2" size="1" value="100"/>
	  		<input type="button" value="查询" onclick="agelist()"/>
  		</td>
  	</tr>
  	
  	
  	
  	
  </table>
  <div id="polling" style="width:100%;">
  	
  </div>
  	<script type="text/javascript">
  		$.ajax({
  			type:"get",
  			url:"<%=path %>/selectcount.do",
  			success:function(data){
  			var a=eval(data);
  			bianhao=a[0].maxguimobianhao;
  				$("#countbianhao").html(a[0].countbianhao);
  				$("#maxguomo").html(a[0].maxguimo);
  			}
  		  });
  		 //最大规模详情
  		 function maxguimoselect(){
  		 	location.href="<%=path %>/Fdetails.do?bianhao="+bianhao;
  		 }
  		 //规模查询
  		 function guimolist(){
  		 	var gm1=$("#gm1").val();
  		 	var gm2=$("#gm2").val();
  		 	var a=/^\d+$/;
  		 	if(a.test(gm1) && a.test(gm2)){
  		 		$.ajax({
  		 		type:"get",
  		 		url:"<%=path %>/guimolist.do?gm1="+gm1+"&gm2="+gm2,
  		 		success:function(data){
  		 			var list=eval(data);
  		 			$("#polling").html("");
  		 			$("#polling").append("<table class='tablelist' style='background-color:MediumTurquoise;'><tr><th>编号</th><th>姓名</th><th>规模</th><th>手机</th><th>地址</th></th></table>");
  		 			for(var i=0;i<list.length;i++){
  		 				$("#polling").append("<table class='tablelist'><tr><td>"+list[i].bianhao+"</td><td>"+list[i].uname+"</td><td>"+list[i].guimo+"</td><td>"+list[i].phone+"</td><td>"+list[i].ip+"</td></tr></table>");
  		 			}
  		 		}
  		 	});
  		 	}
  		 }
  		 //年龄查询
  		 function agelist(){
  		 	var age1=$("#age1").val();
  		 	var age2=$("#age2").val();
  		 	var a=/^\d+$/;
  		 	if(a.test(age1) && a.test(age2)){
  		 		$.ajax({
  		 		type:"get",
  		 		url:"<%=path %>/agelist.do?age1="+age1+"&age2="+age2,
  		 		success:function(data){
  		 			var list=eval(data);
  		 			$("#polling").html("");
  		 			$("#polling").append("<table class='tablelist' style='background-color:MediumTurquoise;'><tr><th>编号</th><th>姓名</th><th>年龄</th><th>规模</th><th>手机</th><th>地址</th></th></table>");
  		 			for(var i=0;i<list.length;i++){
  		 				$("#polling").append("<table class='tablelist'><tr><td>"+list[i].bianhao+"</td><td>"+list[i].uname+"</td><td>"+list[i].age+"</td><td>"+list[i].guimo+"</td><td>"+list[i].phone+"</td><td>"+list[i].ip+"</td></tr></table>");
  		 			}
  		 		}
  		 	});
  		 	}
  		 }
  	</script>
  </body>
</html>
