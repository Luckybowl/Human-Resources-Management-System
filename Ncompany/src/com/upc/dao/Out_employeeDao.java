package com.upc.dao;
import java.util.List;

public interface Out_employeeDao {
List<Out_employee> getAllOut_employees();
Out_employee getOut_employeeByEmployee_no(String employee_no);
void  updateOut_employee(Out_employee out_employee);
void  insertOut_employee(Out_employee out_employee);
void  deleteOut_employee(String employee_no);



}