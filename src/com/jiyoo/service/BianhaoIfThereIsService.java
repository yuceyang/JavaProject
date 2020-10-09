package com.jiyoo.service;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.factory.FactoryList;
/**
 * 录入--验证编号是否存在
 */
public class BianhaoIfThereIsService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String el=null;
		String bianhao=req.getParameter("bianhao");
		boolean b=FactoryList.bianhaoif().bianhaoIfThereIsDaoImpl(bianhao);
		if(b){
			el="true";
		}else{
			el="false";
		}
		PrintWriter out=resp.getWriter();
		out.print(el);
		out.flush();
		out.close();
	}
}
