<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Logout">
<%

RequestDispatcher rd=request.getRequestDispatcher("Logout");  
rd.include(request,response);

%>



</form>
</body>
</html>