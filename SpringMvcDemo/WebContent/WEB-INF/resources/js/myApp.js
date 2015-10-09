angular.module('myApp', [])
	    .service('movieService', function ($q, $log, $http) {	        
	    	// public API closure
	    	return ({
	        	getMovies: getMovies
	        }); 
	        
	        function getMovies() {
	        	var request = $http({
	        		method: "GET",
	        		url: "http://localhost:8080/SpringMvcDemo/movies.html"
	        	});
	        	
	        	return (request.then(handleSuccess, handleError));
	        };
	        
	        function handleError(response) {
	        	return( $q.reject( response.data.message ) );
	        };
	        
	        function handleSuccess(response) {
	        	return( response.data );
	        };
	    })
	    .controller('moviesController', function ($scope, $log, movieService) {
	    	$scope.movies = [];
	    	$scope.message = "May the force be with you";
	    	
	        movieService.getMovies().then(function(data) {
	            $scope.movies = data;
	            $log.info($scope.movies);
	          }, function(error) {
	            $log.error(error);
	          });
	    });
