

/*
 * Angular js framework
 * Author : Mahesh
 * Created_date:01/12/15
 * 
 */

var myapp1= angular.module('myapp1',['nvd3']);


myapp1.controller('dashboardCtrl', function($scope,$http,$location){
    $scope.optionsDonut = {
        chart: {
            type: 'pieChart',
            height: 450,
            donut: true,
            x: function(d){return d.key;},
            y: function(d){return d.y;},
            showLabels: true,

            pie: {
                startAngle: function(d) { return d.startAngle/2 -Math.PI/2 },
                endAngle: function(d) { return d.endAngle/2 -Math.PI/2 }
            },
            transitionDuration: 500,
            legend: {
                margin: {
                    top: 5,
                    right: 140,
                    bottom: 5,
                    left: 0
                }
            }
        }
    };
    
    $scope.optionspie = {
        chart: {
            type: 'pieChart',
            height: 450,
            donut: true,
            x: function(d){return d.key;},
            y: function(d){return d.y;},
            showLabels: true,
            transitionDuration: 500,
            legend: {
                margin: {
                    top: 5,
                    right: 140,
                    bottom: 5,
                    left: 0
                }
            }
        }
    };
    
    $scope.discreteBarchartoptions = {
            chart: {
                type: 'discreteBarChart',
                height: 450,
                margin : {
                    top: 20,
                    right: 20,
                    bottom: 60,
                    left: 55
                },
                x: function(d){return d.key;},
                y: function(d){return d.value;},
                showValues: true,
                valueFormat: function(d){
                    return d3.format(',.4f')(d);
                },
                transitionDuration: 500,
                xAxis: {
                    axisLabel: 'X Axis'
                },
                yAxis: {
                    axisLabel: 'Y Axis',
                    axisLabelDistance: 30
                }
            }
        };
        
        
        
        
        
        
         /*$scope.discreteBarchartData = [
            {
                key: "Cumulative Return",
                values: [
                    {
                        "label" : "A" ,
                        "value" : -29.765957771107
                    } ,
                    {
                        "label" : "B" ,
                        "value" : 0
                    } ,
                    {
                        "label" : "C" ,
                        "value" : 32.807804682612
                    } ,
                    {
                        "label" : "D" ,
                        "value" : 196.45946739256
                    } ,
                    {
                        "label" : "E" ,
                        "value" : 0.19434030906893
                    } ,
                    {
                        "label" : "F" ,
                        "value" : -98.079782601442
                    } ,
                    {
                        "label" : "G" ,
                        "value" : -13.925743130903
                    } ,
                    {
                        "label" : "H" ,
                        "value" : -5.1387322875705
                    }
                ]
            }
        ];
   */
    $scope.fileTypeSizeData = [];
    $scope.fileTypeCountData = [];
    $scope.discreteBarchartData=[];
    $scope.piedata=[];
    
    //fileTypeSize
     var url =  $location.path()+"/TeamA_Project/service/api/TechType/count";
    $http.get(url).success(function(data, status, headers, config) {
    for (var key in data){
      $scope.fileTypeSizeData.push({key:data[key].key,y:data[key].value});}    
    }).
    error(function(data, status, headers, config) {     });
    
    
    // fileTypeCount
     var url2 =  $location.path()+"/TeamA_Project/service/api/VisaType/count";
     $http.get(url2).success(function(data, status, headers, config) {
    for (var key in data){
      $scope.fileTypeCountData.push({key:data[key].key,y:data[key].value});}    
    }).
    error(function(data, status, headers, config) {     });    
     
     
     //var url3 =  "/TeamA_Project/service/api/UserType/count";
     var url3 =$location.path()+"/TeamA_Project/service/api/UnivType/count";
     $http.get(url3).success(function(data, status, headers, config) {
    for (var key in data){
      $scope.discreteBarchartData.push({key:data[key].key,y:data[key].value});}    
    }).
    error(function(data, status, headers, config) {   });
     
     var url3 =$location.path()+"/TeamA_Project/service/api/UserType/count";
     $http.get(url3).success(function(data, status, headers, config) {
    for (var key in data){
      $scope.piedata.push({key:data[key].key,y:data[key].value});}    
    }).
    error(function(data, status, headers, config) {   });
     
     

});

myapp.controller('mycontroller',function($scope,$http,$location){

	$scope.search='';
	$scope.results=[];
	$scope.pageSize=6;
	$scope.currentPage=0;

$scope.hello= function(){
	
	
	$http({
		//method:'JSONP',
	  
		url:$location.path()+"/docxchange/searching?query="+$scope.search+"&callback=JSON_CALLBACK"

		}).success(function(data,status,header,config){
			$scope.results=[];
			$scope.results.push(data);
			
		})
		.error(function(data,status,header,config){
			alert('error');
	   });
	
	$scope.numberOfPages=function(){
		
        return Math.ceil($scope.results[0].length/$scope.pageSize);                
    }
	
	 
	
}
});


myapp.filter('startFrom', function() {
    return function(input, start) {
        start = +start; //parse to int
        return input.slice(start);
    }
});








