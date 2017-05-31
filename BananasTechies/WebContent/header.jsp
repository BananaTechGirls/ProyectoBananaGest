<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<jsp:include page="head.jsp"></jsp:include>

<header>
	<nav class="navbar navbar-default menu">
		<div class="row">
			<a class="navbar-brand" href="home.html">
				<h1 class="logo">Banana GEST</h1>
			</a>
		</div>
		<div class="row">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle burgerMenu"
					data-toggle="collapse" data-target="#myNavbar"
					aria-label="burgerMenu">
					<span class="icon-bar burgerIcon"></span> <span
						class="icon-bar burgerIcon"></span> <span
						class="icon-bar burgerIcon"></span>
				</button>

			</div>
			<div class="collapse navbar-collapse submenu" id="myNavbar">
				<ul class="nav navbar-nav navList navbar-right">
					<li class="projectListActive"><a class="navItems"
						href="home.html">Proyectos</a></li>
					<li><a class="navItems" href="taskList.html">Tareas</a></li>
					<li id="profileBtn"><a
						class="navItems glyphicon glyphicon-user" href="profile.html">
							<span class="profile">Perfil</span>
					</a></li>
				</ul>
			</div>
		</div>
	</nav>
</header>

</html>