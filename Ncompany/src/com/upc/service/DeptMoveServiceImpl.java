package com.upc.service;

import java.util.List;

import com.upc.dao.DeptMove;
import com.upc.dao.DeptMoveDao;
import com.upc.dao.DeptMoveDaoImpl;
import com.upc.dao.JobMoveDao;
import com.upc.dao.JobMoveDaoImpl;

public class DeptMoveServiceImpl  implements DeptMoveService{
	public List<DeptMove> getDeptMoveByDept_no(String date1, String date2) {
		DeptMoveDao deptMoveDao=new DeptMoveDaoImpl();
		System.out.println("ҵ���߼�");//ҵ���߼��ж�
		return deptMoveDao.getDeptMoveByDept_no(date1,date2);
	}

}
