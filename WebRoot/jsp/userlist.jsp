<%@page import="com.jiyoo.util.StringUtf"%>
<%@page import="com.jiyoo.vo.BigPackage"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    	BigPackage bp=(BigPackage)session.getAttribute("bp");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     <style type="text/css">
    table{
    	border-collapse:collapse;border:none;
    }
    input{
    	text-align: center;
    	font-size:16;
    	line-height: 30px;
    }
    .m td{
    	height:5em;
    	width:10em;
    }
    .k_ip{
    	width:20em;
    }
    td{
    	height:60px;
    	border:1px solid black;
    }
    .k td{
    	height:32px;
    	border:1px solid black;
    }
    .k input{
    	height:30px;
    	border:none;
    }
    .m input{
    	width:160px;
    	height:98px;
    	border:none;
    }
	.m_t div input{
	    width:160px;
	    height:25px;
	    }
	.s1{
    	height:3em;
    	width:10em;
    }
    .s2{
    	height:3em;
    	width:25em;
    }
    .s2 input{
    	border:0px;
    	height:3em;
    	width:25em;
    }
    .report input{
    	border:0px;
    	height:10em;
    	width:35em;
    }
    .cost_comparison input{
    	height:3em;
    	width:5em;	
    	border:0px;
    }
    textarea{
    	overflow:auto;
    	border:none;
    }
    .Comprehensive_benefits{
    	overflow:auto;
    	border:1px solid black;
    }
    .yf input{
    	border:0px;
    	height:1em;
    	width:7em;
    }
    .yf_inp{
    	border:1px solid;
    	border-left:none;
    	border-right:none;
    }
    .k_tongdian input{
    	border:0px;
    	height:1em;
    	width:40em;
    }
    .yf_inps input{
    	border:0px;
    	height:6em;
    }
    .p_g td input{
    	border:0px;
    	height:4em;
    }
    .divinps div input{
    	height:2em;
    }
    .cost_comparison tr td{
    	height:3em;
    }
    #huifangtable{
    	width:100%;
    	height:2em;
    }
    #huifangtable tr td{
    	width:10%;
    	text-align:center;
    	height:1em;
    }
   .returnlist{
   		width:100%;
    	text-align:center;
   }
   .returnlist tr td{
   		width:10%;
    	text-align:center;
   }
    </style>
  <script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
  </head>
  <body>
     <!-- 基本信息 -->
	  <form name="ufroms" action="<%=path %>/UserUpdate.do?oldbianhao=${bp.getBianhao()}" method="post">
	  		<h1 align="center">(1)客户基本信息</h1>
	  		<div align="center">
	  			招商经理:
		  		<select id="seledaqu" name="daquusername" onblur="sele()">
		  			<option>${bp.getDaquusername()}</option>
		  		</select>
		  		门店经理:
		  		<select id="selemendian" name="mdaqu">
		  			<option>${bp.getMdaqu()}</option>
		  		</select>
	  		</div>
		  		<br>
			<table align="center" class="k" >
				<tr>
					<td  align="center">档案编号<span style="color:red">&nbsp;*</span></td>
					<td>
						<input type="text" class="k_ip" id="bianhao" name="bianhao" onchange="yesorno()" value="${bp.getBianhao()}"/>
					</td>
					<td  align="center">猪场名称</td>
					<td>
						<input type="text" class="k_name" name="pigfactoryname"  value="${bp.getPigfactoryname()}" />
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">客户姓名</td><td><input type="text" class="k_ip" name="uname" value="${bp.getUname() }" /></td>
					<td>联系电话</td><td><input type="text" class="k_phone" name="phone" value="${bp.getPhone() }"/></td>
				</tr>
				<tr align="center">
					<td class="t_left">年龄</td><td><input type="text" class="k_ip" name="age" value="${bp.getAge() }" /></td>
					<td>生日</td><td><input type="text" class="k_bir" name="bir" value="${bp.getBir() }"/></td>
				</tr>
				<tr align="center">
					<td class="t_left">微信号</td>
					<td><input type="text" name="weixin" class="k_ip" value="${bp.getWeixin() }"/></td>
					<td>性别</td>
					<td align="center">
					<input name="sex" value="${bp.getSex() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">详细地址</td>
					<td><input type="text" name="ip" class="k_ip" value="${bp.getIp() }"/></td>
					<td>规模</td>
					<td align="center">
					<input name="guimo" value="${bp.getGuimo() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">猪舍建筑时间</td>
					<td><input type="text" name="pigbuildtime" class="k_ip" value="${bp.getPigbuildtime() }"/></td>
					<td>育肥舍面积</td>
					<td align="center">
					<input name="yufeiarea"  value="${bp.getYufeiarea() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">空怀母猪大栏个数</td>
					<td><input name="justnumber" class="k_ip"  value="${bp.getJustnumber() }" /></td>
					<td>空怀母猪大栏面积</td>
					<td align="center">
					<input name="justarea"  value="${bp.getJustarea() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">空怀母猪定位栏个数</td>
					<td><input name="justsownumber" class="k_ip"  value="${bp.getJustsownumber() }" /></td>
					<td>母猪产床数</td>
					<td align="center">
					<input name="sowtablenumber"  value="${bp.getSowtablenumber() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">保育床个数</td>
					<td><input name="baoyubednumber" class="k_ip"  value="${bp.getBaoyubednumber() }" /></td>
					<td>冬季取暖设施</td>
					<td align="center">
					<input name="winterheating"  value="${bp.getWinterheating() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">保育床面积</td>
					<td><input name="baoyuarea" class="k_ip"  value="${bp.getBaoyuarea() }" /></td>
					<td>是否高床</td>
					<td align="center">
					<input name="baoyuhighbed"  value="${bp.getBaoyuhighbed() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">锅炉规模</td>
					<td><input name="boilerscale" class="k_ip"  value="${bp.getBoilerscale() }" /></td>
					<td>产房取暖方法</td>
					<td align="center">
					<input name="roomheatingmethod"  value="${bp.getRoomheatingmethod() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">保育舍取暖方法</td>
					<td><input name="baoyuheatingmethod" class="k_ip"  value="${bp.getBaoyuheatingmethod() }" /></td>
					<td>育肥舍取暖方法</td>
					<td align="center">
					<input name="yufeiheatingmethod"  value="${bp.getYufeiheatingmethod() }"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">猪场规模是否有扩展空间</td>
					<td><input name="pigfarmsorbig" class="k_ip"  value="${bp.getPigfarmsorbig() }" /></td>
					<td>猪场生产是否有扩展计划</td>
					<td align="center">
					<input name="orplans"  value="${bp.getOrplans() }"/>
					</td>
				</tr>
			</table>
		
