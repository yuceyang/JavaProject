package com.jiyoo.util;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;


public class Test {
	public static String Tname="details_6_2";
	public static String c="private String bianhao;private String cost_comparison_original_buruzizhu_siliao;"+//哺乳仔猪--原来成本--饲料
		"private String cost_comparison_original_buruzizhu_yimiao;"+//哺乳仔猪--原来成本--疫苗
		"private String cost_comparison_original_buruzizhu_baojian;"+//哺乳仔猪--原来成本--治疗保健
		"private String cost_comparison_jiyooh_buruzizhu_siliao;"+//哺乳仔猪-5优堂--饲料
		"private String cost_comparison_jiyooh_buruzizhu_yimiao;"+//哺乳仔猪-5优堂--疫苗
		"private String cost_comparison_jiyooh_buruzizhu_baojian;"+//哺乳仔猪-5优堂--治疗保健
		
		"private String cost_comparison_original_baoyuzhu_siliao;"+//保育猪--原来成本--饲料
		"private String cost_comparison_original_baoyuzhu_yimiao;"+//保育猪--原来成本--疫苗
		"private String cost_comparison_original_baoyuzhu_baojian;"+//保育猪--原来成本--治疗保健
		"private String cost_comparison_jiyooh_baoyuzhu_siliao;"+//保育猪-5优堂--饲料
		"private String cost_comparison_jiyooh_baoyuzhu_yimiao;"+//保育猪-5优堂--疫苗
		"private String cost_comparison_jiyooh_baoyuzhu_baojian;"+//保育猪-5优堂--治疗保健
		
		"private String cost_comparison_original_yufei_siliao;"+//育肥猪--原来成本--饲料
		"private String cost_comparison_original_yufei_yimiao;"+//育肥猪--原来成本--疫苗
		"private String cost_comparison_original_yufei_baojian;"+//育肥猪--原来成本--治疗保健
		"private String cost_comparison_jiyooh_yufei_siliao;"+//育肥猪-5优堂--饲料
		"private String cost_comparison_jiyooh_yufei_yimiao;"+//育肥猪-5优堂--疫苗
		"private String cost_comparison_jiyooh_yufei_baojian;"+//育肥猪-5优堂--治疗保健
		
		"private String cost_comparison_original_huaiyunmuzhu_siliao;"+//怀孕母猪--原来成本--饲料
		"private String cost_comparison_original_huaiyunmuzhu_yimiao;"+//怀孕母猪--原来成本--疫苗
		"private String cost_comparison_original_huaiyunmuzhu_baojian;"+//怀孕母猪--原来成本--保健
		"private String cost_comparison_jiyooh_huaiyunmuzhu_siliao;"+//怀孕母猪--5优堂--饲料
		"private String cost_comparison_jiyooh_huaiyunmuzhu_yimiao;"+//怀孕母猪--5优堂--疫苗
		"private String cost_comparison_jiyooh_huaiyunmuzhu_baojian;"+//怀孕母猪--5优堂--保健 
		
