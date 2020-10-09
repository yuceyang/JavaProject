package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jiyoo.dao.LoginUserDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.LoginVo;
public class LoginUserDaoImpl implements LoginUserDao{
	Connection conn=null;
	String sql=null;
	PreparedStatement pst=null;
	ResultSet re=null;
	public LoginVo loginUserDaoImpl(String username,String password){
		LoginVo lv=new LoginVo();
		try {
			conn=JdbcContext.getconn();
			sql="select * from login where username=? and password=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,username);
			pst.setString(2,password);
			re=pst.executeQuery();
			while(re.next()){
				lv.setId(re.getInt("id"));
				lv.setUsername(re.getString("username"));
				lv.setPassword(re.getString("password"));
				lv.setName(re.getString("namess"));
				lv.setZengjia(re.getString("zengjia"));
				lv.setShanchu(re.getString("shanchu"));
				lv.setXiugai(re.getString("xiugai"));
				lv.setChaxun(re.getString("chaxun"));
				lv.setGuanliyuan(re.getString("guanliyuan"));
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lv;
	}
}
