<%@ page language="java" import="java.util.*,com.upc.dao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>岗位调动员工报表</title>
	<link href="../css/style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="../date/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="../date/calendar.js" ></script>
		<script type="text/javascript" src="../date/calendar-setup.js" ></script>
		<script type="text/javascript" src="../date/cn_utf8.js" ></script>

  </head>
  
 <body>
<form action="<%=basePath %>servlet/JobMoveServlet" method="post">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">报表管理</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>岗位调动员工报表</span></div>
    
    <ul class="forminfo">
    <li><label>开始日期</label> <input type="text" id="j_s" size="20" value="2002-11-1" name="j_s">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"j_s", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script><i>默认为记录起始日期</i></li>
    <li><label>结束日期</label> <input type="text" id="j_e" size="20" value="2015-07-14" name="j_e">
				<script type="text/javascript">
					Calendar.setup( {
						inputField :"j_e", //日期文本框的id属性
						ifFormat :"%Y-%m-%d", //输入日期的格式
						showsTime :true, //是否显示时间
						onUpdate :null
					});
				</script><i>默认为当前日期</i></li>
   
    <br />
    <br />
    <li><label><input name="" type="submit" class="btn" value="生成报表"/></label></li>
    </ul>
    </div>
    </form>
    
    <form action="<%=basePath %>servlet/HireEServlet">
    <table border="1" cellspacing="0" width="80%" align="center">
    <caption>岗位调动报表</caption>
    <center></center><tr><th  style="width: 90px; ">序号</th><th  style="width: 90px; ">部门名称</th><th  style="width: 90px; ">原岗位名称</th><th style="width: 90px; ">新岗位名称</th><th  style="width: 90px; ">姓名</th><th  style="width: 90px; ">性别</th><th  style="width: 90px; ">调动日期</th><th  style="width: 90px; ">调动原因</th></tr></center>
    <%
    List<JobMove> jobMoves=(List<JobMove>)request.getAttribute("jobMove");
    int i=0;
    if(jobMoves==null)
    {
     %>
     <tr><td colspan="8"><font color="red">没有符合条件的数据</font></td></tr>
     <%}
     else{
     for(JobMove jobMove:jobMoves)
     {
     		i++;
      %>
      <tr><td><%=i %></td>
      <td>  <%=jobMove.getJDeptName() %></td>
      <td>  <%=jobMove.getOldJobName() %></td>
      <td>  <%=jobMove.getNewJobName() %></td>
       <td> <%=jobMove.getJEmployeeName() %></td>
       <td> <%=jobMove.getJEmployeeSex() %></td>
       <td>  <%=jobMove.getJMoveDate() %></td>
       <td> <%=jobMove.getJReason() %> </td>
      
      </tr>
      <%}} %>
    </table>
    </form>
    
    
</body>
</html>
