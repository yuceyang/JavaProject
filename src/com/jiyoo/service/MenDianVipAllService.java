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
import com.jiyoo.vo.JibenVo;
/**
 *  门店所属会员全查
 */
public class MenDianVipAllService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		try {
			List<JibenVo> list=new ArrayList<JibenVo>();
			String mdaqu=req.getParameter("mdaqu");
			Connection  conn=JdbcContext.getconn();
			String sql="select * from jibenxinxi where mdaqu=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, mdaqu);
			ResultSet re=pst.executeQuery();
			while(re.next()){
				JibenVo j=new JibenVo();
				j.setBianhao(re.getString("bianhao"));
				j.setUname(re.getString("uname"));
				j.setPhone(re.getString("phone"));
				j.setWeixin(re.getString("weixin"));
				j.setBir(re.getString("bir"));
				j.setIp(re.getString("ip"));
				j.setAge(re.getString("age"));
				j.setGuimo(re.getString("guimo"));
				list.add(j);
			}
			JSONArray json=new JSONArray().fromObject(list);
			PrintWriter out=resp.getWriter();
			out.print(json);
			out.flush();
			out.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