<!-- 母猪基本信息 -->	
			<h1 align="center">(2.1)母猪基本信息</h1>
			<table align="center" class="m">
				<tr align="center">
					<td>阶段</td>
					<td>存栏数量</td>
					<td>饲料品种</td>
					<td>饲料价格/kg</td>
					<td>疫苗名称</td>
					<td>生产厂家</td>
					<td>保健药品</td>
				</tr>
				<tr align="center" >
					<td>怀孕母猪</td>
					<td><input type="text" name="h_number" value="${bp.getH_number() }"/></td>
					<td><input type="text" name="h_siliaopinzhong" value="${bp.getH_siliaopinzhong() }"/></td>
					<td><input type="text" name="h_rmb" value="${bp.getH_rmb() }"/></td>
				<!-- 怀孕母猪 疫苗名称 -->
					<td class="m_t">
						<div><input type="text" border="1" name="h_y_name_1" value="${bp.getH_y_name_1() }"/></div>
						<div style="border:1px solid black;border-left:none;border-right:none;">
							<input type="text" name="h_y_name_2" value="${bp.getH_y_name_2() }"/>
						</div>
						<div><input type="text" name="h_y_name_3" value="${bp.getH_y_name_3() }"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="h_y_name_4" value="${bp.getH_y_name_4() }"/>
						</div>
					</td>
				<!-- 怀孕母猪 生产厂家 -->
					<td class="m_t">
						<div><input type="text" border="1" name="h_factory_1" value="${bp.getH_factory_1() }"/></div>
						<div style="border:1px solid black;border-left:none;border-right:none;">
							<input type="text" name="h_factory_2" value="${bp.getH_factory_2() }"/>
						</div>
						<div><input type="text" name="h_factory_3" value="${bp.getH_factory_3() }"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="h_factory_4" value="${bp.getH_factory_4() }"/>
						</div>
					</td>
				<!-- 怀孕母猪 保健药品 -->
					<td class="m_t">
						<div><input type="text" border="1" name="h_b_drug_1" value="${bp.getH_b_drug_1() }"/></div>
						<div style="border:1px solid black;border-left:none;border-right:none;">
							<input type="text" name="h_b_drug_2" value="${bp.getH_b_drug_2() }"/>
						</div>
						<div><input type="text" name="h_b_drug_3" value="${bp.getH_b_drug_3() }"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="h_b_drug_4" value="${bp.getH_b_drug_4() }"/>
						</div>
					</td>
				</tr>
				<tr align="center">
					<td>哺乳母猪</td>
					<td><input type="text" name="b_number" value="${bp.getB_number() }"/></td>
					<td><input type="text" name="b_siliaopinzhong" value="${bp.getB_siliaopinzhong() }"/></td>
					<td><input type="text" name="b_rmb" value="${bp.getB_rmb() }"/></td>
				<!-- 哺乳母猪 疫苗名称 -->
					<td class="m_t">
						<div><input type="text" border="1" name="b_y_name_1" value="${bp.getB_y_name_1() }"/></div>
						<div style="border:1px solid;border-left:none;border-right:none;">
							<input type="text" name="b_y_name_2" value="${bp.getB_y_name_2() }"/>
						</div>
						<div><input type="text" name="b_y_name_3" value="${bp.getB_y_name_3() }"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="b_y_name_4" value="${bp.getB_y_name_4() }"/>
						</div>
					</td>
				<!-- 哺乳母猪 生产厂家 -->
					<td class="m_t">
						<div><input type="text" border="1" name="b_factory_1" value="${bp.getB_factory_1() }"/></div>
						<div style="border:1px solid;border-left:none;border-right:none;">
							<input type="text" name="b_factory_2" value="${bp.getB_factory_2() }"/>
						</div>
						<div><input type="text" name="b_factory_3" value="${bp.getB_factory_3() }"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="b_factory_4" value="${bp.getB_factory_4() }"/>
						</div>
					</td>
				<!-- 哺乳母猪 保健药品 -->
					<td class="m_t">
						<div><input type="text" border="1" name="b_b_drug_1" value="${bp.getB_b_drug_1() }"/></div>
						<div style="border:1px solid;border-left:none;border-right:none;">
							<input type="text" name="b_b_drug_2" value="${bp.getB_b_drug_2() }"/>
						</div>
						<div><input type="text" name="b_b_drug_3" value="${bp.getB_b_drug_3() }"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="b_b_drug_4" value="${bp.getB_b_drug_4() }"/>
						</div>
					</td>
				</tr>
			</table>
			<br>
			
<!-- 母猪饲养成绩 -->
		<h1 align="center">(2.2)母猪饲养成绩</h1>
			<table align="center" class="S">
				<tr align="center">
					<td class="s1" >断奶后配种天数</td>
					<td class="s2"><input name="sy_date" value="${bp.getSy_date() }"/></td>
				</tr>
				<tr align="center">
					<td class="s1" >母猪配种分娩率</td>
					<td class="s2"><input name="sy_fenmian" value="${bp.getSy_fenmian() }"/></td>
				</tr>
				<tr align="center">
					<td class="s1">基础母猪年均产仔窝数</td>
					<td class="s2"><input name="sy_pingjun_number" value="${bp.getSy_pingjun_number() }"/></td>
				</tr>
				<tr align="center">
					<td class="s1">母猪窝均产活仔数</td>
					<td class="s2"><input name="sy_cunhuo_number" value="${bp.getSy_cunhuo_number() }"/></td>
				</tr>
				<tr align="center">
					<td class="s1">仔猪平均出生重/kg</td>
					<td class="s2"><input name="sy_jun_zhong" value="${bp.getSy_jun_zhong() }"/></td>
				</tr>
				<tr align="center">
					<td class="s1">产房哺乳仔猪成活率</td>
					<td class="s2"><input name="sy_cunhuo_lv" value="${bp.getSy_cunhuo_lv() }"/></td>
				</tr>
				<tr align="center">
					<td class="s1">平均断奶重</td>
					<td class="s2"><input name="sy_duannai_zhong" value="${bp.getSy_duannai_zhong() }"/></td>
				</tr>
			</table>
			<br>
