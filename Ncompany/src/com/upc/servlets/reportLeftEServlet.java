package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.upc.dao.LeftE;
import com.upc.service.HireEService;
import com.upc.service.HireEServiceImpl;
import com.upc.service.LeftEService;
import com.upc.service.LeftEServiceImpl;

public class reportLeftEServlet extends HttpServlet {
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
		String l_s=request.getParameter("l_s");
		String l_e=request.getParameter("l_e");
		String Dept_N=request.getParameter("Dept_N");
		System.out.println(Dept_N);
//		Employee employee= new Employee();
		System.out.println("Servlet层判断");  //servlet判
		LeftEService LeftEService=new LeftEServiceImpl();
		List<LeftE> leftE=  LeftEService.getLeftEByDept_noAndDate(Dept_N,l_s,l_e);
		request.setAttribute("leftE", leftE);
		//3.根据结果找到某个视图响应回去
		request.getRequestDispatcher("../ReportManagement/reportLeftE.jsp").forward(request, response);
		out.flush();
		out.close();
	}
}
