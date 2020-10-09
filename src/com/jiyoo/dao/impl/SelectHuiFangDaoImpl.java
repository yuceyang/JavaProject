package com.jiyoo.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.jiyoo.dao.SelectHuiFangDao;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.HuiFangVo;

public class SelectHuiFangDaoImpl implements SelectHuiFangDao {
	@SuppressWarnings("static-access")
	public List<HuiFangVo> selhuiFangDaoImpl(String bianhao){
		List<HuiFangVo> list=new ArrayList<HuiFangVo>();
		try {
			Connection conn=null;
			String sql=null;
			PreparedStatement pst=null;
			ResultSet re=null;
			conn=new JdbcContext().getconn();
			if(bianhao.equals("")||bianhao==null){
				sql="SELECT * FROM details_8";
				pst=conn.prepareStatement(sql);
				re=pst.executeQuery();
				while(re.next()){
					HuiFangVo bp=new HuiFangVo();
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
			}else{
				sql="SELECT * FROM details_8 WHERE bianhao=?";
				pst=conn.prepareStatement(sql);
				pst.setString(1, bianhao);	
				re=pst.executeQuery();
				re=pst.executeQuery();
				while(re.next()){
					HuiFangVo bp=new HuiFangVo();
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
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
