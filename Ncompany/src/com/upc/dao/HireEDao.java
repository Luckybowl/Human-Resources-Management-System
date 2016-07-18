package com.upc.dao;

import java.util.List;

public interface HireEDao {
	List<HireE> getAllDepts();
	List<HireE> getHireEByDept_noAndDate(String Dept_no,String Date1,String Date2);

}
