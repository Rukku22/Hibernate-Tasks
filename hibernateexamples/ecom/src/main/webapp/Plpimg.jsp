<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Headerfoter.jsp" %>  

<form action="/Pdpwomen">
   
<% 
RequestDispatcher req1=request.getRequestDispatcher("Pdpwomen");
((RequestDispatcher) request).include(request, response);
%>

 </form>
     <%@ include file="footer.jsp" %>  

</body>
</html>