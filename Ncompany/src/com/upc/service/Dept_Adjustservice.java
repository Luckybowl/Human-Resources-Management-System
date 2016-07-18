package com.upc.service;

import java.util.List;

import com.upc.dao.Dept_Adjust;



public interface Dept_Adjustservice {
	void insertDept_Adjust(Dept_Adjust dept_adjust);
	List<Dept_Adjust> dept(String[] str);
	void  updateDept_Adjust(Dept_Adjust dept_adjust);
}
