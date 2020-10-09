package com.jiyoo.service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONArray;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.JibenVo;

public class FaceService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String bianhao1=req.getParameter("bianhao");
		String name1=req.getParameter("uname");
		String phone1=req.getParameter("phone");
		String ip1=req.getParameter("uip");
		List<JibenVo> jilist=FactoryList.facefactory().faced(bianhao1, name1, phone1, ip1);
		JSON json=JSONArray.fromObject(jilist);
		PrintWriter out=resp.getWriter();
		out.print(json);
		out.flush();
		out.close();
	}
}
