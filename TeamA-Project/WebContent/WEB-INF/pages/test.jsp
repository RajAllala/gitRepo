<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Local News Search</title>
	<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome-ie7.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/boot-business.css"/>" rel="stylesheet">
    
</head>
<body>
 <!-- Start: HEADER -->
    <header>
      <!-- Start: Navigation wrapper -->
      <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            <a href="index.html" class="brand brand-bootbus">
              Local News Search
            </a>
            
            <!-- Below button used for responsive navigation -->
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
              <span class="icon-bar">
              </span>
              <span class="icon-bar">
              </span>
              <span class="icon-bar">
              </span>
            </button>
            <!-- Start: Primary navigation -->
            <div class="nav-collapse collapse">
              
              <ul class="nav pull-right">
                
                
                <li>
                  <a href="<c:url value="around"/>" class="active-link"> Around you</a>
                </li>
                
                <li>
                  <a href="<c:url value="index"/>" class="active-link">logout</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      </header>
      <!-- End: Navigation wrapper --> 
      
      <div class="container">
	  <c:forEach var="item" items="${news}">
	  
	  <h3>${item.getZip()}</h3>
	  <h3>${item.getUsername()}</h3>
	  <h3>${item.getData()}</h3>
	  <h3>${item.getDate()}</h3>
	  <hr>
	  </c:forEach>      
      
      </div>
      
      
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