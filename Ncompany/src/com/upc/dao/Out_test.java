package com.upc.dao;

public class Out_test {
	public static void main(String args[]){
		Out_employeeDao out_employeeDao=new Out_employeeDaoImpl();
		Out_employee out_employee=new Out_employee();
		out_employee.setEmployee_no("3");
		out_employee.setOut_time("2015-08-21");
		out_employee.setOut_type("主动辞职");
		out_employee.setOut_toward("不明");
		out_employee.setDetail("不明");
		
		out_employeeDao.insertOut_employee(out_employee);
	}

}
