package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.UpdateYiMiaoDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;

public class UpdateYiMiaoDaoImpl implements UpdateYiMiaoDao {
	public void updateYiMiaoDaoImpl(DangAn da){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
			try {
				conn=JdbcContext.getconn();
				int id=new Integer(da.getYimiaoid()).intValue();
				sql="UPDATE yimiaodangan SET yimiao=\""+da.getYimiao()+
						"\",schangjia=\""+da.getSchangjia()+
						"\",guige=\""+da.getGuige()+
						"\",scrmb=\""+da.getScrmb()+
						"\""+" where yimiaoid="+id;
				pst=conn.prepareStatement(sql);
				pst.execute();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
