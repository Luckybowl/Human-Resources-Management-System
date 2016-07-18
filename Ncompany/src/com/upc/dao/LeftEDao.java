package com.upc.dao;

import java.util.List;

public interface LeftEDao {
	List<LeftE> getAllDepts();
	List<LeftE> getLeftEByDept_noAndDate(String Dept_no,String Date1,String Date2);

}
