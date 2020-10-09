package com.jiyoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jiyoo.jdbc.JdbcContext;

public class JdbcTest {
	public static Connection conn=null;
	public static String sql=null;
	public static PreparedStatement pst=null;
	public static ResultSet res=null;
	public static void select(){
		try {
		conn=JdbcContext.getconn();
		sql="select * from jibenxinxi";//语句
		pst=conn.prepareStatement(sql);//预处理
		res=pst.executeQuery();//提交
		while(res.next()){
			System.out.println(res.getString(1)+"  "+res.getString(2)+"   "+res.getString(3)+"   "+res.getString(4)+"   "+res.getString(5)+"   "+res.getString(6));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		select();
	}
}
