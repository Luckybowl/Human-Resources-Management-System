<%@ page language="java" import="java.util.*,com.upc.dao.*,com.upc.service.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>离职员工报表</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../date/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="../date/calendar.js" ></script>
		<script type="text/javascript" src="../date/calendar-setup.js" ></script>
		<script type="text/javascript" src="../date/cn_utf8.js" ></script>

</head>
<body>
<form action="<%=basePath %>servlet/reportLeftEServlet" method="post">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">报表管理</a></li>
    </ul>
    </div>  
    <div class="formbody">  
    <div class="formtitle"><span>离职人员报表</span></div>  
    <ul class="forminfo">
    <li><label>开始日期</label><input type="text" name="l_s" size="20" value="2002-11-1" id="l_s">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"l_s", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script><i>默认为记录起始日期</i></li>
    <li><label>结束日期</label><input type="text" name="l_e" size="20" value="2015-01-01" id="l_e">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"l_e", //日期文本框的id属性
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
	LeftEService staffService=new LeftEServiceImpl();
	List<LeftE> staffs=staffService.getAllDepts();

	for(LeftE staff:staffs)
	{
			%>
	<option value="<%=staff.getLDeptName() %>"><%=staff.getLDeptName() %></option>
	<%} %>
</select>
<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;默认为所有部门</i>
    
    
     </div>  
    </li>  
    <li><label>&nbsp;</label><a href="reportReportHireE.html"><input name="" type="submit" class="btn" value="生成报表"/></a></li>
    </ul>
    </div>
    </form>
    <form action="<%=basePath %>/servlet/reportHireE">
    <table  width="1000" border="2" style="border:2px;   padding:0px; margin:auto; border-collapse:collapse;">
    <caption>离职员工报表</caption>
    <tr><th>序号</th><th>部门名称</th><th>岗位名称</th><th >姓名</th><th>性别</th><th>离职日期</th><th>离职原因</th></tr>
    <%
    List<LeftE> leftEs=(List<LeftE>)request.getAttribute("leftE");
    int i=0;
    if(leftEs==null)
    {
     %>
     <tr><td colspan="7"><font color="red">没有符合条件的数据</font></td></tr>
     <%}
     else{
     for(LeftE leftE:leftEs)
     {
     		i++;
      %>
      <tr><td><%=i %></td>
       <td> <%=leftE.getLDeptName() %></td>
       <td> <%=leftE.getLJobName() %></td>
       <td> <%=leftE.getLEmployeeName() %></td>
       <td> <%=leftE.getLEmployeeSex() %></td>
       <td> <%=leftE.getLOutDate() %></td>
       <td> <%=leftE.getLReason() %></td>
      </tr>
      <%}} %>
    </table>
    </form>
    
</body>
</html>


