<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="container">
	<div class="row">
		<table class="table mt-5" border="1" style="width:100%">
		<tr>
			<th>id</th>
			<th>Username</th>
			<th>Image</th>
			<th>createdate</th>
			<th>price</th>
			<th>descriptions</th>
		
			
		
		</tr>
		<c:forEach var="item" items="${items}">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.image}</td>
				<td>${item.createdate}</td> 
				<td>${item.price}</td>
				<td>${item.descriptions}</td>
		
			
				<td>
					<a href="/product/edit/${item.id}">Edit</a>
				</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</div>
