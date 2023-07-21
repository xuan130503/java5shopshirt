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
		<form:form class="form-group" action="/product/index" modelAttribute="item">
		<form:input class="form-control my-2" path="id" placeholder="id"/>
		<form:input class="form-control my-2" path="name" placeholder="Username?"/>
		<form:input class="form-control my-2" path="image" placeholder="image?"/>
		<form:input class="form-control my-2" path="price" placeholder="Fullname?"/>
		<form:input class="form-control my-2" path="descriptions" placeholder="descriptions?"/>

		<hr>
		
		<button class="btn btn-secondary" formaction="/product/create">Create</button>
			<button class="btn btn-secondary" formaction="/product/update">Update</button>
			<a class="btn btn-secondary" href="/product/delete/${item.id}">Delete</a>
			<a class="btn btn-secondary" href="/admin/product/index">Reset</a>
</form:form>
	</div>
</div>

</body>
</html>