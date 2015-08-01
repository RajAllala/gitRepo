<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>  


<div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="<c:url value="/resources/images/corosl1.jpg"/>"  style="height:330px;width:500px" class="img-responsive center-block" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              
              
              <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="<c:url value="/resources/images/corosl2.jpg"/>"  style="height:330px;width:500px" class="img-responsive center-block"  alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
             
              
            </div>
          </div>
        </div>
        <div class="item">
          <img src="<c:url value="/resources/images/upload.jpg"/>" style="height:330px;width:500px"  class="img-responsive center-block" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->
<hr>
	<br>
	

    <div class="container marketing">
      <div class="row">
      <div class="col-lg-4">
          <img class="img-rounded" src="<c:url value="/resources/images/search1.jpg"/>" alt="Generic placeholder image" style="width: 240px; height: 200px;">
          <h2>Search for Docs</h2>
          <p>We provide very efficient Search engine, Search for your docs easily</p>
          </div>
        
        
        <div class="col-lg-4">
          <img class="img-rounded" src="<c:url value="/resources/images/index.jpg"/>" alt="Generic placeholder image" style="width: 240px; height: 200px;">
          <h2>We Index Docs</h2>
          <p>We index your Documents and extract the contents of them for Faster Retrieval using latest technology "Apache Lucene" and "Apache Tika" </p>
          
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-rounded" src="<c:url value="/resources/images/nlp1.jpg"/>" alt="Generic placeholder image" style="width: 240px; height: 200px;">
          <h2>Natural Language Processing !!</h2>
          <p>We provide very efficient Search engine, Search for your docs easily</p>
          </div>
      </div><!-- /.row -->

	<br>
      <!-- START THE FEATURETTES -->

      

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-5">
          <img class="featurette-image img-responsive" src="<c:url value="/resources/images/mail2.png"/>" style="width: 220px; height: 200px;" alt="Generic placeholder image">
        </div>
        <div class="col-md-7">
          <h2 class="featurette-heading">We Offer Mail Services too !! <span class="text-muted">See for yourself.</span></h2>
          <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
      </div>
</div>