package com.jiyoo.service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.DangAn;
/**
 * 饲料档案遍历
 */
public class SiLiaoTraverseService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		List<DangAn> list=FactoryList.siliaotraverse().siliaotraversedaoimpl();
		JSONArray json = new JSONArray().fromObject(list);
		PrintWriter out = resp.getWriter();
		out.print(json);
		out.flush();
		out.close();
	}
}
