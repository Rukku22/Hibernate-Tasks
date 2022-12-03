<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.DriverManager" %>
    <%@page import=" java.sql.PreparedStatement"%>
      <%@page import=" java.sql.Statement"%>
        <%@page import=" java.sql.Connection"%>
         <%@page import=" java.sql.ResultSet"%> 
          
 <html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>  
.log1{

background-color:LightGray;
text-align:center;
width:700px;
}
</style>
<body>
<form action="Login1">
<div class=log1> 
    <h2 style="color:blue;">Login to Account</h2>
	Enter username: <input type="text" name="name" required><br><br>
	Enter password: <input type="password" name="password" required><br><br>
	<footer> 
 	<input style="background-color:blue;width:500px;text-align:center;height:30px;color:white;" type="submit"value="Login Account">
 	</footer>
 	<h3 style="text-align:center;">or</h3><br>
<div class="re"><a href="Register.jsp">Existing User?Register</a></div>
 	
</div>
</form> 
</body>
</html>