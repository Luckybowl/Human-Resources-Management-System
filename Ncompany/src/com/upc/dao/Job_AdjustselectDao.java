package com.upc.dao;

import java.util.List;

public interface Job_AdjustselectDao {
	List<Job_Adjustselect> jobtest(String[] str);
	//void  updateDept_Adjust(Dept_Adjust dept_adjust);
	Job_Adjustselect getJob_AdjustBy(String job_no,String employee_no);

}
