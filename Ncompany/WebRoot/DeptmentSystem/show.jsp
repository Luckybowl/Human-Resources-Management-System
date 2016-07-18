<%@ page language="java" import="java.util.*,com.upc.dao.Dept_Adjust" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
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
    <table align="center" border="1" width="800">  


 <caption></caption>
<center><tr><th>员工编号</th><th>前部门</th><th>现部门 </th><th>调转时间</th><th>调转原因</th><th>调转类型 </th><th>备注  </th></tr></center>
<%List<Dept_Adjust> depts=(List<Dept_Adjust> )request.getAttribute("depts"); 

 if(depts==null)
    {
     %>
     <tr><td colspan="4"><font color="red">没有符合条件的数据</font></td></tr>
     <%}
     else{
     for(Dept_Adjust deptadjusts:depts)
     {
      %>   
        <tr>        
        <td><%=deptadjusts.getEmployee_no() %></td>
        <td><%=deptadjusts.getOld_dept_no() %></td>
        <td><%=deptadjusts.getNew_dept_no() %></td>
        <td><%=deptadjusts.getDept_adjust_date() %></td>
        <td><%=deptadjusts.getDept_adjust_reason() %></td>
        <td><%=deptadjusts.getDept_adjust_type() %></td>
        <td><%=deptadjusts.getDetail() %></td>
        <td><a href="<%=basePath %>servlet/selectservlet">调度</a></td>
      
       
        
             
        </tr>
      <%}} %>
        
</table>
 
  </body>
</html>
