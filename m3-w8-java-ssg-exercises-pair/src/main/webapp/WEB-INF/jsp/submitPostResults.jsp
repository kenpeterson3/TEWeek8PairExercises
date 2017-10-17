<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
	<h1><strong>Solar System Geek Forum</strong></h1>
	<c:url var="postInputPage" value="/submitPostInput"/>
	<div class="input-post"><a href="${postInputPage} ">Post a Message</a></div>
	

	<div class="post-container">
		<c:forEach items="${allPosts }" var="post">
			<div>
				<br/>
				<strong><c:out value="${post.subject}"/></strong><br/>
				<c:out value="by ${post.username}"/>
				<c:out value="at ${post.datePosted}"/>
				<br/></br>
				<c:out value="${post.message}"/>
				<br/><br/>
			</div>
		</c:forEach>
	</div>
</section>

<%@include file="common/footer.jsp" %>