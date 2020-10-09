package com.jiyoo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcContext {
	private final static String USER="root";
	private final static String PWD="1314love";
	private final static String DRIVER="com.mysql.cj.jdbc.Driver";
	private final static String URL="jdbc:mysql://119.23.218.245:3306/jydatabase?serverTimezone=UTC";
	public static Connection getconn(){
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USER, PWD);
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载异常");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接异常");
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		System.out.println(getconn());
	}
}
