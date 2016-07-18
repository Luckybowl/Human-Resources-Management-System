package com.upc.service;

import java.util.List;








import com.upc.dao.HireE;
import com.upc.dao.HireEDao;
import com.upc.dao.HireEDaoImpl;
import com.upc.dao.LeftE;
import com.upc.dao.LeftEDao;
import com.upc.dao.LeftEDaoImpl;


public class LeftEServiceImpl implements LeftEService {
	public List<LeftE> getAllDepts() {
		LeftEDao deptDao=new LeftEDaoImpl();
		return deptDao.getAllDepts();
	}

	@Override
	public List<LeftE> getLeftEByDept_noAndDate(String Dept_no, String Date1,
			String Date2){
		LeftEDao leftEDao=new LeftEDaoImpl();
		System.out.println("业务逻辑");//业务逻辑判断
		return (List<LeftE>) leftEDao.getLeftEByDept_noAndDate(Dept_no,Date1,Date2);
	}

}
