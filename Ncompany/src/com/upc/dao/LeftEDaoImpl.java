package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class LeftEDaoImpl implements LeftEDao{
	public List<LeftE> getAllDepts() {							//���dept�������ݷ���list<dept>��
		Connection conn = null;										//���ض����ݿ�����ӣ��Ự������������������ִ�� SQL ��䲢���ؽ��
		PreparedStatement pstmt = null;							//��ʾԤ����� SQL ���Ķ���
		ResultSet rs = null;											//��ʾ���ݿ����������ݱ�ͨ��ͨ��ִ�в�ѯ���ݿ��������ɡ� 
		List<LeftE> depts=new ArrayList<LeftE>();			//
		try{
		conn=DbUtils.getConnection();
			String sql = "select * from dept";
			pstmt = conn.prepareStatement(sql);					//����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ�
			rs = pstmt.executeQuery();								// ִ��sql��䣬Ȼ�����ݿ��������rs����
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
				System.out.println("�ж�");
				System.out.println(Dept_no);
				if(!Dept_no.equals("ȫ��"))
				{
				  System.out.println("TRUE");	
				  sql+="  and dept.dept_name='"+Dept_no+"'";
					System.out.println("ȫ���ж�");
					
				}
				
				System.out.println("sql=========="+sql);
		System.out.println(sql);
		try {
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("Dao��");//Dao��
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
