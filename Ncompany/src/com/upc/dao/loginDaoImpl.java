package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.upc.utils.DbUtils;

public class loginDaoImpl implements loginDao{
	public void insertlogin(login lgin)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="insert into login values(?,?)";
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setString(1, lgin.getId());
		   pstmt.setString(2, lgin.getPassword());

		   pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbUtils.closePreparedStatement(pstmt);
            DbUtils.closeConnection();
		}
		
	}
	
	
	
	public String getloginByid(String id)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String lo=null;
	//	login lo=new login();
		conn=DbUtils.getConnection();
		String sql="select password from login where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
		//	pstmt.setString(1, lo.getPassword());
			
			rs=pstmt.executeQuery();
			rs.next();
			lo=rs.getString("password");
		//	if(rs.next())
		//	{
		//		lo.setId(id);
		//		lo.setPassword(rs.getString("password"));
	//		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lo;
		
	}

	

}
