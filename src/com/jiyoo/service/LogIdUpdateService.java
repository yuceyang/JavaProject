package com.jiyoo.service;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.jdbc.JdbcContext;


/**
 * 
 */
public class LogIdUpdateService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");resp.setCharacterEncoding("utf-8");
		String username=req.getParameter("username");
		String uname=req.getParameter("uname");
		String logid=req.getParameter("logid");
		int id=Integer.parseInt(logid);
		String xiugai=req.getParameter("xiugai");
		String shanchu=req.getParameter("shanchu");
		String zengjia=req.getParameter("zengjia");
		String chaxun=req.getParameter("chaxun");
		String guanliyuan=req.getParameter("guanliyuan");
		try {
			String sql="update login set namess=?,username=?,zengjia=?,shanchu=?,xiugai=?,chaxun=?,guanliyuan=? where id=?";
			PreparedStatement pst=JdbcContext.getconn().prepareStatement(sql);
			pst.setString(1,uname);
			pst.setString(2,username);
			pst.setString(3,zengjia);
			pst.setString(4,shanchu);
			pst.setString(5,xiugai);
			pst.setString(6,chaxun);
			pst.setString(7,guanliyuan);
			pst.setInt(8, id);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("jsp/login/loginlist.jsp");
	}
}
