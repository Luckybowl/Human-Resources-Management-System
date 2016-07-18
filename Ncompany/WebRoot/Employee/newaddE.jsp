<%@ page language="java" import="java.util.*,com.upc.dao.Employee" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head> 
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>新增员工</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="searchfakedata.js"></script>

<link href="../css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
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
</base>
</head>

<body><form action="<%=basePath%>servlet/InsertEmployeeServlet" method="post" name="firm1">

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="../index.html">首页</a></li>
    <li><a href="#">新增员工</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    
    <div id="usual1" class="usual"> 
    
    <div class="itab">
  	<ul> 
    <li><a href="#tab1" class="selected">新增员工</a></li> 
  	</ul>
    </div> 
    
  	<div id="tab1" class="tabson">
    <ul class="forminfo">
   
    <li>
      <label>新增员工号<b>*</b></label><input name="employee_no"   type="text"  class="dfinput" onblur="ma()" style="width:218px;"/><span id="u"></span></li>
      <li>
     <label>姓名<b>*</b></label><input name="employee_name"   type="text" class="dfinput" value=""  style="width:218px;" onblur="mb()" /><span id="p"></span></li>
      <li><label>性别<b>*</b></label>  
    

    <div class="vocation"  >
    <select class="select1" name="employee_sex">
    <option value="男">男</option>
    <option value="女">女</option>  
    </select>
    </div>
    </li>
<li>
      <label>出生日期<b>*</b></label><input name="employee_birthday"   type="text" class="dfinput" value=""  style="width:218px;"onblur="mc()" /><span id="a"></span></li>
      <li>
<li>
      <label>身份证号<b>*</b></label><input name="employee_ID"   type="text" class="dfinput" value=""  style="width:218px;"onblur="md()" /><span id="b"></span></li>
       <li><label>部门名称<b>*</b></label>  
    <div class="vocation"  >
    <select class="select1" name="dept_no">
    <option value="dept1">人事部</option>
    <option value="dept2">财务部</option>
    <option value="dept3">销售部</option>
    <option value="dept4">企划部</option>
    <option value="dept5">总部</option>
     </select>
    </div>
    </li>
      <li><label>岗位名称<b>*</b></label>  
    <div class="vocation"  >
    <select class="select1" name="job_no">
    <option value="job1">人事助理</option>
    <option value="job2">人事主管</option>
    <option value="job3">销售员</option>
    <option value="job4">文案专员</option>
    <option value="job5">总经理</option>
     </select>
    </div>
    </li>
      <li>
      <label>入职日期<b>*</b></label><input name="indate"   type="text" class="dfinput" value=""  style="width:218px;"onblur="mg()" /><span id="e"></span></li>
      <li>
      <label>参加工作日期<b>*</b></label><input name="workdate"   type="text" class="dfinput" value=""  style="width:218px;"onblur="mh()" /><span id="f"></span></li>
    
     <li><label>用工形式<b>*</b></label>  
    <div class="vocation"  >
    <select class="select1" name="work_type">
    <option value="正式员工">正式员工</option>
    <option value="临时员工">临时员工</option>
   
    </select>
    </div>
    </li>

      
    <li><label>人员来源<b>*</b></label>  
    

    <div class="vocation"  >
    <select class="select1" name="person_source">
    <option value="校园招聘">校园招聘</option>
    <option value="社会招聘">社会招聘</option>
    <option value="其他">其他</option>
    </select>
    </div>
    </li>
    <li><label>政治面貌<b></b></label>
    
    
    <div class="vocation" >
    <select class="select1" name="political_status">
    <option value="党员">党员</option>
    <option value="预备党员">预备党员</option>
    <option value="团员">团员</option>
    <option value="其他">其他</option>
    </select>
    </div>
    </li>
    
    <li><label>民族<b></b></label>
    
    
    <div class="vocation" >
    <select class="select1" name="nation">
    <option value="汉族">汉族</option>
    <option value="维吾尔族">维吾尔族</option>
    <option value="满族">满族</option>
    <option value="苗族">苗族</option>
    </select>
    </div>
    </li>
    
   
    
    
    
    
    
    <li><label>籍贯<b></b></label>
    
    <div class="usercity" >
    
    <div class="cityleft">
    <select class="select2" name="place">
    <option value="江苏">江苏</option>
    <option value="湖南">湖南</option>
    <option value="广东">广东</option>
    <option value="北京">北京</option>
    <option value="湖北">湖北</option>
    </select>
    </div>      
     
    <li>
      <label>联系电话</label><input type="text" name="phone" class="dfinput" style="width:218px;"/></li>
     <li>
      <label>电子邮件</label><input type="text" name="email" class="dfinput" style="width:218px;"/></li>
     <li>
      <label>身高</label><input type="text" name="height" class="dfinput" style="width:218px;"/></li>
      <li><label>血型<b></b></label>
    
    <div class="vocation" >
    <select class="select3" name="blood_type">
    <option value="A型">A型</option>
   <option value="B型">B型</option>
    <option value="AB型">AB型</option>
    <option value="O型">O型</option>
    <option value="其他血型">其他血型</option>
    
    </select>
    </div>
    
    
    
    </li>
     <li><label>婚姻状况<b></b></label>
    
  
    
    <div class="cityleft">
    <select class="select2" name="marriage">
    <option value="已婚">已婚</option>
    <option value="未婚">未婚</option>
    <option value="丧偶">丧偶</option>
    <option value="离婚">离婚</option>
    </select>
    </div>
      <li>
      <label>出生地</label><input type="text" name="birthplace" class="dfinput" style="width:218px;"/></li>
       <li>
      <label>户口所在地</label><input type="text" name="familyplace" class="dfinput" style="width:218px;"/></li>
     <li><label>最高学历<b></b></label>
    
  
    
    <div class="cityleft" >
    <select class="select2" name="degree">
    <option value="高中及以下">高中及以下</option>
    <option value="大专">大专</option>
    <option value="本科">本科</option>
    <option value="研究生">研究生</option>
    </select>
    </div>
     <li><label>最高学位<b></b></label>
    
    <div class="usercity" >
    
    <select class="select2" name="academic">
    <option value="无学位">无学位</option>
    <option value="学士">学士</option>
    <option value="双学士">双学士</option>
    <option value="硕士">硕士</option>
    <option value="博士">博士</option>
    <option value="博士后">博士后</option>
    </select>
    </div>
    <li>
      <label>毕业院校<b></b></label><input name="school"  type="text" class="dfinput" value=""  style="width:218px;"/></li>
      <li>
      <label>所学专业<b></b></label><input name="major"  type="text" class="dfinput" value=""  style="width:218px;"/></li>
    <li>
      <label>毕业日期<b></b></label><input name="graduatedate"  type="text" class="dfinput" value=""  style="width:218px;"/></li>
   
    </div>
   
    
    
   
   <label>&nbsp;</label><li><label>&nbsp;</label><input  type="submit"  class="btn" value="提交"  onclick="alert('提交成功')"/></li>
    </ul>
    
    </div> 
    
    
  	
</form>
</body>

</html>
