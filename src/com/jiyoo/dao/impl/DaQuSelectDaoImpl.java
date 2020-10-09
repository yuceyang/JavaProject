package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.dao.DaQuSelectDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.QuYuVo;

public class DaQuSelectDaoImpl implements DaQuSelectDao{
	List<QuYuVo> list=new ArrayList<QuYuVo>();
	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet re=null;
	String sql=null;
	//条件查询
	public List<QuYuVo> daquselectdaoimpl(QuYuVo qv){
		String daquusername = qv.getDaquusername();
		String daqubianhao = qv.getDaqubianhao();
		String daquip = qv.getDaquip();
		String daquphone = qv.getDaquphone();
		String daquzhiwei = qv.getDaquzhiwei();
		String str="";
		if(daquusername!=""){
			str+="daquusername='"+daquusername+"' and ";
		}
		if(daqubianhao!=""){
			str+="daqubianhao='"+daqubianhao+"' and ";
		}
		if(daquip!=""){
			str+="daquip='"+daquip+"' and ";
		}
		if(daquphone!=""){
			str+="daquphone='"+daquphone+"' and ";
		}
		if(daquzhiwei!=""){
			str+="daquzhiwei='"+daquzhiwei+"' and ";
		}
		try {
			conn=JdbcContext.getconn();
			if(str!=""){
				str = str.substring(0, str.length()-4);
				sql="SELECT * FROM daqu where "+str+" ORDER BY daquid ASC";
			}else{
				sql="SELECT * FROM daqu ORDER BY daquid ASC";
			}
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				QuYuVo qyv=new QuYuVo();
				qyv.setDaquid(re.getInt("daquid"));
				qyv.setDaquusername(re.getString("daquusername"));
				qyv.setDaquphone(re.getString("daquphone"));
				qyv.setDaqubianhao(re.getString("daqubianhao"));
				qyv.setDaquip(re.getString("daquip"));
				qyv.setDaquzhiwei(re.getString("daquzhiwei"));
				list.add(qyv);
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//大区以id查询
	public QuYuVo selectdaquid(int id){
		QuYuVo qy=new QuYuVo();
		try {
			sql="select * from daqu where daquid=?";
			conn=JdbcContext.getconn();
			pst=conn.prepareStatement(sql);
			pst.setInt(1,id);
			re=pst.executeQuery();
			while(re.next()){
				qy.setDaquid(re.getInt("daquid"));
				qy.setDaquusername(re.getString("daquusername"));
				qy.setDaqubianhao(re.getString("daqubianhao"));
				qy.setDaquphone(re.getString("daquphone"));
				qy.setDaquip(re.getString("daquip"));
				qy.setDaquzhiwei(re.getString("daquzhiwei"));
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qy;
	}
	
	//查询大区下的门店
	public List<QuYuVo> selectmendian(String mname){
		try {
			conn=JdbcContext.getconn();
			sql="SELECT * FROM mendian WHERE mdaqu='"+mname+"' ORDER BY mid ASC";
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				QuYuVo qy=new QuYuVo();
				qy.setMid(re.getInt("mid"));
				qy.setMname(re.getString("mname"));
				qy.setMbianhao(re.getString("mbianhao"));
				qy.setMip(re.getString("mip"));
				qy.setMphone(re.getString("mphone"));
				qy.setMdaqu(re.getString("mdaqu"));
				list.add(qy);
			}
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//大区 以id修改内容
	public boolean updateidlist(QuYuVo q){
		boolean tf=true;
		String oladname=null;
		try {
			//查询修改前的大区经理  存入变量
			conn=JdbcContext.getconn();
			sql="select daquusername from daqu where daquid=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,q.getDaquid());
			re=pst.executeQuery();
			while(re.next()){
				oladname=re.getString("daquusername");
			}
			re.close();
			
			//修改大区数据库表的内容
			sql="UPDATE daqu SET daquusername=?,daqubianhao=?,daquphone=?,daquip=?,daquzhiwei=? WHERE daquid=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1,q.getDaquusername());
			pst.setString(2,q.getDaqubianhao());
			pst.setString(3,q.getDaquphone());
			pst.setString(4,q.getDaquip());
			pst.setString(5,q.getDaquzhiwei());
			pst.setInt(6,q.getDaquid());
			tf=pst.execute();
			
			//修改基本信息表中的 大区经理
			sql="UPDATE jibenxinxi SET daquusername=? where daquusername=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,q.getDaquusername());
			pst.setString(2,oladname);
			pst.execute();
			
			//修改门店表中的 大区经理
			sql="UPDATE mendian SET mdaqu=? where mdaqu=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,q.getDaquusername());
			pst.setString(2,oladname);
			pst.execute();
			
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tf;
	}
	
	
}
