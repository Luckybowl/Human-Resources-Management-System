package com.upc.dao;

import java.util.List;

public interface Dept_AdjustselectDao {
	List<Dept_Adjustselect> depttest(String[] str);
	//void  updateDept_Adjust(Dept_Adjust dept_adjust);
	Dept_Adjustselect getDept_AdjustBy(String dept_no,String employee_no);
}
