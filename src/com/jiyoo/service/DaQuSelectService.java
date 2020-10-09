package com.jiyoo.service;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.QuYuVo;


/**
 * 
 */
public class DaQuSelectService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		QuYuVo qv=new QuYuVo();
		qv.setDaquusername(req.getParameter("daquusername"));
		qv.setDaquip(req.getParameter("daquip"));
		qv.setDaqubianhao(req.getParameter("daqubianhao"));
		qv.setDaquphone(req.getParameter("daquphone"));
		qv.setDaquzhiwei(req.getParameter("daquzhiwei"));
		List<QuYuVo> list=FactoryList.dqsele().daquselectdaoimpl(qv);
		JSONArray json=new JSONArray().fromObject(list);
		resp.getWriter().print(json);
	}
}



