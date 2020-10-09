package com.jiyoo.service;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.jdbc.JdbcContext;

/**
 *密码修改 
 */
public class LogPassWordUpdateService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		try {
		    Connection conn=JdbcContext.getconn();
		    String sql="UPDATE login SET password=? WHERE username=?";
		    PreparedStatement pst;
			pst = conn.prepareStatement(sql);
			pst.setString(1,pwd);
			pst.setString(2,uname);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.getWriter().print("<script> parent.location.href='/jiyoo/jsp/login/login.html'</script>");
	}
}
