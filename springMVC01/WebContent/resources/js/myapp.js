var myapp = angular.module('myapp',['ngMap']);


myapp.controller('mycontroller',function($scope,$http){
	
	$scope.zip= '';
	$scope.searchquery= '';
	$scope.details= [];
	
	
	$scope.searchresult = function(){
		var url="https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20local.search%20where%20zip=%27"+$scope.zip+"%27and%20query=%27"+$scope.searchquery+"%27&format=json&diagnostics=false&callback=JSON_CALLBACK";
		
		$http({
			method: 'JSONP',
			url:url
		}).success(function(data,status,header,config){
			$scope.details.push(data);
			
		})
		.error(function(data,status,header,config){
			alert('error');
		});
		
		
		$scope.zip='';
		$scope.searchquery='';
	}
	
});