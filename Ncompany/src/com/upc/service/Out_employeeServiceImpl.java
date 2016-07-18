package com.upc.service;



import java.util.List;

import com.upc.dao.Out_employee;
import com.upc.dao.Out_employeeDao;
import com.upc.dao.Out_employeeDaoImpl;
import com.upc.utils.DbUtils;

public class Out_employeeServiceImpl implements Out_employeeService{

	@Override
	public List<Out_employee> getAllOut_employees() {
		Out_employeeDao out_employeeDao=new Out_employeeDaoImpl();
		return out_employeeDao.getAllOut_employees();
	}

	@Override
	public Out_employee getOut_employeeByEmployee_no(String employee_no) {
		Out_employeeDao out_employeeDao=new Out_employeeDaoImpl();
		return out_employeeDao.getOut_employeeByEmployee_no(employee_no);
	}

	@Override
	public void updateOut_employee(Out_employee out_employee) {
		Out_employeeDao out_employeeDao=new Out_employeeDaoImpl();
		out_employeeDao.updateOut_employee(out_employee);
		
	}

	@Override
	public void insertOut_employee(Out_employee out_employee) {
		Out_employeeDao out_employeeDao=new Out_employeeDaoImpl();
		out_employeeDao.insertOut_employee(out_employee);
		
	}

	@Override
	public void deleteOut_employee(String employee_no) {
		Out_employeeDao out_employeeDao=new Out_employeeDaoImpl();
		out_employeeDao.deleteOut_employee(employee_no);
		
	}

	
	
	
	
	
}