package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jiyoo.dao.BianhaoIfThereIsDao;
import com.jiyoo.jdbc.JdbcContext;

public class BianhaoIfThereIsDaoImpl implements BianhaoIfThereIsDao{
	public boolean bianhaoIfThereIsDaoImpl(String bianhao){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		ResultSet re=null;
		String a=null;
		try {
			conn=JdbcContext.getconn();
			sql="select * from jibenxinxi where bianhao=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,bianhao);
			re=pst.executeQuery();
			while(re.next()){
				a=re.getString("bianhao");
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(a==null||a==""){
			return true;
		}else{
			return false;
		}
	}
}
