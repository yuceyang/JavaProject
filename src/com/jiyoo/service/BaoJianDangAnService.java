package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.DangAn;
/**
 * 保健药品录入
 */
public class BaoJianDangAnService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		DangAn da=new DangAn();
		da.setBaojian(req.getParameter("baojian"));
		da.setBaojianchangjia(req.getParameter("baojianchangjia"));
		da.setBaojianguige(req.getParameter("baojianguige"));
		da.setBaojianrmb(req.getParameter("baojianrmb"));
		FactoryList.baojianup().baoJianDangAnDaoImpl(da);
		resp.sendRedirect("jsp/fanganguanli/baojiandangan.jsp");
	}
}
