package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.LoginVo;
/**
 * 登录
 */
public class LoginUser extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String username=req.getParameter("email");
		String password=req.getParameter("password");
		String checkbox=req.getParameter("checkbox");
		LoginVo lv=FactoryList.login().loginUserDaoImpl(username, password);
		if(lv.getId()!=0){
			if(checkbox!=null){
				Cookie cookname=new Cookie("username",username);
				Cookie cookpwd=new Cookie("password",password);
				cookname.setMaxAge(3600*24*7);
				cookpwd.setMaxAge(3600*24*7);
				resp.addCookie(cookname);
				resp.addCookie(cookpwd);
			}else{
				Cookie cookname=new Cookie("username","**");
				Cookie cookpwd=new Cookie("password","**");
				resp.addCookie(cookname);
				resp.addCookie(cookpwd);
			}
			HttpSession  session=req.getSession();
			session.setAttribute("log",lv);
			session.setMaxInactiveInterval(60*60*24);//设置session存活时间 以秒为单位
			resp.getWriter().print("true");
		}else{
			resp.getWriter().print("false");
		}
	}
}
