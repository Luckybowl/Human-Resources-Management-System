package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Employee;
import com.upc.service.EmployeeService;
import com.upc.service.EmployeeServiceImpl;

public class GetEmployeeByJob extends HttpServlet {

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

		response.setContentType("text/jsp;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//1.
		String job_no=request.getParameter("job_no");
		job_no = new String(job_no.getBytes("iso-8859-1"),"utf-8");
		//2.
		EmployeeService jobss=new EmployeeServiceImpl();
		List<Employee> jobs =jobss.getEmployeeByJob(job_no);
		request.setAttribute("employee", jobs);
		
		//3.
		request.getRequestDispatcher("../job/empl.jsp").forward(request, response);
		out.flush();
		out.close();
	}



}
