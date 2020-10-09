package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.AgeListDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;
public class AgeListDaoImpl implements AgeListDao {
	public Connection conn=null;
	public String sql=null;
	public PreparedStatement pst=null;
	public ResultSet re=null;
		
	public List<BigPackage> ageListDaoImpl(String gm1,String gm2){
		List<BigPackage> list=new ArrayList<BigPackage>();
		int age1=Integer.parseInt(gm1);
		int age2=Integer.parseInt(gm2);
		if(age1<age2){
			try {
				conn=JdbcContext.getconn();
				sql="SELECT * FROM jibenxinxi WHERE  CAST(age AS SIGNED INTEGER)>=? AND CAST(age AS SIGNED INTEGER)<=? ORDER BY CAST(age AS SIGNED INTEGER) DESC";
				pst=conn.prepareStatement(sql);
				pst.setInt(1,age1);
				pst.setInt(2,age2);
				re=pst.executeQuery();
				while(re.next()){
					BigPackage bg=new BigPackage();
					bg.setBianhao(re.getString("bianhao"));
					bg.setAge(re.getString("age"));
					bg.setGuimo(re.getString("guimo"));
					bg.setUname(re.getString("uname"));
					bg.setPhone(re.getString("phone"));
					bg.setIp(re.getString("ip"));
					list.add(bg);
				}
				re.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(age1>age2){
			try {
				conn=JdbcContext.getconn();
				sql="SELECT * FROM jibenxinxi WHERE  CAST(age AS SIGNED INTEGER)>=? AND CAST(age AS SIGNED INTEGER)<=? ORDER BY CAST(age AS SIGNED INTEGER) DESC";
				pst=conn.prepareStatement(sql);
				pst.setInt(1,age2);
				pst.setInt(2,age1);
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
				re.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			try {
				conn=JdbcContext.getconn();
				sql="SELECT * FROM jibenxinxi WHERE  CAST(age AS SIGNED INTEGER)=? ORDER BY CAST(guimo AS SIGNED INTEGER) DESC";
				pst=conn.prepareStatement(sql);
				pst.setInt(1,age1);
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
				re.close();
				pst.close();
				conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}
}
