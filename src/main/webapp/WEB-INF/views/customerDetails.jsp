<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" page
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/pivotal.css" />" />
<title>Spring Client: Customer Details</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a title="Spring IO" href="http://www.spring.io"> <img
						src="<c:url value="resources/images/spring-trans-dark.png"/>"
						height="50" />
					</a>
				</div>
				<div>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="http://www.pivotal.io"> <img alt="Pivotal"
								title="Pivotal" height="20"
								src="<c:url value="resources/images/pivotal-logo-600.png" />" />
						</a></li>
					</ul>
				</div>
			</div>
			</nav>
			<div style="text-align: right">
				[ <a href="<c:url value='/'/>">Home</a> | <a href="customerList">Customers</a>
				]
			</div>
		</div>
		<div class="row">
			<h1>Customer Details</h1>

			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3">Customer:</div>
					<div class="col-sm-9">${customer.id}</div>
				</div>
				<div class="row">
					<div class="col-sm-3">Firstname:</div>
					<div class="col-sm-9">${customer.firstname}</div>
				</div>
				<div class="row">
					<div class="col-sm-3">Lastname:</div>
					<div class="col-sm-9">${customer.lastname}</div>
				</div>
				<div class="row">
					<div class="col-sm-3">email:</div>
					<div class="col-sm-9">${customer.email}</div>
				</div>

			</div>

		</div>
	</div>
</body>
</html>