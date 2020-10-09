package com.jiyoo.service;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.LoginVo;
/**
 * 
 */
public class LoginListConfigService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");resp.setCharacterEncoding("utf-8");
		try { 
			Connection  conn=JdbcContext.getconn();
			String sql="select * from login";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet re=pst.executeQuery();
			List<LoginVo> list=new ArrayList<LoginVo>();
			while(re.next()){
				LoginVo lv=new LoginVo();
				lv.setId(re.getInt("id"));
				lv.setUsername(re.getString("username"));
				lv.setName(re.getString("namess"));
				lv.setPassword(re.getString("password"));
				lv.setChaxun(re.getString("chaxun"));
				lv.setXiugai(re.getString("xiugai"));
				lv.setZengjia(re.getString("zengjia"));
				lv.setShanchu(re.getString("shanchu"));
				lv.setGuanliyuan(re.getString("guanliyuan"));
				list.add(lv);
			}
			JSONArray json = new JSONArray().fromObject(list);
			PrintWriter out=resp.getWriter();
			out.print(json);
			out.flush();
			out.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
