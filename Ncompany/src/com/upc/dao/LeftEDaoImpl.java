package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class LeftEDaoImpl implements LeftEDao{
	public List<LeftE> getAllDepts() {							//获得dept表格的数据放在list<dept>中
		Connection conn = null;										//与特定数据库的连接（会话）。在连接上下文中执行 SQL 语句并返回结果
		PreparedStatement pstmt = null;							//表示预编译的 SQL 语句的对象
		ResultSet rs = null;											//表示数据库结果集的数据表，通常通过执行查询数据库的语句生成。 
		List<LeftE> depts=new ArrayList<LeftE>();			//
		try{
		conn=DbUtils.getConnection();
			String sql = "select * from dept";
			pstmt = conn.prepareStatement(sql);					//创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库
			rs = pstmt.executeQuery();								// 执行sql语句，然后将数据库结果存放在rs对象
			while (rs.next()) {
				LeftE dept=new LeftE();
			
				dept.setLDeptName(rs.getString("DEPT_name"));

				depts.add(dept);
			}
			System.out.println("");
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
	public List<LeftE> getLeftEByDept_noAndDate(String Dept_no, String Date1,
			String Date2) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<LeftE> leftEs=new ArrayList<LeftE>();
		conn=DbUtils.getConnection();
		String sql="select  * from employee,out_employee,dept,job where 1=1 ";
		//out_time between   '"+Date1+"' and  '"+Date2+"'
				if(Date1.length()!=0 &&Date2.length()!=0)
				{
					sql+=" and employee.employee_no=out_employee.employee_no and employee.dept_no=dept.dept_no and employee.job_no=job.job_no and  (out_time between   '"+Date1+"' and  '"+Date2+"')";
					
				}
				System.out.println("判断");
				System.out.println(Dept_no);
				if(!Dept_no.equals("全部"))
				{
				  System.out.println("TRUE");	
				  sql+="  and dept.dept_name='"+Dept_no+"'";
					System.out.println("全部判断");
					
				}
				
				System.out.println("sql=========="+sql);
		System.out.println(sql);
		try {
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("Dao层");//Dao层
			while(rs.next())
			{
				LeftE leftE=new LeftE();
				leftE.setLDeptName(rs.getString("dept_name"));
				leftE.setLJobName(rs.getString("job_name"));
				leftE.setLEmployeeName(rs.getString("EMPLOYEE_name"));
				leftE.setLEmployeeSex(rs.getString("Employee_Sex"));
				leftE.setLOutDate(rs.getString("OUT_time"));	
				leftE.setLReason(rs.getString("detail"));
				leftEs.add(leftE);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return leftEs;
	}
}
