package com.jiyoo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jiyoo.dao.RiZhiDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.CaoZuoRiZhi;

public class RiZhiDaoImpl implements RiZhiDao {
	public void caozuorizhi(CaoZuoRiZhi rz){
		try {
			String sql="insert into operationlog(username,unamess,ip,contents,functions,datas,times) values (?,?,?,?,?,?,?)";
			PreparedStatement  pst=JdbcContext.getconn().prepareStatement(sql);
			pst.setString(1,rz.getUsername());
			pst.setString(2,rz.getUnamess());
			pst.setString(3,rz.getIp());
			pst.setString(4,rz.getContents());
			pst.setString(5,rz.getFunctions());
			pst.setString(6,rz.getDatas());
			pst.setString(7,rz.getTimes());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
