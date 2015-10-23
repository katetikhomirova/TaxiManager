<%@ include file="includes/header.jsp"%>
<link
	href="${pageContext.request.contextPath}/resources/css/homePage.css"
	rel="stylesheet">
</head>
<body>
	<div id="wrap">
		<%@ include file="includes/menu.jsp"%>
		<div class="container">
			<div class="row content">
				<div class="col-md-4 col-md-offset-4 ">
					<div class="well">
						${pageContext.request.userPrincipal.name}

						<sec:authorize access="hasRole('ROLE_ADMIN')">
							You are an admin!
						</sec:authorize>
					</div>
				</div>
			</div>
		</div>
		<div id="push"></div>
	</div>
	<%@ include file="includes/footer.html"%>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.validate.js"></script>
</body>
</html>