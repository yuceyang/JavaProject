package com.jiyoo.util;
import java.io.UnsupportedEncodingException;
/**
 * 乱码设置
 * 
 * */
public class StringUtf {
	public String U(String a) throws UnsupportedEncodingException{
		return new String(a.getBytes("ISO-8859-1"),"utf-8");
	}
}
