<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>  
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>News Page</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-theme.min.css"/>">


</head>
<body>
<nav class="navbar navbar-default">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
       <a class="navbar-brand" href="<c:url value="/"/>">springMVC</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <security:authorize ifAnyGranted="ROLE_NEWS,ROLE_ADMIN">
        <li class="active"><a href="<c:url value="/home"/>">Home</a></li>
        </security:authorize>
        <security:authorize ifAnyGranted="ROLE_LINKS,ROLE_ADMIN">
        <li ><a href="<c:url value="/links"/>">Links</a></li>
        </security:authorize>
        <security:authorize ifAnyGranted="ROLE_PERSON,ROLE_ADMIN">
         <li ><a href="<c:url value="/persons"/>">All Persons</a></li>
         </security:authorize>
         <security:authorize ifNotGranted="ROLE_ANONYMOUS">
         <li><a href="<c:url value="/contact"/>">Contact</a></li>
         </security:authorize>
       
      </ul>
     
      <ul class="nav navbar-nav navbar-right">
      
         <security:authorize ifAnyGranted="ROLE_ANONYMOUS">
       <li><a href="<c:url value="/signin"/>">SignIn</a></li>
        </security:authorize>
        <security:authorize ifNotGranted="ROLE_ANONYMOUS">
         <li><a href="<c:url value="/logout"/>">logout</a></li>
         </security:authorize>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="jumbotron">
<div class="container">
<h1>${message}</h1>

</div>
</div>


<div class="container">
<div class="row">

<c:forEach var="item" items="${news}" >
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <div class="caption">
        <h2>${item.symbol} -- ${item.sourceTime}</h2>
        <h3>${item.headlines}</h3>
        <p> ${item.mainStory}</p>
      </div>
    </div>
</div>
</c:forEach>




</div>
</div>









</body>
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</html>