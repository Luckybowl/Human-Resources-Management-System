package com.upc.dao;

import java.util.List;

public interface JobMoveDao {
	List<JobMove> getJobMoveByDept_no(String Date1,String Date2);
}
