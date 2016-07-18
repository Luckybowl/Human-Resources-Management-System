package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.DeptMove;
import com.upc.dao.JobMove;
import com.upc.service.DeptMoveService;
import com.upc.service.DeptMoveServiceImpl;
import com.upc.service.JobMoveService;
import com.upc.service.JobMoveServiceImpl;

public class DeptMoveServlet extends HttpServlet {

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
		String d_s=request.getParameter("d_s");
		String d_e=request.getParameter("d_e");
//		Employee employee= new Employee();
		System.out.println(d_s);
		DeptMoveService deptMoveService=new DeptMoveServiceImpl();
		List<DeptMove> deptMove=deptMoveService.getDeptMoveByDept_no(d_s,d_e);
		request.setAttribute("deptMove", deptMove);
		//3.根据结果找到某个视图响应回去
		request.getRequestDispatcher("../ReportManagement/reportDeptMove.jsp").forward(request, response);
		out.flush();
		out.close();
		//3.根据结果找到某个视图响应回去
	}

}
