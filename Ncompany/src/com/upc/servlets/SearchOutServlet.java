package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Employee;
import com.upc.dao.Out_employee;
import com.upc.dao.Sleft;
import com.upc.service.EmployeeService;
import com.upc.service.EmployeeServiceImpl;
import com.upc.service.Out_employeeService;
import com.upc.service.Out_employeeServiceImpl;
import com.upc.service.SleftService;
import com.upc.service.SleftServiceImpl;

public class SearchOutServlet extends HttpServlet {

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

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//1.��������
		String str[]=new String [7];
		str[0]=request.getParameter("employee_no");
		str[1]=request.getParameter("employee_name");
		str[2]=request.getParameter("dept_name");
		str[3]=request.getParameter("job_name");
		str[4]=request.getParameter("out_type");
		if("resign".equals(str[4])){
			str[4]="������ְ";
		}
		if("refuse".equals(str[4])){
			str[4]="����";
		}
		if("retire".equals(str[4])){
			str[4]="����";
		}
		if("expel".equals(str[4])){
			str[4]="����";
		}  
		str[5]=request.getParameter("workdate");
		str[6]=request.getParameter("out_time");
		//2.���������ҵ�ĳ��ҵ���߼����д���
		out.println("123");
		SleftService sleftService=new SleftServiceImpl();
		List<Sleft> slefts=sleftService.showAll(str);
		request.setAttribute("slefts", slefts);
		//3.ת��
		request.getRequestDispatcher("../Employee/sleftE.jsp").forward(request, response);
		out.flush();
		out.close();
	}
	
}
