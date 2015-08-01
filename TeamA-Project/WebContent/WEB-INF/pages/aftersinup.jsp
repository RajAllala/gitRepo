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
            <a href="<c:url value="/"/>" class="brand brand-bootbus">NewsTwica</a>
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
    <div class="container">
    <h2>Thanks For SignUp !!!</h2>
    </div>
    
    
    <div class="container">
     
        <form class="form-signin" method="post" action="j_spring_security_check">
        <div class="well well-sm">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Username</label>
        <input type="username" id="username" name="username" class="form-control" placeholder="Username" required="true">
        <label for="inputPassword" class="sr-only">Password</label> <br>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password" required="true">
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
    
   </div> 
    
    
    
   
    <!-- End: MAIN CONTENT -->
    <!-- Start: FOOTER -->
    
    <div class="navbar navbar-inverse navbar-fixed-bottom">
    <footer>
      <div class="container">
        <p>
          &copy; 2012-3000 Local News Search, Inc. All Rights Reserved.
        </p>
      </div>
    </footer>
    </div>
    <!-- End: FOOTER -->
   <script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js"/>">
        </script>
        <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>">
        </script>
        <script type="text/javascript" src="<c:url value="/resources/js/boot-business.js"/>">
        </script>
</body>
</html>