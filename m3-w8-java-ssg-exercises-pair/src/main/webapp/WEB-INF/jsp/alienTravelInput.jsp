<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:set var="pageHeader" value="Alien Travel Calculator"/>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:url var="formAction" value="/alienTravelResult" />

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
		<label for="transport">Choose Transport:</label>
		<select name="transport" id="transport">
			<option value="walk">Walk</option>
			<option value="car">Car</option>
			<option value="bullet train">Bullet Train</option>
			<option value="boeing 747">Boeing 747</option>
			<option value="concorde">Concorde</option>
		
		</select>
	</div>
	
	<div class="formInputGroup">
		<label for="age">Enter Age:</label>
		<input type= "text" name="age" id="age"/>
	</div>
	<div class="formInputGroup">
		<label></label>
		<input class="formSubmitButton" type="submit" value="Calculate Travel" id="btn" />
	</div>
</form>
 
<%@include file="common/footer.jsp" %>