<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<c:url var="planetImageUrl" value="/img/${calculator.planet}.jpg"/>
	<img src="${planetImageUrl }" />
	<h2> Traveling by <c:out value="${calculator.transport }"/> you will reach <c:out value="${calculator.planet }"/> in <c:out value="${calculator.timeTravelTime }"/>. you will be <c:out value="${calculator.ageAfterTravel }"/> years old.</h2>



<%@include file="common/footer.jsp" %>