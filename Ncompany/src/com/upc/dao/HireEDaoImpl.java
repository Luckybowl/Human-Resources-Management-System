package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class HireEDaoImpl implements HireEDao{
	public List<HireE> getAllDepts() {							//���dept�������ݷ���list<dept>��
		Connection conn = null;										//���ض����ݿ�����ӣ��Ự������������������ִ�� SQL ��䲢���ؽ��
		PreparedStatement pstmt = null;							//��ʾԤ����� SQL ���Ķ���
		ResultSet rs = null;											//��ʾ���ݿ����������ݱ�ͨ��ͨ��ִ�в�ѯ���ݿ��������ɡ� 
		List<HireE> depts=new ArrayList<HireE>();			//
		try{
		conn=DbUtils.getConnection();
			String sql = "select * from dept";
			pstmt = conn.prepareStatement(sql);					//����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ�
			rs = pstmt.executeQuery();								// ִ��sql��䣬Ȼ�����ݿ��������rs����
			while (rs.next()) {
				HireE dept=new HireE();
			
				dept.setHDeptName(rs.getString("DEPT_name"));
			     System.out.println(dept.getHDeptName());
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
	public List<HireE> getHireEByDept_noAndDate(String Dept_no, String Date1,
			String Date2) {
		System.out.println("Dao��");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<HireE>hireEs=new ArrayList<HireE>();
		conn=DbUtils.getConnection();
		String sql="select  * from employee,dept,job where employee.dept_no=dept.dept_no and employee.job_no=job.job_no  and (workdate between   '"+Date1+"' and  '"+Date2+"' )";
		System.out.println(Dept_no);
		if(!Dept_no.equals("ȫ��"))
		{
		  System.out.println("TRUE");	
		  sql+="  and dept.dept_name='"+Dept_no+"'";
			System.out.println("ȫ���ж�");
			
		}
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
				HireE hireE=new HireE();
				hireE.setHDeptName(rs.getString("DEPT_name"));
				hireE.setHJobName(rs.getString("job_name"));
				hireE.setHEmployeeName(rs.getString("EMPLOYEE_name"));
				hireE.setHEmployeeSex(rs.getString("EMPLOYEE_SEX"));
				hireE.setHWorkDate(rs.getString("WORKDATE"));
				hireE.setHDegree(rs.getString("DEGREE"));
				
				hireEs.add(hireE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hireEs;
		
	}
	

}
