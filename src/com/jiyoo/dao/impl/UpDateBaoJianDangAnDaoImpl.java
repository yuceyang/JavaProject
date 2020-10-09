package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.UpDateBaoJianDangAnDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;

public class UpDateBaoJianDangAnDaoImpl implements UpDateBaoJianDangAnDao {
	public void upDateBaoJianDangAnDaoImpl(DangAn da){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
			try {
				conn=JdbcContext.getconn();
				int id=new Integer(da.getBaojianid()).intValue();
				sql="UPDATE baojiandangan SET baojian=\""+da.getBaojian()+
						"\",baojianchangjia=\""+da.getBaojianchangjia()+
						"\",baojianguige=\""+da.getBaojianguige()+
						"\",baojianrmb=\""+da.getBaojianrmb()+
						"\""+" where baojianid="+id;
				pst=conn.prepareStatement(sql);
				pst.execute();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
