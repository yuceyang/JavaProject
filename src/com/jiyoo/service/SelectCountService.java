package com.jiyoo.service;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONArray;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.SelectCountVo;
/**
 * 统计查询
 */
public class SelectCountService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		SelectCountVo scv=FactoryList.selectcount().selectCountDaoImpl();
		JSON json=new JSONArray().fromObject(scv);
		PrintWriter out=resp.getWriter();
		out.print(json);
		out.flush();
		out.close();
	}
}
