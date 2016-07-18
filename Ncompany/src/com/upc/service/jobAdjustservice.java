package com.upc.service;

import java.util.List;

import com.upc.dao.Job_Adjustselect;

public interface jobAdjustservice {
	List<Job_Adjustselect> jobtest(String[] str);
	//void  updateDept_Adjust(Dept_Adjust dept_adjust);
	Job_Adjustselect getJob_AdjustBy(String job_no,String employee_no);

}
