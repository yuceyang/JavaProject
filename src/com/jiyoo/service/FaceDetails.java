package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.util.StringUtf;
import com.jiyoo.vo.BigPackage;
/**
 * 个人详情
 * */
public class FaceDetails extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String b=new StringUtf().U(req.getParameter("bianhao"));
		BigPackage bp=FactoryList.facedetails().facedetails(b);
		req.getSession().setAttribute("bp",bp);
		req.getRequestDispatcher("jsp/userlist.jsp").forward(req, resp);
	}
}
