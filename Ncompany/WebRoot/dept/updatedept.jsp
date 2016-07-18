<%@ page language="java" import="java.util.*,com.upc.dao.*" pageEncoding="utf-8"%>
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
    <li><a href="#">部门修改</a></li>
    </ul>
    </div>  
  
    <form action="<%=basePath %>servlet/UpdateDeptServlet" method="post">
    <center><h1>修改部门</h1>
    <% System.out.println("这里");
    List<Dept> depts=(List<Dept>)request.getAttribute("dept");%>
    <%  for(Dept dept:depts)
     {%>
   
    部门编号：<input type="text" name="dept_no" value="<%=dept.getDept_no() %>" /><br>
    部门名称：<input type="text" name="dept_name" value="<%=dept.getDept_name() %>"/><br>
   <td><span>部门类型:</span></td>
<select name="dept_type" id="select_k1" class="xla_k"> 
  <option value="公司"selected style="background-color:#ddf8f6">公司</option>
<option value="公司" style="background-color:#ddf8f6">部门</option>
</select><font color="red">*</font><br>
    部门电话：<input type="text" name="dept_phone" value="<%=dept.getDept_phone() %>"/><br>
    部门传真：<input type="text" name="dept_fax"  value="<%=dept.getDept_fax() %>"/><br>
    部门描述：<input type="text" name="describe"  value="<%=dept.getDescribe() %>"/><br>
    上级部门：<input type="text" name="rankdept"  value="<%=dept.getRankdept() %>"/><br>
    成立日期：<input type="text" name="start_date"  value="<%=dept.getsTart_date() %>"/><br>
    <input type="submit" value="修改"/><% }%>

    </center>
    </form>
      <a href="javascript:history.go(-1);">返回</a>
  </body>
</html>
