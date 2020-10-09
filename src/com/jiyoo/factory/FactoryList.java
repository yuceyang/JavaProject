package com.jiyoo.factory;
import com.jiyoo.dao.AgeListDao;
import com.jiyoo.dao.BaoJianDangAnDao;
import com.jiyoo.dao.BianhaoIfThereIsDao;
import com.jiyoo.dao.CustomerDetailsDao;
import com.jiyoo.dao.DaQuSelectDao;
import com.jiyoo.dao.DaQuUpDao;
import com.jiyoo.dao.DataDeleatAllDao;
import com.jiyoo.dao.FaceDao;
import com.jiyoo.dao.FaceDetailsDao;
import com.jiyoo.dao.FileTraversalDao;
import com.jiyoo.dao.FileUpLoadDao;
import com.jiyoo.dao.GuiMoListDao;
import com.jiyoo.dao.HuiFangDao;
import com.jiyoo.dao.HuiFangListDao;
import com.jiyoo.dao.LoginUserDao;
import com.jiyoo.dao.MenDianBianHaoDao;
import com.jiyoo.dao.SelectCountDao;
import com.jiyoo.dao.SelectHuiFangDao;
import com.jiyoo.dao.SelectYiMiaoDao;
import com.jiyoo.dao.SiLiaoDangAnUploadDao;
import com.jiyoo.dao.SiLiaoModifyDao;
import com.jiyoo.dao.SiLiaoTraverseDao;
import com.jiyoo.dao.TraverseBaoJianDao;
import com.jiyoo.dao.UpDateBaoJianDangAnDao;
import com.jiyoo.dao.UpdateYiMiaoDao;
import com.jiyoo.dao.UserUpdateDao;
import com.jiyoo.dao.YiMiaoDao;
import com.jiyoo.dao.impl.AgeListDaoImpl;
import com.jiyoo.dao.impl.BaoJianDangAnDaoImpl;
import com.jiyoo.dao.impl.BianhaoIfThereIsDaoImpl;
import com.jiyoo.dao.impl.CustomerDetailsDaoImpl;
import com.jiyoo.dao.impl.DaQuSelectDaoImpl;
import com.jiyoo.dao.impl.DaQuUpDaoImpl;
import com.jiyoo.dao.impl.DataDeleatAllDaoImpl;
import com.jiyoo.dao.impl.FaceDaoImpl;
import com.jiyoo.dao.impl.FaceDetailsDaoImpl;
import com.jiyoo.dao.impl.FileTraversalDaoImpl;
import com.jiyoo.dao.impl.FileUpLoadDaoImpl;
import com.jiyoo.dao.impl.GuiMoListDaoImpl;
import com.jiyoo.dao.impl.HuiFangDaoImpl;
import com.jiyoo.dao.impl.HuiFangListDaoImpl;
import com.jiyoo.dao.impl.LoginUserDaoImpl;
import com.jiyoo.dao.impl.MenDianBianHaoDaoImpl;
import com.jiyoo.dao.impl.SelectCountDaoImpl;
import com.jiyoo.dao.impl.SelectHuiFangDaoImpl;
import com.jiyoo.dao.impl.SelectYiMiaoDaoImpl;
import com.jiyoo.dao.impl.SiLiaoDangAnUploadDaoImpl;
import com.jiyoo.dao.impl.SiLiaoModifyDaoImpl;
import com.jiyoo.dao.impl.SiLiaoTraverseDaoImpl;
import com.jiyoo.dao.impl.TraverseBaoJianDaoImpl;
import com.jiyoo.dao.impl.UpDateBaoJianDangAnDaoImpl;
import com.jiyoo.dao.impl.UpdateYiMiaoDaoImpl;
import com.jiyoo.dao.impl.UserUpdateDaoImpl;
import com.jiyoo.dao.impl.YiMiaoDaoImpl;

public class FactoryList {
	//基本信息遍历
	public static FaceDao facefactory(){
		return  new FaceDaoImpl();
	}
	//个人详情
	public static FaceDetailsDao facedetails(){
		return  new FaceDetailsDaoImpl();
	}
	//文件上传
	public static FileUpLoadDao uploadfactory(){
		return  new FileUpLoadDaoImpl();
	}
	//文件上传遍历
	public static FileTraversalDao traversalDao(){
		return  new FileTraversalDaoImpl();
	}
	//详情录入
	public static CustomerDetailsDao customerDetailsDao(){
		return  new CustomerDetailsDaoImpl();
	}
	//详情修改
	public static UserUpdateDao userUpdateDao(){
		return  new UserUpdateDaoImpl();
	}
	//详情删除
	public static DataDeleatAllDao datadele(){
		return new DataDeleatAllDaoImpl();
	}
	//回访报告
	public static HuiFangDao huifang(){
		return new HuiFangDaoImpl();
	}
	//回访报告查询
	public static SelectHuiFangDao sehuifang(){
		return new SelectHuiFangDaoImpl();
	}
	//疫苗档案提交
	public static YiMiaoDao ym(){
		return new YiMiaoDaoImpl();
	}
	//疫苗档案遍历
	public static SelectYiMiaoDao symd(){
		return new SelectYiMiaoDaoImpl();
	}
	//疫苗档案遍历修改
	public static UpdateYiMiaoDao updateYiMiaoDao(){
		return new UpdateYiMiaoDaoImpl();
	}
	//保健档案提交
	public static BaoJianDangAnDao baojianup(){
		return new BaoJianDangAnDaoImpl();
	}
	//保健档案遍历
	public static TraverseBaoJianDao traverbj(){
		return new TraverseBaoJianDaoImpl();
	}
	//保健档案遍历修改
	public static UpDateBaoJianDangAnDao updatebaojian(){
		return new UpDateBaoJianDangAnDaoImpl();
	}
	//饲料档案提交
	public static SiLiaoDangAnUploadDao siliaoupload(){
		return new SiLiaoDangAnUploadDaoImpl();
	}
	//饲料档案遍历
	public static SiLiaoTraverseDao siliaotraverse(){
		return new SiLiaoTraverseDaoImpl();
	}
	//饲料档案遍历修改
	public static SiLiaoModifyDao siliaomodify(){
		return new SiLiaoModifyDaoImpl();
	}
	//登录
	public static LoginUserDao login(){
		return new LoginUserDaoImpl();
	}
	//验证编号是否存在
	public static BianhaoIfThereIsDao bianhaoif(){
		return new BianhaoIfThereIsDaoImpl();
	}
	//初始化统计 会员总数  最大规模
	public static SelectCountDao selectcount(){
		return new SelectCountDaoImpl();
	}
	//规模查询
	public static GuiMoListDao gmlist(){
		return new GuiMoListDaoImpl();
	}
	//年龄查询
	public static AgeListDao agelist(){
		return new AgeListDaoImpl();
	}
	//回访报告查询遍历 
	public static HuiFangListDao hfl(){
		return new HuiFangListDaoImpl(); 
	}
	//大区录入
	public static DaQuUpDao dqud(){
		return new DaQuUpDaoImpl(); 
	}
	//大区查询
	public static DaQuSelectDao dqsele(){
		return new DaQuSelectDaoImpl(); 
	}
	//查询大区下的门店
	public static DaQuSelectDao selectmendianlist(){
		return new DaQuSelectDaoImpl(); 
	}
	//单查  门店编号
	public static MenDianBianHaoDao menDianBianHaoDao(){
		return new MenDianBianHaoDaoImpl(); 
	}
}
