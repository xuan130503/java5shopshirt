<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
		<form:form class="form-group" action="/orderdetail/index" modelAttribute="item">
		<form:input class="form-control my-2" path="Id" placeholder="Id?"/>
		<form:input class="form-control my-2" path="price" placeholder="price?"/>
		<form:input class="form-control my-2" path="quantity" placeholder="quantity?"/>
		<%-- <form:input class="form-control my-2" path="product" placeholder="product?"/>
		<form:input class="form-control my-2" path="order" placeholder="order?"/> --%>
		
		<hr>
		<button class="btn btn-secondary" formaction="/orderdetail/create">Create</button>
		<button class="btn btn-secondary" formaction="/orderdetail/update">Update</button>
		<a class="btn btn-secondary" href="/orderdetail/delete/${item.id}">Delete</a>
		<a class="btn btn-secondary" href="/admin/orderdetail/index">Reset</a>
</form:form>
	</div>
</div>

</body>
</html>