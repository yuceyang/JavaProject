package com.jiyoo.util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.jiyoo.jdbc.JdbcContext;
import com.jiyoo.vo.BigPackage;
import com.jiyoo.vo.WorkBooksVo;

public class WordBookInputstreamDaoImpl {
	//excel导入
	public List<String> wordBookInputstreamimpl(List<WorkBooksVo> list){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		ResultSet re=null;
		String bianhaoornull=null;
		List<String> ls=new ArrayList<String>();
		try {
			conn=JdbcContext.getconn();
			for(int i=0;i<list.size();i++){
				if(list.get(i).getComl2()!=""||list.get(i).getComl2()!=null){
					sql="select bianhao from jibenxinxi where bianhao=?";
					pst=conn.prepareStatement(sql);
					pst.setString(1,list.get(i).getComl2());
					re=pst.executeQuery();
					while(re.next()){
						bianhaoornull=re.getString("bianhao");
					}
					if(bianhaoornull==null||bianhaoornull==""){
						sql="INSERT INTO jibenxinxi(bianhao,uname,age,phone,ip,bir,sex,guimo,weixin,daquusername,mdaqu) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.setString(2,list.get(i).getComl3());
						pst.setString(3,list.get(i).getComl5());
						pst.setString(4,list.get(i).getComl4());
						pst.setString(5,list.get(i).getComl7());
						pst.setString(6,list.get(i).getComl9());
						pst.setString(7,list.get(i).getComl6());
						pst.setString(8,list.get(i).getComl10());
						pst.setString(9,list.get(i).getComl8());
						pst.setString(10,list.get(i).getComl13());
						pst.setString(11,list.get(i).getComl14());
						pst.execute();
					
						sql="INSERT INTO details_2_1(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_2_2(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_2_3(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_2_4(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_2_5(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_3(bianhao,muzhupeizhongfeimianlv_youxiubiaozhun,nianjunchanzai_youxiubiaozhun,junchanhuozishu_youxiubiaozhun,buruzizhuchenghuolv_youxiubiaozhun,chushengzhong_youxiubiaozhun,duannaizhong_youxiubiaozhun,baoyuchenghuolv_youxiubiaozhun,lingzhong_youxiubiaozhun,yufeichenghuolv_youxiubiaozhun,shangshiling_youxiubiaozhun,PSY_youxiubiaozhun,MSY_youxiubiaozhun,liaoroubi_youxiubiaozhun,fangyifei_youxiubiaozhun,yf_fangyifei_youxiubiaozhun,zaorouchengben_youxiubiaozhun,yingkuidian_youxiubiaozhun) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.setString(2,"90%");
						pst.setString(3,"2.3-2.4");
						pst.setString(4,"12");
						pst.setString(5,"92%");
						pst.setString(6,"1.3-1.5");
						pst.setString(7,"7-7.5");
						pst.setString(8,"95%-97%");
						pst.setString(9,"25-30");
						pst.setString(10,"97%-98%");
						pst.setString(11,"165");
						pst.setString(12,"22-23");
						pst.setString(13,"21-22");
						pst.setString(14,"2.5-2.6");
						pst.setString(15,"90-95");
						pst.setString(16,"40");
						pst.setString(17,"5.5");
						pst.setString(18,"6");
						pst.execute();
						
						sql="INSERT INTO details_4_1(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_4_2(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_4_3(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_4_4(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_5(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_6_1(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_6_2(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_6_3(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
						
						sql="INSERT INTO details_7(bianhao) values(?)";
						pst=conn.prepareStatement(sql);
						pst.setString(1,list.get(i).getComl2());
						pst.execute();
					}else{
						String bianhao=list.get(i).getComl2();
						String username=list.get(i).getComl3();
						if(bianhao.equals(null) || bianhao.equals("") && username.equals(null) || username.equals("")){
							continue;
						}else{
							ls.add("编号"+bianhao+"已存在,请修改会员编号重新上传,会员名:"+username);
						}
						bianhaoornull=null;
						continue;
					}
				}else{
					ls.add("会员编号不能为空, 请先处理表格!"+list.get(i).getComl3());
					continue;
				};
			}//for循环结束
			re.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	
	
	
	public static List<BigPackage> workdwon(){
		Connection conn=null;
		String sql=null;
		PreparedStatement pst=null;
		ResultSet re=null;
		List<BigPackage> list=new ArrayList<BigPackage>();
		try {
			//sql="SELECT *  FROM jibenxinxi  WHERE bianhao LIKE 'JYHLJ51%' ";
			sql="SELECT *  FROM jibenxinxi";
			conn=JdbcContext.getconn();
			pst=conn.prepareStatement(sql);
			re=pst.executeQuery();
			while(re.next()){
				BigPackage bp=new BigPackage();
				bp.setBianhao(re.getString("bianhao"));
				bp.setUname(re.getString("uname"));
				bp.setAge(re.getString("age"));
				bp.setPhone(re.getString("phone"));
				bp.setIp(re.getString("ip"));
				bp.setBir(re.getString("bir"));
				bp.setWeixin(re.getString("weixin"));
				bp.setSex(re.getString("sex"));
				bp.setGuimo(re.getString("guimo"));
				list.add(bp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//excel导出
	public static void excelout(String url){
		try {
			//System.out.println(fileurl);
			//打开文件 
			 WritableWorkbook book=Workbook.createWorkbook(new File(url));
			//生成名为“第一页”的工作表，参数0表示这是第一页 
			 WritableSheet sheet=book.createSheet("第一页",0);
			 List<BigPackage> list=workdwon();
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
				 
				 sheet.addCell(new Label(0,i,"2017/5/11"));
				 sheet.addCell(new Label(1,i,"JHY00051"));
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
			 
			 
			//在Label对象的构造子中指名单元格位置是第一列第一行(0,0)  //以及单元格内容为test  
			// Label lb=new Label(0,1,"日期");
			// sheet.addCell(lb);
			 //或者WritableCell cell =  new jxl.write.Number(column, row, value, wcf) //将定义好的单元格添加到工作表中  
			 /*生成一个保存数字的单元格 必须使用Number的完整包路径，否则有语法歧义 单元格位置是第二列，第一行，值为789.123*/ 
			 //jxl.write.Number number = new jxl.write.Number(1,0,789.123);
			 //sheet.addCell(number);
			 //写入数据并关闭文件 
			 book.write();
			 book.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	public static void deleatexcel(String url){
		
		new File(url).delete();
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//excelout();
		
		// workdwon();
		
		String fn=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
		String url=System.getProperty("user.dir")+"/WebRoot/file/"+fn+".xls";
		
		new OutputStreamWriter(new FileOutputStream(url));
		
		excelout(url);//excel导入信息到excel文件
		Thread.sleep(1000);//休眠一分钟
		deleatexcel(url);//删除文件
	}
}
