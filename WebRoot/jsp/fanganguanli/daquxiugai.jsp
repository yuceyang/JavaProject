<%@page import="com.jiyoo.vo.QuYuVo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
QuYuVo qy=(QuYuVo)session.getAttribute("q");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'daquxiugai.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"  href="<%=path %>/css/daquguanli.css" />
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
	<style type="text/css">
		a{
			text-decoration:none;
			color:blue;
		}
		#tb2{
			border:none;
			border-collapse:collapse;
			width:100%;
		}
		#tb2 tr td{
			border:1px solid white;
			height:2em;
		}
		#tb3{
			border:none;
			border-collapse:collapse;
			width:100%;
		}
		.c1{
			border:1px solid white;
			height:2em;
			width:10%;
			text-align:center;
		}
		.c2{
			border:1px solid white;
			height:2em;
			width:20%;
		}
		.col1{
			background-color: rgb(204, 204, 204);
			font-family:900;
		}
		.col2{
			background-color: #EEE8AA;
		}
	</style>
  </head>
  <body style="padding:0px;border:none;margin:0px">
	 <table align="center" id="table">
	    	<tr>
		    	<td>姓名:<input id="daquusername" value="<%=qy.getDaquusername() %>"/></td>
		    	<td>手机号:<input name="daquphone" id="daquphone" value="<%=qy.getDaquphone() %>"/></td>
		    	<td>门店编号:<input name="daqubianhao" id="daqubianhao" value="<%=qy.getDaqubianhao() %>"/></td>
		    	<td>门店地址:<input name="daquip" id="daquip" value="<%=qy.getDaquip() %>"/></td>
		    	<td>职位:<input name="daquzhiwei" id="daquzhiwei" value="<%=qy.getDaquzhiwei() %>"/></td>
		    	<td id="gongneng">
		    		<a href="#" onclick="update(<%=qy.getDaquid()%>)"><input type="button" style="border-color:yellow;" value="提交修改"/></a>
		    	</td>
	    	</tr>
	 </table>
	 
	 <table id="tb2"></table>
	 <table id="tb3"></table>
	 
	    <script type="text/javascript">
	    	function trims(str){
				return str.replace(/[ ]/g,"");//替换所有空格
			}
	    	function update(data){
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
		 			$.ajax({
		 				type:"post",
		 				url:"<%=path %>/daquupdatedatalist.do?&daquusername="+daquusername+"&daquphone="+daquphone+"&daqubianhao="+daqubianhao+"&daquip="+daquip+"&daquzhiwei="+daquzhiwei+"&daquid="+data,
		 				success:function(data){
		 					if(data){
		 						if(window.confirm('修改成功!!!')){
		 							return true;
		 						};
		 					};
			 				ses();
			 				hes();
		 				}
		 			});
		 		};
	    	};
	    	
	    	$(ses(),hes());
	    	function ses(){
		    	$.ajax({
		    		type:"post",
		    		url:"<%=path %>/selectmendian.do?mname=<%=qy.getDaquusername() %>",
		    		success:function(data){
		    			var list=eval(data);
		    			$("#tb2").html("");
			    		$("#tb2").append("<tr class='col1'><td colspan='4'>所属门店:"+list.length+"</td></tr>");
			    		$("#tb2").append("<tr class='col1' style='text-align:center;'><td>姓名"+
		    				"</td><td>门店编号"+
		    				"</td><td>联系电话"+
		    				"</td><td>门店地址"+
		    				"</td></tr>");
		    			for(var i=0;i<list.length;i++){
		    				$("#tb2").append("<tr class='col2'><td>"+list[i].mname+
		    				"</td><td>"+list[i].mbianhao+
		    				"</td><td>"+list[i].mphone+
		    				"</td><td>"+list[i].mip+
		    				"</td></tr>");
		    			}
		    		}
		    	});
	    	};
	    	function hes(){
		    	$.ajax({
		    		type:"post",
		    		url:"<%=path %>/daqusuosuchaxun.do?daquusername=<%=qy.getDaquusername() %>",
		    		success:function(data){
		    			var list=eval(data);
		    			$("#tb3").html("");
			    		$("#tb3").append("<tr class='col1'><td colspan='9'>所属会员:"+list.length+"</td></tr>");
			    		$("#tb3").append("<tr class='col1' style='text-align:center;'><td class='c1'>编号</td><td class='c1'>姓名"+
		    				"</td><td class='c1'>年龄"+
		    				"</td><td class='c1'>电话"+
		    				"</td><td class='c2'>地址"+
		    				"</td><td class='c1'>性别"+
		    				"</td><td class='c1'>微信"+
		    				"</td><td class='c1'>身份证号"+
		    				"</td><td class='c1'>所属门店"+
		    				"</td></tr>");
		    			for(var i=0;i<list.length;i++){
		    				$("#tb3").append("<tr class='col2'><td class='c1'><a href='<%=path%>/Fdetails.do?bianhao="+list[i].bianhao+"'>"+list[i].bianhao+
		    				"</a></td><td class='c1'>"+list[i].uname+
		    				"</td><td class='c1'>"+list[i].age+
		    				"</td><td class='c1'>"+list[i].phone+
		    				"</td><td class='c2'>"+list[i].ip+
		    				"</td><td class='c1'>"+list[i].sex+
		    				"</td><td class='c1'>"+list[i].weixin+
		    				"</td><td class='c1'>"+list[i].bir+
		    				"</td><td class='c1'>"+list[i].mdaqu+
		    				"</td></tr>");
		    			}
		    		}
		    	});
	    	};
	    </script>
  </body>
</html>