		"private String cost_comparison_original_burumuzhu_siliao;"+//哺乳母猪--原来成本--饲料
		"private String cost_comparison_original_burumuzhu_yimiao;"+//哺乳母猪--原来成本--疫苗
		"private String cost_comparison_original_burumuzhu_baojian;"+//哺乳母猪--原来成本--保健
		"private String cost_comparison_jiyooh_burumuzhu_siliao;"+//哺乳母猪--5优堂--饲料
		"private String cost_comparison_jiyooh_burumuzhu_yimiao;"+//哺乳母猪--5优堂--疫苗
		"private String cost_comparison_jiyooh_burumuzhu_baojian;";//哺乳母猪--5优堂--保健 ;
//	public static void t() {
//		String a="E:\\J\\Run\\jiyoo\\src\\com\\jiyoo\\util\\Test.java";
//		String[] s=a.split("\\\\");
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<s.length;i++){
//			System.out.println(s[i]+"\\\\\\\\");
//			if(i<s.length-1){
//				sb.append(s[i]+"\\\\\\\\");
//			}else {
//				sb.append(s[i]);
//			}
//		}
//		System.out.println(sb.toString());
//	}
//	public static void e(){
//		try {
//		String a ="C:\\Users\\Administrator\\Desktop\\?????.txt  ??";
//		a=new String(a.getBytes("ISO-8859-1"),"utf-8");
//		System.out.println(a);
//		} catch (UnsupportedEncodingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		Date date=new Date();
//		String d=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
//		System.out.println(d);
//	}
//	@SuppressWarnings("static-access")
//	public static void aa() throws SQLException, UnsupportedEncodingException{
//		String aaa="前言： 在Java中，通过PreparedStatement往MySQL数据库插入中文出现'？'";
//		Connection conn=null;
//		String sql=null;
//		PreparedStatement pst=null;
//		conn=new JdbcContext().getconn();
//		sql="insert into details_2_5 values(?,?)";
//   		pst=conn.prepareStatement(sql);
//   		pst.setString(1,"01111");
//   		pst.setString(2,aaa);
//   		pst.execute();
//	}
	//生成向数据库添加字段的语句  用cc()方法生成的字符串
	public static void bb(){
		String s="bianhao,cost_comparison_original_buruzizhu_siliao,cost_comparison_original_buruzizhu_yimiao,cost_comparison_original_buruzizhu_baojian,cost_comparison_jiyooh_buruzizhu_siliao,cost_comparison_jiyooh_buruzizhu_yimiao,cost_comparison_jiyooh_buruzizhu_baojian,cost_comparison_original_baoyuzhu_siliao,cost_comparison_original_baoyuzhu_yimiao,cost_comparison_original_baoyuzhu_baojian,cost_comparison_jiyooh_baoyuzhu_siliao,cost_comparison_jiyooh_baoyuzhu_yimiao,cost_comparison_jiyooh_baoyuzhu_baojian,cost_comparison_original_yufei_siliao,cost_comparison_original_yufei_yimiao,cost_comparison_original_yufei_baojian,cost_comparison_jiyooh_yufei_siliao,cost_comparison_jiyooh_yufei_yimiao,cost_comparison_jiyooh_yufei_baojian,cost_comparison_original_huaiyunmuzhu_siliao,cost_comparison_original_huaiyunmuzhu_yimiao,cost_comparison_original_huaiyunmuzhu_baojian,cost_comparison_jiyooh_huaiyunmuzhu_siliao,cost_comparison_jiyooh_huaiyunmuzhu_yimiao,cost_comparison_jiyooh_huaiyunmuzhu_baojian,cost_comparison_original_burumuzhu_siliao,cost_comparison_original_burumuzhu_yimiao,cost_comparison_original_burumuzhu_baojian,cost_comparison_jiyooh_burumuzhu_siliao,cost_comparison_jiyooh_burumuzhu_yimiao,cost_comparison_jiyooh_burumuzhu_baojian";
		String ss[]=s.split(",");
		for(int i=0;i<ss.length;i++){
			System.out.println("pst.setString("+(i+1)+",bp.get"+ss[i].substring(0,1).toUpperCase()+ss[i].substring(1,ss[i].length())+"());");
		}
	}
	//生成创建数据库表的语句   按封装类生成所有属性名的字符串 如：bianhao,cost_comparison_original_buruzizhu_siliao,
	public static void cc(){
		String ss[]=c.split(";");
		System.out.println("USE test ;\r\n CREATE TABLE "+Tname+" (");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i].split("String")[1].replace(" ", "")+" varchar(255),");
		}
		System.out.println("PRIMARY KEY (bianhao)\r\n) ENGINE=InnoDB DEFAULT CHARSET=utf8;");
		System.out.println("添加语句:");
		System.out.print("insert into "+Tname+"(");
		for(int i=0;i<ss.length;i++){
			if(i==ss.length-1){
				System.out.print(ss[i].split("String")[1].replace(" ", "")+")");
			}else{
				System.out.print(ss[i].split("String")[1].replace(" ", "")+",");
			}
		}
		System.out.print(" values(");
		for(int i=0;i<ss.length;i++){
			if(i!=ss.length-1){
				System.out.print("?,");
			}else{
				System.out.print("?");
			}
		}
		System.out.print(")");
		System.out.println("\r\n总共"+ss.length+"条");
		for(int i=0;i<ss.length;i++){
			if(i==ss.length-1){
				System.out.print(ss[i].split("String")[1].replace(" ", ""));
			}else{
				System.out.print(ss[i].split("String")[1].replace(" ", "")+",");
			}
		}
	}
	//扫描文本内容转换为字符串
	public static String readFromFile(String string) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
            StringBuilder stringBuilder = new StringBuilder();
            String content;
            while((content = bufferedReader.readLine() )!=null){
                stringBuilder.append(content);
            }
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
	public static void dd(){
		String tables="details_6_2";//数据库表名
		String a=readFromFile("E:\\J\\Run\\jiyoo\\WebRoot\\Text\\Demo");
		String ss[]=a.split(",");
		System.out.print("sql=\"UPDATE "+tables+" SET ");
		for(int i=0;i<ss.length;i++){
			//System.out.print(ss[i].split("String")[0].replace(" ", "")+",");
			String it=ss[i].trim();
//			System.out.println(it.substring(0, 1).toUpperCase()+it.substring(1,ss[i].length()-1));
			String is=ss[i].trim().substring(0, 1).toUpperCase()+ss[i].trim().substring(1,ss[i].length());
			if(i==0){
			System.out.println(it+"="+"\\"+"\""+"\""+"+bp.get"+is+"()+");	
			}else{
			System.out.println("\""+"\\"+"\","+it+"="+"\\"+"\""+"\""+"+bp.get"+is+"()+");	
			}
		}
		System.out.println("\"\\\"\"+"+"\"where bianhao=\\\"\"+oldbianhao+"+"\"\\\"\""+";");
		System.out.println("pst=conn.prepareStatement(sql);\npst.execute();");
	}
	public static void main(String[] args) throws IOException, SQLException {
		//aa();
		//bb();
		//cc();
		dd();
	}
}
