package com.jiyoo.service;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;
import com.jiyoo.factory.FactoryTwoList;
import com.jiyoo.util.StringUtf;
import com.jiyoo.vo.BigPackage;
import com.jiyoo.vo.QuYuVo;

public class UserUpdateService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		StringUtf u=new StringUtf();
		String daquusername=u.U(req.getParameter("daquusername"));
		String mdaqu=u.U(req.getParameter("mdaqu"));
		List<QuYuVo> list=FactoryTwoList.chaxunquanxian().chaxunquanxian(daquusername, mdaqu);
		if(list.size()==0){
			resp.sendRedirect("jsp/fanganguanli/error.jsp");//重定向页面
		}else if(req.getParameter("bianhao")==""||req.getParameter("bianhao")==null){
			resp.sendRedirect("jsp/the.jsp");//重定向页面
		}else{
			String oldbianhao=u.U(req.getParameter("oldbianhao"));//修改前的编号
			//1.0
			BigPackage bp=new BigPackage();
			bp.setBianhao(u.U(req.getParameter("bianhao")));
			bp.setUname(u.U(req.getParameter("uname")));
			bp.setIp(u.U(req.getParameter("ip")));
			bp.setBir(u.U(req.getParameter("bir")));
			bp.setAge(u.U(req.getParameter("age")));
			bp.setPhone(u.U(req.getParameter("phone")));
			bp.setSex(u.U(req.getParameter("sex")));
			bp.setPigfactoryname(u.U(req.getParameter("pigfactoryname")));
			bp.setPigbuildtime(u.U(req.getParameter("pigbuildtime")));
			bp.setYufeiarea(u.U(req.getParameter("yufeiarea")));
			bp.setJustnumber(u.U(req.getParameter("justnumber")));
			bp.setJustarea(u.U(req.getParameter("justarea")));
			bp.setJustsownumber(u.U(req.getParameter("justsownumber")));
			bp.setSowtablenumber(u.U(req.getParameter("sowtablenumber")));
			bp.setBaoyubednumber(u.U(req.getParameter("baoyubednumber")));
			bp.setWinterheating(u.U(req.getParameter("winterheating")));
			bp.setBaoyuarea(u.U(req.getParameter("baoyuarea")));
			bp.setBaoyuhighbed(u.U(req.getParameter("baoyuhighbed")));
			bp.setBoilerscale(u.U(req.getParameter("boilerscale")));
			bp.setRoomheatingmethod(u.U(req.getParameter("roomheatingmethod")));
			bp.setBaoyuheatingmethod(u.U(req.getParameter("baoyuheatingmethod")));
			bp.setYufeiheatingmethod(u.U(req.getParameter("yufeiheatingmethod")));
			bp.setPigfarmsorbig(u.U(req.getParameter("pigfarmsorbig")));
			bp.setOrplans(u.U(req.getParameter("orplans")));
			bp.setWeixin(u.U(req.getParameter("weixin")));
			bp.setGuimo(u.U(req.getParameter("guimo")));
			bp.setDaquusername(daquusername);
			bp.setMdaqu(mdaqu);
			
			//2.1
			bp.setH_number(u.U(req.getParameter("h_number")));
			bp.setH_siliaopinzhong(u.U(req.getParameter("h_siliaopinzhong")));
			bp.setH_rmb(u.U(req.getParameter("h_rmb")));
			bp.setH_y_name_1(u.U(req.getParameter("h_y_name_1")));
			bp.setH_y_name_2(u.U(req.getParameter("h_y_name_2")));
			bp.setH_y_name_3(u.U(req.getParameter("h_y_name_3")));
			bp.setH_y_name_4(u.U(req.getParameter("h_y_name_4")));
			bp.setH_factory_1(u.U(req.getParameter("h_factory_1")));
			bp.setH_factory_2(u.U(req.getParameter("h_factory_2")));
			bp.setH_factory_3(u.U(req.getParameter("h_factory_3")));
			bp.setH_factory_4(u.U(req.getParameter("h_factory_4")));
			bp.setH_b_drug_1(u.U(req.getParameter("h_b_drug_1")));
			bp.setH_b_drug_2(u.U(req.getParameter("h_b_drug_2")));
			bp.setH_b_drug_3(u.U(req.getParameter("h_b_drug_3")));
			bp.setH_b_drug_4(u.U(req.getParameter("h_b_drug_4")));
			
			bp.setB_number(u.U(req.getParameter("b_number")));
			bp.setB_siliaopinzhong(u.U(req.getParameter("b_siliaopinzhong")));
			bp.setB_rmb(u.U(req.getParameter("b_rmb")));
			bp.setB_y_name_1(u.U(req.getParameter("b_y_name_1")));
			bp.setB_y_name_2(u.U(req.getParameter("b_y_name_2")));
			bp.setB_y_name_3(u.U(req.getParameter("b_y_name_3")));
			bp.setB_y_name_4(u.U(req.getParameter("b_y_name_4")));
			bp.setB_factory_1(u.U(req.getParameter("b_factory_1")));
			bp.setB_factory_2(u.U(req.getParameter("b_factory_2")));
			bp.setB_factory_3(u.U(req.getParameter("b_factory_3")));
			bp.setB_factory_4(u.U(req.getParameter("b_factory_4")));
			bp.setB_b_drug_1(u.U(req.getParameter("b_b_drug_1")));
			bp.setB_b_drug_2(u.U(req.getParameter("b_b_drug_2")));
			bp.setB_b_drug_3(u.U(req.getParameter("b_b_drug_3")));
			bp.setB_b_drug_4(u.U(req.getParameter("b_b_drug_4")));
			//2.2
			bp.setSy_date(u.U(req.getParameter("sy_date")));
			bp.setSy_fenmian(u.U(req.getParameter("sy_fenmian")));
			bp.setSy_pingjun_number(u.U(req.getParameter("sy_pingjun_number")));
			bp.setSy_cunhuo_number(u.U(req.getParameter("sy_cunhuo_number")));
			bp.setSy_jun_zhong(u.U(req.getParameter("sy_jun_zhong")));
			bp.setSy_cunhuo_lv(u.U(req.getParameter("sy_cunhuo_lv")));
			bp.setSy_duannai_zhong(u.U(req.getParameter("sy_duannai_zhong")));
			//2.3
			bp.setBuruzizhu_siliaopinzhong(u.U(req.getParameter("buruzizhu_siliaopinzhong")));
			bp.setBuruzizhu_siliaopinpai(u.U(req.getParameter("buruzizhu_siliaopinpai")));
			bp.setBuruzizhu_siliaojiage(u.U(req.getParameter("buruzizhu_siliaojiage")));
			bp.setBuruzizhu_yimiaomingcheng_1(u.U(req.getParameter("buruzizhu_yimiaomingcheng_1")));
			bp.setBuruzizhu_yimiaomingcheng_2(u.U(req.getParameter("buruzizhu_yimiaomingcheng_2")));
			bp.setBuruzizhu_yimiaomingcheng_3(u.U(req.getParameter("buruzizhu_yimiaomingcheng_3")));
			bp.setBuruzizhu_shengchanchangjia_1(u.U(req.getParameter("buruzizhu_shengchanchangjia_1")));
			bp.setBuruzizhu_shengchanchangjia_2(u.U(req.getParameter("buruzizhu_shengchanchangjia_2")));
			bp.setBuruzizhu_shengchanchangjia_3(u.U(req.getParameter("buruzizhu_shengchanchangjia_3")));
			bp.setBuruzizhu_baojianyao_1(u.U(req.getParameter("buruzizhu_baojianyao_1")));
			bp.setBuruzizhu_baojianyao_2(u.U(req.getParameter("buruzizhu_baojianyao_2")));
			bp.setBuruzizhu_baojianyao_3(u.U(req.getParameter("buruzizhu_baojianyao_3")));
				
			bp.setBaoyuzhu_siliaopinzhong(u.U(req.getParameter("baoyuzhu_siliaopinzhong")));
			bp.setBaoyuzhu_siliaopinpai(u.U(req.getParameter("baoyuzhu_siliaopinpai")));
			bp.setBaoyuzhu_siliaojiage(u.U(req.getParameter("baoyuzhu_siliaojiage")));
			bp.setBaoyuzhu_yimiaomingcheng_1(u.U(req.getParameter("baoyuzhu_yimiaomingcheng_1")));
			bp.setBaoyuzhu_yimiaomingcheng_2(u.U(req.getParameter("baoyuzhu_yimiaomingcheng_2")));
			bp.setBaoyuzhu_yimiaomingcheng_3(u.U(req.getParameter("baoyuzhu_yimiaomingcheng_3")));
			bp.setBaoyuzhu_shengchanchangjia_1(u.U(req.getParameter("baoyuzhu_shengchanchangjia_1")));
			bp.setBaoyuzhu_shengchanchangjia_2(u.U(req.getParameter("baoyuzhu_shengchanchangjia_2")));
			bp.setBaoyuzhu_shengchanchangjia_3(u.U(req.getParameter("baoyuzhu_shengchanchangjia_3")));
			bp.setBaoyuzhu_baojianyao_1(u.U(req.getParameter("baoyuzhu_baojianyao_1")));
			bp.setBaoyuzhu_baojianyao_2(u.U(req.getParameter("baoyuzhu_baojianyao_2")));
			bp.setBaoyuzhu_baojianyao_3(u.U(req.getParameter("baoyuzhu_baojianyao_3")));
				
			bp.setYufeizhu_siliaopinzhong(u.U(req.getParameter("yufeizhu_siliaopinzhong")));
			bp.setYufeizhu_siliaopinpai(u.U(req.getParameter("yufeizhu_siliaopinpai")));
			bp.setYufeizhu_siliaojiage(u.U(req.getParameter("yufeizhu_siliaojiage")));
			bp.setYufeizhu_yimiaomingcheng_1(u.U(req.getParameter("yufeizhu_yimiaomingcheng_1")));
			bp.setYufeizhu_yimiaomingcheng_2(u.U(req.getParameter("yufeizhu_yimiaomingcheng_2")));
			bp.setYufeizhu_yimiaomingcheng_3(u.U(req.getParameter("yufeizhu_yimiaomingcheng_3")));
			bp.setYufeizhu_shengchanchangjia_1(u.U(req.getParameter("yufeizhu_shengchanchangjia_1")));
			bp.setYufeizhu_shengchanchangjia_2(u.U(req.getParameter("yufeizhu_shengchanchangjia_2")));
			bp.setYufeizhu_shengchanchangjia_3(u.U(req.getParameter("yufeizhu_shengchanchangjia_3")));
			bp.setYufeizhu_baojianyao_1(u.U(req.getParameter("yufeizhu_baojianyao_1")));
			bp.setYufeizhu_baojianyao_2(u.U(req.getParameter("yufeizhu_baojianyao_2")));
			bp.setYufeizhu_baojianyao_3(u.U(req.getParameter("yufeizhu_baojianyao_3")));
			
			//2.4
			bp.setBuruzizhu_cunlanshuliang(u.U(req.getParameter("buruzizhu_cunlanshuliang")));
			bp.setBuruzizhu_cunlanshijian(u.U(req.getParameter("buruzizhu_cunlanshijian")));
			bp.setBuruzizhu_chulanzhongliang(u.U(req.getParameter("buruzizhu_chulanzhongliang")));
			bp.setBuruzizhu_jieduanchenghuobi(u.U(req.getParameter("buruzizhu_jieduanchenghuobi")));
			bp.setBuruzizhu_jieduanliaoroubi(u.U(req.getParameter("buruzizhu_jieduanliaoroubi")));
			
			bp.setBaoyuzhu_cunlanshuliang(u.U(req.getParameter("baoyuzhu_cunlanshuliang")));
			bp.setBaoyuzhu_cunlanshijian(u.U(req.getParameter("baoyuzhu_cunlanshijian")));
			bp.setBaoyuzhu_chulanzhongliang(u.U(req.getParameter("baoyuzhu_chulanzhongliang")));
			bp.setBaoyuzhu_jieduanchenghuobi(u.U(req.getParameter("baoyuzhu_jieduanchenghuobi")));
			bp.setBaoyuzhu_jieduanliaoroubi(u.U(req.getParameter("baoyuzhu_jieduanliaoroubi")));
			
			bp.setYufeizhu_cunlanshuliang(u.U(req.getParameter("yufeizhu_cunlanshuliang")));
			bp.setYufeizhu_cunlanshijian(u.U(req.getParameter("yufeizhu_cunlanshijian")));
			bp.setYufeizhu_chulanzhongliang(u.U(req.getParameter("yufeizhu_chulanzhongliang")));
			bp.setYufeizhu_jieduanchenghuobi(u.U(req.getParameter("yufeizhu_jieduanchenghuobi")));
			bp.setYufeizhu_jieduanliaoroubi(u.U(req.getParameter("yufeizhu_jieduanliaoroubi")));
			//2.5
			bp.setDescribes(u.U(req.getParameter("describe")));
			//3
			bp.setMuzhupeizhongfeimianlv_youxiubiaozhun(u.U(req.getParameter("muzhupeizhongfeimianlv_youxiubiaozhun")));
			bp.setMuzhupeizhongfeimianlv_shijizhibiao(u.U(req.getParameter("muzhupeizhongfeimianlv_shijizhibiao")));
			bp.setMuzhupeizhongfeimianlv_tishengqianli(u.U(req.getParameter("muzhupeizhongfeimianlv_tishengqianli")));
			
			bp.setNianjunchanzai_youxiubiaozhun(u.U(req.getParameter("nianjunchanzai_youxiubiaozhun")));
			bp.setNianjunchanzai_shijizhibiao(u.U(req.getParameter("nianjunchanzai_shijizhibiao")));
			bp.setNianjunchanzai_tishengqianli(u.U(req.getParameter("nianjunchanzai_tishengqianli")));
			
			bp.setJunchanhuozishu_youxiubiaozhun(u.U(req.getParameter("junchanhuozishu_youxiubiaozhun")));
			bp.setJunchanhuozishu_shijizhibiao(u.U(req.getParameter("junchanhuozishu_shijizhibiao")));
			bp.setJunchanhuozishu_tishengqianli(u.U(req.getParameter("junchanhuozishu_tishengqianli")));
			
			bp.setBuruzizhuchenghuolv_youxiubiaozhun(u.U(req.getParameter("buruzizhuchenghuolv_youxiubiaozhun")));
			bp.setBuruzizhuchenghuolv_shijizhibiao(u.U(req.getParameter("buruzizhuchenghuolv_shijizhibiao")));
			bp.setBuruzizhuchenghuolv_tishengqianli(u.U(req.getParameter("buruzizhuchenghuolv_tishengqianli")));
			
			bp.setChushengzhong_youxiubiaozhun(u.U(req.getParameter("chushengzhong_youxiubiaozhun")));
			bp.setChushengzhong_shijizhibiao(u.U(req.getParameter("chushengzhong_shijizhibiao")));
			bp.setChushengzhong_tishengqianli(u.U(req.getParameter("chushengzhong_tishengqianli")));
			
			bp.setDuannaizhong_youxiubiaozhun(u.U(req.getParameter("duannaizhong_youxiubiaozhun")));
			bp.setDuannaizhong_shijizhibiao(u.U(req.getParameter("duannaizhong_shijizhibiao")));
			bp.setDuannaizhong_tishengqianli(u.U(req.getParameter("duannaizhong_tishengqianli")));
			
			bp.setBaoyuchenghuolv_youxiubiaozhun(u.U(req.getParameter("baoyuchenghuolv_youxiubiaozhun")));
			bp.setBaoyuchenghuolv_shijizhibiao(u.U(req.getParameter("baoyuchenghuolv_shijizhibiao")));
			bp.setBaoyuchenghuolv_tishengqianli(u.U(req.getParameter("baoyuchenghuolv_tishengqianli")));
			
			bp.setLingzhong_youxiubiaozhun(u.U(req.getParameter("lingzhong_youxiubiaozhun")));
			bp.setLingzhong_shijizhibiao(u.U(req.getParameter("lingzhong_shijizhibiao")));
			bp.setLingzhong_tishengqianli(u.U(req.getParameter("lingzhong_tishengqianli")));
			
			bp.setYufeichenghuolv_youxiubiaozhun(u.U(req.getParameter("yufeichenghuolv_youxiubiaozhun")));
			bp.setYufeichenghuolv_shijizhibiao(u.U(req.getParameter("yufeichenghuolv_shijizhibiao")));
			bp.setYufeichenghuolv_tishengqianli(u.U(req.getParameter("yufeichenghuolv_tishengqianli")));
			
			bp.setShangshiling_youxiubiaozhun(u.U(req.getParameter("shangshiling_youxiubiaozhun")));
			bp.setShangshiling_shijizhibiao(u.U(req.getParameter("shangshiling_shijizhibiao")));
			bp.setShangshiling_tishengqianli(u.U(req.getParameter("shangshiling_tishengqianli")));
			
			bp.setPSY_youxiubiaozhun(u.U(req.getParameter("PSY_youxiubiaozhun")));
			bp.setPSY_shijizhibiao(u.U(req.getParameter("PSY_shijizhibiao")));
			bp.setPSY_tishengqianli(u.U(req.getParameter("PSY_tishengqianli")));
			
			bp.setMSY_youxiubiaozhun(u.U(req.getParameter("MSY_youxiubiaozhun")));
			bp.setMSY_shijizhibiao(u.U(req.getParameter("MSY_shijizhibiao")));
			bp.setMSY_tishengqianli(u.U(req.getParameter("MSY_tishengqianli")));
			
			bp.setLiaoroubi_youxiubiaozhun(u.U(req.getParameter("liaoroubi_youxiubiaozhun")));
			bp.setLiaoroubi_shijizhibiao(u.U(req.getParameter("liaoroubi_shijizhibiao")));
			bp.setLiaoroubi_tishengqianli(u.U(req.getParameter("liaoroubi_tishengqianli")));
			
			bp.setFangyifei_youxiubiaozhun(u.U(req.getParameter("fangyifei_youxiubiaozhun")));
			bp.setFangyifei_shijizhibiao(u.U(req.getParameter("fangyifei_shijizhibiao")));
			bp.setFangyifei_tishengqianli(u.U(req.getParameter("fangyifei_tishengqianli")));
			
			bp.setYf_fangyifei_youxiubiaozhun(u.U(req.getParameter("yf_fangyifei_youxiubiaozhun")));
			bp.setYf_fangyifei_shijizhibiao(u.U(req.getParameter("yf_fangyifei_shijizhibiao")));
			bp.setYf_fangyifei_tishengqianli(u.U(req.getParameter("yf_fangyifei_tishengqianli")));
			
			bp.setZaorouchengben_youxiubiaozhun(u.U(req.getParameter("zaorouchengben_youxiubiaozhun")));
			bp.setZaorouchengben_shijizhibiao(u.U(req.getParameter("zaorouchengben_shijizhibiao")));
			bp.setZaorouchengben_tishengqianli(u.U(req.getParameter("zaorouchengben_tishengqianli")));
			
			bp.setYingkuidian_youxiubiaozhun(u.U(req.getParameter("yingkuidian_youxiubiaozhun")));
			bp.setYingkuidian_shijizhibiao(u.U(req.getParameter("yingkuidian_shijizhibiao")));
			bp.setYingkuidian_tishengqianli(u.U(req.getParameter("yingkuidian_tishengqianli")));
			//4.1
			bp.setReport_analysis(u.U(req.getParameter("report_analysis")));
			bp.setReport_conclusion(u.U(req.getParameter("report_conclusion")));
			//4.2
			bp.setAnatomy_analysis(u.U(req.getParameter("anatomy_analysis")));
			bp.setAnatomy_conclusion(u.U(req.getParameter("anatomy_conclusion")));
			//4.3
			bp.setSymptoms_performance(u.U(req.getParameter("symptoms_performance")));
			bp.setSymptoms_conclusion(u.U(req.getParameter("symptoms_conclusion")));
			//4.4
			bp.setComprehensive_report(u.U(req.getParameter("comprehensive_report")));
			//5
			bp.setOverall_solution_renshen_plan(u.U(req.getParameter("overall_solution_renshen_plan")));
			bp.setOverall_solution_renshen_cycle(u.U(req.getParameter("overall_solution_renshen_cycle")));
			bp.setOverall_solution_renshen_effect(u.U(req.getParameter("overall_solution_renshen_effect")));
			bp.setOverall_solution_buru_plan(u.U(req.getParameter("overall_solution_buru_plan")));
			bp.setOverall_solution_buru_cycle(u.U(req.getParameter("overall_solution_buru_cycle")));
			bp.setOverall_solution_buru_effect(u.U(req.getParameter("overall_solution_buru_effect")));
			bp.setOverall_solution_baoyu_plan(u.U(req.getParameter("overall_solution_baoyu_plan")));
			bp.setOverall_solution_baoyu_cycle(u.U(req.getParameter("overall_solution_baoyu_cycle")));
			bp.setOverall_solution_baoyu_effect(u.U(req.getParameter("overall_solution_baoyu_effect")));
			//6.1
			bp.setMuzhupeizhongfeimianlv_yuanlaizhibiao(u.U(req.getParameter("muzhupeizhongfeimianlv_yuanlaizhibiao")));
			bp.setMuzhupeizhongfeimianlv_mubiaozhibiao(u.U(req.getParameter("muzhupeizhongfeimianlv_mubiaozhibiao")));
			bp.setMuzhupeizhongfeimianlv_gaishanbili(u.U(req.getParameter("muzhupeizhongfeimianlv_gaishanbili")));
			
			bp.setNianjunchanzai_yuanlaizhibiao(u.U(req.getParameter("nianjunchanzai_yuanlaizhibiao")));
			bp.setNianjunchanzai_mubiaozhibiao(u.U(req.getParameter("nianjunchanzai_mubiaozhibiao")));
			bp.setNianjunchanzai_gaishanbili(u.U(req.getParameter("nianjunchanzai_gaishanbili")));
			
			bp.setJunchanhuozishu_yuanlaizhibiao(u.U(req.getParameter("junchanhuozishu_yuanlaizhibiao")));
			bp.setJunchanhuozishu_mubiaozhibiao(u.U(req.getParameter("junchanhuozishu_mubiaozhibiao")));
			bp.setJunchanhuozishu_gaishanbili(u.U(req.getParameter("junchanhuozishu_gaishanbili")));
			
			bp.setBuruzizhuchenghuolv_yuanlaizhibiao(u.U(req.getParameter("buruzizhuchenghuolv_yuanlaizhibiao")));
			bp.setBuruzizhuchenghuolv_mubiaozhibiao(u.U(req.getParameter("buruzizhuchenghuolv_mubiaozhibiao")));
			bp.setBuruzizhuchenghuolv_gaishanbili(u.U(req.getParameter("buruzizhuchenghuolv_gaishanbili")));
			
			bp.setChushengzhong_yuanlaizhibiao(u.U(req.getParameter("chushengzhong_yuanlaizhibiao")));
			bp.setChushengzhong_mubiaozhibiao(u.U(req.getParameter("chushengzhong_mubiaozhibiao")));
			bp.setChushengzhong_gaishanbili(u.U(req.getParameter("chushengzhong_gaishanbili")));
			
			bp.setDuannaizhong_yuanlaizhibiao(u.U(req.getParameter("duannaizhong_yuanlaizhibiao")));
			bp.setDuannaizhong_mubiaozhibiao(u.U(req.getParameter("duannaizhong_mubiaozhibiao")));
			bp.setDuannaizhong_gaishanbili(u.U(req.getParameter("duannaizhong_gaishanbili")));
			
			bp.setBaoyuchenghuolv_yuanlaizhibiao(u.U(req.getParameter("baoyuchenghuolv_yuanlaizhibiao")));
			bp.setBaoyuchenghuolv_mubiaozhibiao(u.U(req.getParameter("baoyuchenghuolv_mubiaozhibiao")));
			bp.setBaoyuchenghuolv_gaishanbili(u.U(req.getParameter("baoyuchenghuolv_gaishanbili")));
			
			bp.setLingzhong_yuanlaizhibiao(u.U(req.getParameter("lingzhong_yuanlaizhibiao")));
			bp.setLingzhong_mubiaozhibiao(u.U(req.getParameter("lingzhong_mubiaozhibiao")));
			bp.setLingzhong_gaishanbili(u.U(req.getParameter("lingzhong_gaishanbili")));
			
			bp.setYufeichenghuolv_yuanlaizhibiao(u.U(req.getParameter("yufeichenghuolv_yuanlaizhibiao")));
			bp.setYufeichenghuolv_mubiaozhibiao(u.U(req.getParameter("yufeichenghuolv_mubiaozhibiao")));
			bp.setYufeichenghuolv_gaishanbili(u.U(req.getParameter("yufeichenghuolv_gaishanbili")));
			
			bp.setShangshiling_yuanlaizhibiao(u.U(req.getParameter("shangshiling_yuanlaizhibiao")));
			bp.setShangshiling_mubiaozhibiao(u.U(req.getParameter("shangshiling_mubiaozhibiao")));
			bp.setShangshiling_gaishanbili(u.U(req.getParameter("shangshiling_gaishanbili")));
			
			bp.setPSY_yuanlaizhibiao(u.U(req.getParameter("PSY_yuanlaizhibiao")));
			bp.setPSY_mubiaozhibiao(u.U(req.getParameter("PSY_mubiaozhibiao")));
			bp.setPSY_gaishanbili(u.U(req.getParameter("PSY_gaishanbili")));
			
			bp.setMSY_yuanlaizhibiao(u.U(req.getParameter("MSY_yuanlaizhibiao")));
			bp.setMSY_mubiaozhibiao(u.U(req.getParameter("MSY_mubiaozhibiao")));
			bp.setMSY_gaishanbili(u.U(req.getParameter("MSY_gaishanbili")));
			
			bp.setLiaoroubi_yuanlaizhibiao(u.U(req.getParameter("liaoroubi_yuanlaizhibiao")));
			bp.setLiaoroubi_mubiaozhibiao(u.U(req.getParameter("liaoroubi_mubiaozhibiao")));
			bp.setLiaoroubi_gaishanbili(u.U(req.getParameter("liaoroubi_gaishanbili")));
			
			bp.setFangyifei_yuanlaizhibiao(u.U(req.getParameter("fangyifei_yuanlaizhibiao")));
			bp.setFangyifei_mubiaozhibiao(u.U(req.getParameter("fangyifei_mubiaozhibiao")));
			bp.setFangyifei_gaishanbili(u.U(req.getParameter("fangyifei_gaishanbili")));
			
			bp.setYf_fangyifei_yuanlaizhibiao(u.U(req.getParameter("yf_fangyifei_yuanlaizhibiao")));
			bp.setYf_fangyifei_mubiaozhibiao(u.U(req.getParameter("yf_fangyifei_mubiaozhibiao")));
			bp.setYf_fangyifei_gaishanbili(u.U(req.getParameter("yf_fangyifei_gaishanbili")));
			
			bp.setZaorouchengben_yuanlaizhibiao(u.U(req.getParameter("zaorouchengben_yuanlaizhibiao")));
			bp.setZaorouchengben_mubiaozhibiao(u.U(req.getParameter("zaorouchengben_mubiaozhibiao")));
			bp.setZaorouchengben_gaishanbili(u.U(req.getParameter("zaorouchengben_gaishanbili")));
			
			bp.setYingkuidian_yuanlaizhibiao(u.U(req.getParameter("yingkuidian_yuanlaizhibiao")));
			bp.setYingkuidian_mubiaozhibiao(u.U(req.getParameter("yingkuidian_mubiaozhibiao")));
			bp.setYingkuidian_gaishanbili(u.U(req.getParameter("yingkuidian_gaishanbili")));
			//6.2
			bp.setCost_comparison_original_buruzizhu_siliao(u.U(req.getParameter("cost_comparison_original_buruzizhu_siliao")));
			bp.setCost_comparison_original_buruzizhu_yimiao(u.U(req.getParameter("cost_comparison_original_buruzizhu_yimiao")));
			bp.setCost_comparison_original_buruzizhu_baojian(u.U(req.getParameter("cost_comparison_original_buruzizhu_baojian")));
			bp.setCost_comparison_jiyooh_buruzizhu_siliao(u.U(req.getParameter("cost_comparison_jiyooh_buruzizhu_siliao")));
			bp.setCost_comparison_jiyooh_buruzizhu_yimiao(u.U(req.getParameter("cost_comparison_jiyooh_buruzizhu_yimiao")));
			bp.setCost_comparison_jiyooh_buruzizhu_baojian(u.U(req.getParameter("cost_comparison_jiyooh_buruzizhu_baojian")));
			
			bp.setCost_comparison_original_baoyuzhu_siliao(u.U(req.getParameter("cost_comparison_original_baoyuzhu_siliao")));
			bp.setCost_comparison_original_baoyuzhu_yimiao(u.U(req.getParameter("cost_comparison_original_baoyuzhu_yimiao")));
			bp.setCost_comparison_original_baoyuzhu_baojian(u.U(req.getParameter("cost_comparison_original_baoyuzhu_baojian")));
			bp.setCost_comparison_jiyooh_baoyuzhu_siliao(u.U(req.getParameter("cost_comparison_jiyooh_baoyuzhu_siliao")));
			bp.setCost_comparison_jiyooh_baoyuzhu_yimiao(u.U(req.getParameter("cost_comparison_jiyooh_baoyuzhu_yimiao")));
			bp.setCost_comparison_jiyooh_baoyuzhu_baojian(u.U(req.getParameter("cost_comparison_jiyooh_baoyuzhu_baojian")));
					
			bp.setCost_comparison_original_yufei_siliao(u.U(req.getParameter("cost_comparison_original_yufei_siliao")));
			bp.setCost_comparison_original_yufei_yimiao(u.U(req.getParameter("cost_comparison_original_yufei_yimiao")));
			bp.setCost_comparison_original_yufei_baojian(u.U(req.getParameter("cost_comparison_original_yufei_baojian")));
			bp.setCost_comparison_jiyooh_yufei_siliao(u.U(req.getParameter("cost_comparison_jiyooh_yufei_siliao")));
			bp.setCost_comparison_jiyooh_yufei_yimiao(u.U(req.getParameter("cost_comparison_jiyooh_yufei_yimiao")));
			bp.setCost_comparison_jiyooh_yufei_baojian(u.U(req.getParameter("cost_comparison_jiyooh_yufei_baojian")));
					
			bp.setCost_comparison_original_huaiyunmuzhu_siliao(u.U(req.getParameter("cost_comparison_original_huaiyunmuzhu_siliao")));
			bp.setCost_comparison_original_huaiyunmuzhu_yimiao(u.U(req.getParameter("cost_comparison_original_huaiyunmuzhu_yimiao")));
			bp.setCost_comparison_original_huaiyunmuzhu_baojian(u.U(req.getParameter("cost_comparison_original_huaiyunmuzhu_baojian")));
			bp.setCost_comparison_jiyooh_huaiyunmuzhu_siliao(u.U(req.getParameter("cost_comparison_jiyooh_huaiyunmuzhu_siliao")));
			bp.setCost_comparison_jiyooh_huaiyunmuzhu_yimiao(u.U(req.getParameter("cost_comparison_jiyooh_huaiyunmuzhu_yimiao")));
			bp.setCost_comparison_jiyooh_huaiyunmuzhu_baojian(u.U(req.getParameter("cost_comparison_jiyooh_huaiyunmuzhu_baojian")));
			
			bp.setCost_comparison_original_burumuzhu_siliao(u.U(req.getParameter("cost_comparison_original_burumuzhu_siliao")));
			bp.setCost_comparison_original_burumuzhu_yimiao(u.U(req.getParameter("cost_comparison_original_burumuzhu_yimiao")));
			bp.setCost_comparison_original_burumuzhu_baojian(u.U(req.getParameter("cost_comparison_original_burumuzhu_baojian")));
			bp.setCost_comparison_jiyooh_burumuzhu_siliao(u.U(req.getParameter("cost_comparison_jiyooh_burumuzhu_siliao")));
			bp.setCost_comparison_jiyooh_burumuzhu_yimiao(u.U(req.getParameter("cost_comparison_jiyooh_burumuzhu_yimiao")));
			bp.setCost_comparison_jiyooh_burumuzhu_baojian(u.U(req.getParameter("cost_comparison_jiyooh_burumuzhu_baojian")));
			//6.3
			bp.setComprehensive_benefits(u.U(req.getParameter("comprehensive_benefits")));
			//7
			bp.setManagement_advice(u.U(req.getParameter("management_advice")));
			FactoryList.userUpdateDao().userUpdateDaoImpls(bp, oldbianhao);
			resp.sendRedirect("jsp/kehuxinxi.jsp");
		}
	}
}
