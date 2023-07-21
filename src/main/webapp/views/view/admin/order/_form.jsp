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
	<form:form class="form-group" action="/order/index" modelAttribute="item">
			<form:input class="form-control my-2" path="id" placeholder="orders Id?"/>
			<form:input class="form-control my-2" path="address" placeholder="address orders?"/>
			<form:input class="form-control my-2" path="createDate" placeholder="address orders?"/>
			<form:input class="form-control my-2" path="orderStatus" placeholder="createdate orders?"/>
			<hr>
			<button class="btn btn-secondary" formaction="/order/create">Create</button>
			<button class="btn btn-secondary" formaction="/order/update">Update</button>
			<a class="btn btn-secondary" href="/order/delete/${item.id}">Delete</a>
			<a class="btn btn-secondary" href="/admin/order/index">Reset</a>
		</form:form>
	</div>
</div>

</body>
</html>