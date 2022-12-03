<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.first{

background-color:blue; 
height:93px;
}
.img{
margin-left: 80px;width:145px;height:91px;
}
.img1{
      
      width:30px;
      margin-top:-45px;
      margin-left:1529px;
 }
 
 .cart{
 margin-left:1565px;
 margin-top:-19px;
 }
 #carticon{
  margin-top:-20px;
 }
.log{
    margin-left: 1100px;
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
.kids{
margin-left:230px;
width:200px;
}
.women{
margin-left:300px;
width:200px;

}
.men{
margin-left:360px;
width:176px;
border-radius:200px;
}
.reg{
    position:absolute;

       margin-left:900px;
       margin-top:-19px;
  }

</style>
<body>
<%
String name=(String)session.getAttribute("name");
%>
 <div class="first">
<img class="img" src="https://1000logos.net/wp-content/uploads/2021/02/Flipkart-Logo-2007.png"  >
<a style="text-decoration:none;color:aliceblue;" href="Register.jsp"><div class="reg"><b>Register<b></a></div>

 <%
 out.println(name);
 if(name!=null){
	 out.println("<a href='#'>"+name+"");
 }
 
 else{
		%><a style=color:white;margin-left:400px;href="log.jsp"><div>Login</a></div><% 
	 }
if(name!=null)
  {
	out.println("<a href='Logout.java'>Logout</a>");
   } %>
   
<a style="text-decoration:none;color:aliceblue;" href="order.java"><div class="order"><b>Order<b></a></div>
<a style="text-decoration:none;color:aliceblue;" href="Showcart.java"><div class="cart"><b>Cart<b></a></div>
<div id="carticon"> <img class="img1" src="https://www.freeiconspng.com/thumbs/cart-icon/basket-cart-icon-27.png" ></div>
</div>
<div class="produts">
<img class="kids" src="https://www.designfreelogoonline.com/wp-content/uploads/2017/02/000802-free-happy-children-logo-design-free-logo-maker-04.png">
 <img class="women" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT35-cKviq0EqU_ZCbonTl71OFZrZpyx8S2Rw&usqp=CAU">
 <img class="men" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNlOHpL-LfstZBT5W9m-8z06BHObNckuWLpA&usqp=CAU">
</div>

</body>
</html>