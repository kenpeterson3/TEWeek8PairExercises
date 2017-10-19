<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
	<h1><strong>Solar System Geek Forum</strong></h1>
	<c:url var="postInputPage" value="/submitPostInput"/>
	<div class="input-post"><a href="${postInputPage} ">Post a Message</a></div>
	
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
			<tr class="productContainer">
				
				<td><c:out value="${entry.key.imageName}"></c:out></td>
				<td><c:out value="${entry.key.name}"></c:out></td>
				<td><c:out value="${entry.key.price}"></c:out></td>
				<td><c:out value="${quantity}"></c:out></td>
				<td><c:out value="${product.price * quantity}"></c:out></td>
			
			</tr>
				
			
			
		</c:forEach>
	</table>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />