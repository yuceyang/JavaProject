<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<link rel="stylesheet"
		href="<%=path %>/js/EasyUI-1.5.1/themes/default/easyui.css" type="text/css"></link>
  	<style type="text/css">
  		table{
    		border-collapse:collapse;border:none;
    		table-layout: fixed;
			word-wrap:break-word;
    	}
    	td{
	    	border:1px solid black;
    	}
  		#table tr td{
  			width:9.09%;
  			height:3em;
  			text-align:center;
  		}
  		#table tr td input{
  			width:100%;
  		}
  		input{
  			border:none;
  			height:100%;
  		}
  		textarea{
	    	overflow:auto;
	    	border:none;
	    	width:100%;
  			height:100%;
    	}
    	#look_list th{
    		width:8.09%;
    	}
    	.tb tr th{
    		width:8.09%;
  			height:10%;
  			text-align:center;
  			border:1px solid black;
    	}
    	.tb tr td{
    		width:8.09%;text-align:center;border:1px solid black;
    	}
  	
  	</style>
  	<script type="text/javascript">
  		
  	</script>
  </head>
  <body style="padding:0px">
  <!-- 提交录入面板 -->
		 <div id="p" class="easyui-panel" title="提交内容"
		    style="width:100%;height:100px;padding:10px;background:#fafafa;"
		    data-options="fit:true,border:false,collapsible:true,collapsed:true" 
		    >
		     <table id="table" align="center" width="100%">
		    	<tr id="trs">
			    	<td>档案编号</td>
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
		    </table>
	     	<table align="center" width="100%" style="text-align:center;margin-top:1em;">
		    	<tr>
			    	<td style="border:0px">
			    		<a onclick="insertable()" class="easyui-linkbutton" data-options="iconCls:'icon-more'">增加行</a>
			    	</td>
			    	<td style="border:0px">
			    		<a onclick="inser()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">提交</a>
			    	</td>
			    	<td style="border:0px">
			    		<a onclick="deleattr()" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除行</a>
			    	</td>
			    </tr>
		 	</table>	
		</div>
		
  <!-- 查询面板 -->		
		<div id="p" class="easyui-panel" title="查询项"
		    style="width:100%;padding:0px;background:#fafafa;"
		    data-options="fit:true,border:false,collapsible:true,collapsed:false"
		    >
		    <div style="background-color:PapayaWhip">
			    <table>
					<tr>
						<td  style="border:0px">&nbsp;输入编号:<input id="lbianhao" style="text-align:center;border:1px solid black;-moz-border-radius: 5px;-webkit-border-radius: 5px; border-radius:5px;" size="20"/></td>
						<td  style="border:0px">
						&nbsp;
				    		<a onclick="lookthis()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
				    		<a onclick="bianhaonull()" class="easyui-linkbutton" data-options="iconCls:'icon-no'">清空</a>
						</td>
					</tr>
				</table>
			</div>
		    <table class="tb" width="100%" style="background-color:MediumTurquoise">
						<tr id="look_list">
							<th>档案编号</th>
							<th>拜访时间</th>
							<th>拜访目的</th>
							<th>方案使用情况</th>
							<th>采食状况</th>
							<th>粪便状况</th>
							<th>外观状况</th>
							<th>死亡解剖状况</th>
							<th>抗体检测报告</th>
							<th>其他</th>
							<th>结论</th>
						</tr>
			</table>
			<table class="tb" id="htb" width="100%" style="background-color:WhiteSmoke"></table>
		</div>
  	<form id="subform" method="post" action="<%=path %>/huifang.do" >
  		<textarea id="texts" name="bstr" style="display:none"></textarea>
    </form>
    <script type="text/javascript" charset="utf-8">
    	$(insertable());
    	//增加一行
  		function insertable(){
    		$("#table").append("<tr><td style=''><input type='text'/></td><td><input type='text'/></td><td><textarea></textarea></td><td><textarea></textarea></td><td><textarea></textarea></td><td><textarea></textarea></td><td><textarea></textarea></td><td><textarea></textarea></td><td><textarea></textarea></td><td><textarea></textarea></td><td><textarea></textarea></td></tr>");
    	}
    	//提交信息
    	function inser(){
    		var columnsize  = document.getElementById("table").getElementsByTagName("tr").length;
    		var bstr="";
    		for(var i=1;i<columnsize;i++){
	    		var a = document.getElementById("table").rows[i].cells[0].childNodes[0].value;
	    		var b  = document.getElementById("table").rows[i].cells[1].childNodes[0].value;
	    		var c  = document.getElementById("table").rows[i].cells[2].childNodes[0].value;
	    		var d  = document.getElementById("table").rows[i].cells[3].childNodes[0].value;
	    		var e  = document.getElementById("table").rows[i].cells[4].childNodes[0].value;
	    		var f  = document.getElementById("table").rows[i].cells[5].childNodes[0].value;
	    		var g  = document.getElementById("table").rows[i].cells[6].childNodes[0].value;
	    		var h  = document.getElementById("table").rows[i].cells[7].childNodes[0].value;
	    		var j  = document.getElementById("table").rows[i].cells[8].childNodes[0].value;
	    		var k  = document.getElementById("table").rows[i].cells[9].childNodes[0].value;
	    		var l  = document.getElementById("table").rows[i].cells[10].childNodes[0].value;
    			bstr+=a+" __"+b+" __"+c+" __"+d+" __"+e+" __"+f+" __"+g+" __"+h+" __"+j+" __"+k+" __"+l+" @@";
    		}
    		var t = document.getElementById("texts");
    		t.value = bstr;
	    	document.getElementById("subform").submit();
    	}
    	//删除一行
    	function deleattr(){
    		var columnarray = document.getElementById("table").getElementsByTagName("tr");
    		var columnsize  = document.getElementById("table").getElementsByTagName("tr").length;
    		if(columnsize>2){
    			columnarray[columnsize-1].parentNode.removeChild(columnarray[columnsize-1]);
    		}
    	}
    	//查询页面
    	$(lookthis());
    	function lookthis(){
    		$("#htb").html("");
  			var a=$("#lbianhao").val();
    		$.ajax({
    			type:"post",
				url:"<%=path %>/selecthuifang.do?bianhao="+a,
    			success:function(data){
    				var list=eval(data);
    				for(var i=0;i<list.length;i++){
    					$("#htb").append("<tr><td>"+list[i].bianhao+
    					"</td><td>"+list[i].return_visit_times+
    					"</td><td>"+list[i].return_visit_purpose+
    					"</td><td>"+list[i].return_visit_usage+
    					"</td><td>"+list[i].return_visit_Feedintake+
    					"</td><td>"+list[i].return_visit_feces+
    					"</td><td>"+list[i].return_visit_appearance+
    					"</td><td>"+list[i].return_visit_end+
    					"</td><td>"+list[i].return_visit_antibody+
    					"</td><td>"+list[i].return_visit_other+
    					"</td><td>"+list[i].return_visit_conclusion+
    					"</td></tr>");
    				}
    			}
    		});
    	}
    	//清空
    	function bianhaonull(){
    		$("#lbianhao").val("");
    	}
    </script>
	

  </body>
</html>
