var myapp1 = angular.module('myapp1',['ngTable']);

myapp1.controller('tableCtrl',function($scope,$http,$filter, ngTableParams){
	
	$scope.data =[];
	
	var url="http://localhost:8080/TeamA_Project/service/api/users";
	
	$http({
		//method: 'JSONP',
		url:url
	}).success(function(data,status,header,config){
		
		$scope.data= data;
		console.log("data",$scope.data);
	})
	.error(function(data,status,header,config){
		alert('error');
	});
	
	$scope.columns = [

        {title: 'FirstName', field: 'first_name', visible: true, filter: { 'first_name': 'text' } },
        {title: 'LastName', field: 'last_name', visible: true, filter: { 'last_name': 'text' } } ,
        {title: 'VisaStatus', field: 'visa_status', visible: true, filter: { 'visa_status': 'text' }}, 
        {title: 'Username', field: 'username', visible: true, filter: { 'username': 'text' } },
        {title: 'Phonenumber', field: 'phone_number', visible: true, filter: { 'phonenumber': 'text' } }
        ];
	
	
	$scope.tableParams = new ngTableParams({
        page: 1,            // show first page
        count: 10,          // count per page
        filter: {
            first_name: 'M'       // initial filter

        }

    }, {

        total: $scope.data.length, // length of data
        getData: function($defer, params) {
            // use build-in angular filter
            var orderedData = params.sorting() ?
                    $filter('orderBy')($scope.data, params.orderBy()) : $scope.data;
            $defer.resolve(orderedData.slice((params.page() - 1) * params.count(), params.page() * params.count()));

        }

    });	
})
