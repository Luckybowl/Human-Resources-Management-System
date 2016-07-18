<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <li><a href="#">员工表</a></li>
    </ul>
    </div>  
    <br>
    <br>
    <br>
    <br>
    </form>
     <form action="<%=basePath %>servlet/InsertDeptServlet" method="post">
  <center>
    部门编号：<input type="text" name="dept_no"/><font color="red">*</font><br>
    部门名称：<input type="text" name="dept_name"/><font color="red">*</font><br>
<br>
<td><span>部门类型:<select name="dept_type" id="select_k1" class="xla_k"> 
  <option value="公司" selected style="background-color:#ddf8f6">公司</option>
<option value="公司" style="background-color:#ddf8f6">部门</option>
</select></span></td>
<font color="red">*</font>
</br>

    部门电话：<input type="text" name="dept_phone" /><font color="red">*</font><br>
    传真：<input type="text" name="dept_fax" /><br>
     描述：<input type="text" name="describe" /><br>
     上级部门：<input type="text" name="rankdept" /><br>
    成立日期：<input type="text" name="start_date" /><font color="red">*</font><br>

 <input type="submit" value="添加" >
    </center>
  </form> 
<center> <a href="javascript:history.go(-1);">返回</a></center>
  </body>
</html>
