<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>siliaodangan.jsp</title>
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
	    	border:1px solid black;
	    	text-align:center;
    	}
    	input{
    		width:100%;
    		border:none;
    		height:20px;
    		text-align:center;
    		-moz-border-radius: 5px;-webkit-border-radius: 5px; border-radius:5px;
    	}
    	a{
    		text-decoration:none;
    		color:blue;
    	}
    	#colotr{
    		background-color:MediumTurquoise;
    	}
    	#colotr tr td input[type=text]{
    		background-color:MediumTurquoise;
    	}
	</style>
  </head>
  <body style="margin:0px;">
    	<table id="table" align="center" width="100%" >
	    	<tr style="background-color:MediumTurquoise;">
		    	<td>饲料类型</td>
		    	<td>品牌</td>
		    	<td>包装规格</td>
		    	<td>市场价格</td>
		    	<td>饲料配比</td>
		    	<td>豆粕配比</td>
	    		<td>玉米配比</td>
	    		<td>麦麸配比</td>
	    		<td>配后成本/kg</td>
	    	</tr>
	    	<tr>
	    		<td><input name="siliaoleixing" id="siliaoleixing"/></td>
	    		<td><input name="pinpai" id="pinpai"/></td>
	    		<td><input name="baozhuangguige" id="baozhuangguige"/></td>
	    		<td><input name="siliaormb" id="siliaormb"/></td>
	    		<td><input name="peibi" id="peibi"/></td>
	    		<td><input name="doupobi" id="doupobi"/></td>
	    		<td><input name="yumipeibi" id="yumipeibi"/></td>
	    		<td><input name="maifupeibi" id="maifupeibi"/></td>
	    		<td><input name="chengbenbi" id="chengbenbi"/></td>
	    	</tr>
	    	<tr>
	    		<td colspan="9" style="border:none;">&nbsp;</td>
	    	</tr>
	    	<tr>
	    		<td colspan="9" style="border:none;">
	    			<a onclick="slup()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
		    		<a onclick="cline()" class="easyui-linkbutton" data-options="iconCls:'icon-no'">清空</a>
	    		</td>
	    	</tr>
	    </table>
	    <br>
	    <table width="100%" id="temptb">
	    	<tr  style="background-color:MediumTurquoise;">
	    		<td>饲料类型</td>
	    		<td>品牌</td>
	    		<td>包装规格</td>
	    		<td>市场价格</td>
	    		<td>饲料配比</td>
	    		<td>豆粕配比</td>
	    		<td>玉米配比</td>
	    		<td>麦麸配比</td>
	    		<td>配后成本/kg</td>
	    		<td style="width:3em">修改</td>
	    	</tr>
	    </table>
	    <script type="text/javascript">
	    	//情况
	    	function cline(){
	    		$("#siliaoleixing").val("");
	    		$("#pinpai").val("");
	    		$("#baozhuangguige").val("");
	    		$("#siliaormb").val("");
	    		$("#peibi").val("");
	    		$("#doupobi").val("");
	    		$("#yumipeibi").val("");
	    		$("#maifupeibi").val("");
	    		$("#chengbenbi").val("");
	    	}
	    	//提交
	    	function slup(){
	    		var siliaoleixing=$("#siliaoleixing").val();
	    		var pinpai=$("#pinpai").val();
	    		var baozhuangguige=$("#baozhuangguige").val();
	    		var siliaormb=$("#siliaormb").val();
	    		var peibi=$("#peibi").val();
	    		var doupobi=$("#doupobi").val();
	    		var yumipeibi=$("#yumipeibi").val();
	    		var maifupeibi=$("#maifupeibi").val();
	    		var chengbenbi=$("#chengbenbi").val();
	    		//encodeURI(url)转义字符  url中带有 % 需要转义
	    		if(siliaoleixing==""||siliaoleixing==null){
	    			if (confirm("饲料类型不能为空!"));
	    		}else{
	    			location.href=encodeURI("<%=path %>/sluplocation.do?siliaoleixing="+siliaoleixing+"&pinpai="+pinpai+"&baozhuangguige="+baozhuangguige+"&siliaormb="+siliaormb+"&peibi="+peibi+"&doupobi="+doupobi+"&yumipeibi="+yumipeibi+"&maifupeibi="+maifupeibi+"&chengbenbi="+chengbenbi);
	    		}
	    	}
	    	$($.ajax({
	    		type:"post",
		   		url:"<%=path%>/siliaotraverse.do",
		   		success:function(data){
		    			var list=eval(data);
		    			for(var i=0;i<list.length;i++){
		    				$("#temptb").append("<tr><td><input id='siliaoleixing"+list[i].siliaoleixingid+"' value='"+list[i].siliaoleixing+"'/></td>"+
		    				"<td><input id='pinpai"+list[i].siliaoleixingid+"' value='"+list[i].pinpai+"'/></td>"+
		    				"<td><input id='baozhuangguige"+list[i].siliaoleixingid+"' value='"+list[i].baozhuangguige+"'/></td>"+
		    				"<td><input id='siliaormb"+list[i].siliaoleixingid+"' value='"+list[i].siliaormb+"'/></td>"+
		    				"<td><input id='peibi"+list[i].siliaoleixingid+"' value='"+list[i].peibi+"'/></td>"+
		    				"<td><input id='doupobi"+list[i].siliaoleixingid+"' value='"+list[i].doupobi+"'/></td>"+
		    				"<td><input id='yumipeibi"+list[i].siliaoleixingid+"' value='"+list[i].yumipeibi+"'/></td>"+
		    				"<td><input id='maifupeibi"+list[i].siliaoleixingid+"' value='"+list[i].maifupeibi+"'/></td>"+
		    				"<td><input id='chengbenbi"+list[i].siliaoleixingid+"' value='"+list[i].chengbenbi+"'/></td>"+
		    				"<td><a href='#' onclick='updateclick("+list[i].siliaoleixingid+")'>修改</a></td>"+
		    				"</tr>");
		    			}
	    		}
	    	}));
	    	function updateclick(id){
	    		var siliaoleixing=$("#siliaoleixing"+id).val();
	    		var pinpai=$("#pinpai"+id).val();
	    		var baozhuangguige=$("#baozhuangguige"+id).val();
	    		var siliaormb=$("#siliaormb"+id).val();
	    		var peibi=$("#peibi"+id).val();
	    		var doupobi=$("#doupobi"+id).val();
	    		var yumipeibi=$("#yumipeibi"+id).val();
	    		var maifupeibi=$("#maifupeibi"+id).val();
	    		var chengbenbi=$("#chengbenbi"+id).val();
	    		if(siliaoleixing==""||siliaoleixing==null){
	    			if (confirm("饲料类型不能为空!"));
	    		}else{
		    		location.href=encodeURI("<%=path %>/siliaomodify.do?siliaoleixing="+siliaoleixing+
		    		"&pinpai="+pinpai+
		    		"&baozhuangguige="+baozhuangguige+
		    		"&siliaormb="+siliaormb+
		    		"&peibi="+peibi+
		    		"&doupobi="+doupobi+
		    		"&yumipeibi="+yumipeibi+
		    		"&maifupeibi="+maifupeibi+
		    		"&chengbenbi="+chengbenbi+
		    		"&id="+id);
	    		}
	    	}
	    </script>
  </body>
</html>
