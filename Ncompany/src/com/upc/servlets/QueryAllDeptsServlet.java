package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Dept;
import com.upc.service.DeptService;
import com.upc.service.DeptServiceImpl;
public class QueryAllDeptsServlet extends HttpServlet {
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
		//1.接受请求
		//2.根据请求找到某个业务逻辑进行处理
		DeptService deptService=new DeptServiceImpl();
		List<Dept> depts=deptService.getAllDepts();
		request.setAttribute("dept", depts);
		//3.根据结果找到某个视图响应回去
		System.out.println("wangjinling");
		request.getRequestDispatcher("../dept/main.jsp").forward(request, response);
		out.flush();
		out.close();
	}	
}
