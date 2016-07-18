package com.upc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class DeptDaoImpl implements DeptDao {

	
	public List<Dept> getAllDepts() {          
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> depts=new ArrayList<Dept>();
		try{
		conn=DbUtils.getConnection();
			String sql = "select * from dept";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// 执行sql语句，然后将数据库结果存放在rs对象
			while (rs.next()) {
				Dept dept=new Dept();
				dept.setDept_no(rs.getString("DEPT_NO"));
				dept.setDept_name(rs.getString("DEPT_NAME"));
				dept.setDept_type(rs.getString("DEPT_TYPE"));
				dept.setDept_phone(rs.getString("DEPT_PHONE"));
				dept.setDept_fax(rs.getString("DEPT_FAX"));
				dept.setDescribe(rs.getString("DESCRIBE"));
				dept.setRankdept(rs.getString("RANKDEPT"));
				dept.setsTart_date(rs.getString("sTART_DATE"));
		        depts.add(dept);
				
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DbUtils.closeResultSet(rs);
			DbUtils.closePreparedStatement(pstmt);
			DbUtils.closeConnection();
		}
		return depts;
	}
	
	public List<Dept> getDeptBy(String dept_no,String dept_name,String dept_type) {//查询部门
		
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs=null;
			List<Dept> depts=new ArrayList<Dept>();
			if(dept_no!=null&&dept_name!=null){
				try {
				conn=DbUtils.getConnection();
			    String sql="select  * from dept where dept_no=? and dept_name=? and dept_type= ?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dept_no);
				pstmt.setString(2, dept_name);
				pstmt.setString(3, dept_type);
				rs=pstmt.executeQuery();
				while (rs.next())
				{
					Dept dept=new Dept();
					dept.setDept_no(rs.getString("dept_no"));
					dept.setDept_name(rs.getString("dept_name"));
					dept.setDept_type(rs.getString("dept_type"));
					dept.setDept_phone(rs.getString("dept_phone"));
					dept.setDept_fax(rs.getString("dept_fax"));
					dept.setDescribe(rs.getString("describe"));
					dept.setRankdept(rs.getString("rankdept"));
					dept.setsTart_date(rs.getString("start_date"));
					
					depts.add(dept);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else if(dept_no!=null&&dept_name==null){
				try {
				conn=DbUtils.getConnection();
			    String sql="select  * from dept where dept_no=?  and dept_type= ?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dept_no);
				pstmt.setString(2, dept_type);
				rs=pstmt.executeQuery();
				while (rs.next())
				{
					Dept dept=new Dept();
					dept.setDept_no(rs.getString("dept_no"));
					dept.setDept_name(rs.getString("dept_name"));
					dept.setDept_type(rs.getString("dept_type"));
					dept.setDept_phone(rs.getString("dept_phone"));
					dept.setDept_fax(rs.getString("dept_fax"));
					dept.setDescribe(rs.getString("describe"));
					dept.setRankdept(rs.getString("rankdept"));
					dept.setsTart_date(rs.getString("start_date"));
					depts.add(dept);
					//System.out.println("123");
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else if(dept_no==null&&dept_name!=null){
				try {
				conn=DbUtils.getConnection();
			    String sql="select  * from dept where  dept_name=?  and dept_type= ?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dept_name);
				pstmt.setString(2, dept_type);
				rs=pstmt.executeQuery();
				while (rs.next())
				{
					Dept dept=new Dept();
					dept.setDept_no(rs.getString("dept_no"));
					dept.setDept_name(rs.getString("dept_name"));
					dept.setDept_type(rs.getString("dept_type"));
					dept.setDept_phone(rs.getString("dept_phone"));
					dept.setDept_fax(rs.getString("dept_fax"));
					dept.setDescribe(rs.getString("describe"));
					dept.setRankdept(rs.getString("rankdept"));
					dept.setsTart_date(rs.getString("start_date"));
					depts.add(dept);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else {
				try {
				conn=DbUtils.getConnection();
			    String sql="select  * from dept where dept_type=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dept_type);
				rs=pstmt.executeQuery();
				while (rs.next())
				{
					Dept dept=new Dept();
					dept.setDept_no(rs.getString("dept_no"));
					dept.setDept_name(rs.getString("dept_name"));
					dept.setDept_type(rs.getString("dept_type"));
					dept.setDept_phone(rs.getString("dept_phone"));
					dept.setDept_fax(rs.getString("dept_fax"));
					dept.setDescribe(rs.getString("describe"));
					dept.setRankdept(rs.getString("rankdept"));
					dept.setsTart_date(rs.getString("start_date"));
				//	System.out.println("ok");
					depts.add(dept);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {

				DbUtils.closeResultSet(rs);
				DbUtils.closePreparedStatement(pstmt);
				DbUtils.closeConnection();
			}
			}
			return depts;
		}
		
		
	

	
	public Dept getDeptByDept_no(String dept_no) {   //查询部门
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Dept dept=new Dept();
		conn=DbUtils.getConnection();
		String sql="select  * from dept where dept_no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,dept_no);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				dept.setDept_no(dept_no);
				dept.setDept_name(rs.getString("DEPT_NAME"));
				dept.setDept_type(rs.getString("DEPT_TYPE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dept;
	}

	
	public void insertDept(Dept dept) {    //新建部门 ok
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="insert into dept(dept_no,dept_name,dept_type,dept_phone,dept_fax,describe,rankdept,start_date) values(?,?,?,?,?,?,?,?)";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, dept.getDept_no());
		pstmt.setString(2, dept.getDept_name());
		pstmt.setString(3,dept.getDept_type());
		pstmt.setString(4,dept.getDept_phone());
		pstmt.setString(5,dept.getDept_fax());
		pstmt.setString(6,dept.getDescribe());
		pstmt.setString(7,dept.getRankdept());
		pstmt.setString(8,dept.getsTart_date());

		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}

	
	public void updateDept(Dept dept) {    //修改部门
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="update dept set dept_name=?,dept_type=?,dept_phone=?,dept_fax=?,describe=?,rankdept=?,start_date=? where dept_no=?";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, dept.getDept_name());
		pstmt.setString(2,dept.getDept_type());
		pstmt.setString(3,dept.getDept_phone());
		pstmt.setString(4,dept.getDept_fax());
		pstmt.setString(5,dept.getDescribe());
		pstmt.setString(6,dept.getRankdept());
		pstmt.setString(7, dept.getsTart_date());
		pstmt.setString(8, dept.getDept_no());
        System.out.println("12456789");
		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}


	public void deleteDept(String dept_no) {     //删除部门,ok
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		String sql="delete from dept where dept_no=?";
		try {
			conn=DbUtils.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dept_no);
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
