package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.DaQuUpDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.QuYuVo;

public class DaQuUpDaoImpl implements DaQuUpDao {
	Connection conn=null;
	String sql=null;
	PreparedStatement pst=null;
	@SuppressWarnings("static-access")
	public void onedaqudaoimpl(String daquusername,String daquphone,String daqubianhao,String daquip,String daquzhiwei){
		try {
			conn=new JdbcContext().getconn();
			sql="insert into daqu(daquusername,daquphone,daqubianhao,daquip,daquzhiwei) values(?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, daquusername);
			pst.setString(2, daquphone);
			pst.setString(3, daqubianhao);
			pst.setString(4, daquip);
			pst.setString(5, daquzhiwei);
			pst.execute();
			pst.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("static-access")
	public void mendianloaddaoimpl(QuYuVo qv){
		try {
			conn=new JdbcContext().getconn();
			sql="insert into mendian(mname,mbianhao,mphone,mip,mdaqu) values(?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, qv.getMname());
			pst.setString(2, qv.getMbianhao());
			pst.setString(3, qv.getMphone());
			pst.setString(4, qv.getMip());
			pst.setString(5, qv.getMdaqu());
			pst.execute();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
