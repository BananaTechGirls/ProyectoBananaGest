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
				<li><a href="home.html">Home</a></li>
				<li class="active">Proyecto</li>
			</ol>
			<div class="pageTitle ">
				<h1>
					Proyecto <span>${userId}</span>
				</h1>
			</div>
			<article class="row">
				<div class="buttons pull-xs-right">
					<a href="ListaProyectos" class="btn"><span
						class="glyphicon glyphicon-trash"></span> Borrar Proyecto</a> <a
						href="editP.html" class="btn">Editar Proyecto</a> <a
						href="createT.html" class="btn">Crear Tarea</a>
				</div>
			</article>
			<article class="col-xs-12 col-sm-6">
				<div class="col-xs-12">
					<ul class="pInfo">
						<li>Id del Proyecto: <span>${Proyecto.userId}</span></li>
						<li>Asignado a: <span>${Proyecto.responsable}</span></li>
						<li>Fecha de inicio: <span>${Proyecto.fechaDeInicio}</span></li>
						<li>Fecha de Estimada de fin: <span>${Proyecto.fechaEstimadaFin}</span></li>
						<li>Fecha de fecha de fin: <span>${Proyecto.fechaDeFin}</span></li>
						<li>Status: <span>${Proyecto.status}</span></li>
						<li>Progreso: <span>${Proyecto.progreso}</span></li>

					</ul>
				</div>
				<div class="panel panel-default col-xs-8 col-sm-6">
					<div class="panel-heading">
						<h3 class="panel-title">Tareas</h3>
					</div>
					<div class="panel-body">
						<ul class="taskList">
							<li class="row" id="p1Task1">
								<div class="col-xs-6">
									<a href="task.html">Tarea 1</a>
								</div>
								<div class="col-xs-6">
									<button aria-label="deleteTask"
										class="btn_del_Task glyphicon glyphicon-trash"
										data_Id="p1Task1"></button>
								</div>
							</li>
							<li class="row" id="p1Task2">
								<div class="col-xs-6">
									<a href="task.html">Tarea 2</a>
								</div>
								<div class="col-xs-6">
									<button aria-label="deleteTask"
										class="btn_del_Task glyphicon glyphicon-trash"
										data_Id="p1Task2"></button>
								</div>
							<li class="row" id="p1Task3">
								<div class="col-xs-6">
									<a href="task.html">Tarea 3</a>
								</div>
								<div class="col-xs-6">
									<button aria-label="deleteTask"
										class="btn_del_Task glyphicon glyphicon-trash"
										data_Id="p1Task3"></button>
								</div>
							<li class="row" id="p1Task4">
								<div class="col-xs-6">
									<a href="task.html">Tarea 4</a>
								</div>
								<div class="col-xs-6">
									<button aria-label="deleteTask"
										class="btn_del_Task glyphicon glyphicon-trash"
										data_Id="p1Task4"></button>
								</div>
							<li class="row" id="p1Task5">
								<div class="col-xs-6">
									<a href="task.html">Tarea 5</a>
								</div>
								<div class="col-xs-6">
									<button aria-label="deleteTask"
										class="btn_del_Task glyphicon glyphicon-trash"
										data_Id="p1Task5"></button>
								</div>
							<li class="row" id="p1Task6">
								<div class="col-xs-6">
									<a href="task.html">Tarea 6</a>
								</div>
								<div class="col-xs-6">
									<button aria-label="deleteTask"
										class="btn_del_Task glyphicon glyphicon-trash"
										data_Id="p1Task6"></button>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</article>
			<article class="col-xs-12 col-sm-8">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Descripción</h3>
					</div>
					<div class="panel-body">
						<div class="box1 textBox">
							<p><span>${Proyecto.descripcion}</span></p>
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Notas y comentarios</h3>
					</div>
					<div class="panel-body">
						<div class="box1 textBox">
							<p><span>${Proyecto.notas}</span></p>
						</div>
					</div>
				</div>
			</article>
		</section>
		
		<jsp:include page="footer.jsp"></jsp:include>
		
	</div>
</body>
<script src="./js/home.js"></script>
<script src="./js/searchP.js "></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>	
		
		
		