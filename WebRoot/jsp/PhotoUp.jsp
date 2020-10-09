<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body style="margin-top:-2%">
	<script type="text/javascript">
		function onc(){
		}
	</script>
		<form action="" method="get">
			<table  border="0">
				<tr>
					<td>选择图片:<input type="file" id="input" name="input" onchange="onc()" />
					<input type="submit" value="上传图片"/></td>
				</tr>
			</table>
			<hr>
		</form>
</body>
</html>
