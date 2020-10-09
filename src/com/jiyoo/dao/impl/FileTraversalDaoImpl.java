package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.FileTraversalDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.FileUpListVo;
public class FileTraversalDaoImpl implements FileTraversalDao {
	public static Connection conn=null;
	public static String sql=null;
	public static PreparedStatement pst=null;
	public static ResultSet re=null;
	public List<FileUpListVo> traversalDaoImpl(){
		List<FileUpListVo> list=new ArrayList<FileUpListVo>();
		try {
			conn=JdbcContext.getconn();
			sql="SELECT * FROM fileupload ORDER BY filenum DESC;";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				FileUpListVo fu=new FileUpListVo();
				fu.setFilenum(re.getInt("Filenum"));
				fu.setFilename(re.getString("filename"));
				fu.setUpdate(re.getString("updates"));
				fu.setUpuser(re.getString("upuser"));
				list.add(fu);
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
