package com.upc.dao;
import java.util.List;
public interface DeptDao {
	List<Dept> getAllDepts();//显示部门所有的信息
	Dept getDeptByDept_no(String dept_no);//查询部门
	List<Dept> getDeptBy(String dept_no,String dept_name,String dept_type);//查询部门
	void  updateDept(Dept dept);//修改部门
	void insertDept(Dept dept);//添加部门
	void deleteDept(String dept_no);//删除部门
}
