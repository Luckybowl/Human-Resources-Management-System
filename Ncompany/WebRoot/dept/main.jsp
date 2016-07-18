<%@ page language="java" import="java.util.* ,com.upc.dao.Dept" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
<form>
    <table border="1" cellspacing="0" width="80%" align="center">
    <caption>部门信息表</caption>
    <tr><th>部门编号</th><th>部门名称</th><th>部门类型</th><th>部门电话</th><th>成立日期</th><th>操作</th><th>传真</th><th>描述</th><th>上级部门</th></tr>
     <%
    List<Dept> depts=(List<Dept>)request.getAttribute("dept");
    if(depts==null)
    {
     %>
     <tr><td colspan="4"><font color="red">没有符合条件的数据</font></td></tr>
     <%}else{
     for(Dept dept:depts)
     {
      %>
      <tr><td><%=dept.getDept_no() %></td>
      <td><%=dept.getDept_name() %></td>
      <td><%=dept.getDept_type() %></td>
      <td><%=dept.getDept_phone() %></td>
      <td><%=dept.getDept_fax() %></td>
      <td><%=dept.getDescribe() %></td>
      <td><%=dept.getRankdept() %></td>
      <td><%=dept.getsTart_date()%></td>
      <td>
      <a href="<%=basePath %>servlet/GetEmployeeByDept?dept_no=<%=dept.getDept_no() %>">查看员工</a>
      <a href="<%=basePath %>servlet/GetDeptByDept_noServlet?dept_no=<%=dept.getDept_no() %>&dept_name=<%=dept.getDept_name() %>&dept_type=<%=dept.getDept_type() %>">修改</a>
      <a href="<%=basePath %>servlet/DeleteDeptServlet?dept_no=<%=dept.getDept_no() %>&dept_name=<%=dept.getDept_name() %>&dept_type=<%=dept.getDept_type() %>&dept_phone=<%=dept.getDept_phone() %>&dept_fax=<%=dept.getDept_fax() %>&describe=<%=dept.getDescribe() %>&rankdept=<%=dept.getRankdept() %>&start_date=<%=dept.getsTart_date() %>">删除</a>
      </td>
      </tr>
      <%}} %>
    </table>
    </form>
    
  </body>
</html>
