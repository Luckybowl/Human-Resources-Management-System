package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class Job_AdjustselectDaoImpl implements Job_AdjustselectDao{
	public List<Job_Adjustselect> jobtest(String[] str)
	{
		Connection conn=null;
		PreparedStatement pre=null; 
		ResultSet rs=null;
		List<Job_Adjustselect> jobselects=new ArrayList<Job_Adjustselect>();
		try{
		conn=DbUtils.getConnection();//连接数据库
		StringBuffer sql=new StringBuffer("select  employee_no ,employee_name,employee_sex,dept_no,job.job_no,job_name,job_type from employee,job where employee.job_no=job.job_no ");//把sql语句定义成StringBuffer类型
		if(str[0]!=""){
			sql.append( " and job.job_no=");
			sql.append("'");
			sql.append(str[0]);
			sql.append("'");
			System.out.println(sql);
			//System.out.println(111);
		}//第一个字符串如果不为空，就追加到sql中
		if(str[1]!=""){
			sql.append("  and job_name=");
			sql.append("'");
			sql.append(str[1]);
			sql.append("'");
			System.out.println(sql);
			//System.out.println(111);
		}//第二个字符串不为空，就追加到sql中
		if(str[2]!=""){
			sql.append(" and employee_no=");
			sql.append("'");
			sql.append(str[2]);
			sql.append("'");
			System.out.println(sql);
		}//第三个字符串不为空，就追加到sql中*/
		if(str[3]!=""){
			sql.append(" and employee_name=");
			sql.append("'");
			sql.append(str[3]);
			sql.append("'");
			System.out.println(sql);
		}//第四个字符串不为空，就追加到sql中*/
	
		
			System.out.println(sql.toString());
			pre=conn.prepareStatement(sql.toString());
			rs=pre.executeQuery();//把结果集放到rs中
			
			
			while(rs.next()){
				
				Job_Adjustselect jobselect=new Job_Adjustselect();
				
				
				jobselect.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				jobselect.setEmployee_name(rs.getString("EMPLOYEE_NAME"));
				jobselect.setJob_type(rs.getString("JOB_TYPE"));
				jobselect.setEmployee_sex(rs.getString("EMPLOYEE_SEX"));
				jobselect.setJob_no(rs.getString("JOB_NO"));
				jobselect.setJob_name(rs.getString("JOB_NAME"));
				jobselect.setDept_no(rs.getString("DEPT_NO"));
				
				jobselects.add(jobselect);//把一行的值放到depts中
			}//把查询结果取出来放到depts中
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DbUtils.closeResultSet(rs);
			DbUtils.closePreparedStatement(pre);
			DbUtils.closeConnection();
		}
		return jobselects;
	}
	//void  updateDept_Adjust(Dept_Adjust dept_adjust);
	public Job_Adjustselect getJob_AdjustBy(String job_no,String employee_no)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Job_Adjustselect job_just=new Job_Adjustselect();
		conn=DbUtils.getConnection();
		String sql="select   job_no,employee_no from employee where employee_no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, employee_no);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				job_just.setEmployee_no(employee_no);
				job_just.setJob_no(job_no);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return job_just;
	}

}