<!-- --------------------------------!!!------------------------------------- -->
<!-- 育肥猪基本信息 -->	
		<h1 align="center">(2.3)育肥猪基本信息</h1>
			<table align="center" class="yf">
				<tr align="center">
					<td class="">阶段</td>
					<td class="">饲料品种</td>
					<td class="">饲料品牌</td>
					<td class="">饲料价格</td>
					<td class="">疫苗名称</td>
					<td class="">生产厂家</td>
					<td class="">保健药</td>
				</tr>
				<tr align="center">
					<td>哺乳仔猪</td>
					<td class="yf_inps"><input name="buruzizhu_siliaopinzhong" value="${bp.getBuruzizhu_siliaopinzhong() }"/></td>
					<td class="yf_inps"><input name="buruzizhu_siliaopinpai" value="${bp.getBuruzizhu_siliaopinpai() }"/></td>
					<td class="yf_inps"><input name="buruzizhu_siliaojiage" value="${bp.getBuruzizhu_siliaojiage() }"/></td>
					<td class="divinps">
						<div><input name="buruzizhu_yimiaomingcheng_1" value="${bp.getBuruzizhu_yimiaomingcheng_1() }"/></div>
						<div class="yf_inp"><input name="buruzizhu_yimiaomingcheng_2" value="${bp.getBuruzizhu_yimiaomingcheng_2() }"/></div>
						<div><input name="buruzizhu_yimiaomingcheng_3" value="${bp.getBuruzizhu_yimiaomingcheng_3() }"/></div>
					</td>
					<td class="divinps">
						<div><input name="buruzizhu_shengchanchangjia_1" value="${bp.getBuruzizhu_shengchanchangjia_1() }"/></div>
						<div class="yf_inp"><input name="buruzizhu_shengchanchangjia_2" value="${bp.getBuruzizhu_shengchanchangjia_2() }"/></div>
						<div><input name="buruzizhu_shengchanchangjia_3" value="${bp.getBuruzizhu_shengchanchangjia_3() }"/></div>
					</td>
					<td class="divinps">
						<div><input name="buruzizhu_baojianyao_1" value="${bp.getBuruzizhu_baojianyao_1() }"/></div>
						<div class="yf_inp"><input name="buruzizhu_baojianyao_2" value="${bp.getBuruzizhu_baojianyao_2() }"/></div>
						<div><input name="buruzizhu_baojianyao_3" value="${bp.getBuruzizhu_baojianyao_3() }"/></div>
					</td>
				</tr>
				<tr align="center">
					<td class="" >保育猪</td>
					<td class="yf_inps"><input name="baoyuzhu_siliaopinzhong" value="${bp.getBaoyuzhu_siliaopinzhong() }"/></td>
					<td class="yf_inps"><input name="baoyuzhu_siliaopinpai" value="${bp.getBaoyuzhu_siliaopinpai() }"/></td>
					<td class="yf_inps"><input name="baoyuzhu_siliaojiage" value="${bp.getBaoyuzhu_siliaojiage() }"/></td>
					<td class="divinps">
						<div><input name="baoyuzhu_yimiaomingcheng_1" value="${bp.getBaoyuzhu_yimiaomingcheng_1() }"/></div>
						<div class="yf_inp"><input name="baoyuzhu_yimiaomingcheng_2" value="${bp.getBaoyuzhu_yimiaomingcheng_2() }"/></div>
						<div><input name="baoyuzhu_yimiaomingcheng_3" value="${bp.getBaoyuzhu_yimiaomingcheng_3() }"/></div>
					</td>
					<td class="divinps">
						<div><input name="baoyuzhu_shengchanchangjia_1" value="${bp.getBaoyuzhu_shengchanchangjia_1() }"/></div>
						<div class="yf_inp"><input name="baoyuzhu_shengchanchangjia_2" value="${bp.getBaoyuzhu_shengchanchangjia_2() }"/></div>
						<div><input name="baoyuzhu_shengchanchangjia_3" value="${bp.getBaoyuzhu_shengchanchangjia_3() }"/></div>
					</td>
					<td class="divinps">
						<div><input name="baoyuzhu_baojianyao_1" value="${bp.getBaoyuzhu_baojianyao_1() }"/></div>
						<div class="yf_inp"><input name="baoyuzhu_baojianyao_2" value="${bp.getBaoyuzhu_baojianyao_2() }"/></div>
						<div><input name="baoyuzhu_baojianyao_3" value="${bp.getBaoyuzhu_baojianyao_3() }"/></div>
					</td>
				</tr>
				<tr align="center">
					<td class="" >育肥猪</td>
					<td class="yf_inps"><input name="yufeizhu_siliaopinzhong" value="${bp.getYufeizhu_siliaopinzhong() }"/></td>
					<td class="yf_inps"><input name="yufeizhu_siliaopinpai" value="${bp.getYufeizhu_siliaopinpai() }"/></td>
					<td class="yf_inps"><input name="yufeizhu_siliaojiage" value="${bp.getYufeizhu_siliaojiage() }"/></td>
					<td class="divinps">
						<div><input name="yufeizhu_yimiaomingcheng_1" value="${bp.getYufeizhu_yimiaomingcheng_1() }"/></div>
						<div class="yf_inp"><input name="yufeizhu_yimiaomingcheng_2" value="${bp.getYufeizhu_yimiaomingcheng_2() }"/></div>
						<div><input name="yufeizhu_yimiaomingcheng_3" value="${bp.getYufeizhu_yimiaomingcheng_3() }"/></div>
					</td>
					<td class="divinps">
						<div><input name="yufeizhu_shengchanchangjia_1" value="${bp.getYufeizhu_shengchanchangjia_1() }"/></div>
						<div class="yf_inp"><input name="yufeizhu_shengchanchangjia_2" value="${bp.getYufeizhu_shengchanchangjia_2() }"/></div>
						<div><input name="yufeizhu_shengchanchangjia_3" value="${bp.getYufeizhu_shengchanchangjia_3() }"/></div>
					</td>
					<td class="divinps">
						<div><input name="yufeizhu_baojianyao_1" value="${bp.getYufeizhu_baojianyao_1() }"/></div>
						<div class="yf_inp"><input name="yufeizhu_baojianyao_2" value="${bp.getYufeizhu_baojianyao_2() }"/></div>
						<div><input name="yufeizhu_baojianyao_3" value="${bp.getYufeizhu_baojianyao_3() }"/></div>
					</td>
				</tr>
			</table>
			<br>
