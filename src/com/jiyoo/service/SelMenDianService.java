package com.jiyoo.service;

import java.io.IOException;
import java.sql.Connection;
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
import com.jiyoo.vo.QuYuVo;


/**
 * 查询所有门店
 */
public class SelMenDianService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		try {
			Connection conn=JdbcContext.getconn();
			String sql="select * from mendian";
			ResultSet re=conn.prepareStatement(sql).executeQuery();
			List<QuYuVo> list=new ArrayList<QuYuVo>();
			while(re.next()){
				QuYuVo qv=new QuYuVo();
				qv.setMid(re.getInt("mid"));
				qv.setMname(re.getString("mname"));
				qv.setMphone(re.getString("mphone"));
				qv.setMdaqu(re.getString("mdaqu"));
				qv.setMip(re.getString("mip"));
				qv.setMbianhao(re.getString("mbianhao"));
				list.add(qv);
			}
			resp.getWriter().print(new JSONArray().fromObject(list));
			resp.getWriter().flush();
			resp.getWriter().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
