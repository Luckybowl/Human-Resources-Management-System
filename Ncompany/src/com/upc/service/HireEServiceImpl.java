package com.upc.service;




import java.util.List;

import com.upc.dao.HireEDao;
import com.upc.dao.HireEDaoImpl;
import com.upc.dao.HireE;

public class HireEServiceImpl implements HireEService {

	public List<HireE> getAllDepts() {
		HireEDao deptDao=new HireEDaoImpl();
		return deptDao.getAllDepts();
	}
	public List<HireE> getHireEtByDept_noAndDate(String dept_no,String date1,String date2) 
	{
		HireEDao hireEDao=new HireEDaoImpl();
		System.out.println("业务逻辑");//业务逻辑判断
		return hireEDao.getHireEByDept_noAndDate(dept_no,date1,date2);
	}

	
}
