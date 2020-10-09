<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<script type="text/javascript" charset="utf-8">
	$(t());
	//上传
	   function upload(){
			var upuser=document.getElementsByName("uname")[0].value.split();
			var filename=document.getElementsByName("file")[0].value.split();
			if(upuser=="" || upuser==null){
				alert("上传人不能为空");
			}else if(filename=="" || filename==null){
				alert("上传文件不能为空");
			}else{
				document.getElementsByName("formtable")[0].action="<%=path %>/fileupload.do?upuser="+upuser+"&filename="+filename;
				document.getElementsByName("formtable")[0].submit();
			}
		}
		
		function t(){
			$.ajax({
				url:"<%=path %>/traversal.do",
				type:"post",
				success:function(data){
					var list=eval(data);
					for(var i=0;i<list.length;i++){
						$("#tr1").append("<tr><td>"+list[i].filename+"</td>"+
						"<td align='center'>"+list[i].update+"</td>"+
						"<td align='center'>"+list[i].upuser+"</td>"+
						"<td align='center'>"+
							"<a href='<%=path%>/filedown.do?filename="+list[i].filename+"'>下载</a>"+
						"</td></tr>");
					}
				}
			});
		}
		
	</script>
    <style>
	    a{
	    	text-decoration:none;
	    	color:blue;
	    }
		*{ font-family: "宋体"; font-size: 14px }
		.filetable{
			border-collapse:collapse;
			border:none;
			width:100%;
		}
		.filetable tr{
			height:2em;
		}
		.filetable tr th{
			border:outset  1px;
		}
		.filetable tr td{
			border:outset  1px;
		}
	</style>
  </head>
  <body>					
  		<form method="post" enctype="multipart/form-data" name="formtable">
		 <table border="0" align="center">
		  <tr>
		   <td>上传人:</td>
		   <td>
		    <input name="uname" type="text" id="userup" />
		   </td>
		   <td>上传文件:</td>
		   <td><input name="file" type="file" id="file"/></td>
		   <td>&nbsp;</td>
		   <td>
		    <input type="submit" name="submit" value="提交" onclick="upload()">
		    <input type="reset" name="reset" value="重置">
		   </td>
		  </tr>   
		 </table>
		</form>
		 <hr width="100%">
		 <table class="filetable" id="tr1">
		 	<tr>
		 		<th>文件名</th>
		 		<th>上传时间</th>
		 		<th>上传人</th>
		 		<th>功能</th>
		 	</tr>
		 </table>
  </body>
</html>
