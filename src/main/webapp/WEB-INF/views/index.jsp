<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/pivotal.css" />" />
<title>SpringClient-Customer: Home</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a title="Spring IO" href="http://www.spring.io"> 
					<img src="<c:url value="resources/images/spring-trans-dark.png"/>"	height="50" /> 
					</a>
				</div>
				<div>
					<ul class="nav navbar-nav navbar-right">
					<li>
					  <a href="http://www.pivotal.io"> 
					    <img alt="Pivotal"	title="Pivotal" height="20"
								src="<c:url value="resources/images/pivotal-logo-600.png" />" />
						</a>
					</li>
					</ul>
				</div>
			</div>
		</div>
		</nav>
	</div>
	<div class="row">
		<h1>Spring Customer Web - Home Page</h1>
		<ul>
			<li><a href="/customerList">View Customer List</a></li>
		</ul>	
	</div>
	</div>

</body>
</html>