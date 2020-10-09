package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.HuiFangDao;
import com.jiyoo.jdbc.JdbcContext;

public class HuiFangDaoImpl implements HuiFangDao {
	@SuppressWarnings({ "static-access"})
	public void huiFangDaoimpl(String bstr){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		conn=new JdbcContext().getconn();
		String[] bigarray=bstr.split("@@");
		for(int i=0;i<bigarray.length;i++){
			try {
				String[] smallarray=bigarray[i].split("__");
				sql="INSERT INTO details_8(bianhao,return_visit_times,return_visit_purpose,return_visit_usage,return_visit_Feedintake,return_visit_feces,return_visit_appearance,return_visit_end,return_visit_antibody,return_visit_other,return_visit_conclusion) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
				pst=conn.prepareStatement(sql);
				pst.setString(1,smallarray[0]);
				pst.setString(2,smallarray[1]);
				pst.setString(3,smallarray[2]);
				pst.setString(4,smallarray[3]);
				pst.setString(5,smallarray[4]);
				pst.setString(6,smallarray[5]);
				pst.setString(7,smallarray[6]);
				pst.setString(8,smallarray[7]);
				pst.setString(9,smallarray[8]);
				pst.setString(10,smallarray[9]);
				pst.setString(11,smallarray[10]);
				pst.execute();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
