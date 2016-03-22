<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
	<form:form method="Post" action="first.htm">
<label>Student Id</label>
<form:input path="studentId"/>
<label>Student Name</label>
<form:input path="studentName"/>
<label>Academic Score</label>
<form:input path="academicScore"/>
<label>Sports Score</label>
<form:input path="sportsScore"/>
<label>Cultural Score</label>
<form:input path="culturalScore"/> 
<form:select path="department" items="${DepartmentList}"></form:select>

<input type="submit" value="add">
</form:form>
</body>
</html>