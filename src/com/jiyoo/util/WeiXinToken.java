package com.jiyoo.util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.DigestUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.jiyoo.vo.TextMeaasge;
import com.thoughtworks.xstream.XStream;
/**
 * 
 * 微信公众号连接
 * 
 * */

public class WeiXinToken extends HttpServlet{
	private static final long serialVersionUID = 1L;
	//微信接入
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String signature=req.getParameter("signature");
		String timestamp=req.getParameter("timestamp");
		String nonce=req.getParameter("nonce");
		String echostr=req.getParameter("echostr");
	
		PrintWriter out=resp.getWriter();
		StringBuffer sb=new StringBuffer();
		List<String> list=new ArrayList<String>();
		list.add("TomYuCY");
		list.add(timestamp);
		list.add(nonce);
		Collections.sort(list);
		for(String str:list){
			sb.append(str);
		}
		String shalStr = DigestUtils.shaHex(sb.toString());  
		boolean flag = shalStr.equals(signature);
		if(flag){
			System.out.println("微信公众号接入成功!");
			out.print(echostr);
			out.flush();
		}
	}
	//微信输入传出信息交换
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		try {
			Map<String, String> map=xmltomap(req,resp);//XML转换为MAP集合
			String FromUserName=map.get("FromUserName");
			String ToUserName=map.get("ToUserName");
			System.out.println(map);
			
			TextMeaasge te=new TextMeaasge();
			te.setFromUserName(ToUserName);
			te.setToUserName(FromUserName);
			te.setCreateTime(new Date().getTime()+"");
			te.setMsgType("text");
			te.setContent(BaiDuTianQi(map.get("Content")));
			
			out.print(textMessageToXML(te));
			out.flush();
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	//XML转换为MAP集合
	@SuppressWarnings("unchecked")
	public Map<String, String> xmltomap(HttpServletRequest req, HttpServletResponse resp) throws IOException, DocumentException {
		InputStream in=req.getInputStream();
		SAXReader reader = new SAXReader();//dom4j的xml解析工具
		Document doc=reader.read(in);
		Map<String,String> map=new HashMap<String, String>();
		Element root=doc.getRootElement();//获取根节点
		List<Element> list=root.elements();//获取子节点集合
		for(Element e:list){
			map.put(e.getName(),e.getText());//存入map集合
		}
		return map;
	}
	//MAP转换为XML
	public static String textMessageToXML(TextMeaasge textMessage){
        XStream xstream = new XStream();              // 使用XStream将实体类的实例转换成xml格式    
        xstream.alias("xml", textMessage.getClass()); // 将xml的默认根节点替换成“xml”  默认的为(com.jiyoo...)
        return xstream.toXML(textMessage);
    }
	
	
	public static String BaiDuTianQi(String key) throws IOException{
		String location="北京市";
		String ak="YcfZcrN0oOGn3GM4BDgmlG6L1gRYBXnC";
		String url="http://api.map.baidu.com/telematics/v3/weather?location="+location+"&output=json&ak="+ak;//百度天气接口
		String url2="http://www.baidu.com.cn/s?wd=" + key + "&cl=3";//百度搜索接口
		URL data =new URL(url2);
		URLConnection uc=data.openConnection();
		InputStream in=uc.getInputStream();
		InputStreamReader inr=new InputStreamReader(in,"utf-8");
		BufferedReader br=new BufferedReader(inr);
		StringBuffer sb=new StringBuffer();
		String line=null;
		while ((line=br.readLine()) != null){
		     sb.append(line);
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		try {
			System.out.println(BaiDuTianQi("北京"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
