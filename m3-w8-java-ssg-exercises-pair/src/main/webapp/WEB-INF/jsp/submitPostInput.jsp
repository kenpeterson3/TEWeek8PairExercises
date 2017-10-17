<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageHeader" value="New  Geek Post"/>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
			<form action="submitPostInput" method="POST">
				<div class="formGroup">
					<label for="username">Username</label>
					<input type="text" name="username" id="username" />
				</div>
				<div class="formGroup">
					<label for="subject">Subject </label>
					<input type="text" name="subject" id="subject" />
				</div>	
				<div class="formGroup">		
					<label for="message">Message </label>
					<input type="text" name="message" id="message" />
				</div>	
				<div class="formGroup">
					<label></label>
					<input type="submit" value="Speak Your Mind" />
				</div>		
			</form>
		

<%@include file="common/footer.jsp" %>