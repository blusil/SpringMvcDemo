<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Movie Universe</title>
	<link href="assets/css/bootstrap.css" rel="stylesheet">
	<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
	<link rel="shortcut icon" href="assets/ico/favicon.ico">
</head>
<body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="addGoal.html">
            Welcome
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="hero-unit">
        <div>
          <h1>Couch Time!</h1>
          <p>Grab your popcorns, the show is about to start. Lights, Camera, Action!</p>
        </div>
        <a class="btn btn-primary" href="addGoal.html">
          ${greeting}
        </a>
        
        <a class="btn btn-primary" href="addMinutes.html">
          Add Exercise Minutes »
        </a>
      </div>
      <div>
      </div>
    </div>
    
    <script src="assets/js/bootstrap.js">
    </script>
  </body>
</html>