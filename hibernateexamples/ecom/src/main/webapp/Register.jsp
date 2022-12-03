<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <html>
<head>
 <style>
 .psw1{margin-left:-225px;
  }
  .psw2{margin-left:117px;
  margin-top:-18px
  }
  .psw3{margin-left:-250px;
  margin-top:-32px;
  }
   
 .container{
     text-align: center;
    background-color: LightGray;
    width: 100%;
    height: 625px;
    padding: 70px 0px 0px 0px;
}
  }
  .link{
  margin-left:611px;
  }
  .first{

background-color:blue; 
height:93px;
}
  .img{
margin-left: 80px;width:145px;height:91px;margin-top:-53px;
}
.image{
background-color:hotpink;
width:100%;
height:70px;
}
 #n1{
 width:10px;
 }
 #n2{
 width:10px;
 }
  .footer7{
               display: flex;
               background-color:hotpink;
               margin-left:-3px;
               width:100%;
               height:100px;
                     }
                     .innercontainer{
                     padding: 50px;
   /*  border: 1px solid black; */
    width: 396px;
    margin-left: 657px;
    border-radius:5px;
    box-shadow: 0px -5px 10px 0px rgba(0, 0, 0, 0.5);
    background-color:azure;
    
}
                    
 </style>
 </head>
<body>
  <form action="Register1">
  <div class=total> 
  <div class="first">
  <div class=reg1><h1 style="color:yellow;text-align:center;">User Registration Form</h1></div>
  <img class="img" src="https://1000logos.net/wp-content/uploads/2021/02/Flipkart-Logo-2007.png"  >
  </div>
  
<div class="container">
    <div class="innercontainer">
    
<label for="name"style="margin-left:20px"><b>FirstName:</b></label>
<input type="text"style="margin-left:23px" placeholder="Enter firstname" name="FirstName" required ><br><br><br><br>
<label for="name"style="margin-left:20px"><b>LastName:</b></label> 
 <input type="text" style="margin-left:20px"placeholder="Enter Lastname" name="LastName" required ><br><br><br><br>
 <label for="email"style="margin-left:41px"><b>Email id:</b></label>
 <input type="email"style="margin-left:20px"placeholder="Enter Email" name="Email" required><br><br><br><br>
 <label for="psw"style="margin-left:20px"><b>Password:</b></label>
<input type="password" style="margin-left:36px"placeholder="Enter Password" name="Password" required ><br><br><br><br>
 <label for="psw" ><b><div class="psw1">Mobile number:</b></div></label> 
 <div class="psw2"><input type="number"  placeholder="ener number"  name="mobile" required></div><br><br>
 	<input style=text-align:center;background-color:yellow;color:black;" type="submit"value="submit">
  <div class="link"> 
       <a href="Login.jsp">if already registered?Login</a>
</div>
 </div>
 </div>
 </div>
  </form>
  <footer>
<div class="footer7"> 
        <span style="margin-left:1000px">   <img  src="https://www.hostgator.in/ui/resellerdata/120000_149999/147142/supersite2/hostgator/themes/MinimalGreen-MyTheme/images/myUploadedImages/facebook1.png"></span>
  <span style="margin-left:20px">   <img  src="https://www.hostgator.in/ui/resellerdata/120000_149999/147142/supersite2/hostgator/themes/MinimalGreen-MyTheme/images/myUploadedImages/twiiter1.png"></span>
   <span style="margin-left:20px">  <img src="https://www.hostgator.in/ui/resellerdata/120000_149999/147142/supersite2/hostgator/themes/MinimalGreen-MyTheme/images/myUploadedImages/youtube_red.png"></span></div>
     
     
 </div> 
 </footer>
  </div>
</body>
</html>