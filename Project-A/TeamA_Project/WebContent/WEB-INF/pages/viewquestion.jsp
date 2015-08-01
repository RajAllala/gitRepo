<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>   
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<div class="container-fluid" align=center>
<img src="/stackoverflow/resources/images/stack.jpg/" width="300px" height="150px">

</div>
<br>

<div class="container">
<div class="well well-sm">
<h2>Question:</h2>
<h4>${question.questionText}</h4>

<h2>Answers:</h2>
<ol>
<c:forEach var="answer" items="${answers}">

<h3><li>
${answer.answerText}
</li></h3>

</c:forEach>
</ol>
<form:form method="post" action="viewquestion/${question.id}" class="form-horizontal">

        <h3 class="form-signin-heading"></h3>
         <security:authorize ifNotGranted="ROLE_ANONYMOUS">
          <div class="form-group">
          
      <form:label  class="control-label col-xs-4" path="answerText">Post Answer:</form:label>
       <div class="col-md-7">
      <form:input type="Text" id="text" name="Enter the question" class="form-control" path="answerText" placeholder="enter the question" required="true"/>
      </div>
    </div>
    <div class="centered">
    <button type="submit" class="btn  btn-primary">Post</button>
</div>
     
    </security:authorize>
     <security:authorize ifAnyGranted="ROLE_ANONYMOUS">
    <h4> Please <a href="<c:url value="/login"/>" class="btn btn-danger" role="button" > Login </a> to post your answer</h4>
     </security:authorize> 
     
      </form:form>

</div>