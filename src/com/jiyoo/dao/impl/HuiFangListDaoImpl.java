package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.jiyoo.dao.HuiFangListDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;
public class HuiFangListDaoImpl implements HuiFangListDao {
	public Connection conn=null;
	public String sql=null;
	public PreparedStatement pst=null;
	public ResultSet re=null;
	public List<BigPackage> huiFangListDaoImpls(String bianhao){
		List<BigPackage> list=new ArrayList<BigPackage>();
		try {
			conn=JdbcContext.getconn();
			sql="select * from details_8 where bianhao=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,bianhao);
			re=pst.executeQuery();
			while(re.next()){
				BigPackage bp=new BigPackage();
				bp.setBianhao(re.getString("bianhao"));
				bp.setReturn_visit_times(re.getString("return_visit_times"));
				bp.setReturn_visit_purpose(re.getString("return_visit_purpose"));
				bp.setReturn_visit_usage(re.getString("return_visit_usage"));
				bp.setReturn_visit_Feedintake(re.getString("return_visit_Feedintake"));
				bp.setReturn_visit_feces(re.getString("return_visit_feces"));
				bp.setReturn_visit_appearance(re.getString("return_visit_appearance"));
				bp.setReturn_visit_end(re.getString("return_visit_end"));
				bp.setReturn_visit_antibody(re.getString("return_visit_antibody"));
				bp.setReturn_visit_other(re.getString("return_visit_other"));
				bp.setReturn_visit_conclusion(re.getString("return_visit_conclusion"));
				list.add(bp);
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
