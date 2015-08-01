<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  

<div class="navbar-wrapper">
      <div class="container-fluid">

        <nav class="navbar navbar-inverse navbar-static-top navbar-fixed-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="<c:url value="/"/>"><div style="color:white"><b>Bell<span style="color:blue">Info</b></span></div>
              
              </a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
              <security:authorize ifNotGranted="ROLE_ANONYMOUS">
                <li ${home}><a href="<c:url value="/home"/>">Home</a></li>
                </security:authorize>
                <security:authorize ifNotGranted="ROLE_ANONYMOUS">
                <li ${upload}><a href="<c:url value="/upload"/>">Upload Docs</a></li>
                </security:authorize>
                </ul>
             
                
          <ul class="nav navbar-nav navbar-right">

      	    <security:authorize ifNotGranted="ROLE_ANONYMOUS">
      	    <li><a href="<c:url value="/logout"/>"><span class="glyphicon glyphicon-log-out"></span><font color="E30B2F"> Logout</a></li>
      	    </security:authorize>
        	</ul>
      	   </div>
          </div>
        </nav>

      </div>
    </div>