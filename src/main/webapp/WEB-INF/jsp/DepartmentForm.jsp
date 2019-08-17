<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.error{color:red}
</style>
<body>
		<form:form action = "addvalidateDepartment" modelAttribute ="department" method="post">
			DepartmentName :<form:input path = "departmentName"/></br>
			<form:errors path="departmentName" cssClass="error"/><br><br>
			<input type="Submit" value = "Submit">  
		</form:form>
		
			</body>
</html>