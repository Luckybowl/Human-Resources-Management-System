package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.upc.dao.Dept;
import com.upc.service.DeptService;
import com.upc.service.DeptServiceImpl;
public class UpdateDeptServlet extends HttpServlet {


	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		System.out.println("����");
		//1.��������
		String dept_no=request.getParameter("dept_no");
		String dept_name=request.getParameter("dept_name");
		String dept_type=request.getParameter("dept_type");
		String dept_phone=request.getParameter("dept_phone");
		String dept_fax=request.getParameter("dept_fax");
		String describe=request.getParameter("describe");
		String rankdept=request.getParameter("rankdept");
		String start_date= request.getParameter("start_date");
		Dept dept= new Dept();
		dept.setDept_no(dept_no);
		dept.setDept_name(dept_name);
		dept.setDept_type(dept_type);
		dept.setDept_phone(dept_phone);
		dept.setDept_fax(dept_fax);
		dept.setDescribe(describe);
		dept.setRankdept(rankdept);
		dept.setsTart_date(start_date);
		
		//2.���������ҵ�ĳ��ҵ���߼�����
		DeptService deptService=new DeptServiceImpl();
		deptService.updateDept(dept);
		
		//3.���ݽ���ҵ�ĳ����ͼ��Ӧ��ȥ
		request.getRequestDispatcher("QueryAllDeptsServlet").forward(request, response);
		out.flush();
		out.close();
	}
	
}
