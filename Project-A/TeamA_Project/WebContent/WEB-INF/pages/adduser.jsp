<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<div id="page-content-wrapper">
 <div class="container">
<div id="signupbox" style="margin-top:50px" class="mainbox col-md-8 col-md-offset-3 col-sm-6 col-sm-offset-2">
      <div class="panel panel-info">
      <div class="panel-heading">
      <div class="panel-title">Register User</div>
        
        	</div>  
        	<form:form method="post" action="adduser" class="form-horizontal">

        <h3 class="form-signin-heading"> &nbsp Add User Info</h3>
          <div class="form-group">
             <div class="panel-body" >
          <div class="form-group">
      
          <div class="form-group">  
      <form:label  class="control-label col-xs-3" name="username" path="username">Email</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" name="username" path="username" placeholder="Email" required="true"/>
	  <div class="col-xs-2">
	   </div>
      </div>
 </div>
  <div class="form-group">
 <form:label for="authority" class="col-xs-3 control-label"  name="authority" path="authority">Role Type</form:label>
    <form:select name="authority" path="authority">
    <div class="col-xs-2">
   <form:option value="NONE" label="--- Select ---"/>
   <form:option value="student" label="Student"/>
   <form:option value="trainer" label="Trainer"/>
   <form:option value="employee" label="Employee"/>
   </div>
	</form:select> 
	<div class="col-xs-2">
	   </div>
 </div>
 
 	
 	<div class="col-xs-7">
	    <div class="form-group" >
	<br>   
    <button type="submit" class="btn  btn-primary pull-right">Submit Information</button>
    </div>
    </div>
    
 
 </div>
 </div>

 </div>
 </form:form>
 </div>
 </div>
 </div>
 </div>
