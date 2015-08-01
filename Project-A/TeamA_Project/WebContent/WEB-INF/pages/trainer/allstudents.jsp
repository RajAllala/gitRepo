<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<div id="page-content-wrapper">

    <div class="row">
    <div class="col-lg-2"></div>
        <div class="col-md-10">

<div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-sqaure" src="<c:url value="/resources/images/web-user.jpg"/>" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Heading</h2>
          <p></p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        
      </div><!-- /.row -->
      </div>
     </div>
    </div>
  </div>
  
  <button class="my_popup_open">Open popup</button>

  <!-- Add content to the popup -->
  <div id="my_popup">

    <!-- Add an optional button to close the popup -->
    <button class="my_popup_close">Close</button>

  </div>

  <!-- Include jQuery -->
  <script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>

  <!-- Include jQuery Popup Overlay -->
  <script src="http://vast-engineering.github.io/jquery-popup-overlay/jquery.popupoverlay.js"></script>

  <script>
    $(document).ready(function() {

      // Initialize the plugin
      $('#my_popup').popup();

    });
  </script>
  