<!-- --------------------------------------------------------------------- -->
<!-- 育肥猪饲养成绩 -->
		<h1 align="center">(2.4)育肥猪饲养成绩</h1>
		<table align="center" class="yf">
				<tr align="center">
					<td class="" >阶段</td>
					<td class="">存栏数量</td>
					<td class="">存栏时间</td>
					<td class="">出(转)栏重量</td>
					<td class="">阶段成活率</td>
					<td class="">阶段料肉比</td>
				</tr>
				<tr align="center"  class="p_g">
					<td class="" >哺乳仔猪</td>
					<td class=""><input name="buruzizhu_cunlanshuliang" value="${bp.getBuruzizhu_cunlanshuliang() }"/></td>
					<td class=""><input name="buruzizhu_cunlanshijian" value="${bp.getBuruzizhu_cunlanshijian() }"/></td>
					<td class=""><input name="buruzizhu_chulanzhongliang" value="${bp.getBuruzizhu_chulanzhongliang() }"/></td>
					<td class=""><input name="buruzizhu_jieduanchenghuobi" value="${bp.getBuruzizhu_jieduanchenghuobi() }"/></td>
					<td class=""><input name="buruzizhu_jieduanliaoroubi" value="${bp.getBuruzizhu_jieduanliaoroubi() }"/></td>
				</tr>
				<tr align="center"  class="p_g">
					<td class="" >保育猪</td>
					<td class=""><input name="baoyuzhu_cunlanshuliang" value="${bp.getBaoyuzhu_cunlanshuliang() }"/></td>
					<td class=""><input name="baoyuzhu_cunlanshijian" value="${bp.getBaoyuzhu_cunlanshijian() }"/></td>
					<td class=""><input name="baoyuzhu_chulanzhongliang" value="${bp.getBaoyuzhu_chulanzhongliang() }"/></td>
					<td class=""><input name="baoyuzhu_jieduanchenghuobi" value="${bp.getBaoyuzhu_jieduanchenghuobi() }"/></td>
					<td class=""><input name="baoyuzhu_jieduanliaoroubi" value="${bp.getBaoyuzhu_jieduanliaoroubi() }"/></td>
				</tr>
				<tr align="center"  class="p_g">
					<td class="" >育肥猪</td>
					<td class=""><input name="yufeizhu_cunlanshuliang" value="${bp.getYufeizhu_cunlanshuliang() }"/></td>
					<td class=""><input name="yufeizhu_cunlanshijian" value="${bp.getYufeizhu_cunlanshijian() }"/></td>
					<td class=""><input name="yufeizhu_chulanzhongliang" value="${bp.getYufeizhu_chulanzhongliang() }"/></td>
					<td class=""><input name="yufeizhu_jieduanchenghuobi" value="${bp.getYufeizhu_jieduanchenghuobi() }"/></td>
					<td class=""><input name="yufeizhu_jieduanliaoroubi" value="${bp.getYufeizhu_jieduanliaoroubi() }"/></td>
				</tr>
		</table>
<!-- --------------------------------------------------------------------- -->
<!-- 客户痛点描述 -->
		<h1 align="center">(2.5)客户痛点描述</h1>
		<div align="center">
			<textarea class="Comprehensive_benefits" rows="10" cols="100" name="describe">${bp.getDescribes() }</textarea>			
		</div>
