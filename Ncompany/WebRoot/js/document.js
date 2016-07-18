// JavaScript Document

function ma()
{
//	var user=document.forms[0].user.value;
//	var user=document.frm1.user.value;
    var user=document.getElementsByName("user")
	var d=document.getElementById("d1");
	if(user[0].value==null||user[0].value.length==0)
	{
		alert("鐜板湪閮ㄩ棬缂栧彿涓嶈兘涓虹┖");
	}
	else if(user[1].value==null||user[1].value.length==0)
	{
			alert("鍛樺伐缂栧彿涓嶈兘涓虹┖");
	}
	else if(user[2].value==null||user[2].value.length==0)
	{
		alert("璋冭浆閮ㄩ棬缂栧彿涓嶈兘涓虹┖");
	} 
	else if(user[1].value=="11")
	{
		window.location.href="../DeptmentSystem/changedept.html";
		}
	else
	{
		window.location.href="../DeptmentSystem/erroe.html";
		}
				 
}

function mb()
{
//	var user=document.forms[0].user.value;
//	var user=document.frm1.user.value;
    var user=document.getElementsByName("user")
	var d=document.getElementById("d1");
	if(user[0].value==null||user[0].value.length==0)
	{
		alert("鐜板湪閮ㄩ棬鑱屼綅涓嶈兘涓虹┖");
	}
	else if(user[1].value==null||user[1].value.length==0)
	{
			alert("鍛樺伐缂栧彿涓嶈兘涓虹┖");
	}
	else if(user[2].value==null||user[2].value.length==0)
	{
		alert("璋冭浆鑱屼綅涓嶈兘涓虹┖");
	} 
	else if(user[1].value=="11")
	{
		window.location.href="../DeptmentSystem/changedept.html";
		}
	else
	{
		window.location.href="erroe.html";
		}
				 
}
function del(tableID, obj)//鍒櫎褰撳墠琛�
{ 
//var currRowIndex=event.srcElement.parentNode.parentNode.rowIndex; 
//document.all.yltable.deleteRow(currRowIndex);
var se=confirm("纭畾鎻愪氦鍚楋紵");
if (se==true)
  {
	   var rowIndex = obj.parentElement.parentElement.rowIndex;
    //var table = document.getElementById(tableID).deleteRow(rowIndex);
    obj.parentElement.parentElement.parentElement.deleteRow(rowIndex);
  alert("鎻愪氦鎴愬姛锛�");
  }
else
  {
    }
}
				 
function del()
{
	if(confirm("确认调度"))
	{
		location.href="../DeptmentSystem/deptmove.jsp";
	}
}






	