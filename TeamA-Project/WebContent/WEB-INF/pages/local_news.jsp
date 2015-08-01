<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

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
 <!-- Start: HEADER -->
    <header>
      <!-- Start: Navigation wrapper -->
      <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            <a href="index" class="brand brand-bootbus">
              NewsTwika
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
                  
                  <a href="<c:url value="local_news_index"/>"> View Posts</a>
                </li>
                          
                <li>
                  <a href="<c:url value="around"/>" class="active-link"> Around you</a>
                </li>
                
                <li>
                  <a href="<c:url value="logout"/>" class="active-link">logout</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      </header>
      <!-- End: Navigation wrapper -->
      
      <table class="table">
    <tr>
    <td> </td>
    </tr>
    </table>
  
  
     
     
      <div class="container">
              <form:form method="POST" action="/TeamA-Project/local_news_index">
   <table>
    <tr>
        <td><form:label path="data" >Post here</form:label></td>
        <td><form:input path="data" required="true" /></td>
    </tr>

    <tr>
        <td><form:label path="location">Zip code</form:label></td>
        <td><form:input path="location" required="true"/></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table> 
</form:form>
      </div>
        

<div class="navbar navbar-inverse navbar-fixed-bottom">     
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
</div>
</body>
</html>