<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  

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
              NewsTwica 
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
              <security:authorize ifNotGranted="ROLE_ANONYMOUS">
                  <a href="local_news_index">View Posts</a>
                  </security:authorize>
                </li>
              <li>
              <security:authorize ifNotGranted="ROLE_ANONYMOUS">
                  <a href="postnews">Post News</a>
                  </security:authorize>
                </li>
                <li>
                  <a href="around">Around you</a>
                </li>
                <li>
                <security:authorize ifNotGranted="ROLE_PERSON">
                  <a href="signup">Sign up</a>
                  </security:authorize>
                </li>
                
                <li>
                <security:authorize ifNotGranted="ROLE_PERSON">
                  <a href="signin">Sign in</a>
                  </security:authorize>
                </li>
                <li>
                <security:authorize ifNotGranted="ROLE_ANONYMOUS">
                  <a href="logout">Log out</a>
                  </security:authorize>
                </li>
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
      <!-- Start: slider -->
      <div class="slider">
        <div class="container-fluid">
          <div id="heroSlider" class="carousel slide">
            <div class="carousel-inner">
              <div class="active item">
                <div class="hero-unit">
                  <div class="row-fluid">
                    <div class="span7 marketting-info">
                      <h1>
                       EXPLORE YOUR NEARBY PLACES
                      </h1>
                      <p>
                      'Around you' helps you find nearby restaurants,movie theaters,schools,
                        universities,hospitals city highlights and many more along with the distances.
                        Try it out....

                        
                      </p>
                      
                      
                    </div>
                    <div class="span5">
                      <img src="<c:url value="/resources/img/1.jpg"/>" class="thumbnail">
                    </div>
                  </div>
                  
                </div>
              </div>
              
              <div class="item">
                <div class="hero-unit">
                  <div class="row-fluid">
                    <div class="span7 marketting-info">
                      <h1>
                        TWEET YOUR NEWS TO THE WORLD
                      </h1>
                      <p>
                     You can post latest news by signing in to our application and let people know the city highlights.
                        you can use our application by signing in.Are you still not a member...?
                        Please sign up for more interesting stuff.

                        
                      </p>
                      
                      
                    </div>
                    <div class="span5">
                      <img src="<c:url value="/resources/img/2.jpg"/>" class="thumbnail">
                    </div>
                  </div>
                  
                </div>
              </div>
              <div class="item">
                <div class="hero-unit">
                  <div class="row-fluid">
                    <div class="span7 marketting-info">
                      <h1>
                        TELL US YOUR EXPERIENCE AND KNOW MORE
                      </h1>
                      <p>
                        Tell us about your experience on the latest happenings in the City,
                        you can filter your search to get local and all news. Local news search help you in
                        finding the tweeted news and you can even view the news that you have tweeted.Get started!!!!
                      </p>
                     
                      
                    </div>
                    <div class="span5">
                      <img src="<c:url value="/resources/img/placeholder.jpg"/>" class="thumbnail">
                    </div>
                  </div>
                  
                </div>
              </div>
            </div>
            <a class="left carousel-control" href="#heroSlider" data-slide="prev">
             
            </a>
            <a class="right carousel-control" href="#heroSlider" data-slide="next">
            </a>
          </div>
        </div>
      </div>
      <!-- End: slider -->
      <!-- Start: PRODUCT LIST -->
     
      <!-- End: PRODUCT LIST -->
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