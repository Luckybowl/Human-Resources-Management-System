package com.upc.service;

import java.util.List;

import com.upc.dao.DeptMove;


public interface DeptMoveService {
	List<DeptMove> getDeptMoveByDept_no(String date1,String date2);

}
