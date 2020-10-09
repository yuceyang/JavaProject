package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.QuYuVo;
/**
 * 
 */
public class DaQuFunctionService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		QuYuVo qy=FactoryList.dqsele().selectdaquid(Integer.parseInt(req.getParameter("id")));
		req.getSession().setAttribute("q",qy);
		req.getRequestDispatcher("jsp/fanganguanli/daquxiugai.jsp").forward(req, resp);
	}
}
