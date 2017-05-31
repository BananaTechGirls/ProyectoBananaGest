<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<jsp:include page="head.jsp"></jsp:include>
<body>
	<div class="container" id="containerId">
		<jsp:include page="header.jsp"></jsp:include>
		<section class="container-fluid">
			<ol class="breadcrumb">
				<li class="active">Home</li>
			</ol>
			<h1>
				Listado de proyectos de <span>${userId}</span>
			</h1>
			<div class="row">
				<form action="resultsP.html" method="post" id="searchPForm"
					novalidate>
					<div class="row">
						<div class="col-xs-12 col-sm-4 col-sm-offset-8 searchBox">
							<div class="input-group ">
								<span class="input-group-btn buttons">
									<button id="searchProject" class="btn btn-default"
										name="botonBuscar" aria-label="searchBtn">
										<span class="glyphicon glyphicon-search"> </span>
									</button>
								</span>
								<!-- <label for="searchBoxP" aria-label="searchBox_p"></label> -->
								<input type="search" class="form-control"
									placeholder="Buscar Proyecto..." name="searchBox_p"
									id="searchBoxP" aria-label="searchBox" required>
							</div>
							<div class="mensajes_error_searchBoxP">
								<div id="searchBoxP[valueMissing]" class="errorP">El campo
									search Project debe tener valor.</div>
							</div>
							<!-- /input-group -->
						</div>
					</div>

				</form>
				<div class="buttons">
					<a href="createP.html" class="btn glyphicon glyphicon-plus"
						aria-label="crearProyecto">
						<span class="iconText">Crear Proyecto</span>
					</a>
				</div>
			</div>
			<div class="container-fluid">
				<ul class="row">
					<jsp:include page="plantilla_proyecto.jsp"></jsp:include>
				</ul>
			</div>
		</section>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>