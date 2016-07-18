package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class EmployeeDaoImpl implements EmployeeDao {

	

	public List<Employee> getEmployeeByDept(String dept_no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<Employee> depts=new ArrayList<Employee>();
			try {
			conn=DbUtils.getConnection();
		    String sql="select  * from employee where dept_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dept_no);
			rs=pstmt.executeQuery();
			while (rs.next())
			{
				Employee ps=new Employee();
				ps.setEmployee_no(rs.getString("employee_no"));
				ps.setEmployee_name(rs.getString("employee_name"));
				ps.setEmployee_sex(rs.getString("employee_sex"));
				ps.setEmployee_birthday(rs.getString("employee_birthday"));
				ps.setEmployee_ID(rs.getString("Employee_ID"));
				ps.setDept_no(rs.getString("dept_no"));
				ps.setJob_no(rs.getString("job_no"));
					
				depts.add(ps);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return depts;
	}
	
	
	public List<Employee> getEmployeeByJob(String job_no) {
		System.out.print("b");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		List<Employee> jobs=new ArrayList<Employee>();
			try {
			conn=DbUtils.getConnection();
		    String sql="select  * from employee where job_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, job_no);
			rs=pstmt.executeQuery();
			while (rs.next())
			{
				Employee ps=new Employee();
				ps.setEmployee_no(rs.getString("employee_no"));
				ps.setEmployee_name(rs.getString("employee_name"));
				ps.setEmployee_sex(rs.getString("employee_sex"));
				ps.setEmployee_birthday(rs.getString("employee_birthday"));
				ps.setEmployee_ID(rs.getString("Employee_ID"));
				ps.setDept_no(rs.getString("dept_no"));
				ps.setJob_no(rs.getString("job_no"));
				jobs.add(ps);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return jobs;
	}

	
	public List<Employee> getAllEmployees() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Employee> employees=new ArrayList<Employee>();
		try{
		conn=DbUtils.getConnection();
			String sql = "select * from employee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// 执行sql语句，然后将数据库结果存放在rs对象
			while (rs.next()) {
				Employee employee=new Employee();
				employee.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				employee.setEmployee_name(rs.getString("EMPLOYEE_NAME"));
				employee.setEmployee_sex(rs.getString("EMPLOYEE_SEX"));
				employee.setEmployee_birthday(rs.getString("EMPLOYEE_BIRTHDAY"));
				employee.setEmployee_ID(rs.getString("EMPLOYEE_ID"));
				employee.setDept_no(rs.getString("DEPT_NO"));
				employee.setJob_no(rs.getString("JOB_NO"));
				employee.setIndate(rs.getString("INDATE"));
				employee.setWorkdate(rs.getString("WORKDATE"));
				employee.setWork_type(rs.getString("WORK_TYPE"));
				employee.setPerson_source(rs.getString("PERSON_SOURCE"));
				employee.setPolitical_status(rs.getString("POLITICAL_STATUS"));
				employee.setNation(rs.getString("NATION"));
				employee.setPlace(rs.getString("PLACE"));
				employee.setPhone(rs.getString("PHONE"));
				employee.setEmail(rs.getString("EMAIL"));
				employee.setHeight(rs.getFloat("HEIGHT"));
				employee.setBlood_type(rs.getString("BLOOD_TYPE"));
				employee.setMarriage(rs.getString("MARRIAGE"));
				employee.setBirthplace(rs.getString("BIRTHPLACE"));
				employee.setFamilyplace(rs.getString("FAMILYPLACE"));
				employee.setDegree(rs.getString("DEGREE"));
				employee.setAcademic(rs.getString("ACADEMIC"));
				employee.setSchool(rs.getString("SCHOOL"));
				employee.setMajor(rs.getString("MAJOR"));
				employee.setGraduatedate(rs.getString("GRADUATEDATE"));						
				employees.add(employee);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DbUtils.closeResultSet(rs);
			DbUtils.closePreparedStatement(pstmt);
			DbUtils.closeConnection();
		}
		return employees;
	}

	
	public Employee getEmployeeByEmployee_no(String employee_no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Employee employee=new Employee();
		conn=DbUtils.getConnection();
		String sql="select  * from employee where employee_no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, employee_no);//主键？
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				employee.setEmployee_no(employee_no);
				employee.setEmployee_name(rs.getString("EMPLOYEE_NAME"));
				employee.setEmployee_sex(rs.getString("EMPLOYEE_SEX"));
				employee.setEmployee_birthday(rs.getString("EMPLOYEE_BIRTHDAY"));
				employee.setEmployee_ID(rs.getString("EMPLOYEE_ID"));
				employee.setDept_no(rs.getString("DEPT_NO"));
				employee.setJob_no(rs.getString("JOB_NO"));
				employee.setIndate(rs.getString("INDATE"));
				employee.setWorkdate(rs.getString("WORKDATE"));
				employee.setWork_type(rs.getString("WORK_TYPE"));
				employee.setPerson_source(rs.getString("PERSON_SOURCE"));
				employee.setPolitical_status(rs.getString("POLITICAL_STATUS"));
				employee.setNation(rs.getString("NATION"));
				employee.setPlace(rs.getString("PLACE"));
				employee.setPhone(rs.getString("PHONE"));
				employee.setEmail(rs.getString("EMAIL"));
				employee.setHeight(rs.getFloat("HEIGHT"));
				employee.setBlood_type(rs.getString("BLOOD_TYPE"));
				employee.setMarriage(rs.getString("MARRIAGE"));
				employee.setBirthplace(rs.getString("BIRTHPLACE"));
				employee.setFamilyplace(rs.getString("FAMILYPLACE"));
				employee.setDegree(rs.getString("DEGREE"));
				employee.setAcademic(rs.getString("ACADEMIC"));
				employee.setSchool(rs.getString("SCHOOL"));
				employee.setMajor(rs.getString("MAJOR"));
				employee.setGraduatedate(rs.getString("GRADUATEDATE"));
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}

	
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="insert into employee(employee_no,employee_name,employee_sex,employee_birthday,employee_ID,dept_no,job_no,indate,workdate,work_type,person_source,political_status,nation,place,phone,email,height,blood_type,marriage,birthplace,familyplace,degree,academic,school,major,graduatedate) " +
					"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, employee.getEmployee_no());
		pstmt.setString(2, employee.getEmployee_name());
		pstmt.setString(3,employee.getEmployee_sex());
		pstmt.setString(4,employee.getEmployee_birthday());
		pstmt.setString(5,employee.getEmployee_ID());
		pstmt.setString(6,employee.getDept_no());
		pstmt.setString(7,employee.getJob_no());
		pstmt.setString(8,employee.getIndate());
		pstmt.setString(9,employee.getWorkdate());
		pstmt.setString(10,employee.getWork_type());
		pstmt.setString(11,employee.getPerson_source());
		pstmt.setString(12,employee.getPolitical_status());
		pstmt.setString(13,employee.getNation());
		pstmt.setString(14,employee.getPlace());
		pstmt.setString(15,employee.getPhone());
		pstmt.setString(16,employee.getEmail());
		pstmt.setFloat(17,employee.getHeight());
		pstmt.setString(18,employee.getBlood_type());
		pstmt.setString(19,employee.getMarriage());
		pstmt.setString(20,employee.getBirthplace());
		pstmt.setString(21,employee.getFamilyplace());
		pstmt.setString(22,employee.getDegree());
		pstmt.setString(23,employee.getAcademic());
		pstmt.setString(24,employee.getSchool());
		pstmt.setString(25,employee.getMajor());
		pstmt.setString(26,employee.getGraduatedate());
		

		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}

	
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			String sql="update employee set employee_name=?,employee_sex=?,employee_birthday=?,employee_ID=?,dept_no=?,job_no=?,indate=?,workdate=?,work_type=?,person_source=?,political_status=?,nation=?,place=?,phone=?,email=?,height=?,blood_type=?,marriage=?,birthplace=?,familyplace=?,degree=?,academic=?,school=?,major=?,graduatedate=? where employee_no=?";
			//update uu set dname=?,loc=? where id=?
			//delete from uu where id=?
		pstmt=conn.prepareStatement(sql);
		
		
		pstmt.setString(1, employee.getEmployee_name());
		pstmt.setString(2,employee.getEmployee_sex());
		pstmt.setString(3,employee.getEmployee_birthday());
		pstmt.setString(4,employee.getEmployee_ID());
		pstmt.setString(5,employee.getDept_no());
		pstmt.setString(6,employee.getJob_no());
		pstmt.setString(7,employee.getIndate());
		pstmt.setString(8,employee.getWorkdate());
		pstmt.setString(9,employee.getWork_type());
		pstmt.setString(10,employee.getPerson_source());
		pstmt.setString(11,employee.getPolitical_status());
		pstmt.setString(12,employee.getNation());
		pstmt.setString(13,employee.getPlace());
		pstmt.setString(14,employee.getPhone());
		pstmt.setString(15,employee.getEmail());
		pstmt.setFloat(16,employee.getHeight());
		pstmt.setString(17,employee.getBlood_type());
		pstmt.setString(18,employee.getMarriage());
		pstmt.setString(19,employee.getBirthplace());
		pstmt.setString(20,employee.getFamilyplace());
		pstmt.setString(21,employee.getDegree());
		pstmt.setString(22,employee.getAcademic());
		pstmt.setString(23,employee.getSchool());
		pstmt.setString(24,employee.getMajor());
		pstmt.setString(25,employee.getGraduatedate());		
		pstmt.setString(26, employee.getEmployee_no());

		pstmt.executeUpdate();
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
DbUtils.closePreparedStatement(pstmt);
DbUtils.closeConnection();
		}
	}


	public void deleteEmployee(String employee_no ) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		String sql="delete from employee where employee_no=?";
		try {
			conn=DbUtils.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, employee_no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			DbUtils.closePreparedStatement(pstmt);
			DbUtils.closeConnection();
		}
	}
	
	public List<Employee> getAllMz(String[] str) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Employee> employees=new ArrayList<Employee>();
		try{
			conn=DbUtils.getConnection();//连接数据库
			StringBuffer sql=new StringBuffer("select * from dept,employee where dept.dept_no=employee.dept_no ");
			if(str[0]!="")
			{sql.append( "and employee.dept_no=");
			sql.append("'");
			sql.append(str[0]);
			sql.append("'");
			System.out.println(sql);
			}//第一个字符串如果不为空，就追加到sql中
			if(str[1]!=""){
				sql.append(" and dept_name=");
				sql.append("'");
				sql.append(str[1]);
				sql.append("'");
				System.out.println(sql);
				//System.out.println(111);
			}//第二个字符串不为空，就追加到sql中
			if(str[2]!=""){
				sql.append(" and employee.employee_no=");
				sql.append("'");
				sql.append(str[2]);
				sql.append("'");
				System.out.println(sql);
			}//第三个字符串不为空，就追加到sql中
			if(str[3]!=""){
				sql.append(" and employee.employee_name=");
				sql.append("'");
				sql.append(str[3]);
				sql.append("'");
				System.out.println(sql);
			}//第四个字符串不为空，就追加到sql中
			
				System.out.println(sql.toString());
				pstmt=conn.prepareStatement(sql.toString());
				rs=pstmt.executeQuery();//把结果集放到rs中

				while(rs.next()){
			    Employee employee=new Employee();
				employee.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				employee.setEmployee_name(rs.getString("EMPLOYEE_NAME"));
				employee.setEmployee_sex(rs.getString("EMPLOYEE_SEX"));
				employee.setEmployee_birthday(rs.getString("EMPLOYEE_BIRTHDAY"));
				employee.setEmployee_ID(rs.getString("EMPLOYEE_ID"));
				employee.setDept_no(rs.getString("DEPT_NO"));
				employee.setJob_no(rs.getString("JOB_NO"));
				employee.setIndate(rs.getString("INDATE"));
				employee.setWorkdate(rs.getString("WORKDATE"));
				employee.setWork_type(rs.getString("WORK_TYPE"));
				employee.setPerson_source(rs.getString("PERSON_SOURCE"));
				employee.setPolitical_status(rs.getString("POLITICAL_STATUS"));
				employee.setNation(rs.getString("NATION"));
				employee.setPlace(rs.getString("PLACE"));
				employee.setPhone(rs.getString("PHONE"));
				employee.setEmail(rs.getString("EMAIL"));
				employee.setHeight(rs.getFloat("HEIGHT"));
				employee.setBlood_type(rs.getString("BLOOD_TYPE"));
				employee.setMarriage(rs.getString("MARRIAGE"));
				employee.setBirthplace(rs.getString("BIRTHPLACE"));
				employee.setFamilyplace(rs.getString("FAMILYPLACE"));
				employee.setDegree(rs.getString("DEGREE"));
				employee.setAcademic(rs.getString("ACADEMIC"));
				employee.setSchool(rs.getString("SCHOOL"));
				employee.setMajor(rs.getString("MAJOR"));
				employee.setGraduatedate(rs.getString("GRADUATEDATE"));
				employees.add(employee);	
					//把一行的值放到depts中
				}//把查询结果取出来放到depts中
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {

				DbUtils.closeResultSet(rs);
				DbUtils.closePreparedStatement(pstmt);
				DbUtils.closeConnection();
			}
			return employees;
				}

  
}
