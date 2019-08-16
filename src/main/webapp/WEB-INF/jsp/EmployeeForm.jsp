<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error{color:red}
</style>
</head>
<body>
		<form:form action = "SubmitForm" modelAttribute ="emp" method="post">
			EmployeeId :<form:input path = "employeeId"/></br>
			<form:errors path="employeeId" cssClass="error"/><br><br>
			EmployeeName :<form:input path = "employeeName"/> </br>
			<form:errors path="employeeName" cssClass="error"/><br><br>
			EmployeeEmail :<form:input path = "email"/> </br>
			<form:errors path="email" cssClass="error"/><br><br>
			EmployeeContact :<form:input path = "contactNo"/> </br>
			<form:errors path="contactNo" cssClass="error"/><br><br>				
			<input type="Submit" value = "Submit">  
	</form:form>
</body>
</html>