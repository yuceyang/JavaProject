package com.jiyoo.util;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.vo.LoginVo;

public class PageFilter implements Filter{
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest) request;
	        HttpServletResponse resp = (HttpServletResponse)response;
	        LoginVo lv=(LoginVo) req.getSession().getAttribute("log");
	        int url=req.getRequestURL().indexOf("login");
	        int url2=req.getRequestURL().indexOf("log");
	        //测试微信订阅号连接
	        int url3=req.getRequestURL().indexOf("wxtoken");
	        
	        if(lv!=null || url!=-1 || url2!=-1 || url3!=-1){
	        	chain.doFilter(req, resp);
	        }else{
	        	resp.getWriter().print("<script> parent.location.href='/jiyoo/jsp/login/login.html'</script>");
	        }
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}
