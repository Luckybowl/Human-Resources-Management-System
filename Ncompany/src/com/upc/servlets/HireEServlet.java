package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.upc.dao.HireE;
import com.upc.service.HireEService;
import com.upc.service.HireEServiceImpl;

public class HireEServlet extends HttpServlet {

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
		String h_s=request.getParameter("h_s");
		String h_e=request.getParameter("h_e");
		String Dept_N=request.getParameter("Dept_N");
//		Employee employee= new Employee();
		System.out.println(Dept_N);
		HireEService hireEService=new HireEServiceImpl();
		List<HireE> hireE=hireEService.getHireEtByDept_noAndDate(Dept_N,h_s,h_e);
		request.setAttribute("hireE", hireE);
		//3.根据结果找到某个视图响应回去
		request.getRequestDispatcher("../ReportManagement/reportHireE.jsp").forward(request, response);
		out.flush();
		out.close();
		//3.根据结果找到某个视图响应回去
	}

}

