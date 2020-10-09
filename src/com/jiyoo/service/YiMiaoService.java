package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.DangAn;

public class YiMiaoService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		DangAn da=new DangAn();
		da.setYimiao(req.getParameter("yimiao"));
		da.setSchangjia(req.getParameter("schangjia"));
		da.setGuige(req.getParameter("guige"));
		da.setScrmb(req.getParameter("scrmb"));
		FactoryList.ym().yiMiaoDaoimpl(da);
		resp.sendRedirect("jsp/fanganguanli/yimiaodangan.jsp");
	}
}
