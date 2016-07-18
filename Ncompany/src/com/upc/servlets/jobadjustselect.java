package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Dept_Adjust;
import com.upc.dao.Job_Adjust;
import com.upc.service.Dept_Adjustservice;
import com.upc.service.Dept_AdjustserviceImpl;
import com.upc.service.Job_Adjustservice;
import com.upc.service.Job_AdjustserviceImpl;

public class jobadjustselect extends HttpServlet {

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
		
		
		String str[]=new String [4];
		str[0]=request.getParameter("starttime");
		str[1]=request.getParameter("endtime");
		str[2]=request.getParameter("employee_no");
		str[3]=request.getParameter("job_adjust_type");
		
		
		
		
		//2.根据请求找到某个业务逻辑进行处理
		
		System.out.println("ok");
		Job_Adjustservice jobadjustService=new Job_AdjustserviceImpl();
		List<Job_Adjust> jobs=jobadjustService.job(str);
		
		request.setAttribute("jobs", jobs);
		//3.转发
		request.getRequestDispatcher("../DeptmentSystem/show.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
