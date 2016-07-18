<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">部门查询</a></li>
    </ul>
    </div>  
    <br>
    <br>
    <br>
    <br>
    
    <form action="<%=basePath %>servlet/GetDeptByServlet" method="post">
<center>
<tr>

<td>
部门编号：<input type="text" name="dept_no"/><br>
    部门名称：<input type="text" name="dept_name"/><br>
<tr>
<td width="97" align="right" height="26">
部门类型：
</td>
<td width="297" height="26">
<select name="dept_type"  style="width:150px" size=1><option value="">---请选择---</option><option value="公司">公司</option><option value="部门">部门</option></select> <br>
</td>
</tr>


</center>

<br>
<center>
<tr>
<TD  colspan="5" align="center" style="height: 80px;">

<center> <input type="submit" value="查 询"></a>


</TD>
</tr>
</center>



<br>


<center> <a href="javascript:history.go(-1);"><input type="button" value="返回"></a></center>
</form>

  </body>
</html>
