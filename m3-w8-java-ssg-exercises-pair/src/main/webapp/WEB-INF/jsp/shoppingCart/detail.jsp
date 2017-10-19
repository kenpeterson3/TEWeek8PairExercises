<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">

		<div class="productContainer">
				
				<c:url var="productImage" value="/img/${product.imageName}"/>
				
					<img class="productImageDetail productImage" src="${productImage}"/>
				
					<div class="productDetail">
						<p class="productName" ><c:out value="${product.name}"/></p>
						<span class="productPrice"><c:out value="${product.price}"/></span>
						<p class="productDescription" ><c:out value="${product.description}"/></p>
					</div>
					
					<c:url var="addressInputUrl" value="/shoppingCart/view" />
					<form method="POST" action="${addressInputUrl}">
							<div class="formInputGroup">
								<label for="Quantity">Quantity: </label> 
								<input type="number" name="quantity" id="quantity" />
							</div>
							<div class="formInputGroup">
								<label></label>
								<input class="formSubmitButton" type="submit" value="Next >>>" />
							</div>
							
					</form>
		</div>
</section>
	
<c:import url="/WEB-INF/jsp/common/footer.jsp" />