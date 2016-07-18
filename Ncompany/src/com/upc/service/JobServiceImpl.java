package com.upc.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.dao.Dept;
import com.upc.dao.DeptDao;
import com.upc.dao.DeptDaoImpl;
import com.upc.dao.Job;
import com.upc.dao.JobDao;
import com.upc.dao.JobDaoImpl;
import com.upc.utils.DbUtils;


import com.upc.utils.DbUtils;
public class JobServiceImpl implements JobService{
		public void deleteJob(String job_no) {
			// TODO Auto-generated method stub
			JobDao jobDao=new JobDaoImpl();
			jobDao.deleteJob(job_no);
		}

		public List<Job> getAllJobs() {
			JobDao jobDao=new JobDaoImpl();
			return jobDao.getAllJobs();
		}

		public List<Job> getJobBy(String job_no,String job_name,String job_type)
		{
			JobDao jobDao=new JobDaoImpl();
			return jobDao.getJobBy(job_no,job_name,job_type);
		
		}
		public Job getJobByJob_no(String job_no) {
			JobDao jobDao=new JobDaoImpl();
			return jobDao.getJobByJob_no(job_no);
		}

		public void insertJob(Job job) {
			// TODO Auto-generated method stub
			JobDao jobDao=new JobDaoImpl();
			jobDao.insertJob(job);
		}

		public void updateJob(Job job) {
			// TODO Auto-generated method stub
			JobDao jobDao=new JobDaoImpl();
			jobDao.updateJob(job);
		}


}



