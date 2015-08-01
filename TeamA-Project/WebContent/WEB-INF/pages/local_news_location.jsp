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
                  <a href="<c:url value="logout"/>" class="active-link">logout</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      </header>
      
		
	<div class="container">
    <div class="col-md-3">
        <div class="row">
            <table class="table">
           
            <tr class="active">
            <td> <h3>Want to share what's going on at your place?</h3>
           
           
            </div>
            <div class="col-md-3">
                <a href="<c:url value="/postnews"/>" class="btn btn-success"
                    role="button"> Click for Yes! </a>
                    </td>
            </tr>
            </div>
            </table>
            </div>
       
    </div>
   


        <ul align="center" class="nav nav-tabs" id="myTab">
            <li ><a href="local_news_index">All Posts</a></li>
            <li class="active"><a href="local_news_location">Posts by location</a></li>
            <li><a href="local_news_allnews">Your posts</a></li>
           
        </ul>
        </div>
       
		
		<div class="container">
		<c:forEach var="item" items="${news}">
		<p>Location: ${item.getZip()} - On : ${item.getDate()}</p> <br>
		<h3>Post:</h3>
		<h4><b>${item.getData()}</b></h4>
		<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
		
		<p><h7>Posted by : </h7> 
		<h5>${item.getUsername()}</h5>
		<hr>
		
		</c:forEach>
		</div>
</body>
</html>
