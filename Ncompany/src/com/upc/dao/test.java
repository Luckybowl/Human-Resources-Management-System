package com.upc.dao;

public class test {
	public static void main(String args[]){
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		Employee employee=new Employee();
		employee.setEmployee_no("1");
		employee.setEmployee_name("ÇÙ×Ü");
		
		employeeDao.insertEmployee(employee);
	}

}
