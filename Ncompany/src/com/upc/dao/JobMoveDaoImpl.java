package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class JobMoveDaoImpl implements JobMoveDao{
	public List<JobMove> getJobMoveByDept_no(String Date1, String Date2) {
		System.out.println("Dao²ã");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<JobMove> jobMoves=new ArrayList<JobMove>();
		conn=DbUtils.getConnection();
		String sql="select  distinct DEPT_name,old_job_no,new_job_no,EMPLOYEE_name,EMPLOYEE_SEX,job_adjust_date,job_adjust_reason from employee,job_adjust,dept,job where job_adjust.employee_no=employee.employee_no and employee.dept_no=dept.dept_no   and (job_adjust_date between   '"+Date1+"' and  '"+Date2+"' )";
		try {
			pstmt=conn.prepareStatement(sql);
			System.out.println(sql);
			
			rs=pstmt.executeQuery();
			int i=0;
			System.out.println(i);
			while(rs.next())
			{
				i++;
				System.out.println(i);
				JobMove jobMove=new JobMove();
				jobMove.setJDeptName(rs.getString("DEPT_name"));
				jobMove.setOldJobName(rs.getString("old_job_no"));
				jobMove.setNewJobName(rs.getString("new_job_no"));
				jobMove.setJEmployeeName(rs.getString("EMPLOYEE_name"));
				jobMove.setJEmployeeSex(rs.getString("EMPLOYEE_SEX"));
				jobMove.setJMoveDate(rs.getString("job_adjust_date"));
				jobMove.setJReason(rs.getString("job_adjust_reason"));
				
				jobMoves.add(jobMove);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jobMoves;
	}

}
