package com.upc.dao;

import java.util.List;

public interface JobDao {

		List<Job> getAllJobs();  //��ѯ
		List<Job> getJobBy(String job_no,String job_name,String job_type);//��ѯ����
		Job getJobByJob_no(String job_no);//
		void  updateJob(Job job);    //�޸ĸ�λ
	    void insertJob(Job job);     //��Ӹ�λ
		void deleteJob(String job_no);   //ɾ����λ
	}

