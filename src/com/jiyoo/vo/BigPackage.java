package com.jiyoo.vo;

public class BigPackage {
	
//权限归属
	private String mdaqu;//门店经理
	private String daquusername;//大区招商经理
	
//(1.0)基本信息
	private String bianhao;//编号
	private String uname;//姓名
	private String ip;//住址
	private String age;//年龄
	private String phone;//电话
	private String bir;//生日
	private String sex;//性别
	private String weixin;//微信号
	private String guimo;//规模
	private String pigfactoryname;//猪场名称
	private String pigbuildtime;//猪舍建筑时间
	private String yufeiarea;//育肥舍面积
	private String justnumber;//空怀母猪大栏个数
	private String justarea;//空怀母猪大栏面积
	private String justsownumber;//空怀母猪定位栏个数
	private String sowtablenumber;//母猪产床数
	private String baoyubednumber;//保育床个数
	private String winterheating;//冬季取暖设施
	private String baoyuarea;//保育床面积
	private String baoyuhighbed;//是否高床	
	private String boilerscale;//锅炉规模
	private String roomheatingmethod;//产房取暖方法
	private String baoyuheatingmethod;//保育舍取暖方法
	private String yufeiheatingmethod;//育肥舍取暖方法
	private String pigfarmsorbig;//猪场规模是否有扩展空间
	private String orplans;//猪场生产是否有扩展计划
// (2.1)母猪基本信息 
	private String h_number;//怀孕母猪-存栏数量
	private String h_siliaopinzhong;//怀孕母猪-饲料品种
	private String h_rmb;//怀孕母猪-饲料价格
	private String h_y_name_1;//怀孕母猪-疫苗名称1
	private String h_y_name_2;//怀孕母猪-疫苗名称2
	private String h_y_name_3;//怀孕母猪-疫苗名称3
	private String h_y_name_4;//怀孕母猪-疫苗名称4
	private String h_factory_1;//怀孕母猪-生产厂家1
	private String h_factory_2;//怀孕母猪-生产厂家2
	private String h_factory_3;//怀孕母猪-生产厂家3
	private String h_factory_4;//怀孕母猪-生产厂家4
	private String h_b_drug_1;//怀孕母猪-保健药品1
	private String h_b_drug_2;//怀孕母猪-保健药品2
	private String h_b_drug_3;//怀孕母猪-保健药品3
	private String h_b_drug_4;//怀孕母猪-保健药品4
	
	private String b_number;//哺乳母猪-存栏数量
	private String b_siliaopinzhong;//哺乳母猪--饲料品种
	private String b_rmb;//哺乳母猪--饲料价格
	private String b_y_name_1;//哺乳母猪--疫苗名称
	private String b_y_name_2;//哺乳母猪--疫苗名称
	private String b_y_name_3;//哺乳母猪--疫苗名称
	private String b_y_name_4;//哺乳母猪--疫苗名称
	private String b_factory_1;//哺乳母猪--生产厂家
	private String b_factory_2;//哺乳母猪--生产厂家
	private String b_factory_3;//哺乳母猪--生产厂家
	private String b_factory_4;//哺乳母猪--生产厂家
	private String b_b_drug_1;//哺乳母猪--保健药品
	private String b_b_drug_2;//哺乳母猪--保健药品
	private String b_b_drug_3;//哺乳母猪--保健药品
	private String b_b_drug_4;//哺乳母猪--保健药品
//2.2  母猪饲养成绩
	private String sy_date;				//断奶后配种天数
	private String sy_fenmian;			//母猪配种分娩率
	private String sy_pingjun_number;	//基础母猪年均产仔窝数
	private String sy_cunhuo_number;	//母猪窝均产活仔数
	private String sy_jun_zhong;		//仔猪平均出生重
	private String sy_cunhuo_lv;		//产房哺乳仔猪成活率
	private String sy_duannai_zhong;	//平均断奶重
//2.3 育肥猪基本信息
	private String buruzizhu_siliaopinzhong;//哺乳仔猪-饲料品种
	private String buruzizhu_siliaopinpai;//哺乳仔猪-饲料品牌
	private String buruzizhu_siliaojiage;//哺乳仔猪-饲料价格
	private String buruzizhu_yimiaomingcheng_1;//哺乳仔猪-疫苗名称
	private String buruzizhu_yimiaomingcheng_2;
	private String buruzizhu_yimiaomingcheng_3;
	private String buruzizhu_shengchanchangjia_1;//哺乳仔猪-生产厂家
	private String buruzizhu_shengchanchangjia_2;
	private String buruzizhu_shengchanchangjia_3;
	private String buruzizhu_baojianyao_1;//哺乳仔猪-保健药
	private String buruzizhu_baojianyao_2;
	private String buruzizhu_baojianyao_3;
	
	private String baoyuzhu_siliaopinzhong;//保育猪
	private String baoyuzhu_siliaopinpai;//保育猪
	private String baoyuzhu_siliaojiage;//保育猪
	private String baoyuzhu_yimiaomingcheng_1;//保育猪
	private String baoyuzhu_yimiaomingcheng_2;
	private String baoyuzhu_yimiaomingcheng_3;
	private String baoyuzhu_shengchanchangjia_1;//保育猪
	private String baoyuzhu_shengchanchangjia_2;
	private String baoyuzhu_shengchanchangjia_3;
	private String baoyuzhu_baojianyao_1;//保育猪
	private String baoyuzhu_baojianyao_2;
	private String baoyuzhu_baojianyao_3;
	
	private String yufeizhu_siliaopinzhong;//育肥猪
	private String yufeizhu_siliaopinpai;//育肥猪
	private String yufeizhu_siliaojiage;//育肥猪
	private String yufeizhu_yimiaomingcheng_1;//育肥猪
	private String yufeizhu_yimiaomingcheng_2;
	private String yufeizhu_yimiaomingcheng_3;
	private String yufeizhu_shengchanchangjia_1;//育肥猪
	private String yufeizhu_shengchanchangjia_2;
	private String yufeizhu_shengchanchangjia_3;
	private String yufeizhu_baojianyao_1;//育肥猪
	private String yufeizhu_baojianyao_2;
	private String yufeizhu_baojianyao_3;
//2.4  育肥猪饲养成绩
	private String buruzizhu_cunlanshuliang;//哺乳仔猪-存栏数量
	private String buruzizhu_cunlanshijian;//哺乳仔猪-存栏时间
	private String buruzizhu_chulanzhongliang;//哺乳仔猪-存栏重量
	private String buruzizhu_jieduanchenghuobi;//哺乳仔猪-阶段成活率
	private String buruzizhu_jieduanliaoroubi;//哺乳仔猪-阶段料肉比
	
	private String baoyuzhu_cunlanshuliang;//保育猪
	private String baoyuzhu_cunlanshijian;
	private String baoyuzhu_chulanzhongliang;
	private String baoyuzhu_jieduanchenghuobi;
	private String baoyuzhu_jieduanliaoroubi;