<!-- --------------------------------------------------------------------- -->
<!--猪场目前饲养成绩评估与综合效益测算 -->
		<h1 align="center">(3)猪场目前饲养成绩评估与综合效益测算</h1>
		<table align="center" class="yf">
				<tr align="center">
					<td class="" >生产指标</td>
					<td class="">优秀标准</td>
					<td class="" >实际指标</td>
					<td class="">提升潜力</td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >母猪配种分娩率</td>
					<td class=""><input name="muzhupeizhongfeimianlv_youxiubiaozhun" value="${bp.getMuzhupeizhongfeimianlv_youxiubiaozhun() }"/></td>
					<td class=""><input name="muzhupeizhongfeimianlv_shijizhibiao" value="${bp.getMuzhupeizhongfeimianlv_shijizhibiao() }"/></td>
					<td class=""><input name="muzhupeizhongfeimianlv_tishengqianli" value="${bp.getMuzhupeizhongfeimianlv_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >基础母猪年均产仔窝数</td>
					<td class=""><input name="nianjunchanzai_youxiubiaozhun" value="${bp.getNianjunchanzai_youxiubiaozhun() }"/></td>
					<td class=""><input name="nianjunchanzai_shijizhibiao" value="${bp.getNianjunchanzai_shijizhibiao() }"/></td>
					<td class=""><input name="nianjunchanzai_tishengqianli" value="${bp.getNianjunchanzai_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >母猪窝均产活仔数</td>
					<td class=""><input name="junchanhuozishu_youxiubiaozhun" value="${bp.getJunchanhuozishu_youxiubiaozhun() }"/></td>
					<td class=""><input name="junchanhuozishu_shijizhibiao" value="${bp.getJunchanhuozishu_shijizhibiao() }"/></td>
					<td class=""><input name="junchanhuozishu_tishengqianli" value="${bp.getJunchanhuozishu_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >产房哺乳仔猪成活率</td>
					<td class=""><input name="buruzizhuchenghuolv_youxiubiaozhun" value="${bp.getBuruzizhuchenghuolv_youxiubiaozhun() }"/></td>
					<td class=""><input name="buruzizhuchenghuolv_shijizhibiao" value="${bp.getBuruzizhuchenghuolv_shijizhibiao() }"/></td>
					<td class=""><input name="buruzizhuchenghuolv_tishengqianli" value="${bp.getBuruzizhuchenghuolv_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >仔猪初生重</td>
					<td class=""><input name="chushengzhong_youxiubiaozhun" value="${bp.getChushengzhong_youxiubiaozhun() }"/></td>
					<td class=""><input name="chushengzhong_shijizhibiao" value="${bp.getChushengzhong_shijizhibiao() }"/></td>
					<td class=""><input name="chushengzhong_tishengqianli" value="${bp.getChushengzhong_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >28日龄断奶仔猪重</td>
					<td class=""><input name="duannaizhong_youxiubiaozhun" value="${bp.getDuannaizhong_youxiubiaozhun() }"/></td>
					<td class=""><input name="duannaizhong_shijizhibiao" value="${bp.getDuannaizhong_shijizhibiao() }"/></td>
					<td class=""><input name="duannaizhong_tishengqianli" value="${bp.getDuannaizhong_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄成活率</td>
					<td class=""><input name="baoyuchenghuolv_youxiubiaozhun" value="${bp.getBaoyuchenghuolv_youxiubiaozhun() }"/></td>
					<td class=""><input name="baoyuchenghuolv_shijizhibiao" value="${bp.getBaoyuchenghuolv_shijizhibiao() }"/></td>
					<td class=""><input name="baoyuchenghuolv_tishengqianli" value="${bp.getBaoyuchenghuolv_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄重</td>
					<td class=""><input name="lingzhong_youxiubiaozhun" value="${bp.getLingzhong_youxiubiaozhun() }"/></td>
					<td class=""><input name="lingzhong_shijizhibiao" value="${bp.getLingzhong_shijizhibiao() }"/></td>
					<td class=""><input name="lingzhong_tishengqianli" value="${bp.getLingzhong_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪成活率</td>
					<td class=""><input name="yufeichenghuolv_youxiubiaozhun" value="${bp.getYufeichenghuolv_youxiubiaozhun() }"/></td>
					<td class=""><input name="yufeichenghuolv_shijizhibiao" value="${bp.getYufeichenghuolv_shijizhibiao() }"/></td>
					<td class=""><input name="yufeichenghuolv_tishengqianli" value="${bp.getYufeichenghuolv_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪上市日龄</td>
					<td class=""><input name="shangshiling_youxiubiaozhun" value="${bp.getShangshiling_youxiubiaozhun() }"/></td>
					<td class=""><input name="shangshiling_shijizhibiao" value="${bp.getShangshiling_shijizhibiao() }"/></td>
					<td class=""><input name="shangshiling_tishengqianli" value="${bp.getShangshiling_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年提供断奶仔猪头数(PSY)</td>
					<td class=""><input name="PSY_youxiubiaozhun" value="${bp.getPSY_youxiubiaozhun() }"/></td>
					<td class=""><input name="PSY_shijizhibiao" value="${bp.getPSY_shijizhibiao() }"/></td>
					<td class=""><input name="PSY_tishengqianli" value="${bp.getPSY_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年上市肉猪头数(MSY)</td>
					<td class=""><input name="MSY_youxiubiaozhun" value="${bp.getMSY_youxiubiaozhun() }"/></td>
					<td class=""><input name="MSY_shijizhibiao" value="${bp.getMSY_shijizhibiao() }"/></td>
					<td class=""><input name="MSY_tishengqianli" value="${bp.getMSY_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >全程饲料料肉比</td>
					<td class=""><input name="liaoroubi_youxiubiaozhun" value="${bp.getLiaoroubi_youxiubiaozhun() }"/></td>
					<td class=""><input name="liaoroubi_shijizhibiao" value="${bp.getLiaoroubi_shijizhibiao() }"/></td>
					<td class=""><input name="liaoroubi_tishengqianli" value="${bp.getLiaoroubi_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪防疫保健费用</td>
					<td class=""><input name="fangyifei_youxiubiaozhun" value="${bp.getFangyifei_youxiubiaozhun() }"/></td>
					<td class=""><input name="fangyifei_shijizhibiao" value="${bp.getFangyifei_shijizhibiao() }"/></td>
					<td class=""><input name="fangyifei_tishengqianli" value="${bp.getFangyifei_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头育肥猪防疫保健费用</td>
					<td class=""><input name="yf_fangyifei_youxiubiaozhun" value="${bp.getYf_fangyifei_youxiubiaozhun() }"/></td>
					<td class=""><input name="yf_fangyifei_shijizhibiao" value="${bp.getYf_fangyifei_shijizhibiao() }"/></td>
					<td class=""><input name="yf_fangyifei_tishengqianli" value="${bp.getYf_fangyifei_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >造肉成本</td>
					<td class=""><input name="zaorouchengben_youxiubiaozhun" value="${bp.getZaorouchengben_youxiubiaozhun() }"/></td>
					<td class=""><input name="zaorouchengben_shijizhibiao" value="${bp.getZaorouchengben_shijizhibiao() }"/></td>
					<td class=""><input name="zaorouchengben_tishengqianli" value="${bp.getZaorouchengben_tishengqianli() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >盈亏平衡点</td>
					<td class=""><input name="yingkuidian_youxiubiaozhun" value="${bp.getYingkuidian_youxiubiaozhun() }"/></td>
					<td class=""><input name="yingkuidian_shijizhibiao" value="${bp.getYingkuidian_shijizhibiao() }"/></td>
					<td class=""><input name="yingkuidian_tishengqianli" value="${bp.getYingkuidian_tishengqianli() }"/></td>
				</tr>
		</table>

<!----------------------------------------------------------------------- -->
<!-- 5优堂猪场健康评估报告  -->			
			<h1 align="center">(4.1)5优堂猪场健康评估报告</h1>
			<table align="center" class="report">
				<tr>
					<td>抗体检测报告分析</td>
					<td><textarea  rows="10" cols="80" name="report_analysis" wrap="physical">${bp.getReport_analysis() }</textarea></td>
				</tr>
				<tr>
					<td>抗体检测报告结论</td>
					<td><textarea  rows="10" cols="80" name="report_conclusion" wrap="physical">${bp.getReport_conclusion() }</textarea></td>
				</tr>
			</table>
			
<!-- 猪只解剖图片分析与结论 -->			
			<h1 align="center">(4.2)猪只解剖图片分析与结论</h1>
			<table align="center" class="report">
				<tr>
					<td>解剖图片分析</td>
					<td><textarea  rows="10" cols="80" name="anatomy_analysis" wrap="physical">${bp.getAnatomy_analysis() }</textarea></td>
				</tr>
				<tr>
					<td>解剖结论</td>
					<td><textarea  rows="10" cols="80" name="anatomy_conclusion" wrap="physical">${bp.getAnatomy_conclusion() }</textarea></td>
				</tr>
			</table>
			
<!-- 猪场现场临床症状分析与结论 -->	
			<h1 align="center">(4.3)猪场现场临床症状分析与结论</h1>		
			<table align="center" class="symptoms">
				<tr>
					<td>临床表现</td>
					<td><textarea  rows="10" cols="80" name="symptoms_performance" wrap="physical">${bp.getSymptoms_performance() }</textarea></td>
				</tr>
				<tr>
					<td>诊断结论</td>
					<td><textarea  rows="10" cols="80" name="symptoms_conclusion" wrap="physical">${bp.getSymptoms_conclusion() }</textarea></td>
				</tr>
			</table>
			
<!-- 猪场健康状况综合评估报告 -->			
			<h1 align="center">(4.4)猪场健康状况综合评估报告</h1>		
			<table align="center" class="comprehensive">
				<tr>
					<td>综合评估</td>
					<td><textarea  rows="10" cols="80" name="comprehensive_report" wrap="physical">${bp.getComprehensive_report() }</textarea></td>
				</tr>
			</table>
