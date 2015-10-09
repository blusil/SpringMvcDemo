<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="myApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Universe</title>
<link href="resources/css/bootstrap.css" rel="stylesheet">
</head>
<body ng-controller="moviesController">
	<div class="navbar navbar-inverse">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand" href="*">${greeting}</a>
				<ul class="nav">
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="container">
			<div class="jumbotron">
				<h1>Couch Time! Grab on to your seats</h1>
				<p>Grab your popcorns, the show is about to start. Lights,
					Camera, Action!</p>
			</div>
		</div>
		<div class="page-header">
			<h1>{{message}}</h1>
		</div>


		<div ng-repeat="movie in movies | orderBy:'title' ">
			<div class="col-md-4 col-lg-4">
				<a href="#movieDetails/{{movie.id}}">
					<div class="thumbnail">
						<img ng-src="{{movie.imageUrl}}" alt="{{movie.imageUrl}}"
							title="{{movie.title}}" data-toggle="tooltip" />
						<div class="caption">
							<h3>{{ movie.title }}</h3>
							<p>Genre: {{ movie.genre }}</p>
							<p>Rating: {{ movie.rating }}</p>
						</div>
					</div>
				</a>
			</div>
		</div>

	</div>

	<script type="text/javascript"
		src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
	<script type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/myApp.js"></script>

</body>
</html>