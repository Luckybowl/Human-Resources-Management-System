<%@ page language="java" import="java.util.*,com.upc.dao.Employee" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<!--<link href="../css/select.css" rel="stylesheet" type="text/css" />-->
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="../js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>
 <script type="text/javascript"> 
      $("#usual1 ul").idTabs(); 
    </script>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
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
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body><form action="<%=basePath%>servlet/SearchInServlet" method="post">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">员工离职</a></li>
    </ul>
    </div>
<div id="tab3" class="tabson">
    
    
    <ul class="seachform">
    
    <li><label>查询条件:</label></li>
    <li>
      <label>部门编号</label><input type="text" name="dept_no" class="dfinput" style="width:80px;"/></li>
    
   <li>
      <label>部门名称</label><input type="text" name="dept_name" class="dfinput" style="width:80px;"/></li>
      
    <li>
      <label>员工编号</label><input type="text" name="employee_no" class="dfinput" style="width:80px;"/></li>
      
    <li>
      <label>员工姓名</label><input type="text" name="employee_name" class="dfinput" style="width:80px;"/></li>
      
    
    
    
    
    <input name="" type="submit" class="scbtn" value="查询"/></li>
    
      
    </ul>
    
    
    <table class="tablelist" align="center" border="1" width="800">
    	<tr>
        <th>员工号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>身份证号</th>
        <th>部门</th>
        <th>岗位</th>
        <th>入职日期</th>
        <th>参加工作日期</th>
        <th>用工形式</th>       
        <th>操作</th>
         </tr>           
        <%
    List<Employee> employees=(List<Employee>)request.getAttribute("employees");
    if(employees==null)
    {
     %>
     
     <%}else{
     for(Employee employee:employees)
     {
      %>  
     <tr>        
        <td><%=employee.getEmployee_no() %></td>
        <td><%=employee.getEmployee_name() %></td>
        <td><%=employee.getEmployee_sex() %></td>
        <td><%=employee.getEmployee_birthday() %></td>
        <td><%=employee.getEmployee_ID() %></td>
        <td><%=employee.getDept_no() %></td>
        <td><%=employee.getJob_no() %></td>
        <td><%=employee.getIndate() %></td>
        <td><%=employee.getWorkdate() %></td>
        <td><%=employee.getWork_type() %></td>       
       <td><input type=button onclick="window.open('Employee/fireE.jsp')" value="辞退" /></td>
                    </tr>
          <% } }%>  
  </table>
    
    </div>  
    
      
       
</form>
</body>
</html>
