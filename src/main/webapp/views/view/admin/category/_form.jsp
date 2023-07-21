<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="container">
	<div class="row">
		<form:form class="form-group" action="/category/index" modelAttribute="item">
			<form:input class="form-control my-2" path="id" placeholder="Category Id?"/>
			<form:input class="form-control my-2" path="name" placeholder="Category Name?"/>
			<hr>
			<button class="btn btn-secondary" formaction="/category/create">Create</button>
			<button class="btn btn-secondary" formaction="/category/update">Update</button>
			<a class="btn btn-secondary" href="/category/delete/${item.id}">Delete</a>
			<a class="btn btn-secondary" href="/admin/category/index">Reset</a>
		</form:form>
	</div>
</div>
