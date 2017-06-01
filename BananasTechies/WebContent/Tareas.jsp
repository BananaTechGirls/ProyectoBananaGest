<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
<body>
	<div class="container">
	
		<jsp:include page="header.jsp"></jsp:include>
		
		<section class="container-fluid">
			<ol class="breadcrumb">
				<li><a href="home.html">Home</a></li>
				<li class="active">Lista de Tareas</li>
			</ol>
			<h1> Listado de Tareas de <span>${userId}</span></h1>
			<div class="row">
				<form action="resultsT.html" method="get" id="searchTForm" novalidate>
					<div class="row">
						<div class="col-xs-12 col-sm-4 col-sm-offset-8 searchBox">
							<div class="input-group">
								<span class="input-group-btn buttons">
									<button id="searchTask" class="btn btn-default" aria-label="searchBtn"><span class="glyphicon glyphicon-search"></span></button>
								</span>
								<input type="search" class="form-control" placeholder="Buscar Tarea..." id="searchBoxT" aria-label="searchBox" required>
							</div>
							<div class="mensajes_error_searchBoxT">
	                            <div id="searchBoxT[valueMissing]" class="errorP">El campo Buscar Tarea debe tener valor.</div>
	                        </div>
							<!-- /input-group -->
						</div>
					</div>
					
				</form>
				<div class="buttons">
					<a href="createT.html" class="btn glyphicon glyphicon-plus"><span class="iconText"> Crear Tarea</span></a>
				</div>
			</div>	
			<div class="container-fluid">	
				<ul class="row">
				<c:forEach var="tarea" items="${listaTareasAMostrar}" varStatus="counter">
					<li class="box1 linkBox col-xs-12 col-sm-7" id="${idTarea}">
						<a href="task.html">
							<ul class="infoPro col-xs-12 col-sm-7">
								<li class="col-xs-12">
									<p>Titulo: <span>${tarea.titulo}</span>
										
									</p>
								</li>
								<li class="col-xs-12">
									<p>Proyecto: 
										Proyecto x1<span>${tarea.idTarea}</span>
									</p>
								</li>
								<li class="col-xs-12">
									<p>Fecha de Inicio: 
										00/00/00 <span>${tarea.fechaDeInicioT}</span>
									</p>
								</li>
								<li class="col-xs-12">
									<p>Asignada a: 
										 ${tarea.userId}
									</p>
								</li>
								<li class="col-xs-12">
									<p>Status: 
										<span>${tarea.statusT}</span>
									</p>
								</li>
								<li class="col-xs-12 buttons">
									<a href="task.html" class="btn glyphicon glyphicon-eye-open" aria-label="viewTaskBtn" data_Id="task1Id"></a>
									<a href="#" class="btn btn_del_Task glyphicon glyphicon-trash" aria-label="deleteTaskBtn" data_Id="task1Id"></a>
								</li>
							</ul>
							<div class="panel panel-default col-xs-12 col-sm-5">
								<div class="panel-heading">
									<h3 class="panel-title">Descripcion de la Tarea</h3>
								</div>
								<div class="panel-body">
									<div class="taskDescription col-sm-12">
										<p>
											Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias iusto ratione omnis est, architecto sapiente libero sed, porro optio. Officiis maxime fugiat sequi tempore, dolores, laborum assumenda reiciendis nesciunt eos.
										</p>
									</div>
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
<script src="./js/searchT.js "></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</html>