	private String yufeizhu_cunlanshuliang;//育肥猪
	private String yufeizhu_cunlanshijian;
	private String yufeizhu_chulanzhongliang;
	private String yufeizhu_jieduanchenghuobi;
	private String yufeizhu_jieduanliaoroubi;
	
//2.5客户痛点描述    文本
	private String describes;//客户痛点描述
	
//3 猪场目前饲养成绩评估与综合效益测算
	//母猪配种分娩率
	private String muzhupeizhongfeimianlv_youxiubiaozhun;//优秀标准
	private String muzhupeizhongfeimianlv_shijizhibiao;//实际指标
	private String muzhupeizhongfeimianlv_tishengqianli;//提升潜力
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
	
//4.1    文本
	private String report_analysis;//抗体检测报告分析
	private String report_conclusion;//抗体检测报告结论
//4.2    文本
	private String anatomy_analysis;//解剖图片分析
	private String anatomy_conclusion;//解剖结论 
//4.3    文本
	private String symptoms_performance;//临床表现
	private String symptoms_conclusion;//诊断结论
//4.4    文本
	private String comprehensive_report;//综合评估
//(5.0) 5优堂猪场整体解决方案   overall_solution      文本
	private String overall_solution_renshen_plan;//妊娠母猪解决方案
	private String overall_solution_renshen_cycle;//妊娠母猪治疗周期
	private String overall_solution_renshen_effect;//妊娠母猪效果预估
	private String overall_solution_buru_plan;//哺乳母猪解决方案
	private String overall_solution_buru_cycle;//哺乳母猪治疗周期
	private String overall_solution_buru_effect;//哺乳母猪效果预估
	private String overall_solution_baoyu_plan;//保育母猪解决方案
	private String overall_solution_baoyu_cycle;//保育母猪治疗周期
	private String overall_solution_baoyu_effect;//保育母猪效果预估
	
//6.1 猪场目前饲养成绩评估与综合效益测算
	//母猪配种分娩率
		private String muzhupeizhongfeimianlv_yuanlaizhibiao;//优秀标准
		private String muzhupeizhongfeimianlv_mubiaozhibiao;//实际指标
		private String muzhupeizhongfeimianlv_gaishanbili;//提升潜力
		//基础母猪年均产仔窝数
		private String nianjunchanzai_yuanlaizhibiao;
		private String nianjunchanzai_mubiaozhibiao;
		private String nianjunchanzai_gaishanbili;
		//母猪窝均产活仔数
		private String junchanhuozishu_yuanlaizhibiao;
		private String junchanhuozishu_mubiaozhibiao;
		private String junchanhuozishu_gaishanbili;
		//产房哺乳仔猪成活率
		private String buruzizhuchenghuolv_yuanlaizhibiao;
		private String buruzizhuchenghuolv_mubiaozhibiao;
		private String buruzizhuchenghuolv_gaishanbili;
		//仔猪初生重
		private String chushengzhong_yuanlaizhibiao;
		private String chushengzhong_mubiaozhibiao;
		private String chushengzhong_gaishanbili;
		//28日龄断奶仔猪重
		private String duannaizhong_yuanlaizhibiao;
		private String duannaizhong_mubiaozhibiao;
		private String duannaizhong_gaishanbili;
		//保育70日龄成活率
		private String baoyuchenghuolv_yuanlaizhibiao;
		private String baoyuchenghuolv_mubiaozhibiao;
		private String baoyuchenghuolv_gaishanbili;
		//保育70日龄重
		private String lingzhong_yuanlaizhibiao;
		private String lingzhong_mubiaozhibiao;
		private String lingzhong_gaishanbili;
		//育肥猪成活率
		private String yufeichenghuolv_yuanlaizhibiao;
		private String yufeichenghuolv_mubiaozhibiao;
		private String yufeichenghuolv_gaishanbili;
		//育肥猪上市日龄
		private String shangshiling_yuanlaizhibiao;
		private String shangshiling_mubiaozhibiao;
		private String shangshiling_gaishanbili;
		//每头母猪年提供断奶仔猪头数(PSY)
		private String PSY_yuanlaizhibiao;
		private String PSY_mubiaozhibiao;
		private String PSY_gaishanbili;
		//每头母猪年上市肉猪头数(MSY)
		private String MSY_yuanlaizhibiao;
		private String MSY_mubiaozhibiao;
		private String MSY_gaishanbili;
		//全程饲料料肉比
		private String liaoroubi_yuanlaizhibiao;
		private String liaoroubi_mubiaozhibiao;
		private String liaoroubi_gaishanbili;
		//每头母猪防疫保健费用
		private String fangyifei_yuanlaizhibiao;
		private String fangyifei_mubiaozhibiao;
		private String fangyifei_gaishanbili;
		//没头育肥猪防疫保健费用
		private String yf_fangyifei_yuanlaizhibiao;
		private String yf_fangyifei_mubiaozhibiao;
		private String yf_fangyifei_gaishanbili;
		//造肉成本
		private String zaorouchengben_yuanlaizhibiao;
		private String zaorouchengben_mubiaozhibiao;
		private String zaorouchengben_gaishanbili;
		//盈亏平衡点
		private String yingkuidian_yuanlaizhibiao;
		private String yingkuidian_mubiaozhibiao;
		private String yingkuidian_gaishanbili;
		
//(6.2)直接生产成本对比（每头猪）cost_comparison
		private String cost_comparison_original_buruzizhu_siliao;//哺乳仔猪--原来成本--饲料
		private String cost_comparison_original_buruzizhu_yimiao;//哺乳仔猪--原来成本--疫苗
		private String cost_comparison_original_buruzizhu_baojian;//哺乳仔猪--原来成本--治疗保健
		private String cost_comparison_jiyooh_buruzizhu_siliao;//哺乳仔猪-5优堂--饲料
		private String cost_comparison_jiyooh_buruzizhu_yimiao;//哺乳仔猪-5优堂--疫苗
		private String cost_comparison_jiyooh_buruzizhu_baojian;//哺乳仔猪-5优堂--治疗保健
		
		private String cost_comparison_original_baoyuzhu_siliao;//保育猪--原来成本--饲料
		private String cost_comparison_original_baoyuzhu_yimiao;//保育猪--原来成本--疫苗
		private String cost_comparison_original_baoyuzhu_baojian;//保育猪--原来成本--治疗保健
		private String cost_comparison_jiyooh_baoyuzhu_siliao;//保育猪-5优堂--饲料
		private String cost_comparison_jiyooh_baoyuzhu_yimiao;//保育猪-5优堂--疫苗
		private String cost_comparison_jiyooh_baoyuzhu_baojian;//保育猪-5优堂--治疗保健
		
		private String cost_comparison_original_yufei_siliao;//育肥猪--原来成本--饲料
		private String cost_comparison_original_yufei_yimiao;//育肥猪--原来成本--疫苗
		private String cost_comparison_original_yufei_baojian;//育肥猪--原来成本--治疗保健
		private String cost_comparison_jiyooh_yufei_siliao;//育肥猪-5优堂--饲料
		private String cost_comparison_jiyooh_yufei_yimiao;//育肥猪-5优堂--疫苗
		private String cost_comparison_jiyooh_yufei_baojian;//育肥猪-5优堂--治疗保健
		
