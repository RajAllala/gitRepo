<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewsTwica</title>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome-ie7.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/boot-business.css"/>" rel="stylesheet">
</head>
<body>
<header>
      <!-- Start: Navigation wrapper -->
      <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            <a href="<c:url value="/"/>" class="brand brand-bootbus">Local News Search</a>
            <!-- Below button used for responsive navigation -->
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <!-- Start: Primary navigation -->
            <div class="nav-collapse collapse">        
              <ul class="nav pull-right">
                
                <li><a href="<c:url value="around"/>" class="active-link"> Around you</a></li>
                <li><a href="<c:url value="signin"/>" class="active-link">Sign in</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <!-- End: Navigation wrapper -->   
    </header>
    <!-- End: HEADER -->
    <!-- Start: MAIN CONTENT -->
    <div class="content">
      <div class="container">
        <div class="page-header">
          <h1>Signup to NewsTwica</h1>
        </div>
        <div class="row">
          <div class="span6 offset3">
            <h4 class="widget-header"><i class="icon-gift"></i> Be a part of Local news </h4>
            <div class="widget-body">
              <div class="center-align">
              <div class="container">
              <h4>${error}</h4>
              </div>
                
                <form:form method="post" action="/TeamA-Project/aftersinup" class="form-horizontal">
                   <div class="form-group">
      <form:label  class="control-label col-xs-2" path="username">Name:</form:label>
       <div class="col-sm-10">
      <form:input type="name" class="form-control" path="username" placeholder="Name" required="true"/>
      </div>
    	</div>
       <hr>
       <div class="form-group">
      <form:label  class="control-label col-xs-2" path="email">Email:</form:label>
         <div class="col-sm-10">
      <form:input type="email" class="form-control" path="email" placeholder="Email" required="true"/>
      </div>
    </div>
       <hr> 

           <div class="form-group">
      <form:label  class="control-label col-xs-2" path="password">Password:</form:label>
       <div class="col-sm-10">
      <form:input type="password" class="form-control" path="password" placeholder="password" required="true"/>
      </div>
    </div>
    <hr>
         <div class="form-group">
    <button type="submit" class="btn  btn-primary">Sign Up</button>
    </div>
    
      </form:form>
      <hr>
     </div>
      </div>
      <h4><i class="icon-question-sign"></i> Already have an account?</h4>
       <a href="signin" class="btn btn-large bottom-space">Signin</a>
                
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- End: MAIN CONTENT -->
    <!-- Start: FOOTER -->
    <footer>
      
      <div class="container">
        <p>
          &copy; 2012-3000 Local News Search, Inc. All Rights Reserved.
        </p>
      </div>
    </footer>
    <!-- End: FOOTER -->
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js"/>">
        </script>
        <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>">
        </script>
        <script type="text/javascript" src="<c:url value="/resources/js/boot-business.js"/>">
        </script>
</body>
</html>