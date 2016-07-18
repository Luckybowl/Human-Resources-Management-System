package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.upc.dao.Job;
import com.upc.service.JobService;
import com.upc.service.JobServiceImpl;
public class UpdateJobServlet extends HttpServlet {
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
		String job_no=request.getParameter("job_no");
		String job_name=request.getParameter("job_name");
		String job_type=request.getParameter("job_type");
		String job_limit=request.getParameter("job_limit");
		Job job= new Job();
		job.setJob_no(job_no);
		job.setJob_name(job_name);
		job.setJob_type(job_type);
		job.setJob_limit(job_limit);
		
		//2.根据请求找到某个业务逻辑处理
		JobService jobService=new JobServiceImpl();
		jobService.updateJob(job);
		
		//3.根据结果找到某个视图响应回去
		request.getRequestDispatcher("QueryAllJobsServlet").forward(request, response);
		out.flush();
		out.close();
	}
}
