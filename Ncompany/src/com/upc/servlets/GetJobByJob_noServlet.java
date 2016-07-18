package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.upc.dao.Job;
import com.upc.service.JobService;
import com.upc.service.JobServiceImpl;

public class GetJobByJob_noServlet extends HttpServlet {
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
		job_no= new String(job_no.getBytes("iso-8859-1"),"utf-8");
		String job_name=request.getParameter("job_name");
		job_name= new String(job_name.getBytes("iso-8859-1"),"utf-8");
		String job_type=request.getParameter("job_type");
		job_type= new String(job_type.getBytes("iso-8859-1"),"utf-8");
        if (job_no=="")
        	job_no=null;
        if (job_name=="")
        	job_name=null;
		System.out.println(job_no);
		System.out.println(job_name);
		System.out.println(job_type);
		//2.
		JobService jobService=new JobServiceImpl();
		List<Job> jobs =jobService.getJobBy(job_no, job_name, job_type);
		request.setAttribute("job", jobs);
		System.out.println("12321");
		//3.
		request.getRequestDispatcher("../job/updatejob.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
