package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class Out_employeeDaoImpl implements Out_employeeDao {

	

	
	public List<Out_employee> getAllOut_employees() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Out_employee> out_employees=new ArrayList<Out_employee>();
		try{
		conn=DbUtils.getConnection();
			String sql = "select * from out_employee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// 执行sql语句，然后将数据库结果存放在rs对象
			while (rs.next()) {
				Out_employee out_employee=new Out_employee();
				out_employee.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				out_employee.setOut_time(rs.getString("OUT_TIME"));
				out_employee.setOut_type(rs.getString("OUT_TYPE"));
				out_employee.setOut_toward(rs.getString("OUT_TOWARD"));
				out_employee.setDetail(rs.getString("DETAIL"));				
				out_employees.add(out_employee);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DbUtils.closeResultSet(rs);
			DbUtils.closePreparedStatement(pstmt);
			DbUtils.closeConnection();
		}
		return out_employees;
	}

	
	public Out_employee getOut_employeeByEmployee_no(String employee_no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Out_employee out_employee=new Out_employee();
		conn=DbUtils.getConnection();
		String sql="select  * from out_employee where employee_no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, employee_no);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				out_employee.setEmployee_no(employee_no);
				out_employee.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				out_employee.setOut_time(rs.getString("OUT_TIME"));
				out_employee.setOut_type(rs.getString("OUT_TYPE"));
				out_employee.setOut_toward(rs.getString("OUT_TOWARD"));
				out_employee.setDetail(rs.getString("DETAIL"));		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return out_employee;
	}

	
	public void insertOut_employee(Out_employee out_employee) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="insert into out_employee(employee_no,out_time,out_type,out_toward,detail) values(?,?,?,?,?)";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, out_employee.getEmployee_no());
		pstmt.setString(2, out_employee.getOut_time());
		pstmt.setString(3, out_employee.getOut_type());
		pstmt.setString(4, out_employee.getOut_toward());
		pstmt.setString(5, out_employee.getDetail());
		

		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}

	
	public void updateOut_employee(Out_employee out_employee) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="update dept set out_time=?,out_type=?,out_toward=?,detail=? where employee_no=?";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		
		
		pstmt.setString(1, out_employee.getOut_time());
		pstmt.setString(2, out_employee.getOut_type());
		pstmt.setString(3, out_employee.getOut_toward());
		pstmt.setString(4, out_employee.getDetail());
		pstmt.setString(5, out_employee.getEmployee_no());

		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}


	public void deleteOut_employee(String employee_no) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		String sql="delete from dept where employee_no=?";
		try {
			conn=DbUtils.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, employee_no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			DbUtils.closePreparedStatement(pstmt);
			DbUtils.closeConnection();
		}
	}


	

	

	
			
			
	}

	


