<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
	
		<c:forEach items="${products}" var="product">
			<div class="productContainer">
				
				<c:url var="productImage" value="/img/${product.imageName}"/>
				<c:url var="productId" value="/shoppingCart/detail/${product.id}"/>
				<a href="${productId}"><img class="productImage" src="${productImage}"/></a>
				
					<div class="productDetail">
					<p class="productName" ><c:out value="${product.name}"/></p>
					<span class="productPrice"><c:out value="${product.price}"/></span>
					</div>
			</div>
		</c:forEach>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />