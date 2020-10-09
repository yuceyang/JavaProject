package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.BaoJianDangAnDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;
public class BaoJianDangAnDaoImpl implements BaoJianDangAnDao {
	public static Connection conn=null;
	public static String sql=null;
	public static PreparedStatement pst=null;
	public void baoJianDangAnDaoImpl(DangAn da){
		try {
			conn=JdbcContext.getconn();
			sql="insert into baojiandangan(baojian,baojianchangjia,baojianguige,baojianrmb) values(?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,da.getBaojian());
			pst.setString(2,da.getBaojianchangjia());
			pst.setString(3,da.getBaojianguige());
			pst.setString(4,da.getBaojianrmb());
			pst.execute();
			pst.close();
			conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
