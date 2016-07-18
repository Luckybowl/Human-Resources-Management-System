package com.upc.service;

import java.util.List;

import com.upc.dao.Dept_Adjustselect;
import com.upc.dao.Dept_AdjustselectDao;
import com.upc.dao.Dept_AdjustselectDaoImpl;

public class DeptAdjustserviceImpl implements deptAdjustservice{
	public List<Dept_Adjustselect> depttest(String[] str)
	{
		Dept_AdjustselectDao dept_adjustselectDao=new Dept_AdjustselectDaoImpl();
		return dept_adjustselectDao.depttest(str);
	}
	public Dept_Adjustselect  getDept_AdjustBy(String dept_no,String employee_no)
	{
		Dept_AdjustselectDao dept_adjustselectDao=new Dept_AdjustselectDaoImpl();
		return dept_adjustselectDao.getDept_AdjustBy(dept_no, employee_no);
		
	}
}
 