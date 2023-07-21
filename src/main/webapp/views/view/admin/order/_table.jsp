<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="container">
	<div class="row">
		<table class="table mt-5" border="1" style="width:100%">
		<tr>
			<th>id</th>
			<th>adress</th>
			<th>createdate</th>
			
			<th></th>
		</tr>
		<c:forEach var="item" items="${items}">
			<tr>
				<td>${item.id}</td>
				<td>${item.address}</td>
				<td>${item.createDate}</td>
				<td>${item.orderStatus}</td>

				<td>
					<a href="/order/edit/${item.id}">Edit</a>
				</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</div>
