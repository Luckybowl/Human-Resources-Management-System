package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class DeptMoveDaoImpl implements DeptMoveDao{

	public List<DeptMove> getDeptMoveByDept_no(String Date1, String Date2) {
		System.out.println("Dao²ã");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<DeptMove> deptMoves=new ArrayList<DeptMove>();
		conn=DbUtils.getConnection();
		String sql="select  distinct old_dept_no,new_dept_no,employee_name,EMPLOYEE_sex,dept_adjust_date,dept_adjust_reason from employee,dept_adjust,dept where dept_adjust.employee_no=employee.employee_no   and (dept_adjust_date between   '"+Date1+"' and  '"+Date2+"' )";
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
				DeptMove deptMove=new DeptMove();
				deptMove.setOldDeptName(rs.getString("old_dept_no"));
				deptMove.setNewDeptName(rs.getString("new_dept_no"));
				deptMove.setDEmployeeName(rs.getString("employee_name"));
				deptMove.setDEmployeeSex(rs.getString("EMPLOYEE_sex"));
				deptMove.setDMoveDate(rs.getString("dept_adjust_date"));
				deptMove.setDMoveReason(rs.getString("dept_adjust_reason"));
				
				deptMoves.add(deptMove);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deptMoves;
	}

}
