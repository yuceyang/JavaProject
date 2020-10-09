package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jiyoo.dao.MenDianXiuGaiDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.QuYuVo;

public class MenDianXiuGaiDaoImpl implements MenDianXiuGaiDao {
	public static Connection conn;
	public static String sql;
	public static PreparedStatement pst;
	public static ResultSet re;
	//以id单查门店
	public QuYuVo mendianXiuGaiDaoimpls(int id){
		QuYuVo qv=new QuYuVo();
		try {
			conn=JdbcContext.getconn();
			sql="select * from mendian where mid=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			re=pst.executeQuery();
			while(re.next()){
				qv.setMid(re.getInt("mid"));
				qv.setMname(re.getString("mname"));
				qv.setMbianhao(re.getString("mbianhao"));
				qv.setMphone(re.getString("mphone"));
				qv.setMip(re.getString("mip"));
				qv.setMdaqu(re.getString("mdaqu"));
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qv;
	}
	public void mendianXiuGai(QuYuVo qv){
		String oldmdaqu=null;
		String oldmname=null;
		try {
			conn=JdbcContext.getconn();
			
			sql="select mdaqu FROM mendian WHERE mid=?";//查询所属的大区
			pst=conn.prepareStatement(sql);
			pst.setInt(1,qv.getMid());
			re=pst.executeQuery();
			while(re.next()){
				oldmdaqu=re.getString("mdaqu");
			}
			re.close();
			
			sql="select mname FROM mendian WHERE mid=?";//查询门店
			pst=conn.prepareStatement(sql);
			pst.setInt(1,qv.getMid());
			re=pst.executeQuery();
			while(re.next()){
				oldmname=re.getString("mname");
			}
			re.close();
			
			sql="UPDATE  mendian SET mname=?,mbianhao=?,mphone=?,mip=?,mdaqu=? WHERE mid=?";//修改门店信息
			pst=conn.prepareStatement(sql);
			pst.setString(1,qv.getMname());
			pst.setString(2,qv.getMbianhao());
			pst.setString(3,qv.getMphone());
			pst.setString(4,qv.getMip());
			pst.setString(5,qv.getMdaqu());
			pst.setInt(6,qv.getMid());
			pst.execute();
			
			sql="update jibenxinxi set daquusername=? where daquusername=?";//以原来大区字段  修改新所属大区
			pst=conn.prepareStatement(sql);
			pst.setString(1,qv.getMdaqu());
			pst.setString(2,oldmdaqu);
			
			sql="update jibenxinxi set mdaqu=? where mdaqu=?";//以原来门店字段  修改新门店姓名
			pst=conn.prepareStatement(sql);
			pst.setString(1,qv.getMname());
			pst.setString(2,oldmname);
			pst.execute();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
