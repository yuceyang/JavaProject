package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.SiLiaoTraverseDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;
public class SiLiaoTraverseDaoImpl implements SiLiaoTraverseDao {
	public List<DangAn> siliaotraversedaoimpl(){
		List<DangAn> list=new ArrayList<DangAn>();
		try {
			Connection conn=null;
			String sql=null;
			PreparedStatement pst=null;
			ResultSet re=null;
			conn=JdbcContext.getconn();
			sql="select * from siliaodangan order by siliaoleixingid asc";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				DangAn da=new DangAn();
				da.setSiliaoleixingid(re.getString("siliaoleixingid"));
				da.setSiliaoleixing(re.getString("siliaoleixing"));
				da.setPinpai(re.getString("pinpai"));
				da.setBaozhuangguige(re.getString("baozhuangguige"));
				da.setSiliaormb(re.getString("siliaormb"));
				da.setPeibi(re.getString("peibi"));
				da.setDoupobi(re.getString("doupobi"));
				da.setYumipeibi(re.getString("yumipeibi"));
				da.setMaifupeibi(re.getString("maifupeibi"));
				da.setChengbenbi(re.getString("chengbenbi"));
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
