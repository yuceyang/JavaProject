package com.jiyoo.service;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileDownService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		String filename=new String(req.getParameter("filename")) ;
		String url=req.getSession().getServletContext().getRealPath("")+"\\file\\";//获取文件路径
		//创建file对象
        File file=new File(url+filename);
        //设置response的编码方式
        response.setContentType("application/x-msdownload");
        //写明要下载的文件的大小
        response.setContentLength((int)file.length());
        //设置附加文件名
        //response.setHeader("Content-Disposition","attachment;filename="+filename);
        //解决中文乱码
        response.setHeader("Content-Disposition","attachment;filename="+new String(filename.getBytes("GBK"),"ISO-8859-1"));       
        //读出文件到i/o流
        FileInputStream fis=new FileInputStream(file);
        BufferedInputStream buff=new BufferedInputStream(fis);
        byte [] b=new byte[1024];//相当于我们的缓存
        long k=0;//该值用于计算当前实际下载了多少字节
        //从response对象中得到输出流,准备下载
        OutputStream myout=response.getOutputStream();
        //开始循环下载
        while(k<file.length()){
            int j=buff.read(b,0,1024);
            k+=j;
            //将b中的数据写到客户端的内存
            myout.write(b,0,j);
        }
        //将写入到客户端的内存的数据,刷新到磁盘
        myout.flush();
        
        myout.close();
        buff.close();
        fis.close();
	}
}
