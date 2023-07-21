<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="container">
	<div class="row">
		<table class="table mt-5" border="1" style="width:100%">
		<tr>
		<th>id</th>
			<th>Username</th>
			<th>Password</th>
			<th>Fullname</th>
			<th>Email</th>
			<th>photo</th>
			<th></th>
		</tr>
		<c:forEach var="item" items="${items}">
			<tr>
			<td>${item.id}</td>
				<td>${item.username}</td>
				<td>${item.password}</td>
				<td>${item.fullname}</td>
				<td>${item.email}</td>
				<td>${item.photo}</td>
				<td>
					<a href="/account/edit/${item.id}">Edit</a>
				</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</div>
