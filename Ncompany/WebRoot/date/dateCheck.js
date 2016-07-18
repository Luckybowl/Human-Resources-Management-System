function checkdate(){
 var pattern = /^((((1[6-9]|[2-9]\d)\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})-0?2-(0?[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$/;
 var flag1 = pattern.test(chooseForm.startDate.value);
 var flag2 = pattern.test(chooseForm.endDate.value);
 
 
 if(chooseForm.startDate.value.length==0||chooseForm.endDate.value.length==0){
  document.getElementById("message").innerHTML="<font color=red>时间不能为空！</font>";
   chooseForm.startDate.focus();
 return false;
 }
 else if(!flag1 || !flag2){
 document.getElementById("message").innerHTML="<font color=red>时间格式不正确！</font>";
  chooseForm.startDate.focus();
 return false;
 }   
 else{
  return true;
 }      
 }