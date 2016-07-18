<%@ page language="java" import="java.util.*,com.upc.dao.Job" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
    <li><a href="#">岗位信息表</a></li>
    </ul>
    </div>  
   
<table border="1" cellspacing="0" width="80%" align="center">
    <caption>岗位信息表</caption>
    <tr><th>岗位编号</th><th>岗位名称</th><th>岗位类型</th><th>岗位编制</th><th>操作</th></tr>
       <%System.out.println("45");%>
        <% List<Job> jobs=(List<Job>)request.getAttribute("job");
    if(jobs==null)
    {
     %>
     <tr><td colspan="4"><font color="red">没有符合条件的数据</font></td></tr>
     <%}else{
     for(Job job:jobs)
     {
      %>
      <tr><td><%=job.getJob_no() %></td>
      <td><%=job.getJob_name() %></td>
      <td><%=job.getJob_type() %></td>
      <td><%=job.getJob_limit() %></td>
      <td>
       <a href="<%=basePath %>servlet/GetEmployeeByJob?job_no=<%=job.getJob_no() %>">查看员工</a>
      <a href="<%=basePath %>servlet/GetJobByJob_noServlet?job_no=<%=job.getJob_no() %>&job_name=<%=job.getJob_name() %>&job_type=<%=job.getJob_type() %>">修改</a>
   
      <a href="<%=basePath %>servlet/DeleteJobServlet?job_no=<%=job.getJob_no() %>&job_name=<%=job.getJob_name() %>&job_type=<%=job.getJob_type() %>">删除</a>
      </td>
      </tr>
      <%}} %>
    </table>

    </body>
</html>
