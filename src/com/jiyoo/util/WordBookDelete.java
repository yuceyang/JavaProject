package com.jiyoo.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jiyoo.jdbc.JdbcContext;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class WordBookDelete {
	public static void main(String[] args) {
		try {
			
			getbianhao();
			
			
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getbianhao() throws BiffException, IOException, SQLException{
		FileInputStream fi=new FileInputStream(new File("D:/select.xls"));//只识别.xls格式创建的Excel表格 (不支持2007以后的.xlsx格式)
		jxl.Workbook workbook=Workbook.getWorkbook(fi);//jxl的jar包提供方法  创建工作簿 操作Excel表格导入
		Sheet rs=workbook.getSheet(0);//获取第一张Sheet表 
		int row=rs.getRows();//获取行数
		for(int i=1;i<row;i++){//省略Excel表格第一行(第一行为标题)
			String p=rs.getCell(2,i).getContents();
			deleteAll(p);
		}
		fi.close();
	}
	
	
	@SuppressWarnings("static-access")
	public static void deleteAll(String bianhao) throws SQLException{
			Connection conn=null;
			String sql=null;
			PreparedStatement pst=null;
			conn=new JdbcContext().getconn();
			sql="DELETE FROM jibenxinxi WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_2_1 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_2_2 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_2_3 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_2_4 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_2_5 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_3 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_4_1 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_4_2 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_4_3 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_4_4 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_5 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_6_1 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_6_2 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_6_3 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
			
			sql="DELETE FROM details_7 WHERE  bianhao=\""+bianhao+"\";";
			pst=conn.prepareStatement(sql);
			pst.execute();
	}
}
