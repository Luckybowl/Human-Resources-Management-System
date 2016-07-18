package com.upc.dao;

import java.util.List;

public interface Dept_AdjustDao {
	
	void insertDept_Adjust(Dept_Adjust dept_adjust);
	List<Dept_Adjust> dept(String[] str);
	void  updateDept_Adjust(Dept_Adjust dept_adjust);
}
