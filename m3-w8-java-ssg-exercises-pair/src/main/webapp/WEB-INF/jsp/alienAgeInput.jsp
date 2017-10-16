<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:url var="formAction" value="/alienAgeResult" />
<form method= "GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="planet">Choose Planet:</label>
		<select name="planet" id="planet">
			<option value="mercury">Mercury</option>
			<option value="venus">Venus</option>
			<option value="earth">Earth</option>
			<option value="mars">Mars</option>
			<option value="jupiter">Jupiter</option>
			<option value="Saturn">Saturn</option>
			<option value="Uranus">Uranus</option>
			<option value="Neptune">Naptune</option>
			<option value="Pluto">Pluto</option>
		</select>
	</div>
	
	<div class="formInputGroup">
		<label for="age">Enter Age:</label>
		<input type= "text" name="age" id="age"/>
	</div>
	<input class="formSubmitButton" type="submit" value="Calculate Age" />
</form>
 
<%@include file="common/footer.jsp" %>