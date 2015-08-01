var myapp=angular.module('myapp', []);

myapp.controller('myfirstcontroller',function($scope,$http){
	var specific=["pizza","schools","gas stations","movies","hospitals","offices"];
	
	$scope.myrestaurant='';
	$scope.results=[];
	$scope.zip='';
	$scope.addmyrestaurant=function(){

if($scope.myrestaurant.length!=5){
	alert("Please Enter valid ZIPCODE ")
}
		$scope.restaurants=[];
for(var i=0,tot=specific.length;i<tot;i++){
	
	$http({
		method:'JSONP',
			url: "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20local.search%20where%20zip= '"+$scope.myrestaurant+"'and%20query='"+specific[i]+"'&format=json&diagnostics=false&callback=JSON_CALLBACK"
					}).success(function(data,status,header,config){
		$scope.restaurants.push(data);
		$scope.myrestaurant='';
	})
	.error(function(data,status,header,config){
		alert('error');
	});

}
	}
	
	$scope.findloc=function(){
		
		if($scope.myrestaurant.length!=5){
			alert("Please Enter valid ZIPCODE ")
		}
		
		$http({
			method:'JSONP',
				url: "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20local.search%20where%20zip= '"+$scope.zip+"'and%20query='pizza'&format=json&diagnostics=false&callback=JSON_CALLBACK"
						}).success(function(data,status,header,config){
			$scope.results.push(data);
			if(data.query.results==null){
				alert('Invalid zip code');
			}
			$scope.zip='';
		})
		.error(function(data,status,header,config){
			alert('Invalid zip code');
		});
		
	}
	
	
	
});



