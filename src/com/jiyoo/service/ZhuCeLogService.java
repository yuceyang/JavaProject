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
 * <!-- 注册登录账号-->
 */
public class ZhuCeLogService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");resp.setCharacterEncoding("UTF-8");
		try {
			String name=req.getParameter("name");
			String username=req.getParameter("username");
			String pwd=req.getParameter("password");
			String shanchu=req.getParameter("shanchu");
			String chaxun=req.getParameter("chaxun");
			String xiugai=req.getParameter("xiugai");
			String zengjia=req.getParameter("zengjia");
			String guanliyuan=req.getParameter("guanliyuan");
			if(shanchu!=null){shanchu="Y";}else{shanchu="N";}
			if(chaxun!=null){chaxun="Y";}else{chaxun="N";}
			if(xiugai!=null){xiugai="Y";}else{xiugai="N";}
			if(zengjia!=null){zengjia="Y";}else{zengjia="N";}
			if(guanliyuan!=null){guanliyuan="Y";}else{guanliyuan="N";}
			Connection conn=new JdbcContext().getconn();
			String sql="INSERT INTO login(namess,username,password,zengjia,shanchu,xiugai,chaxun,guanliyuan) VALUES(?,?,?,?,?,?,?,?);";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,name);
			pst.setString(2,username);
			pst.setString(3,pwd);
			pst.setString(4,zengjia);
			pst.setString(5,shanchu);
			pst.setString(6,xiugai);
			pst.setString(7,chaxun);
			pst.setString(8,guanliyuan);
			pst.execute();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("jsp/login/zhuce.jsp");
	}
}
