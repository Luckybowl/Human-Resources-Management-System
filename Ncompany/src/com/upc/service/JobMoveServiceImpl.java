package com.upc.service;

import java.util.List;


import com.upc.dao.JobMove;
import com.upc.dao.JobMoveDao;
import com.upc.dao.JobMoveDaoImpl;

public class JobMoveServiceImpl implements JobMoveService{

	public List<JobMove> getJobMoveByDept_no(String date1, String date2) {
		JobMoveDao jobMoveDao=new JobMoveDaoImpl();
		System.out.println("业务逻辑");//业务逻辑判断
		return jobMoveDao.getJobMoveByDept_no(date1,date2);
	}
	

}
