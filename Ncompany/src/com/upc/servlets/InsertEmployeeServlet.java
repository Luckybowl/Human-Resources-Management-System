package com.upc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dao.Employee;
import com.upc.service.EmployeeService;
import com.upc.service.EmployeeServiceImpl;

public class InsertEmployeeServlet extends HttpServlet {

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
		String employee_no=request.getParameter("employee_no");
		String employee_name=request.getParameter("employee_name");
		String employee_sex=request.getParameter("employee_sex");
		String employee_birthday=request.getParameter("employee_birthday");
		String employee_ID=request.getParameter("employee_ID");
		String dept_no=request.getParameter("dept_no");
		if("dept1".equals(dept_no))
		{
			dept_no="13001";
		}
		if("dept2".equals(dept_no))
		{
			dept_no="13002";
		}
		if("dept3".equals(dept_no))
		{
			dept_no="13003";
		}
		if("dept4".equals(dept_no))
		{
			dept_no="13004";
		}
		if("dept5".equals(dept_no))
		{
			dept_no="13005";
		}
		
		String job_no=request.getParameter("job_no");
		if("job1".equals(job_no))
		{
			job_no="11101";
		}
		if("job2".equals(job_no))
		{
			job_no="11102";
		}if("job3".equals(job_no))
		{
			job_no="11103";
		}if("job4".equals(job_no))
		{
			job_no="11104";
		}if("job5".equals(job_no))
		{
			job_no="11105";
		}
		String indate=request.getParameter("indate");
		String workdate=request.getParameter("workdate");
		String work_type=request.getParameter("work_type");
		String person_source=request.getParameter("person_source");
		String political_status=request.getParameter("political_status");
		String nation=request.getParameter("nation");
		String place=request.getParameter("place");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		if(request.getParameter("height")==null || request.getParameter("height").equals("")){}
		else{float height=Float.parseFloat(request.getParameter("height"));
		}
		
		String blood_type=request.getParameter("blood_type");
		String marriage=request.getParameter("marriage");
		String birthplace=request.getParameter("birthplace");
		String familyplace=request.getParameter("familyplace");
		String degree=request.getParameter("degree");
		String academic=request.getParameter("academic");
		String school=request.getParameter("school");
		String major=request.getParameter("major");
		String graduatedate=request.getParameter("graduatedate");
		
		
		Employee employee= new Employee();
		employee.setEmployee_no(employee_no);
		employee.setEmployee_name(employee_name);
		employee.setEmployee_sex(employee_sex);
		employee.setEmployee_birthday(employee_birthday);
		employee.setEmployee_ID(employee_ID);
		employee.setDept_no(dept_no);
		employee.setJob_no(job_no);
		employee.setIndate(indate);
		employee.setWorkdate(workdate);
		employee.setWork_type(work_type);
		employee.setPerson_source(person_source);
		employee.setPolitical_status(political_status);
		employee.setNation(nation);
		employee.setPlace(place);
		employee.setPhone(phone);
		employee.setEmail(email);
		employee.setHeight(Float.parseFloat(request.getParameter("height")));
		employee.setBlood_type(blood_type);
		employee.setMarriage(marriage);
		employee.setBirthplace(birthplace);
		employee.setFamilyplace(familyplace);
		employee.setDegree(degree);
		employee.setAcademic(academic);
		employee.setSchool(school);
		employee.setMajor(major);
		employee.setGraduatedate(graduatedate);
	
		
		//2.根据请求找到某个业务逻辑处理
		EmployeeService employeeService=new EmployeeServiceImpl();
		employeeService.insertEmployee(employee);
		//out.println("1111111");
		
		//3.根据结果找到某个视图响应回去
	
		request.getRequestDispatcher("QueryAllEmployeesServlet").forward(request, response);
		out.flush();
		out.close();
	}

}
