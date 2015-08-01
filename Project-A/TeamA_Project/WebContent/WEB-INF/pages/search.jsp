<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myapp">
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css"> 
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.theme.min.css">
<head>
<style>
.panel-body{
color: black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<!-- <link data-require="bootstrap-css@2.3.2" data-semver="2.3.2" rel="stylesheet" href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" />
    <script data-require="angular.js@1.1.5" data-semver="1.1.5" src="http://code.angularjs.org/1.1.5/angular.min.js"></script>
    <script data-require="angular-ui-bootstrap@0.3.0" data-semver="0.3.0" src="http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.3.0.min.js"></script> -->
	<!-- <script src="resources/js/myapp.js" type="text/javascript"></script> -->

<title>Insert title here</title>
</head>
 <body ng-controller="mycontroller">
<div class="navbar-wrapper">
  <div class="container">
  <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">

    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
       <a class="navbar-brand">DocExchange</a>
    </div>
    
    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
       
  
        
      </ul>
     
      <ul class="nav navbar-nav">
         
          <form class="navbar-form navbar-right" role="search">
                <div class="form-group form-group-lg">
            <input type="text" class="form-control" id="formGroupInputLarge" placeholder="Please enter the search string" ng-model="search">
          </div>
          <button type="submit" class="btn-btn-primary" ng-click="hello()">search</button>
           
        </form>
        
      </ul>
    </div>
    </div>
    </nav>
  </div>
</nav>

    
    
<br/><br/><br/><br/>
	          
	           <div class="container">
				<div class="row">
	          <!-- <div ng-controller="hello"> -->
	          
	         
	          <div ng-repeat="item1 in results"> 
	          <div class="container">
	          <div class="col-sm-12 col-md-12" ng-repeat ="item in item1 |startFrom:currentPage*pageSize | limitTo:pageSize">
	             
        
        <div class="panel panel-primary">
      <div class="panel-heading">
        <h3 class="panel-title">{{item.Filename}}</h3>
      </div>
      <div class="panel-body" style="word-break: break-all;">
      <div style="color:#000000">
        {{item.FileContent}}
        </div>
      
      </div>
      <p><a class="btn btn-primary " href="#" role="button">Download</a></
    </div>
        
      </div>
      </div>
      </div>
      </hr>
      <p class="text-center">
      <button class="btn btn-danger " ng-disabled="currentPage == 0" ng-click="currentPage=currentPage-1">
        Previous
    </button>
    Page:{{currentPage+1}}/{{numberOfPages()}}
    <button class="btn btn-danger "ng-disabled="currentPage >= data.length/pageSize - 1" ng-click="currentPage=currentPage+1">
        Next
    </button>
      </p>
      
    </div>
  </div>
	        
</div>	           
</body>
 <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
<script src="<c:url value="/resources/js/myapp.js"/>"></script>
 
 
</html>



