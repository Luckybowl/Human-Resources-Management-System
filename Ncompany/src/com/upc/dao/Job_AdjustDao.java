package com.upc.dao;

import java.util.List;

public interface Job_AdjustDao {
	void insertJob_Adjust(Job_Adjust job_adjust);
	List<Job_Adjust> job(String[] str);
	void  updateJob_Adjust(Job_Adjust job_adjust);

}
