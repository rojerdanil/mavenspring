<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/theme1/css/home.css" />" rel="stylesheet">\
<link href="<c:url value="/resources/theme1/css/bootstrap.css" />" rel="stylesheet">
<script src="<c:url value="/resources/theme1/js/jquery-1.12.1.min.js" />"></script>	
<script src="<c:url value="/resources/theme1/js/angular.min.js" />"></script>
<script>
$(document).ready(function(){
  
});
</script>
<style>
.empdiv
{
    background-color: white	;
    border: 9px solid #dadfe1;
    border-radius: 5px;
    margin-top: 10%;
   
    width: 36%;
}
.spanx
{
	
	color:red;
	
}
</style>
</head>
<body style="background-color:#E08283">
<div align="center">
<div  class="empdiv" >
<h2 style="background-color: #dadfe1;margin-top: 2px;">Employee Details</h2>
<div ng-app="" style=" padding: 5%;">

<form name="myForm" class="form-horizontal">
<div class="form-group">
 <label for="myname" class="control-label col-xs-2">Name:</label>
 <div class="col-xs-10">
 <input name="myName" id="myname" class="form-control" ng-model="myName" required>
 <div  ng-show="myForm.myName.$touched && myForm.myName.$invalid" class="spanx" align="left">The name is required.</div>
 </div>

</div>

<div class="form-group">
<label for="userId" class="control-label col-xs-2">Id No:</label>
<div class="col-xs-10">
<input name="userId" id="userId" class="form-control" ng-model="userId" required>
<div class="spanx" ng-show="myForm.userId.$touched && myForm.userId.$invalid" align="left">The id is required.</div>
</div>
</div>

<div class="form-group">
<label for="depart" class="control-label col-xs-2">Department:</label>
<div class="col-xs-10">
<select name="depart" class="form-control" id="depart" ng-model="depart" required>
<option>MCA</option>
<option>BSC</option>
</select>

</div>
</div>

	


</form>
</div>
</div>
</div>
</body>
</html>