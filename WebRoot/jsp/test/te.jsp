<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'te.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <div class="main-div">
	<form method="post" action="http://www.jiyoohui.com/admin/users.php?act=add" name="theForm" onsubmit="return validate()">
	<table width="100%" >
	  <tr>
	    <td class="label">会员名称:</td>
	    <td><input type="text" name="username" maxlength="60" value="" /><span class="require-field">*</span></td>
	  </tr>
	    <tr>
	    <td class="label">邮件地址:</td>
	    <td><input type="text" name="email" maxlength="60" size="40" value="" /><span class="require-field">*</span></td>
	  </tr>
	    <tr>
	    <td class="label">登录密码:</td>
	    <td><input type="password" name="password" maxlength="20" size="20" /><span class="require-field">*</span></td>
	  </tr>
	  <tr>
	    <td class="label">确认密码:</td>
	    <td><input type="password" name="confirm_password" maxlength="20" size="20" /><span class="require-field">*</span></td>
	  </tr>
	      <tr>
	    <td class="label">所属门店:</td>
	    <td><select name="daqu" onchange="get_mendian(this.value);">
	            <option value="佟佳星"  >佟佳星</option>
	            <option value="刘燕美"  >刘燕美</option>
	            <option value="A001"  >自运营平台</option>
	            <option value="段德意"  >段德意</option>
	            <option value="安雪亮"  >安雪亮</option>
	            <option value="李本君"  >李本君</option>
	            <option value="李鹏飞"  >李鹏飞</option>
	            <option value="杨永贺"  >杨永贺</option>
	            <option value="刘炳政"  >刘炳政</option>
	            <option value="汝贵战"  >汝贵战</option>
	            <option value="张俊平"  >张俊平</option>
	            <option value="盛伟彬"  >盛伟彬</option>
	            <option value="王力强"  >王力强</option>
	            <option value="时廷亮"  >时廷亮</option>
	        </select>
	  <select name="mendian" id="mendian">
	              <option value="JY00026"  >靳昊楠-河北保定</option>
	              <option value="JY00016"  >靖树林-河北保定</option>
	              <option value="JY00017"  >佟佳星-保定易县</option>
	              <option value="JY00018"  >王金玉-易县塘湖</option>
	          </select>
	    </td>
	  </tr>
	    <tr>
	    <td class="label">会员编号:</td>
	    <td><input type="text" name="huiyuan" size="20" value="" /><span class="require-field">*</span> 例如：C002</td>
	  </tr>
	  <tr>
	    <td class="label">会员等级:</td>
	    <td><select name="user_rank">
	      <option value="0">非特殊等级</option>
	          </select></td>
	  </tr>
	  <tr>
	    <td class="label">性别:</td>
	    <td><input type="radio" name="sex" value="0" checked>&nbsp;保密&nbsp;<input type="radio" name="sex" value="1">&nbsp;男&nbsp;<input type="radio" name="sex" value="2">&nbsp;女&nbsp;</td>
	  </tr>
	  <tr>
	    <td class="label">出生日期:</td>
	    <td><select name="birthdayYear"><option value="1917">1917</option><option value="1918">1918</option><option value="1919">1919</option><option value="1920">1920</option><option value="1921">1921</option><option value="1922">1922</option><option value="1923">1923</option><option value="1924">1924</option><option value="1925">1925</option><option value="1926">1926</option><option value="1927">1927</option><option value="1928">1928</option><option value="1929">1929</option><option value="1930">1930</option><option value="1931">1931</option><option value="1932">1932</option><option value="1933">1933</option><option value="1934">1934</option><option value="1935">1935</option><option value="1936">1936</option><option value="1937">1937</option><option value="1938">1938</option><option value="1939">1939</option><option value="1940">1940</option><option value="1941">1941</option><option value="1942">1942</option><option value="1943">1943</option><option value="1944">1944</option><option value="1945">1945</option><option value="1946">1946</option><option value="1947">1947</option><option value="1948">1948</option><option value="1949">1949</option><option value="1950">1950</option><option value="1951">1951</option><option value="1952">1952</option><option value="1953">1953</option><option value="1954">1954</option><option value="1955">1955</option><option value="1956">1956</option><option value="1957">1957</option><option value="1958">1958</option><option value="1959">1959</option><option value="1960">1960</option><option value="1961">1961</option><option value="1962">1962</option><option value="1963">1963</option><option value="1964">1964</option><option value="1965">1965</option><option value="1966">1966</option><option value="1967">1967</option><option value="1968">1968</option><option value="1969">1969</option><option value="1970">1970</option><option value="1971">1971</option><option value="1972">1972</option><option value="1973">1973</option><option value="1974">1974</option><option value="1975">1975</option><option value="1976">1976</option><option value="1977">1977</option><option value="1978">1978</option><option value="1979">1979</option><option value="1980">1980</option><option value="1981">1981</option><option value="1982">1982</option><option value="1983">1983</option><option value="1984">1984</option><option value="1985">1985</option><option value="1986">1986</option><option value="1987">1987</option><option value="1988">1988</option><option value="1989">1989</option><option value="1990">1990</option><option value="1991">1991</option><option value="1992">1992</option><option value="1993">1993</option><option value="1994">1994</option><option value="1995">1995</option><option value="1996">1996</option><option value="1997">1997</option><option value="1998">1998</option><option value="1999">1999</option><option value="2000">2000</option><option value="2001">2001</option><option value="2002">2002</option><option value="2003">2003</option><option value="2004">2004</option><option value="2005">2005</option><option value="2006">2006</option><option value="2007">2007</option><option value="2008">2008</option><option value="2009">2009</option><option value="2010">2010</option><option value="2011">2011</option><option value="2012">2012</option><option value="2013">2013</option><option value="2014">2014</option><option value="2015">2015</option><option value="2016">2016</option><option value="2017">2017</option><option value="2018">2018</option></select>&nbsp;<select name="birthdayMonth"><option value="1">01</option><option value="2">02</option><option value="3">03</option><option value="4">04</option><option value="5">05</option><option value="6">06</option><option value="7">07</option><option value="8">08</option><option value="9">09</option><option value="10">10</option><option value="11">11</option><option value="12">12</option></select>&nbsp;<select name="birthdayDay"><option value="1">01</option><option value="2">02</option><option value="3">03</option><option value="4">04</option><option value="5">05</option><option value="6">06</option><option value="7">07</option><option value="8">08</option><option value="9">09</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select></td>
	  </tr>
	  <tr>
	    <td class="label">信用额度:</td>
	    <td><input name="credit_line" type="text" id="credit_line" value="0" size="10" /></td>
	  </tr>
	    <tr>
	    <td class="label">会员姓名:</td>
	    <td>
	    <input name="extend_field9" type="text" size="40" class="inputBg" value=""/>
	    </td>
	  </tr>
	    <tr>
	    <td class="label">地址:</td>
	    <td>
	    <input name="extend_field8" type="text" size="40" class="inputBg" value=""/>
	    </td>
	  </tr>
	    <tr>
	    <td class="label">手机:</td>
	    <td>
	    <input name="extend_field5" type="text" size="40" class="inputBg" value=""/>
	    </td>
	  </tr>
	        <tr>
	    <td colspan="2" align="center">
	      <input type="submit" value=" 确定 " class="button" />
	      <input type="reset" value=" 重置 " class="button" />
	      <input type="hidden" name="act" value="insert" />
	      <input type="hidden" name="id" value="" />    </td>
	  </tr>
	</table>
	</form>
	</div>
  </body>
</html>
