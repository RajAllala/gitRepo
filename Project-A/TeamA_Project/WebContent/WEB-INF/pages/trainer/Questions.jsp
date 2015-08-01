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
  <li role="presentation" ${Questions}><a href="<c:url value="/Questions"/>">Q&A</a></li>
  </ul>
</div>
	
	
	
	<div class="container">
	<div class="row">
<c:forEach var="item" items="${questions}">	          
	    <div class="container">
	             <div class="panel panel-primary">
      				<div class="panel-heading">
					<h3 class="panel-title">${item.username}</h3>
      				</div>
      		
      				<div class="panel-body" style="word-break: break-all;">
      					<div style="color:#000000">
       				 		${item.questionText}
      					</div>
      				</div>
      				
       <p> <a href="<c:url value="/viewquestion"/>/${item.id}" class="btn btn-success" role="button"><span class="glyphicon glyphicon-download-alt" aria-hidden="true">View Answer</span></a> 
    </div>
      </div>
      </c:forEach>
      </div>
  </div>
  </div>
  <script>
function openPopUp()
{
  $('#divId').css('display','block');
$('#divId').dialog();
}
</script>