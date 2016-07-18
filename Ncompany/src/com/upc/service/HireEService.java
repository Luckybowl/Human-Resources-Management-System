package com.upc.service;

import java.util.List;


import com.upc.dao.HireE;


public interface HireEService {
	List<HireE> getAllDepts();
	List<HireE> getHireEtByDept_noAndDate(String deptno,String date1,String date2);
}
