package com.upc.service;

import java.util.List;

import com.upc.dao.Dept_AdjustselectDao;
import com.upc.dao.Dept_AdjustselectDaoImpl;
import com.upc.dao.Job_Adjustselect;
import com.upc.dao.Job_AdjustselectDao;
import com.upc.dao.Job_AdjustselectDaoImpl;


public class JobAdjustserviceImpl implements jobAdjustservice{
	public List<Job_Adjustselect> jobtest(String[] str)
	{
		Job_AdjustselectDao job_adjustselectDao=new Job_AdjustselectDaoImpl();
		return job_adjustselectDao.jobtest(str);
	}
	public Job_Adjustselect getJob_AdjustBy(String job_no,String employee_no)
	{
		Job_AdjustselectDao job_adjustselectDao=new Job_AdjustselectDaoImpl();
		return job_adjustselectDao.getJob_AdjustBy(job_no, employee_no);
	}

}
