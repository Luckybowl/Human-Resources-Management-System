<%@ page language="java" import="java.util.*,com.upc.dao.Job_Adjustselect" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jobmove.jsp' starting page</title>
    
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
   <form action="<%=basePath %>servlet/jobadjustselectServlet" method="post" name="frm2">
   
    
    
<center>岗位编号：<input type="text" name="job_no"/></center>
<br>
<center> 
岗位名称：<input type="text" name="job_name"  /></center>
<br>
    
<center>员工编号：<input type="text" name="employee_no" /></center><br>


<center>员工名称：<input type="text" name="employee_name" /></center>


<center><br><input type="submit" value="提交"></center>


<center><a href="indexa.jsp"><input type="button" value="返回"/></a></center>
<br>

<br>

  <table align="center" border="1" width="800">  


 <caption></caption>
<center><tr><th>员工编号</th><th>员工姓名</th><th>员工性别 </th><th>部门编号</th><th>岗位编号</th><th>岗位名称 </th><th>岗位类型  </th><th>操作</th></tr></center>
<%List<Job_Adjustselect> jobs=(List<Job_Adjustselect> )request.getAttribute("jobs"); 

 if(jobs==null)
    {
     %>
     <tr><td colspan="7"><font color="red">没有符合条件的数据</font></td></tr>
     <%}
     else{
     for(Job_Adjustselect jobadjustselects:jobs)
     {
      %>   
        <tr>        
        <td><%=jobadjustselects.getEmployee_no() %></td>
        <td><%=jobadjustselects.getEmployee_name() %></td>
        <td><%=jobadjustselects.getEmployee_sex() %></td>
        <td><%=jobadjustselects.getDept_no() %></td>
        <td><%=jobadjustselects.getJob_no() %></td>
        <td><%=jobadjustselects.getJob_name() %></td>
        <td><%=jobadjustselects.getJob_type() %></td>
        <td><a href="<%=basePath %>servlet/selectjobservlet">调度</a></td>
      
       
        
             
        </tr>
      <%}} %>
        
</table> 
</form> 

 

  </body>
</html>
