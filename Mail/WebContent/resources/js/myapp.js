var myapp = angular.module('myapp',[]);

myapp.controller('mycontroller',function($scope,$http,$interval){
	
	$scope.callAtInterval = function() {
        console.log("$scope.callAtInterval - Interval occurred");
    }
	
	$scope.details=[];
	setTimeout(function(){
			$scope.$apply(function(){
		var url="http://localhost:8080/Mail/mail.json";
		
		$http({
			url:url
		})
		.success(function(data,status,header,config){
			$scope.details.push(data);
		})
		.error(function(data,status,header,config){
			alert('error');
		});
	  }
	)},100000)
});