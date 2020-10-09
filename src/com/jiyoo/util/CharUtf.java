package com.jiyoo.util;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 字符集过滤
 * */
public class CharUtf implements Filter{

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain china) throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		china.doFilter(req, resp);
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}
}
