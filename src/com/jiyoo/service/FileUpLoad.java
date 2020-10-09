package com.jiyoo.service;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jiyoo.factory.FactoryList;

public class FileUpLoad extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String upuser=new String(req.getParameter("upuser"));
		String filename=new String(req.getParameter("filename"));
		//replaceAll()也可以  且更加简便    
		String[] s=filename.split("\\\\");
		StringBuilder sb = new StringBuilder();
		String filn=" ";
		for(int i=0;i<s.length;i++){
			if(i<s.length-1){
				sb.append(s[i]+"\\");
			}else {
				sb.append(s[i]);
				filn=s[i];
			}
		}
		String fn=sb.toString();
		FileInputStream in=new FileInputStream(fn);
		String url=req.getSession().getServletContext().getRealPath("")+"\\file\\";//获取文件路径
		FileOutputStream out=new FileOutputStream(url+filn);
		BufferedOutputStream bw=new BufferedOutputStream(out);
		byte[] a=new byte[1024];
		while(in.read(a)!=-1){
			bw.write(a);
			bw.flush();
		}
		bw.close();
		out.close();
		in.close();
		String update=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		filename=filn;
		FactoryList.uploadfactory().Fileload(upuser, filename, update);
		resp.sendRedirect("jsp/file.jsp");//重定向页面
	}
}
