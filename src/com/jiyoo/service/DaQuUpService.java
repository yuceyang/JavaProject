package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;
/**
 * 大区录入
 */
public class DaQuUpService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	req.setCharacterEncoding("utf-8");
	resp.setCharacterEncoding("utf-8");
	FactoryList.dqud().onedaqudaoimpl(req.getParameter("daquusername"),req.getParameter("daquphone"),req.getParameter("daqubianhao"),req.getParameter("daquip"),req.getParameter("daquzhiwei"));
	resp.sendRedirect("jsp/fanganguanli/daquguanli.jsp");
	}
}


