package com.jiyoo.service;

import java.io.IOException;
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

import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.LoginVo;


/**
 * 查询原来登录密码正确性
 */
public class ChaGengService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		try {
			String uname=req.getParameter("username");
			String pwd=req.getParameter("pwd");
			Connection conn=JdbcContext.getconn();
			String sql="SELECT * FROM login WHERE password=? and username=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,pwd);
			pst.setString(2,uname);
			ResultSet re=pst.executeQuery();
			List<LoginVo> list=new ArrayList<LoginVo>();
			while(re.next()){
				LoginVo lv=new LoginVo();
				lv.setUsername(re.getString("username"));
				lv.setPassword(re.getString("password"));
				list.add(lv);
			}
			if(list.size()==0){
				resp.getWriter().print("N");
			}else{
				resp.getWriter().print("Y");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
