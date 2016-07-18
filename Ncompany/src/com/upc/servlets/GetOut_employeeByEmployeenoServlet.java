package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.upc.dao.Out_employee;


import com.upc.service.Out_employeeService;
import com.upc.service.Out_employeeServiceImpl;

public class GetOut_employeeByEmployeenoServlet extends HttpServlet {

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
			//1.
			String employee_no=request.getParameter("employee_no");
			
			//2.
			Out_employeeService out_employeeService=new Out_employeeServiceImpl();
			Out_employee out_employee=out_employeeService.getOut_employeeByEmployee_no(employee_no);
			request.setAttribute("out_employee",out_employee);
			
			//3.
			request.getRequestDispatcher("../out_employee/updateout_employee.jsp").forward(request, response);
			out.flush();
			out.close();
		}

	}
