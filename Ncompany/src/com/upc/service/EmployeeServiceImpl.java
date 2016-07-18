package com.upc.service;

import java.util.List;

import com.upc.dao.Employee;
import com.upc.dao.EmployeeDao;
import com.upc.dao.EmployeeDaoImpl;
import com.upc.dao.Out_employee;
import com.upc.dao.Out_employeeDao;
import com.upc.dao.Out_employeeDaoImpl;
import com.upc.utils.DbUtils;

public class EmployeeServiceImpl implements EmployeeService{


	public List<Employee> getEmployeeByDept(String dept_no) {
		EmployeeDao deptDao=new EmployeeDaoImpl();
		return deptDao.getEmployeeByDept(dept_no);
	}
	public List<Employee> getEmployeeByJob(String job_no) {
		EmployeeDao jobDao=new EmployeeDaoImpl();
		return jobDao.getEmployeeByJob(job_no);
	}

	public List<Employee> getAllEmployees() {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		return employeeDao.getAllEmployees();
	}

	
	
	public Employee getEmployeeByEmployee_no(String employee_no) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		return employeeDao.getEmployeeByEmployee_no(employee_no);
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		employeeDao.updateEmployee(employee);
	}

	public void insertEmployee(Employee employee) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		employeeDao.insertEmployee(employee);
		
	}

	public void deleteEmployee(String employee_no) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		employeeDao.deleteEmployee(employee_no);
		
	}
	
	public List<Employee> getAllMz(String[] str) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		return employeeDao.getAllMz(str); //²»Ã÷
	}





	
}
