<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  

<div class="navbar-wrapper">
      <div class="container-fluid">

        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="<c:url value="/"/>">
              <font color="#4CADA3"><b>DOCXchange</b></font>
              <!-- <font color="#FA6473"><b></b></font> -->
              </a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
              <security:authorize ifNotGranted="ROLE_ANONYMOUS">
                <li ${home}><a href="<c:url value="/home"/>"><span class="glyphicon glyphicon-home" style="color:#26A9D1"></span> Home</a></li>
                </security:authorize>
                <security:authorize ifNotGranted="ROLE_ANONYMOUS">
                <li ${upload}><a href="<c:url value="/upload"/>"><span class="glyphicon glyphicon-upload" style="color:#70D15C"></span> Upload Docs</a></li>
                </security:authorize>
                </ul>
             
                
          <ul class="nav navbar-nav navbar-right">
          
          <security:authorize ifNotGranted="ROLE_USER">
        	<li ${registration}><a href="<c:url value="/registration"/>"><span class="glyphicon glyphicon-user" style="color:#1FB0E0"></span> Register</a></li>
        	</security:authorize>
        	
        	<security:authorize ifNotGranted="ROLE_USER">        	
      	    <li ${signin}><a href="<c:url value="/signin"/>"><span class="glyphicon glyphicon-log-in" style="color:#08634D"></span> Sign in</a></li>
      	    </security:authorize>
      	    
      	    <security:authorize ifNotGranted="ROLE_ANONYMOUS">
      	    <li><a href="<c:url value="/logout"/>"><span class="glyphicon glyphicon-log-out" style="color:#C2382F"></span> Logout</a></li>
      	    </security:authorize>
        	</ul>
      	   </div>
          </div>
        </nav>

      </div>
    </div>