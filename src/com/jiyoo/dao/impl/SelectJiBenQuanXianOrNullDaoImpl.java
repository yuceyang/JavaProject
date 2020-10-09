package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.jiyoo.dao.SelectJiBenQuanXianOrNullDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.QuYuVo;

public class SelectJiBenQuanXianOrNullDaoImpl implements SelectJiBenQuanXianOrNullDao {
	Connection conn=null;
	String sql=null;
	PreparedStatement pst=null;
	ResultSet re=null;
	public List<QuYuVo> chaxunquanxian(String daquusername,String mdaqu){
		List<QuYuVo> list=new ArrayList<QuYuVo>();
		try {
			conn=JdbcContext.getconn();
	 		sql="select * from mendian where mdaqu=? and mname=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,daquusername);
			pst.setString(2,mdaqu);
			re=pst.executeQuery();
			while(re.next()){
				QuYuVo q=new QuYuVo();
				q.setMdaqu(re.getString("mdaqu"));
				q.setMname(re.getString("mname"));
				q.setMbianhao(re.getString("mbianhao"));
				list.add(q);
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