<!-- 5优堂猪场整体解决方案 -->			
		<h1 align="center">(5) 5优堂猪场整体解决方案</h1>	
		<table align="center" class="overall_solution">
				<tr align="center">
					<td>目标猪群</td>
					<td>解决方案</td>
					<td>治疗周期</td>
					<td>效果预估</td>
				</tr>
				<tr>
					<td>妊娠母猪</td>
					<td><textarea  rows="5" cols="20" name="overall_solution_renshen_plan">${bp.getOverall_solution_renshen_plan() }</textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_renshen_cycle">${bp.getOverall_solution_renshen_cycle() }</textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_renshen_effect">${bp.getOverall_solution_renshen_effect() }</textarea></td>
				</tr>
				<tr>
					<td>哺乳母猪</td>
					<td><textarea  rows="5" cols="20" name="overall_solution_buru_plan">${bp.getOverall_solution_buru_plan() }</textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_buru_cycle">${bp.getOverall_solution_buru_cycle() }</textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_buru_effect">${bp.getOverall_solution_buru_effect() }</textarea></td>
				</tr>
				<tr>
					<td>保育仔猪</td>
					<td><textarea  rows="5" cols="20" wrap="physical" name="overall_solution_baoyu_plan">${bp.getOverall_solution_baoyu_plan() }</textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_baoyu_cycle">${bp.getOverall_solution_baoyu_cycle() }</textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_baoyu_effect">${bp.getOverall_solution_baoyu_effect() }</textarea></td>
				</tr>
			</table>	
			
<!-- 5优堂整体解决方案效益评估(6.1) ~~~~~~~~~~-->
		<h1 align="center">(6.1)猪场目前饲养成绩评估与综合效益测算</h1>
		<table align="center" class="yf">
				<tr align="center">
					<td class="" >生产指标</td>
					<td class="">原来指标</td>
					<td class="" >目标指标</td>
					<td class="">改善比例</td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >母猪配种分娩率</td>
					<td class=""><input name="muzhupeizhongfeimianlv_yuanlaizhibiao" value="${bp.getMuzhupeizhongfeimianlv_yuanlaizhibiao() }"/></td>
					<td class=""><input name="muzhupeizhongfeimianlv_mubiaozhibiao" value="${bp.getMuzhupeizhongfeimianlv_mubiaozhibiao() }"/></td>
					<td class=""><input name="muzhupeizhongfeimianlv_gaishanbili" value="${bp.getMuzhupeizhongfeimianlv_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >基础母猪年均产仔窝数</td>
					<td class=""><input name="nianjunchanzai_yuanlaizhibiao" value="${bp.getNianjunchanzai_yuanlaizhibiao() }"/></td>
					<td class=""><input name="nianjunchanzai_mubiaozhibiao" value="${bp.getNianjunchanzai_mubiaozhibiao() }"/></td>
					<td class=""><input name="nianjunchanzai_gaishanbili" value="${bp.getNianjunchanzai_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >母猪窝均产活仔数</td>
					<td class=""><input name="junchanhuozishu_yuanlaizhibiao" value="${bp.getJunchanhuozishu_yuanlaizhibiao() }"/></td>
					<td class=""><input name="junchanhuozishu_mubiaozhibiao" value="${bp.getJunchanhuozishu_mubiaozhibiao() }"/></td>
					<td class=""><input name="junchanhuozishu_gaishanbili" value="${bp.getJunchanhuozishu_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >产房哺乳仔猪成活率</td>
					<td class=""><input name="buruzizhuchenghuolv_yuanlaizhibiao" value="${bp.getBuruzizhuchenghuolv_yuanlaizhibiao() }"/></td>
					<td class=""><input name="buruzizhuchenghuolv_mubiaozhibiao" value="${bp.getBuruzizhuchenghuolv_mubiaozhibiao() }"/></td>
					<td class=""><input name="buruzizhuchenghuolv_gaishanbili" value="${bp.getBuruzizhuchenghuolv_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >仔猪初生重</td>
					<td class=""><input name="chushengzhong_yuanlaizhibiao" value="${bp.getChushengzhong_yuanlaizhibiao() }"/></td>
					<td class=""><input name="chushengzhong_mubiaozhibiao" value="${bp.getChushengzhong_mubiaozhibiao() }"/></td>
					<td class=""><input name="chushengzhong_gaishanbili" value="${bp.getChushengzhong_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >28日龄断奶仔猪重</td>
					<td class=""><input name="duannaizhong_yuanlaizhibiao" value="${bp.getDuannaizhong_yuanlaizhibiao() }"/></td>
					<td class=""><input name="duannaizhong_mubiaozhibiao" value="${bp.getDuannaizhong_mubiaozhibiao() }"/></td>
					<td class=""><input name="duannaizhong_gaishanbili" value="${bp.getDuannaizhong_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄成活率</td>
					<td class=""><input name="baoyuchenghuolv_yuanlaizhibiao" value="${bp.getBaoyuchenghuolv_yuanlaizhibiao() }"/></td>
					<td class=""><input name="baoyuchenghuolv_mubiaozhibiao" value="${bp.getBaoyuchenghuolv_mubiaozhibiao() }"/></td>
					<td class=""><input name="baoyuchenghuolv_gaishanbili" value="${bp.getBaoyuchenghuolv_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄重</td>
					<td class=""><input name="lingzhong_yuanlaizhibiao" value="${bp.getLingzhong_yuanlaizhibiao() }"/></td>
					<td class=""><input name="lingzhong_mubiaozhibiao" value="${bp.getLingzhong_mubiaozhibiao() }"/></td>
					<td class=""><input name="lingzhong_gaishanbili" value="${bp.getLingzhong_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪成活率</td>
					<td class=""><input name="yufeichenghuolv_yuanlaizhibiao" value="${bp.getYufeichenghuolv_yuanlaizhibiao() }"/></td>
					<td class=""><input name="yufeichenghuolv_mubiaozhibiao" value="${bp.getYufeichenghuolv_mubiaozhibiao() }"/></td>
					<td class=""><input name="yufeichenghuolv_gaishanbili" value="${bp.getYufeichenghuolv_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪上市日龄</td>
					<td class=""><input name="shangshiling_yuanlaizhibiao" value="${bp.getShangshiling_yuanlaizhibiao() }"/></td>
					<td class=""><input name="shangshiling_mubiaozhibiao" value="${bp.getShangshiling_mubiaozhibiao() }"/></td>
					<td class=""><input name="shangshiling_gaishanbili" value="${bp.getShangshiling_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年提供断奶仔猪头数(PSY)</td>
					<td class=""><input name="PSY_yuanlaizhibiao" value="${bp.getPSY_yuanlaizhibiao() }"/></td>
					<td class=""><input name="PSY_mubiaozhibiao" value="${bp.getPSY_mubiaozhibiao() }"/></td>
					<td class=""><input name="PSY_gaishanbili" value="${bp.getPSY_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年上市肉猪头数(MSY)</td>
					<td class=""><input name="MSY_yuanlaizhibiao" value="${bp.getMSY_yuanlaizhibiao() }"/></td>
					<td class=""><input name="MSY_mubiaozhibiao" value="${bp.getMSY_mubiaozhibiao() }"/></td>
					<td class=""><input name="MSY_gaishanbili" value="${bp.getMSY_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >全程饲料料肉比</td>
					<td class=""><input name="liaoroubi_yuanlaizhibiao" value="${bp.getLiaoroubi_yuanlaizhibiao() }"/></td>
					<td class=""><input name="liaoroubi_mubiaozhibiao" value="${bp.getLiaoroubi_mubiaozhibiao() }"/></td>
					<td class=""><input name="liaoroubi_gaishanbili" value="${bp.getLiaoroubi_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪防疫保健费用</td>
					<td class=""><input name="fangyifei_yuanlaizhibiao" value="${bp.getFangyifei_yuanlaizhibiao() }"/></td>
					<td class=""><input name="fangyifei_mubiaozhibiao" value="${bp.getFangyifei_mubiaozhibiao() }"/></td>
					<td class=""><input name="fangyifei_gaishanbili" value="${bp.getFangyifei_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头育肥猪防疫保健费用</td>
					<td class=""><input name="yf_fangyifei_yuanlaizhibiao" value="${bp.getYf_fangyifei_yuanlaizhibiao() }"/></td>
					<td class=""><input name="yf_fangyifei_mubiaozhibiao" value="${bp.getYf_fangyifei_mubiaozhibiao() }"/></td>
					<td class=""><input name="yf_fangyifei_gaishanbili" value="${bp.getYf_fangyifei_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >造肉成本</td>
					<td class=""><input name="zaorouchengben_yuanlaizhibiao" value="${bp.getZaorouchengben_yuanlaizhibiao() }"/></td>
					<td class=""><input name="zaorouchengben_mubiaozhibiao" value="${bp.getZaorouchengben_mubiaozhibiao() }"/></td>
					<td class=""><input name="zaorouchengben_gaishanbili" value="${bp.getZaorouchengben_gaishanbili() }"/></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >盈亏平衡点</td>
					<td class=""><input name="yingkuidian_yuanlaizhibiao" value="${bp.getYingkuidian_yuanlaizhibiao() }"/></td>
					<td class=""><input name="yingkuidian_mubiaozhibiao" value="${bp.getYingkuidian_mubiaozhibiao() }"/></td>
					<td class=""><input name="yingkuidian_gaishanbili" value="${bp.getYingkuidian_gaishanbili() }"/></td>
				</tr>
		</table>
			
			
