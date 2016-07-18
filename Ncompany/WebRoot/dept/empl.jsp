<%@ page language="java" import="java.util.*,com.upc.dao.Employee" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'empl.jsp' starting page</title>
    
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="../css/style.css" rel="stylesheet" type="text/css" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">员工表</a></li>
    </ul>
    </div>  
   
  <form>
    <br><br><br><br><br><br><table border="1" cellspacing="0" width="80%" align="center">
    <caption>员工表</caption>
    <tr><th>员工编号</th><th>员工姓名</th><th>性别</th><th>出身日期</th><th>身份证</th><th>部门编号</th><th>岗位编号</th></tr>
    <%
    List<Employee> depts=(List<Employee>)request.getAttribute("employee");
    if(depts==null)
    {
     %>
     <tr><td colspan="4"><font color="red">没有符合条件的数据</font></td></tr>
     <%}else{
     for(Employee dept:depts)
     {
      %>
      <tr><td><%=dept.getEmployee_no() %></td>
      <td><%=dept.getEmployee_name() %></td>
      <td><%=dept.getEmployee_sex() %></td>
      <td><%=dept.getEmployee_birthday() %></td>
      <td><%=dept.getEmployee_ID() %></td>
      <td><%=dept.getDept_no() %></td>
      <td><%=dept.getJob_no() %></td>
      </tr>
      <%}} %>
    </table>
    </form>
  <center><a href="javascript:history.go(-1);"><input name="" type="submit" class="btn" value="返回"/></a></center>
  </body>
</html>
