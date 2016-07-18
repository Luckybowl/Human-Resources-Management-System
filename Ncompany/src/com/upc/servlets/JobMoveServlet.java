package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.upc.dao.JobMove;
import com.upc.service.JobMoveService;
import com.upc.service.JobMoveServiceImpl;

public class JobMoveServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);

	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//1.接受请求
		System.out.println("Srervlet判断");//Srervlet判断
		String j_s=request.getParameter("j_s");
		String j_e=request.getParameter("j_e");
//		Employee employee= new Employee();
		System.out.println(j_s);
		JobMoveService jobMoveService=new JobMoveServiceImpl();
		List<JobMove> jobMove=jobMoveService.getJobMoveByDept_no(j_s,j_e);
		request.setAttribute("jobMove", jobMove);
		//3.根据结果找到某个视图响应回去
		request.getRequestDispatcher("../ReportManagement/reportJobMove.jsp").forward(request, response);
		out.flush();
		out.close();
		//3.根据结果找到某个视图响应回去
	}

}
