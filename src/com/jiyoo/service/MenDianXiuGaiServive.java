package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jiyoo.factory.FactoryTwoList;
import com.jiyoo.vo.QuYuVo;
public class MenDianXiuGaiServive extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		int mid=Integer.parseInt(req.getParameter("mid"));
		QuYuVo qv=FactoryTwoList.mendianopration().mendianXiuGaiDaoimpls(mid);
		req.getSession().setAttribute("mendian",qv);
		req.getRequestDispatcher("jsp/fanganguanli/mendianxiugai.jsp").forward(req, resp);
	}
}
