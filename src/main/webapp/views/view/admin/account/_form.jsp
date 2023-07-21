<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
<form:form class="form-group" action="/account/index" modelAttribute="item">
		<%--  <form:input class="form-control my-2" path="id" placeholder="id?"/>
		 <form:input class="form-control my-2" path="username" placeholder="Username?"/>
		<form:input class="form-control my-2" path="password" placeholder="Password?"/>
		<form:input class="form-control my-2" path="fullname" placeholder="Fullname?"/>
		<form:input class="form-control my-2" path="email" placeholder="Email?"/>
		<form:input class="form-control my-2" path="photo" placeholder="photo"/>  --%>
				<div class="form-floating mt-3 mb-3">
					<form:input class="form-control my-2" path="id"
						placeholder="Username?" />
					<label for="pwd">ID</label>
					<form:errors path="id" class="text-danger" />
				</div>
				<div class="form-floating mt-3 mb-3">
					<form:input class="form-control my-2" path="username"
						placeholder="Username?" />
					<label for="pwd">username</label>

					<form:errors path="username" class="text-danger" />
				</div>
				<div class="form-floating mt-3 mb-3">
					<form:input class="form-control my-2" path="password"
						placeholder="Password?" />
					<label for="pwd">password</label>
					<form:errors path="username" class="text-danger" />
				</div>

				<div class="form-floating mt-3 mb-3">
					<form:input class="form-control my-2" path="fullname"
						placeholder="Fullname?" />
					<label for="pwd">fullname</label>
					<form:errors path="username" class="text-danger" />
				</div>
				<div class="form-floating mt-3 mb-3">
					<form:input class="form-control my-2" path="email"
						placeholder="Email?" />
					<label for="pwd">email</label>
					<form:errors path="username" class="text-danger" />
				</div>
				<div class="form-floating mt-3 mb-3">
					<form:input class="form-control my-2" path="photo"
						placeholder="photo" />
					<label for="pwd">photo</label>
					<form:errors path="photo" class="text-danger" />
				</div>
				<hr>
				<button class="btn btn-secondary" formaction="/account/create">Create</button>
		<button class="btn btn-secondary" formaction="/account/update">Update</button>
		<a class="btn btn-secondary" href="/account/delete/${item.username}">Delete</a>
		<a class="btn btn-secondary" href="/admin/account/index">Reset</a>
</form:form>
	</div>
</div>

</body>
</html>