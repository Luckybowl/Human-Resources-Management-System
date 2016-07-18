<%@ page language="java" import="java.util.*,com.upc.dao.Dept_Adjustselect" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deptmove.jsp' starting page</title>
    
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
   <form action="<%=basePath %>servlet/deptadjustselectServlet" method="post" name="frm1">
   
    
    
<center>部门编号：<input type="text" name="dept_no"/></center>
<br>
<center> 
部门名称：<input type="text" name="dept_name"  /></center>
<br>
    
<center>员工编号：<input type="text" name="employee_no" /></center><br>


<center>员工名称：<input type="text" name="employee_name" /></center>


<center><br><input type="submit" value="提交"></center>


<center><a href="indexa.jsp"><input type="button" value="返回"/></a></center>
<br>

<br>

  <table align="center" border="1" width="800">  


 <caption></caption>
<center><tr><th>员工编号</th><th>员工姓名</th><th>员工性别 </th><th>岗位编号</th><th>部门编号</th><th>部门名称 </th><th>部门类型  </th><th>操作</th></tr></center>
<%List<Dept_Adjustselect> depts=(List<Dept_Adjustselect> )request.getAttribute("depts"); 

 if(depts==null)
    {
     %>
     <tr><td colspan="4"><font color="red">没有符合条件的数据</font></td></tr>
     <%}
     else{
     for(Dept_Adjustselect deptadjustselects:depts)
     {
      %>   
        <tr>        
        <td><%=deptadjustselects.getEmployee_no() %></td>
        <td><%=deptadjustselects.getEmployee_name() %></td>
        <td><%=deptadjustselects.getEmployee_sex() %></td>
        <td><%=deptadjustselects.getJob_no() %></td>
        <td><%=deptadjustselects.getDept_no() %></td>
        <td><%=deptadjustselects.getDept_name() %></td>
        <td><%=deptadjustselects.getDept_type() %></td>
        <td><a href="<%=basePath %>servlet/selectservlet">调度</a></td>
      
       
        
             
        </tr>
      <%}} %>
        
</table> 
</form> 

 

  </body>
</html>
