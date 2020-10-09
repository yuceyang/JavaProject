package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jiyoo.dao.CustomerDetailsDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;

public class CustomerDetailsDaoImpl implements CustomerDetailsDao {
	@SuppressWarnings("static-access")
	public void cust(BigPackage bp) {
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		try {
		conn=new JdbcContext().getconn();
		sql="insert into jibenxinxi(bianhao,uname,sex,bir,ip,age,phone,pigfactoryname,pigbuildtime,yufeiarea,justnumber,justarea,justsownumber,sowtablenumber,baoyubednumber,winterheating,baoyuarea,baoyuhighbed,boilerscale,roomheatingmethod,baoyuheatingmethod,yufeiheatingmethod,pigfarmsorbig,orplans,weixin,guimo,daquusername,mdaqu) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, bp.getBianhao());
			pst.setString(2, bp.getUname());
			pst.setString(3, bp.getSex());
			pst.setString(4, bp.getBir());
			pst.setString(5, bp.getIp());
			pst.setString(6,bp.getAge());
			pst.setString(7,bp.getPhone());
			pst.setString(8,bp.getPigfactoryname());
			pst.setString(9,bp.getPigbuildtime());
			pst.setString(10,bp.getYufeiarea());
			pst.setString(11,bp.getJustnumber());
			pst.setString(12,bp.getJustarea());
			pst.setString(13,bp.getJustsownumber());
			pst.setString(14,bp.getSowtablenumber());
			pst.setString(15,bp.getBaoyubednumber());
			pst.setString(16,bp.getWinterheating());
			pst.setString(17,bp.getBaoyuarea());
			pst.setString(18,bp.getBaoyuhighbed());
			pst.setString(19,bp.getBoilerscale());
			pst.setString(20,bp.getRoomheatingmethod());
			pst.setString(21,bp.getBaoyuheatingmethod());
			pst.setString(22,bp.getYufeiheatingmethod());
			pst.setString(23,bp.getPigfarmsorbig());
			pst.setString(24,bp.getOrplans());
			pst.setString(25,bp.getWeixin());
			pst.setString(26,bp.getGuimo());
			pst.setString(27,bp.getDaquusername());
			pst.setString(28,bp.getMdaqu());
			pst.execute();
		sql="insert into details_2_1(bianhao,h_number,h_siliaopinzhong,h_rmb,h_y_name_1,h_y_name_2,h_y_name_3,h_y_name_4,h_factory_1,h_factory_2,h_factory_3,h_factory_4,h_b_drug_1,h_b_drug_2,h_b_drug_3,h_b_drug_4,b_number,b_siliaopinzhong,b_rmb,b_y_name_1,b_y_name_2,b_y_name_3,b_y_name_4,b_factory_1,b_factory_2,b_factory_3,b_factory_4,b_b_drug_1,b_b_drug_2,b_b_drug_3,b_b_drug_4) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
			pst=conn.prepareStatement(sql);
			pst.setString(1, bp.getBianhao());
			pst.setString(2, bp.getH_number());
			pst.setString(3,bp.getH_siliaopinzhong());
			pst.setString(4,bp.getH_rmb());
			pst.setString(5,bp.getH_y_name_1());
			pst.setString(6,bp.getH_y_name_2());
			pst.setString(7,bp.getH_y_name_3());
			pst.setString(8,bp.getH_y_name_4());
			pst.setString(9,bp.getH_factory_1());
			pst.setString(10,bp.getH_factory_2());
			pst.setString(11,bp.getH_factory_3());
			pst.setString(12,bp.getH_factory_4());
			pst.setString(13,bp.getH_b_drug_1());
			pst.setString(14,bp.getH_b_drug_2());
			pst.setString(15,bp.getH_b_drug_3());
			pst.setString(16,bp.getH_b_drug_4());
			pst.setString(17,bp.getB_number());
			pst.setString(18,bp.getB_siliaopinzhong());
			pst.setString(19,bp.getB_rmb());
			pst.setString(20,bp.getB_y_name_1());
			pst.setString(21,bp.getB_y_name_2());
			pst.setString(22,bp.getB_y_name_3());
			pst.setString(23,bp.getB_y_name_4());
			pst.setString(24,bp.getB_factory_1());
			pst.setString(25,bp.getB_factory_2());
			pst.setString(26,bp.getB_factory_3());
			pst.setString(27,bp.getB_factory_4());
			pst.setString(28,bp.getB_b_drug_1());
			pst.setString(29,bp.getB_b_drug_2());
			pst.setString(30,bp.getB_b_drug_3());
			pst.setString(31,bp.getB_b_drug_4());
			pst.execute();
		sql="insert into details_2_2(bianhao,sy_date,sy_fenmian,sy_pingjun_number,sy_cunhuo_number,sy_jun_zhong,sy_cunhuo_lv,sy_duannai_zhong) values(?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,bp.getBianhao());
			pst.setString(2,bp.getSy_date());
			pst.setString(3,bp.getSy_fenmian());
			pst.setString(4,bp.getSy_pingjun_number());
			pst.setString(5,bp.getSy_cunhuo_number());
			pst.setString(6,bp.getSy_jun_zhong());
			pst.setString(7,bp.getSy_cunhuo_lv());
			pst.setString(8,bp.getSy_duannai_zhong());
			pst.execute();
	    sql="insert into details_2_3(bianhao,buruzizhu_siliaopinzhong,buruzizhu_siliaopinpai,buruzizhu_siliaojiage,buruzizhu_yimiaomingcheng_1,buruzizhu_yimiaomingcheng_2,buruzizhu_yimiaomingcheng_3,buruzizhu_shengchanchangjia_1,buruzizhu_shengchanchangjia_2,buruzizhu_shengchanchangjia_3,buruzizhu_baojianyao_1,buruzizhu_baojianyao_2,buruzizhu_baojianyao_3," +
	   		"baoyuzhu_siliaopinzhong,baoyuzhu_siliaopinpai,baoyuzhu_siliaojiage,baoyuzhu_yimiaomingcheng_1,baoyuzhu_yimiaomingcheng_2,baoyuzhu_yimiaomingcheng_3,baoyuzhu_shengchanchangjia_1,baoyuzhu_shengchanchangjia_2,baoyuzhu_shengchanchangjia_3,baoyuzhu_baojianyao_1,baoyuzhu_baojianyao_2,baoyuzhu_baojianyao_3," +
	   		"yufeizhu_siliaopinzhong,yufeizhu_siliaopinpai,yufeizhu_siliaojiage,yufeizhu_yimiaomingcheng_1,yufeizhu_yimiaomingcheng_2,yufeizhu_yimiaomingcheng_3,yufeizhu_shengchanchangjia_1,yufeizhu_shengchanchangjia_2,yufeizhu_shengchanchangjia_3,yufeizhu_baojianyao_1,yufeizhu_baojianyao_2,yufeizhu_baojianyao_3) " +
	   		"values(" +
	   		"?,?,?,?,?,?,?,?,?,?," +
	   		"?,?,?,?,?,?,?,?,?,?," +
	   		"?,?,?,?,?,?,?,?,?,?," +
	   		"?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,bp.getBianhao());
			pst.setString(2,bp.getBuruzizhu_siliaopinzhong());
			pst.setString(3,bp.getBuruzizhu_siliaopinpai());
			pst.setString(4,bp.getBuruzizhu_siliaojiage());
			pst.setString(5,bp.getBuruzizhu_yimiaomingcheng_1());
			pst.setString(6,bp.getBuruzizhu_yimiaomingcheng_2());
			pst.setString(7,bp.getBuruzizhu_yimiaomingcheng_3());
			pst.setString(8,bp.getBuruzizhu_shengchanchangjia_1());
			pst.setString(9,bp.getBuruzizhu_shengchanchangjia_2());
			pst.setString(10,bp.getBuruzizhu_shengchanchangjia_3());
			pst.setString(11,bp.getBuruzizhu_baojianyao_1());
			pst.setString(12,bp.getBuruzizhu_baojianyao_2());
			pst.setString(13,bp.getBuruzizhu_baojianyao_3());
			
			pst.setString(14,bp.getBaoyuzhu_siliaopinzhong());
			pst.setString(15,bp.getBaoyuzhu_siliaopinpai());
			pst.setString(16,bp.getBaoyuzhu_siliaojiage());
			pst.setString(17,bp.getBaoyuzhu_yimiaomingcheng_1());
			pst.setString(18,bp.getBaoyuzhu_yimiaomingcheng_2());
			pst.setString(19,bp.getBaoyuzhu_yimiaomingcheng_3());
			pst.setString(20,bp.getBaoyuzhu_shengchanchangjia_1());
			pst.setString(21,bp.getBaoyuzhu_shengchanchangjia_2());
			pst.setString(22,bp.getBaoyuzhu_shengchanchangjia_3());
			pst.setString(23,bp.getBaoyuzhu_baojianyao_1());
			pst.setString(24,bp.getBaoyuzhu_baojianyao_2());
			pst.setString(25,bp.getBaoyuzhu_baojianyao_3());
			
			pst.setString(26,bp.getYufeizhu_siliaopinzhong());
			pst.setString(27,bp.getYufeizhu_siliaopinpai());
			pst.setString(28,bp.getYufeizhu_siliaojiage());
			pst.setString(29,bp.getYufeizhu_yimiaomingcheng_1());
			pst.setString(30,bp.getYufeizhu_yimiaomingcheng_2());
			pst.setString(31,bp.getYufeizhu_yimiaomingcheng_3());
			pst.setString(32,bp.getYufeizhu_shengchanchangjia_1());
			pst.setString(33,bp.getYufeizhu_shengchanchangjia_2());
			pst.setString(34,bp.getYufeizhu_shengchanchangjia_3());
			pst.setString(35,bp.getYufeizhu_baojianyao_1());
			pst.setString(36,bp.getYufeizhu_baojianyao_2());
			pst.setString(37,bp.getYufeizhu_baojianyao_3());
			pst.execute();
	    sql="insert into details_2_4(bianhao,buruzizhu_cunlanshuliang,buruzizhu_cunlanshijian,buruzizhu_chulanzhongliang,buruzizhu_jieduanchenghuobi,buruzizhu_jieduanliaoroubi,baoyuzhu_cunlanshuliang,baoyuzhu_cunlanshijian,baoyuzhu_chulanzhongliang,baoyuzhu_jieduanchenghuobi,baoyuzhu_jieduanliaoroubi,yufeizhu_cunlanshuliang,yufeizhu_cunlanshijian,yufeizhu_chulanzhongliang,yufeizhu_jieduanchenghuobi,yufeizhu_jieduanliaoroubi) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,bp.getBianhao());
			pst.setString(2,bp.getBuruzizhu_cunlanshuliang());
			pst.setString(3,bp.getBuruzizhu_cunlanshijian());
			pst.setString(4,bp.getBuruzizhu_chulanzhongliang());
			pst.setString(5,bp.getBuruzizhu_jieduanchenghuobi());
			pst.setString(6,bp.getBuruzizhu_jieduanliaoroubi());
			pst.setString(7,bp.getBaoyuzhu_cunlanshuliang());
			pst.setString(8,bp.getBaoyuzhu_cunlanshijian());
			pst.setString(9,bp.getBaoyuzhu_chulanzhongliang());
			pst.setString(10,bp.getBaoyuzhu_jieduanchenghuobi());
			pst.setString(11,bp.getBaoyuzhu_jieduanliaoroubi());
			pst.setString(12,bp.getYufeizhu_cunlanshuliang());
			pst.setString(13,bp.getYufeizhu_cunlanshijian());
			pst.setString(14,bp.getYufeizhu_chulanzhongliang());
			pst.setString(15,bp.getYufeizhu_jieduanchenghuobi());
			pst.setString(16,bp.getYufeizhu_jieduanliaoroubi());
			pst.execute();
	    sql="insert into details_2_5 values(?,?)";
	   		pst=conn.prepareStatement(sql);
	   		pst.setString(1,bp.getBianhao());
	   		pst.setString(2,bp.getDescribes());
	   		pst.execute();
	    sql="insert into details_3(" +
	    		"bianhao," +
	    		"muzhupeizhongfeimianlv_youxiubiaozhun," +
	    		"muzhupeizhongfeimianlv_shijizhibiao," +
	    		"muzhupeizhongfeimianlv_tishengqianli," +
	    		"nianjunchanzai_youxiubiaozhun," +
	    		"nianjunchanzai_shijizhibiao," +
	    		"nianjunchanzai_tishengqianli," +
	    		"junchanhuozishu_youxiubiaozhun," +
	    		"junchanhuozishu_shijizhibiao," +
	    		"junchanhuozishu_tishengqianli," +
	    		"buruzizhuchenghuolv_youxiubiaozhun," +
	    		"buruzizhuchenghuolv_shijizhibiao," +
	    		"buruzizhuchenghuolv_tishengqianli," +
	    		"chushengzhong_youxiubiaozhun," +
	    		"chushengzhong_shijizhibiao," +
	    		"chushengzhong_tishengqianli," +
	    		"duannaizhong_youxiubiaozhun," +
	    		"duannaizhong_shijizhibiao," +
	    		"duannaizhong_tishengqianli," +
	    		"baoyuchenghuolv_youxiubiaozhun," +
	    		"baoyuchenghuolv_shijizhibiao," +
	    		"baoyuchenghuolv_tishengqianli," +
	    		"lingzhong_youxiubiaozhun," +
	    		"lingzhong_shijizhibiao," +
	    		"lingzhong_tishengqianli," +
	    		"yufeichenghuolv_youxiubiaozhun," +
	    		"yufeichenghuolv_shijizhibiao," +
	    		"yufeichenghuolv_tishengqianli," +
	    		"shangshiling_youxiubiaozhun," +
	    		"shangshiling_shijizhibiao," +
	    		"shangshiling_tishengqianli," +
	    		"PSY_youxiubiaozhun," +
	    		"PSY_shijizhibiao," +
	    		"PSY_tishengqianli," +
	    		"MSY_youxiubiaozhun," +
	    		"MSY_shijizhibiao," +
	    		"MSY_tishengqianli," +
	    		"liaoroubi_youxiubiaozhun," +
	    		"liaoroubi_shijizhibiao," +
	    		"liaoroubi_tishengqianli," +
	    		"fangyifei_youxiubiaozhun," +
	    		"fangyifei_shijizhibiao," +
	    		"fangyifei_tishengqianli," +
	    		"yf_fangyifei_youxiubiaozhun," +
	    		"yf_fangyifei_shijizhibiao," +
	    		"yf_fangyifei_tishengqianli," +
	    		"zaorouchengben_youxiubiaozhun," +
	    		"zaorouchengben_shijizhibiao," +
	    		"zaorouchengben_tishengqianli," +
	    		"yingkuidian_youxiubiaozhun," +
	    		"yingkuidian_shijizhibiao," +
	    		"yingkuidian_tishengqianli) values(" +
	    		"?,?,?,?,?,?,?,?,?,?," +
	    		"?,?,?,?,?,?,?,?,?,?," +
	    		"?,?,?,?,?,?,?,?,?,?," +
	    		"?,?,?,?,?,?,?,?,?,?," +
	    		"?,?,?,?,?,?,?,?,?,?," +
	    		"?,?)";
	    	pst=conn.prepareStatement(sql);
	    	pst.setString(1,bp.getBianhao());
	    	pst.setString(2,bp.getMuzhupeizhongfeimianlv_youxiubiaozhun());
	    	pst.setString(3,bp.getMuzhupeizhongfeimianlv_shijizhibiao());
	    	pst.setString(4,bp.getMuzhupeizhongfeimianlv_tishengqianli());
	    	pst.setString(5,bp.getNianjunchanzai_youxiubiaozhun());
	    	pst.setString(6,bp.getNianjunchanzai_shijizhibiao());
	    	pst.setString(7,bp.getNianjunchanzai_tishengqianli());
	    	pst.setString(8,bp.getJunchanhuozishu_youxiubiaozhun());
	    	pst.setString(9,bp.getJunchanhuozishu_shijizhibiao());
	    	pst.setString(10,bp.getJunchanhuozishu_tishengqianli());
	    	pst.setString(11,bp.getBuruzizhuchenghuolv_youxiubiaozhun());
	    	pst.setString(12,bp.getBuruzizhuchenghuolv_shijizhibiao());
	    	pst.setString(13,bp.getBuruzizhuchenghuolv_tishengqianli());
	    	pst.setString(14,bp.getChushengzhong_youxiubiaozhun());
	    	pst.setString(15,bp.getChushengzhong_shijizhibiao());
	    	pst.setString(16,bp.getChushengzhong_tishengqianli());
	    	pst.setString(17,bp.getDuannaizhong_youxiubiaozhun());
	    	pst.setString(18,bp.getDuannaizhong_shijizhibiao());
	    	pst.setString(19,bp.getDuannaizhong_tishengqianli());
	    	pst.setString(20,bp.getBaoyuchenghuolv_youxiubiaozhun());
	    	pst.setString(21,bp.getBaoyuchenghuolv_shijizhibiao());
	    	pst.setString(22,bp.getBaoyuchenghuolv_tishengqianli());
	    	pst.setString(23,bp.getLingzhong_youxiubiaozhun());
	    	pst.setString(24,bp.getLingzhong_shijizhibiao());
	    	pst.setString(25,bp.getLingzhong_tishengqianli());
	    	pst.setString(26,bp.getYufeichenghuolv_youxiubiaozhun());
	    	pst.setString(27,bp.getYufeichenghuolv_shijizhibiao());
	    	pst.setString(28,bp.getYufeichenghuolv_tishengqianli());
	    	pst.setString(29,bp.getShangshiling_youxiubiaozhun());
	    	pst.setString(30,bp.getShangshiling_shijizhibiao());
	    	pst.setString(31,bp.getShangshiling_tishengqianli());
	    	pst.setString(32,bp.getPSY_youxiubiaozhun());
	    	pst.setString(33,bp.getPSY_shijizhibiao());
	    	pst.setString(34,bp.getPSY_tishengqianli());
	    	pst.setString(35,bp.getMSY_youxiubiaozhun());
	    	pst.setString(36,bp.getMSY_shijizhibiao());
	    	pst.setString(37,bp.getMSY_tishengqianli());
	    	pst.setString(38,bp.getLiaoroubi_youxiubiaozhun());
	    	pst.setString(39,bp.getLiaoroubi_shijizhibiao());
	    	pst.setString(40,bp.getLiaoroubi_tishengqianli());
	    	pst.setString(41,bp.getFangyifei_youxiubiaozhun());
	    	pst.setString(42,bp.getFangyifei_shijizhibiao());
	    	pst.setString(43,bp.getFangyifei_tishengqianli());
	    	pst.setString(44,bp.getYf_fangyifei_youxiubiaozhun());
	    	pst.setString(45,bp.getYf_fangyifei_shijizhibiao());
	    	pst.setString(46,bp.getYf_fangyifei_tishengqianli());
	    	pst.setString(47,bp.getZaorouchengben_youxiubiaozhun());
	    	pst.setString(48,bp.getZaorouchengben_shijizhibiao());
	    	pst.setString(49,bp.getZaorouchengben_tishengqianli());
	    	pst.setString(50,bp.getYingkuidian_youxiubiaozhun());
	    	pst.setString(51,bp.getYingkuidian_shijizhibiao());
	    	pst.setString(52,bp.getYingkuidian_tishengqianli());
	    	pst.execute();
	  sql="insert into details_4_1 values(?,?,?)";
	  		pst=conn.prepareStatement(sql);
	  		pst.setString(1,bp.getBianhao());
	  		pst.setString(2,bp.getReport_analysis());
	  		pst.setString(3,bp.getReport_conclusion());
	  		pst.execute();
	  sql="insert into details_4_2 values(?,?,?)";
	  		pst=conn.prepareStatement(sql);
	  		pst.setString(1,bp.getBianhao());
	  		pst.setString(2,bp.getAnatomy_analysis());
	  		pst.setString(3,bp.getAnatomy_conclusion());
	  		pst.execute();
	  sql="insert into details_4_3 values(?,?,?)";
	  		pst=conn.prepareStatement(sql);
	  		pst.setString(1,bp.getBianhao());
	  		pst.setString(2,bp.getSymptoms_performance());
	  		pst.setString(3,bp.getSymptoms_conclusion());
	  		pst.execute();
	  sql="insert into details_4_4 values(?,?)";
	  		pst=conn.prepareStatement(sql);
	  		pst.setString(1,bp.getBianhao());
	  		pst.setString(2,bp.getComprehensive_report());
	  		pst.execute();
	  		
	  sql="insert into details_5(bianhao,overall_solution_renshen_plan,overall_solution_renshen_cycle,overall_solution_renshen_effect,overall_solution_buru_plan,overall_solution_buru_cycle,overall_solution_buru_effect,overall_solution_baoyu_plan,overall_solution_baoyu_cycle,overall_solution_baoyu_effect) values(?,?,?,?,?,?,?,?,?,?)"; 		
	 		pst=conn.prepareStatement(sql);
	 		pst.setString(1,bp.getBianhao());
		    pst.setString(2,bp.getOverall_solution_renshen_plan());
		    pst.setString(3,bp.getOverall_solution_renshen_cycle());
		    pst.setString(4,bp.getOverall_solution_renshen_effect());
		    pst.setString(5,bp.getOverall_solution_buru_plan());
		    pst.setString(6,bp.getOverall_solution_buru_cycle());
		    pst.setString(7,bp.getOverall_solution_buru_effect());
		    pst.setString(8,bp.getOverall_solution_baoyu_plan());
		    pst.setString(9,bp.getOverall_solution_baoyu_cycle());
		    pst.setString(10,bp.getOverall_solution_baoyu_effect());
		    pst.execute();
	  sql="insert into details_6_1(bianhao,muzhupeizhongfeimianlv_yuanlaizhibiao,muzhupeizhongfeimianlv_mubiaozhibiao,muzhupeizhongfeimianlv_gaishanbili,nianjunchanzai_yuanlaizhibiao,nianjunchanzai_mubiaozhibiao,nianjunchanzai_gaishanbili,junchanhuozishu_yuanlaizhibiao,junchanhuozishu_mubiaozhibiao,junchanhuozishu_gaishanbili,buruzizhuchenghuolv_yuanlaizhibiao,buruzizhuchenghuolv_mubiaozhibiao,buruzizhuchenghuolv_gaishanbili,chushengzhong_yuanlaizhibiao,chushengzhong_mubiaozhibiao,chushengzhong_gaishanbili,duannaizhong_yuanlaizhibiao,duannaizhong_mubiaozhibiao,duannaizhong_gaishanbili,baoyuchenghuolv_yuanlaizhibiao,baoyuchenghuolv_mubiaozhibiao,baoyuchenghuolv_gaishanbili,lingzhong_yuanlaizhibiao,lingzhong_mubiaozhibiao,lingzhong_gaishanbili,yufeichenghuolv_yuanlaizhibiao,yufeichenghuolv_mubiaozhibiao,yufeichenghuolv_gaishanbili,shangshiling_yuanlaizhibiao,shangshiling_mubiaozhibiao,shangshiling_gaishanbili,PSY_yuanlaizhibiao,PSY_mubiaozhibiao,PSY_gaishanbili,MSY_yuanlaizhibiao,MSY_mubiaozhibiao,MSY_gaishanbili,liaoroubi_yuanlaizhibiao,liaoroubi_mubiaozhibiao,liaoroubi_gaishanbili,fangyifei_yuanlaizhibiao,fangyifei_mubiaozhibiao,fangyifei_gaishanbili,yf_fangyifei_yuanlaizhibiao,yf_fangyifei_mubiaozhibiao,yf_fangyifei_gaishanbili,zaorouchengben_yuanlaizhibiao,zaorouchengben_mubiaozhibiao,zaorouchengben_gaishanbili,yingkuidian_yuanlaizhibiao,yingkuidian_mubiaozhibiao,yingkuidian_gaishanbili) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,bp.getBianhao());
			pst.setString(2,bp.getMuzhupeizhongfeimianlv_yuanlaizhibiao());
			pst.setString(3,bp.getMuzhupeizhongfeimianlv_mubiaozhibiao());
			pst.setString(4,bp.getMuzhupeizhongfeimianlv_gaishanbili());
			pst.setString(5,bp.getNianjunchanzai_yuanlaizhibiao());
			pst.setString(6,bp.getNianjunchanzai_mubiaozhibiao());
			pst.setString(7,bp.getNianjunchanzai_gaishanbili());
			pst.setString(8,bp.getJunchanhuozishu_yuanlaizhibiao());
			pst.setString(9,bp.getJunchanhuozishu_mubiaozhibiao());
			pst.setString(10,bp.getJunchanhuozishu_gaishanbili());
			pst.setString(11,bp.getBuruzizhuchenghuolv_yuanlaizhibiao());
			pst.setString(12,bp.getBuruzizhuchenghuolv_mubiaozhibiao());
			pst.setString(13,bp.getBuruzizhuchenghuolv_gaishanbili());
			pst.setString(14,bp.getChushengzhong_yuanlaizhibiao());
			pst.setString(15,bp.getChushengzhong_mubiaozhibiao());
			pst.setString(16,bp.getChushengzhong_gaishanbili());
			pst.setString(17,bp.getDuannaizhong_yuanlaizhibiao());
			pst.setString(18,bp.getDuannaizhong_mubiaozhibiao());
			pst.setString(19,bp.getDuannaizhong_gaishanbili());
			pst.setString(20,bp.getBaoyuchenghuolv_yuanlaizhibiao());
			pst.setString(21,bp.getBaoyuchenghuolv_mubiaozhibiao());
			pst.setString(22,bp.getBaoyuchenghuolv_gaishanbili());
			pst.setString(23,bp.getLingzhong_yuanlaizhibiao());
			pst.setString(24,bp.getLingzhong_mubiaozhibiao());
			pst.setString(25,bp.getLingzhong_gaishanbili());
			pst.setString(26,bp.getYufeichenghuolv_yuanlaizhibiao());
			pst.setString(27,bp.getYufeichenghuolv_mubiaozhibiao());
			pst.setString(28,bp.getYufeichenghuolv_gaishanbili());
			pst.setString(29,bp.getShangshiling_yuanlaizhibiao());
			pst.setString(30,bp.getShangshiling_mubiaozhibiao());
			pst.setString(31,bp.getShangshiling_gaishanbili());
			pst.setString(32,bp.getPSY_yuanlaizhibiao());
			pst.setString(33,bp.getPSY_mubiaozhibiao());
			pst.setString(34,bp.getPSY_gaishanbili());
			pst.setString(35,bp.getMSY_yuanlaizhibiao());
			pst.setString(36,bp.getMSY_mubiaozhibiao());
			pst.setString(37,bp.getMSY_gaishanbili());
			pst.setString(38,bp.getLiaoroubi_yuanlaizhibiao());
			pst.setString(39,bp.getLiaoroubi_mubiaozhibiao());
			pst.setString(40,bp.getLiaoroubi_gaishanbili());
			pst.setString(41,bp.getFangyifei_yuanlaizhibiao());
			pst.setString(42,bp.getFangyifei_mubiaozhibiao());
			pst.setString(43,bp.getFangyifei_gaishanbili());
			pst.setString(44,bp.getYf_fangyifei_yuanlaizhibiao());
			pst.setString(45,bp.getYf_fangyifei_mubiaozhibiao());
			pst.setString(46,bp.getYf_fangyifei_gaishanbili());
			pst.setString(47,bp.getZaorouchengben_yuanlaizhibiao());
			pst.setString(48,bp.getZaorouchengben_mubiaozhibiao());
			pst.setString(49,bp.getZaorouchengben_gaishanbili());
			pst.setString(50,bp.getYingkuidian_yuanlaizhibiao());
			pst.setString(51,bp.getYingkuidian_mubiaozhibiao());
			pst.setString(52,bp.getYingkuidian_gaishanbili());
			pst.execute();
	   sql="insert into details_6_2(bianhao,cost_comparison_original_buruzizhu_siliao,cost_comparison_original_buruzizhu_yimiao,cost_comparison_original_buruzizhu_baojian,cost_comparison_jiyooh_buruzizhu_siliao,cost_comparison_jiyooh_buruzizhu_yimiao,cost_comparison_jiyooh_buruzizhu_baojian,cost_comparison_original_baoyuzhu_siliao,cost_comparison_original_baoyuzhu_yimiao,cost_comparison_original_baoyuzhu_baojian,cost_comparison_jiyooh_baoyuzhu_siliao,cost_comparison_jiyooh_baoyuzhu_yimiao,cost_comparison_jiyooh_baoyuzhu_baojian,cost_comparison_original_yufei_siliao,cost_comparison_original_yufei_yimiao,cost_comparison_original_yufei_baojian,cost_comparison_jiyooh_yufei_siliao,cost_comparison_jiyooh_yufei_yimiao,cost_comparison_jiyooh_yufei_baojian,cost_comparison_original_huaiyunmuzhu_siliao,cost_comparison_original_huaiyunmuzhu_yimiao,cost_comparison_original_huaiyunmuzhu_baojian,cost_comparison_jiyooh_huaiyunmuzhu_siliao,cost_comparison_jiyooh_huaiyunmuzhu_yimiao,cost_comparison_jiyooh_huaiyunmuzhu_baojian,cost_comparison_original_burumuzhu_siliao,cost_comparison_original_burumuzhu_yimiao,cost_comparison_original_burumuzhu_baojian,cost_comparison_jiyooh_burumuzhu_siliao,cost_comparison_jiyooh_burumuzhu_yimiao,cost_comparison_jiyooh_burumuzhu_baojian) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,bp.getBianhao());
			pst.setString(2,bp.getCost_comparison_original_buruzizhu_siliao());
			pst.setString(3,bp.getCost_comparison_original_buruzizhu_yimiao());
			pst.setString(4,bp.getCost_comparison_original_buruzizhu_baojian());
			pst.setString(5,bp.getCost_comparison_jiyooh_buruzizhu_siliao());
			pst.setString(6,bp.getCost_comparison_jiyooh_buruzizhu_yimiao());
			pst.setString(7,bp.getCost_comparison_jiyooh_buruzizhu_baojian());
			pst.setString(8,bp.getCost_comparison_original_baoyuzhu_siliao());
			pst.setString(9,bp.getCost_comparison_original_baoyuzhu_yimiao());
			pst.setString(10,bp.getCost_comparison_original_baoyuzhu_baojian());
			pst.setString(11,bp.getCost_comparison_jiyooh_baoyuzhu_siliao());
			pst.setString(12,bp.getCost_comparison_jiyooh_baoyuzhu_yimiao());
			pst.setString(13,bp.getCost_comparison_jiyooh_baoyuzhu_baojian());
			pst.setString(14,bp.getCost_comparison_original_yufei_siliao());
			pst.setString(15,bp.getCost_comparison_original_yufei_yimiao());
			pst.setString(16,bp.getCost_comparison_original_yufei_baojian());
			pst.setString(17,bp.getCost_comparison_jiyooh_yufei_siliao());
			pst.setString(18,bp.getCost_comparison_jiyooh_yufei_yimiao());
			pst.setString(19,bp.getCost_comparison_jiyooh_yufei_baojian());
			pst.setString(20,bp.getCost_comparison_original_huaiyunmuzhu_siliao());
			pst.setString(21,bp.getCost_comparison_original_huaiyunmuzhu_yimiao());
			pst.setString(22,bp.getCost_comparison_original_huaiyunmuzhu_baojian());
			pst.setString(23,bp.getCost_comparison_jiyooh_huaiyunmuzhu_siliao());
			pst.setString(24,bp.getCost_comparison_jiyooh_huaiyunmuzhu_yimiao());
			pst.setString(25,bp.getCost_comparison_jiyooh_huaiyunmuzhu_baojian());
			pst.setString(26,bp.getCost_comparison_original_burumuzhu_siliao());
			pst.setString(27,bp.getCost_comparison_original_burumuzhu_yimiao());
			pst.setString(28,bp.getCost_comparison_original_burumuzhu_baojian());
			pst.setString(29,bp.getCost_comparison_jiyooh_burumuzhu_siliao());
			pst.setString(30,bp.getCost_comparison_jiyooh_burumuzhu_yimiao());
			pst.setString(31,bp.getCost_comparison_jiyooh_burumuzhu_baojian());
			pst.execute();
	  sql="insert into details_6_3(bianhao,comprehensive_benefits) values(?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, bp.getBianhao());
			pst.setString(2, bp.getComprehensive_benefits());
			pst.execute();
			
	  sql="insert into details_7(bianhao,management_advice) values(?,?)";
		 	pst=conn.prepareStatement(sql);
			pst.setString(1, bp.getBianhao());
			pst.setString(2, bp.getManagement_advice());
			pst.execute();

			
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
