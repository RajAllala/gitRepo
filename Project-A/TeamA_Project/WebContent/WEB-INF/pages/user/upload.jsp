<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 

<link type="text/css" rel="stylesheet" href="http://plupload.com/css/bootstrap.css" media="screen" />
<link type="text/css" rel="stylesheet" href="http://plupload.com/css/font-awesome.min.css" media="screen" />
<link type="text/css" rel="stylesheet" href="http://plupload.com/css/my.css" media="screen" />
<link type="text/css" rel="stylesheet" href="http://plupload.com/css/prettify.css" media="screen" />
<link type="text/css" rel="stylesheet" href="http://plupload.com/css/shCore.css" media="screen" />
<link type="text/css" rel="stylesheet" href="http://plupload.com/css/shCoreEclipse.css" media="screen" />




   


<div class="container">    
<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Uploaded Documents</div>
  <div class="panel-body">
  </div>
<ul class="nav nav-tabs">
  <li role="presentation" ${user}><a href="<c:url value="/user"/>">View Profile</a></li>
  <li role="presentation" ${upload}><a href="<c:url value="/upload"/>">upload</a></li>
  <li role="presentation" ${trainerreview_docs}><a href="<c:url value="/askquestions"/>">Ask a question</a></li>
<li role="presentation" ${Questions}><a href="<c:url value="/Questions"/>">Q&A</a></li>  </ul>
</div>

</div>








<br><br><br><br>
<div class="container">
<div id="uploader">
    <p>Your browser doesn't have Flash, Silverlight or HTML5 support.</p>
</div>
 



</div>