<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.cart{
background-color:orange;
height:50px;
display:flex;
}
 
</style>
<body>
<form action="Showcart"> 
<div class="cart" >
  <a style=text-decoration:none; href="Homepage.jsp"><div id=ho>Homepage</a></div>
  <a style=text-decoration:none; href="orderlink.jsp"><div style="margin-left:300px";>Order</a></div>
 <a style=text-decoration:none; href="/Checkout"><div style="margin-left:600px;">Checkout</a></div>

<%
String name=(String)session.getAttribute("name");
 
%>
<% if(name!=null){
	 out.println("<a href='#'>"+name+"");
	 RequestDispatcher rd=request.getRequestDispatcher("Showcart");  
     rd.include(request,response);
   }
else{
	 out.println("<div style=margin-left:400px;>");

		 out.println("<a href='/log.jsp'>Login</a></div>");
		 
		  }

%>
</div>
 <%
 
%>
<footer>
<div>

</div>

</footer>
 
</form>
 </body>
</html>