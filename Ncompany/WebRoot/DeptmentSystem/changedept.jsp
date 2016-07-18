<%@ page language="java" import="java.util.*,com.upc.dao.Dept_Adjustselect" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'changedept.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script src="js/document.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" type="text/css" href="date/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="date/calendar.js" ></script>
		<script type="text/javascript" src="date/calendar-setup.js" ></script>
		<script type="text/javascript" src="date/cn_utf8.js" ></script>
  </head>

  <body><form action="<%=basePath %>servlet/insertservlet"  method="post" name="frm1">
    <center>
 
     员工编号：<input type="text" name="employee_no"  /><br>
    调转前部门：<input type="text" name="old_dept_no" /><br>
调转后部门：<select name="diaodu">
<option value="user1">人事部</option><option value="user2">财务部</option><option value="user3">销售部</option><option value="user4">企划部</option><option value="user5">总部</option></select>(必填)</center>
<br>
<center>


<center>调转类型：<span id="d2"></span><select name="diaodu1">
<option name="rise">升职</option><option name="low">降职</option><option values="shujucu">数据错误</option></select>(必填)</center><br>
<center>调转原因 ：<input type="text" name="reson" />
</center>
<br>

<center>调动日期：<input type="text" id="starttime" size="20" value="2002-11-1" name="starttime">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"starttime", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script>
				</center><br>

<center>备注：<input type="text" name="beizhu" /></center><br>

<center><input type="submit" value="提交" onclick="del()"/></center>

<br>
<br>
 </form>
 </body>
</html>
