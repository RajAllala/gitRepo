<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<br/><br/><br/><br/>
<div class="container">
<div class="row">
<c:forEach var="user" items="${student}">

  <div class="col-sm-6 col-md-6">
  <div class="panel panel-default">
  <div class="panel-heading">
 <h2>${user.username}</h2>
    </div>
     <div class="panel-body">
 <h4><b>FirstName:</b>${user.first_name}</h4>
            <h4><b>JobLocation :</b>${user.last_name}</h4>
           <h4><b>Email id</b>${user.phone_number}</h4>
         <h4><b>Username:</b>${user.username}</h4>
         
    

 <%--    <div class="caption">
<p>
             
              <a href="<c:url value="/userforms"/>/${user.username}"class="btn btn-success" role="button">View Applications</a></p>
                 </div> --%>
  </div>
  </div>
  </div>
  </c:forEach>
 
  
</div>
</div>