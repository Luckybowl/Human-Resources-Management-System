package com.upc.dao;

public class Out_test {
	public static void main(String args[]){
		Out_employeeDao out_employeeDao=new Out_employeeDaoImpl();
		Out_employee out_employee=new Out_employee();
		out_employee.setEmployee_no("3");
		out_employee.setOut_time("2015-08-21");
		out_employee.setOut_type("������ְ");
		out_employee.setOut_toward("����");
		out_employee.setDetail("����");
		
		out_employeeDao.insertOut_employee(out_employee);
	}

}
