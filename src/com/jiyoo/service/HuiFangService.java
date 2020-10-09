package com.jiyoo.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiyoo.factory.FactoryList;
import com.jiyoo.util.StringUtf;

public class HuiFangService extends HttpServlet{
	/**
	 * 回访报告提交
	 */
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String bstr=new StringUtf().U(req.getParameter("bstr"));
		String[] bigarray=bstr.split("@@");
		String temp="";
		String tempbianhao="";
		for(int i=0;i<bigarray.length;i++){
			String[] smallarray=bigarray[i].split("__");
			temp+=smallarray[0]+"  "+smallarray[1]+"  "+smallarray[2]+"  "+smallarray[3]+"  "+smallarray[4]+"  "+smallarray[5]+"  "+smallarray[6]+"  "+smallarray[7]+"  "+smallarray[8]+"  "+smallarray[9]+"  "+smallarray[10];
			if(smallarray[0].trim().equals("")||smallarray[0].trim()==null){
				tempbianhao="notnull";
			}
		}
		if(temp.trim().equals("")||temp.trim()==null){
			resp.sendRedirect("jsp/datas/notallnull.jsp");
		}else if(tempbianhao.equals("notnull")){
			resp.sendRedirect("jsp/datas/bianhaonotnull.jsp");
		}else{
			FactoryList.huifang().huiFangDaoimpl(bstr);
			resp.sendRedirect("jsp/datas/huifang.jsp");
		}
   }
}
