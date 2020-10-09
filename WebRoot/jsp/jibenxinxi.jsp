<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>基本信息</title>
    <script type="text/javascript" src="<%=path %>/js/EasyUI-1.5.1/jquery.min.js"></script>
    <style type="text/css">
    a{
    	text-decoration: none;
    }
    table{
    	border-collapse:collapse;border:none;
    }
    input{
        font-size: 16px;
    	text-align:center;
    	line-height:35px;
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
    	height:8em;
    	border:none;
    }
	.m_t div input{
	    width:160px;
	    height:2em;
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
    .yf1 input{
    	border:0px;
    	height:2em;
    	width:7em;
    }
    .yf tr td input{
    	border:0px;
    	height:4em;
    	width:7em;
    }
    .yf_inp{
    	border:1px solid;
    	border-left:none;
    	border-right:none;
    	margin-top:1px;
    	
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
    	height:3em;
    }
    </style>
  </head>
  <body>
<!-- 基本信息 -->
	  <a href="<%=path %>/excelfilestyledown.do">excel格式下载</a>
	  <a style="margin-left:3em;" href="<%=path %>/excelalerts.do" >excel批量上传(只识别.xls格式、不支持xlsx格式、上传前请下载表格。)</a>
	  <form name="ufroms" action="<%=path %>/jibenxinxi.do" method="post" onsubmit="return checkform(this)">
	  		<h1 align="center">(1)客户基本信息</h1>
	  		<div align="center">
	  			招商经理:
		  		<select id="seledaqu" name="daquusername" onclick="sele()"></select>
		  		门店经理:
		  		<select id="selemendian" name="mdaqu">
		  			<option>--请选择--</option>
		  		</select>
	  		</div>
	  		<br/>
	  		<br/>
			<table align="center" class="k" >
				<tr>
					<td  align="center">档案编号<span style="color:red">&nbsp;*</span></td>
					<td>
						<input type="text" class="k_ip" id="bianhao" name="bianhao"  onchange="yesorno()"/>
					</td>
					<td  align="center">猪场名称</td>
					<td>
						<input type="text" class="k_name" name="pigfactoryname"  />
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">客户姓名</td><td><input type="text" class="k_ip" name="uname"  /></td>
					<td>联系电话</td><td><input type="text" class="k_phone" name="phone" /></td>
				</tr>
				<tr align="center">
					<td class="t_left">年龄</td><td><input type="text" class="k_ip" name="age" /></td>
					<td>生日</td><td><input type="text" class="k_bir" name="bir" /></td>
				</tr>
				<tr align="center">
					<td class="t_left">微信号</td><td><input type="text" class="k_ip" name="weixin" /></td>
					<td>性别</td>
					<td align="center">
					<input name="sex"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">详细地址</td>
					<td><input type="text" name="ip" class="k_ip" /></td>
					<td>规模</td><td><input type="text" class="k_bir" name="guimo" /></td>
				</tr>
				<tr align="center">
					<td class="t_left">猪舍建筑时间</td>
					<td><input type="text" name="pigbuildtime" class="k_ip" /></td>
					<td>育肥舍面积</td>
					<td align="center">
					<input name="yufeiarea"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">空怀母猪大栏个数</td>
					<td><input name="justnumber" class="k_ip" /></td>
					<td>空怀母猪大栏面积</td>
					<td align="center">
					<input name="justarea"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">空怀母猪定位栏个数</td>
					<td><input name="justsownumber" class="k_ip" /></td>
					<td>母猪产床数</td>
					<td align="center">
					<input name="sowtablenumber"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">保育床个数</td>
					<td><input name="baoyubednumber" class="k_ip" /></td>
					<td>冬季取暖设施</td>
					<td align="center">
					<input name="winterheating"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">保育床面积</td>
					<td><input name="baoyuarea" class="k_ip" /></td>
					<td>是否高床</td>
					<td align="center">
					<input name="baoyuhighbed"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">锅炉规模</td>
					<td><input name="boilerscale" class="k_ip" /></td>
					<td>产房取暖方法</td>
					<td align="center">
					<input name="roomheatingmethod"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">保育舍取暖方法</td>
					<td><input name="baoyuheatingmethod" class="k_ip" /></td>
					<td>育肥舍取暖方法</td>
					<td align="center">
					<input name="yufeiheatingmethod"/>
					</td>
				</tr>
				<tr align="center">
					<td class="t_left">猪场规模是否有扩展空间</td>
					<td><input name="pigfarmsorbig" class="k_ip" /></td>
					<td>猪场生产是否有扩展计划</td>
					<td align="center">
					<input name="orplans"/>
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
					<td><input type="text" name="h_number"/></td>
					<td><input type="text" name="h_siliaopinzhong"/></td>
					<td><input type="text" name="h_rmb"/></td>
				<!-- 怀孕母猪 疫苗名称 -->
					<td class="m_t">
						<div><input type="text" border="1" name="h_y_name_1"/></div>
						<div style="border:1px solid black;border-left:none;border-right:none;">
							<input type="text" name="h_y_name_2"/>
						</div>
						<div><input type="text" name="h_y_name_3"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="h_y_name_4"/>
						</div>
					</td>
				<!-- 怀孕母猪 生产厂家 -->
					<td class="m_t">
						<div><input type="text" border="1" name="h_factory_1"/></div>
						<div style="border:1px solid black;border-left:none;border-right:none;">
							<input type="text" name="h_factory_2"/>
						</div>
						<div><input type="text" name="h_factory_3"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="h_factory_4"/>
						</div>
					</td>
				<!-- 怀孕母猪 保健药品 -->
					<td class="m_t">
						<div><input type="text" border="1" name="h_b_drug_1"/></div>
						<div style="border:1px solid black;border-left:none;border-right:none;">
							<input type="text" name="h_b_drug_2"/>
						</div>
						<div><input type="text" name="h_b_drug_3"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="h_b_drug_4"/>
						</div>
					</td>
				</tr>
				<tr align="center">
					<td>哺乳母猪</td>
					<td><input type="text" name="b_number"/></td>
					<td><input type="text" name="b_siliaopinzhong"/></td>
					<td><input type="text" name="b_rmb"/></td>
				<!-- 哺乳母猪 疫苗名称 -->
					<td class="m_t">
						<div><input type="text" border="1" name="b_y_name_1"/></div>
						<div style="border:1px solid;border-left:none;border-right:none;">
							<input type="text" name="b_y_name_2"/>
						</div>
						<div><input type="text" name="b_y_name_3"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="b_y_name_4"/>
						</div>
					</td>
				<!-- 哺乳母猪 生产厂家 -->
					<td class="m_t">
						<div><input type="text" border="1" name="b_factory_1"/></div>
						<div style="border:1px solid;border-left:none;border-right:none;">
							<input type="text" name="b_factory_2"/>
						</div>
						<div><input type="text" name="b_factory_3"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="b_factory_4"/>
						</div>
					</td>
				<!-- 哺乳母猪 保健药品 -->
					<td class="m_t">
						<div><input type="text" border="1" name="b_b_drug_1"/></div>
						<div style="border:1px solid;border-left:none;border-right:none;">
							<input type="text" name="b_b_drug_2"/>
						</div>
						<div><input type="text" name="b_b_drug_3"/></div>
						<div  style="border:1px solid black;border-left:none;border-right:none;border-bottom:none;">
							<input type="text" name="b_b_drug_4"/>
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
					<td class="s2"><input name="sy_date" /></td>
				</tr>
				<tr align="center">
					<td class="s1" >母猪配种分娩率</td>
					<td class="s2"><input name="sy_fenmian" /></td>
				</tr>
				<tr align="center">
					<td class="s1">基础母猪年均产仔窝数</td>
					<td class="s2"><input name="sy_pingjun_number"/></td>
				</tr>
				<tr align="center">
					<td class="s1">母猪窝均产活仔数</td>
					<td class="s2"><input name="sy_cunhuo_number"/></td>
				</tr>
				<tr align="center">
					<td class="s1">仔猪平均出生重/kg</td>
					<td class="s2"><input name="sy_jun_zhong"/></td>
				</tr>
				<tr align="center">
					<td class="s1">产房哺乳仔猪成活率</td>
					<td class="s2"><input name="sy_cunhuo_lv"/></td>
				</tr>
				<tr align="center">
					<td class="s1">平均断奶重</td>
					<td class="s2"><input name="sy_duannai_zhong"/></td>
				</tr>
			</table>
			<br>
<!-- --------------------------------!!!------------------------------------- -->
<!-- 育肥猪基本信息 -->	
		<h1 align="center">(2.3)育肥猪基本信息</h1>
			<table align="center" class="yf1">
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
					<td class="yf_inps"><input name="buruzizhu_siliaopinzhong" /></td>
					<td class="yf_inps"><input name="buruzizhu_siliaopinpai" /></td>
					<td class="yf_inps"><input name="buruzizhu_siliaojiage" /></td>
					<td class="">
						<div><input name="buruzizhu_yimiaomingcheng_1"/></div>
						<div class="yf_inp"><input name="buruzizhu_yimiaomingcheng_2"/></div>
						<div><input name="buruzizhu_yimiaomingcheng_3"/></div>
					</td>
					<td class="">
						<div><input name="buruzizhu_shengchanchangjia_1"/></div>
						<div class="yf_inp"><input name="buruzizhu_shengchanchangjia_2"/></div>
						<div><input name="buruzizhu_shengchanchangjia_3"/></div>
					</td>
					<td class="">
						<div><input name="buruzizhu_baojianyao_1"/></div>
						<div class="yf_inp"><input name="buruzizhu_baojianyao_2"/></div>
						<div><input name="buruzizhu_baojianyao_3"/></div>
					</td>
				</tr>
				<tr align="center">
					<td class="" >保育猪</td>
					<td class="yf_inps"><input name="baoyuzhu_siliaopinzhong" /></td>
					<td class="yf_inps"><input name="baoyuzhu_siliaopinpai" /></td>
					<td class="yf_inps"><input name="baoyuzhu_siliaojiage" /></td>
					<td class="">
						<div><input name="baoyuzhu_yimiaomingcheng_1"/></div>
						<div class="yf_inp"><input name="baoyuzhu_yimiaomingcheng_2"/></div>
						<div><input name="baoyuzhu_yimiaomingcheng_3"/></div>
					</td>
					<td class="">
						<div><input name="baoyuzhu_shengchanchangjia_1"/></div>
						<div class="yf_inp"><input name="baoyuzhu_shengchanchangjia_2"/></div>
						<div><input name="baoyuzhu_shengchanchangjia_3"/></div>
					</td>
					<td class="">
						<div><input name="baoyuzhu_baojianyao_1"/></div>
						<div class="yf_inp"><input name="baoyuzhu_baojianyao_2"/></div>
						<div><input name="baoyuzhu_baojianyao_3"/></div>
					</td>
				</tr>
				<tr align="center">
					<td class="" >育肥猪</td>
					<td class="yf_inps"><input name="yufeizhu_siliaopinzhong" /></td>
					<td class="yf_inps"><input name="yufeizhu_siliaopinpai" /></td>
					<td class="yf_inps"><input name="yufeizhu_siliaojiage" /></td>
					<td class="">
						<div><input name="yufeizhu_yimiaomingcheng_1"/></div>
						<div class="yf_inp"><input name="yufeizhu_yimiaomingcheng_2"/></div>
						<div><input name="yufeizhu_yimiaomingcheng_3"/></div>
					</td>
					<td class="">
						<div><input name="yufeizhu_shengchanchangjia_1"/></div>
						<div class="yf_inp"><input name="yufeizhu_shengchanchangjia_2"/></div>
						<div><input name="yufeizhu_shengchanchangjia_3"/></div>
					</td>
					<td class="">
						<div><input name="yufeizhu_baojianyao_1"/></div>
						<div class="yf_inp"><input name="yufeizhu_baojianyao_2"/></div>
						<div><input name="yufeizhu_baojianyao_3"/></div>
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
					<td class=""><input name="buruzizhu_cunlanshuliang" /></td>
					<td class=""><input name="buruzizhu_cunlanshijian" /></td>
					<td class=""><input name="buruzizhu_chulanzhongliang" /></td>
					<td class=""><input name="buruzizhu_jieduanchenghuobi" /></td>
					<td class=""><input name="buruzizhu_jieduanliaoroubi" /></td>
				</tr>
				<tr align="center"  class="p_g">
					<td class="" >保育猪</td>
					<td class=""><input name="baoyuzhu_cunlanshuliang" /></td>
					<td class=""><input name="baoyuzhu_cunlanshijian" /></td>
					<td class=""><input name="baoyuzhu_chulanzhongliang" /></td>
					<td class=""><input name="baoyuzhu_jieduanchenghuobi" /></td>
					<td class=""><input name="baoyuzhu_jieduanliaoroubi" /></td>
				</tr>
				<tr align="center"  class="p_g">
					<td class="" >育肥猪</td>
					<td class=""><input name="yufeizhu_cunlanshuliang" /></td>
					<td class=""><input name="yufeizhu_cunlanshijian" /></td>
					<td class=""><input name="yufeizhu_chulanzhongliang" /></td>
					<td class=""><input name="yufeizhu_jieduanchenghuobi" /></td>
					<td class=""><input name="yufeizhu_jieduanliaoroubi" /></td>
				</tr>
		</table>
<!-- --------------------------------------------------------------------- -->
<!-- 客户痛点描述 -->
		<h1 align="center">(2.5)客户痛点描述</h1>
		<div align="center">
			<textarea class="Comprehensive_benefits" rows="10" cols="100" name="describe"></textarea>			
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
					<td class=""><input name="muzhupeizhongfeimianlv_youxiubiaozhun" value="90%"/></td>
					<td class=""><input name="muzhupeizhongfeimianlv_shijizhibiao" /></td>
					<td class=""><input name="muzhupeizhongfeimianlv_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >基础母猪年均产仔窝数</td>
					<td class=""><input name="nianjunchanzai_youxiubiaozhun" value="2.3-2.4"/></td>
					<td class=""><input name="nianjunchanzai_shijizhibiao" /></td>
					<td class=""><input name="nianjunchanzai_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >母猪窝均产活仔数</td>
					<td class=""><input name="junchanhuozishu_youxiubiaozhun" value="12" /></td>
					<td class=""><input name="junchanhuozishu_shijizhibiao" /></td>
					<td class=""><input name="junchanhuozishu_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >产房哺乳仔猪成活率</td>
					<td class=""><input name="buruzizhuchenghuolv_youxiubiaozhun" value="92%" /></td>
					<td class=""><input name="buruzizhuchenghuolv_shijizhibiao" /></td>
					<td class=""><input name="buruzizhuchenghuolv_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >仔猪初生重</td>
					<td class=""><input name="chushengzhong_youxiubiaozhun" value="1.3-1.5" /></td>
					<td class=""><input name="chushengzhong_shijizhibiao" /></td>
					<td class=""><input name="chushengzhong_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >28日龄断奶仔猪重</td>
					<td class=""><input name="duannaizhong_youxiubiaozhun" value="7-7.5" /></td>
					<td class=""><input name="duannaizhong_shijizhibiao" /></td>
					<td class=""><input name="duannaizhong_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄成活率</td>
					<td class=""><input name="baoyuchenghuolv_youxiubiaozhun" value="95%-97%" /></td>
					<td class=""><input name="baoyuchenghuolv_shijizhibiao" /></td>
					<td class=""><input name="baoyuchenghuolv_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄重</td>
					<td class=""><input name="lingzhong_youxiubiaozhun" value="25-30" /></td>
					<td class=""><input name="lingzhong_shijizhibiao" /></td>
					<td class=""><input name="lingzhong_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪成活率</td>
					<td class=""><input name="yufeichenghuolv_youxiubiaozhun" value="97%-98%" /></td>
					<td class=""><input name="yufeichenghuolv_shijizhibiao" /></td>
					<td class=""><input name="yufeichenghuolv_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪上市日龄</td>
					<td class=""><input name="shangshiling_youxiubiaozhun" value="165" /></td>
					<td class=""><input name="shangshiling_shijizhibiao" /></td>
					<td class=""><input name="shangshiling_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年提供断奶仔猪头数(PSY)</td>
					<td class=""><input name="PSY_youxiubiaozhun" value="22-23" /></td>
					<td class=""><input name="PSY_shijizhibiao" /></td>
					<td class=""><input name="PSY_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年上市肉猪头数(MSY)</td>
					<td class=""><input name="MSY_youxiubiaozhun" value="21-22" /></td>
					<td class=""><input name="MSY_shijizhibiao" /></td>
					<td class=""><input name="MSY_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >全程饲料料肉比</td>
					<td class=""><input name="liaoroubi_youxiubiaozhun" value="2.5-2.6" /></td>
					<td class=""><input name="liaoroubi_shijizhibiao" /></td>
					<td class=""><input name="liaoroubi_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪防疫保健费用</td>
					<td class=""><input name="fangyifei_youxiubiaozhun" value="90-95" /></td>
					<td class=""><input name="fangyifei_shijizhibiao" /></td>
					<td class=""><input name="fangyifei_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头育肥猪防疫保健费用</td>
					<td class=""><input name="yf_fangyifei_youxiubiaozhun" value="40" /></td>
					<td class=""><input name="yf_fangyifei_shijizhibiao" /></td>
					<td class=""><input name="yf_fangyifei_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >造肉成本</td>
					<td class=""><input name="zaorouchengben_youxiubiaozhun" value="5.5" /></td>
					<td class=""><input name="zaorouchengben_shijizhibiao" /></td>
					<td class=""><input name="zaorouchengben_tishengqianli" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >盈亏平衡点</td>
					<td class=""><input name="yingkuidian_youxiubiaozhun" value="6" /></td>
					<td class=""><input name="yingkuidian_shijizhibiao" /></td>
					<td class=""><input name="yingkuidian_tishengqianli" /></td>
				</tr>
		</table>

<!----------------------------------------------------------------------- -->
<!-- 5优堂猪场健康评估报告  -->			
			<h1 align="center">(4.1)5优堂猪场健康评估报告</h1>
			<table align="center" class="report">
				<tr>
					<td>抗体检测报告分析</td>
					<td><textarea  rows="10" cols="80" name="report_analysis" wrap="physical"></textarea></td>
				</tr>
				<tr>
					<td>抗体检测报告结论</td>
					<td><textarea  rows="10" cols="80" name="report_conclusion" wrap="physical"></textarea></td>
				</tr>
			</table>
			
<!-- 猪只解剖图片分析与结论 -->			
			<h1 align="center">(4.2)猪只解剖图片分析与结论</h1>
			<table align="center" class="report">
				<tr>
					<td>解剖图片分析</td>
					<td><textarea  rows="10" cols="80" name="anatomy_analysis" wrap="physical"></textarea></td>
				</tr>
				<tr>
					<td>解剖结论</td>
					<td><textarea  rows="10" cols="80" name="anatomy_conclusion" wrap="physical"></textarea></td>
				</tr>
			</table>
			
<!-- 猪场现场临床症状分析与结论 -->	
			<h1 align="center">(4.3)猪场现场临床症状分析与结论</h1>		
			<table align="center" class="symptoms">
				<tr>
					<td>临床表现</td>
					<td><textarea  rows="10" cols="80" name="symptoms_performance" wrap="physical"></textarea></td>
				</tr>
				<tr>
					<td>诊断结论</td>
					<td><textarea  rows="10" cols="80" name="symptoms_conclusion" wrap="physical"></textarea></td>
				</tr>
			</table>
			
<!-- 猪场健康状况综合评估报告 -->			
			<h1 align="center">(4.4)猪场健康状况综合评估报告</h1>		
			<table align="center" class="comprehensive">
				<tr>
					<td>综合评估</td>
					<td><textarea  rows="10" cols="80" name="comprehensive_report" wrap="physical"></textarea></td>
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
					<td><textarea  rows="5" cols="20" name="overall_solution_renshen_plan"></textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_renshen_cycle"></textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_renshen_effect"></textarea></td>
				</tr>
				<tr>
					<td>哺乳母猪</td>
					<td><textarea  rows="5" cols="20" name="overall_solution_buru_plan"></textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_buru_cycle"></textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_buru_effect"></textarea></td>
				</tr>
				<tr>
					<td>保育仔猪</td>
					<td><textarea  rows="5" cols="20" wrap="physical" name="overall_solution_baoyu_plan"></textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_baoyu_cycle"></textarea></td>
					<td><textarea  rows="5" cols="20" name="overall_solution_baoyu_effect"></textarea></td>
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
					<td class=""><input name="muzhupeizhongfeimianlv_yuanlaizhibiao" /></td>
					<td class=""><input name="muzhupeizhongfeimianlv_mubiaozhibiao" /></td>
					<td class=""><input name="muzhupeizhongfeimianlv_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >基础母猪年均产仔窝数</td>
					<td class=""><input name="nianjunchanzai_yuanlaizhibiao" /></td>
					<td class=""><input name="nianjunchanzai_mubiaozhibiao" /></td>
					<td class=""><input name="nianjunchanzai_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >母猪窝均产活仔数</td>
					<td class=""><input name="junchanhuozishu_yuanlaizhibiao" /></td>
					<td class=""><input name="junchanhuozishu_mubiaozhibiao" /></td>
					<td class=""><input name="junchanhuozishu_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >产房哺乳仔猪成活率</td>
					<td class=""><input name="buruzizhuchenghuolv_yuanlaizhibiao" /></td>
					<td class=""><input name="buruzizhuchenghuolv_mubiaozhibiao" /></td>
					<td class=""><input name="buruzizhuchenghuolv_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >仔猪初生重</td>
					<td class=""><input name="chushengzhong_yuanlaizhibiao" /></td>
					<td class=""><input name="chushengzhong_mubiaozhibiao" /></td>
					<td class=""><input name="chushengzhong_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >28日龄断奶仔猪重</td>
					<td class=""><input name="duannaizhong_yuanlaizhibiao" /></td>
					<td class=""><input name="duannaizhong_mubiaozhibiao" /></td>
					<td class=""><input name="duannaizhong_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄成活率</td>
					<td class=""><input name="baoyuchenghuolv_yuanlaizhibiao" /></td>
					<td class=""><input name="baoyuchenghuolv_mubiaozhibiao" /></td>
					<td class=""><input name="baoyuchenghuolv_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >保育70日龄重</td>
					<td class=""><input name="lingzhong_yuanlaizhibiao" /></td>
					<td class=""><input name="lingzhong_mubiaozhibiao" /></td>
					<td class=""><input name="lingzhong_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪成活率</td>
					<td class=""><input name="yufeichenghuolv_yuanlaizhibiao" /></td>
					<td class=""><input name="yufeichenghuolv_mubiaozhibiao" /></td>
					<td class=""><input name="yufeichenghuolv_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >育肥猪上市日龄</td>
					<td class=""><input name="shangshiling_yuanlaizhibiao" /></td>
					<td class=""><input name="shangshiling_mubiaozhibiao" /></td>
					<td class=""><input name="shangshiling_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年提供断奶仔猪头数(PSY)</td>
					<td class=""><input name="PSY_yuanlaizhibiao" /></td>
					<td class=""><input name="PSY_mubiaozhibiao" /></td>
					<td class=""><input name="PSY_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪年上市肉猪头数(MSY)</td>
					<td class=""><input name="MSY_yuanlaizhibiao" /></td>
					<td class=""><input name="MSY_mubiaozhibiao" /></td>
					<td class=""><input name="MSY_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >全程饲料料肉比</td>
					<td class=""><input name="liaoroubi_yuanlaizhibiao" /></td>
					<td class=""><input name="liaoroubi_mubiaozhibiao" /></td>
					<td class=""><input name="liaoroubi_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头母猪防疫保健费用</td>
					<td class=""><input name="fangyifei_yuanlaizhibiao" /></td>
					<td class=""><input name="fangyifei_mubiaozhibiao" /></td>
					<td class=""><input name="fangyifei_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >每头育肥猪防疫保健费用</td>
					<td class=""><input name="yf_fangyifei_yuanlaizhibiao" /></td>
					<td class=""><input name="yf_fangyifei_mubiaozhibiao" /></td>
					<td class=""><input name="yf_fangyifei_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >造肉成本</td>
					<td class=""><input name="zaorouchengben_yuanlaizhibiao" /></td>
					<td class=""><input name="zaorouchengben_mubiaozhibiao" /></td>
					<td class=""><input name="zaorouchengben_gaishanbili" /></td>
				</tr>
				<tr align="center" class="p_g">
					<td class="" >盈亏平衡点</td>
					<td class=""><input name="yingkuidian_yuanlaizhibiao" /></td>
					<td class=""><input name="yingkuidian_mubiaozhibiao" /></td>
					<td class=""><input name="yingkuidian_gaishanbili" /></td>
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
					<td><input name="cost_comparison_original_buruzizhu_siliao"/></td>
					<td><input name="cost_comparison_original_buruzizhu_yimiao"/></td>
					<td><input name="cost_comparison_original_buruzizhu_baojian"/></td>
					<td><input name="cost_comparison_jiyooh_buruzizhu_siliao"/></td>
					<td><input name="cost_comparison_jiyooh_buruzizhu_yimiao"/></td>
					<td><input name="cost_comparison_jiyooh_buruzizhu_baojian"/></td>
				</tr>
				<tr>
					<td>保育猪</td>
					<td><input name="cost_comparison_original_baoyuzhu_siliao"/></td>
					<td><input name="cost_comparison_original_baoyuzhu_yimiao"/></td>
					<td><input name="cost_comparison_original_baoyuzhu_baojian"/></td>
					<td><input name="cost_comparison_jiyooh_baoyuzhu_siliao"/></td>
					<td><input name="cost_comparison_jiyooh_baoyuzhu_yimiao"/></td>
					<td><input name="cost_comparison_jiyooh_baoyuzhu_baojian"/></td>
				</tr>
				<tr>
					<td>育肥猪</td>
					<td><input name="cost_comparison_original_yufei_siliao"/></td>
					<td><input name="cost_comparison_original_yufei_yimiao"/></td>
					<td><input name="cost_comparison_original_yufei_baojian"/></td>
					<td><input name="cost_comparison_jiyooh_yufei_siliao"/></td>
					<td><input name="cost_comparison_jiyooh_yufei_yimiao"/></td>
					<td><input name="cost_comparison_jiyooh_yufei_baojian"/></td>
				</tr>
				<tr>
					<td>怀孕母猪</td>
					<td><input name="cost_comparison_original_huaiyunmuzhu_siliao"/></td>
					<td><input name="cost_comparison_original_huaiyunmuzhu_yimiao"/></td>
					<td><input name="cost_comparison_original_huaiyunmuzhu_baojian"/></td>
					<td><input name="cost_comparison_jiyooh_huaiyunmuzhu_siliao"/></td>
					<td><input name="cost_comparison_jiyooh_huaiyunmuzhu_yimiao"/></td>
					<td><input name="cost_comparison_jiyooh_huaiyunmuzhu_baojian"/></td>
				</tr>
				<tr>
					<td>哺乳母猪</td>
					<td><input name="cost_comparison_original_burumuzhu_siliao"/></td>
					<td><input name="cost_comparison_original_burumuzhu_yimiao"/></td>
					<td><input name="cost_comparison_original_burumuzhu_baojian"/></td>
					<td><input name="cost_comparison_jiyooh_burumuzhu_siliao"/></td>
					<td><input name="cost_comparison_jiyooh_burumuzhu_yimiao"/></td>
					<td><input name="cost_comparison_jiyooh_burumuzhu_baojian"/></td>
				</tr>
			</table>
<!-- 6.3综合效益评估报告 -->			
			<h1 align="center">(6.3)综合效益评估报告</h1>		
			<div align="center">
				<textarea class="Comprehensive_benefits" rows="10" cols="100" name="comprehensive_benefits"></textarea>			
			</div>
<!-- 5优堂猪场综合管理建议 -->			
			<h1 align="center">(7)5优堂猪场综合管理建议 </h1>		
			<div align="center">
				<textarea class="Comprehensive_benefits" rows="10" cols="100" name="management_advice"></textarea>			
			</div>
			<br>
		    <div align="center">
				<input type="submit" name="submit" value="提交"/>
			</div>
		</form>
		<script type="text/javascript">
			function yesorno(){
				var bh=document.getElementsByName("bianhao")[0].value;
				if(bh==""||bh==null){
					if (confirm("编号不能为空!"));
				}else{
					$.ajax({
						url:"<%=path %>/yesorno.do?bianhao="+bh, 
						type:"post",
						success:function(data){
							if(data=="false"){
								if (confirm("编号已存在,请修改!")){
									$("#bianhao").val("");
								}
							}
						}
					});
				}
			}
			
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
					$("#seledaqu").append("<option>--请选择--</option>");
					for(var i=0;i<list.length;i++){
						$("#seledaqu").append("<option>"+list[i].daquusername+"</option>");
					}
				}
		  	});
		  	function sele(){
		  		var usernane=$("#seledaqu").val();
		  		$("#selemendian").html("");
		  		$("#selemendian").append("<option>--请选择--</option>");
		  		if(usernane!="--请选择--"){
			  		$.ajax({
			  			type:"post",
			  			url:"<%=path %>/selectmendian.do?&mname="+usernane,
			  			success:function(data){
			  				var list=eval(data);
			  				for(var i=0;i<list.length;i++){
			  					$("#selemendian").append("<option>"+list[i].mname+"</option>");
			  				}
			  			}
			  		});
		  		}
		  	}
			
			
		</script>
  </body>
</html>
