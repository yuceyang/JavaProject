<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>basic</title>
    
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
			width:12%;
		}
		.col-wid{
			width:4%;
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
		height:2em;
		}
	</style>
  </head>
  <body style="margin-top:1px;padding:0px">
    <div id="p" class="easyui-panel"
			style="width:99%;height:30px;padding:0px;">
			
			<table class="easyui-datagrid" fit="true" width="100%">
					<thead fit="true" style="width:100%">
						<tr fit="true" id="look_list" style="width=:100%">
							<th data-options="field:'bianhao'" align="center" width="20%">编号:<input id="look_bianhao" fit="true"/></th>
							<th data-options="field:'name'" align="center" width="20%">姓名:<input id="look_name" fit="true"/></th>
							<th data-options="field:'ipone'" align="center" width="20%">电话:<input id="look_phone" fit="true"/></th>
							<th data-options="field:'ip'" align="center" width="20%">地址:<input id="look_ip" fit="true"/></th>
							<th data-options="field:'sub'" align="center" width="18%">
							<font>
							<a onclick="sub()" class="easyui-linkbutton" data-options="iconCls:'icon-search'" fit="true">查询</a>
							<a onclick="cempty()" class="easyui-linkbutton" data-options="iconCls:'icon-no'" fit="true">清空</a> 
							<a onclick="removes()" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" fit="true">删除</a> 
							</font>
							</th>
						</tr>
					</thead>
				</table>
		</div>
		<table style="border-collapse:collapse;border:none;width:100%;" id="tab" align="center" fit="true">
			<tr id="onetr" style="background-color:MediumTurquoise">
				<th class="col-wid" ><input type="checkbox" id="cb" onclick="dj('A01',this.checked)"></th>
				<th class="cl">编号</th>
				<th class="cl">姓名</th>
				<th class="cl">年龄</th>
				<th class="cl">性别</th>
				<th class="cl">电话</th>
				<th class="cl">住址</th>
				<th class="cl">身份证号</th>
				<th class="cl">功能</th>
			</tr>
		</table>
		<table style="border-collapse:collapse;border:none;width:100%;" id="tab2" align="center" fit="true">
		</table>
		<script type="text/javascript">
			$(sub());
			function sub(){
				$("#tab2").html("");
				var b=$("#look_bianhao").val();
				var n=$("#look_name").val();
				var i=$("#look_phone").val();
				var ip=$("#look_ip").val();
				var str=b+" ,"+n+" ,"+i+" ,"+ip+" ,";
				$.ajax({
					type:"post",
					url:"<%=path %>/jibencoll.do?bianhao="+b+"&uname="+n+"&phone="+i+"&uip="+ip,
					success:function(data){
						var list=eval(data);
						for(var i=0;i<list.length;i++){
							$("#tab2").append("<tr align='center'>"+
							"<td class='col-wid'><input name='A01' type='checkbox' value='"+list[i].bianhao+"' onclick='abc(\"A01\",\"cb\")'/></td>"+
							"<td class='cl' name='bianhaonames'>"+list[i].bianhao+"</td>"+
							"<td class='cl'>"+list[i].uname+"</td>"+
							"<td class='cl'>"+list[i].age+"</td>"+
							"<td class='cl'>"+list[i].sex+"</td>"+
							"<td class='cl'>"+list[i].phone+"</td>"+
							"<td class='cl'>"+list[i].ip+"</td>"+
							"<td class='cl'>"+list[i].bir+"</td>"+
							"<td class='cl'>"+
							"<a href='<%=path %>/Fdetails.do?bianhao="+list[i].bianhao+"'>详情</a>"+
							"</td>"+
							"</tr>");
						}
						$("#tab2").append("<tr><td colspan='9'>&nbsp;&nbsp;数量:&nbsp;"+list.length+
						"&nbsp;&nbsp;<a href='<%=path%>/excelfileout.do?list="+str+"'>导出全部</a></td></tr>");
					}
				});
			}
			
/*			
			function deletetemplate(){
				var TemplateName=tdfirst;
				alert(111);
				$.ajax({
					type:"POST",
					url:"delTemplate?",
					data:{"filename" : TemplateName,
							"FClassTypeID":FClassTypeID,
			  				"FID":FID},
					dataType:"json",
					success:function(data){
						if(data.resultCode==1){
							alert("删除成功");
						}else{alert("删除失败");}
					}
				});
			
			}
	*/		
	
	
	
			
			//清空
			function cempty(){
				$("#look_bianhao").val("");
				$("#look_name").val("");
				$("#look_phone").val("");
				$("#look_ip").val("");
			}
			//删除
			function removes(){
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
