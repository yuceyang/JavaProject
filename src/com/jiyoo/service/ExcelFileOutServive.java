package com.jiyoo.service;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import com.jiyoo.factory.FactoryList;
import com.jiyoo.vo.JibenVo;


/**
 * 导出信息
 */

public class ExcelFileOutServive extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			resp.setCharacterEncoding("utf-8");
			try {
				String tt=req.getParameter("list");
				String[] t=tt.split(",");
				String a=t[0].trim();
				String b=t[1].trim();
				String c=t[2].trim();
				String d=t[3].trim();
				//创建文件名
				String fn=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
				//文件名全称
				String filename=fn+".xls";
				//创建文件路径
				//String url=System.getProperty("user.dir")+"/WebRoot/file/"+fn+".xls";
				String url=req.getSession().getServletContext().getRealPath("")+"\\file\\"+fn+".xls";//获取文件路径
				//创建文件
				new OutputStreamWriter(new FileOutputStream(url)).close();
				//打开文件 
				WritableWorkbook book=Workbook.createWorkbook(new File(url));
				//生成名为“第一页”的工作表，参数0表示这是第一页 
				WritableSheet sheet=book.createSheet("第一页",0);
				 //获取数据
				List<JibenVo> list=FactoryList.facefactory().faced(a, b, c, d);
				sheet.addCell(new Label(0,0,"日期"));
				sheet.addCell(new Label(1,0,"门店编号 *"));
				sheet.addCell(new Label(2,0,"会员编号 *"));
				sheet.addCell(new Label(3,0,"会员姓名 *"));
				sheet.addCell(new Label(4,0,"会员电话 *"));
				sheet.addCell(new Label(5,0,"年龄"));
				sheet.addCell(new Label(6,0,"性别"));
				sheet.addCell(new Label(7,0,"通讯地址"));
				sheet.addCell(new Label(8,0,"微信号"));
				sheet.addCell(new Label(9,0,"身份证"));
				sheet.addCell(new Label(10,0,"规模"));
				for(int i=1;i<=list.size();i++){
					 sheet.addCell(new Label(0,i,fn));
					 sheet.addCell(new Label(1,i,FactoryList.menDianBianHaoDao().menDianBianHaoDaoimpls(list.get(i-1).getMdaqu())));
					 sheet.addCell(new Label(2,i,list.get(i-1).getBianhao()));
					 sheet.addCell(new Label(3,i,list.get(i-1).getUname()));
					 sheet.addCell(new Label(4,i,list.get(i-1).getPhone()));
					 sheet.addCell(new Label(5,i,list.get(i-1).getAge()));
					 sheet.addCell(new Label(6,i,list.get(i-1).getSex()));
					 sheet.addCell(new Label(7,i,list.get(i-1).getIp()));
					 sheet.addCell(new Label(8,i,list.get(i-1).getWeixin()));
					 sheet.addCell(new Label(9,i,list.get(i-1).getBir()));
					 sheet.addCell(new Label(10,i,list.get(i-1).getGuimo()));
				 }
				 book.write();
				 book.close();
				 
				//创建file对象
		        File file=new File(url);
		        //设置response的编码方式
		        resp.setContentType("application/x-msdownload");
		        //写明要下载的文件的大小
		        resp.setContentLength((int)file.length());
		        //解决中文乱码
		        resp.setHeader("Content-Disposition","attachment;filename="+new String(filename.getBytes("GBK"),"ISO-8859-1"));
		        //读出文件到i/o流
		        FileInputStream fis=new FileInputStream(file);
		        BufferedInputStream buff=new BufferedInputStream(fis);
		        byte [] by=new byte[1024];//相当于我们的缓存
		        long k=0;//该值用于计算当前实际下载了多少字节
		        //从response对象中得到输出流,准备下载
		        OutputStream myout=resp.getOutputStream();
		        //开始循环下载
		        while(k<file.length()){
		            int j=buff.read(by,0,1024);
		            k+=j;
		            //将b中的数据写到客户端的内存
		            myout.write(by,0,j);
		        }
		        //将写入到客户端的内存的数据,刷新到磁盘
		        myout.flush();
		        myout.close();
		        buff.close();
		        
		        fis.close();
				 
				new File(url).delete();//删除文件
				
			} catch (RowsExceededException e) {
				e.printStackTrace();
			} catch (WriteException e) {
				e.printStackTrace();
			}
	}
}
