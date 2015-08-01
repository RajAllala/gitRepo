var apple=angular.module('apple',[]);

apple.controller('applecontroller', function($scope,$http){
	
	$scope.app='';
	$scope.appstore=[];
	
	
	$scope.storesearch = function(){
		//var url = "https://itunes.apple.com/search?term="+$scope.myalbum+"&r=json&callback=JSON_CALLBACK";
		var url="https://itunes.apple.com/search?term="+$scope.app+"&country=us&entity=software&r=json&callback=JSON_CALLBACK"
		$http({
			method: 'JSONP',
			url:url
		}).success(function(data,status,header,config){
			$scope.appstore=[];
			$scope.appstore.push(data);
			
		})
		.error(function(data,status,header,config){
			alert('Check your Internet Connection');
		});

		$scope.app='';
		
	}
});