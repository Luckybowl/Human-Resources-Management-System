package com.upc.service;

import java.util.List;

import com.upc.dao.Employee;
import com.upc.dao.Out_employee;

public interface EmployeeService {
	List<Employee> getEmployeeByDept(String dept_no);
	List<Employee> getEmployeeByJob(String job_no);
	
	List<Employee> getAllEmployees();
	Employee getEmployeeByEmployee_no(String employee_no);
	void  updateEmployee(Employee employee);
	void insertEmployee(Employee employee);
	void deleteEmployee(String employee_no);
	List<Employee> getAllMz(String[] str);
}