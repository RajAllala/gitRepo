<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  

<!DOCTYPE html>
<html ng-app="myapp">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Bootbusiness | Short description about company">
    <meta name="author" content="Your name">
    <title>Around You</title>
    <!-- Bootstrap -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>  </head>
<!--   <body ng-controller="mythirdcontroller"> -->
    



<body ng-controller="myfirstcontroller">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
       
      </button>
     
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
    
        <li><a href="index"><h2><b><font color="white">NewsTwica</font></b></h2></a></li>
       
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="ZipCode" ng-model="myrestaurant">
<!--           <input type="text" class="form-control" placeholder="Specific" ng-model="myquery"> -->
          </div>
          
        <button type="submit" class="btn btn-default" ng-click="addmyrestaurant()"> Search</button>
      </form>
          
      <ul class="nav navbar-nav navbar-right">
      <security:authorize ifNotGranted="ROLE_ANONYMOUS">
        <li><a href="postnews"><b><font color="white">Post News</font></b></a></li>
        </security:authorize>
          <li>
                <security:authorize ifNotGranted="ROLE_PERSON">
                  <a href="signup"><b><font color="white">Sign up</font></b></a>
                  </security:authorize>
                </li>
                
                <li>
                <security:authorize ifNotGranted="ROLE_PERSON">
                  <a href="signin"><b><font color="white">Sign in</font></b></a>
                  </security:authorize>
                </li>
        <security:authorize ifNotGranted="ROLE_ANONYMOUS">
        <li><a href="logout"><b><font color="white">Log out</font></b></a></li>
        </security:authorize>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav> 
<div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="section-heading"><center>Your Search Results</center></h1>
 </div>
 </div>
 </div>
 
<hr>

<div class="row">
<div class="container">
<div class=" col-md-6" ng-repeat="res in restaurants " >
  
  <p><h3>{{res.query.results.Result[0].Categories.Category[1].content}}</h3></p>            
  <table class="table table-bordered" >
    <thead>
      <tr class="danger">
        <th>Title</th>
        <th>City</th>
        <th>Address</th>
        <th>Distance</th>
        <th>Total Ratings</th>
      </tr>
    </thead>
    <tbody>
      <tr class="info">
        <td>{{res.query.results.Result[0].Title}}</td>        
        <td>{{res.query.results.Result[0].City}}</td>
        <td>{{res.query.results.Result[0].Address}}</td>
        <td>{{res.query.results.Result[0].Distance}}
        <td>{{res.query.results.Result[0].Rating.TotalRatings}}</td>
      </tr>
      <tr class="danger">
        <td>{{res.query.results.Result[1].Title}}</td>        
        <td>{{res.query.results.Result[1].City}}</td>
        <td>{{res.query.results.Result[1].Address}}</td>
        <td>{{res.query.results.Result[1].Distance}}
        <td>{{res.query.results.Result[1].Rating.TotalRatings}}</td>
      </tr>
      <tr class="info">
        <td>{{res.query.results.Result[2].Title}}</td>        
        <td>{{res.query.results.Result[2].City}}</td>
        <td>{{res.query.results.Result[2].Address}}</td>
        <td>{{res.query.results.Result[2].Distance}}
        <td>{{res.query.results.Result[2].Rating.TotalRatings}}</td>
      </tr>
      <tr class="danger">
        <td>{{res.query.results.Result[3].Title}}</td>        
        <td>{{res.query.results.Result[3].City}}</td>
        <td>{{res.query.results.Result[3].Address}}</td>
        <td>{{res.query.results.Result[3].Distance}}
        <td>{{res.query.results.Result[3].Rating.TotalRatings}}</td>
      </tr>

    </tbody>
  </table>
</div>
</div>
</div>

</body>



  <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.theme.min.css">
  <script src="resources/js/angular.min.js"></script>
<script src="resources/js/myapp.js"></script>
</html>