<!-- 直接生产成本对比（每头猪） -->			
			<h1 align="center">(6.2)直接生产成本对比（每头猪）</h1>	
			<table align="center" class="cost_comparison">
				<tr align="center">
					<td rowspan="2">阶段</td>
					<td colspan="3">原来生产成本</td>
					<td colspan="3">5优堂生产成本</td>
				</tr>
				<tr align="center">
					<td>饲料</td>
					<td>疫苗</td>
					<td>治疗保健</td>
					<td>饲料</td>
					<td>疫苗</td>
					<td>治疗保健</td>
				</tr>
				<tr>
					<td>哺乳仔猪</td>
					<td><input name="cost_comparison_original_buruzizhu_siliao" value="${bp.getCost_comparison_original_buruzizhu_siliao() }"/></td>
					<td><input name="cost_comparison_original_buruzizhu_yimiao" value="${bp.getCost_comparison_original_buruzizhu_yimiao() }"/></td>
					<td><input name="cost_comparison_original_buruzizhu_baojian" value="${bp.getCost_comparison_original_buruzizhu_baojian() }"/></td>
					<td><input name="cost_comparison_jiyooh_buruzizhu_siliao" value="${bp.getCost_comparison_jiyooh_buruzizhu_siliao() }"/></td>
					<td><input name="cost_comparison_jiyooh_buruzizhu_yimiao" value="${bp.getCost_comparison_jiyooh_buruzizhu_yimiao() }"/></td>
					<td><input name="cost_comparison_jiyooh_buruzizhu_baojian" value="${bp.getCost_comparison_jiyooh_buruzizhu_baojian() }"/></td>
				</tr>
				<tr>
					<td>保育猪</td>
					<td><input name="cost_comparison_original_baoyuzhu_siliao" value="${bp.getCost_comparison_original_baoyuzhu_siliao() }"/></td>
					<td><input name="cost_comparison_original_baoyuzhu_yimiao" value="${bp.getCost_comparison_original_baoyuzhu_yimiao() }"/></td>
					<td><input name="cost_comparison_original_baoyuzhu_baojian" value="${bp.getCost_comparison_original_baoyuzhu_baojian() }"/></td>
					<td><input name="cost_comparison_jiyooh_baoyuzhu_siliao" value="${bp.getCost_comparison_jiyooh_baoyuzhu_siliao() }"/></td>
					<td><input name="cost_comparison_jiyooh_baoyuzhu_yimiao" value="${bp.getCost_comparison_jiyooh_baoyuzhu_yimiao() }"/></td>
					<td><input name="cost_comparison_jiyooh_baoyuzhu_baojian" value="${bp.getCost_comparison_jiyooh_baoyuzhu_baojian() }"/></td>
				</tr>
				<tr>
					<td>育肥猪</td>
					<td><input name="cost_comparison_original_yufei_siliao" value="${bp.getCost_comparison_original_yufei_siliao() }"/></td>
					<td><input name="cost_comparison_original_yufei_yimiao" value="${bp.getCost_comparison_original_yufei_yimiao() }"/></td>
					<td><input name="cost_comparison_original_yufei_baojian" value="${bp.getCost_comparison_original_yufei_baojian() }"/></td>
					<td><input name="cost_comparison_jiyooh_yufei_siliao" value="${bp.getCost_comparison_jiyooh_yufei_siliao() }"/></td>
					<td><input name="cost_comparison_jiyooh_yufei_yimiao" value="${bp.getCost_comparison_jiyooh_yufei_yimiao() }"/></td>
					<td><input name="cost_comparison_jiyooh_yufei_baojian" value="${bp.getCost_comparison_jiyooh_yufei_baojian() }"/></td>
				</tr>
				<tr>
					<td>怀孕母猪</td>
					<td><input name="cost_comparison_original_huaiyunmuzhu_siliao" value="${bp.getCost_comparison_original_huaiyunmuzhu_siliao() }"/></td>
					<td><input name="cost_comparison_original_huaiyunmuzhu_yimiao" value="${bp.getCost_comparison_original_huaiyunmuzhu_yimiao() }"/></td>
					<td><input name="cost_comparison_original_huaiyunmuzhu_baojian" value="${bp.getCost_comparison_original_huaiyunmuzhu_baojian() }"/></td>
					<td><input name="cost_comparison_jiyooh_huaiyunmuzhu_siliao" value="${bp.getCost_comparison_jiyooh_huaiyunmuzhu_siliao() }"/></td>
					<td><input name="cost_comparison_jiyooh_huaiyunmuzhu_yimiao" value="${bp.getCost_comparison_jiyooh_huaiyunmuzhu_yimiao() }"/></td>
					<td><input name="cost_comparison_jiyooh_huaiyunmuzhu_baojian" value="${bp.getCost_comparison_jiyooh_huaiyunmuzhu_baojian() }"/></td>
				</tr>
				<tr>
					<td>哺乳母猪</td>
					<td><input name="cost_comparison_original_burumuzhu_siliao" value="${bp.getCost_comparison_original_burumuzhu_siliao() }"/></td>
					<td><input name="cost_comparison_original_burumuzhu_yimiao" value="${bp.getCost_comparison_original_burumuzhu_yimiao() }"/></td>
					<td><input name="cost_comparison_original_burumuzhu_baojian" value="${bp.getCost_comparison_original_burumuzhu_baojian() }"/></td>
					<td><input name="cost_comparison_jiyooh_burumuzhu_siliao" value="${bp.getCost_comparison_jiyooh_burumuzhu_siliao() }"/></td>
					<td><input name="cost_comparison_jiyooh_burumuzhu_yimiao" value="${bp.getCost_comparison_jiyooh_burumuzhu_yimiao() }"/></td>
					<td><input name="cost_comparison_jiyooh_burumuzhu_baojian" value="${bp.getCost_comparison_jiyooh_burumuzhu_baojian() }"/></td>
				</tr>
			</table>
