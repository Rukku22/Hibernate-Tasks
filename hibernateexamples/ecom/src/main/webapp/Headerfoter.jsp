<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.img{
margin-left: 80px;width:145px;height:91px;
}
.first{

background-color:blue; 
height:93px;
}
.second{

background-color:white;
 }
 .img3{
 border-radius:60px;
 width:57px;
margin-left:306px;
margin-top:10px;
 
 
 }
.reg{
    position:absolute;

       margin-left:900px;
       margin-top:-19px;
  }
.log{
    margin-left: 999px;
    margin-top:-19px;
 }
 .order{
    margin-left: 1200px;
    margin-top:-19px;
 }
 
.out{

margin-left:1300px;
margin-top:-19px;
  }
 .img1{
      
      width:30px;
       margin-left:1527px;
 }
 
 .cart{
 margin-left:1565px;
 margin-top:-19px;
 }
 .carticon{
 margin-top:-40px; 
  }
  
  .off{
 width:100%;
 height:80%;
 } 
.sty{
 width:100%;
 height:50%;
 } 

</style>
<body>
<%
 
String name=(String)session.getAttribute("name");
%>
<div class="first">
<img class="img" src="https://1000logos.net/wp-content/uploads/2021/02/Flipkart-Logo-2007.png"  >
<%
if(name!=null){
	 out.println("<a style=color:aliceblue;margin-left:500px; href='#'>"+name+"");
}
else{
%>		 
<a style="text-decoration:none;color:aliceblue;margin-left:800px;"href="log.jsp"><div class="log"><b>Login<b></a></div><% 
	 }
%> 
<%  
if(name!=null)
{
	out.println("<a style=text-decoration:none;color:aliceblue;margin-left:500px; href='logout.jsp'>Logout</a>");
} %>
<a style="text-decoration:none;color:aliceblue;" href="order.jsp"><div class="order"><b>Order<b></a></div>
<div class="carticon">  <img class="img1" src="https://www.freeiconspng.com/thumbs/cart-icon/basket-cart-icon-27.png" ></div>
<a style="text-decoration:none;color:aliceblue;" href="showcart.jsp"><div class="cart"><b>Cart<b></a></div>
</div>
</body>
</html>