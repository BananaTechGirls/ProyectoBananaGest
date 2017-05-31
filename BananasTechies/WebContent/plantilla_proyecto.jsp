<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<li class="box1 linkBox col-xs-12 col-sm-7" id="${idProyectos}">
	<a href="project.html" aria-label="proyecto1">
		<ul class="infoPro col-xs-12 col-sm-7">
			<c:forEach var="pro" items="${listaProyectosAMostrar}"
				varStatus="counter">
				<li class="col-xs-12"><p>
						Id del Proyecto: <span>${pro.idProyectos}</span>
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
					</p></li>
			</c:forEach>
		</ul>
		<div class="col-xs-12 col-sm-5">
			<div class="buttons">
				<a href="#" class="btn_del_Project btn glyphicon glyphicon-trash"
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
					aria-label="Tareas"> <span class="iconText"> Ver Tareas</span>
				</a>
			</div>
		</div>
	</a>
</li>
