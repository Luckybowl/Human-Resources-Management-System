package com.upc.service;

import java.util.List;


import com.upc.dao.Job_Adjust;

public interface Job_Adjustservice {
	void insertJob_Adjust(Job_Adjust job_adjust);
	List<Job_Adjust> job(String[] str);
	void  updateJob_Adjust(Job_Adjust job_adjust);

}
