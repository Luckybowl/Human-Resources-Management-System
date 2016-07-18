package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Dept_Adjustselect;
import com.upc.service.DeptAdjustserviceImpl;
import com.upc.service.deptAdjustservice;



public class deptadjustselectServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
	
		PrintWriter out = response.getWriter();
       
		//1.��������
		String str[]=new String [4];
		str[0]=request.getParameter("dept_no");
		str[1]=request.getParameter("dept_name");
		str[2]=request.getParameter("employee_no");
		str[3]=request.getParameter("employee_name");
		
		
		//2.���������ҵ�ĳ��ҵ���߼����д���
		deptAdjustservice deptadjustService=new DeptAdjustserviceImpl();
		List<Dept_Adjustselect> depts=deptadjustService.depttest(str);
		request.setAttribute("depts", depts);
		//3.ת��
		
		request.getRequestDispatcher("../DeptmentSystem/deptmove.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
