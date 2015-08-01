var myapp = angular.module('myapp',[]);


myapp.controller('myfirstcontroller',function($scope,$http){
	
	var test = [angular.callbacks._0(
			{
			 "resultCount":50,
			 "results": [
			{"wrapperType":"track", "kind":"song", "artistId":257126278, "collectionId":574295703, "trackId":574295704, "artistName":"Aaren San", "collectionName":"Taman - Single", "trackName":"Taman", "collectionCensoredName":"Taman - Single", "trackCensoredName":"Taman", "artistViewUrl":"https://itunes.apple.com/us/artist/aaren-san/id257126278?uo=4", "collectionViewUrl":"https://itunes.apple.com/us/album/taman/id574295703?i=574295704&uo=4", "trackViewUrl":"https://itunes.apple.com/us/album/taman/id574295703?i=574295704&uo=4", "previewUrl":"http://a1143.phobos.apple.com/us/r30/Music/v4/cf/8e/7e/cf8e7e11-9417-2e50-cf10-1adc5233e743/mzaf_2965287033785844535.aac.m4a", "artworkUrl30":"http://a5.mzstatic.com/us/r30/Music/v4/98/7b/3c/987b3c0a-e4a0-c8b0-9d96-f08b739a2236/aepo024_cover.30x30-50.jpg", "artworkUrl60":"http://a2.mzstatic.com/us/r30/Music/v4/98/7b/3c/987b3c0a-e4a0-c8b0-9d96-f08b739a2236/aepo024_cover.60x60-50.jpg", "artworkUrl100":"http://a1.mzstatic.com/us/r30/Music/v4/98/7b/3c/987b3c0a-e4a0-c8b0-9d96-f08b739a2236/aepo024_cover.100x100-75.jpg", "collectionPrice":0.99, "trackPrice":0.99, "releaseDate":"2012-11-08T08:00:00Z", "collectionExplicitness":"notExplicit", "trackExplicitness":"notExplicit", "discCount":1, "discNumber":1, "trackCount":1, "trackNumber":1, "trackTimeMillis":347239, "country":"USA", "currency":"USD", "primaryGenreName":"Dance", "radioStationUrl":"https://itunes.apple.com/station/idra.574295704"}]})]
	
	

	var movieNames = ["frozen","batman","cars","inception","REAL STEEL"];
	$scope.movies=[];
	
	for(var i=0,tot=movieNames.length;i<tot;i++){
		var url="http://www.omdbapi.com/?t="+movieNames[i]+"&y=&plot=short&r=json&callback=JSON_CALLBACK";
		//alert(movieNames[i]);
//calling the actual rest API.... one at a time while running the loop....
		
		$http({
			method: 'JSONP',
			url:url
		}).success(function(data,status,header,config){
			$scope.movies.push(data);
		})
		.error(function(data,status,header,config){
			alert('error');
		});
		
	}
});



myapp.controller('mysecondcontroller',function($scope,$http){
	
	$scope.mymovie='';
	$scope.movies=[];
	
	$scope.addmymovie = function(){
		var url="https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20local.search%20where%20zip=%27"+$scope.mymovie+"%27and%20query=%27pizza%27&format=json&diagnostics=false&callback=JSON_CALLBACK";
		
		$http({
			method: 'JSONP',
			url:url
		}).success(function(data,status,header,config){
			$scope.movies.push(data);
			
		})
		.error(function(data,status,header,config){
			alert('error');
		});
		
		
		$scope.mymovie='';
	}
	
});











