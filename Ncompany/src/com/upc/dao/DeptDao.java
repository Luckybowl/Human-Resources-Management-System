package com.upc.dao;
import java.util.List;
public interface DeptDao {
	List<Dept> getAllDepts();//��ʾ�������е���Ϣ
	Dept getDeptByDept_no(String dept_no);//��ѯ����
	List<Dept> getDeptBy(String dept_no,String dept_name,String dept_type);//��ѯ����
	void  updateDept(Dept dept);//�޸Ĳ���
	void insertDept(Dept dept);//��Ӳ���
	void deleteDept(String dept_no);//ɾ������
}
