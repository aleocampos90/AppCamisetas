<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet"
	href="${urlPublic }/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div id="content" class="container">
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-5 col-lg-4">
				<div class="well no-padding">
					<form action="login" , "account" method="POST" id="login-form"
						class="smart-form client-form">
						<header> Iniciar sesión </header>
						<fieldset>
							<section> <label class="label">E-mail</label> <label
								class="input"> <i class="icon-append fa fa-user"></i> <input
								type="email" name="email" value="admin@email.com"> <b
								class="tooltip tooltip-top-right"><i
									class="fa fa-user txt-color-teal"></i> Por favor ingrese la
									dirección de correo electrónico/nombre de usuario</b>
							</label> </section>

							<section> <label class="label">Contraseña</label> <label
								class="input"> <i class="icon-append fa fa-lock"></i> <input
								type="password" name="password" value="Admin1!"> <b
								class="tooltip tooltip-top-right"><i
									class="fa fa-lock txt-color-teal"></i> Ingrese su contraseña</b>
							</label>
							<div class="note">
								<a href="@Url.Action("forgotpassword", "account")"><i
									class="fa fa-frown-o"></i> Olvido su contraseña?</a>
							</div>
							</section>

							<section> <label class="checkbox"> <input
								type="checkbox" name="rememberMe" value="true" checked="checked">
								<input type="hidden" name="rememberMe" value="false" /> <i></i>Mantener
								la sesion iniciada
							</label> </section>
						</fieldset>
						<footer>
						<button type="submit" class="btn btn-primary">Ingresar</button>
						</footer>
					</form>
				</div>

			</div>
		</div>
	</div>

</body>
</html>