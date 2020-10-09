<%@page import="com.jiyoo.vo.LoginVo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
LoginVo lv=(LoginVo)request.getSession().getAttribute("log");
String shanchu=lv.getShanchu();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <script type="text/javascript" src="../js/EasyUI-1.5.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="../js/EasyUI-1.5.1/jquery.easyui.min.js"></script>
	<script type="text/javascript"
		src="../js/EasyUI-1.5.1/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" href="../js/EasyUI-1.5.1/themes/icon.css"
		type="text/css"></link>
	<link rel="stylesheet"
		href="../js/EasyUI-1.5.1/themes/default/easyui.css" type="text/css"></link>
	<style type="text/css">
		a {
			text-decoration: none;
			color:blue;
		}
		.cl{
			width:12%;height:2em;
		}
		.col-wid{
			
		}
		#tab{
			border-collapse:collapse;
			border:none;
			width:100%;
		}
		#tab2{
			border-collapse:collapse;
			width:100%;
		}
		#tab2 tr td{
			border:outset 1px;
		}
	</style>
  </head>
  <body style="margin-top:1px;padding:0px">
    <div id="p" class="easyui-panel"
			style="width:100%;height:30px;padding:0px;">
			
			<table class="easyui-datagrid" fit="true" width="100%">
					<thead style="width:100%">
						<tr fit="true" id="look_list" style="width=:100%">
							<th data-options="field:'bianhao'" align="center" width="20%">编号:<input id="look_bianhao"/></th>
							<th data-options="field:'name'" align="center" width="20%">姓名:<input id="look_name"/></th>
							<th data-options="field:'ipone'" align="center" width="20%">电话:<input id="look_phone"/></th>
							<th data-options="field:'ip'" align="center" width="20%">地址:<input id="look_ip"/></th>
							<th data-options="field:'sub'" align="center" width="18%">
							<font>
							<a onclick="sub()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
							<a onclick="cempty()" class="easyui-linkbutton" data-options="iconCls:'icon-no'">清空</a> 
							<a onclick="removes()" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a> 
							</font>
							</th>
						</tr>
					</thead>
				</table>
		</div>
		<table style="border-collapse:collapse;border:none;width:100%;" id="tab" align="center" fit="true">
			<tr id="onetr" style="background-color:MediumTurquoise">
				<th style="width:2%;" ><input type="checkbox" id="cb" onclick="dj('A01',this.checked)"></th>
				<th style="width:5%;">编号</th>
				<th style="width:5%;">姓名</th>
				<th style="width:5%;">年龄</th>
				<th style="width:5%;">性别</th>
				<th style="width:5%;">电话</th>
				<th style="width:20%;">住址</th>
				<th style="width:10%;">身份证号</th>
				<th style="width:10%;">大区所属</th>
				<th style="width:10%;">所属门店</th>
			</tr>
		</table>
		<table style="border-collapse:collapse;border:none;width:100%;" id="tab2" align="center" >
		</table>
		<div style="margin-top:1em">
			<span id="pageone">1</span>
			/
			<span id="pagenum"></span>&nbsp;&nbsp;&nbsp;
			<a href="javascropt:void(0);" onclick="shouye()">首页</a>&nbsp;
			<a href="javascropt:void(0);" onclick="uppage()">上一页</a>&nbsp;
			<a href="javascropt:void(0);" onclick="downpage()">下一页</a>&nbsp;
			<a href="javascropt:void(0);" onclick="weiye()">尾页</a>&nbsp;&nbsp;&nbsp;
			数量:<span id="countnum"></span>&nbsp;&nbsp;&nbsp;
			显示数:<input id="listnum" size="2" value="22"/>&nbsp;&nbsp;&nbsp;
			<a href="javascript:void(0)" onclick="returnpage()">跳转页数:</a><input id="returnpage" size="2">&nbsp;&nbsp;&nbsp;&nbsp;
			<span id="div_1"></span>
		</div>
		<script type="text/javascript">
			$(sub());
			function sub(){
				$("#tab2").html("");
				var b=$("#look_bianhao").val();
				var n=$("#look_name").val();
				var i=$("#look_phone").val();
				var ip=$("#look_ip").val();
				var str=b+" ,"+n+" ,"+i+" ,"+ip+" ,";
				$("#div_1").html("<a href='<%=path%>/excelfileout.do?list="+str+"'>导出全部</a>");
				
				$.ajax({
					type:"post",
					url:"<%=path %>/jibencoll.do?bianhao="+b+"&uname="+n+"&phone="+i+"&uip="+ip,
					success:function(data){
						var list=eval(data);
						var num=list.length;
						var pageone=parseInt($("#pageone").html());
						var listnum=parseInt($("#listnum").val());
						$("#countnum").html(num);
						$("#pagenum").html(Math.ceil(num/listnum));
						if(pageone==1){
							for(var i=pageone-1;i<listnum*pageone;i++){
								$("#tab2").append("<tr align='center' height='2em'>"+
								"<td style='width:2%;'><input name='A01' type='checkbox' value='"+list[i].bianhao+"' onclick='abc(\"A01\",\"cb\")'/></td>"+
								"<td style='width:5%;height:2em;' name='bianhaonames'>"+list[i].bianhao+"</td>"+
								"<td style='width:5%;height:2em;'><a href='<%=path %>/Fdetails.do?bianhao="+list[i].bianhao+"'>"+list[i].uname+"</a></td>"+
								"<td style='width:5%;height:2em;'>"+list[i].age+"</td>"+
								"<td style='width:5%;height:2em;'>"+list[i].sex+"</td>"+
								"<td style='width:5%;height:2em;'>"+list[i].phone+"</td>"+
								"<td style='width:20%;height:2em;'>"+list[i].ip+"</td>"+
								"<td style='width:10%;height:2em;'>"+list[i].bir+"</td>"+
								"<td style='width:10%;height:2em;'>"+list[i].daquusername+"</td>"+
								"<td style='width:10%;height:2em;'>"+list[i].mdaqu+"</td>"+
								"</tr>");
							}
						}else{
							var inits=listnum*pageone-listnum;
							for(var i=inits;i<listnum*pageone;i++){
								$("#tab2").append("<tr align='center' height='2em'>"+
								"<td style='width:2%;'><input name='A01' type='checkbox' value='"+list[i].bianhao+"' onclick='abc(\"A01\",\"cb\")'/></td>"+
								"<td style='width:5%;height:2em;' name='bianhaonames'>"+list[i].bianhao+"</td>"+
								"<td style='width:5%;height:2em;'><a href='<%=path %>/Fdetails.do?bianhao="+list[i].bianhao+"'>"+list[i].uname+"</a></td>"+
								"<td style='width:5%;height:2em;'>"+list[i].age+"</td>"+
								"<td style='width:5%;height:2em;'>"+list[i].sex+"</td>"+
								"<td style='width:5%;height:2em;'>"+list[i].phone+"</td>"+
								"<td style='width:20%;height:2em;'>"+list[i].ip+"</td>"+
								"<td style='width:10%;height:2em;'>"+list[i].bir+"</td>"+
								"<td style='width:10%;height:2em;'>"+list[i].daquusername+"</td>"+
								"<td style='width:10%;height:2em;'>"+list[i].mdaqu+"</td>"+
								"</tr>");
							}
						}
					}
				});
			}
			//下一页
			function downpage(){
				var pageone=parseInt($("#pageone").html());//当前页
				var pagenum=parseInt($("#pagenum").html());//总页数
				if(pageone<pagenum){
					$("#pageone").html(pageone+1);//当前页
				}
				sub();
			}
			//上一页
			function uppage(){
				var pageone=parseInt($("#pageone").html());//当前页
				var pagenum=parseInt($("#pagenum").html());//总页数
				if(pageone>1){
					$("#pageone").html(pageone-1);//当前页
				}
				sub();
			}
			//首页
			function shouye(){
				$("#pageone").html(1);
				sub();
			}
			//尾页
			function weiye(){
				var pagenum=parseInt($("#pagenum").html());//总页数
				$("#pageone").html(pagenum);
				sub();
			}
			//跳转页
			function returnpage(){
				var re=$("#returnpage").val();
				if(re.length>0){
					var pao=parseInt(re);
					var a=parseInt($("#pagenum").html());
					if(pao>a){
						$("#pageone").html(a);//总页数);
					}else if(pao<1){
						$("#pageone").html(1);
					}else{
						$("#pageone").html(pao);
					}
					sub();
				}
			}
			//清空
			function cempty(){
				$("#look_bianhao").val("");
				$("#look_name").val("");
				$("#look_phone").val("");
				$("#look_ip").val("");
			}
			//删除
			function removes(){
				if("<%=shanchu %>"=="Y"){
					var str="";
					var checkeds=document.getElementsByName("A01");
		           		for(var i=0;i<checkeds.length;i++){
							if(checkeds[i].checked){
								str+=checkeds[i].value+";";
								 flag=true;     // 表示复选框有被选中的
							}
						}
						if(flag){
							if (confirm("你确定删除吗？")) {  
								window.location.href="<%=path %>/dele.do?str="+str;  // 提交后台
			        		}
						}
				}else{
					alert("您没有权限!");
				}
			}
			//复选框全选
			function dj(name,value){
					var inputs=document.getElementsByName(name);
					for(var i=0;i<inputs.length;i++){
						inputs[i].checked=value;
					}
				}
			function abc(name,id){
					var name=document.getElementsByName(name);
					var id=document.getElementById(id);
					for(var i=0;i<name.length;i++){
						if(name[i].checked){
							id.checked=true;
						}else{
							id.checked=false;
							break;
						}
					}
				}
	</script>
  </body>
</html>
