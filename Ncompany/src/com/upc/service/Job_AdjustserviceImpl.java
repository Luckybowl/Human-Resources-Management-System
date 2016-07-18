package com.upc.service;

import java.util.List;

import com.upc.dao.Dept_AdjustDao;
import com.upc.dao.Dept_AdjustDaoImpl;
import com.upc.dao.JobAdjustDaoImpl;
import com.upc.dao.Job_Adjust;
import com.upc.dao.Job_AdjustDao;



public class Job_AdjustserviceImpl implements Job_Adjustservice{
	public void insertJob_Adjust(Job_Adjust job_adjust)
	{
		Job_AdjustDao job_adjustDao=new JobAdjustDaoImpl();
		job_adjustDao.insertJob_Adjust(job_adjust);
	}
	public List<Job_Adjust> job(String[] str)
	{
		Job_AdjustDao job_adjustDao=new JobAdjustDaoImpl();
		return job_adjustDao.job
				(str);
	}
	public void  updateJob_Adjust(Job_Adjust job_adjust)
	{
		Job_AdjustDao job_adjustDao=new JobAdjustDaoImpl();
		job_adjustDao.updateJob_Adjust(job_adjust);
	}
	
	

}
