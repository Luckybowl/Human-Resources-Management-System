package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class Dept_AdjustselectDaoImpl implements Dept_AdjustselectDao{
	public List<Dept_Adjustselect> depttest(String[] str)
	{
		Connection conn=null;
		PreparedStatement pre=null; 
		ResultSet rs=null;
		List<Dept_Adjustselect> deptselects=new ArrayList<Dept_Adjustselect>();
		try{
		conn=DbUtils.getConnection();//�������ݿ�
		StringBuffer sql=new StringBuffer("select  employee_no ,employee_name,employee_sex,job_no,dept.dept_no,dept_name,dept_type from employee,dept where employee.dept_no=dept.dept_no ");//��sql��䶨���StringBuffer����
		if(str[0]!=""){
			sql.append( " and dept.dept_no=");
			sql.append("'");
			sql.append(str[0]);
			sql.append("'");
			System.out.println(sql);
			//System.out.println(111);
		}//��һ���ַ��������Ϊ�գ���׷�ӵ�sql��
		if(str[1]!=""){
			sql.append("  and dept_name=");
			sql.append("'");
			sql.append(str[1]);
			sql.append("'");
			System.out.println(sql);
			//System.out.println(111);
		}//�ڶ����ַ�����Ϊ�գ���׷�ӵ�sql��
		if(str[2]!=""){
			sql.append(" and employee_no=");
			sql.append("'");
			sql.append(str[2]);
			sql.append("'");
			System.out.println(sql);
		}//�������ַ�����Ϊ�գ���׷�ӵ�sql��*/
		if(str[3]!=""){
			sql.append(" and employee_name=");
			sql.append("'");
			sql.append(str[3]);
			sql.append("'");
			System.out.println(sql);
		}//���ĸ��ַ�����Ϊ�գ���׷�ӵ�sql��*/
	
		
			System.out.println(sql.toString());
			pre=conn.prepareStatement(sql.toString());
			rs=pre.executeQuery();//�ѽ�����ŵ�rs��
			
			
			while(rs.next()){
				
				Dept_Adjustselect deptselect=new Dept_Adjustselect();
				
				
				deptselect.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				deptselect.setEmployee_name(rs.getString("EMPLOYEE_NAME"));
				deptselect.setDept_type(rs.getString("DEPT_TYPE"));
				deptselect.setEmployee_sex(rs.getString("EMPLOYEE_SEX"));
				deptselect.setDept_no(rs.getString("DEPT_NO"));
				deptselect.setDept_name(rs.getString("DEPT_NAME"));
				deptselect.setJob_no(rs.getString("JOB_NO"));
				
				deptselects.add(deptselect);//��һ�е�ֵ�ŵ�depts��
			}//�Ѳ�ѯ���ȡ�����ŵ�depts��
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DbUtils.closeResultSet(rs);
			DbUtils.closePreparedStatement(pre);
			DbUtils.closeConnection();
		}
		return deptselects;
			}
	
	public Dept_Adjustselect getDept_AdjustBy(String dept_no,String employee_no)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Dept_Adjustselect dept_just=new Dept_Adjustselect();
		conn=DbUtils.getConnection();
		String sql="select   dept_no,employee_no from employee where employee_no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, employee_no);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				dept_just.setEmployee_no(employee_no);
				dept_just.setDept_no(dept_no);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dept_just;
	}
	
}
