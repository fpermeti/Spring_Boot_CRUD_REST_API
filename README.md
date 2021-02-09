# Spring_Boot_CRUD_REST_API
 
Heroku link: https://spring-boot-crud-rest-api.herokuapp.com/

This is a simple CRUD REST API for a bookstore

METHOD      	ROUTE              	EXAMPLE

GET	         /api/books
GET	         /api/books/1
POST	        /api/books	         {"title":"title1","author":"author1","price":1.0}
PUT	         /api/books/1
DELETE	      /api/books/1

When posting data, do not specify the "id" property because it is autoincremental.