		private String cost_comparison_original_huaiyunmuzhu_siliao;//怀孕母猪--原来成本--饲料
		private String cost_comparison_original_huaiyunmuzhu_yimiao;//怀孕母猪--原来成本--疫苗
		private String cost_comparison_original_huaiyunmuzhu_baojian;//怀孕母猪--原来成本--保健
		private String cost_comparison_jiyooh_huaiyunmuzhu_siliao;//怀孕母猪--5优堂--饲料
		private String cost_comparison_jiyooh_huaiyunmuzhu_yimiao;//怀孕母猪--5优堂--疫苗
		private String cost_comparison_jiyooh_huaiyunmuzhu_baojian;//怀孕母猪--5优堂--保健 
		
		private String cost_comparison_original_burumuzhu_siliao;//哺乳母猪--原来成本--饲料
		private String cost_comparison_original_burumuzhu_yimiao;//哺乳母猪--原来成本--疫苗
		private String cost_comparison_original_burumuzhu_baojian;//哺乳母猪--原来成本--保健
		private String cost_comparison_jiyooh_burumuzhu_siliao;//哺乳母猪--5优堂--饲料
		private String cost_comparison_jiyooh_burumuzhu_yimiao;//哺乳母猪--5优堂--疫苗
		private String cost_comparison_jiyooh_burumuzhu_baojian;//哺乳母猪--5优堂--保健 
//6.3  综合效益评估报告 Comprehensive_benefits
		private String comprehensive_benefits;//综合效益评估报告-->多行文本域的
//7  5优堂猪场综合管理建议
		private String management_advice;
//8.0客户回访追踪报告 
		private String return_visit_times;//拜访时间
		private String return_visit_purpose;//目的
		private String return_visit_usage;//方案使用情况
		private String return_visit_Feedintake;//采食状况
		private String return_visit_feces;//粪便状况
		private String return_visit_appearance;//外观状况
		private String return_visit_end;//死亡解剖状况
		private String return_visit_antibody;//抗体检测报告
		private String return_visit_other;//其他
		private String return_visit_conclusion;//结论
		
		
		
		
		public String getMdaqu() {
			return mdaqu;
		}
		public void setMdaqu(String mdaqu) {
			this.mdaqu = mdaqu;
		}
		public String getDaquusername() {
			return daquusername;
		}
		public void setDaquusername(String daquusername) {
			this.daquusername = daquusername;
		}
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
		public String getBianhao() {
			return bianhao;
		}
		public void setBianhao(String bianhao) {
			this.bianhao = bianhao;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getWeixin() {
			return weixin;
		}
		public void setWeixin(String weixin) {
			this.weixin = weixin;
		}
		public String getGuimo() {
			return guimo;
		}
		public void setGuimo(String guimo) {
			this.guimo = guimo;
		}
		public String getPigfactoryname() {
			return pigfactoryname;
		}
		public void setPigfactoryname(String pigfactoryname) {
			this.pigfactoryname = pigfactoryname;
		}
		public String getPigbuildtime() {
			return pigbuildtime;
		}
		public void setPigbuildtime(String pigbuildtime) {
			this.pigbuildtime = pigbuildtime;
		}
		public String getYufeiarea() {
			return yufeiarea;
		}
		public void setYufeiarea(String yufeiarea) {
			this.yufeiarea = yufeiarea;
		}
		public String getJustnumber() {
			return justnumber;
		}
		public void setJustnumber(String justnumber) {
			this.justnumber = justnumber;
		}
		public String getJustarea() {
			return justarea;
		}
		public void setJustarea(String justarea) {
			this.justarea = justarea;
		}
		public String getJustsownumber() {
			return justsownumber;
		}
		public void setJustsownumber(String justsownumber) {
			this.justsownumber = justsownumber;
		}
		public String getSowtablenumber() {
			return sowtablenumber;
		}
		public void setSowtablenumber(String sowtablenumber) {
			this.sowtablenumber = sowtablenumber;
		}
		public String getBaoyubednumber() {
			return baoyubednumber;
		}
		public void setBaoyubednumber(String baoyubednumber) {
			this.baoyubednumber = baoyubednumber;
		}
		public String getWinterheating() {
			return winterheating;
		}
		public void setWinterheating(String winterheating) {
			this.winterheating = winterheating;
		}
		public String getBaoyuarea() {
			return baoyuarea;
		}
		public void setBaoyuarea(String baoyuarea) {
			this.baoyuarea = baoyuarea;
		}
		public String getBaoyuhighbed() {
			return baoyuhighbed;
		}
		public void setBaoyuhighbed(String baoyuhighbed) {
			this.baoyuhighbed = baoyuhighbed;
		}
		public String getBoilerscale() {
			return boilerscale;
		}
		public void setBoilerscale(String boilerscale) {
			this.boilerscale = boilerscale;
		}
		public String getRoomheatingmethod() {
			return roomheatingmethod;
		}
		public void setRoomheatingmethod(String roomheatingmethod) {
			this.roomheatingmethod = roomheatingmethod;
		}
		public String getBaoyuheatingmethod() {
			return baoyuheatingmethod;
		}
		public void setBaoyuheatingmethod(String baoyuheatingmethod) {
			this.baoyuheatingmethod = baoyuheatingmethod;
		}
		public String getYufeiheatingmethod() {
			return yufeiheatingmethod;
		}
		public void setYufeiheatingmethod(String yufeiheatingmethod) {
			this.yufeiheatingmethod = yufeiheatingmethod;
		}
		public String getPigfarmsorbig() {
			return pigfarmsorbig;
		}
		public void setPigfarmsorbig(String pigfarmsorbig) {
			this.pigfarmsorbig = pigfarmsorbig;
		}
		public String getOrplans() {
			return orplans;
		}
		public void setOrplans(String orplans) {
			this.orplans = orplans;
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
		public String getH_y_name_4() {
			return h_y_name_4;
		}
		public void setH_y_name_4(String h_y_name_4) {
			this.h_y_name_4 = h_y_name_4;
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
		public String getH_factory_4() {
			return h_factory_4;
		}
		public void setH_factory_4(String h_factory_4) {
			this.h_factory_4 = h_factory_4;
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
		public String getH_b_drug_4() {
			return h_b_drug_4;
		}
		public void setH_b_drug_4(String h_b_drug_4) {
			this.h_b_drug_4 = h_b_drug_4;
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
		public String getB_y_name_4() {
			return b_y_name_4;
		}
		public void setB_y_name_4(String b_y_name_4) {
			this.b_y_name_4 = b_y_name_4;
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
		public String getB_factory_4() {
			return b_factory_4;
		}
		public void setB_factory_4(String b_factory_4) {
			this.b_factory_4 = b_factory_4;
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
		public String getB_b_drug_4() {
			return b_b_drug_4;
		}
		public void setB_b_drug_4(String b_b_drug_4) {
			this.b_b_drug_4 = b_b_drug_4;
		}
		public String getSy_date() {
			return sy_date;
		}
		public void setSy_date(String sy_date) {
			this.sy_date = sy_date;
		}
		public String getSy_fenmian() {
			return sy_fenmian;
		}
		public void setSy_fenmian(String sy_fenmian) {
			this.sy_fenmian = sy_fenmian;
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
		public String getDescribes() {
			return describes;
		}
		public void setDescribes(String describes) {
			this.describes = describes;
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
		public String getReport_analysis() {
			return report_analysis;
		}
		public void setReport_analysis(String report_analysis) {
			this.report_analysis = report_analysis;
		}
		public String getReport_conclusion() {
			return report_conclusion;
		}
		public void setReport_conclusion(String report_conclusion) {
			this.report_conclusion = report_conclusion;
		}
		public String getAnatomy_analysis() {
			return anatomy_analysis;
		}
		public void setAnatomy_analysis(String anatomy_analysis) {
			this.anatomy_analysis = anatomy_analysis;
		}
		public String getAnatomy_conclusion() {
			return anatomy_conclusion;
		}
		public void setAnatomy_conclusion(String anatomy_conclusion) {
			this.anatomy_conclusion = anatomy_conclusion;
		}
		public String getSymptoms_performance() {
			return symptoms_performance;
		}
		public void setSymptoms_performance(String symptoms_performance) {
			this.symptoms_performance = symptoms_performance;
		}
		public String getSymptoms_conclusion() {
			return symptoms_conclusion;
		}
		public void setSymptoms_conclusion(String symptoms_conclusion) {
			this.symptoms_conclusion = symptoms_conclusion;
		}
		public String getComprehensive_report() {
			return comprehensive_report;
		}
		public void setComprehensive_report(String comprehensive_report) {
			this.comprehensive_report = comprehensive_report;
		}
		public String getOverall_solution_renshen_plan() {
			return overall_solution_renshen_plan;
		}
		public void setOverall_solution_renshen_plan(
				String overall_solution_renshen_plan) {
			this.overall_solution_renshen_plan = overall_solution_renshen_plan;
		}
		public String getOverall_solution_renshen_cycle() {
			return overall_solution_renshen_cycle;
		}
		public void setOverall_solution_renshen_cycle(
				String overall_solution_renshen_cycle) {
			this.overall_solution_renshen_cycle = overall_solution_renshen_cycle;
		}
		public String getOverall_solution_renshen_effect() {
			return overall_solution_renshen_effect;
		}
		public void setOverall_solution_renshen_effect(
				String overall_solution_renshen_effect) {
			this.overall_solution_renshen_effect = overall_solution_renshen_effect;
		}
		public String getOverall_solution_buru_plan() {
			return overall_solution_buru_plan;
		}
		public void setOverall_solution_buru_plan(String overall_solution_buru_plan) {
			this.overall_solution_buru_plan = overall_solution_buru_plan;
		}
		public String getOverall_solution_buru_cycle() {
			return overall_solution_buru_cycle;
		}
		public void setOverall_solution_buru_cycle(String overall_solution_buru_cycle) {
			this.overall_solution_buru_cycle = overall_solution_buru_cycle;
		}
		public String getOverall_solution_buru_effect() {
			return overall_solution_buru_effect;
		}
		public void setOverall_solution_buru_effect(String overall_solution_buru_effect) {
			this.overall_solution_buru_effect = overall_solution_buru_effect;
		}
		public String getOverall_solution_baoyu_plan() {
			return overall_solution_baoyu_plan;
		}
		public void setOverall_solution_baoyu_plan(String overall_solution_baoyu_plan) {
			this.overall_solution_baoyu_plan = overall_solution_baoyu_plan;
		}
		public String getOverall_solution_baoyu_cycle() {
			return overall_solution_baoyu_cycle;
		}
		public void setOverall_solution_baoyu_cycle(String overall_solution_baoyu_cycle) {
			this.overall_solution_baoyu_cycle = overall_solution_baoyu_cycle;
		}
		public String getOverall_solution_baoyu_effect() {
			return overall_solution_baoyu_effect;
		}
		public void setOverall_solution_baoyu_effect(
				String overall_solution_baoyu_effect) {
			this.overall_solution_baoyu_effect = overall_solution_baoyu_effect;
		}
		public String getMuzhupeizhongfeimianlv_yuanlaizhibiao() {
			return muzhupeizhongfeimianlv_yuanlaizhibiao;
		}
		public void setMuzhupeizhongfeimianlv_yuanlaizhibiao(
				String muzhupeizhongfeimianlv_yuanlaizhibiao) {
			this.muzhupeizhongfeimianlv_yuanlaizhibiao = muzhupeizhongfeimianlv_yuanlaizhibiao;
		}
		public String getMuzhupeizhongfeimianlv_mubiaozhibiao() {
			return muzhupeizhongfeimianlv_mubiaozhibiao;
		}
		public void setMuzhupeizhongfeimianlv_mubiaozhibiao(
				String muzhupeizhongfeimianlv_mubiaozhibiao) {
			this.muzhupeizhongfeimianlv_mubiaozhibiao = muzhupeizhongfeimianlv_mubiaozhibiao;
		}
		public String getMuzhupeizhongfeimianlv_gaishanbili() {
			return muzhupeizhongfeimianlv_gaishanbili;
		}
		public void setMuzhupeizhongfeimianlv_gaishanbili(
				String muzhupeizhongfeimianlv_gaishanbili) {
			this.muzhupeizhongfeimianlv_gaishanbili = muzhupeizhongfeimianlv_gaishanbili;
		}
		public String getNianjunchanzai_yuanlaizhibiao() {
			return nianjunchanzai_yuanlaizhibiao;
		}
		public void setNianjunchanzai_yuanlaizhibiao(
				String nianjunchanzai_yuanlaizhibiao) {
			this.nianjunchanzai_yuanlaizhibiao = nianjunchanzai_yuanlaizhibiao;
		}
		public String getNianjunchanzai_mubiaozhibiao() {
			return nianjunchanzai_mubiaozhibiao;
		}
		public void setNianjunchanzai_mubiaozhibiao(String nianjunchanzai_mubiaozhibiao) {
			this.nianjunchanzai_mubiaozhibiao = nianjunchanzai_mubiaozhibiao;
		}
		public String getNianjunchanzai_gaishanbili() {
			return nianjunchanzai_gaishanbili;
		}
		public void setNianjunchanzai_gaishanbili(String nianjunchanzai_gaishanbili) {
			this.nianjunchanzai_gaishanbili = nianjunchanzai_gaishanbili;
		}
		public String getJunchanhuozishu_yuanlaizhibiao() {
			return junchanhuozishu_yuanlaizhibiao;
		}
		public void setJunchanhuozishu_yuanlaizhibiao(
				String junchanhuozishu_yuanlaizhibiao) {
			this.junchanhuozishu_yuanlaizhibiao = junchanhuozishu_yuanlaizhibiao;
		}
		public String getJunchanhuozishu_mubiaozhibiao() {
			return junchanhuozishu_mubiaozhibiao;
		}
		public void setJunchanhuozishu_mubiaozhibiao(
				String junchanhuozishu_mubiaozhibiao) {
			this.junchanhuozishu_mubiaozhibiao = junchanhuozishu_mubiaozhibiao;
		}
		public String getJunchanhuozishu_gaishanbili() {
			return junchanhuozishu_gaishanbili;
		}
		public void setJunchanhuozishu_gaishanbili(String junchanhuozishu_gaishanbili) {
			this.junchanhuozishu_gaishanbili = junchanhuozishu_gaishanbili;
		}
		public String getBuruzizhuchenghuolv_yuanlaizhibiao() {
			return buruzizhuchenghuolv_yuanlaizhibiao;
		}
		public void setBuruzizhuchenghuolv_yuanlaizhibiao(
				String buruzizhuchenghuolv_yuanlaizhibiao) {
			this.buruzizhuchenghuolv_yuanlaizhibiao = buruzizhuchenghuolv_yuanlaizhibiao;
		}
		public String getBuruzizhuchenghuolv_mubiaozhibiao() {
			return buruzizhuchenghuolv_mubiaozhibiao;
		}
		public void setBuruzizhuchenghuolv_mubiaozhibiao(
				String buruzizhuchenghuolv_mubiaozhibiao) {
			this.buruzizhuchenghuolv_mubiaozhibiao = buruzizhuchenghuolv_mubiaozhibiao;
		}
		public String getBuruzizhuchenghuolv_gaishanbili() {
			return buruzizhuchenghuolv_gaishanbili;
		}
		public void setBuruzizhuchenghuolv_gaishanbili(
				String buruzizhuchenghuolv_gaishanbili) {
			this.buruzizhuchenghuolv_gaishanbili = buruzizhuchenghuolv_gaishanbili;
		}
		public String getChushengzhong_yuanlaizhibiao() {
			return chushengzhong_yuanlaizhibiao;
		}
		public void setChushengzhong_yuanlaizhibiao(String chushengzhong_yuanlaizhibiao) {
			this.chushengzhong_yuanlaizhibiao = chushengzhong_yuanlaizhibiao;
		}
		public String getChushengzhong_mubiaozhibiao() {
			return chushengzhong_mubiaozhibiao;
		}
		public void setChushengzhong_mubiaozhibiao(String chushengzhong_mubiaozhibiao) {
			this.chushengzhong_mubiaozhibiao = chushengzhong_mubiaozhibiao;
		}
		public String getChushengzhong_gaishanbili() {
			return chushengzhong_gaishanbili;
		}
		public void setChushengzhong_gaishanbili(String chushengzhong_gaishanbili) {
			this.chushengzhong_gaishanbili = chushengzhong_gaishanbili;
		}
		public String getDuannaizhong_yuanlaizhibiao() {
			return duannaizhong_yuanlaizhibiao;
		}
		public void setDuannaizhong_yuanlaizhibiao(String duannaizhong_yuanlaizhibiao) {
			this.duannaizhong_yuanlaizhibiao = duannaizhong_yuanlaizhibiao;
		}
		public String getDuannaizhong_mubiaozhibiao() {
			return duannaizhong_mubiaozhibiao;
		}
		public void setDuannaizhong_mubiaozhibiao(String duannaizhong_mubiaozhibiao) {
			this.duannaizhong_mubiaozhibiao = duannaizhong_mubiaozhibiao;
		}
		public String getDuannaizhong_gaishanbili() {
			return duannaizhong_gaishanbili;
		}
		public void setDuannaizhong_gaishanbili(String duannaizhong_gaishanbili) {
			this.duannaizhong_gaishanbili = duannaizhong_gaishanbili;
		}
		public String getBaoyuchenghuolv_yuanlaizhibiao() {
			return baoyuchenghuolv_yuanlaizhibiao;
		}
		public void setBaoyuchenghuolv_yuanlaizhibiao(
				String baoyuchenghuolv_yuanlaizhibiao) {
			this.baoyuchenghuolv_yuanlaizhibiao = baoyuchenghuolv_yuanlaizhibiao;
		}
		public String getBaoyuchenghuolv_mubiaozhibiao() {
			return baoyuchenghuolv_mubiaozhibiao;
		}
		public void setBaoyuchenghuolv_mubiaozhibiao(
				String baoyuchenghuolv_mubiaozhibiao) {
			this.baoyuchenghuolv_mubiaozhibiao = baoyuchenghuolv_mubiaozhibiao;
		}
		public String getBaoyuchenghuolv_gaishanbili() {
			return baoyuchenghuolv_gaishanbili;
		}
		public void setBaoyuchenghuolv_gaishanbili(String baoyuchenghuolv_gaishanbili) {
			this.baoyuchenghuolv_gaishanbili = baoyuchenghuolv_gaishanbili;
		}
		public String getLingzhong_yuanlaizhibiao() {
			return lingzhong_yuanlaizhibiao;
		}
		public void setLingzhong_yuanlaizhibiao(String lingzhong_yuanlaizhibiao) {
			this.lingzhong_yuanlaizhibiao = lingzhong_yuanlaizhibiao;
		}
		public String getLingzhong_mubiaozhibiao() {
			return lingzhong_mubiaozhibiao;
		}
		public void setLingzhong_mubiaozhibiao(String lingzhong_mubiaozhibiao) {
			this.lingzhong_mubiaozhibiao = lingzhong_mubiaozhibiao;
		}
		public String getLingzhong_gaishanbili() {
			return lingzhong_gaishanbili;
		}
		public void setLingzhong_gaishanbili(String lingzhong_gaishanbili) {
			this.lingzhong_gaishanbili = lingzhong_gaishanbili;
		}
		public String getYufeichenghuolv_yuanlaizhibiao() {
			return yufeichenghuolv_yuanlaizhibiao;
		}
		public void setYufeichenghuolv_yuanlaizhibiao(
				String yufeichenghuolv_yuanlaizhibiao) {
			this.yufeichenghuolv_yuanlaizhibiao = yufeichenghuolv_yuanlaizhibiao;
		}
		public String getYufeichenghuolv_mubiaozhibiao() {
			return yufeichenghuolv_mubiaozhibiao;
		}
		public void setYufeichenghuolv_mubiaozhibiao(
				String yufeichenghuolv_mubiaozhibiao) {
			this.yufeichenghuolv_mubiaozhibiao = yufeichenghuolv_mubiaozhibiao;
		}
		public String getYufeichenghuolv_gaishanbili() {
			return yufeichenghuolv_gaishanbili;
		}
		public void setYufeichenghuolv_gaishanbili(String yufeichenghuolv_gaishanbili) {
			this.yufeichenghuolv_gaishanbili = yufeichenghuolv_gaishanbili;
		}
		public String getShangshiling_yuanlaizhibiao() {
			return shangshiling_yuanlaizhibiao;
		}
		public void setShangshiling_yuanlaizhibiao(String shangshiling_yuanlaizhibiao) {
			this.shangshiling_yuanlaizhibiao = shangshiling_yuanlaizhibiao;
		}
		public String getShangshiling_mubiaozhibiao() {
			return shangshiling_mubiaozhibiao;
		}
		public void setShangshiling_mubiaozhibiao(String shangshiling_mubiaozhibiao) {
			this.shangshiling_mubiaozhibiao = shangshiling_mubiaozhibiao;
		}
		public String getShangshiling_gaishanbili() {
			return shangshiling_gaishanbili;
		}
		public void setShangshiling_gaishanbili(String shangshiling_gaishanbili) {
			this.shangshiling_gaishanbili = shangshiling_gaishanbili;
		}
		public String getPSY_yuanlaizhibiao() {
			return PSY_yuanlaizhibiao;
		}
		public void setPSY_yuanlaizhibiao(String pSY_yuanlaizhibiao) {
			PSY_yuanlaizhibiao = pSY_yuanlaizhibiao;
		}
		public String getPSY_mubiaozhibiao() {
			return PSY_mubiaozhibiao;
		}
		public void setPSY_mubiaozhibiao(String pSY_mubiaozhibiao) {
			PSY_mubiaozhibiao = pSY_mubiaozhibiao;
		}
		public String getPSY_gaishanbili() {
			return PSY_gaishanbili;
		}
		public void setPSY_gaishanbili(String pSY_gaishanbili) {
			PSY_gaishanbili = pSY_gaishanbili;
		}
		public String getMSY_yuanlaizhibiao() {
			return MSY_yuanlaizhibiao;
		}
		public void setMSY_yuanlaizhibiao(String mSY_yuanlaizhibiao) {
			MSY_yuanlaizhibiao = mSY_yuanlaizhibiao;
		}
		public String getMSY_mubiaozhibiao() {
			return MSY_mubiaozhibiao;
		}
		public void setMSY_mubiaozhibiao(String mSY_mubiaozhibiao) {
			MSY_mubiaozhibiao = mSY_mubiaozhibiao;
		}
		public String getMSY_gaishanbili() {
			return MSY_gaishanbili;
		}
		public void setMSY_gaishanbili(String mSY_gaishanbili) {
			MSY_gaishanbili = mSY_gaishanbili;
		}
		public String getLiaoroubi_yuanlaizhibiao() {
			return liaoroubi_yuanlaizhibiao;
		}
		public void setLiaoroubi_yuanlaizhibiao(String liaoroubi_yuanlaizhibiao) {
			this.liaoroubi_yuanlaizhibiao = liaoroubi_yuanlaizhibiao;
		}
		public String getLiaoroubi_mubiaozhibiao() {
			return liaoroubi_mubiaozhibiao;
		}
		public void setLiaoroubi_mubiaozhibiao(String liaoroubi_mubiaozhibiao) {
			this.liaoroubi_mubiaozhibiao = liaoroubi_mubiaozhibiao;
		}
		public String getLiaoroubi_gaishanbili() {
			return liaoroubi_gaishanbili;
		}
		public void setLiaoroubi_gaishanbili(String liaoroubi_gaishanbili) {
			this.liaoroubi_gaishanbili = liaoroubi_gaishanbili;
		}
		public String getFangyifei_yuanlaizhibiao() {
			return fangyifei_yuanlaizhibiao;
		}
		public void setFangyifei_yuanlaizhibiao(String fangyifei_yuanlaizhibiao) {
			this.fangyifei_yuanlaizhibiao = fangyifei_yuanlaizhibiao;
		}
		public String getFangyifei_mubiaozhibiao() {
			return fangyifei_mubiaozhibiao;
		}
		public void setFangyifei_mubiaozhibiao(String fangyifei_mubiaozhibiao) {
			this.fangyifei_mubiaozhibiao = fangyifei_mubiaozhibiao;
		}
		public String getFangyifei_gaishanbili() {
			return fangyifei_gaishanbili;
		}
		public void setFangyifei_gaishanbili(String fangyifei_gaishanbili) {
			this.fangyifei_gaishanbili = fangyifei_gaishanbili;
		}
		public String getYf_fangyifei_yuanlaizhibiao() {
			return yf_fangyifei_yuanlaizhibiao;
		}
		public void setYf_fangyifei_yuanlaizhibiao(String yf_fangyifei_yuanlaizhibiao) {
			this.yf_fangyifei_yuanlaizhibiao = yf_fangyifei_yuanlaizhibiao;
		}
		public String getYf_fangyifei_mubiaozhibiao() {
			return yf_fangyifei_mubiaozhibiao;
		}
		public void setYf_fangyifei_mubiaozhibiao(String yf_fangyifei_mubiaozhibiao) {
			this.yf_fangyifei_mubiaozhibiao = yf_fangyifei_mubiaozhibiao;
		}
		public String getYf_fangyifei_gaishanbili() {
			return yf_fangyifei_gaishanbili;
		}
		public void setYf_fangyifei_gaishanbili(String yf_fangyifei_gaishanbili) {
			this.yf_fangyifei_gaishanbili = yf_fangyifei_gaishanbili;
		}
		public String getZaorouchengben_yuanlaizhibiao() {
			return zaorouchengben_yuanlaizhibiao;
		}
		public void setZaorouchengben_yuanlaizhibiao(
				String zaorouchengben_yuanlaizhibiao) {
			this.zaorouchengben_yuanlaizhibiao = zaorouchengben_yuanlaizhibiao;
		}
		public String getZaorouchengben_mubiaozhibiao() {
			return zaorouchengben_mubiaozhibiao;
		}
		public void setZaorouchengben_mubiaozhibiao(String zaorouchengben_mubiaozhibiao) {
			this.zaorouchengben_mubiaozhibiao = zaorouchengben_mubiaozhibiao;
		}
		public String getZaorouchengben_gaishanbili() {
			return zaorouchengben_gaishanbili;
		}
		public void setZaorouchengben_gaishanbili(String zaorouchengben_gaishanbili) {
			this.zaorouchengben_gaishanbili = zaorouchengben_gaishanbili;
		}
		public String getYingkuidian_yuanlaizhibiao() {
			return yingkuidian_yuanlaizhibiao;
		}
		public void setYingkuidian_yuanlaizhibiao(String yingkuidian_yuanlaizhibiao) {
			this.yingkuidian_yuanlaizhibiao = yingkuidian_yuanlaizhibiao;
		}
		public String getYingkuidian_mubiaozhibiao() {
			return yingkuidian_mubiaozhibiao;
		}
		public void setYingkuidian_mubiaozhibiao(String yingkuidian_mubiaozhibiao) {
			this.yingkuidian_mubiaozhibiao = yingkuidian_mubiaozhibiao;
		}
		public String getYingkuidian_gaishanbili() {
			return yingkuidian_gaishanbili;
		}
		public void setYingkuidian_gaishanbili(String yingkuidian_gaishanbili) {
			this.yingkuidian_gaishanbili = yingkuidian_gaishanbili;
		}
		public String getCost_comparison_original_buruzizhu_siliao() {
			return cost_comparison_original_buruzizhu_siliao;
		}
		public void setCost_comparison_original_buruzizhu_siliao(
				String cost_comparison_original_buruzizhu_siliao) {
			this.cost_comparison_original_buruzizhu_siliao = cost_comparison_original_buruzizhu_siliao;
		}
		public String getCost_comparison_original_buruzizhu_yimiao() {
			return cost_comparison_original_buruzizhu_yimiao;
		}
		public void setCost_comparison_original_buruzizhu_yimiao(
				String cost_comparison_original_buruzizhu_yimiao) {
			this.cost_comparison_original_buruzizhu_yimiao = cost_comparison_original_buruzizhu_yimiao;
		}
		public String getCost_comparison_original_buruzizhu_baojian() {
			return cost_comparison_original_buruzizhu_baojian;
		}
		public void setCost_comparison_original_buruzizhu_baojian(
				String cost_comparison_original_buruzizhu_baojian) {
			this.cost_comparison_original_buruzizhu_baojian = cost_comparison_original_buruzizhu_baojian;
		}
		public String getCost_comparison_jiyooh_buruzizhu_siliao() {
			return cost_comparison_jiyooh_buruzizhu_siliao;
		}
		public void setCost_comparison_jiyooh_buruzizhu_siliao(
				String cost_comparison_jiyooh_buruzizhu_siliao) {
			this.cost_comparison_jiyooh_buruzizhu_siliao = cost_comparison_jiyooh_buruzizhu_siliao;
		}
		public String getCost_comparison_jiyooh_buruzizhu_yimiao() {
			return cost_comparison_jiyooh_buruzizhu_yimiao;
		}
		public void setCost_comparison_jiyooh_buruzizhu_yimiao(
				String cost_comparison_jiyooh_buruzizhu_yimiao) {
			this.cost_comparison_jiyooh_buruzizhu_yimiao = cost_comparison_jiyooh_buruzizhu_yimiao;
		}
		public String getCost_comparison_jiyooh_buruzizhu_baojian() {
			return cost_comparison_jiyooh_buruzizhu_baojian;
		}
		public void setCost_comparison_jiyooh_buruzizhu_baojian(
				String cost_comparison_jiyooh_buruzizhu_baojian) {
			this.cost_comparison_jiyooh_buruzizhu_baojian = cost_comparison_jiyooh_buruzizhu_baojian;
		}
		public String getCost_comparison_original_baoyuzhu_siliao() {
			return cost_comparison_original_baoyuzhu_siliao;
		}
		public void setCost_comparison_original_baoyuzhu_siliao(
				String cost_comparison_original_baoyuzhu_siliao) {
			this.cost_comparison_original_baoyuzhu_siliao = cost_comparison_original_baoyuzhu_siliao;
		}
		public String getCost_comparison_original_baoyuzhu_yimiao() {
			return cost_comparison_original_baoyuzhu_yimiao;
		}
		public void setCost_comparison_original_baoyuzhu_yimiao(
				String cost_comparison_original_baoyuzhu_yimiao) {
			this.cost_comparison_original_baoyuzhu_yimiao = cost_comparison_original_baoyuzhu_yimiao;
		}
		public String getCost_comparison_original_baoyuzhu_baojian() {
			return cost_comparison_original_baoyuzhu_baojian;
		}
		public void setCost_comparison_original_baoyuzhu_baojian(
				String cost_comparison_original_baoyuzhu_baojian) {
			this.cost_comparison_original_baoyuzhu_baojian = cost_comparison_original_baoyuzhu_baojian;
		}
		public String getCost_comparison_jiyooh_baoyuzhu_siliao() {
			return cost_comparison_jiyooh_baoyuzhu_siliao;
		}
		public void setCost_comparison_jiyooh_baoyuzhu_siliao(
				String cost_comparison_jiyooh_baoyuzhu_siliao) {
			this.cost_comparison_jiyooh_baoyuzhu_siliao = cost_comparison_jiyooh_baoyuzhu_siliao;
		}
		public String getCost_comparison_jiyooh_baoyuzhu_yimiao() {
			return cost_comparison_jiyooh_baoyuzhu_yimiao;
		}
		public void setCost_comparison_jiyooh_baoyuzhu_yimiao(
				String cost_comparison_jiyooh_baoyuzhu_yimiao) {
			this.cost_comparison_jiyooh_baoyuzhu_yimiao = cost_comparison_jiyooh_baoyuzhu_yimiao;
		}
		public String getCost_comparison_jiyooh_baoyuzhu_baojian() {
			return cost_comparison_jiyooh_baoyuzhu_baojian;
		}
		public void setCost_comparison_jiyooh_baoyuzhu_baojian(
				String cost_comparison_jiyooh_baoyuzhu_baojian) {
			this.cost_comparison_jiyooh_baoyuzhu_baojian = cost_comparison_jiyooh_baoyuzhu_baojian;
		}
		public String getCost_comparison_original_yufei_siliao() {
			return cost_comparison_original_yufei_siliao;
		}
		public void setCost_comparison_original_yufei_siliao(
				String cost_comparison_original_yufei_siliao) {
			this.cost_comparison_original_yufei_siliao = cost_comparison_original_yufei_siliao;
		}
		public String getCost_comparison_original_yufei_yimiao() {
			return cost_comparison_original_yufei_yimiao;
		}
		public void setCost_comparison_original_yufei_yimiao(
				String cost_comparison_original_yufei_yimiao) {
			this.cost_comparison_original_yufei_yimiao = cost_comparison_original_yufei_yimiao;
		}
		public String getCost_comparison_original_yufei_baojian() {
			return cost_comparison_original_yufei_baojian;
		}
		public void setCost_comparison_original_yufei_baojian(
				String cost_comparison_original_yufei_baojian) {
			this.cost_comparison_original_yufei_baojian = cost_comparison_original_yufei_baojian;
		}
		public String getCost_comparison_jiyooh_yufei_siliao() {
			return cost_comparison_jiyooh_yufei_siliao;
		}
		public void setCost_comparison_jiyooh_yufei_siliao(
				String cost_comparison_jiyooh_yufei_siliao) {
			this.cost_comparison_jiyooh_yufei_siliao = cost_comparison_jiyooh_yufei_siliao;
		}
		public String getCost_comparison_jiyooh_yufei_yimiao() {
			return cost_comparison_jiyooh_yufei_yimiao;
		}
		public void setCost_comparison_jiyooh_yufei_yimiao(
				String cost_comparison_jiyooh_yufei_yimiao) {
			this.cost_comparison_jiyooh_yufei_yimiao = cost_comparison_jiyooh_yufei_yimiao;
		}
		public String getCost_comparison_jiyooh_yufei_baojian() {
			return cost_comparison_jiyooh_yufei_baojian;
		}
		public void setCost_comparison_jiyooh_yufei_baojian(
				String cost_comparison_jiyooh_yufei_baojian) {
			this.cost_comparison_jiyooh_yufei_baojian = cost_comparison_jiyooh_yufei_baojian;
		}
		public String getCost_comparison_original_huaiyunmuzhu_siliao() {
			return cost_comparison_original_huaiyunmuzhu_siliao;
		}
		public void setCost_comparison_original_huaiyunmuzhu_siliao(
				String cost_comparison_original_huaiyunmuzhu_siliao) {
			this.cost_comparison_original_huaiyunmuzhu_siliao = cost_comparison_original_huaiyunmuzhu_siliao;
		}
		public String getCost_comparison_original_huaiyunmuzhu_yimiao() {
			return cost_comparison_original_huaiyunmuzhu_yimiao;
		}
		public void setCost_comparison_original_huaiyunmuzhu_yimiao(
				String cost_comparison_original_huaiyunmuzhu_yimiao) {
			this.cost_comparison_original_huaiyunmuzhu_yimiao = cost_comparison_original_huaiyunmuzhu_yimiao;
		}
		public String getCost_comparison_original_huaiyunmuzhu_baojian() {
			return cost_comparison_original_huaiyunmuzhu_baojian;
		}
		public void setCost_comparison_original_huaiyunmuzhu_baojian(
				String cost_comparison_original_huaiyunmuzhu_baojian) {
			this.cost_comparison_original_huaiyunmuzhu_baojian = cost_comparison_original_huaiyunmuzhu_baojian;
		}
		public String getCost_comparison_jiyooh_huaiyunmuzhu_siliao() {
			return cost_comparison_jiyooh_huaiyunmuzhu_siliao;
		}
		public void setCost_comparison_jiyooh_huaiyunmuzhu_siliao(
				String cost_comparison_jiyooh_huaiyunmuzhu_siliao) {
			this.cost_comparison_jiyooh_huaiyunmuzhu_siliao = cost_comparison_jiyooh_huaiyunmuzhu_siliao;
		}
		public String getCost_comparison_jiyooh_huaiyunmuzhu_yimiao() {
			return cost_comparison_jiyooh_huaiyunmuzhu_yimiao;
		}
		public void setCost_comparison_jiyooh_huaiyunmuzhu_yimiao(
				String cost_comparison_jiyooh_huaiyunmuzhu_yimiao) {
			this.cost_comparison_jiyooh_huaiyunmuzhu_yimiao = cost_comparison_jiyooh_huaiyunmuzhu_yimiao;
		}
		public String getCost_comparison_jiyooh_huaiyunmuzhu_baojian() {
			return cost_comparison_jiyooh_huaiyunmuzhu_baojian;
		}
		public void setCost_comparison_jiyooh_huaiyunmuzhu_baojian(
				String cost_comparison_jiyooh_huaiyunmuzhu_baojian) {
			this.cost_comparison_jiyooh_huaiyunmuzhu_baojian = cost_comparison_jiyooh_huaiyunmuzhu_baojian;
		}
		public String getCost_comparison_original_burumuzhu_siliao() {
			return cost_comparison_original_burumuzhu_siliao;
		}
		public void setCost_comparison_original_burumuzhu_siliao(
				String cost_comparison_original_burumuzhu_siliao) {
			this.cost_comparison_original_burumuzhu_siliao = cost_comparison_original_burumuzhu_siliao;
		}
		public String getCost_comparison_original_burumuzhu_yimiao() {
			return cost_comparison_original_burumuzhu_yimiao;
		}
		public void setCost_comparison_original_burumuzhu_yimiao(
				String cost_comparison_original_burumuzhu_yimiao) {
			this.cost_comparison_original_burumuzhu_yimiao = cost_comparison_original_burumuzhu_yimiao;
		}
		public String getCost_comparison_original_burumuzhu_baojian() {
			return cost_comparison_original_burumuzhu_baojian;
		}
		public void setCost_comparison_original_burumuzhu_baojian(
				String cost_comparison_original_burumuzhu_baojian) {
			this.cost_comparison_original_burumuzhu_baojian = cost_comparison_original_burumuzhu_baojian;
		}
		public String getCost_comparison_jiyooh_burumuzhu_siliao() {
			return cost_comparison_jiyooh_burumuzhu_siliao;
		}
		public void setCost_comparison_jiyooh_burumuzhu_siliao(
				String cost_comparison_jiyooh_burumuzhu_siliao) {
			this.cost_comparison_jiyooh_burumuzhu_siliao = cost_comparison_jiyooh_burumuzhu_siliao;
		}
		public String getCost_comparison_jiyooh_burumuzhu_yimiao() {
			return cost_comparison_jiyooh_burumuzhu_yimiao;
		}
		public void setCost_comparison_jiyooh_burumuzhu_yimiao(
				String cost_comparison_jiyooh_burumuzhu_yimiao) {
			this.cost_comparison_jiyooh_burumuzhu_yimiao = cost_comparison_jiyooh_burumuzhu_yimiao;
		}
		public String getCost_comparison_jiyooh_burumuzhu_baojian() {
			return cost_comparison_jiyooh_burumuzhu_baojian;
		}
		public void setCost_comparison_jiyooh_burumuzhu_baojian(
				String cost_comparison_jiyooh_burumuzhu_baojian) {
			this.cost_comparison_jiyooh_burumuzhu_baojian = cost_comparison_jiyooh_burumuzhu_baojian;
		}
		public String getComprehensive_benefits() {
			return comprehensive_benefits;
		}
		public void setComprehensive_benefits(String comprehensive_benefits) {
			this.comprehensive_benefits = comprehensive_benefits;
		}
		public String getManagement_advice() {
			return management_advice;
		}
		public void setManagement_advice(String management_advice) {
			this.management_advice = management_advice;
		}
		public String getReturn_visit_times() {
			return return_visit_times;
		}
		public void setReturn_visit_times(String return_visit_times) {
			this.return_visit_times = return_visit_times;
		}
		public String getReturn_visit_purpose() {
			return return_visit_purpose;
		}
		public void setReturn_visit_purpose(String return_visit_purpose) {
			this.return_visit_purpose = return_visit_purpose;
		}
		public String getReturn_visit_usage() {
			return return_visit_usage;
		}
		public void setReturn_visit_usage(String return_visit_usage) {
			this.return_visit_usage = return_visit_usage;
		}
		public String getReturn_visit_Feedintake() {
			return return_visit_Feedintake;
		}
		public void setReturn_visit_Feedintake(String return_visit_Feedintake) {
			this.return_visit_Feedintake = return_visit_Feedintake;
		}
		public String getReturn_visit_feces() {
			return return_visit_feces;
		}
		public void setReturn_visit_feces(String return_visit_feces) {
			this.return_visit_feces = return_visit_feces;
		}
		public String getReturn_visit_appearance() {
			return return_visit_appearance;
		}
		public void setReturn_visit_appearance(String return_visit_appearance) {
			this.return_visit_appearance = return_visit_appearance;
		}
		public String getReturn_visit_end() {
			return return_visit_end;
		}
		public void setReturn_visit_end(String return_visit_end) {
			this.return_visit_end = return_visit_end;
		}
		public String getReturn_visit_antibody() {
			return return_visit_antibody;
		}
		public void setReturn_visit_antibody(String return_visit_antibody) {
			this.return_visit_antibody = return_visit_antibody;
		}
		public String getReturn_visit_other() {
			return return_visit_other;
		}
		public void setReturn_visit_other(String return_visit_other) {
			this.return_visit_other = return_visit_other;
		}
		public String getReturn_visit_conclusion() {
			return return_visit_conclusion;
		}
		public void setReturn_visit_conclusion(String return_visit_conclusion) {
			this.return_visit_conclusion = return_visit_conclusion;
		}
	
}
