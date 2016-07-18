package com.upc.service;

import java.util.List;

import com.upc.dao.Dept_Adjustselect;

public interface deptAdjustservice {
	List<Dept_Adjustselect> depttest(String[] str);
	Dept_Adjustselect getDept_AdjustBy(String dept_no,String employee_no);
}