<!-- 6.3综合效益评估报告 -->			
			<h1 align="center">(6.3)综合效益评估报告</h1>		
			<div align="center">
				<textarea class="Comprehensive_benefits" rows="10" cols="100" name="comprehensive_benefits">${bp.getComprehensive_benefits() }</textarea>			
			</div>
<!-- 5优堂猪场综合管理建议 -->	
			<h1 align="center">(7)5优堂猪场综合管理建议 </h1>		
			<div align="center">
				<textarea class="Comprehensive_benefits" rows="10" cols="100" name="management_advice">${bp.getManagement_advice()}</textarea>			
			</div>
			<br>
			
<!-- 回访报告遍历 -->			
			<div style="width:100%" id="huifangdiv">
			
			</div>
			<br>
		    <div align="center">
				<input type="submit" name="submit" value="提交修改">
			</div>
		</form>
		<script type="text/javascript">
			function yesorno(){
				var bh=document.getElementsByName("bianhao")[0].value;
				if(bh==""||bh==null){
					if (confirm("编号不能为空!"));
				}else if(bh!="${bp.getBianhao()}"){
					$.ajax({
						url:"<%=path %>/yesorno.do?bianhao="+bh, 
						type:"post",
						success:function(data){
							if(data=="false"){
								if (confirm("编号已存在,请修改!")){
									$("#bianhao").val("${bp.getBianhao()}");
								}
							}
						}
					});
				}
			}
		
		
		
			var bianhao=($("#bianhao").val());
			$.ajax({
				type:"get",
				url:"<%=path %>/huifanglist.do?bianhao="+bianhao,
				success:function(data){
					$("#huifangdiv").html("");
					var list=eval(data);
					if(list.length!=0){
						$("#huifangdiv").append("<h1 align='center'>(8)客户回访追踪报告</h1>");
						$("#huifangdiv").append("<table id='huifangtable' align='center'><tr style='background-color:MediumTurquoise'><td>拜访时间</td><td>拜访目的</td><td>方案使用情况</td><td>采食状况</td><td>粪便状况</td><td>外观状况</td><td>死亡解剖状况</td><td>抗体检测报告</td><td>其他</td><td>结论</td></tr></table>");
						for(var i=0;i<list.length;i++){
						 $("#huifangtable").append("<tr><td>"+
						 list[i].return_visit_times+"</td><td>"+
						 list[i].return_visit_purpose+"</td><td>"+
						 list[i].return_visit_usage+"</td><td>"+
						 list[i].return_visit_Feedintake+"</td><td>"+
						 list[i].return_visit_feces+"</td><td>"+
						 list[i].return_visit_appearance+"</td><td>"+
						 list[i].return_visit_end+"</td><td>"+
						 list[i].return_visit_antibody+"</td><td>"+
						 list[i].return_visit_other+"</td><td>"+
						 list[i].return_visit_conclusion+"</td></tr>");
						}
					}
				}
			});
			
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
				for(var i=0;i<list.length;i++){
					if(list[i].daquusername=="${bp.getDaquusername()}"){
						continue;
					}else{
						$("#seledaqu").append("<option>"+list[i].daquusername+"</option>");
					}
				}
			}
	  	});	
	  	$(sele());
		function sele(){
			var usernane=$("#seledaqu").val();
		  		$("#selemendian").html("");
		  		if(usernane=="${bp.getDaquusername()}"){
			  		$("#selemendian").append("<option>${bp.getMdaqu()}</option>");
		  		}
			  		$.ajax({
			  			type:"post",
			  			url:"<%=path %>/selectmendian.do?&mname="+usernane,
			  			success:function(data){
			  				var list=eval(data);
			  				for(var i=0;i<list.length;i++){
		  						if(usernane!="${bp.getMdaqu()}"){
			  						$("#selemendian").append("<option>"+list[i].mname+"</option>");
		  						}else{
		  							continue;
		  						}
			  				}
			  			}
			  	});
		}
			
		</script>
  </body>
</html>
