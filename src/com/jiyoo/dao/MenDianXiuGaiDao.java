package com.jiyoo.dao;
import com.jiyoo.vo.QuYuVo;
public interface MenDianXiuGaiDao {
	public QuYuVo mendianXiuGaiDaoimpls(int id);//以id单查门店
	public void mendianXiuGai(QuYuVo qv);//修改门店店长信息
}
