package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.SiLiaoModifyDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.DangAn;
public class SiLiaoModifyDaoImpl implements SiLiaoModifyDao {
	public void siliaomodifyimpl(DangAn da){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
			try {
				conn=JdbcContext.getconn();
				int id=new Integer(da.getSiliaoleixingid()).intValue();
				sql="UPDATE siliaodangan SET siliaoleixing=\""+da.getSiliaoleixing()+
						"\",pinpai=\""+da.getPinpai()+
						"\",baozhuangguige=\""+da.getBaozhuangguige()+
						"\",siliaormb=\""+da.getSiliaormb()+
						"\",peibi=\""+da.getPeibi()+
						"\",doupobi=\""+da.getDoupobi()+
						"\",yumipeibi=\""+da.getYumipeibi()+
						"\",maifupeibi=\""+da.getMaifupeibi()+
						"\",chengbenbi=\""+da.getChengbenbi()+
						"\""+" where siliaoleixingid="+id;
				pst=conn.prepareStatement(sql);
				pst.execute();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
