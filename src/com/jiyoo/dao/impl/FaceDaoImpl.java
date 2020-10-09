package com.jiyoo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.FaceDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.JibenVo;

public class FaceDaoImpl implements FaceDao{
	public static Connection conn=null;
	public static String sql=null;
	public static PreparedStatement pst=null;
	public static ResultSet re=null;
	public List<JibenVo> faced(String bianhao1, String name1, String phone1,String ip1) {
		List<JibenVo> ji=new ArrayList<JibenVo>();
		try {
			conn=JdbcContext.getconn();
			sql="select * from jibenxinxi ";
			
			if(bianhao1.length()>=1 & bianhao1 !=null & name1.length()==0 || name1 == null & phone1.length()==0 || phone1 == null & ip1.length()==0 || ip1 == null){
				sql=sql+" where bianhao=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao1);
			}
			if(bianhao1.length()==0 & name1.length()>=1 & phone1.length()==0 & ip1.length()==0){
				sql=sql+" where uname=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, name1);
			}
			if(bianhao1.length()==0 & name1.length()==0 & phone1.length()>=1 & ip1.length()==0){
				sql=sql+" where phone=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, phone1);
			}
			if(bianhao1.length()==0 & name1.length()==0 & phone1.length()==0 & ip1.length()>=1){
				sql=sql+" where ip like '%"+ip1+"%'";
				pst=conn.prepareStatement(sql);
			}
			if(bianhao1.length()>=1 & name1.length()>=1 & phone1.length()==0 & ip1.length()==0){
				//1.2
				sql=sql+" where bianhao=? and uname=? ";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao1);
				pst.setString(2, name1);
			}
			if(bianhao1.length()>=1 & name1.length()==0 & phone1.length()>=1 & ip1.length()==0){
				//1.3
				sql=sql+" where bianhao=? and phone=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao1);
				pst.setString(2, phone1);
			}
			if(bianhao1.length()>=1 & name1.length()==0 & phone1.length()==0 & ip1.length()>=1){
				//1.4
				sql=sql+" where bianhao=? and ip=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao1);
				pst.setString(2, ip1);
			}
			if(bianhao1.length()==0 & name1.length()>=1 & phone1.length()>=1 & ip1.length()==0){
				//2.3
				sql=sql+" where uname=? and phone=? ";
				pst=conn.prepareStatement(sql);
				pst.setString(1, name1);
				pst.setString(2, phone1);
			}
			if(bianhao1.length()==0 & name1.length()>=1 & phone1.length()==0 & ip1.length()>=1){
				//2.4
				sql=sql+" where uname=? and ip=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, name1);
				pst.setString(2, ip1);
			}
			if(bianhao1.length()==0 & name1.length()==0 & phone1.length()>=1 & ip1.length()>=1){
				//3.4
				sql=sql+" where phone=? and ip=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, phone1);
				pst.setString(2, ip1);
			}
			if(bianhao1.length()>=1 & name1.length()>=1 & phone1.length()>=1 & ip1.length()==0){
				//1.2.3
				sql=sql+" where bianhao=? and uname=?and phone=? ";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao1);
				pst.setString(2, name1);
				pst.setString(3, phone1);
			}
			if(bianhao1.length()>=1 & name1.length()>=1 & phone1.length()==0 & ip1.length()>=1){
				//1.2.4
				sql=sql+" where bianhao=? and uname=?and ip=? ";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao1);
				pst.setString(2, name1);
				pst.setString(3, ip1);
			}
			if(bianhao1.length()==0 & name1.length()>=1 & phone1.length()>=1 & ip1.length()>=1){
				//2.3.4
				sql=sql+" where uname=?and phone=? and ip=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, name1);
				pst.setString(2, phone1);
				pst.setString(3, ip1);
			}
			if(bianhao1.length()>=1 & name1.length()>=1 & phone1.length()>=1 & ip1.length()>=1){
				//1.2.3.4
				sql=sql+" where bianhao=? and uname=?and phone=? and ip=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao1);
				pst.setString(2, name1);
				pst.setString(3, phone1);
				pst.setString(4, ip1);
			}
			if(bianhao1.length()==0 & name1.length()==0 & phone1.length()==0 & ip1.length()==0){
				//null
				pst=conn.prepareStatement(sql);
			}
			re=pst.executeQuery();
			while(re.next()){
				JibenVo j=new JibenVo();
				j.setBianhao(re.getString("bianhao"));
				j.setUname(re.getString("uname"));
				j.setAge(re.getString("age"));
				j.setPhone(re.getString("phone"));
				j.setIp(re.getString("ip"));
				j.setBir(re.getString("bir"));
				j.setSex(re.getString("sex"));
				j.setWeixin(re.getString("weixin"));
				j.setGuimo(re.getString("guimo"));
				j.setMdaqu(re.getString("mdaqu"));
				j.setDaquusername(re.getString("daquusername"));
				j.setDaquusername(re.getString("daquusername"));//招商经理
				j.setMdaqu(re.getString("mdaqu"));//店长
				ji.add(j);
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ji;
	}
	
}
