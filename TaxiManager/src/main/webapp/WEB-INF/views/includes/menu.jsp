<nav class="navbar navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Taxi manager</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<li class="active"><a href="#">Profile</a></li>
					<li><a href="#about">Manage</a></li>
					<sec:authorize access="hasRole('ROLE_ADMIN')">
						<li><a href="#contact">Admin</a></li>
					</sec:authorize>
				</c:if>
			</ul>
			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<p class="navbar-text navbar-right">
					Welcome, ${pageContext.request.userPrincipal.name} ! <a
						href="${pageContext.request.contextPath}/j_spring_security_logout">logout</a>
				</p>
			</c:if>
		</div>
	</div>
</nav>