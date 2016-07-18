package com.upc.dao;

import java.util.List;

public interface JobDao {

		List<Job> getAllJobs();  //查询
		List<Job> getJobBy(String job_no,String job_name,String job_type);//查询部门
		Job getJobByJob_no(String job_no);//
		void  updateJob(Job job);    //修改岗位
	    void insertJob(Job job);     //添加岗位
		void deleteJob(String job_no);   //删除岗位
	}

