package com.jiyoo.service;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;
import com.jiyoo.util.SetUtf;
import com.jiyoo.vo.QuYuVo;
/**
 * 
 */
public class DaQuUpDateService extends SetUtf{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		QuYuVo q=new QuYuVo();
		q.setDaquusername(req.getParameter("daquusername"));
		q.setDaquphone(req.getParameter("daquphone"));
		q.setDaqubianhao(req.getParameter("daqubianhao"));
		q.setDaquip(req.getParameter("daquip"));
		q.setDaquzhiwei(req.getParameter("daquzhiwei"));
		q.setDaquid(Integer.parseInt(req.getParameter("daquid")));
		boolean tf= FactoryList.dqsele().updateidlist(q);
		PrintWriter out = resp.getWriter();
		out.print(tf);
		out.close();
		
	}
}
