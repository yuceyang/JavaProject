package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.SelectYiMiaoDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;
public class SelectYiMiaoDaoImpl implements SelectYiMiaoDao {
	public List<DangAn> selectYiMiaoDaoImpl(){
		List<DangAn> list=new ArrayList<DangAn>();
		try {
			Connection conn=null;
			String sql=null;
			PreparedStatement pst=null;
			ResultSet re=null;
			conn=JdbcContext.getconn();
			sql="select * from yimiaodangan order by yimiaoid asc";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				DangAn da=new DangAn();
				da.setYimiaoid(re.getString("yimiaoid"));
				da.setYimiao(re.getString("yimiao"));
				da.setSchangjia(re.getString("schangjia"));
				da.setGuige(re.getString("guige"));
				da.setScrmb(re.getString("scrmb"));
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
