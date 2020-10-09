package com.jiyoo.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.DangAn;
/**
 * 饲料档案遍历修改
 */
public class SiLiaoModifyService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		DangAn da = new DangAn();
		da.setSiliaoleixingid(req.getParameter("id"));
		da.setSiliaoleixing(req.getParameter("siliaoleixing"));
		da.setPinpai(req.getParameter("pinpai"));
		da.setBaozhuangguige(req.getParameter("baozhuangguige"));
		da.setSiliaormb(req.getParameter("siliaormb"));
		da.setPeibi(req.getParameter("peibi"));
		da.setDoupobi(req.getParameter("doupobi"));
		da.setYumipeibi(req.getParameter("yumipeibi"));
		da.setMaifupeibi(req.getParameter("maifupeibi"));
		da.setChengbenbi(req.getParameter("chengbenbi"));
		FactoryList.siliaomodify().siliaomodifyimpl(da);
		resp.sendRedirect("jsp/fanganguanli/siliaodangan.jsp");
	}

}
