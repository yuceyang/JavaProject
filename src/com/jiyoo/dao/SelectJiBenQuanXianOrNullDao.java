package com.jiyoo.dao;

import java.util.List;

import com.jiyoo.vo.QuYuVo;

public interface SelectJiBenQuanXianOrNullDao {
	public List<QuYuVo> chaxunquanxian(String daquusername,String mdaqu);//查询会员权限是否正确
}
