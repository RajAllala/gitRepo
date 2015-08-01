<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<div id="header">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<h1>Simple landing page</h1>
					<h2 class="subtitle">No need huge slogan, we believe in less is better</h2>
					<form:form class="form-inline signup" role="form">
					  <div class="form-group">
					    <form:input type="email" path="email" class="form-control" id="exampleInputEmail1" placeholder="Enter your email address"/>
					  </div>
					  <button type="submit" class="btn btn-theme">Go</button>
					</form:form>					
				</div>
				<div class="col-lg-4 col-lg-offset-2">
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					  <ol class="carousel-indicators">
						<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
						<li data-target="#carousel-example-generic" data-slide-to="1"></li>
						<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					  </ol>					
					  <!-- slides -->
					  <div class="carousel-inner">
						<div class="item active">
						  <img src="assets/img/slide1.png" alt="">
						</div>
						<div class="item">
						  <img src="assets/img/slide2.png" alt="">
						</div>
						<div class="item">
						  <img src="assets/img/slide3.png" alt="">
						</div>
					  </div>
					</div>		
				</div>
				
			</div>
		</div>
	</div>