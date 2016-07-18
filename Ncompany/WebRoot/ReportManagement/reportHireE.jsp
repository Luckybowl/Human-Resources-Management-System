<%@ page language="java" import="java.util.*,com.upc.dao.*,com.upc.service.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>新聘员工报表</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../date/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="../date/calendar.js" ></script>
		<script type="text/javascript" src="../date/calendar-setup.js" ></script>
		<script type="text/javascript" src="../date/cn_utf8.js" ></script>

</head>

<body>
<form action="<%=basePath %>servlet/HireEServlet" method="post">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">报表管理</a></li>
    </ul>
    </div>  
    <div class="formbody">  
    <div class="formtitle"><span>新聘人员报表</span></div>  
    <ul class="forminfo">
    <li><label>开始日期</label><input type="text" name="h_s" size="20" value="2002-11-1" id="h_s">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"h_s", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script><i>默认为记录起始日期</i></li>
    <li><label>结束日期</label><input type="text" name="h_e" size="20" value="2015-01-01" id="h_e">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"h_e", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script><i>默认为当前日期</i></li>    
    <li><label>所在部门</label>
    <div class="vocation">
     <select class="select1" name="Dept_N">
 <option select="selected" value="全部" >全部</option>
<% 
	HireEService staffService=new HireEServiceImpl();
	List<HireE> staffs=staffService.getAllDepts();
	for(HireE staff:staffs)
	{
			%>
	<option value="<%=staff.getHDeptName() %>"><%=staff.getHDeptName() %></option>
	<%} %>
</select>
<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;默认为所有部门</i>
    </div>  
    </li>  
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="生成报表"/></a></li>
    </ul>
    </div>
    </form>
    <form action="<%=basePath %>servlet/HireEServlet">
    <table border="1" cellspacing="0" width="80%" align="center">
    <caption>新聘员工报表</caption>
    <center></center><tr><th  style="width: 90px; ">序号</th><th  style="width: 90px; ">部门名称</th><th  style="width: 90px; ">岗位名称</th><th style="width: 90px; ">姓名</th><th  style="width: 90px; ">性别</th><th  style="width: 90px; ">入职日期</th><th  style="width: 90px; ">学历</th></tr></center>
    <%
    List<HireE> hireEs=(List<HireE>)request.getAttribute("hireE");
    int i=0;
    if(hireEs==null)
    {
     %>
     <tr><td colspan="7"><font color="red">没有符合条件的数据</font></td></tr>
     <%}
     else{
     for(HireE hireE:hireEs)
     {
     		i++;
      %>
      <tr><td><%=i %></td>
      <td><%=hireE.getHDeptName() %></td>
      <td><%=hireE.getHJobName() %></td>
      <td> <%=hireE.getHEmployeeName() %></td>
       <td> <%=hireE.getHEmployeeSex() %></td>
       <td> <%=hireE.getHWorkDate() %></td>
       <td> <%=hireE.getHDegree() %></td>
      
      </tr>
      <%}} %>
    </table>
    </form>

</body>
</html>

