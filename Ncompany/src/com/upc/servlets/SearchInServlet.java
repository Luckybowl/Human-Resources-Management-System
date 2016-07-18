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
import com.upc.service.EmployeeService;
import com.upc.service.EmployeeServiceImpl;
import com.upc.service.Out_employeeService;
import com.upc.service.Out_employeeServiceImpl;

public class SearchInServlet extends HttpServlet {

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
		//1.接受请求
		String str[]=new String [4];
		str[0]=request.getParameter("dept_no");
		str[1]=request.getParameter("dept_name");
		str[2]=request.getParameter("employee_no");
		str[3]=request.getParameter("employee_name");
		//导包！
		//2.根据请求找到某个业务逻辑进行处理
		out.println("123");
		EmployeeService employeeService=new EmployeeServiceImpl();
		List<Employee> employees=employeeService.getAllMz(str);
		request.setAttribute("employees", employees);
		//3.转发
		request.getRequestDispatcher("../Employee/sfireE.jsp").forward(request, response);
		out.flush();
		out.close();
	}
	
}
