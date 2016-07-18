<%@ page language="java" import="java.util.*,com.upc.dao.Sleft" pageEncoding="utf-8"%>
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
<link href="../css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

</head>

<body><form action="<%=basePath%>servlet/SearchOutServlet" method="post">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">已离职员工</a></li>
    </ul>
    </div>
<div id="tab2" class="tabson">
    
    
  <ul class="seachform">
    
    <li><label>查询条件:</label></li>
    <li>
      <label>员工编号</label><input type="text" name="employee_no" class="dfinput" style="width:50px;"/></li>
      <li>
      <label>员工姓名</label><input type="text" name="employee_name" class="dfinput" style="width:50px;"/></li>
    <li>
      <label>部门名称</label><input type="text" name="dept_name" class="dfinput" style="width:50px;"/></li>          
    <li>
      <label>岗位名称</label><input type="text" name="job_name" class="dfinput" style="width:50px;"/></li>
      
    <li><label>离职类型</label><select class="select3" name="out_type" style="height: 30px; ">
    <option value="resign">主动辞职</option>
    <option value="refuse">辞退</option>
    <option value="retire">退休</option>
    <option value="expel">开除</option>
    </select>       
    
    <div class="vocation">
    
    </div>       
    </li>   
    <li>
      <label>开始日期</label><input type="text" name="workdate" class="dfinput" style="width:80px;"/></li>
      
    <li>
      <label>结束日期</label><input type="text" name="out_time" class="dfinput" style="width:80px;"/></li>
          
    <li><td> <input type="submit" valign="middle" value="搜索"  style="height: 32px; width: 85px; "/> </li>
    
    </ul>
    
    
    <table class="tablelist" align="center" border="1" width="800">    
    	<tr>
        <th>离职员工号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>身份证号</th>
        <th>部门</th>
        <th>岗位</th>
        <th>入职日期</th>
        <th>参加工作日期</th>
        <th>用工形式</th>        
        <th>离职日期</th>
        <th>离职类型</th>
        <th>离职去向</th>
        <th>备注</th>     </tr>                      
      
      
        <%
        
    List<Sleft> slefts=(List<Sleft>)request.getAttribute("slefts");
    if(slefts==null)
    {
     %>
     
     <%}else{
     for(Sleft sleft:slefts)
     {
      %>   
        <tr>        
        <td><%=sleft.getEmployee_no() %></td>
        <td><%=sleft.getEmployee_name() %></td>
        <td><%=sleft.getEmployee_sex() %></td>
        <td><%=sleft.getEmployee_birthday() %></td>
        <td><%=sleft.getEmployee_ID() %></td>
        <td><%=sleft.getDept_name() %></td>
        <td><%=sleft.getJob_name() %></td>
        <td><%=sleft.getIndate() %></td>
        <td><%=sleft.getWorkdate() %></td>
        <td><%=sleft.getWork_type() %></td>       
        <td><%=sleft.getOut_time() %></td>
        <td><%=sleft.getOut_type() %></td>
        <td><%=sleft.getOut_toward() %></td>
        <td><%=sleft.getDetail() %></td>                   
       </tr>
        
        
    
        </tbody>
        <%}} %>
    </table>
    
   
  
    
     
       
	
 
	
    
    
    
    
    
    </div>

</form>
</body>
</html>