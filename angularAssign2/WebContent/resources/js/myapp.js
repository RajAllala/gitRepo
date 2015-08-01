var myapp = angular.module('myapp',[]);


myapp.controller('mycontroller',function($scope,$http){
	
	$scope.location= '';
	$scope.details= [];
	
	
	$scope.searchresult = function(){
		var url="https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20location="+$scope.location+"&format=json&diagnostics=true&callback=JSON_CALLBACK";
		
		if($scope.location.length!=5){
			alert("No city Found with given ZIP code - INVALID");
		}
		$http({
			method: 'JSONP',
			url:url
		}).success(function(data,status,header,config){
			$scope.details= [];
			$scope.details.push(data.query.results.channel);
			
			
		})
		.error(function(data,status,header,config){
		});
		
		
		$scope.location='';
		
	}
	
});