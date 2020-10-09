package com.jiyoo.factory;

import com.jiyoo.dao.MenDianXiuGaiDao;
import com.jiyoo.dao.RiZhiDao;
import com.jiyoo.dao.SelectJiBenQuanXianOrNullDao;
import com.jiyoo.dao.impl.MenDianXiuGaiDaoImpl;
import com.jiyoo.dao.impl.RiZhiDaoImpl;
import com.jiyoo.dao.impl.SelectJiBenQuanXianOrNullDaoImpl;

public class FactoryTwoList {
	//查询会员权限是否正确
	public static SelectJiBenQuanXianOrNullDao chaxunquanxian(){
		return new SelectJiBenQuanXianOrNullDaoImpl();
	}
	//以id单查门店
	public static MenDianXiuGaiDao mendianopration(){
		return new MenDianXiuGaiDaoImpl();
	}
	//操作日志
	public static RiZhiDao rizhi(){
		return new RiZhiDaoImpl();
	}
}
