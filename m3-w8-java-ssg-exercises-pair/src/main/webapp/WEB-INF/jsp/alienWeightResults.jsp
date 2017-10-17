<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<c:url var="planetImageUrl" value="/img/${calculator.planet}.jpg"/>
	<img src="${planetImageUrl }" />
	<h2> If you are <c:out value="${calculator.weightToConvert }"/> pounds on planet Earth, then you are <c:out value="${calculator.convertedWeightAtPlanet}"/> pounds on <c:out value="${calculator.planet }"/>.</h2>



<%@include file="common/footer.jsp" %>