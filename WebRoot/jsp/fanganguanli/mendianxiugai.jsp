<%@page import="com.jiyoo.vo.QuYuVo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
QuYuVo q=(QuYuVo)request.getSession().getAttribute("mendian");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'mendianxiugai.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
	<link rel="stylesheet"  href="<%=path %>/css/mendianxiugai.css" type="text/css" >
	<style type="text/css">
	a{
		text-decoration: none;
		color:blue;
	}
	.c1{
		border:0px solid white;
		height:2em;
		width:10%;
		text-align:center;
	}
	.c2{
		border:0px solid white;
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
  <body>
	   <table id="table">
	   		<tr>
	   			<td>店长姓名:<input type="text" id="mname" name="mname" class="input" value="<%=q.getMname() %>"/></td>
	   			<td>门店编号:<input type="text" id="mbianhao" name="mbianhao" class="input" value="<%=q.getMbianhao() %>"/></td>
	   			<td>联系电话:<input type="text" id="mphone" name="mphone" class="input" value="<%=q.getMphone() %>"/></td>
	   			<td>门店地址:<input type="text" id="mip" name="mip" class="input" value="<%=q.getMip() %>"/></td>
	   			<td>门店归属:<select id="daqu" name="daqu"></select></td>
	   			<td><input type="button" onclick="updateoption()" id="update"  value="修改"/></td>
	   			<td><input type="button" id="deleat" value="删除"/></td>
	   		</tr>
	   </table>
	  <table id="tb3"></table>
	   
   <script type="text/javascript">
	var daquusername="";
	var daquphone="";
	var daqubianhao="";
	var daquip="";
	var daquzhiwei="";
   	$(daquinsert());
	function daquinsert(){
		$("#daqu").html("");
		$("#daqu").append("<option><%=q.getMdaqu() %></option>");
	  	$.ajax({
	  		type:"post",
			url:"<%=path %>/daquselects.do?&daquusername="+daquusername+"&daquphone="+daquphone+"&daqubianhao="+daqubianhao+"&daquip="+daquip+"&daquzhiwei="+daquzhiwei,
			success:function(data){
				var list=eval(data);
				for(var i=0;i<list.length;i++){
					if(list[i].daquusername!="<%=q.getMdaqu() %>"){
						$("#daqu").append("<option>"+list[i].daquusername+"</option>");
					}else{
						continue;
					}
				}
			}
	  	});
	}
	function updateoption(){
		var mname=$("#mname").val();
		var mbianhao=$("#mbianhao").val();
		var mphone=$("#mphone").val();
		var mip=$("#mip").val();
		var mdaqu=$("#daqu").val();
		location.href="<%=path %>/mendianupdatetwo.do?mid=<%=q.getMid() %>&mname="+mname+"&mbianhao="+mbianhao+"&mphone="+mphone+"&mip="+mip+"&mdaqu="+mdaqu;
	}
	$(initvip());
	function initvip(){
		    	$.ajax({
		    		type:"post",
		    		url:"<%=path %>/mdaquvipallsel.do?mdaqu=<%=q.getMname() %>",
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
		    				"</td></tr>");
		    			}
		    		}
		    	});
	    	};
   </script>
  </body>
</html>
