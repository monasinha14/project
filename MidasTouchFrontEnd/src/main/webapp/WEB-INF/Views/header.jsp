<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
  <title>MidasTouch</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="frontEnd">MidasTouch</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li class="dropdown">
          <li><a href="category">Category</a></li>
      
        <li><a href="Products">Product</a></li>
        <li><a href="userindex">Supplier</a></li>
      </ul>
      <form class="navbar-form navbar-left">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Search</button>
    </form>
    <c:if test="${pageContext.request.userPrincipal.name==null}">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="signUp" ><span class=	"glyphicon glyphicon-user">SignUp</a></span></li>
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
      </c:if>
      <c:if test="${pageContext.request.userPrincipal.name!=null}">
      <ul class="nav navbar-nav navbar-right">
        <li>Welcome  : ${pageContext.request.userPrincipal.name}</li>
        <li><a href="logout">Logout</a></li>
      </ul>
      </c:if>
    </div>
  </div>
</nav>