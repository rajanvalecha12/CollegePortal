<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>one Student with following details added</b>
<ol>
<li>${studentObj.studentId}</li>
<li>${studentObj.studentName}</li>
<li>${studentObj.department}</li>
<li>${studentObj.academicScore}</li>
<li>${studentObj.sportsScore}</li>
<li>${studentObj.culturalScore}</li>

</ol>
<a href="first.htm">Add student</a>
</body>
</html>