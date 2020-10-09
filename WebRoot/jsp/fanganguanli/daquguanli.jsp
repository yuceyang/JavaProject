<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="<%=path %>/js/EasyUI-1.5.1/jquery.easyui.min.js"></script>
	<script type="text/javascript"
		src="<%=path %>/js/EasyUI-1.5.1/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" href="<%=path %>/js/EasyUI-1.5.1/themes/icon.css"
		type="text/css"></link>
  	<link rel="stylesheet" type="text/css"  href="<%=path %>/css/daquguanli.css" />
  	<style type="text/css">
  		a{
  			color:blue;
  			text-decoration: none;
  		}
  		.title{
  			font-weight:bold;
  			background-color: rgb(204, 204, 204);	
  		}
  		.titlebodyone{
  			background-color:#EEE8AA;
  		}
  		.titlebodytwo{
  			background-color:#FFE4C4;
  		}
  		#secondtable{
  			border-collapse:collapse;
			width:100%;
			border:none;
			color:#333333;
		}
		#secondtable tr td{
			border:2px solid white; 
			width:20%;
			text-align:center;
		}
  	</style>
  </head>
  <body style="padding:0px;border:none;margin:0px">
    <table align="center" id="table">
	    	<tr>
		    	<td>姓名:<input id="daquusername"/></td>
		    	<td>手机号:<input name="daquphone" id="daquphone"/></td>
		    	<td>门店编号:<input name="daqubianhao" id="daqubianhao"/></td>
		    	<td>门店地址:<input name="daquip" id="daquip"/></td>
		    	<td>职位:<input name="daquzhiwei" id="daquzhiwei"/></td>
		    	<td id="gongneng">
		    		<a href="#" onclick="up()"><input type="button" style="" value="提交"/></a>
		    		<a href="#" onclick="selects()"><input type="button" style="" value="查询"/></a>
		    		<a href="#" onclick="clean()"><input type="button" style="" value="清空"/></a>
		    	</td>
	    	</tr>
	    </table>
	   	<table align="center" id="secondtable">
	   	</table>
	 <script type="text/javascript">
		function trims(str){
			return str.replace(/[ ]/g,"");//替换所有空格
		}
	 	function up(){
	 		var daquusername=document.getElementById("daquusername").value;
	 		var daquphone=document.getElementById("daquphone").value;
	 		var daqubianhao=document.getElementById("daqubianhao").value;
	 		var daquip=document.getElementById("daquip").value;
	 		var daquzhiwei=document.getElementById("daquzhiwei").value;
	 		if(trims(daquusername).length==0){
	 			alert("姓名不能为空");
	 		}else if(trims(daquphone).length==0){
	 			alert("电话不能为空");
	 		}else if(trims(daquusername).length>0 && trims(daquphone).length>0){
	 			location.href="<%=path %>/daquup.do?&daquusername="+daquusername+"&daquphone="+daquphone+"&daqubianhao="+daqubianhao+"&daquip="+daquip+"&daquzhiwei="+daquzhiwei;
	 		}
	 	}
	 	$(selects());
	 	function selects(){
		 	var daquusername=document.getElementById("daquusername").value;
	 		var daquphone=document.getElementById("daquphone").value;
	 		var daqubianhao=document.getElementById("daqubianhao").value;
	 		var daquip=document.getElementById("daquip").value;
	 		var daquzhiwei=document.getElementById("daquzhiwei").value;
	 		$("#secondtable").html("");
	 		$.ajax({
	 			type:"post",
	 			url:"<%=path %>/daquselects.do?&daquusername="+daquusername+"&daquphone="+daquphone+"&daqubianhao="+daqubianhao+"&daquip="+daquip+"&daquzhiwei="+daquzhiwei,
	 			success:function(data){
	 				var list=eval(data);
	 				$("#secondtable").append("<tr class='title'><td>姓名</td><td>手机号</td><td>门店编号</td><td>门店地址</td><td>职位</td></tr>");
	 				for(var i=0;i<list.length;i++){
	 					if(i%2==0){
	 						$("#secondtable").append("<tr class='titlebodyone'><td><a href='<%=path %>/daqufunction.do?id="+list[i].daquid+"'>"
		 					+list[i].daquusername+"</a></td><td>"
		 					+list[i].daquphone+"</td><td>"
		 					+list[i].daqubianhao+"</td><td>"
		 					+list[i].daquip+"</td><td>"
		 					+list[i].daquzhiwei+"</td></tr>");
	 					}else{
	 						$("#secondtable").append("<tr class='titlebodytwo'><td><a href='<%=path %>/daqufunction.do?id="+list[i].daquid+"'>"
		 					+list[i].daquusername+"</td><td>"
		 					+list[i].daquphone+"</td><td>"
		 					+list[i].daqubianhao+"</td><td>"
		 					+list[i].daquip+"</td><td>"
		 					+list[i].daquzhiwei+"</td></tr>");
	 					}
	 					
	 				}
	 				$("#secondtable").append("<tr><td colspan='5' style='border:none;text-align:left;'>&nbsp;&nbsp;数量:&nbsp;"+list.length+"</td></tr>");
	 			}
	 		});
	 	}
	 	function clean(){
	 		$("#daquusername").val("");
	 		$("#daquphone").val("");
	 		$("#daqubianhao").val("");
	 		$("#daquip").val("");
	 		$("#daquzhiwei").val("");
	 	}
	 
	 </script>
  </body>
</html>
