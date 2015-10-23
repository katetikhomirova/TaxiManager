<%@ include file="includes/header.jsp"%>

<link
	href="${pageContext.request.contextPath}/resources/css/homePage.css"
	rel="stylesheet">
</head>
<body>
	<div id="wrap">
		<%@ include file="includes/menu.jsp"%>
		<div class="container">
			<c:if test="${pageContext.request.userPrincipal.name == null}">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<img id="homeTaxiPic"
							src="${pageContext.request.contextPath}/resources/images/taxi.png">
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4">

						<div class="well">
							<%@ include file="includes/loginForm.jsp"%>
							<p>or</p>
							<a href="${pageContext.request.contextPath}/signUp"
								class="btn btn-info btn-lg btn-block">Sign Up</a>
						</div>
			</c:if>
		</div>
		<div class="col-md-4"></div>
	</div>
	</div>
	<div id="push"></div>
	</div>
	<%@ include file="includes/footer.html"%>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.validate.js"></script>
</body>
</html>
