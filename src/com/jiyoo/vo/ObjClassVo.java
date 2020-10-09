package com.jiyoo.vo;
/**
 *   终极封装类
 * */
public class ObjClassVo {
	/* JibenxinxiVo */
	private String uname;
	private String ip;
	private String age;
	private String phone;
	private String bir;
	private String letter;
	private String center;
	private String right;
	private String bianhao;
	/* 客户痛点描述 */
	private String kehutongdianmiaoshu_1;
	private String kehutongdianmiaoshu_2;
	private String kehutongdianmiaoshu_3;
	private String kehutongdianmiaoshu_4;
	/* 母猪基本信息 */
	private String h_number;
	private String h_siliaopinzhong;
	private String h_rmb;
	private String h_y_name_1;
	private String h_y_name_2;
	private String h_y_name_3;
	private String h_factory_1;
	private String h_factory_2;
	private String h_factory_3;
	private String h_b_drug_1;
	private String h_b_drug_2;
	private String h_b_drug_3;
	//哺乳母猪
	private String b_number;
	private String b_siliaopinzhong;
	private String b_rmb;
	private String b_y_name_1;
	private String b_y_name_2;
	private String b_y_name_3;
	private String b_factory_1;
	private String b_factory_2;
	private String b_factory_3;
	private String b_b_drug_1;
	private String b_b_drug_2;
	private String b_b_drug_3;
	/* 母猪饲养成绩  */
	private String sy_date;				//断奶后配种天数
	private String sy_pingjun_number;	//基础母猪年均产仔窝数
	private String sy_cunhuo_number;	//母猪窝均产活仔数
	private String sy_jun_zhong;		//仔猪平均出生重
	private String sy_cunhuo_lv;		//产房哺乳仔猪成活率
	private String sy_duannai_zhong;	//平均断奶重
	/* 猪场目前饲养成绩评估与综合效益测算 */
	//母猪配种分娩率
	private String muzhupeizhongfeimianlv_youxiubiaozhun;
	private String muzhupeizhongfeimianlv_shijizhibiao;
	private String muzhupeizhongfeimianlv_tishengqianli;
	//基础母猪年均产仔窝数
	private String nianjunchanzai_youxiubiaozhun;
	private String nianjunchanzai_shijizhibiao;
	private String nianjunchanzai_tishengqianli;
	//母猪窝均产活仔数
	private String junchanhuozishu_youxiubiaozhun;
	private String junchanhuozishu_shijizhibiao;
	private String junchanhuozishu_tishengqianli;
	//产房哺乳仔猪成活率
	private String buruzizhuchenghuolv_youxiubiaozhun;
	private String buruzizhuchenghuolv_shijizhibiao;
	private String buruzizhuchenghuolv_tishengqianli;
	//仔猪初生重
	private String chushengzhong_youxiubiaozhun;
	private String chushengzhong_shijizhibiao;
	private String chushengzhong_tishengqianli;
	//28日龄断奶仔猪重
	private String duannaizhong_youxiubiaozhun;
	private String duannaizhong_shijizhibiao;
	private String duannaizhong_tishengqianli;
	//保育70日龄成活率
	private String baoyuchenghuolv_youxiubiaozhun;
	private String baoyuchenghuolv_shijizhibiao;
	private String baoyuchenghuolv_tishengqianli;
	//保育70日龄重
	private String lingzhong_youxiubiaozhun;
	private String lingzhong_shijizhibiao;
	private String lingzhong_tishengqianli;
	//育肥猪成活率
	private String yufeichenghuolv_youxiubiaozhun;
	private String yufeichenghuolv_shijizhibiao;
	private String yufeichenghuolv_tishengqianli;
	//育肥猪上市日龄
	private String shangshiling_youxiubiaozhun;
	private String shangshiling_shijizhibiao;
	private String shangshiling_tishengqianli;
	//每头母猪年提供断奶仔猪头数(PSY)
	private String PSY_youxiubiaozhun;
	private String PSY_shijizhibiao;
	private String PSY_tishengqianli;
	//每头母猪年上市肉猪头数(MSY)
	private String MSY_youxiubiaozhun;
	private String MSY_shijizhibiao;
	private String MSY_tishengqianli;
	//全程饲料料肉比
	private String liaoroubi_youxiubiaozhun;
	private String liaoroubi_shijizhibiao;
	private String liaoroubi_tishengqianli;
	//每头母猪防疫保健费用
	private String fangyifei_youxiubiaozhun;
	private String fangyifei_shijizhibiao;
	private String fangyifei_tishengqianli;
	//没头育肥猪防疫保健费用
	private String yf_fangyifei_youxiubiaozhun;
	private String yf_fangyifei_shijizhibiao;
	private String yf_fangyifei_tishengqianli;
	//造肉成本
	private String zaorouchengben_youxiubiaozhun;
	private String zaorouchengben_shijizhibiao;
	private String zaorouchengben_tishengqianli;
	//盈亏平衡点
	private String yingkuidian_youxiubiaozhun;
	private String yingkuidian_shijizhibiao;
	private String yingkuidian_tishengqianli;
	
	/* 育肥猪饲养成绩 */
	private String buruzizhu_cunlanshuliang;
	private String buruzizhu_cunlanshijian;
	private String buruzizhu_chulanzhongliang;
	private String buruzizhu_jieduanchenghuobi;
	private String buruzizhu_jieduanliaoroubi;
	
	private String baoyuzhu_cunlanshuliang;
	private String baoyuzhu_cunlanshijian;
	private String baoyuzhu_chulanzhongliang;
	private String baoyuzhu_jieduanchenghuobi;
	private String baoyuzhu_jieduanliaoroubi;

	private String yufeizhu_cunlanshuliang;
	private String yufeizhu_cunlanshijian;
	private String yufeizhu_chulanzhongliang;
	private String yufeizhu_jieduanchenghuobi;
	private String yufeizhu_jieduanliaoroubi;
	
