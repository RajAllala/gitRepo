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
            
            
            <div ng-app="myapp1">
            
            <div ng-controller="tableCtrl">
            

    <div class="row">   
   <div class="col-md-10">  
    <label class="checkbox" ng-repeat="column in columns" style="display: inline;margin-left: 20px;">
       <input type="checkbox" ng-model="column.visible" /> 
         

    <div class="row">     

        {{column.title}}</label>
        </div>
	</div>

        <input  type="checkbox" ng-model="column.visible" /> {{column.title}}

    </label>
    </div>
<div id="content">
    <table ng-table="tableParams" id="table2excel" show-filter="true" class="table">

        <thead>

        <tr>
	
            <th ng-repeat="column in columns" ng-show="column.visible"

                class="text-center sortable" ng-class="{

                    'sort-asc': tableParams.isSortBy(column.field, 'asc'),

                    'sort-desc': tableParams.isSortBy(column.field, 'desc')

                  }"

                ng-click="tableParams.sorting(column.field, tableParams.isSortBy(column.field, 'asc') ? 'desc' : 'asc')">

                {{column.title}}

            </th>

        </tr>

        </thead>

        <tbody>
		
		
         <tr ng-repeat="user in data">

            <td ng-repeat="column in columns" ng-show="column.visible" sortable="column.field">

                {{user[column.field]}}

            </td>

        </tr>

        </tbody>
       
    </table> 
    </div>
    <div id="editor"></div>
<button id="cmd">generate PDF</button>
<button id="exec">Export</button>
    
    
    </div>
</div>
</div></div></div>
<script src="<c:url value="/resources/js/jquery.js"/>"></script>
<script src="<c:url value="/resources/js/pdf.js"/>"></script>
<script src="<c:url value="/resources/js/excel.js"/>"></script>

<script>


$(document).ready(function(){
	

	$('#exec').click(function(){
		  $("#table2excel").table2excel({
		    exclude: ".noExl",
		    name: "Excel Document Name"
		  });
		});
	
	
	var specialElementHandlers = {			
	    '#editor': function (element, renderer) {
	        return true;
	    }
	};

	
	$('#cmd').click(function () {
		var doc = new jsPDF();
	     doc.fromHTML($('#content').html(), 15, 15, {
	        'width': 170,
	            'elementHandlers': specialElementHandlers
	    });
	    doc.save('sample-file.pdf'); 

	});
	
});

</script>



   
    
    
    