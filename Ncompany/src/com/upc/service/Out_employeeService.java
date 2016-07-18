package com.upc.service;

import java.util.List;

import com.upc.dao.Out_employee;

public interface Out_employeeService {
	List<Out_employee> getAllOut_employees();
	Out_employee getOut_employeeByEmployee_no(String employee_no);
	void  updateOut_employee(Out_employee out_employee);
	void insertOut_employee(Out_employee out_employee);
	void deleteOut_employee(String employee_no);
	
	
	
}