	/* 育肥猪基本信息 */
	//哺乳仔猪
	private String buruzizhu_siliaopinzhong;
	private String buruzizhu_siliaopinpai;
	private String buruzizhu_siliaojiage;
	private String buruzizhu_yimiaomingcheng_1;
	private String buruzizhu_yimiaomingcheng_2;
	private String buruzizhu_yimiaomingcheng_3;
	private String buruzizhu_shengchanchangjia_1;
	private String buruzizhu_shengchanchangjia_2;
	private String buruzizhu_shengchanchangjia_3;
	private String buruzizhu_baojianyao_1;
	private String buruzizhu_baojianyao_2;
	private String buruzizhu_baojianyao_3;
	//保育猪
	private String baoyuzhu_siliaopinzhong;
	private String baoyuzhu_siliaopinpai;
	private String baoyuzhu_siliaojiage;
	private String baoyuzhu_yimiaomingcheng_1;
	private String baoyuzhu_yimiaomingcheng_2;
	private String baoyuzhu_yimiaomingcheng_3;
	private String baoyuzhu_shengchanchangjia_1;
	private String baoyuzhu_shengchanchangjia_2;
	private String baoyuzhu_shengchanchangjia_3;
	private String baoyuzhu_baojianyao_1;
	private String baoyuzhu_baojianyao_2;
	private String baoyuzhu_baojianyao_3;
	//育肥猪
	private String yufeizhu_siliaopinzhong;
	private String yufeizhu_siliaopinpai;
	private String yufeizhu_siliaojiage;
	private String yufeizhu_yimiaomingcheng_1;
	private String yufeizhu_yimiaomingcheng_2;
	private String yufeizhu_yimiaomingcheng_3;
	private String yufeizhu_shengchanchangjia_1;
	private String yufeizhu_shengchanchangjia_2;
	private String yufeizhu_shengchanchangjia_3;
	private String yufeizhu_baojianyao_1;
	private String yufeizhu_baojianyao_2;
	private String yufeizhu_baojianyao_3;
///////////////////////////////////////////////////////
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBir() {
		return bir;
	}
	public void setBir(String bir) {
		this.bir = bir;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public String getCenter() {
		return center;
	}
	public void setCenter(String center) {
		this.center = center;
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	public String getBianhao() {
		return bianhao;
	}
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	public String getKehutongdianmiaoshu_1() {
		return kehutongdianmiaoshu_1;
	}
	public void setKehutongdianmiaoshu_1(String kehutongdianmiaoshu_1) {
		this.kehutongdianmiaoshu_1 = kehutongdianmiaoshu_1;
	}
	public String getKehutongdianmiaoshu_2() {
		return kehutongdianmiaoshu_2;
	}
	public void setKehutongdianmiaoshu_2(String kehutongdianmiaoshu_2) {
		this.kehutongdianmiaoshu_2 = kehutongdianmiaoshu_2;
	}
	public String getKehutongdianmiaoshu_3() {
		return kehutongdianmiaoshu_3;
	}
	public void setKehutongdianmiaoshu_3(String kehutongdianmiaoshu_3) {
		this.kehutongdianmiaoshu_3 = kehutongdianmiaoshu_3;
	}
	public String getKehutongdianmiaoshu_4() {
		return kehutongdianmiaoshu_4;
	}
	public void setKehutongdianmiaoshu_4(String kehutongdianmiaoshu_4) {
		this.kehutongdianmiaoshu_4 = kehutongdianmiaoshu_4;
	}
	public String getH_number() {
		return h_number;
	}
	public void setH_number(String h_number) {
		this.h_number = h_number;
	}
	public String getH_siliaopinzhong() {
		return h_siliaopinzhong;
	}
	public void setH_siliaopinzhong(String h_siliaopinzhong) {
		this.h_siliaopinzhong = h_siliaopinzhong;
	}
	public String getH_rmb() {
		return h_rmb;
	}
	public void setH_rmb(String h_rmb) {
		this.h_rmb = h_rmb;
	}
	public String getH_y_name_1() {
		return h_y_name_1;
	}
	public void setH_y_name_1(String h_y_name_1) {
		this.h_y_name_1 = h_y_name_1;
	}
	public String getH_y_name_2() {
		return h_y_name_2;
	}
	public void setH_y_name_2(String h_y_name_2) {
		this.h_y_name_2 = h_y_name_2;
	}
	public String getH_y_name_3() {
		return h_y_name_3;
	}
	public void setH_y_name_3(String h_y_name_3) {
		this.h_y_name_3 = h_y_name_3;
	}
	public String getH_factory_1() {
		return h_factory_1;
	}
	public void setH_factory_1(String h_factory_1) {
		this.h_factory_1 = h_factory_1;
	}
	public String getH_factory_2() {
		return h_factory_2;
	}
	public void setH_factory_2(String h_factory_2) {
		this.h_factory_2 = h_factory_2;
	}
	public String getH_factory_3() {
		return h_factory_3;
	}
	public void setH_factory_3(String h_factory_3) {
		this.h_factory_3 = h_factory_3;
	}
	public String getH_b_drug_1() {
		return h_b_drug_1;
	}
	public void setH_b_drug_1(String h_b_drug_1) {
		this.h_b_drug_1 = h_b_drug_1;
	}
	public String getH_b_drug_2() {
		return h_b_drug_2;
	}
	public void setH_b_drug_2(String h_b_drug_2) {
		this.h_b_drug_2 = h_b_drug_2;
	}
	public String getH_b_drug_3() {
		return h_b_drug_3;
	}
	public void setH_b_drug_3(String h_b_drug_3) {
		this.h_b_drug_3 = h_b_drug_3;
	}
	public String getB_number() {
		return b_number;
	}
	public void setB_number(String b_number) {
		this.b_number = b_number;
	}
	public String getB_siliaopinzhong() {
		return b_siliaopinzhong;
	}
	public void setB_siliaopinzhong(String b_siliaopinzhong) {
		this.b_siliaopinzhong = b_siliaopinzhong;
	}
	public String getB_rmb() {
		return b_rmb;
	}
	public void setB_rmb(String b_rmb) {
		this.b_rmb = b_rmb;
	}
	public String getB_y_name_1() {
		return b_y_name_1;
	}
	public void setB_y_name_1(String b_y_name_1) {
		this.b_y_name_1 = b_y_name_1;
	}
	public String getB_y_name_2() {
		return b_y_name_2;
	}
	public void setB_y_name_2(String b_y_name_2) {
		this.b_y_name_2 = b_y_name_2;
	}
	public String getB_y_name_3() {
		return b_y_name_3;
	}
	public void setB_y_name_3(String b_y_name_3) {
		this.b_y_name_3 = b_y_name_3;
	}
	public String getB_factory_1() {
		return b_factory_1;
	}
	public void setB_factory_1(String b_factory_1) {
		this.b_factory_1 = b_factory_1;
	}
	public String getB_factory_2() {
		return b_factory_2;
	}
	public void setB_factory_2(String b_factory_2) {
		this.b_factory_2 = b_factory_2;
	}
	public String getB_factory_3() {
		return b_factory_3;
	}
	public void setB_factory_3(String b_factory_3) {
		this.b_factory_3 = b_factory_3;
	}
	public String getB_b_drug_1() {
		return b_b_drug_1;
	}
	public void setB_b_drug_1(String b_b_drug_1) {
		this.b_b_drug_1 = b_b_drug_1;
	}
	public String getB_b_drug_2() {
		return b_b_drug_2;
	}
	public void setB_b_drug_2(String b_b_drug_2) {
		this.b_b_drug_2 = b_b_drug_2;
	}
	public String getB_b_drug_3() {
		return b_b_drug_3;
	}
	public void setB_b_drug_3(String b_b_drug_3) {
		this.b_b_drug_3 = b_b_drug_3;
	}
	public String getSy_date() {
		return sy_date;
	}
	public void setSy_date(String sy_date) {
		this.sy_date = sy_date;
	}
	public String getSy_pingjun_number() {
		return sy_pingjun_number;
	}
	public void setSy_pingjun_number(String sy_pingjun_number) {
		this.sy_pingjun_number = sy_pingjun_number;
	}
	public String getSy_cunhuo_number() {
		return sy_cunhuo_number;
	}
	public void setSy_cunhuo_number(String sy_cunhuo_number) {
		this.sy_cunhuo_number = sy_cunhuo_number;
	}
	public String getSy_jun_zhong() {
		return sy_jun_zhong;
	}
	public void setSy_jun_zhong(String sy_jun_zhong) {
		this.sy_jun_zhong = sy_jun_zhong;
	}
	public String getSy_cunhuo_lv() {
		return sy_cunhuo_lv;
	}
	public void setSy_cunhuo_lv(String sy_cunhuo_lv) {
		this.sy_cunhuo_lv = sy_cunhuo_lv;
	}
	public String getSy_duannai_zhong() {
		return sy_duannai_zhong;
	}
	public void setSy_duannai_zhong(String sy_duannai_zhong) {
		this.sy_duannai_zhong = sy_duannai_zhong;
	}
	public String getMuzhupeizhongfeimianlv_youxiubiaozhun() {
		return muzhupeizhongfeimianlv_youxiubiaozhun;
	}
	public void setMuzhupeizhongfeimianlv_youxiubiaozhun(
			String muzhupeizhongfeimianlv_youxiubiaozhun) {
		this.muzhupeizhongfeimianlv_youxiubiaozhun = muzhupeizhongfeimianlv_youxiubiaozhun;
	}
	public String getMuzhupeizhongfeimianlv_shijizhibiao() {
		return muzhupeizhongfeimianlv_shijizhibiao;
	}
	public void setMuzhupeizhongfeimianlv_shijizhibiao(
			String muzhupeizhongfeimianlv_shijizhibiao) {
		this.muzhupeizhongfeimianlv_shijizhibiao = muzhupeizhongfeimianlv_shijizhibiao;
	}
	public String getMuzhupeizhongfeimianlv_tishengqianli() {
		return muzhupeizhongfeimianlv_tishengqianli;
	}
	public void setMuzhupeizhongfeimianlv_tishengqianli(
			String muzhupeizhongfeimianlv_tishengqianli) {
		this.muzhupeizhongfeimianlv_tishengqianli = muzhupeizhongfeimianlv_tishengqianli;
	}
	public String getNianjunchanzai_youxiubiaozhun() {
		return nianjunchanzai_youxiubiaozhun;
	}
	public void setNianjunchanzai_youxiubiaozhun(
			String nianjunchanzai_youxiubiaozhun) {
		this.nianjunchanzai_youxiubiaozhun = nianjunchanzai_youxiubiaozhun;
	}
	public String getNianjunchanzai_shijizhibiao() {
		return nianjunchanzai_shijizhibiao;
	}
	public void setNianjunchanzai_shijizhibiao(String nianjunchanzai_shijizhibiao) {
		this.nianjunchanzai_shijizhibiao = nianjunchanzai_shijizhibiao;
	}
	public String getNianjunchanzai_tishengqianli() {
		return nianjunchanzai_tishengqianli;
	}
	public void setNianjunchanzai_tishengqianli(String nianjunchanzai_tishengqianli) {
		this.nianjunchanzai_tishengqianli = nianjunchanzai_tishengqianli;
	}
	public String getJunchanhuozishu_youxiubiaozhun() {
		return junchanhuozishu_youxiubiaozhun;
	}
	public void setJunchanhuozishu_youxiubiaozhun(
			String junchanhuozishu_youxiubiaozhun) {
		this.junchanhuozishu_youxiubiaozhun = junchanhuozishu_youxiubiaozhun;
	}
	public String getJunchanhuozishu_shijizhibiao() {
		return junchanhuozishu_shijizhibiao;
	}
	public void setJunchanhuozishu_shijizhibiao(String junchanhuozishu_shijizhibiao) {
		this.junchanhuozishu_shijizhibiao = junchanhuozishu_shijizhibiao;
	}
	public String getJunchanhuozishu_tishengqianli() {
		return junchanhuozishu_tishengqianli;
	}
	public void setJunchanhuozishu_tishengqianli(
			String junchanhuozishu_tishengqianli) {
		this.junchanhuozishu_tishengqianli = junchanhuozishu_tishengqianli;
	}
	public String getBuruzizhuchenghuolv_youxiubiaozhun() {
		return buruzizhuchenghuolv_youxiubiaozhun;
	}
	public void setBuruzizhuchenghuolv_youxiubiaozhun(
			String buruzizhuchenghuolv_youxiubiaozhun) {
		this.buruzizhuchenghuolv_youxiubiaozhun = buruzizhuchenghuolv_youxiubiaozhun;
	}
	public String getBuruzizhuchenghuolv_shijizhibiao() {
		return buruzizhuchenghuolv_shijizhibiao;
	}
	public void setBuruzizhuchenghuolv_shijizhibiao(
			String buruzizhuchenghuolv_shijizhibiao) {
		this.buruzizhuchenghuolv_shijizhibiao = buruzizhuchenghuolv_shijizhibiao;
	}
	public String getBuruzizhuchenghuolv_tishengqianli() {
		return buruzizhuchenghuolv_tishengqianli;
	}
	public void setBuruzizhuchenghuolv_tishengqianli(
			String buruzizhuchenghuolv_tishengqianli) {
		this.buruzizhuchenghuolv_tishengqianli = buruzizhuchenghuolv_tishengqianli;
	}
	public String getChushengzhong_youxiubiaozhun() {
		return chushengzhong_youxiubiaozhun;
	}
	public void setChushengzhong_youxiubiaozhun(String chushengzhong_youxiubiaozhun) {
		this.chushengzhong_youxiubiaozhun = chushengzhong_youxiubiaozhun;
	}
	public String getChushengzhong_shijizhibiao() {
		return chushengzhong_shijizhibiao;
	}
	public void setChushengzhong_shijizhibiao(String chushengzhong_shijizhibiao) {
		this.chushengzhong_shijizhibiao = chushengzhong_shijizhibiao;
	}
	public String getChushengzhong_tishengqianli() {
		return chushengzhong_tishengqianli;
	}
	public void setChushengzhong_tishengqianli(String chushengzhong_tishengqianli) {
		this.chushengzhong_tishengqianli = chushengzhong_tishengqianli;
	}
	public String getDuannaizhong_youxiubiaozhun() {
		return duannaizhong_youxiubiaozhun;
	}
	public void setDuannaizhong_youxiubiaozhun(String duannaizhong_youxiubiaozhun) {
		this.duannaizhong_youxiubiaozhun = duannaizhong_youxiubiaozhun;
	}
	public String getDuannaizhong_shijizhibiao() {
		return duannaizhong_shijizhibiao;
	}
	public void setDuannaizhong_shijizhibiao(String duannaizhong_shijizhibiao) {
		this.duannaizhong_shijizhibiao = duannaizhong_shijizhibiao;
	}
	public String getDuannaizhong_tishengqianli() {
		return duannaizhong_tishengqianli;
	}
	public void setDuannaizhong_tishengqianli(String duannaizhong_tishengqianli) {
		this.duannaizhong_tishengqianli = duannaizhong_tishengqianli;
	}
	public String getBaoyuchenghuolv_youxiubiaozhun() {
		return baoyuchenghuolv_youxiubiaozhun;
	}
	public void setBaoyuchenghuolv_youxiubiaozhun(
			String baoyuchenghuolv_youxiubiaozhun) {
		this.baoyuchenghuolv_youxiubiaozhun = baoyuchenghuolv_youxiubiaozhun;
	}
	public String getBaoyuchenghuolv_shijizhibiao() {
		return baoyuchenghuolv_shijizhibiao;
	}
	public void setBaoyuchenghuolv_shijizhibiao(String baoyuchenghuolv_shijizhibiao) {
		this.baoyuchenghuolv_shijizhibiao = baoyuchenghuolv_shijizhibiao;
	}
	public String getBaoyuchenghuolv_tishengqianli() {
		return baoyuchenghuolv_tishengqianli;
	}
	public void setBaoyuchenghuolv_tishengqianli(
			String baoyuchenghuolv_tishengqianli) {
		this.baoyuchenghuolv_tishengqianli = baoyuchenghuolv_tishengqianli;
	}
	public String getLingzhong_youxiubiaozhun() {
		return lingzhong_youxiubiaozhun;
	}
	public void setLingzhong_youxiubiaozhun(String lingzhong_youxiubiaozhun) {
		this.lingzhong_youxiubiaozhun = lingzhong_youxiubiaozhun;
	}
	public String getLingzhong_shijizhibiao() {
		return lingzhong_shijizhibiao;
	}
	public void setLingzhong_shijizhibiao(String lingzhong_shijizhibiao) {
		this.lingzhong_shijizhibiao = lingzhong_shijizhibiao;
	}
	public String getLingzhong_tishengqianli() {
		return lingzhong_tishengqianli;
	}
	public void setLingzhong_tishengqianli(String lingzhong_tishengqianli) {
		this.lingzhong_tishengqianli = lingzhong_tishengqianli;
	}
	public String getYufeichenghuolv_youxiubiaozhun() {
		return yufeichenghuolv_youxiubiaozhun;
	}
	public void setYufeichenghuolv_youxiubiaozhun(
			String yufeichenghuolv_youxiubiaozhun) {
		this.yufeichenghuolv_youxiubiaozhun = yufeichenghuolv_youxiubiaozhun;
	}
	public String getYufeichenghuolv_shijizhibiao() {
		return yufeichenghuolv_shijizhibiao;
	}
	public void setYufeichenghuolv_shijizhibiao(String yufeichenghuolv_shijizhibiao) {
		this.yufeichenghuolv_shijizhibiao = yufeichenghuolv_shijizhibiao;
	}
	public String getYufeichenghuolv_tishengqianli() {
		return yufeichenghuolv_tishengqianli;
	}
	public void setYufeichenghuolv_tishengqianli(
			String yufeichenghuolv_tishengqianli) {
		this.yufeichenghuolv_tishengqianli = yufeichenghuolv_tishengqianli;
	}
	public String getShangshiling_youxiubiaozhun() {
		return shangshiling_youxiubiaozhun;
	}
	public void setShangshiling_youxiubiaozhun(String shangshiling_youxiubiaozhun) {
		this.shangshiling_youxiubiaozhun = shangshiling_youxiubiaozhun;
	}
	public String getShangshiling_shijizhibiao() {
		return shangshiling_shijizhibiao;
	}
	public void setShangshiling_shijizhibiao(String shangshiling_shijizhibiao) {
		this.shangshiling_shijizhibiao = shangshiling_shijizhibiao;
	}
	public String getShangshiling_tishengqianli() {
		return shangshiling_tishengqianli;
	}
	public void setShangshiling_tishengqianli(String shangshiling_tishengqianli) {
		this.shangshiling_tishengqianli = shangshiling_tishengqianli;
	}
	public String getPSY_youxiubiaozhun() {
		return PSY_youxiubiaozhun;
	}
	public void setPSY_youxiubiaozhun(String pSY_youxiubiaozhun) {
		PSY_youxiubiaozhun = pSY_youxiubiaozhun;
	}
	public String getPSY_shijizhibiao() {
		return PSY_shijizhibiao;
	}
	public void setPSY_shijizhibiao(String pSY_shijizhibiao) {
		PSY_shijizhibiao = pSY_shijizhibiao;
	}
	public String getPSY_tishengqianli() {
		return PSY_tishengqianli;
	}
	public void setPSY_tishengqianli(String pSY_tishengqianli) {
		PSY_tishengqianli = pSY_tishengqianli;
	}
	public String getMSY_youxiubiaozhun() {
		return MSY_youxiubiaozhun;
	}
	public void setMSY_youxiubiaozhun(String mSY_youxiubiaozhun) {
		MSY_youxiubiaozhun = mSY_youxiubiaozhun;
	}
	public String getMSY_shijizhibiao() {
		return MSY_shijizhibiao;
	}
	public void setMSY_shijizhibiao(String mSY_shijizhibiao) {
		MSY_shijizhibiao = mSY_shijizhibiao;
	}
	public String getMSY_tishengqianli() {
		return MSY_tishengqianli;
	}
	public void setMSY_tishengqianli(String mSY_tishengqianli) {
		MSY_tishengqianli = mSY_tishengqianli;
	}
	public String getLiaoroubi_youxiubiaozhun() {
		return liaoroubi_youxiubiaozhun;
	}
	public void setLiaoroubi_youxiubiaozhun(String liaoroubi_youxiubiaozhun) {
		this.liaoroubi_youxiubiaozhun = liaoroubi_youxiubiaozhun;
	}
	public String getLiaoroubi_shijizhibiao() {
		return liaoroubi_shijizhibiao;
	}
	public void setLiaoroubi_shijizhibiao(String liaoroubi_shijizhibiao) {
		this.liaoroubi_shijizhibiao = liaoroubi_shijizhibiao;
	}
	public String getLiaoroubi_tishengqianli() {
		return liaoroubi_tishengqianli;
	}
	public void setLiaoroubi_tishengqianli(String liaoroubi_tishengqianli) {
		this.liaoroubi_tishengqianli = liaoroubi_tishengqianli;
	}
	public String getFangyifei_youxiubiaozhun() {
		return fangyifei_youxiubiaozhun;
	}
	public void setFangyifei_youxiubiaozhun(String fangyifei_youxiubiaozhun) {
		this.fangyifei_youxiubiaozhun = fangyifei_youxiubiaozhun;
	}
	public String getFangyifei_shijizhibiao() {
		return fangyifei_shijizhibiao;
	}
	public void setFangyifei_shijizhibiao(String fangyifei_shijizhibiao) {
		this.fangyifei_shijizhibiao = fangyifei_shijizhibiao;
	}
	public String getFangyifei_tishengqianli() {
		return fangyifei_tishengqianli;
	}
	public void setFangyifei_tishengqianli(String fangyifei_tishengqianli) {
		this.fangyifei_tishengqianli = fangyifei_tishengqianli;
	}
	public String getYf_fangyifei_youxiubiaozhun() {
		return yf_fangyifei_youxiubiaozhun;
	}
	public void setYf_fangyifei_youxiubiaozhun(String yf_fangyifei_youxiubiaozhun) {
		this.yf_fangyifei_youxiubiaozhun = yf_fangyifei_youxiubiaozhun;
	}
	public String getYf_fangyifei_shijizhibiao() {
		return yf_fangyifei_shijizhibiao;
	}
	public void setYf_fangyifei_shijizhibiao(String yf_fangyifei_shijizhibiao) {
		this.yf_fangyifei_shijizhibiao = yf_fangyifei_shijizhibiao;
	}
	public String getYf_fangyifei_tishengqianli() {
		return yf_fangyifei_tishengqianli;
	}
	public void setYf_fangyifei_tishengqianli(String yf_fangyifei_tishengqianli) {
		this.yf_fangyifei_tishengqianli = yf_fangyifei_tishengqianli;
	}
	public String getZaorouchengben_youxiubiaozhun() {
		return zaorouchengben_youxiubiaozhun;
	}
	public void setZaorouchengben_youxiubiaozhun(
			String zaorouchengben_youxiubiaozhun) {
		this.zaorouchengben_youxiubiaozhun = zaorouchengben_youxiubiaozhun;
	}
	public String getZaorouchengben_shijizhibiao() {
		return zaorouchengben_shijizhibiao;
	}
	public void setZaorouchengben_shijizhibiao(String zaorouchengben_shijizhibiao) {
		this.zaorouchengben_shijizhibiao = zaorouchengben_shijizhibiao;
	}
	public String getZaorouchengben_tishengqianli() {
		return zaorouchengben_tishengqianli;
	}
	public void setZaorouchengben_tishengqianli(String zaorouchengben_tishengqianli) {
		this.zaorouchengben_tishengqianli = zaorouchengben_tishengqianli;
	}
	public String getYingkuidian_youxiubiaozhun() {
		return yingkuidian_youxiubiaozhun;
	}
	public void setYingkuidian_youxiubiaozhun(String yingkuidian_youxiubiaozhun) {
		this.yingkuidian_youxiubiaozhun = yingkuidian_youxiubiaozhun;
	}
	public String getYingkuidian_shijizhibiao() {
		return yingkuidian_shijizhibiao;
	}
	public void setYingkuidian_shijizhibiao(String yingkuidian_shijizhibiao) {
		this.yingkuidian_shijizhibiao = yingkuidian_shijizhibiao;
	}
	public String getYingkuidian_tishengqianli() {
		return yingkuidian_tishengqianli;
	}
	public void setYingkuidian_tishengqianli(String yingkuidian_tishengqianli) {
		this.yingkuidian_tishengqianli = yingkuidian_tishengqianli;
	}
	public String getBuruzizhu_cunlanshuliang() {
		return buruzizhu_cunlanshuliang;
	}
	public void setBuruzizhu_cunlanshuliang(String buruzizhu_cunlanshuliang) {
		this.buruzizhu_cunlanshuliang = buruzizhu_cunlanshuliang;
	}
	public String getBuruzizhu_cunlanshijian() {
		return buruzizhu_cunlanshijian;
	}
	public void setBuruzizhu_cunlanshijian(String buruzizhu_cunlanshijian) {
		this.buruzizhu_cunlanshijian = buruzizhu_cunlanshijian;
	}
	public String getBuruzizhu_chulanzhongliang() {
		return buruzizhu_chulanzhongliang;
	}
	public void setBuruzizhu_chulanzhongliang(String buruzizhu_chulanzhongliang) {
		this.buruzizhu_chulanzhongliang = buruzizhu_chulanzhongliang;
	}
	public String getBuruzizhu_jieduanchenghuobi() {
		return buruzizhu_jieduanchenghuobi;
	}
	public void setBuruzizhu_jieduanchenghuobi(String buruzizhu_jieduanchenghuobi) {
		this.buruzizhu_jieduanchenghuobi = buruzizhu_jieduanchenghuobi;
	}
	public String getBuruzizhu_jieduanliaoroubi() {
		return buruzizhu_jieduanliaoroubi;
	}
	public void setBuruzizhu_jieduanliaoroubi(String buruzizhu_jieduanliaoroubi) {
		this.buruzizhu_jieduanliaoroubi = buruzizhu_jieduanliaoroubi;
	}
	public String getBaoyuzhu_cunlanshuliang() {
		return baoyuzhu_cunlanshuliang;
	}
	public void setBaoyuzhu_cunlanshuliang(String baoyuzhu_cunlanshuliang) {
		this.baoyuzhu_cunlanshuliang = baoyuzhu_cunlanshuliang;
	}
	public String getBaoyuzhu_cunlanshijian() {
		return baoyuzhu_cunlanshijian;
	}
	public void setBaoyuzhu_cunlanshijian(String baoyuzhu_cunlanshijian) {
		this.baoyuzhu_cunlanshijian = baoyuzhu_cunlanshijian;
	}
	public String getBaoyuzhu_chulanzhongliang() {
		return baoyuzhu_chulanzhongliang;
	}
	public void setBaoyuzhu_chulanzhongliang(String baoyuzhu_chulanzhongliang) {
		this.baoyuzhu_chulanzhongliang = baoyuzhu_chulanzhongliang;
	}
	public String getBaoyuzhu_jieduanchenghuobi() {
		return baoyuzhu_jieduanchenghuobi;
	}
	public void setBaoyuzhu_jieduanchenghuobi(String baoyuzhu_jieduanchenghuobi) {
		this.baoyuzhu_jieduanchenghuobi = baoyuzhu_jieduanchenghuobi;
	}
	public String getBaoyuzhu_jieduanliaoroubi() {
		return baoyuzhu_jieduanliaoroubi;
	}
	public void setBaoyuzhu_jieduanliaoroubi(String baoyuzhu_jieduanliaoroubi) {
		this.baoyuzhu_jieduanliaoroubi = baoyuzhu_jieduanliaoroubi;
	}
	public String getYufeizhu_cunlanshuliang() {
		return yufeizhu_cunlanshuliang;
	}
	public void setYufeizhu_cunlanshuliang(String yufeizhu_cunlanshuliang) {
		this.yufeizhu_cunlanshuliang = yufeizhu_cunlanshuliang;
	}
	public String getYufeizhu_cunlanshijian() {
		return yufeizhu_cunlanshijian;
	}
	public void setYufeizhu_cunlanshijian(String yufeizhu_cunlanshijian) {
		this.yufeizhu_cunlanshijian = yufeizhu_cunlanshijian;
	}
	public String getYufeizhu_chulanzhongliang() {
		return yufeizhu_chulanzhongliang;
	}
	public void setYufeizhu_chulanzhongliang(String yufeizhu_chulanzhongliang) {
		this.yufeizhu_chulanzhongliang = yufeizhu_chulanzhongliang;
	}
	public String getYufeizhu_jieduanchenghuobi() {
		return yufeizhu_jieduanchenghuobi;
	}
	public void setYufeizhu_jieduanchenghuobi(String yufeizhu_jieduanchenghuobi) {
		this.yufeizhu_jieduanchenghuobi = yufeizhu_jieduanchenghuobi;
	}
	public String getYufeizhu_jieduanliaoroubi() {
		return yufeizhu_jieduanliaoroubi;
	}
	public void setYufeizhu_jieduanliaoroubi(String yufeizhu_jieduanliaoroubi) {
		this.yufeizhu_jieduanliaoroubi = yufeizhu_jieduanliaoroubi;
	}
	public String getBuruzizhu_siliaopinzhong() {
		return buruzizhu_siliaopinzhong;
	}
	public void setBuruzizhu_siliaopinzhong(String buruzizhu_siliaopinzhong) {
		this.buruzizhu_siliaopinzhong = buruzizhu_siliaopinzhong;
	}
	public String getBuruzizhu_siliaopinpai() {
		return buruzizhu_siliaopinpai;
	}
	public void setBuruzizhu_siliaopinpai(String buruzizhu_siliaopinpai) {
		this.buruzizhu_siliaopinpai = buruzizhu_siliaopinpai;
	}
	public String getBuruzizhu_siliaojiage() {
		return buruzizhu_siliaojiage;
	}
	public void setBuruzizhu_siliaojiage(String buruzizhu_siliaojiage) {
		this.buruzizhu_siliaojiage = buruzizhu_siliaojiage;
	}
	public String getBuruzizhu_yimiaomingcheng_1() {
		return buruzizhu_yimiaomingcheng_1;
	}
	public void setBuruzizhu_yimiaomingcheng_1(String buruzizhu_yimiaomingcheng_1) {
		this.buruzizhu_yimiaomingcheng_1 = buruzizhu_yimiaomingcheng_1;
	}
	public String getBuruzizhu_yimiaomingcheng_2() {
		return buruzizhu_yimiaomingcheng_2;
	}
	public void setBuruzizhu_yimiaomingcheng_2(String buruzizhu_yimiaomingcheng_2) {
		this.buruzizhu_yimiaomingcheng_2 = buruzizhu_yimiaomingcheng_2;
	}
	public String getBuruzizhu_yimiaomingcheng_3() {
		return buruzizhu_yimiaomingcheng_3;
	}
	public void setBuruzizhu_yimiaomingcheng_3(String buruzizhu_yimiaomingcheng_3) {
		this.buruzizhu_yimiaomingcheng_3 = buruzizhu_yimiaomingcheng_3;
	}
	public String getBuruzizhu_shengchanchangjia_1() {
		return buruzizhu_shengchanchangjia_1;
	}
	public void setBuruzizhu_shengchanchangjia_1(
			String buruzizhu_shengchanchangjia_1) {
		this.buruzizhu_shengchanchangjia_1 = buruzizhu_shengchanchangjia_1;
	}
	public String getBuruzizhu_shengchanchangjia_2() {
		return buruzizhu_shengchanchangjia_2;
	}
	public void setBuruzizhu_shengchanchangjia_2(
			String buruzizhu_shengchanchangjia_2) {
		this.buruzizhu_shengchanchangjia_2 = buruzizhu_shengchanchangjia_2;
	}
	public String getBuruzizhu_shengchanchangjia_3() {
		return buruzizhu_shengchanchangjia_3;
	}
	public void setBuruzizhu_shengchanchangjia_3(
			String buruzizhu_shengchanchangjia_3) {
		this.buruzizhu_shengchanchangjia_3 = buruzizhu_shengchanchangjia_3;
	}
	public String getBuruzizhu_baojianyao_1() {
		return buruzizhu_baojianyao_1;
	}
	public void setBuruzizhu_baojianyao_1(String buruzizhu_baojianyao_1) {
		this.buruzizhu_baojianyao_1 = buruzizhu_baojianyao_1;
	}
	public String getBuruzizhu_baojianyao_2() {
		return buruzizhu_baojianyao_2;
	}
	public void setBuruzizhu_baojianyao_2(String buruzizhu_baojianyao_2) {
		this.buruzizhu_baojianyao_2 = buruzizhu_baojianyao_2;
	}
	public String getBuruzizhu_baojianyao_3() {
		return buruzizhu_baojianyao_3;
	}
	public void setBuruzizhu_baojianyao_3(String buruzizhu_baojianyao_3) {
		this.buruzizhu_baojianyao_3 = buruzizhu_baojianyao_3;
	}
	public String getBaoyuzhu_siliaopinzhong() {
		return baoyuzhu_siliaopinzhong;
	}
	public void setBaoyuzhu_siliaopinzhong(String baoyuzhu_siliaopinzhong) {
		this.baoyuzhu_siliaopinzhong = baoyuzhu_siliaopinzhong;
	}
	public String getBaoyuzhu_siliaopinpai() {
		return baoyuzhu_siliaopinpai;
	}
	public void setBaoyuzhu_siliaopinpai(String baoyuzhu_siliaopinpai) {
		this.baoyuzhu_siliaopinpai = baoyuzhu_siliaopinpai;
	}
	public String getBaoyuzhu_siliaojiage() {
		return baoyuzhu_siliaojiage;
	}
	public void setBaoyuzhu_siliaojiage(String baoyuzhu_siliaojiage) {
		this.baoyuzhu_siliaojiage = baoyuzhu_siliaojiage;
	}
	public String getBaoyuzhu_yimiaomingcheng_1() {
		return baoyuzhu_yimiaomingcheng_1;
	}
	public void setBaoyuzhu_yimiaomingcheng_1(String baoyuzhu_yimiaomingcheng_1) {
		this.baoyuzhu_yimiaomingcheng_1 = baoyuzhu_yimiaomingcheng_1;
	}
	public String getBaoyuzhu_yimiaomingcheng_2() {
		return baoyuzhu_yimiaomingcheng_2;
	}
	public void setBaoyuzhu_yimiaomingcheng_2(String baoyuzhu_yimiaomingcheng_2) {
		this.baoyuzhu_yimiaomingcheng_2 = baoyuzhu_yimiaomingcheng_2;
	}
	public String getBaoyuzhu_yimiaomingcheng_3() {
		return baoyuzhu_yimiaomingcheng_3;
	}
	public void setBaoyuzhu_yimiaomingcheng_3(String baoyuzhu_yimiaomingcheng_3) {
		this.baoyuzhu_yimiaomingcheng_3 = baoyuzhu_yimiaomingcheng_3;
	}
	public String getBaoyuzhu_shengchanchangjia_1() {
		return baoyuzhu_shengchanchangjia_1;
	}
	public void setBaoyuzhu_shengchanchangjia_1(String baoyuzhu_shengchanchangjia_1) {
		this.baoyuzhu_shengchanchangjia_1 = baoyuzhu_shengchanchangjia_1;
	}
	public String getBaoyuzhu_shengchanchangjia_2() {
		return baoyuzhu_shengchanchangjia_2;
	}
	public void setBaoyuzhu_shengchanchangjia_2(String baoyuzhu_shengchanchangjia_2) {
		this.baoyuzhu_shengchanchangjia_2 = baoyuzhu_shengchanchangjia_2;
	}
	public String getBaoyuzhu_shengchanchangjia_3() {
		return baoyuzhu_shengchanchangjia_3;
	}
	public void setBaoyuzhu_shengchanchangjia_3(String baoyuzhu_shengchanchangjia_3) {
		this.baoyuzhu_shengchanchangjia_3 = baoyuzhu_shengchanchangjia_3;
	}
	public String getBaoyuzhu_baojianyao_1() {
		return baoyuzhu_baojianyao_1;
	}
	public void setBaoyuzhu_baojianyao_1(String baoyuzhu_baojianyao_1) {
		this.baoyuzhu_baojianyao_1 = baoyuzhu_baojianyao_1;
	}
	public String getBaoyuzhu_baojianyao_2() {
		return baoyuzhu_baojianyao_2;
	}
	public void setBaoyuzhu_baojianyao_2(String baoyuzhu_baojianyao_2) {
		this.baoyuzhu_baojianyao_2 = baoyuzhu_baojianyao_2;
	}
	public String getBaoyuzhu_baojianyao_3() {
		return baoyuzhu_baojianyao_3;
	}
	public void setBaoyuzhu_baojianyao_3(String baoyuzhu_baojianyao_3) {
		this.baoyuzhu_baojianyao_3 = baoyuzhu_baojianyao_3;
	}
	public String getYufeizhu_siliaopinzhong() {
		return yufeizhu_siliaopinzhong;
	}
	public void setYufeizhu_siliaopinzhong(String yufeizhu_siliaopinzhong) {
		this.yufeizhu_siliaopinzhong = yufeizhu_siliaopinzhong;
	}
	public String getYufeizhu_siliaopinpai() {
		return yufeizhu_siliaopinpai;
	}
	public void setYufeizhu_siliaopinpai(String yufeizhu_siliaopinpai) {
		this.yufeizhu_siliaopinpai = yufeizhu_siliaopinpai;
	}
	public String getYufeizhu_siliaojiage() {
		return yufeizhu_siliaojiage;
	}
	public void setYufeizhu_siliaojiage(String yufeizhu_siliaojiage) {
		this.yufeizhu_siliaojiage = yufeizhu_siliaojiage;
	}
	public String getYufeizhu_yimiaomingcheng_1() {
		return yufeizhu_yimiaomingcheng_1;
	}
	public void setYufeizhu_yimiaomingcheng_1(String yufeizhu_yimiaomingcheng_1) {
		this.yufeizhu_yimiaomingcheng_1 = yufeizhu_yimiaomingcheng_1;
	}
	public String getYufeizhu_yimiaomingcheng_2() {
		return yufeizhu_yimiaomingcheng_2;
	}
	public void setYufeizhu_yimiaomingcheng_2(String yufeizhu_yimiaomingcheng_2) {
		this.yufeizhu_yimiaomingcheng_2 = yufeizhu_yimiaomingcheng_2;
	}
	public String getYufeizhu_yimiaomingcheng_3() {
		return yufeizhu_yimiaomingcheng_3;
	}
	public void setYufeizhu_yimiaomingcheng_3(String yufeizhu_yimiaomingcheng_3) {
		this.yufeizhu_yimiaomingcheng_3 = yufeizhu_yimiaomingcheng_3;
	}
	public String getYufeizhu_shengchanchangjia_1() {
		return yufeizhu_shengchanchangjia_1;
	}
	public void setYufeizhu_shengchanchangjia_1(String yufeizhu_shengchanchangjia_1) {
		this.yufeizhu_shengchanchangjia_1 = yufeizhu_shengchanchangjia_1;
	}
	public String getYufeizhu_shengchanchangjia_2() {
		return yufeizhu_shengchanchangjia_2;
	}
	public void setYufeizhu_shengchanchangjia_2(String yufeizhu_shengchanchangjia_2) {
		this.yufeizhu_shengchanchangjia_2 = yufeizhu_shengchanchangjia_2;
	}
	public String getYufeizhu_shengchanchangjia_3() {
		return yufeizhu_shengchanchangjia_3;
	}
	public void setYufeizhu_shengchanchangjia_3(String yufeizhu_shengchanchangjia_3) {
		this.yufeizhu_shengchanchangjia_3 = yufeizhu_shengchanchangjia_3;
	}
	public String getYufeizhu_baojianyao_1() {
		return yufeizhu_baojianyao_1;
	}
	public void setYufeizhu_baojianyao_1(String yufeizhu_baojianyao_1) {
		this.yufeizhu_baojianyao_1 = yufeizhu_baojianyao_1;
	}
	public String getYufeizhu_baojianyao_2() {
		return yufeizhu_baojianyao_2;
	}
	public void setYufeizhu_baojianyao_2(String yufeizhu_baojianyao_2) {
		this.yufeizhu_baojianyao_2 = yufeizhu_baojianyao_2;
	}
	public String getYufeizhu_baojianyao_3() {
		return yufeizhu_baojianyao_3;
	}
	public void setYufeizhu_baojianyao_3(String yufeizhu_baojianyao_3) {
		this.yufeizhu_baojianyao_3 = yufeizhu_baojianyao_3;
	}
}
