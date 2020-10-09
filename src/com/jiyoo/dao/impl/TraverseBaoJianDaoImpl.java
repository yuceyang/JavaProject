package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.TraverseBaoJianDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;

public class TraverseBaoJianDaoImpl implements TraverseBaoJianDao {
	public List<DangAn> traverseBaoJianDaoImpls(){
		List<DangAn> list=new ArrayList<DangAn>();
		try {
			Connection conn=null;
			String sql=null;
			PreparedStatement pst=null;
			ResultSet re=null;
			conn=JdbcContext.getconn();
			sql="select * from baojiandangan order by baojianid asc";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				DangAn da=new DangAn();
				da.setBaojianid(re.getString("baojianid"));
				da.setBaojian(re.getString("baojian"));
				da.setBaojianchangjia(re.getString("baojianchangjia"));
				da.setBaojianguige(re.getString("baojianguige"));
				da.setBaojianrmb(re.getString("baojianrmb"));
				list.add(da);
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
