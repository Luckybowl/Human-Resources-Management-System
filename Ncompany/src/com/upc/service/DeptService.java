package com.upc.service;
import java.util.List;

import com.upc.dao.Dept;

public interface DeptService {
	List<Dept> getAllDepts();
	List<Dept> getDeptBy(String dept_no,String dept_name,String dept_type);//≤È—Ø≤ø√≈
	Dept getDeptByDept_no(String dept_no);
	void  updateDept(Dept dept);
	void insertDept(Dept dept);
	void deleteDept(String dept_no);
	
}
