<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

<!-- Required meta tags -->
<!-- <meta charset="utf-8"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<title>Bookstore</title>
</head>

<body>

	<div class="container">

		<br>

		<h1>This is a simple CRUD REST API for a bookstore</h1>


		<br>

		<div class="container">
			<div class="row">
				<div class="col-3">
					<h3>
						<strong>METHOD</strong>
					</h3>
				</div>
				<div class="col-3">
					<h3>
						<strong>ROUTE</strong>
					</h3>
				</div>
				<div class="col-6">
					<h3>
						<strong>EXAMPLE</strong>
					</h3>
				</div>
			</div>

			<div class="row">
				<span class="border"></span>
				<div class="col-3">
					<h5>GET</h5>
				</div>
				<div class="col-3">
					<h5>
						<a href="/api/books">/api/books</a>
					</h5>
				</div>
				<div class="col-6"></div>
			</div>
			<div class="row">
				<span class="border"></span>
				<div class="col-3">
					<h5>GET</h5>
				</div>
				<div class="col-3">
					<h5>/api/books/1</h5>
				</div>
				<div class="col-6"></div>
			</div>
			<div class="row">
				<span class="border"></span>
				<div class="col-3">
					<h5>POST</h5>
				</div>
				<div class="col-3">
					<h5>/api/books</h5>
				</div>
				<div class="col-6">
					<h5>{"title":"title1","author":"author1","price":1.0}</h5>
				</div>
			</div>
			<div class="row">
				<span class="border"></span>
				<div class="col-3">
					<h5>PUT</h5>
				</div>
				<div class="col-3">
					<h5>/api/books/1</h5>
				</div>
				<div class="col-6"></div>
			</div>

			<div class="row">
				<span class="border"></span>
				<div class="col-3">
					<h5>DELETE</h5>
				</div>
				<div class="col-3">
					<h5>/api/books/1</h5>
				</div>
				<div class="col-6"></div>
			</div>

		</div>

		<br>

		<h5>When posting data, do not specify the "id" property because
			it is autoincremental.</h5>


		<!-- Option 1: Bootstrap Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
			crossorigin="anonymous"></script>

	</div>

</body>

</html>
