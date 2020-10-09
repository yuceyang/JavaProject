package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.MenDianBianHaoDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;

public class MenDianBianHaoDaoImpl implements MenDianBianHaoDao {
	public static Connection conn=null;
	public static String sql=null;
	public static PreparedStatement pst=null;
	public static ResultSet re=null;
	public static String mm=null;
	
	public String menDianBianHaoDaoimpls(String mname){
		List<BigPackage> list=new ArrayList<BigPackage>();
		try {
			conn=JdbcContext.getconn();
			sql="SELECT * FROM mendian WHERE mname='"+mname+"'";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				BigPackage bg=new BigPackage();
				bg.setMdaqu(re.getString("mbianhao"));
				bg.setDaquusername(re.getString("mdaqu"));
				list.add(bg);
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String a="  ";
		if(list.size()>0){
			a=list.get(0).getMdaqu();
		}
		return a;
	}
}
