package com.upc.service;



import java.util.List;

import com.upc.dao.Sleft;
import com.upc.dao.SleftDao;
import com.upc.dao.SleftDaoImpl;
import com.upc.utils.DbUtils;


public class SleftServiceImpl implements SleftService{
	public List<Sleft> showAll(String[] str) {
		SleftDao sleftDao=new SleftDaoImpl();
		return sleftDao.showAll(str); //²»Ã÷

}
}
