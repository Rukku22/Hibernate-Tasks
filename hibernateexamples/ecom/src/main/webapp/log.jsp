<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
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
.log1 {
	background-color: LightGray;
	text-align: center;
	width: 100%;
	height: 400px;
}

.login {
	background-color: blue;
	width: 100%;
	text-align: center;
	height: 30px;
	text-decoration: none;
}

.first {
	background-color: blue;
	height: 93px;
}

.img {
	margin-left: 80px;
	width: 145px;
	height: 91px;
	margin-top: -58px;
}

.footer7 {
	display: flex;
	background-color: hotpink;
	margin-left: -3px;
	width: 100%;
	height: 100px;
}

.reg2 {
	text-align: center;
}
</style>
<body>
	<%


%>
	<form action="Login1">
		<div class="first">
			<div class=reg2>
				<h1 style="color: yellow; text-align: center;">Login Account</h1>
			</div>

			<img class="img"
				src="https://1000logos.net/wp-content/uploads/2021/02/Flipkart-Logo-2007.png">
		</div>
		<div class=log1>
			<br>
			<br>Enter username: <input type="text" name="name" required><br>
			<br>
			<br> Enter password: <input type="password" name="password"
				required><br>
			<br>
			<br> <input type="submit" value="Login">
			<!-- <footer class="login">
	<a style="text-decoration:none;color:aliceblue;" href="login1.jsp">Login</a>
 -->
			<!--  </footer> -->
			<%--  <%
 RequestDispatcher rd=request.getRequestDispatcher("Login1");  
 rd.forward(request,response);

 
 %>
 --%>
			<h3 style="text-align: center;">or</h3>
			<br>
			<div class="re">
				<a href="Register.jsp">Existing User?Register</a>
			</div>

		</div>
		<footer>
			<div class="footer7">
				<span style="margin-left: 1000px"> <img
					src="https://www.hostgator.in/ui/resellerdata/120000_149999/147142/supersite2/hostgator/themes/MinimalGreen-MyTheme/images/myUploadedImages/facebook1.png"></span>
				<span style="margin-left: 20px"> <img
					src="https://www.hostgator.in/ui/resellerdata/120000_149999/147142/supersite2/hostgator/themes/MinimalGreen-MyTheme/images/myUploadedImages/twiiter1.png"></span>
				<span style="margin-left: 20px"> <img
					src="https://www.hostgator.in/ui/resellerdata/120000_149999/147142/supersite2/hostgator/themes/MinimalGreen-MyTheme/images/myUploadedImages/youtube_red.png"></span>
			</div>


			</div>

		</footer>

	</form>
</body>
</html>