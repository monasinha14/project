<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
  <title></title>
  
  <link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-beta/css/bootstrap.min.css'>

  <link rel="stylesheet" href="style/style.css">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  
  <link href="https://fonts.googleapis.com/css?family=Montserrat" type="text/css" rel="stylesheet">
  
  <link href="https://fonts.googleapis.com/css?family=Questrial" type="text/css" rel="stylesheet">
  
  <link href="https://fonts.googleapis.com/css?family=Quicksand" type="text/css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">

* {
  margin: 0;
  padding: 0;
}

body, html {
  width: 100%;
  height: 100%;
  background-image: url('https://images.pexels.com/photos/46248/owl-hunt-nature-hunter-46248.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb');
  background-size: cover;
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position:center;
  overflow-x: hidden;
}

#ihf-logo {
  width: 5%; 
 /* bottom: 16px;
  left: 60px; */
  position: relative;
  bottom: 20%;
  margin: 0 4%;
}

.navbar {
  width: 100%;
  height: 60px;
  background-color: black;
}

ul {
  padding-right: 20px;
  float: right;  
}

ul li {
  font-family: "Questrial";
  display: inline;
  color: white;
  padding: 11px 35px; 
  font-size: 1.2em; 
}

ul li:hover {
  color: gray;
}

a {
  color: white;
}

a:hover {
  color: gray;
  text-decoration: none;
}

.active {
  border-bottom: solid 4px white;
}

.active:hover {
  color: white;
}


#heading {
  color: white;
  position: relative;
  top: 180px;
  text-align: center;
}

#subscribe {
  position: relative;
  top: 320px;
}

#email-field {
  width: 250px;
  margin: 0 5px;
}

#footnote {
  color: skyblue;
  margin: 10px 0;
  font-family: "Questrial";
}

#new {
  color: lime;
  font-weight: bold;
}

#overlay {
  width: 100%;
  height: 100%;
  background-color: rgba( 125, 60, 152, 0.6);
}

#btn {
  font-family: "Questrial";
  color: purple;
  padding: 0 5px;
}

h1 {
  font-family: "Montserrat";
  font-size: 3.6em;
}

h3 {
  font-family: "Questrial";
}

.copyright {
  text-align: center;
  position: relative;
}

#cp {
  color: gainsboro;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  text-align: center;
  opacity: 0.5;
  letter-spacing: 1px;
}


</style>
</head>
<body>
      
 <nav class="navbar">   
      <img src="images/ihf-white.png" id="ihf-logo">
      <ul>
        <a href=#><li class="active">Home</li></a>
        <a href=#><li>Mobiles</li></a>
        <a href=#><li>Laptops</li></a>
        <a href=#><li>SoundSystem</li></a>
       
        
      <li><input id="email-field" class="" type="text" placeholder=" Search..." required>
      <button id="btn" class="">Search</button></li>
     
       
      <c:if test="${pageContext.request.userPrincipal.name!=null}">
      <ul class="nav navbar-nav navbar-right">
       <a href="#"><li><span style="font-size:1.5em;" class="glyphicon glyphicon-user"></span></li></a>
    <li>   <a href="#"><span style="font-size:1.5em;" class="glyphicon glyphicon-shopping-cart"></span></a></li>
      <li>  Welcome:${pageContext.request.userPrincipal.name}</li>
     <li>   <a href="logout"></span> Logout</a></li>
      </ul>
      </c:if>
      
     
     
      </ul>
 </nav>  
 
      
 
  <div class="container">
  <div class="copyright">
      <p class="text-center" id="cp">&copy; 2017 MidasTouch  |  All Rights Reserved.</p>
      </div>
    </div>
</div>

    
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
    <script src="main.js"></script>

</body>
</html>