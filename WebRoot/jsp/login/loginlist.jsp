<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'loginlist.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		tr td{
			color:white;
			text-align:center;
			border:1px solid CornflowerBlue;
			width:12.5%;
			height: 3em;
		}
	</style>
	<script type="text/javascript" charset="utf-8">
		$.ajax({
			type:"post",
			url:"<%=path %>/loginlistconfig.do",
			success:function(data){
				var list=eval(data);
				for(var i=0;i<list.length;i++){
					var ids="tr"+i;
					$("#tableone").append("<tr id='tr"+i+"'>"+
					"<td>账号:<input value='"+list[i].username+"' id='username"+i+"'/></td>"+
					"<td>姓名:<input value='"+list[i].name+"' id='uname"+i+"'/></td>"+
					"</tr>");
					if(list[i].shanchu=="Y"){
						$("#"+ids).append("<td>删除:<input type='checkbox' checked='true' id='shanchu"+i+"'/></td>");
					}else{
						$("#"+ids).append("<td>删除:<input type='checkbox' id='shanchu"+i+"'/></td>");
					}
					if(list[i].xiugai=="Y"){
						$("#"+ids).append("<td>修改:<input type='checkbox' checked='checked'  id='xiugai"+i+"'/></td>");
					}else{
						$("#"+ids).append("<td>修改:<input type='checkbox'  id='xiugai"+i+"'/></td>");
					}
					if(list[i].zengjia=="Y"){
						$("#"+ids).append("<td>增加:<input type='checkbox' checked='true'  id='zengjia"+i+"'/></td>");
					}else{
						$("#"+ids).append("<td>增加:<input type='checkbox'  id='zengjia"+i+"'/></td>");
					}
					if(list[i].chaxun=="Y"){
						$("#"+ids).append("<td>查询:<input type='checkbox' checked='true'  id='chaxun"+i+"'/></td>");
					}else{
						$("#"+ids).append("<td>>查询:<input type='checkbox'  id='chaxun"+i+"'/></td>");
					}
					if(list[i].guanliyuan=="Y"){
						$("#"+ids).append("<td>管理员:<input type='checkbox' checked='true'  id='guanliyuan"+i+"'/></td>");
					}else{
						$("#"+ids).append("<td>管理员:<input type='checkbox'  id='guanliyuan"+i+"'/></td>");
					}
					$("#"+ids).append("<td>"+
					"<input type='button' onclick='reset("+list[i].id+")' value='重置密码' style='height:2em;'/>&nbsp;&nbsp;&nbsp;"+
					"<input type='button' onclick='upload("+i+")' value='提交修改' style='height:2em;'/>"+
					"<input type='hidden' value='"+list[i].id+"' id='logid"+i+"'>"+
					"</td>");
				}
			}
		});
		//重置密码为
		function reset(id){
			if(confirm("重置密码为:   123456")){
				location.href="<%=path %>/resetinit.do?id="+id;
			}
		}
		
		//提交修改
		function upload(i){
		
			var logid=$("#logid"+i).val();
			var username=$("#username"+i).val();
			var uname=$("#uname"+i).val();
			
			var xxiugai=$("#xiugai"+i).is(":checked");
			var xshanchu=$("#shanchu"+i).is(":checked");
			var xzengjia=$("#zengjia"+i).is(":checked");
			var xchaxun=$("#chaxun"+i).is(":checked");
			var xguanliyuan=$("#guanliyuan"+i).is(":checked");
			
			if(xxiugai){var xiugai="Y";}else{var xiugai="N";}
			if(xshanchu){var shanchu="Y";}else{var shanchu="N";}
			if(xzengjia){var zengjia="Y";}else{var zengjia="N";}
			if(xchaxun){var chaxun="Y";}else{var chaxun="N";}
			if(xguanliyuan){var guanliyuan="Y";}else{var guanliyuan="N";}
			
			location.href="<%=path %>/logidupdate.do?logid="+logid+"&username="+username+"&uname="+uname+"&xiugai="+xiugai+"&shanchu="+shanchu+"&zengjia="+zengjia+"&chaxun="+chaxun+"&guanliyuan="+guanliyuan;			
		}
	</script>
  </head>
  <body style="margin:0px;background-size:100% 100%;background-image:url('<%=path %>/jsp/login/images/bluebanner.jpg');">
   	<table id="tableone" width="100%" style="border-collapse:collapse;border:none;" align="center">
   	</table>
   	
  </body>
</html>
