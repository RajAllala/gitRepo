<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 


<div id="page-content-wrapper">
 <div class="container-fluid">
     <div class="row">
         <div class="col-lg-2"></div>
            <div class="col-lg-10">          
        	<a href="#menu-toggle" class="btn btn-default" id="menu-toggle">
            <span class="glyphicon glyphicon-move" aria-hidden="true"></span></a>


<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Uploaded Documents</div>
  <div class="panel-body">
  </div>
<ul class="nav nav-tabs">
  <li role="presentation" ${review_docs}><a href="<c:url value="/admin/review_docs"/>"> Students</a></li>
  <li role="presentation" ${employee_docs}><a href="<c:url value="/admin/employee_docs"/>">Employee</a></li>
  </ul>
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
