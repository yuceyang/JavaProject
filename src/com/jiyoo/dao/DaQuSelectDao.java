package com.jiyoo.dao;

import java.util.List;

import com.jiyoo.vo.QuYuVo;

public interface DaQuSelectDao {
	public List<QuYuVo> daquselectdaoimpl(QuYuVo qv);
	public List<QuYuVo> selectmendian(String mname);
	public QuYuVo selectdaquid(int id);//id单查大区
	public boolean updateidlist(QuYuVo q);//以id修改大区
}
