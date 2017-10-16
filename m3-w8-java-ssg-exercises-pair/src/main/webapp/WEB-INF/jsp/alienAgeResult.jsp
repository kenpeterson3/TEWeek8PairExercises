<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<c:url var="planetImageUrl" value="/img/${calculator.planet}.jpg"/>
	<img src="${planetImageUrl }" />
	<h2> If you are <c:out value="${calculator.age }"/> years old on planet Earth, then you are <c:out value="${calculator.alienAge }"/> <c:out value="${calculator.planet }"/> years old.</h2>

</section>

<%@include file="common/footer.jsp" %>