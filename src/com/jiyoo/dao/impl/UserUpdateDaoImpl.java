package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.UserUpdateDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;

public class UserUpdateDaoImpl implements UserUpdateDao {
	@SuppressWarnings({ "static-access" })
	public void userUpdateDaoImpls(BigPackage bp,String oldbianhao){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		try {
			conn=new JdbcContext().getconn();
			
			//基本信息
			sql="UPDATE jibenxinxi SET bianhao=\""+bp.getBianhao()+
					"\",uname=\""+bp.getUname()+
					"\",ip=\""+bp.getIp()+
					"\",age=\""+bp.getAge()+
					"\",phone=\""+bp.getPhone()+
					"\",bir=\""+bp.getBir()+
					"\",sex=\""+bp.getSex()+
					"\",pigfactoryname=\""+bp.getPigfactoryname()+
					"\",pigbuildtime=\""+bp.getPigbuildtime()+
					"\",yufeiarea=\""+bp.getYufeiarea()+
					"\",justnumber=\""+bp.getJustnumber()+
					"\",justarea=\""+bp.getJustarea()+
					"\",justsownumber=\""+bp.getJustsownumber()+
					"\",sowtablenumber=\""+bp.getSowtablenumber()+
					"\",baoyubednumber=\""+bp.getBaoyubednumber()+
					"\",winterheating=\""+bp.getWinterheating()+
					"\",baoyuarea=\""+bp.getBaoyuarea()+
					"\",baoyuhighbed=\""+bp.getBaoyuhighbed()+
					"\",boilerscale=\""+bp.getBoilerscale()+
					"\",roomheatingmethod=\""+bp.getRoomheatingmethod()+
					"\",baoyuheatingmethod=\""+bp.getBaoyuheatingmethod()+
					"\",yufeiheatingmethod=\""+bp.getYufeiheatingmethod()+
					"\",pigfarmsorbig=\""+bp.getPigfarmsorbig()+
					"\",orplans=\""+bp.getOrplans()+
					"\",weixin=\""+bp.getWeixin()+
					"\",guimo=\""+bp.getGuimo()+
					"\",daquusername=\""+bp.getDaquusername()+
					"\",mdaqu=\""+bp.getMdaqu()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
		
			//表2.1		
			sql="UPDATE details_2_1 SET bianhao=\""+bp.getBianhao()+
					"\",h_number=\""+bp.getH_number()+
					"\",h_siliaopinzhong=\""+bp.getH_siliaopinzhong()+
					"\",h_rmb=\""+bp.getH_rmb()+
					"\",h_y_name_1=\""+bp.getH_y_name_1()+
					"\",h_y_name_2=\""+bp.getH_y_name_2()+
					"\",h_y_name_3=\""+bp.getH_y_name_3()+
					"\",h_y_name_4=\""+bp.getH_y_name_4()+
					"\",h_factory_1=\""+bp.getH_factory_1()+
					"\",h_factory_2=\""+bp.getH_factory_2()+
					"\",h_factory_3=\""+bp.getH_factory_3()+
					"\",h_factory_4=\""+bp.getH_factory_4()+
					"\",h_b_drug_1=\""+bp.getH_b_drug_1()+
					"\",h_b_drug_2=\""+bp.getH_b_drug_2()+
					"\",h_b_drug_3=\""+bp.getH_b_drug_3()+
					"\",h_b_drug_4=\""+bp.getH_b_drug_4()+
					"\",b_number=\""+bp.getB_number()+
					"\",b_siliaopinzhong=\""+bp.getB_siliaopinzhong()+
					"\",b_rmb=\""+bp.getB_rmb()+
					"\",b_y_name_1=\""+bp.getB_y_name_1()+
					"\",b_y_name_2=\""+bp.getB_y_name_2()+
					"\",b_y_name_3=\""+bp.getB_y_name_3()+
					"\",b_y_name_4=\""+bp.getB_y_name_4()+
					"\",b_factory_1=\""+bp.getB_factory_1()+
					"\",b_factory_2=\""+bp.getB_factory_2()+
					"\",b_factory_3=\""+bp.getB_factory_3()+
					"\",b_factory_4=\""+bp.getB_factory_4()+
					"\",b_b_drug_1=\""+bp.getB_b_drug_1()+
					"\",b_b_drug_2=\""+bp.getB_b_drug_2()+
					"\",b_b_drug_3=\""+bp.getB_b_drug_3()+
					"\",b_b_drug_4=\""+bp.getB_b_drug_4()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			//表2.2
			sql="UPDATE details_2_2 SET bianhao=\""+bp.getBianhao()+
					"\",sy_date=\""+bp.getSy_date()+
					"\",sy_fenmian=\""+bp.getSy_fenmian()+
					"\",sy_pingjun_number=\""+bp.getSy_pingjun_number()+
					"\",sy_cunhuo_number=\""+bp.getSy_cunhuo_number()+
					"\",sy_jun_zhong=\""+bp.getSy_jun_zhong()+
					"\",sy_cunhuo_lv=\""+bp.getSy_cunhuo_lv()+
					"\",sy_duannai_zhong=\""+bp.getSy_duannai_zhong()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			//表2.3
			sql="UPDATE details_2_3 SET bianhao=\""+bp.getBianhao()+
					"\",buruzizhu_siliaopinzhong=\""+bp.getBuruzizhu_siliaopinzhong()+
					"\",buruzizhu_siliaopinpai=\""+bp.getBuruzizhu_siliaopinpai()+
					"\",buruzizhu_siliaojiage=\""+bp.getBuruzizhu_siliaojiage()+
					"\",buruzizhu_yimiaomingcheng_1=\""+bp.getBuruzizhu_yimiaomingcheng_1()+
					"\",buruzizhu_yimiaomingcheng_2=\""+bp.getBuruzizhu_yimiaomingcheng_2()+
					"\",buruzizhu_yimiaomingcheng_3=\""+bp.getBuruzizhu_yimiaomingcheng_3()+
					"\",buruzizhu_shengchanchangjia_1=\""+bp.getBuruzizhu_shengchanchangjia_1()+
					"\",buruzizhu_shengchanchangjia_2=\""+bp.getBuruzizhu_shengchanchangjia_2()+
					"\",buruzizhu_shengchanchangjia_3=\""+bp.getBuruzizhu_shengchanchangjia_3()+
					"\",buruzizhu_baojianyao_1=\""+bp.getBuruzizhu_baojianyao_1()+
					"\",buruzizhu_baojianyao_2=\""+bp.getBuruzizhu_baojianyao_2()+
					"\",buruzizhu_baojianyao_3=\""+bp.getBuruzizhu_baojianyao_3()+
					"\",baoyuzhu_siliaopinzhong=\""+bp.getBaoyuzhu_siliaopinzhong()+
					"\",baoyuzhu_siliaopinpai=\""+bp.getBaoyuzhu_siliaopinpai()+
					"\",baoyuzhu_siliaojiage=\""+bp.getBaoyuzhu_siliaojiage()+
					"\",baoyuzhu_yimiaomingcheng_1=\""+bp.getBaoyuzhu_yimiaomingcheng_1()+
					"\",baoyuzhu_yimiaomingcheng_2=\""+bp.getBaoyuzhu_yimiaomingcheng_2()+
					"\",baoyuzhu_yimiaomingcheng_3=\""+bp.getBaoyuzhu_yimiaomingcheng_3()+
					"\",baoyuzhu_shengchanchangjia_1=\""+bp.getBaoyuzhu_shengchanchangjia_1()+
					"\",baoyuzhu_shengchanchangjia_2=\""+bp.getBaoyuzhu_shengchanchangjia_2()+
					"\",baoyuzhu_shengchanchangjia_3=\""+bp.getBaoyuzhu_shengchanchangjia_3()+
					"\",baoyuzhu_baojianyao_1=\""+bp.getBaoyuzhu_baojianyao_1()+
					"\",baoyuzhu_baojianyao_2=\""+bp.getBaoyuzhu_baojianyao_2()+
					"\",baoyuzhu_baojianyao_3=\""+bp.getBaoyuzhu_baojianyao_3()+
					"\",yufeizhu_siliaopinzhong=\""+bp.getYufeizhu_siliaopinzhong()+
					"\",yufeizhu_siliaopinpai=\""+bp.getYufeizhu_siliaopinpai()+
					"\",yufeizhu_siliaojiage=\""+bp.getYufeizhu_siliaojiage()+
					"\",yufeizhu_yimiaomingcheng_1=\""+bp.getYufeizhu_yimiaomingcheng_1()+
					"\",yufeizhu_yimiaomingcheng_2=\""+bp.getYufeizhu_yimiaomingcheng_2()+
					"\",yufeizhu_yimiaomingcheng_3=\""+bp.getYufeizhu_yimiaomingcheng_3()+
					"\",yufeizhu_shengchanchangjia_1=\""+bp.getYufeizhu_shengchanchangjia_1()+
					"\",yufeizhu_shengchanchangjia_2=\""+bp.getYufeizhu_shengchanchangjia_2()+
					"\",yufeizhu_shengchanchangjia_3=\""+bp.getYufeizhu_shengchanchangjia_3()+
					"\",yufeizhu_baojianyao_1=\""+bp.getYufeizhu_baojianyao_1()+
					"\",yufeizhu_baojianyao_2=\""+bp.getYufeizhu_baojianyao_2()+
					"\",yufeizhu_baojianyao_3=\""+bp.getYufeizhu_baojianyao_3()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
					pst=conn.prepareStatement(sql);
					pst.execute();
			
			//表2.4
			sql="UPDATE details_2_4 SET bianhao=\""+bp.getBianhao()+
					"\",buruzizhu_cunlanshuliang=\""+bp.getBuruzizhu_cunlanshuliang()+
					"\",buruzizhu_cunlanshijian=\""+bp.getBuruzizhu_cunlanshijian()+
					"\",buruzizhu_chulanzhongliang=\""+bp.getBuruzizhu_chulanzhongliang()+
					"\",buruzizhu_jieduanchenghuobi=\""+bp.getBuruzizhu_jieduanchenghuobi()+
					"\",buruzizhu_jieduanliaoroubi=\""+bp.getBuruzizhu_jieduanliaoroubi()+
					"\",baoyuzhu_cunlanshuliang=\""+bp.getBaoyuzhu_cunlanshuliang()+
					"\",baoyuzhu_cunlanshijian=\""+bp.getBaoyuzhu_cunlanshijian()+
					"\",baoyuzhu_chulanzhongliang=\""+bp.getBaoyuzhu_chulanzhongliang()+
					"\",baoyuzhu_jieduanchenghuobi=\""+bp.getBaoyuzhu_jieduanchenghuobi()+
					"\",baoyuzhu_jieduanliaoroubi=\""+bp.getBaoyuzhu_jieduanliaoroubi()+
					"\",yufeizhu_cunlanshuliang=\""+bp.getYufeizhu_cunlanshuliang()+
					"\",yufeizhu_cunlanshijian=\""+bp.getYufeizhu_cunlanshijian()+
					"\",yufeizhu_chulanzhongliang=\""+bp.getYufeizhu_chulanzhongliang()+
					"\",yufeizhu_jieduanchenghuobi=\""+bp.getYufeizhu_jieduanchenghuobi()+
					"\",yufeizhu_jieduanliaoroubi=\""+bp.getYufeizhu_jieduanliaoroubi()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			//表2.5
			sql="UPDATE details_2_5 SET bianhao=\""+bp.getBianhao()+
					"\",describes=\""+bp.getDescribes()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			//表3
			sql="UPDATE details_3 SET bianhao=\""+bp.getBianhao()+
					"\",muzhupeizhongfeimianlv_youxiubiaozhun=\""+bp.getMuzhupeizhongfeimianlv_youxiubiaozhun()+
					"\",muzhupeizhongfeimianlv_shijizhibiao=\""+bp.getMuzhupeizhongfeimianlv_shijizhibiao()+
					"\",muzhupeizhongfeimianlv_tishengqianli=\""+bp.getMuzhupeizhongfeimianlv_tishengqianli()+
					"\",nianjunchanzai_youxiubiaozhun=\""+bp.getNianjunchanzai_youxiubiaozhun()+
					"\",nianjunchanzai_shijizhibiao=\""+bp.getNianjunchanzai_shijizhibiao()+
					"\",nianjunchanzai_tishengqianli=\""+bp.getNianjunchanzai_tishengqianli()+
					"\",junchanhuozishu_youxiubiaozhun=\""+bp.getJunchanhuozishu_youxiubiaozhun()+
					"\",junchanhuozishu_shijizhibiao=\""+bp.getJunchanhuozishu_shijizhibiao()+
					"\",junchanhuozishu_tishengqianli=\""+bp.getJunchanhuozishu_tishengqianli()+
					"\",buruzizhuchenghuolv_youxiubiaozhun=\""+bp.getBuruzizhuchenghuolv_youxiubiaozhun()+
					"\",buruzizhuchenghuolv_shijizhibiao=\""+bp.getBuruzizhuchenghuolv_shijizhibiao()+
					"\",buruzizhuchenghuolv_tishengqianli=\""+bp.getBuruzizhuchenghuolv_tishengqianli()+
					"\",chushengzhong_youxiubiaozhun=\""+bp.getChushengzhong_youxiubiaozhun()+
					"\",chushengzhong_shijizhibiao=\""+bp.getChushengzhong_shijizhibiao()+
					"\",chushengzhong_tishengqianli=\""+bp.getChushengzhong_tishengqianli()+
					"\",duannaizhong_youxiubiaozhun=\""+bp.getDuannaizhong_youxiubiaozhun()+
					"\",duannaizhong_shijizhibiao=\""+bp.getDuannaizhong_shijizhibiao()+
					"\",duannaizhong_tishengqianli=\""+bp.getDuannaizhong_tishengqianli()+
					"\",baoyuchenghuolv_youxiubiaozhun=\""+bp.getBaoyuchenghuolv_youxiubiaozhun()+
					"\",baoyuchenghuolv_shijizhibiao=\""+bp.getBaoyuchenghuolv_shijizhibiao()+
					"\",baoyuchenghuolv_tishengqianli=\""+bp.getBaoyuchenghuolv_tishengqianli()+
					"\",lingzhong_youxiubiaozhun=\""+bp.getLingzhong_youxiubiaozhun()+
					"\",lingzhong_shijizhibiao=\""+bp.getLingzhong_shijizhibiao()+
					"\",lingzhong_tishengqianli=\""+bp.getLingzhong_tishengqianli()+
					"\",yufeichenghuolv_youxiubiaozhun=\""+bp.getYufeichenghuolv_youxiubiaozhun()+
					"\",yufeichenghuolv_shijizhibiao=\""+bp.getYufeichenghuolv_shijizhibiao()+
					"\",yufeichenghuolv_tishengqianli=\""+bp.getYufeichenghuolv_tishengqianli()+
					"\",shangshiling_youxiubiaozhun=\""+bp.getShangshiling_youxiubiaozhun()+
					"\",shangshiling_shijizhibiao=\""+bp.getShangshiling_shijizhibiao()+
					"\",shangshiling_tishengqianli=\""+bp.getShangshiling_tishengqianli()+
					"\",PSY_youxiubiaozhun=\""+bp.getPSY_youxiubiaozhun()+
					"\",PSY_shijizhibiao=\""+bp.getPSY_shijizhibiao()+
					"\",PSY_tishengqianli=\""+bp.getPSY_tishengqianli()+
					"\",MSY_youxiubiaozhun=\""+bp.getMSY_youxiubiaozhun()+
					"\",MSY_shijizhibiao=\""+bp.getMSY_shijizhibiao()+
					"\",MSY_tishengqianli=\""+bp.getMSY_tishengqianli()+
					"\",liaoroubi_youxiubiaozhun=\""+bp.getLiaoroubi_youxiubiaozhun()+
					"\",liaoroubi_shijizhibiao=\""+bp.getLiaoroubi_shijizhibiao()+
					"\",liaoroubi_tishengqianli=\""+bp.getLiaoroubi_tishengqianli()+
					"\",fangyifei_youxiubiaozhun=\""+bp.getFangyifei_youxiubiaozhun()+
					"\",fangyifei_shijizhibiao=\""+bp.getFangyifei_shijizhibiao()+
					"\",fangyifei_tishengqianli=\""+bp.getFangyifei_tishengqianli()+
					"\",yf_fangyifei_youxiubiaozhun=\""+bp.getYf_fangyifei_youxiubiaozhun()+
					"\",yf_fangyifei_shijizhibiao=\""+bp.getYf_fangyifei_shijizhibiao()+
					"\",yf_fangyifei_tishengqianli=\""+bp.getYf_fangyifei_tishengqianli()+
					"\",zaorouchengben_youxiubiaozhun=\""+bp.getZaorouchengben_youxiubiaozhun()+
					"\",zaorouchengben_shijizhibiao=\""+bp.getZaorouchengben_shijizhibiao()+
					"\",zaorouchengben_tishengqianli=\""+bp.getZaorouchengben_tishengqianli()+
					"\",yingkuidian_youxiubiaozhun=\""+bp.getYingkuidian_youxiubiaozhun()+
					"\",yingkuidian_shijizhibiao=\""+bp.getYingkuidian_shijizhibiao()+
					"\",yingkuidian_tishengqianli=\""+bp.getYingkuidian_tishengqianli()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			//表4.1
			sql="UPDATE details_4_1 SET bianhao=\""+bp.getBianhao()+
					"\",report_analysis=\""+bp.getReport_analysis()+
					"\",report_conclusion=\""+bp.getReport_conclusion()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			//4.2
			sql="UPDATE details_4_2 SET bianhao=\""+bp.getBianhao()+
					"\",anatomy_analysis=\""+bp.getAnatomy_analysis()+
					"\",anatomy_conclusion=\""+bp.getAnatomy_conclusion()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			
			//4.3
			sql="UPDATE details_4_3 SET bianhao=\""+bp.getBianhao()+
					"\",symptoms_performance=\""+bp.getSymptoms_performance()+
					"\",symptoms_conclusion=\""+bp.getSymptoms_conclusion()+
					"\""+"where bianhao=\""+oldbianhao+"\"";

			pst=conn.prepareStatement(sql);
			pst.execute();
			
			//4.4
			sql="UPDATE details_4_4 SET bianhao=\""+bp.getBianhao()+
					"\",comprehensive_report=\""+bp.getComprehensive_report()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();

			//5
			sql="UPDATE details_5 SET bianhao=\""+bp.getBianhao()+
					"\",overall_solution_renshen_plan=\""+bp.getOverall_solution_renshen_plan()+
					"\",overall_solution_renshen_cycle=\""+bp.getOverall_solution_renshen_cycle()+
					"\",overall_solution_renshen_effect=\""+bp.getOverall_solution_renshen_effect()+
					"\",overall_solution_buru_plan=\""+bp.getOverall_solution_buru_plan()+
					"\",overall_solution_buru_cycle=\""+bp.getOverall_solution_buru_cycle()+
					"\",overall_solution_buru_effect=\""+bp.getOverall_solution_buru_effect()+
					"\",overall_solution_baoyu_plan=\""+bp.getOverall_solution_baoyu_plan()+
					"\",overall_solution_baoyu_cycle=\""+bp.getOverall_solution_baoyu_cycle()+
					"\",overall_solution_baoyu_effect=\""+bp.getOverall_solution_baoyu_effect()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			
			//6.1
			sql="UPDATE details_6_1 SET bianhao=\""+bp.getBianhao()+
					"\",muzhupeizhongfeimianlv_yuanlaizhibiao=\""+bp.getMuzhupeizhongfeimianlv_yuanlaizhibiao()+
					"\",muzhupeizhongfeimianlv_mubiaozhibiao=\""+bp.getMuzhupeizhongfeimianlv_mubiaozhibiao()+
					"\",muzhupeizhongfeimianlv_gaishanbili=\""+bp.getMuzhupeizhongfeimianlv_gaishanbili()+
					"\",nianjunchanzai_yuanlaizhibiao=\""+bp.getNianjunchanzai_yuanlaizhibiao()+
					"\",nianjunchanzai_mubiaozhibiao=\""+bp.getNianjunchanzai_mubiaozhibiao()+
					"\",nianjunchanzai_gaishanbili=\""+bp.getNianjunchanzai_gaishanbili()+
					"\",junchanhuozishu_yuanlaizhibiao=\""+bp.getJunchanhuozishu_yuanlaizhibiao()+
					"\",junchanhuozishu_mubiaozhibiao=\""+bp.getJunchanhuozishu_mubiaozhibiao()+
					"\",junchanhuozishu_gaishanbili=\""+bp.getJunchanhuozishu_gaishanbili()+
					"\",buruzizhuchenghuolv_yuanlaizhibiao=\""+bp.getBuruzizhuchenghuolv_yuanlaizhibiao()+
					"\",buruzizhuchenghuolv_mubiaozhibiao=\""+bp.getBuruzizhuchenghuolv_mubiaozhibiao()+
					"\",buruzizhuchenghuolv_gaishanbili=\""+bp.getBuruzizhuchenghuolv_gaishanbili()+
					"\",chushengzhong_yuanlaizhibiao=\""+bp.getChushengzhong_yuanlaizhibiao()+
					"\",chushengzhong_mubiaozhibiao=\""+bp.getChushengzhong_mubiaozhibiao()+
					"\",chushengzhong_gaishanbili=\""+bp.getChushengzhong_gaishanbili()+
					"\",duannaizhong_yuanlaizhibiao=\""+bp.getDuannaizhong_yuanlaizhibiao()+
					"\",duannaizhong_mubiaozhibiao=\""+bp.getDuannaizhong_mubiaozhibiao()+
					"\",duannaizhong_gaishanbili=\""+bp.getDuannaizhong_gaishanbili()+
					"\",baoyuchenghuolv_yuanlaizhibiao=\""+bp.getBaoyuchenghuolv_yuanlaizhibiao()+
					"\",baoyuchenghuolv_mubiaozhibiao=\""+bp.getBaoyuchenghuolv_mubiaozhibiao()+
					"\",baoyuchenghuolv_gaishanbili=\""+bp.getBaoyuchenghuolv_gaishanbili()+
					"\",lingzhong_yuanlaizhibiao=\""+bp.getLingzhong_yuanlaizhibiao()+
					"\",lingzhong_mubiaozhibiao=\""+bp.getLingzhong_mubiaozhibiao()+
					"\",lingzhong_gaishanbili=\""+bp.getLingzhong_gaishanbili()+
					"\",yufeichenghuolv_yuanlaizhibiao=\""+bp.getYufeichenghuolv_yuanlaizhibiao()+
					"\",yufeichenghuolv_mubiaozhibiao=\""+bp.getYufeichenghuolv_mubiaozhibiao()+
					"\",yufeichenghuolv_gaishanbili=\""+bp.getYufeichenghuolv_gaishanbili()+
					"\",shangshiling_yuanlaizhibiao=\""+bp.getShangshiling_yuanlaizhibiao()+
					"\",shangshiling_mubiaozhibiao=\""+bp.getShangshiling_mubiaozhibiao()+
					"\",shangshiling_gaishanbili=\""+bp.getShangshiling_gaishanbili()+
					"\",PSY_yuanlaizhibiao=\""+bp.getPSY_yuanlaizhibiao()+
					"\",PSY_mubiaozhibiao=\""+bp.getPSY_mubiaozhibiao()+
					"\",PSY_gaishanbili=\""+bp.getPSY_gaishanbili()+
					"\",MSY_yuanlaizhibiao=\""+bp.getMSY_yuanlaizhibiao()+
					"\",MSY_mubiaozhibiao=\""+bp.getMSY_mubiaozhibiao()+
					"\",MSY_gaishanbili=\""+bp.getMSY_gaishanbili()+
					"\",liaoroubi_yuanlaizhibiao=\""+bp.getLiaoroubi_yuanlaizhibiao()+
					"\",liaoroubi_mubiaozhibiao=\""+bp.getLiaoroubi_mubiaozhibiao()+
					"\",liaoroubi_gaishanbili=\""+bp.getLiaoroubi_gaishanbili()+
					"\",fangyifei_yuanlaizhibiao=\""+bp.getFangyifei_yuanlaizhibiao()+
					"\",fangyifei_mubiaozhibiao=\""+bp.getFangyifei_mubiaozhibiao()+
					"\",fangyifei_gaishanbili=\""+bp.getFangyifei_gaishanbili()+
					"\",yf_fangyifei_yuanlaizhibiao=\""+bp.getYf_fangyifei_yuanlaizhibiao()+
					"\",yf_fangyifei_mubiaozhibiao=\""+bp.getYf_fangyifei_mubiaozhibiao()+
					"\",yf_fangyifei_gaishanbili=\""+bp.getYf_fangyifei_gaishanbili()+
					"\",zaorouchengben_yuanlaizhibiao=\""+bp.getZaorouchengben_yuanlaizhibiao()+
					"\",zaorouchengben_mubiaozhibiao=\""+bp.getZaorouchengben_mubiaozhibiao()+
					"\",zaorouchengben_gaishanbili=\""+bp.getZaorouchengben_gaishanbili()+
					"\",yingkuidian_yuanlaizhibiao=\""+bp.getYingkuidian_yuanlaizhibiao()+
					"\",yingkuidian_mubiaozhibiao=\""+bp.getYingkuidian_mubiaozhibiao()+
					"\",yingkuidian_gaishanbili=\""+bp.getYingkuidian_gaishanbili()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
		   pst=conn.prepareStatement(sql);
		   pst.execute();

		   //6.2
		   sql="UPDATE details_6_2 SET bianhao=\""+bp.getBianhao()+
				   "\",cost_comparison_original_buruzizhu_siliao=\""+bp.getCost_comparison_original_buruzizhu_siliao()+
				   "\",cost_comparison_original_buruzizhu_yimiao=\""+bp.getCost_comparison_original_buruzizhu_yimiao()+
				   "\",cost_comparison_original_buruzizhu_baojian=\""+bp.getCost_comparison_original_buruzizhu_baojian()+
				   "\",cost_comparison_jiyooh_buruzizhu_siliao=\""+bp.getCost_comparison_jiyooh_buruzizhu_siliao()+
				   "\",cost_comparison_jiyooh_buruzizhu_yimiao=\""+bp.getCost_comparison_jiyooh_buruzizhu_yimiao()+
				   "\",cost_comparison_jiyooh_buruzizhu_baojian=\""+bp.getCost_comparison_jiyooh_buruzizhu_baojian()+
				   "\",cost_comparison_original_baoyuzhu_siliao=\""+bp.getCost_comparison_original_baoyuzhu_siliao()+
				   "\",cost_comparison_original_baoyuzhu_yimiao=\""+bp.getCost_comparison_original_baoyuzhu_yimiao()+
				   "\",cost_comparison_original_baoyuzhu_baojian=\""+bp.getCost_comparison_original_baoyuzhu_baojian()+
				   "\",cost_comparison_jiyooh_baoyuzhu_siliao=\""+bp.getCost_comparison_jiyooh_baoyuzhu_siliao()+
				   "\",cost_comparison_jiyooh_baoyuzhu_yimiao=\""+bp.getCost_comparison_jiyooh_baoyuzhu_yimiao()+
				   "\",cost_comparison_jiyooh_baoyuzhu_baojian=\""+bp.getCost_comparison_jiyooh_baoyuzhu_baojian()+
				   "\",cost_comparison_original_yufei_siliao=\""+bp.getCost_comparison_original_yufei_siliao()+
				   "\",cost_comparison_original_yufei_yimiao=\""+bp.getCost_comparison_original_yufei_yimiao()+
				   "\",cost_comparison_original_yufei_baojian=\""+bp.getCost_comparison_original_yufei_baojian()+
				   "\",cost_comparison_jiyooh_yufei_siliao=\""+bp.getCost_comparison_jiyooh_yufei_siliao()+
				   "\",cost_comparison_jiyooh_yufei_yimiao=\""+bp.getCost_comparison_jiyooh_yufei_yimiao()+
				   "\",cost_comparison_jiyooh_yufei_baojian=\""+bp.getCost_comparison_jiyooh_yufei_baojian()+
				   "\",cost_comparison_original_huaiyunmuzhu_siliao=\""+bp.getCost_comparison_original_huaiyunmuzhu_siliao()+
				   "\",cost_comparison_original_huaiyunmuzhu_yimiao=\""+bp.getCost_comparison_original_huaiyunmuzhu_yimiao()+
				   "\",cost_comparison_original_huaiyunmuzhu_baojian=\""+bp.getCost_comparison_original_huaiyunmuzhu_baojian()+
				   "\",cost_comparison_jiyooh_huaiyunmuzhu_siliao=\""+bp.getCost_comparison_jiyooh_huaiyunmuzhu_siliao()+
				   "\",cost_comparison_jiyooh_huaiyunmuzhu_yimiao=\""+bp.getCost_comparison_jiyooh_huaiyunmuzhu_yimiao()+
				   "\",cost_comparison_jiyooh_huaiyunmuzhu_baojian=\""+bp.getCost_comparison_jiyooh_huaiyunmuzhu_baojian()+
				   "\",cost_comparison_original_burumuzhu_siliao=\""+bp.getCost_comparison_original_burumuzhu_siliao()+
				   "\",cost_comparison_original_burumuzhu_yimiao=\""+bp.getCost_comparison_original_burumuzhu_yimiao()+
				   "\",cost_comparison_original_burumuzhu_baojian=\""+bp.getCost_comparison_original_burumuzhu_baojian()+
				   "\",cost_comparison_jiyooh_burumuzhu_siliao=\""+bp.getCost_comparison_jiyooh_burumuzhu_siliao()+
				   "\",cost_comparison_jiyooh_burumuzhu_yimiao=\""+bp.getCost_comparison_jiyooh_burumuzhu_yimiao()+
				   "\",cost_comparison_jiyooh_burumuzhu_baojian=\""+bp.getCost_comparison_jiyooh_burumuzhu_baojian()+
				   "\""+"where bianhao=\""+oldbianhao+"\"";
				   pst=conn.prepareStatement(sql);
				   pst.execute();
		//6.3
		   sql="UPDATE details_6_3 SET bianhao=\""+bp.getBianhao()+
				   "\",comprehensive_benefits=\""+bp.getComprehensive_benefits()+
				    "\""+"where bianhao=\""+oldbianhao+"\"";
				    pst=conn.prepareStatement(sql);
					pst.execute();
	   //7
		  sql="UPDATE details_7 SET bianhao=\""+bp.getBianhao()+
					"\",management_advice=\""+bp.getManagement_advice()+
					"\""+"where bianhao=\""+oldbianhao+"\"";
					pst=conn.prepareStatement(sql);
					pst.execute();
	  //8
		 sql="UPDATE details_8 SET bianhao=\""+bp.getBianhao()+
				"\""+"where bianhao=\""+oldbianhao+"\"";
				pst=conn.prepareStatement(sql);
				pst.execute();

				pst.close();
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}