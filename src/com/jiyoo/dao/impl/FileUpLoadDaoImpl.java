package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.FileUpLoadDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.FileUpListVo;

public class FileUpLoadDaoImpl implements FileUpLoadDao {
	public static Connection conn=null;
	public static String sql=null;
	public static String sql2=null;
	public static PreparedStatement pst=null;
	public static ResultSet re=null;
	@SuppressWarnings({ "unused" })
	public void Fileload(String upuser,String filename,String date){
		List<FileUpListVo> list=new ArrayList<FileUpListVo>();
		try {
		conn=JdbcContext.getconn();
		sql="INSERT INTO fileupload(filename,upuser,updates) VALUE(?,?,?);";
			pst=conn.prepareStatement(sql);
			pst.setString(1, filename);
			pst.setString(2, upuser);
			pst.setString(3, date);
			pst.execute();
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


