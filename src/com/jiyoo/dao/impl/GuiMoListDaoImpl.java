package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.jiyoo.dao.GuiMoListDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;

public class GuiMoListDaoImpl implements GuiMoListDao {
	public Connection conn=null;
	public String sql=null;
	public PreparedStatement pst=null;
	public ResultSet re=null;
		
	public List<BigPackage> guiMoListDaoImpl(String gm1,String gm2){
		List<BigPackage> list=new ArrayList<BigPackage>();
		int gms1=Integer.parseInt(gm1);
		int gms2=Integer.parseInt(gm2);
		try {
			if(gms1<gms2){
				try {
					conn=JdbcContext.getconn();
					sql="SELECT * FROM jibenxinxi WHERE  CAST(guimo AS SIGNED INTEGER)>=? AND CAST(guimo AS SIGNED INTEGER)<=? ORDER BY CAST(guimo AS SIGNED INTEGER) DESC";
					pst=conn.prepareStatement(sql);
					pst.setInt(1,gms1);
					pst.setInt(2,gms2);
					re=pst.executeQuery();
					while(re.next()){
						BigPackage bg=new BigPackage();
						bg.setBianhao(re.getString("bianhao"));
						bg.setGuimo(re.getString("guimo"));
						bg.setUname(re.getString("uname"));
						bg.setPhone(re.getString("phone"));
						bg.setIp(re.getString("ip"));
						list.add(bg);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}else if(gms1>gms2){
				try {
					conn=JdbcContext.getconn();
					sql="SELECT * FROM jibenxinxi WHERE  CAST(guimo AS SIGNED INTEGER)>=? AND CAST(guimo AS SIGNED INTEGER)<=? ORDER BY CAST(guimo AS SIGNED INTEGER) DESC";
					pst=conn.prepareStatement(sql);
					pst.setInt(1,gms2);
					pst.setInt(2,gms1);
					re=pst.executeQuery();
					while(re.next()){
						BigPackage bg=new BigPackage();
						bg.setBianhao(re.getString("bianhao"));
						bg.setGuimo(re.getString("guimo"));
						bg.setUname(re.getString("uname"));
						bg.setPhone(re.getString("phone"));
						bg.setIp(re.getString("ip"));
						list.add(bg);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}else{
				try {
					conn=JdbcContext.getconn();
					sql="SELECT * FROM jibenxinxi WHERE  CAST(guimo AS SIGNED INTEGER)=? ORDER BY CAST(age AS SIGNED INTEGER) DESC";
					pst=conn.prepareStatement(sql);
					pst.setInt(1,gms1);
					re=pst.executeQuery();
					while(re.next()){
						BigPackage bg=new BigPackage();
						bg.setBianhao(re.getString("bianhao"));
						bg.setGuimo(re.getString("guimo"));
						bg.setUname(re.getString("uname"));
						bg.setPhone(re.getString("phone"));
						bg.setIp(re.getString("ip"));
						list.add(bg);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
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
