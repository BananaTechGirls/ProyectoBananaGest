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
						aria-label="crearProyecto"> <span class="iconText">Crear
							Proyecto</span>
					</a>
				</div>
			</div>
			<div class="container-fluid">
				<ul class="row">
					<c:forEach var="pro" items="${listaProyectosAMostrar}" varStatus="counter">
						<li class="box1 linkBox col-xs-12 col-sm-7" id="${idProyecto}">
							<a href="project.html" aria-label="proyecto1">
								<ul class="infoPro col-xs-12 col-sm-7">
									<li class="col-xs-12"><p>
											Id del Proyecto: <span>${pro.idProyecto}</span>
										</p></li>
									<li class="col-xs-12"><p>
											Titulo: <span>${pro.titulo}</span>
										</p></li>
									<li class="col-xs-12"><p>
											Fecha de Inicio: <span>${pro.fechaDeInicio}</span>
										</p></li>
									<li class="col-xs-12"><p>
											Asignado a: <span>${pro.responsable}</span>
										</p></li>
									<li class="col-xs-12"><p>
											Progreso: <span>${pro.progreso}</span>
										</p></li>
									<li class="col-xs-12"><p>
											Status: <span>${pro.status}</span>
										</p>
									</li>
								</ul>
								<div class="col-xs-12 col-sm-5">
									<div class="buttons">
										<a href="#"
										class="btn_del_Project btn glyphicon glyphicon-trash"
										data_Id="${idProyectos}" aria-label="botonBorrarP"> <span
										class="iconText"> Borrar</span>
										</a>
									</div>
									<div class="buttons">
										<a href="project.html" class="btn glyphicon glyphicon-eye-open"
										aria-label="Tareas"> <span class="iconText"> Ver</span>
										</a>
									</div>
									<div class="buttons">
										<a href="taskList.html" class="btn glyphicon glyphicon-tasks"
										aria-label="Tareas"> <span class="iconText"> Ver
											Tareas</span>
										</a>
									</div>
								</div>
							</a>
						</li>
					</c:forEach>
				</ul>
			</div>
		</section>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
<script src="./js/home.js"></script>
<script src="./js/searchP.js "></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>