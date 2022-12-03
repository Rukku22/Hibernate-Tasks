<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style> 
.footer7{
background-color:hotpink;
}

</style>
<body>
  <%@     include file="Headerfoter.jsp" %>  

<form action="Order"></form>
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
 
<%
RequestDispatcher rd=request.getRequestDispatcher("Order");  
rd.include(request,response);

 %>
</div>
</body>
</html>