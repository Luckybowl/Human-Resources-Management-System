package com.upc.service;

import com.upc.dao.Dept_AdjustselectDao;
import com.upc.dao.Dept_AdjustselectDaoImpl;
import com.upc.dao.login;
import com.upc.dao.loginDao;
import com.upc.dao.loginDaoImpl;

public class loginserviceImpl implements loginservice{
	public void insertlogin(login lgin)
	{
		loginDao logindao=new loginDaoImpl();
		logindao.insertlogin(lgin);
	}
	public String getloginByid(String id)
	{
		loginDao logindao=new loginDaoImpl();
		return logindao.getloginByid(id);
	}

}
