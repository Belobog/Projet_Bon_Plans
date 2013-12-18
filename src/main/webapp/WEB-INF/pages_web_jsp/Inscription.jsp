<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="" />
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png" />

<!--a mettre en haut  -->


<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">

<title>Inscription</title>

</head>

<body>

	<header>
		<jsp:include page="Header.jsp"></jsp:include>
	</header>

	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">
			<h1>Hello, world!</h1>
			<p>This is a template for a simple marketing or informational
				website. It includes a large callout called a jumbotron and three
				supporting pieces of content. Use it as a starting point to create
				something more unique.</p>
			<p>
				<a class="btn btn-primary btn-lg" role="button">Learn more
					&raquo;</a>
			</p>
		</div>
	</div>

	<!-- 
	<form th:action="@{/Inscription}" method="post">


		<input type="password" th:value="${utilisateur.pseudo}" name="pseudo" />
		<div id="errors" th:text="${error_utilisateur_pseudo}" />
		<input type="password" th:value="${utilisateur.password}"
			name="password" />
		<div id="errors" th:text="${error_utilisateur_password}" />

		<input type="text" th:value="${utilisateur.nom}" name="nom" />
		<div id="errors" th:text="${error_utilisateur_nom}" />
		<input type="text" th:value="${utilisateur.prenom}" name="prenom" />
		<div id="errors" th:text="${error_utilisateur_prenom}" />

		<input type="text" th:value="${utilisateur.date_de_naissance}"
			name="date_de_naissance" />
		<div id="errors" th:text="${error_utilisateur_date_de_naissance}" />

		<button type="submit">Go</button>
	</form>
	 -->
	<form th:action="@{/Inscription}" method="post">
		<div class="container">
			<!-- Example row of columns -->
			<div class="row">
				<div class="col-md-4">
					<h2>Pseudo</h2>

					<c:set var="pseudo_test" scope="session"
						value="${flag_utilisateur_pseudo}" />


					<c:choose>
						<c:when test="${pseudo_test==1}">

							<div class="form-group has-error">

								<input type="text" value="${pseudo}" class="form-control" name="pseudo"
									th:value="${utilisateur.pseudo}" /> <label
									class="control-label" for="inputError">${error_utilisateur_pseudo}</label>
							</div>
						</c:when>
						<c:otherwise>
							<div class="form-group">
								<input name="pseudo" type="text"
									th:value="${utilisateur.pseudo}" class="form-control"
									placeholder="Pseudo" value="${pseudo}" />
							</div>
						</c:otherwise>
					</c:choose>


				</div>
				<div class="col-md-4">
					<h2>Heading</h2>
					<div class="form-group has-error">
						<label class="control-label" for="inputError">Input with
							error</label> <input type="text" class="form-control" id="inputError" />
					</div>



				</div>


				<div class="col-md-4">
					<h2>Heading</h2>
					<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis
						in, egestas eget quam. Vestibulum id ligula porta felis euismod
						semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
						condimentum nibh, ut fermentum massa justo sit amet risus.</p>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
			</div>

			<!-- Example row of columns -->
			<div class="row">
				<div class="col-md-4">
					<h2>Heading</h2>
					<p>Donec id elit non mi porta gravida at eget metus. Fusce
						dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
						ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
						magna mollis euismod. Donec sed odio dui.</p>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
				<div class="col-md-4">
					<h2>Heading</h2>
					<p>Donec id elit non mi porta gravida at eget metus. Fusce
						dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
						ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
						magna mollis euismod. Donec sed odio dui.</p>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
				<div class="col-md-4">
					<h2>Heading</h2>
					<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis
						in, egestas eget quam. Vestibulum id ligula porta felis euismod
						semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
						condimentum nibh, ut fermentum massa justo sit amet risus.</p>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
			</div>

			<hr />

			<footer>
				<p>&copy; Company 2013</p>
			</footer>
		</div>
		<button type="submit">Go</button>
	</form>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
