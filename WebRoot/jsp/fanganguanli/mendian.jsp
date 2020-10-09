<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
  <style type="text/css">
  	a{
  		text-decoration:none;
  		color:blue;
  	}
  	#tb{
  		background-color: rgb(204, 204, 204);
  	}
  	.label{
  		text-align:center;
  		font-weight:bold;
  		border:1px;
  		height:2em;
  	}
  </style>
  </head>
  <body>
	 <form action="<%=path %>/mendainload.do" method="post" >
	    <table id="tb" width="100%" align="left" style="text-align:left;border:2px  BLACK;">
		  <tr>
		    <td class="label">所属大区:<select id="daqu" name="mdaqu"></select></td>
		    <td class="label">门店店长:<input type="text" name="mname" maxlength="20"  value="" /><span class="require-field"></span></td>
		    <td class="label">门店编号:<input type="text" name="mbianhao" maxlength="20" value=""/><span class="require-field"></span></td>
		    <td class="label">手机号码:<input type="text" name="mphone" maxlength="20" value=""/><span class="require-field"></span></td>
		    <td class="label">门店地址:<input type="text" name="mip" maxlength="20" value=""/><span class="require-field"></span></td>
		  </tr>
		  <tr><td>&nbsp;</td></tr>
		  <tr>
		    <td colspan="5" align="center">
		      <input type="submit" value="提 交 " class="button" />&nbsp;&nbsp;&nbsp;
		      <input type="reset"  value="重 置 " class="button" />
		    </td>
		  </tr>
		</table>
	</form>
	 <table id="sec" width="100%" align="left" style="text-align:left;">
		  <tr bgcolor="#708090">
		    <td class="label">门店店长</td>
		    <td class="label">门店编号</td>
		    <td class="label">手机号码</td>
		    <td class="label">门店地址</td>
		    <td class="label">所属大区</td>
		  </tr>
	 </table>
  </body>
  <script type="text/javascript">
	var daquusername="";
	var daquphone="";
	var daqubianhao="";
	var daquip="";
	var daquzhiwei="";
  	$.ajax({
  		type:"post",
		url:"<%=path %>/daquselects.do?&daquusername="+daquusername+"&daquphone="+daquphone+"&daqubianhao="+daqubianhao+"&daquip="+daquip+"&daquzhiwei="+daquzhiwei,
		success:function(data){
			var list=eval(data);
			$("#daqu").append("<option>--请选择--</option>");
			for(var i=0;i<list.length;i++){
				$("#daqu").append("<option>"+list[i].daquusername+"</option>");
			}
		}
  	});
  	$(se());
  	function se(){
  		$.ajax({
  			type:"post",
  			url:"<%=path %>/selmendian.do",
  			success:function(data){
  				var list=eval(data);
  				for(var i=0;i<list.length;i++){
  					if(i%2==0){
	  					$("#sec").append(" <tr bgcolor='#EEE8AA'><td class='label'><a href='<%=path %>/mxiugaiyemian.do?mid="+list[i].mid+"'>"
	  					+list[i].mname+"</a></td><td class='label'>" 
	  					+list[i].mbianhao+"</td><td class='label'>"
	  					+list[i].mphone+"</td><td class='label'>"
	  					+list[i].mip+"</td>"+"<td class='label'>"
	  					+list[i].mdaqu+"</td></tr>");
  					}else{
  						$("#sec").append(" <tr bgcolor='#FFE4C4'><td class='label'><a href='<%=path %>/mxiugaiyemian.do?mid="+list[i].mid+"'>"
	  					+list[i].mname+"</a></td><td class='label'>" 
	  					+list[i].mbianhao+"</td><td class='label'>"
	  					+list[i].mphone+"</td><td class='label'>"
	  					+list[i].mip+"</td>"+"<td class='label'>"
	  					+list[i].mdaqu+"</td></tr>");
  					}
  				}
  				$("#sec").append(" <tr bgcolor='#FFE4C4'><td class='label' colspan='5' align='left'>数量:"+(list.length)+"</td></tr>");
  			}
  		});
  	}
  	
  </script>
</html>
