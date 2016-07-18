<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="css/style.css" rel="stylesheet" type="text/css" />
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	-->

	<script language="JavaScript" src="js/jquery.js"></script>
	<script type="text/javascript">
	$(function(){	
		//导航切换
		$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
		}
		);
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>
  </head>
  
  <body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>菜单栏</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>组织管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="dept/insertdept.jsp" target="rightFrame">添加部门</a><i></i></li>
        <li><cite></cite><a href="dept/searchdept.jsp"target="rightFrame">查询部门</a><i></i></li>
        <li><cite></cite><a href="job/insertjob.jsp" target="rightFrame">添加岗位</a><i></i></li>
        <li><cite></cite><a href="job/searchjob.jsp" target="rightFrame">查询岗位</a><i></i></li>
        </ul>    
    </dd>
        
    
    <dd>
    <div class="title">
    <span><img src="images/leftico02.png" /></span>人事信息管理
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="Employee/newaddE.jsp" target="rightFrame">新增员工</a><i></i></li>
        <li><cite></cite><a href="Employee/sfireE.jsp" target="rightFrame">员工离职</a><i></i></li>
        <li><cite></cite><a href="Employee/sleftE.jsp" target="rightFrame">已离职员工</a><i></i></li>
        </ul>     
    </dd> 
    
    <dd>
    <div class="title">
    <span><img src="images/leftico02.png" /></span>员工部门调动管理
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="DeptmentSystem/deptmove.jsp" target="rightFrame">员工部门调动</a><i></i></li>
            <li><cite></cite><a href="DeptmentSystem/moveinformselect.jsp" target="rightFrame">已调动部门信息查询</a><i></i></li>
   
        </ul>     
    </dd> 
    
    <dd><div class="title"><span><img src="images/leftico03.png" /></span>员工岗位调动管理</div>
    <ul class="menuson"> <li><cite></cite><a href="DeptmentSystem/jobmove.jsp" target="rightFrame">员工岗位调动</a><i></i></li>
        <li><cite></cite><a href="DeptmentSystem/moveinformselect.jsp" target="rightFrame">已调岗位信息查询</a><i></i></li>
 
    </ul>   
    </dd>  
    
    
    <dd><div class="title"><span><img src="images/leftico04.png" /></span>报表管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="ReportManagement/reportHireE.jsp" target="rightFrame">新聘员工报表 </a><i></i></li>
        <li><cite></cite><a href="ReportManagement/reportLeftE.jsp" target="rightFrame">离职员工报表 </a><i></i></li>
        <li><cite></cite><a href="ReportManagement/reportDeptMove.jsp" target="rightFrame">部门调动员工报表 </a><i></i></li>
        <li><cite></cite><a href="ReportManagement/reportJobMove.jsp" target="rightFrame">岗位调动员工报表</a><i></i></li>

    </ul>
    
    </dd>   
    
    </dl>
  </body>
</html>
