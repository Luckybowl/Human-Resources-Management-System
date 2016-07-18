package com.upc.service;

import java.util.List;

import com.upc.dao.JobMove;

public interface JobMoveService {
	List<JobMove> getJobMoveByDept_no(String date1,String date2);

}
