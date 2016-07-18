package com.upc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upc.utils.DbUtils;

public class Dept_AdjustDaoImpl implements Dept_AdjustDao{
	public void insertDept_Adjust(Dept_Adjust dept_adjust)
	{
		Connection conn=null;
	
		PreparedStatement pstmt=null;
	
		
		try {
			conn=DbUtils.getConnection();
			String sql="insert into dept_adjust(employee_no,old_dept_no,new_dept_no,dept_adjust_date,dept_adjust_reason,dept_adjust_type,detail) values(?,?,?,?,?,?,?)";
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setString(1, dept_adjust.getEmployee_no());
		   pstmt.setString(3,dept_adjust.getNew_dept_no());
		   pstmt.setString(2, dept_adjust.getOld_dept_no());
		   pstmt.setString(4,dept_adjust.getDept_adjust_date());
		   pstmt.setString(5, dept_adjust.getDept_adjust_reason());
		   pstmt.setString(6,dept_adjust.getDept_adjust_type());
		   pstmt.setString(7, dept_adjust.getDetail());

		   pstmt.executeUpdate();
		  
		  
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbUtils.closePreparedStatement(pstmt);
            DbUtils.closeConnection();
		}
	}
	
	public List<Dept_Adjust> dept(String[] str)
	{
		Connection conn=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		List<Dept_Adjust> deptselects=new ArrayList<Dept_Adjust>();
		try{
		conn=DbUtils.getConnection();//连接数据库
		StringBuffer sql=new StringBuffer("select  * from dept_adjust where ");//把sql语句定义成StringBuffer类型
		if(str[0]!=""){
			sql.append( " dept_adjust_date between ");
			sql.append("'");
			sql.append(str[0]);
			sql.append("'");
			System.out.println(sql);
			//System.out.println(111);
		}//第一个字符串如果不为空，就追加到sql中
		if(str[1]!=""){
			sql.append(" and ");
			sql.append("'");
			sql.append(str[1]);
			sql.append("'");
			System.out.println(sql);
			//System.out.println(111);
		}//第二个字符串不为空，就追加到sql中
		
		if(str[2]!=""){
			sql.append(" and employee_no=");
			sql.append("'");
			sql.append(str[2]);
			sql.append("'");
			System.out.println(sql);
		}//第四个字符串不为空，就追加到sql中*/
		if(str[3]!=""){
			sql.append(" and dept_adjust_type=");
			sql.append("'");
			sql.append(str[3]);
			sql.append("'");
			System.out.println(sql);
		}//第四个字符串不为空，就追加到sql中*/
		
			System.out.println(sql.toString());
			pre=conn.prepareStatement(sql.toString());
			rs=pre.executeQuery();//把结果集放到rs中
			
			
			while(rs.next()){
				
				Dept_Adjust deptselect=new Dept_Adjust();
				
				
				deptselect.setEmployee_no(rs.getString("EMPLOYEE_NO"));
				deptselect.setNew_dept_no(rs.getString("NEW_DEPT_NO"));
				deptselect.setOld_dept_no(rs.getString("OLD_DEPT_NO"));
				deptselect.setDept_adjust_date(rs.getString("DEPT_ADJUST_DATE"));
				deptselect.setDept_adjust_reason(rs.getString("DEPT_ADJUST_REASON"));
				deptselect.setDept_adjust_type(rs.getString("DEPT_ADJUST_TYPE"));
				deptselect.setDetail(rs.getString("DETAIL"));
				
				deptselects.add(deptselect);//把一行的值放到depts中
			}//把查询结果取出来放到depts中
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			DbUtils.closeResultSet(rs);
			DbUtils.closePreparedStatement(pre);
			DbUtils.closeConnection();
		}
		return deptselects;
			}
	
	public void  updateDept_Adjust(Dept_Adjust dept_adjust)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DbUtils.getConnection();
			   String sql="update employee set dept_no=? where employee_no=?";
			   pstmt=conn.prepareStatement(sql);
			   
			   pstmt.setString(1, dept_adjust.getNew_dept_no());
			  System.out.println(dept_adjust.getNew_dept_no());
			   pstmt.setString(2, dept_adjust.getEmployee_no());
			   System.out.println(dept_adjust.getEmployee_no());
			   pstmt.executeUpdate();
		   
		
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbUtils.closePreparedStatement(pstmt);
            DbUtils.closeConnection();
	}
	
	
	}
}
	
	


