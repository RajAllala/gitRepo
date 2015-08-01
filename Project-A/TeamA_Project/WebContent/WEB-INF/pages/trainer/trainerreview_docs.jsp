<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 


<div class="container">    
<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Uploaded Documents</div>
  <div class="panel-body">
  </div>
<ul class="nav nav-tabs">
  <li role="presentation" ${trainer}><a href="<c:url value="/trainer"/>">Students Info</a></li>
  <li role="presentation" ${trainer_sendmails}><a href="<c:url value="/trainer_sendmails"/>">Message</a></li>
  <li role="presentation" ${trainerreview_docs}><a href="<c:url value="/trainerreview_docs"/>">Documents Uploaded</a></li>
<li role="presentation" ${Questions}><a href="<c:url value="/Questions"/>">Q&A</a></li>  </ul>
</div>
  <!-- Table -->
  <table class="table">
    <tr>
    <th>Name</th>
    <th>Technology</th>
    <th>Date</th>
    <th>Type</th>
    <th>Download</th>
  </tr>
  <c:forEach var="item" items="${docs}">
  <tr>
  <td>${item.user_email}</td>
  <td>${item.usertype}</td>
  <td>${item.uploded_date}</td>
  <td>${item.content_type}</td>
  <td> &nbsp &nbsp &nbsp&nbsp 
   <a href="<c:url value="/downloadfile"/>/${item.id}" class="btn btn-success" role="button">
  <span class="glyphicon glyphicon-download-alt" aria-hidden="true"></span></a></td>  
  </tr>
  </c:forEach>
  </table>
</div>
</div>
</div>
</div>
</div>
