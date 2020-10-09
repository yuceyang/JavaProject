package com.jiyoo.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.factory.FactoryTwoList;
import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.CaoZuoRiZhi;
import com.jiyoo.vo.LoginVo;
/**
 * 密码重置
 */
public class PasswordResetInitService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		Connection conn=null;
		PreparedStatement pst=null;
		try {
			String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			LoginVo lv=(LoginVo)req.getSession().getAttribute("log");
			CaoZuoRiZhi rz=new CaoZuoRiZhi();
			rz.setUsername(lv.getUsername());
			rz.setUnamess(lv.getName());
			rz.setTimes(date);
			rz.setIp(req.getRemoteAddr());//获取客户端的ip
			rz.setDatas("");
			rz.setFunctions("重置密码");
			rz.setContents("密码初始化为:123456");
			FactoryTwoList.rizhi().caozuorizhi(rz);
			
			String id=req.getParameter("id");
			int logid=Integer.parseInt(id);
			conn=JdbcContext.getconn();
			String sql="update login set password=? where id=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,"123456");
			pst.setInt(2,logid);
			pst.execute();
			pst.close();
			resp.sendRedirect("jsp/login/loginlist.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
