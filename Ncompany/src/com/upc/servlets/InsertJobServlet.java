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




public class InsertJobServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/jsp;charset=utf-8");
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
		System.out.println(job_no);
		//2.根据请求找到某个业务逻辑处理
		JobService jobService=new JobServiceImpl();
		
		jobService.insertJob(job);
		
		//3.根据结果找到某个视图响应回去
		request.getRequestDispatcher("../DeptmentSystem/jobmove.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
