package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Dept_Adjust;
import com.upc.service.Dept_Adjustservice;
import com.upc.service.Dept_AdjustserviceImpl;


public class insertservlet extends HttpServlet {

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
		
		
		String employeeno=request.getParameter("employee_no");
		String olddeptno=request.getParameter("old_dept_no");
		
		String newdeptno=request.getParameter("diaodu");
		if("user1".equals(newdeptno)){
			newdeptno="13001";
		}
		if("user2".equals(newdeptno)){
			newdeptno="13002";
		}
		if("user3".equals(newdeptno)){
			newdeptno="13003";
		}
		if("user4".equals(newdeptno)){
			newdeptno="13004";
		}  
		if("user5".equals(newdeptno)){
			newdeptno="13005";
		}
		
		String deptadjustdate=request.getParameter("starttime");
		String deptadjustreason=request.getParameter("reson");
		String deptadjusttype=request.getParameter("diaodu1");
		if("rise".equals(deptadjusttype)){
			deptadjusttype="升职";
		}
		if("low".equals(deptadjusttype)){
			deptadjusttype="降职";
		}  
		if("shujucu".equals(deptadjusttype)){
			deptadjusttype="数据错误";
		}
		String detail=request.getParameter("beizhu");
		
		
		
		Dept_Adjust deptadjust= new Dept_Adjust();
		
		deptadjust.setEmployee_no(employeeno);
		deptadjust.setOld_dept_no(olddeptno);
		deptadjust.setNew_dept_no(newdeptno);
		deptadjust.setDept_adjust_type(deptadjusttype);
		deptadjust.setDept_adjust_reason(deptadjustreason);
		deptadjust.setDept_adjust_date(deptadjustdate);
		deptadjust.setDetail(detail);
	//	System.out.println("deptadjust.setDetail(detail);");
	//	deptadjust1.setEmployee_no(employeeno);
	//	deptadjust1.setNew_dept_no(newdeptno);
		
		Dept_Adjustservice deptadjustService=new Dept_AdjustserviceImpl();

		
		deptadjustService.updateDept_Adjust(deptadjust);
	
		deptadjustService.insertDept_Adjust(deptadjust);
	    
		request.getRequestDispatcher("../DeptmentSystem/deptmove.jsp").forward(request, response);
		
		out.flush();
		out.close();
	}

}
