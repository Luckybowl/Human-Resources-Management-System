package com.upc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtils {
private DbUtils(){}
private static Connection conn=null;
public static Connection getConnection()
{
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// 2.连接数据库
		String url = "jdbc:sqlserver://172.20.51.94:1433;DatabaseName=company";
		String user = "sa";
		String password = "123456789";

		conn = DriverManager.getConnection(url, user, password);

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	}

public  static void closeConnection()
{
	try {
		if (conn != null) {
			conn.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public static void closeResultSet(ResultSet rs)
{
	try {
		if (rs != null) {
			rs.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public static void closePreparedStatement(PreparedStatement pstmt)
{
	try {
		if (pstmt != null) {
			pstmt.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
