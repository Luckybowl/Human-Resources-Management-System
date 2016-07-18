package com.upc.servlets;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Dept;
import com.upc.service.DeptService;
import com.upc.service.DeptServiceImpl;

public class GetDeptByServlet extends HttpServlet {

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
		String dept_no=request.getParameter("dept_no");
		String dept_name=request.getParameter("dept_name");
		String dept_type=request.getParameter("dept_type");
        if (dept_no=="")
        	dept_no=null;
        if (dept_name=="")
        	dept_name=null;
		System.out.println(dept_no);
		System.out.println(dept_name);
		System.out.println(dept_type);
		//2.
		DeptService deptService=new DeptServiceImpl();
		List<Dept> depts =deptService.getDeptBy(dept_no, dept_name, dept_type);
		request.setAttribute("dept", depts);
		
		//3.
		request.getRequestDispatcher("../dept/main.jsp").forward(request, response);
		out.flush();
		out.close();
	}


}
