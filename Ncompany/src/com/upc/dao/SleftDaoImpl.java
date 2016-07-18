package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class SleftDaoImpl implements SleftDao{
	public List<Sleft> showAll(String[] str) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Sleft> slefts=new ArrayList<Sleft>();
		try{
			conn=DbUtils.getConnection();//连接数据库
			StringBuffer sql=new StringBuffer("select * from employee,out_employee,dept,job where employee.employee_no=out_employee.employee_no and employee.dept_no=dept.dept_no and employee.job_no=job.job_no ");
			if(str[0]!="")
			{sql.append( "and employee.employee_no=");
			sql.append("'");
			sql.append(str[0]);
			sql.append("'");
			System.out.println(sql);
			}//第一个字符串如果不为空，就追加到sql中
			if(str[1]!=""){
				sql.append(" and employee_name=");
				sql.append("'");
				sql.append(str[1]);
				sql.append("'");
				System.out.println(sql);
				//System.out.println(111);
			}//第二个字符串不为空，就追加到sql中
			if(str[2]!=""){
				sql.append(" and dept_name=");
				sql.append("'");
				sql.append(str[2]);
				sql.append("'");
				System.out.println(sql);
			}//第三个字符串不为空，就追加到sql中*/
			if(str[3]!=""){
				sql.append(" and job_name=");
				sql.append("'");
				sql.append(str[3]);
				sql.append("'");
				System.out.println(sql);
			}//第四个字符串不为空，就追加到sql中*/
			if(str[4]!=""){
				sql.append(" and out_type=");
				sql.append("'");
				sql.append(str[4]);
				sql.append("'");
				System.out.println(sql);
			}//第五个字符串不为空，就追加到sql中*/
			if(str[5]!=""){
				
				sql.append(" and workdate>");
				sql.append("'");
				sql.append(str[5]);
				sql.append("'");
				System.out.println(sql);
			}//第六个字符串不为空，就追加到sql中*/
			if(str[6]!=""){
				
				sql.append(" and out_time<");
				sql.append("'");
				sql.append(str[6]);
				sql.append("'");
				System.out.println(sql);
			}//第七个字符串不为空，就追加到sql中*/
				System.out.println(sql.toString());
				pstmt=conn.prepareStatement(sql.toString());
				rs=pstmt.executeQuery();//把结果集放到rs中


				while(rs.next()){
					Sleft sleft=new Sleft();
					sleft.setEmployee_no(rs.getString("EMPLOYEE_NO"));
					sleft.setEmployee_name(rs.getString("EMPLOYEE_NAME"));
					sleft.setEmployee_sex(rs.getString("EMPLOYEE_SEX"));
					sleft.setEmployee_birthday(rs.getString("EMPLOYEE_BIRTHDAY"));
					sleft.setEmployee_ID(rs.getString("EMPLOYEE_ID"));
					sleft.setDept_name(rs.getString("DEPT_NAME"));
					sleft.setJob_name(rs.getString("JOB_NAME"));
					sleft.setIndate(rs.getString("INDATE"));
					sleft.setWorkdate(rs.getString("WORKDATE"));
					sleft.setWork_type(rs.getString("WORK_TYPE"));
					sleft.setPerson_source(rs.getString("PERSON_SOURCE"));
					sleft.setPolitical_status(rs.getString("POLITICAL_STATUS"));
					sleft.setNation(rs.getString("NATION"));
					sleft.setPlace(rs.getString("PLACE"));
					sleft.setPhone(rs.getString("PHONE"));
					sleft.setEmail(rs.getString("EMAIL"));
					sleft.setHeight(rs.getFloat("HEIGHT"));
					sleft.setBlood_type(rs.getString("BLOOD_TYPE"));
					sleft.setMarriage(rs.getString("MARRIAGE"));
					sleft.setBirthplace(rs.getString("BIRTHPLACE"));
					sleft.setFamilyplace(rs.getString("FAMILYPLACE"));
					sleft.setDegree(rs.getString("DEGREE"));
					sleft.setAcademic(rs.getString("ACADEMIC"));
					sleft.setSchool(rs.getString("SCHOOL"));
					sleft.setMajor(rs.getString("MAJOR"));
					sleft.setGraduatedate(rs.getString("GRADUATEDATE"));
					sleft.setOut_time(rs.getString("OUT_TIME"));
					sleft.setOut_type(rs.getString("OUT_TYPE"));
					sleft.setOut_toward(rs.getString("OUT_TOWARD"));
					sleft.setDetail(rs.getString("DETAIL"));
					slefts.add(sleft);
					
					
					
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
			return slefts;
				}



}
