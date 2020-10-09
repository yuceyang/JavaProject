package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.YiMiaoDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;
public class YiMiaoDaoImpl implements YiMiaoDao {
	public static Connection conn=null;
	public static String sql=null;
	public static PreparedStatement pst=null;
	public void yiMiaoDaoimpl(DangAn da){
		try {
		conn=JdbcContext.getconn();
		sql="insert into yimiaodangan(yimiao,schangjia,guige,scrmb) values(?,?,?,?)";
		pst=conn.prepareStatement(sql);
		pst.setString(1,da.getYimiao());
		pst.setString(2,da.getSchangjia());
		pst.setString(3,da.getGuige());
		pst.setString(4,da.getScrmb());
		pst.execute();
		
		pst.close();
		conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
