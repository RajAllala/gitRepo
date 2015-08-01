<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  
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
       <li><a href="<c:url value="/home"/>">Home</a></li>
       </security:authorize>
       <security:authorize ifAnyGranted="ROLE_LINKS,ROLE_ADMIN">
        <li ><a href="<c:url value="/links"/>">Links</a></li>
        </security:authorize>
         <security:authorize ifAnyGranted="ROLE_PERSON,ROLE_ADMIN">
         <li class="active"><a href="<c:url value="/persons"/>">All Persons</a></li>
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
<h3>${title}</h3>
</div>
</div>
