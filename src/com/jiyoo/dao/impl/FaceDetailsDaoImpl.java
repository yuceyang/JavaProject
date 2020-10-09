package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jiyoo.dao.FaceDetailsDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;

public class FaceDetailsDaoImpl implements FaceDetailsDao{
	public BigPackage facedetails(String bianhao) {
		BigPackage bp=new BigPackage();
		try {
			Connection conn=null;
			String sql=null;
			PreparedStatement pst=null;
			conn=JdbcContext.getconn();
			ResultSet re=null;
			sql="SELECT * FROM jibenxinxi WHERE bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setBianhao(re.getString("bianhao"));
				bp.setUname(re.getString("uname"));
				bp.setIp(re.getString("ip"));
				bp.setAge(re.getString("age"));
				bp.setPhone(re.getString("phone"));
				bp.setBir(re.getString("bir"));
				bp.setSex(re.getString("sex"));
				bp.setPigfactoryname(re.getString("pigfactoryname"));
				bp.setPigbuildtime(re.getString("pigbuildtime"));
				bp.setYufeiarea(re.getString("yufeiarea"));
				bp.setJustnumber(re.getString("justnumber"));
				bp.setJustarea(re.getString("justarea"));
				bp.setJustsownumber(re.getString("justsownumber"));
				bp.setSowtablenumber(re.getString("sowtablenumber"));
				bp.setBaoyubednumber(re.getString("baoyubednumber"));
				bp.setWinterheating(re.getString("winterheating"));
				bp.setBaoyuarea(re.getString("baoyuarea"));
				bp.setBaoyuhighbed(re.getString("baoyuhighbed"));
				bp.setBoilerscale(re.getString("boilerscale"));
				bp.setRoomheatingmethod(re.getString("roomheatingmethod"));
				bp.setBaoyuheatingmethod(re.getString("baoyuheatingmethod"));
				bp.setYufeiheatingmethod(re.getString("yufeiheatingmethod"));
				bp.setPigfarmsorbig(re.getString("pigfarmsorbig"));
				bp.setOrplans(re.getString("orplans"));
				bp.setWeixin(re.getString("weixin"));
				bp.setGuimo(re.getString("guimo"));
				bp.setDaquusername(re.getString("daquusername"));
				bp.setMdaqu(re.getString("mdaqu"));
			}
			sql="select * from details_2_1 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setH_number(re.getString("h_number"));
				bp.setH_siliaopinzhong(re.getString("h_siliaopinzhong"));
				bp.setH_rmb(re.getString("h_rmb"));
				bp.setH_y_name_1(re.getString("h_y_name_1"));
				bp.setH_y_name_2(re.getString("h_y_name_2"));
				bp.setH_y_name_3(re.getString("h_y_name_3"));
				bp.setH_y_name_4(re.getString("h_y_name_4"));
				bp.setH_factory_1(re.getString("h_factory_1"));
				bp.setH_factory_2(re.getString("h_factory_2"));
				bp.setH_factory_3(re.getString("h_factory_3"));
				bp.setH_factory_4(re.getString("h_factory_4"));
				bp.setH_b_drug_1(re.getString("h_b_drug_1"));
				bp.setH_b_drug_2(re.getString("h_b_drug_2"));
				bp.setH_b_drug_3(re.getString("h_b_drug_3"));
				bp.setH_b_drug_4(re.getString("h_b_drug_4"));
				bp.setB_number(re.getString("b_number"));
				bp.setB_siliaopinzhong(re.getString("b_siliaopinzhong"));
				bp.setB_rmb(re.getString("b_rmb"));
				bp.setB_y_name_1(re.getString("b_y_name_1"));
				bp.setB_y_name_2(re.getString("b_y_name_2"));
				bp.setB_y_name_3(re.getString("b_y_name_3"));
				bp.setB_y_name_4(re.getString("b_y_name_4"));
				bp.setB_factory_1(re.getString("b_factory_1"));
				bp.setB_factory_2(re.getString("b_factory_2"));
				bp.setB_factory_3(re.getString("b_factory_3"));
				bp.setB_factory_4(re.getString("b_factory_4"));
				bp.setB_b_drug_1(re.getString("b_b_drug_1"));
				bp.setB_b_drug_2(re.getString("b_b_drug_2"));
				bp.setB_b_drug_3(re.getString("b_b_drug_3"));
				bp.setB_b_drug_4(re.getString("b_b_drug_4"));
			}
			sql="select * from details_2_2 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setSy_date(re.getString("sy_date"));
				bp.setSy_fenmian(re.getString("sy_fenmian"));
				bp.setSy_pingjun_number(re.getString("sy_pingjun_number"));
				bp.setSy_cunhuo_number(re.getString("sy_cunhuo_number"));
				bp.setSy_jun_zhong(re.getString("sy_jun_zhong"));
				bp.setSy_cunhuo_lv(re.getString("sy_cunhuo_lv"));
				bp.setSy_duannai_zhong(re.getString("sy_duannai_zhong"));
			}
			sql="select * from details_2_3 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setBuruzizhu_siliaopinzhong(re.getString("buruzizhu_siliaopinzhong"));
				bp.setBuruzizhu_siliaopinpai(re.getString("buruzizhu_siliaopinpai"));
				bp.setBuruzizhu_siliaojiage(re.getString("buruzizhu_siliaojiage"));
				bp.setBuruzizhu_yimiaomingcheng_1(re.getString("buruzizhu_yimiaomingcheng_1"));
				bp.setBuruzizhu_yimiaomingcheng_2(re.getString("buruzizhu_yimiaomingcheng_2"));
				bp.setBuruzizhu_yimiaomingcheng_3(re.getString("buruzizhu_yimiaomingcheng_3"));
				bp.setBuruzizhu_shengchanchangjia_1(re.getString("buruzizhu_shengchanchangjia_1"));
				bp.setBuruzizhu_shengchanchangjia_2(re.getString("buruzizhu_shengchanchangjia_2"));
				bp.setBuruzizhu_shengchanchangjia_3(re.getString("buruzizhu_shengchanchangjia_3"));
				bp.setBuruzizhu_baojianyao_1(re.getString("buruzizhu_baojianyao_1"));
				bp.setBuruzizhu_baojianyao_2(re.getString("buruzizhu_baojianyao_2"));
				bp.setBuruzizhu_baojianyao_3(re.getString("buruzizhu_baojianyao_3"));
				bp.setBaoyuzhu_siliaopinzhong(re.getString("baoyuzhu_siliaopinzhong"));
				bp.setBaoyuzhu_siliaopinpai(re.getString("baoyuzhu_siliaopinpai"));
				bp.setBaoyuzhu_siliaojiage(re.getString("baoyuzhu_siliaojiage"));
				bp.setBaoyuzhu_yimiaomingcheng_1(re.getString("baoyuzhu_yimiaomingcheng_1"));
				bp.setBaoyuzhu_yimiaomingcheng_2(re.getString("baoyuzhu_yimiaomingcheng_2"));
				bp.setBaoyuzhu_yimiaomingcheng_3(re.getString("baoyuzhu_yimiaomingcheng_3"));
				bp.setBaoyuzhu_shengchanchangjia_1(re.getString("baoyuzhu_shengchanchangjia_1"));
				bp.setBaoyuzhu_shengchanchangjia_2(re.getString("baoyuzhu_shengchanchangjia_2"));
				bp.setBaoyuzhu_shengchanchangjia_3(re.getString("baoyuzhu_shengchanchangjia_3"));
				bp.setBaoyuzhu_baojianyao_1(re.getString("baoyuzhu_baojianyao_1"));
				bp.setBaoyuzhu_baojianyao_2(re.getString("baoyuzhu_baojianyao_2"));
				bp.setBaoyuzhu_baojianyao_3(re.getString("baoyuzhu_baojianyao_3"));
				bp.setYufeizhu_siliaopinzhong(re.getString("yufeizhu_siliaopinzhong"));
				bp.setYufeizhu_siliaopinpai(re.getString("yufeizhu_siliaopinpai"));
				bp.setYufeizhu_siliaojiage(re.getString("yufeizhu_siliaojiage"));
				bp.setYufeizhu_yimiaomingcheng_1(re.getString("yufeizhu_yimiaomingcheng_1"));
				bp.setYufeizhu_yimiaomingcheng_2(re.getString("yufeizhu_yimiaomingcheng_2"));
				bp.setYufeizhu_yimiaomingcheng_3(re.getString("yufeizhu_yimiaomingcheng_3"));
				bp.setYufeizhu_shengchanchangjia_1(re.getString("yufeizhu_shengchanchangjia_1"));
				bp.setYufeizhu_shengchanchangjia_2(re.getString("yufeizhu_shengchanchangjia_2"));
				bp.setYufeizhu_shengchanchangjia_3(re.getString("yufeizhu_shengchanchangjia_3"));
				bp.setYufeizhu_baojianyao_1(re.getString("yufeizhu_baojianyao_1"));
				bp.setYufeizhu_baojianyao_2(re.getString("yufeizhu_baojianyao_2"));
				bp.setYufeizhu_baojianyao_3(re.getString("yufeizhu_baojianyao_3"));
			}
			
			sql="select * from details_2_4 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setBuruzizhu_cunlanshuliang(re.getString("buruzizhu_cunlanshuliang"));
				bp.setBuruzizhu_cunlanshijian(re.getString("buruzizhu_cunlanshijian"));
				bp.setBuruzizhu_chulanzhongliang(re.getString("buruzizhu_chulanzhongliang"));
				bp.setBuruzizhu_jieduanchenghuobi(re.getString("buruzizhu_jieduanchenghuobi"));
				bp.setBuruzizhu_jieduanliaoroubi(re.getString("buruzizhu_jieduanliaoroubi"));
				bp.setBaoyuzhu_cunlanshuliang(re.getString("baoyuzhu_cunlanshuliang"));
				bp.setBaoyuzhu_cunlanshijian(re.getString("baoyuzhu_cunlanshijian"));
				bp.setBaoyuzhu_chulanzhongliang(re.getString("baoyuzhu_chulanzhongliang"));
				bp.setBaoyuzhu_jieduanchenghuobi(re.getString("baoyuzhu_jieduanchenghuobi"));
				bp.setBaoyuzhu_jieduanliaoroubi(re.getString("baoyuzhu_jieduanliaoroubi"));
				bp.setYufeizhu_cunlanshuliang(re.getString("yufeizhu_cunlanshuliang"));
				bp.setYufeizhu_cunlanshijian(re.getString("yufeizhu_cunlanshijian"));
				bp.setYufeizhu_chulanzhongliang(re.getString("yufeizhu_chulanzhongliang"));
				bp.setYufeizhu_jieduanchenghuobi(re.getString("yufeizhu_jieduanchenghuobi"));
				bp.setYufeizhu_jieduanliaoroubi(re.getString("yufeizhu_jieduanliaoroubi"));
			}
			sql="select * from details_2_5 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setDescribes(re.getString("describes"));
			}
			sql="select * from details_3 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setMuzhupeizhongfeimianlv_youxiubiaozhun(re.getString("muzhupeizhongfeimianlv_youxiubiaozhun"));
				bp.setMuzhupeizhongfeimianlv_shijizhibiao(re.getString("muzhupeizhongfeimianlv_shijizhibiao"));
				bp.setMuzhupeizhongfeimianlv_tishengqianli(re.getString("muzhupeizhongfeimianlv_tishengqianli"));
				bp.setNianjunchanzai_youxiubiaozhun(re.getString("nianjunchanzai_youxiubiaozhun"));
				bp.setNianjunchanzai_shijizhibiao(re.getString("nianjunchanzai_shijizhibiao"));
				bp.setNianjunchanzai_tishengqianli(re.getString("nianjunchanzai_tishengqianli"));
				bp.setJunchanhuozishu_youxiubiaozhun(re.getString("junchanhuozishu_youxiubiaozhun"));
				bp.setJunchanhuozishu_shijizhibiao(re.getString("junchanhuozishu_shijizhibiao"));
				bp.setJunchanhuozishu_tishengqianli(re.getString("junchanhuozishu_tishengqianli"));
				bp.setBuruzizhuchenghuolv_youxiubiaozhun(re.getString("buruzizhuchenghuolv_youxiubiaozhun"));
				bp.setBuruzizhuchenghuolv_shijizhibiao(re.getString("buruzizhuchenghuolv_shijizhibiao"));
				bp.setBuruzizhuchenghuolv_tishengqianli(re.getString("buruzizhuchenghuolv_tishengqianli"));
				bp.setChushengzhong_youxiubiaozhun(re.getString("chushengzhong_youxiubiaozhun"));
				bp.setChushengzhong_shijizhibiao(re.getString("chushengzhong_shijizhibiao"));
				bp.setChushengzhong_tishengqianli(re.getString("chushengzhong_tishengqianli"));
				bp.setDuannaizhong_youxiubiaozhun(re.getString("duannaizhong_youxiubiaozhun"));
				bp.setDuannaizhong_shijizhibiao(re.getString("duannaizhong_shijizhibiao"));
				bp.setDuannaizhong_tishengqianli(re.getString("duannaizhong_tishengqianli"));
				bp.setBaoyuchenghuolv_youxiubiaozhun(re.getString("baoyuchenghuolv_youxiubiaozhun"));
				bp.setBaoyuchenghuolv_shijizhibiao(re.getString("baoyuchenghuolv_shijizhibiao"));
				bp.setBaoyuchenghuolv_tishengqianli(re.getString("baoyuchenghuolv_tishengqianli"));
				bp.setLingzhong_youxiubiaozhun(re.getString("lingzhong_youxiubiaozhun"));
				bp.setLingzhong_shijizhibiao(re.getString("lingzhong_shijizhibiao"));
				bp.setLingzhong_tishengqianli(re.getString("lingzhong_tishengqianli"));
				bp.setYufeichenghuolv_youxiubiaozhun(re.getString("yufeichenghuolv_youxiubiaozhun"));
				bp.setYufeichenghuolv_shijizhibiao(re.getString("yufeichenghuolv_shijizhibiao"));
				bp.setYufeichenghuolv_tishengqianli(re.getString("yufeichenghuolv_tishengqianli"));
				bp.setShangshiling_youxiubiaozhun(re.getString("shangshiling_youxiubiaozhun"));
				bp.setShangshiling_shijizhibiao(re.getString("shangshiling_shijizhibiao"));
				bp.setShangshiling_tishengqianli(re.getString("shangshiling_tishengqianli"));
				bp.setPSY_youxiubiaozhun(re.getString("PSY_youxiubiaozhun"));
				bp.setPSY_shijizhibiao(re.getString("PSY_shijizhibiao"));
				bp.setPSY_tishengqianli(re.getString("PSY_tishengqianli"));
				bp.setMSY_youxiubiaozhun(re.getString("MSY_youxiubiaozhun"));
				bp.setMSY_shijizhibiao(re.getString("MSY_shijizhibiao"));
				bp.setMSY_tishengqianli(re.getString("MSY_tishengqianli"));
				bp.setLiaoroubi_youxiubiaozhun(re.getString("liaoroubi_youxiubiaozhun"));
				bp.setLiaoroubi_shijizhibiao(re.getString("liaoroubi_shijizhibiao"));
				bp.setLiaoroubi_tishengqianli(re.getString("liaoroubi_tishengqianli"));
				bp.setFangyifei_youxiubiaozhun(re.getString("fangyifei_youxiubiaozhun"));
				bp.setFangyifei_shijizhibiao(re.getString("fangyifei_shijizhibiao"));
				bp.setFangyifei_tishengqianli(re.getString("fangyifei_tishengqianli"));
				bp.setYf_fangyifei_youxiubiaozhun(re.getString("yf_fangyifei_youxiubiaozhun"));
				bp.setYf_fangyifei_shijizhibiao(re.getString("yf_fangyifei_shijizhibiao"));
				bp.setYf_fangyifei_tishengqianli(re.getString("yf_fangyifei_tishengqianli"));
				bp.setZaorouchengben_youxiubiaozhun(re.getString("zaorouchengben_youxiubiaozhun"));
				bp.setZaorouchengben_shijizhibiao(re.getString("zaorouchengben_shijizhibiao"));
				bp.setZaorouchengben_tishengqianli(re.getString("zaorouchengben_tishengqianli"));
				bp.setYingkuidian_youxiubiaozhun(re.getString("yingkuidian_youxiubiaozhun"));
				bp.setYingkuidian_shijizhibiao(re.getString("yingkuidian_shijizhibiao"));
				bp.setYingkuidian_tishengqianli(re.getString("yingkuidian_tishengqianli"));
			}
			sql="select * from details_4_1 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setReport_analysis(re.getString("report_analysis"));
				bp.setReport_conclusion(re.getString("report_conclusion"));
			}
			sql="select * from details_4_2 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setAnatomy_analysis(re.getString("anatomy_analysis"));
				bp.setAnatomy_conclusion(re.getString("anatomy_conclusion"));
			}
			sql="select * from details_4_3 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setSymptoms_performance(re.getString("symptoms_performance"));
				bp.setSymptoms_conclusion(re.getString("symptoms_conclusion"));
			}
			sql="select * from details_4_4 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setComprehensive_report(re.getString("comprehensive_report"));
			}
			sql="select * from details_5 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setOverall_solution_renshen_plan(re.getString("overall_solution_renshen_plan"));
				bp.setOverall_solution_renshen_cycle(re.getString("overall_solution_renshen_cycle"));
				bp.setOverall_solution_renshen_effect(re.getString("overall_solution_renshen_effect"));
				bp.setOverall_solution_buru_plan(re.getString("overall_solution_buru_plan"));
				bp.setOverall_solution_buru_cycle(re.getString("overall_solution_buru_cycle"));
				bp.setOverall_solution_buru_effect(re.getString("overall_solution_buru_effect"));
				bp.setOverall_solution_baoyu_plan(re.getString("overall_solution_baoyu_plan"));
				bp.setOverall_solution_baoyu_cycle(re.getString("overall_solution_baoyu_cycle"));
				bp.setOverall_solution_baoyu_effect(re.getString("overall_solution_baoyu_effect"));
			}
			sql="select * from details_6_1 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setMuzhupeizhongfeimianlv_yuanlaizhibiao(re.getString("muzhupeizhongfeimianlv_yuanlaizhibiao"));
				bp.setMuzhupeizhongfeimianlv_mubiaozhibiao(re.getString("muzhupeizhongfeimianlv_mubiaozhibiao"));
				bp.setMuzhupeizhongfeimianlv_gaishanbili(re.getString("muzhupeizhongfeimianlv_gaishanbili"));
				bp.setNianjunchanzai_yuanlaizhibiao(re.getString("nianjunchanzai_yuanlaizhibiao"));
				bp.setNianjunchanzai_mubiaozhibiao(re.getString("nianjunchanzai_mubiaozhibiao"));
				bp.setNianjunchanzai_gaishanbili(re.getString("nianjunchanzai_gaishanbili"));
				bp.setJunchanhuozishu_yuanlaizhibiao(re.getString("junchanhuozishu_yuanlaizhibiao"));
				bp.setJunchanhuozishu_mubiaozhibiao(re.getString("junchanhuozishu_mubiaozhibiao"));
				bp.setJunchanhuozishu_gaishanbili(re.getString("junchanhuozishu_gaishanbili"));
				bp.setBuruzizhuchenghuolv_yuanlaizhibiao(re.getString("buruzizhuchenghuolv_yuanlaizhibiao"));
				bp.setBuruzizhuchenghuolv_mubiaozhibiao(re.getString("buruzizhuchenghuolv_mubiaozhibiao"));
				bp.setBuruzizhuchenghuolv_gaishanbili(re.getString("buruzizhuchenghuolv_gaishanbili"));
				bp.setChushengzhong_yuanlaizhibiao(re.getString("chushengzhong_yuanlaizhibiao"));
				bp.setChushengzhong_mubiaozhibiao(re.getString("chushengzhong_mubiaozhibiao"));
				bp.setChushengzhong_gaishanbili(re.getString("chushengzhong_gaishanbili"));
				bp.setDuannaizhong_yuanlaizhibiao(re.getString("duannaizhong_yuanlaizhibiao"));
				bp.setDuannaizhong_mubiaozhibiao(re.getString("duannaizhong_mubiaozhibiao"));
				bp.setDuannaizhong_gaishanbili(re.getString("duannaizhong_gaishanbili"));
				bp.setBaoyuchenghuolv_yuanlaizhibiao(re.getString("baoyuchenghuolv_yuanlaizhibiao"));
				bp.setBaoyuchenghuolv_mubiaozhibiao(re.getString("baoyuchenghuolv_mubiaozhibiao"));
				bp.setBaoyuchenghuolv_gaishanbili(re.getString("baoyuchenghuolv_gaishanbili"));
				bp.setLingzhong_yuanlaizhibiao(re.getString("lingzhong_yuanlaizhibiao"));
				bp.setLingzhong_mubiaozhibiao(re.getString("lingzhong_mubiaozhibiao"));
				bp.setLingzhong_gaishanbili(re.getString("lingzhong_gaishanbili"));
				bp.setYufeichenghuolv_yuanlaizhibiao(re.getString("yufeichenghuolv_yuanlaizhibiao"));
				bp.setYufeichenghuolv_mubiaozhibiao(re.getString("yufeichenghuolv_mubiaozhibiao"));
				bp.setYufeichenghuolv_gaishanbili(re.getString("yufeichenghuolv_gaishanbili"));
				bp.setShangshiling_yuanlaizhibiao(re.getString("shangshiling_yuanlaizhibiao"));
				bp.setShangshiling_mubiaozhibiao(re.getString("shangshiling_mubiaozhibiao"));
				bp.setShangshiling_gaishanbili(re.getString("shangshiling_gaishanbili"));
				bp.setPSY_yuanlaizhibiao(re.getString("PSY_yuanlaizhibiao"));
				bp.setPSY_mubiaozhibiao(re.getString("PSY_mubiaozhibiao"));
				bp.setPSY_gaishanbili(re.getString("PSY_gaishanbili"));
				bp.setMSY_yuanlaizhibiao(re.getString("MSY_yuanlaizhibiao"));
				bp.setMSY_mubiaozhibiao(re.getString("MSY_mubiaozhibiao"));
				bp.setMSY_gaishanbili(re.getString("MSY_gaishanbili"));
				bp.setLiaoroubi_yuanlaizhibiao(re.getString("liaoroubi_yuanlaizhibiao"));
				bp.setLiaoroubi_mubiaozhibiao(re.getString("liaoroubi_mubiaozhibiao"));
				bp.setLiaoroubi_gaishanbili(re.getString("liaoroubi_gaishanbili"));
				bp.setFangyifei_yuanlaizhibiao(re.getString("fangyifei_yuanlaizhibiao"));
				bp.setFangyifei_mubiaozhibiao(re.getString("fangyifei_mubiaozhibiao"));
				bp.setFangyifei_gaishanbili(re.getString("fangyifei_gaishanbili"));
				bp.setYf_fangyifei_yuanlaizhibiao(re.getString("yf_fangyifei_yuanlaizhibiao"));
				bp.setYf_fangyifei_mubiaozhibiao(re.getString("yf_fangyifei_mubiaozhibiao"));
				bp.setYf_fangyifei_gaishanbili(re.getString("yf_fangyifei_gaishanbili"));
				bp.setZaorouchengben_yuanlaizhibiao(re.getString("zaorouchengben_yuanlaizhibiao"));
				bp.setZaorouchengben_mubiaozhibiao(re.getString("zaorouchengben_mubiaozhibiao"));
				bp.setZaorouchengben_gaishanbili(re.getString("zaorouchengben_gaishanbili"));
				bp.setYingkuidian_yuanlaizhibiao(re.getString("yingkuidian_yuanlaizhibiao"));
				bp.setYingkuidian_mubiaozhibiao(re.getString("yingkuidian_mubiaozhibiao"));
				bp.setYingkuidian_gaishanbili(re.getString("yingkuidian_gaishanbili"));
			}
			sql="select * from details_6_2 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setCost_comparison_original_buruzizhu_siliao(re.getString("cost_comparison_original_buruzizhu_siliao"));
				bp.setCost_comparison_original_buruzizhu_yimiao(re.getString("cost_comparison_original_buruzizhu_yimiao"));
				bp.setCost_comparison_original_buruzizhu_baojian(re.getString("cost_comparison_original_buruzizhu_baojian"));
				bp.setCost_comparison_jiyooh_buruzizhu_siliao(re.getString("cost_comparison_jiyooh_buruzizhu_siliao"));
				bp.setCost_comparison_jiyooh_buruzizhu_yimiao(re.getString("cost_comparison_jiyooh_buruzizhu_yimiao"));
				bp.setCost_comparison_jiyooh_buruzizhu_baojian(re.getString("cost_comparison_jiyooh_buruzizhu_baojian"));
				bp.setCost_comparison_original_baoyuzhu_siliao(re.getString("cost_comparison_original_baoyuzhu_siliao"));
				bp.setCost_comparison_original_baoyuzhu_yimiao(re.getString("cost_comparison_original_baoyuzhu_yimiao"));
				bp.setCost_comparison_original_baoyuzhu_baojian(re.getString("cost_comparison_original_baoyuzhu_baojian"));
				bp.setCost_comparison_jiyooh_baoyuzhu_siliao(re.getString("cost_comparison_jiyooh_baoyuzhu_siliao"));
				bp.setCost_comparison_jiyooh_baoyuzhu_yimiao(re.getString("cost_comparison_jiyooh_baoyuzhu_yimiao"));
				bp.setCost_comparison_jiyooh_baoyuzhu_baojian(re.getString("cost_comparison_jiyooh_baoyuzhu_baojian"));
				bp.setCost_comparison_original_yufei_siliao(re.getString("cost_comparison_original_yufei_siliao"));
				bp.setCost_comparison_original_yufei_yimiao(re.getString("cost_comparison_original_yufei_yimiao"));
				bp.setCost_comparison_original_yufei_baojian(re.getString("cost_comparison_original_yufei_baojian"));
				bp.setCost_comparison_jiyooh_yufei_siliao(re.getString("cost_comparison_jiyooh_yufei_siliao"));
				bp.setCost_comparison_jiyooh_yufei_yimiao(re.getString("cost_comparison_jiyooh_yufei_yimiao"));
				bp.setCost_comparison_jiyooh_yufei_baojian(re.getString("cost_comparison_jiyooh_yufei_baojian"));
				bp.setCost_comparison_original_huaiyunmuzhu_siliao(re.getString("cost_comparison_original_huaiyunmuzhu_siliao"));
				bp.setCost_comparison_original_huaiyunmuzhu_yimiao(re.getString("cost_comparison_original_huaiyunmuzhu_yimiao"));
				bp.setCost_comparison_original_huaiyunmuzhu_baojian(re.getString("cost_comparison_original_huaiyunmuzhu_baojian"));
				bp.setCost_comparison_jiyooh_huaiyunmuzhu_siliao(re.getString("cost_comparison_jiyooh_huaiyunmuzhu_siliao"));
				bp.setCost_comparison_jiyooh_huaiyunmuzhu_yimiao(re.getString("cost_comparison_jiyooh_huaiyunmuzhu_yimiao"));
				bp.setCost_comparison_jiyooh_huaiyunmuzhu_baojian(re.getString("cost_comparison_jiyooh_huaiyunmuzhu_baojian"));
				bp.setCost_comparison_original_burumuzhu_siliao(re.getString("cost_comparison_original_burumuzhu_siliao"));
				bp.setCost_comparison_original_burumuzhu_yimiao(re.getString("cost_comparison_original_burumuzhu_yimiao"));
				bp.setCost_comparison_original_burumuzhu_baojian(re.getString("cost_comparison_original_burumuzhu_baojian"));
				bp.setCost_comparison_jiyooh_burumuzhu_siliao(re.getString("cost_comparison_jiyooh_burumuzhu_siliao"));
				bp.setCost_comparison_jiyooh_burumuzhu_yimiao(re.getString("cost_comparison_jiyooh_burumuzhu_yimiao"));
				bp.setCost_comparison_jiyooh_burumuzhu_baojian(re.getString("cost_comparison_jiyooh_burumuzhu_baojian"));
			}
			sql="select * from details_6_3 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setComprehensive_benefits(re.getString("comprehensive_benefits"));
			}
			sql="select * from details_7 where bianhao=\""+bianhao+"\"";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				bp.setManagement_advice(re.getString("management_advice"));
			}
			re.close();
			pst.close();
			conn.close();

		} catch (SQLException e) {
				e.printStackTrace();
		}
		return bp;
	}
}
