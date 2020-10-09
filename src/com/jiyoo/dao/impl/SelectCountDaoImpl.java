package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jiyoo.dao.SelectCountDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.SelectCountVo;
public class SelectCountDaoImpl implements SelectCountDao {
	public SelectCountVo selectCountDaoImpl(){
		SelectCountVo scv=new SelectCountVo();
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		ResultSet re=null;
		try {
			conn=JdbcContext.getconn();
			sql="SELECT MAX(CAST(guimo AS SIGNED INTEGER)) FROM jibenxinxi";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				scv.setMaxguimo(re.getInt("MAX(CAST(guimo AS SIGNED INTEGER))"));
			}
			sql="SELECT COUNT(bianhao) FROM jibenxinxi;";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				scv.setCountbianhao(re.getInt("COUNT(bianhao)"));
			}
			conn=JdbcContext.getconn();
			sql="SELECT bianhao FROM jibenxinxi where guimo=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,scv.getMaxguimo()+"");
			re=pst.executeQuery();
			while(re.next()){
				scv.setMaxguimobianhao(re.getString("bianhao"));
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return scv;
	}

}
