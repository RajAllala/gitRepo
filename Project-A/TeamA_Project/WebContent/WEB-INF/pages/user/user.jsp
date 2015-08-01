<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="container">    
<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Uploaded Documents</div>
  <div class="panel-body">
  </div>
<ul class="nav nav-tabs">
  <li role="presentation" ${user}><a href="<c:url value="/user"/>">View Profile</a></li>
  <li role="presentation" ${upload}><a href="<c:url value="/upload"/>">upload</a></li>
  <li role="presentation" ${trainerreview_docs}><a href="<c:url value="/askquestions"/>">Documents Uploaded</a></li>
<li role="presentation" ${Questions}><a href="<c:url value="/Questions"/>">Q&A</a></li>  </ul>
</div>


<br/><br/><br/><br/>
<div class="container">
<div class="row">


  <div class="col-sm-6 col-md-6">
  <div class="panel panel-default">
  <div class="panel-heading">
<%--  <h2>${user.username}</h2> --%>
    </div>
     <div class="panel-body">
 <h4><b>FirstName : </b>${users.first_name}</h4>
            <h4><b>JobLocation : </b>${users.last_name}</h4>
           <h4><b>Email id : </b>${users.username}</h4>
           <h4><b>Phone : </b>${users.phone_number}</h4>
         <%-- <h4><b>Username:</b>${user.username}</h4> --%>
         
    

 <%--    <div class="caption">
<p>
             
              <a href="<c:url value="/userforms"/>/${user.username}"class="btn btn-success" role="button">View Applications</a></p>
                 </div> --%>
  </div>
  </div>
  </div>
 
 
  
</div>
</div>
</div>