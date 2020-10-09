package com.jiyoo.dao;

import com.jiyoo.vo.LoginVo;

public interface LoginUserDao {
	public LoginVo loginUserDaoImpl(String username,String password);
}
