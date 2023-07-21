<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="container">
	<div class="row">
		<table class="table mt-5" border="1" style="width:100%">
		<tr>
			<th>id</th>
			<th>price</th>
			<th>quantity</th>
			<th>product</th>
			<th>order</th>
			
			<th></th>
		</tr>
		<c:forEach var="item" items="${items}">
			<tr>
				<td>${item.id}</td>
				<td>${item.price}</td>
				<td>${item.quantity}</td>
			<%-- 	<td>${item.product}</td>
				<td>${item.order}</td> --%>
			
				<td>
					<a href="/orderdetail/edit/${item.id}">Edit</a>
				</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</div>
