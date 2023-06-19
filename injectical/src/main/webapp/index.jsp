<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="favicon.ico">
<title>Departamento de Recursos Humanos - My Company</title>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/justified-nav.css" rel="stylesheet">

</head>

<body>

	<div class="container">

		<!-- Example row of columns -->
		<div class="row">

			<c:forEach items="${allEventos}" var="evento" varStatus="status">
				<div class="col-lg-4">
					<h3>Evento: [${evento.id}]</h3>
					<p class="text-danger">${evento.name}</p>
					<p>
					    <a class="btn btn-primary"
							href="vacante?action=ver&id=${vacante.id}" role="button">Ver
							Detalles&raquo;</a>
					</p>
				</div>
			</c:forEach>

			<!--
        <div class="col-lg-4">
          <h2>Oferta 2</h2>
          <p class="text-danger">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.</p>
          <p class="text-justify">Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
        </div>
        -->
		</div>

		<!-- Site footer -->
		<footer class="footer">
			<p>&copy; 2016 My Company, Inc.</p>
		</footer>

	</div>
	<!-- /container -->

</body>
</html>