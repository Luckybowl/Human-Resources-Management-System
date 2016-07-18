package com.upc.service;
import java.util.List;

import com.upc.dao.Dept;
import com.upc.dao.Job;

public interface JobService {

	List<Job> getAllJobs();
	List<Job> getJobBy(String job_no,String job_name,String job_type);
	Job getJobByJob_no(String job_no);
	void  updateJob(Job job);
	void insertJob(Job job);
	void deleteJob(String job_no);
}
