package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;



public class JobDaoImpl implements JobDao {


	public List<Job> getAllJobs() {          
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Job>jobs=new ArrayList<Job>();
		try{
		conn=DbUtils.getConnection();
			String sql = "select * from job";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// 执行sql语句，然后将数据库结果存放在rs对象
			while (rs.next()) {
				Job job=new Job();
				job.setJob_no(rs.getString("JOB_NO"));
				job.setJob_name(rs.getString("JOB_NAME"));
				job.setJob_type(rs.getString("JOB_TYPE"));
				job.setJob_limit(rs.getString("JOB_LIMIT"));
				
		        jobs.add(job);
				
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DbUtils.closeResultSet(rs);
			DbUtils.closePreparedStatement(pstmt);
			DbUtils.closeConnection();
		}
		return jobs;
	}

	public List<Job> getJobBy(String job_no,String job_name,String job_type)
	{
	

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<Job> jobs=new ArrayList<Job>();
		if(job_no!=null&&job_name!=null){
			try {
			conn=DbUtils.getConnection();
		    String sql="select  * from job where job_no=? and job_name=? and job_type= ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, job_no);
			pstmt.setString(2, job_name);
			pstmt.setString(3, job_type);
			rs=pstmt.executeQuery();
			while (rs.next())
			{
				Job job=new Job();
				job.setJob_no(rs.getString("job_no"));
				job.setJob_name(rs.getString("job_name"));
				job.setJob_type(rs.getString("job_type"));
				job.setJob_limit(rs.getString("job_limit"));
				
				
				jobs.add(job);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(job_no!=null&&job_name==null){
			try {
			conn=DbUtils.getConnection();
		    String sql="select  * from job where job_no=?  and job_type= ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, job_no);
			pstmt.setString(2, job_type);
			rs=pstmt.executeQuery();
			while (rs.next())
			{
				Job job=new Job();
				job.setJob_no(rs.getString("job_no"));
				job.setJob_name(rs.getString("job_name"));
				job.setJob_type(rs.getString("job_type"));
				job.setJob_limit(rs.getString("job_limit"));
				jobs.add(job);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(job_no==null&&job_name!=null){
			try {
			conn=DbUtils.getConnection();
		    String sql="select  * from job where  job_name=?  and job_type= ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, job_name);
			pstmt.setString(2, job_type);
			rs=pstmt.executeQuery();
			while (rs.next())
			{Job job=new Job();
			job.setJob_no(rs.getString("job_no"));
			job.setJob_name(rs.getString("job_name"));
			job.setJob_type(rs.getString("job_type"));
			job.setJob_limit(rs.getString("job_limit"));
			jobs.add(job);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			try {
			conn=DbUtils.getConnection();
		    String sql="select  * from job where job_type=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, job_type);
			rs=pstmt.executeQuery();
			while (rs.next())
			{Job job=new Job();
			job.setJob_no(rs.getString("job_no"));
			job.setJob_name(rs.getString("job_name"));
			job.setJob_type(rs.getString("job_type"));
			job.setJob_limit(rs.getString("job_limit"));
			jobs.add(job);
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
		return jobs;
		
		
	}
	
	public Job getJobByJob_no(String job_no) {   //查询部门
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Job job=new Job();
		conn=DbUtils.getConnection();
		String sql="select  * from job where job_no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,job_no);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				job.setJob_no(job_no);
				job.setJob_name(rs.getString("JOB_NAME"));
				job.setJob_type(rs.getString("JOB_TYPE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return job;
	}

	
	public void insertJob(Job job) {    //新建部门 ok
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="insert into job(job_no,job_name,job_type,job_limit) values(?,?,?,?)";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, job.getJob_no());
		pstmt.setString(2, job.getJob_name());
		pstmt.setString(3,job.getJob_type());
		pstmt.setString(4,job.getJob_limit());


		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}

	
	public void updateJob(Job job) {    //修改gangwei
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="update job set job_name=?,job_type=?,job_limit=? where job_no=?";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, job.getJob_name());
		pstmt.setString(2,job.getJob_type());
		pstmt.setString(3,job.getJob_limit());
		pstmt.setString(4,job.getJob_no());


	

		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}


	public void deleteJob(String job_no)  {     //删除部门,ok
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		String sql="delete from job where job_no=?";
		try {
			conn=DbUtils.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, job_no);
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


		

