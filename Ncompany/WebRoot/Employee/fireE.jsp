<%@ page language="java" import="java.util.*,com.upc.dao.Out_employee,com.upc.dao.Employee" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>  <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />

<script src="searchfakedata.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>
  
<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script></base>
</head>

<body><form action="<%=basePath%>servlet/InsertOut_employeeServlet" method="post">

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">员工离职</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="itab">
  	<ul> 
    <li><a href="#tab1" class="selected">员工离职</a></li> 
  	</ul>
    </div> 
    
  	<div id="tab1" class="tabson">
    
    
    
    
        
    
        
        
      
    <ul class="forminfo">
    
       <li>
      <label>离职员工号<b>*</b></label><input  type="text" name="employee_no" class="dfinput" value="" onblur="ma()" style="width:218px;"/><span id="u"></span></li>
    
   
       <li>
      <label>离职工作日期<b>*</b></label><input name="out_time" type="text" class="dfinput" value="" onblur="mi()" style="width:218px;"/><span id="g"></span></li>
       <li><label>离职类型<b>*</b></label>
    
  
    
    <div class="cityleft" >
    <select class="select2" name="out_type">
    <option value="主动辞职">主动辞职</option>
    <option value="辞退">辞退</option>
    <option value="退休">退休</option>
    <option value="开除">开除</option>
    <option value="试用期未过">试用期未过</option>
   
    </select>
     <li>
      <label>离职去向</label><input type="text" name="out_toward" class="dfinput" value=""  style="width:218px;"/></li>
    
    <li>
      <label>备注</label><input type="text" name="detail" class="dfinput" value=""  style="width:218px;"/></li>
       <li><label>&nbsp;</label><label>&nbsp;</label><input  type="submit"  class="btn" value="提交" /></a></li>
    </ul>
    
    
    
    
    
    
    
    </div> 
    
    
 	
</form>
</body>
</html>
