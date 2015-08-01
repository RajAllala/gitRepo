/*
 * AngularJS Application Module
 * Author @Rajashekhar
 * Monday January 12,2015
 */

var myapp = angular.module('myapp',['ngRoute','ngAnimate']);

myapp.config(function($routeProvider){
	
	$routeProvider
	.when('/',{templateUrl:'frags/home.html',controller:'homeCtrl'})
	.when('/movies',{templateUrl:'frags/movies.html', controller:'movieCtrl'})
	.when('/browse',{templateUrl:'frags/browse.html', controller:'browseCtrl'})
	.when('/contact',{templateUrl:'frags/contact.html', controller:'contactCtrl'})
	.when('/error',{templateUrl:'frags/error.html', controller:'errorCtrl'})
	
	.otherwise({
		redirectTo:'/error'
	})
	 
});

myapp.controller('homeCtrl',function($scope,$http){
	$scope.message="In Home controller";
	$scope.pageClass="page-home";
});

myapp.controller('movieCtrl',function($scope,$http){
	$scope.message="In movie controller";
	$scope.pageClass="page-movies";
});

myapp.controller('browseCtrl',function($scope,$http){
	$scope.message="In browse controller";
	$scope.pageClass="page-browse";
});

myapp.controller('contactCtrl',function($scope,$http){
	$scope.message="In contact controller";
	$scope.pageClass="page-contact";
});

myapp.controller('errorCtrl',function($scope,$http){
	$scope.message="Oops, No Page Found !!!";
	$scope.pageClass="page-error";
});


myapp.controller('navCtrl',function($scope,$location){
	$scope.isActive=function(viewLocation){
		return viewLocation === $location.path();
	}
});