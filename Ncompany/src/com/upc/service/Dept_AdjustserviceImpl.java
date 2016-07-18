package com.upc.service;

import java.util.List;

import com.upc.dao.Dept_Adjust;
import com.upc.dao.Dept_AdjustDao;
import com.upc.dao.Dept_AdjustDaoImpl;



public class Dept_AdjustserviceImpl implements Dept_Adjustservice{
	public void insertDept_Adjust(Dept_Adjust dept_adjust)
	{
		Dept_AdjustDao dept_adjustDao=new Dept_AdjustDaoImpl();
		dept_adjustDao.insertDept_Adjust(dept_adjust);
	}
    public List<Dept_Adjust> dept(String[] str)
    {
    	Dept_AdjustDao dept_adjustDao=new Dept_AdjustDaoImpl();
		return dept_adjustDao.dept(str);
    }
    public void  updateDept_Adjust(Dept_Adjust dept_adjust)
    {
    	Dept_AdjustDao dept_adjustDao=new Dept_AdjustDaoImpl();
		dept_adjustDao.updateDept_Adjust(dept_adjust);
    }
}
