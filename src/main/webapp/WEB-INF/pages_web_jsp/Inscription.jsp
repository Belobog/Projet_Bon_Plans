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


<link href="<c:url value="/resources/css/calendrier.css" />"
	rel="stylesheet">

<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">

<title>Inscription</title>

</head>

<body>

	<header>
		<jsp:include page="Header.jsp"></jsp:include>
	</header>

	
	<div class="jumbotron">
		<div class="container">
			<h1>Bienvenu!</h1>
			<p>Merci d'avoir choisi les bon plans.</p>
			
		</div>
	</div>

	<form onsubmit="return soumission()" th:action="@{/Inscription}" method="post">
		<div class="container">
			<!-- Example row of columns -->
			<div class="row">
				<div class="col-md-4">
					<div class="row">
						<h2>Pseudo</h2>

						<c:set var="pseudo_test" scope="session"
							value="${flag_utilisateur_pseudo}" />


						<c:choose>
							<c:when test="${pseudo_test==1}">

								<div class="form-group has-error">
									<label class="control-label" for="inputError">${error_utilisateur_pseudo}</label>
									<input required="required" type="text" value="${pseudo}" class="form-control"
										name="pseudo" th:value="${utilisateur.pseudo}" />
								</div>
							</c:when>
							<c:otherwise>
								<div class="form-group">
									<input required="required" name="pseudo" type="text"
										th:value="${utilisateur.pseudo}" class="form-control"
										placeholder="Pseudo" value="${pseudo}" />
								</div>
							</c:otherwise>
						</c:choose>
					</div>

					<div class="row">
						<h2>Courriel</h2>

						<c:set var="email_test" scope="session"
							value="${flag_utilisateur_email}" />


						<c:choose>
							<c:when test="${email_test==1}">

								<div class="form-group has-error">
									<label class="control-label" for="inputError">${error_utilisateur_email}</label>
									<input required="required" type="text" value="${email}" class="form-control"
										name="email" th:value="${utilisateur.email}" />
								</div>
							</c:when>
							<c:otherwise>
								<div class="form-group">
									<input required="required" name="email" type="text"
										th:value="${utilisateur.email}" class="form-control"
										placeholder="Adresse email pour valider le compte" value="${email}" />
								</div>
							</c:otherwise>
						</c:choose>
					</div>

				</div>

				<div class="col-md-4">
					<h2>Mot de passe</h2>

					<c:set var="password_test" scope="session"
						value="${flag_utilisateur_password}" />


					<c:choose>
						<c:when test="${password_test==1}">

							<div class="form-group has-error">
								<label class="control-label" for="inputError">${error_utilisateur_password}</label>
								<input required="required" type="password" value="${password}" class="form-control"
									name="password" th:value="${utilisateur.password}" />
							</div>
							<div class="form-group has-error">

								<input required="required" type="password" class="form-control"
									name="password_confirm" />
							</div>
						</c:when>
						<c:otherwise>
							<div class="form-group">
								<input required="required" name="password" type="password"
									th:value="${utilisateur.password}" class="form-control"
									placeholder="Mot de passe" value="${password}" />
							</div>
							<div class="form-group">
								<input required="required" name="password_confirm" type="password"
									class="form-control" placeholder="Confirmer mot de passe" />
							</div>
						</c:otherwise>
					</c:choose>


				</div>
			</div>



			
			<div class="row">
				<div class="col-md-4">
					<h2>Informations personnelles</h2>
					<div class="row">
						<div class="col-md-5">
							<c:set var="nom_test" scope="session"
								value="${flag_utilisateur_nom}" />


							<c:choose>
								<c:when test="${nom_test==1}">

									<div class="form-group has-error">
										<label class="control-label" for="inputError">${error_utilisateur_nom}</label>
										<input required="required" type="text" value="${nom}" class="form-control"
											name="nom" th:value="${utilisateur.nom}" />
									</div>
								</c:when>
								<c:otherwise>
									<div class="form-group">
										<input required="required" name="nom" type="text" th:value="${utilisateur.nom}"
											class="form-control" placeholder="Nom" value="${nom}" />
									</div>
								</c:otherwise>
							</c:choose>
						</div>

						<div class="col-md-5">
							<c:set var="prenom_test" scope="session"
								value="${flag_utilisateur_prenom}" />


							<c:choose>
								<c:when test="${prenom_test==1}">

									<div class="form-group has-error">
										<label class="control-label" for="inputError">${error_utilisateur_prenom}</label>
										<input required="required" type="text" value="${prenom}" class="form-control"
											name="prenom" th:value="${utilisateur.prenom}" />
									</div>
								</c:when>
								<c:otherwise>
									<div class="form-group">
										<input required="required" name="prenom" type="text"
											th:value="${utilisateur.prenom}" class="form-control"
											placeholder="Prenom" value="${prenom}" />
									</div>
								</c:otherwise>
							</c:choose>
						</div>
					</div>

					<div class="row">
						<div class="col-md-10">
						<table class="ds_box" cellpadding="0" cellspacing="0"
								id="ds_conclass" style="display: none;">
								<tr>
									<td id="ds_calclass"></td>
								</tr>
							</table>
							<c:set var="date_de_naissance_test" scope="session"
								value="${flag_utilisateur_date_de_naissance}" />


							<c:choose>
								<c:when test="${date_de_naissance_test==1}">

									<div class="form-group has-error">
										<label class="control-label" for="inputError">${error_utilisateur_date_de_naissance}</label>
										<input onclick="ds_sh(this);" required="required" type="text" value="${date_de_naissance}" class="form-control"
											name="date_de_naissance" th:value="${utilisateur.date_de_naissance}" />
									</div>
								</c:when>
								<c:otherwise>
									<div class="form-group">
										<input onclick="ds_sh(this);" required="required" name="date_de_naissance" type="text"
											th:value="${utilisateur.date_de_naissance}" class="form-control"
											placeholder="Date de naissance" value="${date_de_naissance}" />
									</div>
								</c:otherwise>
							</c:choose>
						</div>
						<!-- 
						<div class="col-md-10">
							<table class="ds_box" cellpadding="0" cellspacing="0"
								id="ds_conclass" style="display: none;">
								<tr>
									<td id="ds_calclass"></td>
								</tr>
							</table>

							<div class="form-group">
								<input   onclick="ds_sh(this);" name="date_de_naissance"
									type="text" th:value="${utilisateur.date_de_naissance}"
									class="form-control" placeholder="Date de naissance"
									value="${date_de_naissance}" />
							</div>
						</div>
						 -->
					</div>
					
					<div class="row">
						<div class="col-md-10">
							<button  type="submit" class="btn btn-success">INSCRIPTION</button>
						</div>
					</div>


				</div>


			</div>

			<hr />

			<footer>
				<p>&copy; Company 2013</p>
			</footer>
		</div>
		
	</form>
	
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/calendrier.js" />"></script>
	<script>
	function soumission(){
		var password = $('input[name=password]').val() ;
		var password_confirm = $('input[name=password_confirm]').val() ;
		
		if(password!=password_confirm){
			alert("Vous avez rentré deux mots de passe différents ...");
			return false;
		}
		else{
			return true;
		}
		
		return false;
	}
	</script>
	

</body>
</html>
