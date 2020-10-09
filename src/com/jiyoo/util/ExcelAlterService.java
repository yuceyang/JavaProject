package com.jiyoo.util;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 * Excel文件导入-会员信息
 *     文件选择器
 */
public class ExcelAlterService extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		String str="";
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//设置选择器界面 

			JFileChooser fileChooser = new JFileChooser(); //实例化文件选择器（选择文件的窗口）
			
			/*  多选用法
	        	fileChooser.setMultiSelectionEnabled(true);//设置多选择启用
	        	File[] files = fileChooser.getSelectedFiles();//获取文件数组
	        	for(int i=0;i<files.length;i++){}
			*/	        	
			
	        int state = fileChooser.showOpenDialog(null);//将文件选择器作为null的一个模式对话框弹出，传入null表示作为桌面程序的模式对话框。并得到返回值
	        
	        if(state == fileChooser.APPROVE_OPTION){
	        	
	        		String filepath = File.separator +fileChooser.getSelectedFile();//files[i];
	        		
	        		int types=filepath.indexOf(".xls");
	        		
	        		if(types!=-1){
	        			
	        			List<String> loj=new WordBookInputstream().excels(filepath);
	        			
	        			for(String a:loj){
		        			
		    				str+=a+"   ";
		    				
		    			}
		        		
		        		if(str.length()>0){
		        			
		        			resp.getWriter().print(str);
		        			
		        			resp.getWriter().close();
		        		
		        		}
		        		
	        		}else{
	        			
	        			resp.getWriter().print("<table align='center' style='margin-top:5%;'><tr><td>选择格式不正确!&nbsp;&nbsp;<a href='jsp/jibenxinxi.jsp'>返回</a></td></tr></table>");
	        			
	        		}
	        		
		    }else if(state == fileChooser.ERROR_OPTION){
		    	
		    	System.out.println("ERROR错误");
		    	
		    }else{
		    	
		    	resp.sendRedirect("jsp/jibenxinxi.jsp");
		    	
		    }
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
}
