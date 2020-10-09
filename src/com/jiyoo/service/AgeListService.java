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
import com.jiyoo.vo.BigPackage;
/**
 * 统计--年龄查询
 */
public class AgeListService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String age1=req.getParameter("age1");
		String age2=req.getParameter("age2");
		List<BigPackage> list=FactoryList.agelist().ageListDaoImpl(age1, age2);
		JSON json=new JSONArray().fromObject(list);
		PrintWriter out=resp.getWriter();
		out.print(json);
		out.flush();
		out.close();
	}
}
