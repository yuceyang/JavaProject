package com.jiyoo.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;
/**
 * 删除客户信息
 **/
public class DataDeleatAllService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String str=req.getParameter("str");
		FactoryList.datadele().dataDeleatAllDaoImpl(str);
		resp.sendRedirect("jsp/kehuxinxi.jsp");
	}
}
