<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>   


    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <security:authorize ifNotGranted="ROLE_ANONYMOUS">
       <li><a href="<c:url value="/home"/>">Home</a></li>
        <li ><a href="<c:url value="/links"/>">Links</a></li>
         <li ><a href="<c:url value="/persons"/>">All Persons</a></li>
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



<div class="container">
<div class="well well-sm">

		<form method="post" action="j_spring_security_check" class="form-horizontal">

        <h2 class="form-signin-heading">Please SignIn</h2>
         
      <div class="form-group">
      <label  class="control-label col-xs-2" >User Name:</label>
       <div class="col-xs-10">
      <input type="username" id="username" name="username" class="form-control"  placeholder="User Name" required="true"/>
      </div>
      </div>
        
          <div class="form-group">
      <label  class="control-label col-xs-2" >Password:</label>
       <div class="col-xs-10">
      <input type="password" class="form-control" name="password" id="password" placeholder="Password" required="true"/>
      </div>
    </div>
       
    
      <div class="form-group">
    <button type="submit" class="btn  btn-primary pull-right">SignIn</button>
    </div>
    
      </form>
</div>
</div>
