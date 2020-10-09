package com.jiyoo.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jiyoo.vo.WorkBooksVo;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class WordBookInputstream {
	public List<String> excels(String url){
		List<String> loj=null;
		try {
			//File file=new File();
			FileInputStream fi=new FileInputStream(new File(url));//只识别.xls格式创建的Excel表格 (不支持2007以后的.xlsx格式)
			jxl.Workbook workbook=Workbook.getWorkbook(fi);//jxl的jar包提供方法  创建工作簿 操作Excel表格导入
			Sheet rs=workbook.getSheet(0);//获取第一张Sheet表 
			//获得工作薄（Workbook）中工作表（Sheet）的个数   rs.getNumberOfImages()
			//int col=rs.getColumns();//获取列数
			int row=rs.getRows();//获取行数
			List<WorkBooksVo> list=new ArrayList<WorkBooksVo>();
			for(int i=1;i<row;i++){//省略Excel表格第一行(第一行为标题)
				WorkBooksVo wb=new WorkBooksVo();
				wb.setComl0(rs.getCell(0,i).getContents());
				wb.setComl1(rs.getCell(1,i).getContents());
				wb.setComl2(rs.getCell(2,i).getContents());
				wb.setComl3(rs.getCell(3,i).getContents());
				wb.setComl4(rs.getCell(4,i).getContents());
				wb.setComl5(rs.getCell(5,i).getContents());
				wb.setComl6(rs.getCell(6,i).getContents());
				wb.setComl7(rs.getCell(7,i).getContents());
				wb.setComl8(rs.getCell(8,i).getContents());
				wb.setComl9(rs.getCell(9,i).getContents());
				wb.setComl10(rs.getCell(10,i).getContents());
				wb.setComl11(rs.getCell(11,i).getContents());
				wb.setComl12(rs.getCell(12,i).getContents());
				wb.setComl13(rs.getCell(13,i).getContents());
				wb.setComl14(rs.getCell(14,i).getContents());
				list.add(wb);
			}
			fi.close();
			loj=new WordBookInputstreamDaoImpl().wordBookInputstreamimpl(list);//提交、查重与查空
		} catch (FileNotFoundException e) {
			System.out.println("字节流异常");
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return loj;
	}
}
