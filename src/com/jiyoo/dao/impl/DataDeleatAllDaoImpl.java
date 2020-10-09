package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jiyoo.dao.DataDeleatAllDao;
import com.jiyoo.jdbc.JdbcContext;

public class DataDeleatAllDaoImpl implements DataDeleatAllDao {
	@SuppressWarnings({ "static-access" })
	public void dataDeleatAllDaoImpl(String str){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		conn=new JdbcContext().getconn();
		String[] s=str.split(";");
		for(int i=0;i<s.length;i++){
			try {
				sql="DELETE FROM jibenxinxi WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_2_1 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_2_2 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_2_3 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_2_4 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_2_5 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_3 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_4_1 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_4_2 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_4_3 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_4_4 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_5 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_6_1 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_6_2 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_6_3 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				
				sql="DELETE FROM details_7 WHERE  bianhao=\""+s[i]+"\";";
				pst=conn.prepareStatement(sql);
				pst.execute();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
