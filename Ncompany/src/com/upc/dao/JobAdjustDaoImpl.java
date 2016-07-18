package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class JobAdjustDaoImpl implements Job_AdjustDao{
	public void insertJob_Adjust(Job_Adjust job_adjust)
	{
		Connection conn=null;
		
		PreparedStatement pstmt=null;
	
		
		try {
			conn=DbUtils.getConnection();
			String sql="insert into job_adjust(employee_no,old_job_no,new_job_no,job_adjust_date,job_adjust_reason,job_adjust_type,detail) values(?,?,?,?,?,?,?)";
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setString(1, job_adjust.getEmployee_no());
		   pstmt.setString(3,job_adjust.getNew_job_no());
		   pstmt.setString(2, job_adjust.getOld_job_no());
		   pstmt.setString(4,job_adjust.getJob_adjust_date());
		   pstmt.setString(5, job_adjust.getJob_adjust_reason());
		   pstmt.setString(6,job_adjust.getJob_adjust_type());
		   pstmt.setString(7, job_adjust.getDetail());

		   pstmt.executeUpdate();
		  
		  
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbUtils.closePreparedStatement(pstmt);
            DbUtils.closeConnection();
		}
	}
	
	
	public List<Job_Adjust> job(String[] str)
	{
		Connection conn=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		List<Job_Adjust> jobselects=new ArrayList<Job_Adjust>();
		try{
		conn=DbUtils.getConnection();//连接数据库
		StringBuffer sql=new StringBuffer("select  * from job_adjust where ");//把sql语句定义成StringBuffer类型
		if(str[0]!=""){
			sql.append( " job_adjust_date between ");
			sql.append("'");
			sql.append(str[0]);
			sql.append("'");
			System.out.println(sql);
			//System.out.println(111);
		}//第一个字符串如果不为空，就追加到sql中
		if(str[1]!=""){
			sql.append(" and ");
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
		}//第四个字符串不为空，就追加到sql中*/
		if(str[3]!=""){
			sql.append(" and job_adjust_type=");
			sql.append("'");
			sql.append(str[3]);
			sql.append("'");
			System.out.println(sql);
		}//第四个字符串不为空，就追加到sql中*/
		
			System.out.println(sql.toString());
			pre=conn.prepareStatement(sql.toString());
			rs=pre.executeQuery();//把结果集放到rs中
			
			
			while(rs.next()){
				
				Job_Adjust jobselect=new Job_Adjust();
				
				
				jobselect.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				jobselect.setNew_job_no(rs.getString("NEW_JOB_NO"));
				jobselect.setOld_job_no(rs.getString("OLD_JOB_NO"));
				jobselect.setJob_adjust_date(rs.getString("JOB_ADJUST_DATE"));
				jobselect.setJob_adjust_reason(rs.getString("JOB_ADJUST_REASON"));
				jobselect.setJob_adjust_type(rs.getString("JOB_ADJUST_TYPE"));
				jobselect.setDetail(rs.getString("DETAIL"));
				
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
	
	
	
	public void  updateJob_Adjust(Job_Adjust job_adjust)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			   String sql="update employee set job_no=? where employee_no=?";
			   pstmt=conn.prepareStatement(sql);
			   
			   pstmt.setString(1, job_adjust.getNew_job_no());
		//	  System.out.println(dept_adjust.getNew_dept_no());
			   pstmt.setString(2, job_adjust.getEmployee_no());
		//	   System.out.println(dept_adjust.getEmployee_no());
			   pstmt.executeUpdate();
		   
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbUtils.closePreparedStatement(pstmt);
            DbUtils.closeConnection();
	}
	
	
	}
	}


