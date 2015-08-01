<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>   

   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %> 
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
  <li role="presentation" ${askquestion}><a href="<c:url value="/askquestions"/>">Ask a Question</a></li>
<li role="presentation" ${Questions}><a href="<c:url value="/Questions"/>">Q&A</a></li>  </ul>
</div>


<br/><br/><br/><br/>



<div class="container">
<div class="well well-sm">



<form:form method="post" action="askquestions" class="form-horizontal">

        <h2 class="form-signin-heading">Please Enter your question</h2>
         
          <div class="form-group">
      <form:label  class="control-label col-xs-2" path="questionText">Question:</form:label>
       <div class="col-sm-9">
      <form:input type="Text" id="text" path="questionText" name="Enter the question" class="form-control"  placeholder="enter the question" required="true"/>
      </div>
    </div>
    
    <div class="centered">
    <button type="submit" class="btn  btn-primary">Submit</button>
</div>
      <div class="form-group">
    
    </div>
    
      </form:form>

</div>
</div>