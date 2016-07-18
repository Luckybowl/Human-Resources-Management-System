package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

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

public class InsertOut_employeeServlet extends HttpServlet {

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
		String employee_no=request.getParameter("employee_no");
		String out_time=request.getParameter("out_time");
		String out_type=request.getParameter("out_type");
		String out_toward=request.getParameter("out_toward");
		String detail=request.getParameter("detail");
		
		
		Out_employee out_employee= new Out_employee();
		out_employee.setEmployee_no(employee_no);
		out_employee.setOut_time(out_time);
		out_employee.setOut_type(out_type);
		out_employee.setOut_toward(out_toward);
		out_employee.setDetail(detail);
		
		Employee employee=new Employee();
		employee.setEmployee_no(employee_no);
		
		
		//2.根据请求找到某个业务逻辑处理
		Out_employeeService out_employeeService=new Out_employeeServiceImpl();
		out_employeeService.insertOut_employee(out_employee);
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		employeeService.deleteEmployee(employee_no);
		//3.根据结果找到某个视图响应回去
		request.getRequestDispatcher("QueryAllOut_employeesServlet").forward(request, response);
		out.flush();
		out.close();
	}

}
