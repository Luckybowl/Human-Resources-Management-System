package com.upc.dao;
import java.util.List;

public interface EmployeeDao {
	
	
	public List<Employee> getEmployeeByDept(String dept_no); 
	public List<Employee> getEmployeeByJob(String job_no);
	
List<Employee> getAllEmployees();
Employee getEmployeeByEmployee_no(String employee_no);
void  updateEmployee(Employee employee);
void  insertEmployee(Employee employee);
void  deleteEmployee(String employee_no);
List<Employee> getAllMz(String[] str);
}