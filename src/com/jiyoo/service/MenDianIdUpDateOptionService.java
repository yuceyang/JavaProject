package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.factory.FactoryTwoList;
import com.jiyoo.vo.QuYuVo;
/**
 * 门店经理修改
 */
public class MenDianIdUpDateOptionService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		QuYuVo qv=new QuYuVo();
		qv.setMid(Integer.parseInt(req.getParameter("mid")));
		qv.setMname(req.getParameter("mname"));
		qv.setMphone(req.getParameter("mphone"));
		qv.setMip(req.getParameter("mip"));
		qv.setMbianhao(req.getParameter("mbianhao"));
		qv.setMdaqu(req.getParameter("mdaqu"));
		FactoryTwoList.mendianopration().mendianXiuGai(qv);
		resp.sendRedirect("jsp/fanganguanli/mendian.jsp");
	}
}
