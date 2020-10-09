package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.QuYuVo;
/**
 *  门店经理录入
 */
public class MenDianJingLiService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		QuYuVo qy = new QuYuVo();
		qy.setMname(req.getParameter("mname"));
		qy.setMbianhao(req.getParameter("mbianhao"));
		qy.setMphone(req.getParameter("mphone"));
		qy.setMip(req.getParameter("mip"));
		qy.setMdaqu(req.getParameter("mdaqu"));
		if(qy.getMname().trim().length()>0){
			if(req.getParameter("mdaqu")!="--请选择--"){
				FactoryList.dqud().mendianloaddaoimpl(qy);
				resp.sendRedirect("jsp/fanganguanli/mendian.jsp");
			}else{
				resp.getWriter().print("<table align='center' style='margin-top:20%'><th><td><h2>请选择所属大区</h2></td><td><a href='jsp/fanganguanli/mendian.jsp'>返回</a></td></th>");
			}
		}else{
			resp.getWriter().print("<table align='center' style='margin-top:20%'><th><td><h2>门店店长不能为空</h2></td><td><a href='jsp/fanganguanli/mendian.jsp'>返回</a></td></th>");
		}
	}
}
