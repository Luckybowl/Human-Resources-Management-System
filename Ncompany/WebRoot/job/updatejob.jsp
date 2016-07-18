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
    <li><a href="#">修改岗位</a></li>
    </ul>
    </div>  
    </form>
<form action="<%=basePath %>servlet/UpdateJobServlet" method="post">
 <center><h1>&lt;修改岗位</h1>
<% List<Job> jobs=(List<Job>)request.getAttribute("job");%>
    <%  for(Job job:jobs)
     {%>

 岗位编号：<input type="text" name="job_no" value="<%=job.getJob_no() %>" readonly="readonly"/><br>
岗位名称：<input type="text" name="job_name" value="<%=job.getJob_name() %>"/><br>
<td><span>岗位类型:</span></td>
<select name="job_type" id="select_k1" class="xla_k"> 
  <option value="管理"selected style="background-color:#ddf8f6">管理</option>
<option value="技术" style="background-color:#ddf8f6">技术</option>
<option value="营销" style="background-color:#ddf8f6">营销</option>
<option value="市场" style="background-color:#ddf8f6">市场</option>
</select><font color="red">*</font><br>
 岗位编制：<input type="text" name="job_limit"  value="<%=job.getJob_limit() %>"/><br>
 <input type="submit" value="修改"/><% }%>
 </center>
 </form>
 <a href="javascript:history.go(-1);">返回</a>
</body>
</html>
