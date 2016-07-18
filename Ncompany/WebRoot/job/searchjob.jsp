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
  <form>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">查询岗位信息</a></li>
    </ul>
    </div>  
    </form>
 <form action="<%=basePath %>servlet/GetJobByServlet" method="post">
<center>
岗位编号：<input type="text" name="job_no"/><br>				
 部门名称：<input type="text" name="job_name"/><br>
</center>
<br>
<center>
<tr>
<td width="97" align="right" height="26">
 岗位类型：
</td>
<td width="297" height="26">
<select name="job_type"  style="width:150px" size=1><option value="">---请选择---</option><option value="市场">市场</option><option value="技术">技术</option>><option value="管理">管理</option><option value="营销">营销</option></select> 
</td>
<center> 
<br>
<input type="submit" value="查 询"></a>

</tr>
</center>
<br>

</form>
<a href="javascript:history.go(-1);">返回</a>
  </body>
</html>
