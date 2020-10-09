package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.SiLiaoDangAnUploadDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;
public class SiLiaoDangAnUploadDaoImpl implements SiLiaoDangAnUploadDao {
	public static Connection conn=null;
	public static String sql=null;
	public static PreparedStatement pst=null;
	public void siliaodanganuploadimpl(DangAn da){
		try {
			conn=JdbcContext.getconn();
			sql="insert into siliaodangan(siliaoleixing,pinpai,baozhuangguige,siliaormb,peibi,doupobi,yumipeibi,maifupeibi,chengbenbi) values(?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,da.getSiliaoleixing());
			pst.setString(2,da.getPinpai());
			pst.setString(3,da.getBaozhuangguige());
			pst.setString(4,da.getSiliaormb());
			pst.setString(5,da.getPeibi());
			pst.setString(6,da.getDoupobi());
			pst.setString(7,da.getYumipeibi());
			pst.setString(8,da.getMaifupeibi());
			pst.setString(9,da.getChengbenbi());
			pst.execute();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
