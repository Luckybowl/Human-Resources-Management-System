package com.upc.service;
import java.util.List;

import com.upc.dao.Dept;
import com.upc.dao.DeptDao;
import com.upc.dao.DeptDaoImpl;
import com.upc.utils.DbUtils;
public class DeptServiceImpl implements DeptService {

	public void deleteDept(String dept_no) {   //ɾ������
		// TODO Auto-generated method stub
		DeptDao deptDao=new DeptDaoImpl();
		deptDao.deleteDept(dept_no);
	}
	
	public List<Dept> getAllDepts() {    //��ѯ������Ա��
		DeptDao deptDao=new DeptDaoImpl();
		return deptDao.getAllDepts();
	}
	public List<Dept> getDeptBy(String dept_no,String dept_name,String dept_type)
	{
		DeptDao deptDao=new DeptDaoImpl();
		return deptDao.getDeptBy(dept_no,dept_name,dept_type);
	
	}
	public Dept getDeptByDept_no(String dept_no) {   //��ѯ����
		DeptDao deptDao=new DeptDaoImpl();
		return deptDao.getDeptByDept_no(dept_no);
	}

	public void insertDept(Dept dept) {  
		// TODO Auto-generated method stub
		DeptDao deptDao=new DeptDaoImpl();
		deptDao.insertDept(dept);
	}

	public void updateDept(Dept dept) {  //�޸Ĳ���
		// TODO Auto-generated method stub
		DeptDao deptDao=new DeptDaoImpl();
		deptDao.updateDept(dept);
	}

}
