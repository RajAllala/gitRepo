<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<div ng-app="myapp">
<div class="container" ng-controller="mycontroller">
  <div class="row">
	<h2>Search Documents</h2>
     <div id="custom-search-input">
       <div class="input-group col-md-12">
            <input type="text" class="  search-query form-control" placeholder="Search" ng-model="search" />
             <span class="input-group-btn">
                 <button class="btn btn-danger" type="button" ng-click="hello()">
                    <span class=" glyphicon glyphicon-search"></span>
                  </button>
         	 </span>
        </div>
	 </div>
	</div>
	
	</br></br>
	
	<div class="container">
	<div class="row">
	          
	          
	          <div ng-repeat="item1 in results"> 
	          <!-- <div ng-if="!item1"> -->
	    <div class="container">
	      <div class="col-sm-12 col-md-12" ng-repeat ="item in item1 |startFrom:currentPage*pageSize | limitTo:pageSize">
	             <div class="panel panel-primary">
      				<div class="panel-heading">
       						 <h3 class="panel-title">{{item.filename}}</h3>
      				</div>
      		
      				<div class="panel-body" style="word-break: break-all;">
      					<div style="color:#000000">
       				 		{{item.fileContent}}
      					</div>
      				</div>
       <p> <a href="<c:url value="/downloadfile"/>/{{item.fileId}}" class="btn btn-success" role="button"><span class="glyphicon glyphicon-download-alt" aria-hidden="true"> Download</span></a> 
    </div>
      </div>
      </div>
 
      </hr>
     
      <p class="text-center" ng-show="item1">
      <button class="btn btn-danger " ng-disabled="currentPage == 0" ng-click="currentPage=currentPage-1">
        Previous
    </button>
    Page:{{currentPage+1}} /{{numberOfPages()}}
    <button class="btn btn-danger "ng-disabled="currentPage >= results[0].length/pageSize - 1" ng-click="currentPage=currentPage+1">
        Next
    </button>
      </p>
      
    </div>
  </div>
  </div>
 
</div>
<hr>
</div>

