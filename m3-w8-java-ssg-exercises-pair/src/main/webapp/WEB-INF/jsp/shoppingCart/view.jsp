<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
	<table>
		<tr>
			<th>&nbsp;</th>
			<th><strong>Name</strong></th>
			<th><strong>Price</strong><th>
			<th><strong>Qty.</strong></th>
			<th><strong>Total</strong></th>
		</tr>
		
		<c:forEach items="${productList}" var="entry">
		<c:set var="product" value="${entry.key}"></c:set>
		<c:set var="quantity" value="${entry.value}"></c:set>
			<tr>
				
				<c:url var="planetImageUrl" value="/img/${entry.key.imageName}"/>
				<td><img class="productImageDetail" src="${planetImageUrl}"/></td>
				<td><c:out value="${entry.key.name}"></c:out></td>
				<td><c:out value="${entry.key.price}"></c:out></td>
				<td><c:out value="${quantity}"></c:out></td>
				<td><c:out value="${product.price * quantity}"></c:out></td>
			
			</tr>
				
			
			
		</c:forEach>
	</table>
	<p><strong >Total Price: </strong> ${cost}</p>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />