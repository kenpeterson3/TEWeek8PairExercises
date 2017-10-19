<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
	<h1><strong>Solar System Geek Forum</strong></h1>
	<c:url var="postInputPage" value="/submitPostInput"/>
	<div class="input-post"><a href="${postInputPage} ">Post a Message</a></div>
	
	<table>
		<tr>
			<th></th>
			<th><strong>Name</strong></th>
			<th><strong>Price</strong><th>
			<th><strong>Qty.</strong></th>
			<th><strong>Total</strong></th>
		</tr>
		
		<c:forEach items="${products}" var="product">
			<tr class="productContainer">
				
				<th>
					<c:url var="productImage" value="/img/${product.imageName}"/>
				</th>
				
				
				
				<tr class="productDetail">
					<c:out value="${product.name}"/>
				</tr>
				<tr>
					<c:out value="${product.price}"/>
				</tr>
				<tr>
					<c:out value="${number}"/>
				</tr>
			
		</c:forEach>
	</table>
</section>

<%@include file="common/footer.jsp" %>