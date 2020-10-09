<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>yimiaodangan.jsp</title>
    <script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="<%=path %>/js/EasyUI-1.5.1/jquery.easyui.min.js"></script>
	<script type="text/javascript"
		src="<%=path %>/js/EasyUI-1.5.1/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" href="<%=path %>/js/EasyUI-1.5.1/themes/icon.css"
		type="text/css"></link>
	<link rel="stylesheet"
		href="<%=path %>/js/EasyUI-1.5.1/themes/default/easyui.css" type="text/css"></link>
	<style type="text/css">
		table{
    		border-collapse:collapse;border:none;
			word-wrap:break-word;
    	}
    	td{
	    	border:0px solid black;
	    	text-align:center;
    	}
    	input{
    		border:none;
    		height:20px;
    		text-align:center;
    		-moz-border-radius: 5px;-webkit-border-radius: 5px; border-radius:5px;
    	}
    	a{
    		text-decoration:none;
    	}
    	#table2 tr td{
    		border:1px solid black;
	    	text-align:center;
    	}
    	#table2 tr td input{
    		width:100%;
    		height:2em;
    	}
	</style>
  </head>
  <body style="padding:0px;border:0px;margin:0px;">
	   <form action="<%=path%>/yimiaodangans.do" method="post" id="formup">
	    <table align="center" width="100%" style="background-color:MediumTurquoise;">
	    	<tr>
		    	<td>疫苗名称:<input type="text" name="yimiao" id="yimiao"/></td>
		    	<td>生产厂家:<input name="schangjia" id="schangjia"/></td>
		    	<td>规格:<input name="guige" id="guige"/></td>
		    	<td>市场价格:<input name="scrmb" id="scrmb"/></td>
		    	<td>
		    		<a onclick="yiup()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
		    		<a onclick="cline()" class="easyui-linkbutton" data-options="iconCls:'icon-no'">清空</a>
		    	</td>
	    	</tr>
	    </table>
	   </form>
	   <table id="table2" align="center" width="100%">
	   	<tr style="background-color:MediumTurquoise;">
	   		<td>疫苗名称</td>
	   		<td>生产厂家</td>
	   		<td>规格</td>
	   		<td>市场价格</td>
	   		<td>功能</td>
	   	</tr>
	   </table>
	   <script type="text/javascript">
	   	function yiup(){
	   		var y=$("#yimiao").val();
	   		if(y==""||y==null){
	   			if (confirm("疫苗不能为空!"));
	   		}else{
	   			$("#formup").submit();
	   		}
	   	}
	   	function cline(){
	   		$("#yimiao").val("");
	   		$("#schangjia").val("");
	   		$("#guige").val("");
	   		$("#scrmb").val("");
	   	}
	   	//初始化遍历
	   	$($.ajax({
	   		type:"post",
	   		url:"<%=path%>/selectyimiao.do",
	   		success:function(data){
	   			var list=eval(data);
	   			for(var i=0;i<list.length;i++){
	   				$("#table2").append("<tr><td><input id='yimiao"+list[i].yimiaoid+
	   				"' value='"+list[i].yimiao+"'/></td><td><input id='schangjia"+list[i].yimiaoid+
	   				"' value='"+list[i].schangjia+"'/></td><td><input id='guige"+list[i].yimiaoid+
	   				"' value='"+list[i].guige+"'/></td><td><input id='scrmb"+list[i].yimiaoid+
	   				"' value='"+list[i].scrmb+"'/></td>"+
	   				"<td><a href='#' onclick='updateym("+list[i].yimiaoid+")' >修改</a></td></tr>");
	   			}
	   		}
	   	}));
	   	//修改疫苗详情
	   	function updateym(id){
	   		var yimiao=$("#yimiao"+id).val();
	   		var schangjia=$("#schangjia"+id).val();
	   		var guige=$("#guige"+id).val();
	   		var scrmb=$("#scrmb"+id).val();
	   		location.href="<%=path %>/updateyimiao.do?yimiaoid="+id+"&yimiao="+yimiao+"&schangjia="+schangjia+"&guige="+guige+"&scrmb="+scrmb;
	   	}
	   </script>
  </body>
</html>
