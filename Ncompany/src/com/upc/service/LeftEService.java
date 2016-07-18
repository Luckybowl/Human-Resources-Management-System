package com.upc.service;

import java.util.List;


import com.upc.dao.HireE;
import com.upc.dao.LeftE;


public interface LeftEService {
	List<LeftE> getAllDepts();
	//	List<Employee> getAllEmployees();
	//	Employee getEmployeetByDept_noAndDate(String deptno,String date1,String date2);
	public List<LeftE> getLeftEByDept_noAndDate(String Dept_no, String Date1,
			String Date2);
	
}
