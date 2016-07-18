<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'moveinformjobselect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" type="text/css" href="date/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="date/calendar.js" ></script>
		<script type="text/javascript" src="date/calendar-setup.js" ></script>
		<script type="text/javascript" src="date/cn_utf8.js" ></script>
  </head>
  
  <body>
    <form action="<%=basePath %>servlet/jobadjustselect"  method="post" name="frm1">
   <br>
<br>


开始日期 <input type="text" id="starttime" size="20" value="2002-11-1" name="starttime">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"starttime", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script>
<br>



<center>结束日期<input type="text" id="endtime" size="20" value="2004-11-1" name="endtime">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"endtime", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script></center>

<br>
<center>员工编号：<input type="text" name="employee_no" /></center>
<br>
<center>员工姓名：<input type="text" name="employee_name" /></center>
<br>
<center>调度方式：
<select name="dept_adjust_type">
<option value="diaodu">主动调动</option><option value="diaodu">被动调动</option></select></center>
<br />
<br />
<center><input type="submit" value="查询"/></center>

</form>
  </body>
</html>
